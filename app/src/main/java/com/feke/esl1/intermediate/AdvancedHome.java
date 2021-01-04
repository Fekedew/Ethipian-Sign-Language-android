package com.feke.esl1.intermediate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.feke.esl1.R;
import com.feke.esl1.basic.BasicList;

public class AdvancedHome extends AppCompatActivity implements View.OnClickListener {

    CardView albasat, animal, nature, food, vegetable, fruit, color;
    Activity activity;
    Intent in;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_home);

        albasat = findViewById(R.id.albasat);
        animal = findViewById(R.id.wild_animal);
        nature = findViewById(R.id.nature);
        food = findViewById(R.id.food_and_drink);
        vegetable = findViewById(R.id.vegetable);
        fruit = findViewById(R.id.fruit);

//        fruit = findViewById(R.id.);

        //Set on click listner
        albasat.setOnClickListener(this);
        food.setOnClickListener(this);
        animal.setOnClickListener(this);
        vegetable.setOnClickListener(this);
        nature.setOnClickListener(this);
        fruit.setOnClickListener(this);

        activity = this;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.albasat:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "albasat");
                startActivity(in);
                break;
            case R.id.wild_animal:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "wild_animal");
                startActivity(in);
                ;
                break;
            case R.id.food_and_drink:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "food_drink");
                startActivity(in);
                break;
            case R.id.vegetable:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "vegetable");
                startActivity(in);
                break;
            case R.id.colorCard:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "color");
                startActivity(in);
                break;
            case R.id.fruit:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "fruits");
                startActivity(in);
                break;
            case R.id.nature:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "nature");
                startActivity(in);
                break;

        }
    }
}


