package com.feke.esl1.basic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.feke.esl1.R;

public class BasicHome extends AppCompatActivity {

    CardView learnNumber, learnAlphabet, learnAmharicFidel, learnMonth, learnBodyPart, learnFamily, learnMaths;
    Activity activity;
    Intent in;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_home);

        learnNumber = findViewById(R.id.ln);
        learnAlphabet = findViewById(R.id.la);
        learnMonth = findViewById(R.id.learnMonth);
        learnBodyPart = findViewById(R.id.bodyPart);
        learnFamily = findViewById(R.id.lf);
        learnMaths = findViewById(R.id.maths);
        learnAmharicFidel = findViewById(R.id.amharicFidel);

        activity = this;

        learnAmharicFidel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "amharicFidel");
                startActivity(in);
            }
        });
        learnBodyPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "body");
                startActivity(in);
            }
        });
        learnMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "days");
                startActivity(in);
            }
        });

        learnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "maths");
                startActivity(in);
            }
        });

        //Set on click listner for the card view
        learnAlphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "alphabet");
                startActivity(in);

            }
        });

        learnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "numbers");
                startActivity(in);
            }
        });

        learnFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "family");
                startActivity(in);
            }
        });
    }

}


