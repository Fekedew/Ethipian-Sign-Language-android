package com.feke.esl1.settings;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.feke.esl1.R;
import com.feke.esl1.favorite.FavDB;

import java.util.Locale;


public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{

    Button changeLanguage, clearFav, clearProgress;

    private FavDB favDB;

    public SettingsActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        loadLocale();
        setContentView(R.layout.settings_activity);

        favDB = new FavDB(this);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.app_name));

        changeLanguage = findViewById(R.id.changeLanguage);
        clearProgress = findViewById(R.id.clearProgress);
        clearProgress.setOnClickListener(this);
        clearFav = findViewById(R.id.clearAllFav);
        clearFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SettingsActivity.this);
                mBuilder.setTitle("Are you sure to erase all favorite data?");
                mBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                mBuilder.setPositiveButton(R.string.go, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        favDB.removeFavoriteBy();
                        Toast.makeText(getBaseContext(), "Done", Toast.LENGTH_LONG).show();
                    }
                });
                //Show the alert dialog
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        changeLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLanguageSelectionDialog();
            }
        });

    }

    private void showLanguageSelectionDialog() {

        //List of language
        String[] langs = {"English", "አማርኛ"};

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(SettingsActivity.this);
        mBuilder.setTitle("Choose language");
        mBuilder.setSingleChoiceItems(langs, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    setLocale("en");
                    recreate();
                } else if (i == 1) {
                    setLocale("am");
                    recreate();
                }
                dialogInterface.dismiss();
            }
        });
        //Show the alert dialog
        AlertDialog mDialog = mBuilder.create();
        mDialog.show();
    }

    public void setLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);

        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        //save to shared preference
        SharedPreferences.Editor editor = getSharedPreferences("LangSettings", MODE_PRIVATE).edit();
        editor.putString("selected_language", lang);
        editor.apply();
    }

    public void loadLocale() {
        SharedPreferences pref = getSharedPreferences("LangSettings", Activity.MODE_PRIVATE);
        String lan = pref.getString("selected_language", "");
        setLocale(lan);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clearProgress:
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SettingsActivity.this);
                mBuilder.setTitle("Are you sure to erase all progress data?");
                mBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                mBuilder.setPositiveButton(R.string.go, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        favDB.removeAllProgress();
                        Toast.makeText(getBaseContext(), "Done", Toast.LENGTH_LONG).show();
                    }
                });
                //Show the alert dialog
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
                break;
        }
    }
}