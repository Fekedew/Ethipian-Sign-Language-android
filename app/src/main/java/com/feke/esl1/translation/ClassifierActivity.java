package com.feke.esl1.translation;

/*
 * Copyright 2019 The TensorFlow Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.util.TypedValue;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import com.feke.esl1.R;
import com.feke.esl1.translation.env.BorderedText;
import com.feke.esl1.translation.env.Logger;
import com.feke.esl1.translation.tflite.Classifier;
import com.feke.esl1.translation.tflite.Classifier.Device;
import com.feke.esl1.translation.tflite.Classifier.Model;

import java.io.IOException;
import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class ClassifierActivity extends CameraActivity implements OnImageAvailableListener {
    private static final Logger LOGGER = new Logger();
    private static final Size DESIRED_PREVIEW_SIZE = new Size(640, 480);
    private static final float TEXT_SIZE_DIP = 10;
    private Bitmap rgbFrameBitmap = null;
    private long lastProcessingTimeMs;
    private Integer sensorOrientation;
    private Classifier classifier;
    private BorderedText borderedText;
    private String labelPath;
    private String tflitePath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 2);
        }
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                startActivity(new Intent(ClassifierActivity.this, FileSelection.class));
            } else {
                tflitePath = extras.getString("TflitePath");
                labelPath = extras.getString("LabelPath");
            }
        } else {
            tflitePath = (String) savedInstanceState.getSerializable("TflitePath");
            labelPath = (String) savedInstanceState.getSerializable("LabelPath");
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.camera_connection_fragment;
    }

    @Override
    protected Size getDesiredPreviewFrameSize() {
        return DESIRED_PREVIEW_SIZE;
    }

    @Override
    public void onPreviewSizeChosen(final Size size, final int rotation) {
        final float textSizePx =
                TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP, TEXT_SIZE_DIP, getResources().getDisplayMetrics());
        borderedText = new BorderedText(textSizePx);
        borderedText.setTypeface(Typeface.MONOSPACE);

        recreateClassifier(getModel(), getDevice(), getNumThreads());
        if (classifier == null) {
            LOGGER.e("No classifier on preview!");
            return;
        }

        previewWidth = size.getWidth();
        previewHeight = size.getHeight();

        sensorOrientation = rotation - getScreenOrientation();
        LOGGER.i("Camera orientation relative to screen canvas: %d", sensorOrientation);

        LOGGER.i("Initializing at size %dx%d", previewWidth, previewHeight);
        rgbFrameBitmap = Bitmap.createBitmap(previewWidth, previewHeight, Config.ARGB_8888);
    }

    @Override
    protected void processImage() {
        rgbFrameBitmap.setPixels(getRgbBytes(), 0, previewWidth, 0, 0, previewWidth, previewHeight);
        final int imageSizeX = classifier.getImageSizeX();
        final int imageSizeY = classifier.getImageSizeY();
        final int cropSize = Math.min(previewWidth, previewHeight);

        runInBackground(
                new Runnable() {
                    @Override
                    public void run() {
                        if (classifier != null) {
                            final long startTime = SystemClock.uptimeMillis();
                            final List<Classifier.Recognition> results =
                                    classifier.recognizeImage(rgbFrameBitmap, sensorOrientation);
                            lastProcessingTimeMs = SystemClock.uptimeMillis() - startTime;
                            LOGGER.v("Detect: %s", results);

                            runOnUiThread(
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            showResultsInBottomSheet(results);
                                            showFrameInfo(previewWidth + "x" + previewHeight);
                                            showCropInfo(imageSizeX + "x" + imageSizeY);
                                            showCameraResolution(cropSize + "x" + cropSize);
                                            showRotationInfo(String.valueOf(sensorOrientation));
                                            showInference(lastProcessingTimeMs + "ms");
                                        }
                                    });
                        }
//                        readyForNextImage();
                        NextImageReadyThread next = new NextImageReadyThread();
                        next.start();
                    }
                });
    }

    @Override
    protected void onInferenceConfigurationChanged() {
        if (rgbFrameBitmap == null) {
            // Defer creation until we're getting camera frames.
            return;
        }
        final Device device = getDevice();
        final Model model = getModel();
        final int numThreads = getNumThreads();
        runInBackground(new Runnable() {
            @Override
            public void run() {
                ClassifierActivity.this.recreateClassifier(model, device, numThreads);
            }
        });
    }

    private void recreateClassifier(Model model, Device device, int numThreads) {
        if (classifier != null) {
            LOGGER.d("Closing classifier.");
            classifier.close();
            classifier = null;
        }
        if (device == Device.GPU && model == Model.QUANTIZED) {
            LOGGER.d("Not creating classifier: GPU doesn't support quantized models.");
            runOnUiThread(
                    new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(ClassifierActivity.this, "GPU does not yet supported quantized models.", Toast.LENGTH_LONG)
                                    .show();
                        }
                    });
            return;
        }
        try {
            LOGGER.d(
                    "Creating classifier (model=%s, device=%s, numThreads=%d)", model, device, numThreads);

            classifier = Classifier.create(this, model, device, numThreads, tflitePath, labelPath);
        } catch (IOException e) {
            LOGGER.e(e, "Failed to create classifier.");
        }
    }
}
