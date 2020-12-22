package com.feke.esl1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.feke.esl1.basic.BasicList;
import com.feke.esl1.settings.SettingsActivity;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private static final String TAG = "MainActivity";

    ImageView search, favorite, trash, info;
    //drawer layout
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        //Getting the bottom toolbar image
        search = findViewById(R.id.toolbarBottomSearch);
        search.setOnClickListener(this);

        favorite = findViewById(R.id.toolbarBottomFav);
        favorite.setOnClickListener(this);

        trash = findViewById(R.id.toolbarBottomTrash);
        trash.setOnClickListener(this);

        info = findViewById(R.id.toolbarBottomInfo);
        info.setOnClickListener(this);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //MAKE THE FIRST FRAGMENT TO HOME
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new LearnHome()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new LearnHome()).commit();
                break;
            case R.id.nav_translation:
                Toast.makeText(this, "Sign translation is not yet implemented", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "Share is not yet implemented", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_video_call:
                Toast.makeText(this, "Video call is not yet implemented", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_add_new:
                Toast.makeText(this, "Add new sign is not yet implemented", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_settings:
                intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_rate:
                Toast.makeText(this, "Rating is not yet implemented", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.toolbarBottomSearch:
                intent = new Intent(this, BasicList.class);
                intent.putExtra("type", "search");
                startActivity(intent);
                break;
            case R.id.toolbarBottomFav:
                intent = new Intent(this, BasicList.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomTrash:
                Toast.makeText(this, "Trah image view", Toast.LENGTH_LONG).show();
                break;
            case R.id.toolbarBottomInfo:
                Toast.makeText(this, "Here is about us", Toast.LENGTH_LONG).show();
                break;
        }
    }
}