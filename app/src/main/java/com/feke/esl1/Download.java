package com.feke.esl1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;

public class Download {
    public static String save(Context context, String str, ImageView imageView) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        sb.append(context.getPackageName());
        String str2 = "";
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("/ESL");
        File file = new File(sb3.toString());
        if (!file.exists()) {
            file.mkdir();
            System.out.println("\n\nThis is file");
            System.out.println(file.toString() + "\n\n");
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(file.getAbsolutePath());
//        sb4.append("/thumb");
        File file2 = new File(sb4.toString());
        if (!file2.exists()) {
            file2.mkdir();
            System.out.println("\n\nThis is file2");
            System.out.println(file2.toString() + "\n\n");
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getPureFileName(str));
        sb5.append(".jpg");
        File file3 = new File(file2, sb5.toString());
        try {
            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            System.out.println("\n\nThis is file3");
            System.out.println(file3.getAbsolutePath() + "\n\n");
            return file3.getAbsolutePath();
        } catch (Exception unused) {
            System.out.println("\n\nThis is exception");
            System.out.println(unused + "\n\n");
            return str2;
        }
    }

    public static String getPureFileName(String str) {
        String str2 = "";
        return str.replace("/", str2).replace("\\", "_").replace(":", str2).replace("*", str2).replace("\"", str2).replace("<", str2).replace(">", str2).replace("|", str2).replace("?", str2);
    }
}
