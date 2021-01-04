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

public class IntermediateHome extends AppCompatActivity implements View.OnClickListener {

    CardView albasat, animal, nature, food, vegetable, fruit, color, names;
    Activity activity;
    Intent in;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate_home);

        albasat = findViewById(R.id.albasat);
        animal = findViewById(R.id.animal);
        nature = findViewById(R.id.nature);
        food = findViewById(R.id.food_and_drink);
        vegetable = findViewById(R.id.vegetable);
        fruit = findViewById(R.id.fruit);
        color = findViewById(R.id.colorCard);
        names = findViewById(R.id.names);

//        fruit = findViewById(R.id.);

        //Set on click listner
        albasat.setOnClickListener(this);
        food.setOnClickListener(this);
        animal.setOnClickListener(this);
        vegetable.setOnClickListener(this);
        nature.setOnClickListener(this);
        fruit.setOnClickListener(this);
        color.setOnClickListener(this);
        names.setOnClickListener(this);

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
            case R.id.animal:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "animal");
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
            case R.id.names:
                in = new Intent(activity, BasicList.class);
                in.putExtra("type", "names");
                startActivity(in);
                break;

        }
    }
}


