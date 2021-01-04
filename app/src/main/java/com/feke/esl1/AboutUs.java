package com.feke.esl1;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.about_us));
    }
}