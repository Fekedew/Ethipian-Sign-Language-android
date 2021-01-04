package com.feke.esl1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.feke.esl1.basic.BasicHome;
import com.feke.esl1.favorite.FavDB;
import com.feke.esl1.intermediate.AdvancedHome;
import com.feke.esl1.intermediate.IntermediateHome;

public class LearnHome extends Fragment implements View.OnClickListener {

    // Progress bar for all level (basic, intermediate, advance)
    ProgressBar basicProgressBar;
    ProgressBar intermediateProgressBar;
    ProgressBar advanceProgressBar;

    // Percent text view for all level (basic, intermediate, advance)
    TextView basicPercentTextView, intermediatePercent, advancePercent;
    CardView basicImageView;

    FavDB favDB;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.learn_home, container, false);

        favDB = new FavDB(getContext());

        basicImageView = view.findViewById(R.id.card_basic);
        basicImageView.setOnClickListener(this);
        CardView intermediateImageView = view.findViewById(R.id.card_intermediate);
        intermediateImageView.setOnClickListener(this);
        CardView advanceImageView = view.findViewById(R.id.card_advance);
        advanceImageView.setOnClickListener(this);

        basicProgressBar = view.findViewById(R.id.basicProgressBar);
        intermediateProgressBar = view.findViewById(R.id.intermediateProgressBar);
        advanceProgressBar = view.findViewById(R.id.advanceProgressBar);


        basicPercentTextView = view.findViewById(R.id.basicProgressBarPercent);
        intermediatePercent = view.findViewById(R.id.intermediateProgressBarPercent);
        advancePercent = view.findViewById(R.id.advanceProgressBarPercent);

        setProgress(view, "basic");
        setProgress(view, "intermediate");
        setProgress(view, "advance");
        return view;
    }

    public void setProgress(View view, String type) {
        int progress = 0;

        SQLiteDatabase db = favDB.getReadableDatabase();
        Cursor cursor = favDB.getProgress(type);
        try {

            while (cursor.moveToNext()) {
                progress = cursor.getInt(0);
            }
        } catch (Exception e) {
            Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        } finally {
            if (cursor != null && cursor.isClosed())
                cursor.close();
            db.close();
        }
        int lastProgress = (progress * 100) / 35;
        if (type.equals("basic")) {
            basicProgressBar.setProgress(lastProgress);
            // Get the progress bar value and set to the percent view
            basicPercentTextView.setText(lastProgress + " %");
        } else if (type.equals("intermediate")) {

            intermediateProgressBar.setProgress(lastProgress);
            // Get the progress bar value and set to the percent view
            intermediatePercent.setText(lastProgress + " %");
        } else {

            advanceProgressBar.setProgress(lastProgress);
            // Get the progress bar value and set to the percent view
            advancePercent.setText(lastProgress + " %");
        }
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
