package com.feke.esl1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.feke.esl1.basic.BasicHome;
import com.feke.esl1.intermediate.AdvancedHome;
import com.feke.esl1.intermediate.IntermediateHome;

public class LearnHome extends Fragment implements View.OnClickListener {

    // Progress bar for all level (basic, intermediate, advance)
    ProgressBar basicProgressBar;
    ProgressBar intermediateProgressBar;
    ProgressBar advanceProgressBar;

    // Percent text view for all level (basic, intermediate, advance)
    TextView basicPercentTextView;
    CardView basicImageView;

    Button basicDownloadBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.learn_home, container, false);


        basicImageView = view.findViewById(R.id.card_basic);
        basicImageView.setOnClickListener(this);
        CardView intermediateImageView = view.findViewById(R.id.card_intermediate);
        intermediateImageView.setOnClickListener(this);
        CardView advanceImageView = view.findViewById(R.id.card_advance);
        advanceImageView.setOnClickListener(this);

        basicProgressBar = view.findViewById(R.id.basicProgressBar);
        basicProgressBar.setProgress(10);

        //Image view
//        basicDownloadBtn = view.findViewById(R.id.basicDownloadBtn);
//        basicDownloadBtn.setOnClickListener(this);

        // Get the progress bar value and set to the percent view
        int val = basicProgressBar.getProgress();
        basicPercentTextView = view.findViewById(R.id.basicProgressBarPercent);
        basicPercentTextView.setText(val + " %");
        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.card_basic:
                intent = new Intent(getContext(), BasicHome.class);
                startActivity(intent);
                break;
            case R.id.card_intermediate:
                intent = new Intent(getContext(), IntermediateHome.class);
                startActivity(intent);
                break;
            case R.id.card_advance:
                intent = new Intent(getContext(), AdvancedHome.class);
                startActivity(intent);
                break;
        }
    }
}
