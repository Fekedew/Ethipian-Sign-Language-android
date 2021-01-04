package com.feke.esl1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.feke.esl1.basic.BasicList;
import com.feke.esl1.basic.ExAdapter;
import com.feke.esl1.favorite.FavDB;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {


    private List<LearnItem> learnItems;
    private RecyclerView recyclerView;
    private SearchAdapter adapter;

    private FavDB favDB;

    ImageView search, favorite, trash, info;
    String folder, select_en, select_ah;


    String type = "all";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_or_ex_list_frament);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.search));

        recyclerView = findViewById(R.id.basicRecyclerView);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //Getting the bottom toolbar image
        search = findViewById(R.id.toolbarBottomSearch);
        search.setOnClickListener(this);

        favorite = findViewById(R.id.toolbarBottomFav);
        favorite.setOnClickListener(this);

        trash = findViewById(R.id.toolbarBottomHome);
        trash.setOnClickListener(this);

        info = findViewById(R.id.toolbarBottomInfo);
        info.setOnClickListener(this);


        learnItems = new ArrayList<>();


        favDB = new FavDB(this);

        //create table on first start
        Cursor cu = favDB.isFirstStart();
        if (cu == null || cu.getCount() == 0) {
            createTableOnFirstStart();
        }
        final AssetManager assetManager = getAssets();
        try {
            // for assets folder add empty string
            String folders[] = {"alphabet", "numbers", "body", "family", "days", "albasat", "animal", "family",
                    "food_drink", "fruits", "maths", "stationary", "vegetable"
            };

            for (int i = 0; i < folders.length; i++) {
                addToLearnItems("fav", folders[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        adapter = new SearchAdapter(learnItems, this);
        recyclerView.setAdapter(adapter);

    }

    private void createTableOnFirstStart() {
        favDB.insertAssets();
        favDB.insertFirstStart();
    }


    //Add to learItems list based on specfic folder
    public void addToLearnItems(String type, String folder) {
        SQLiteDatabase db = favDB.getReadableDatabase();
        Cursor cursor = null;
        cursor = favDB.selectAll(folder);
        try {
            SharedPreferences pref = getSharedPreferences("LangSettings", Activity.MODE_PRIVATE);
            String lan = pref.getString("selected_language", "");

            int i = 0, l = 1;
            if (lan.equals("am")) {
                l = 0;
            }
            while (cursor.moveToNext()) {
                String[] whi = cursor.getString(cursor.getColumnIndex(FavDB.ITEM_TITLE)).split("/");
                select_en = whi[l];
//                select_ah = whi[0];
                learnItems.add(new LearnItem(
                        folder + "/" + cursor.getString(cursor.getColumnIndex(FavDB.KEY_ID)),
                        "" + select_en,
                        "" + cursor.getString(cursor.getColumnIndex(FavDB.ITEM_DISK)),
                        "See More ☝",
                        "" + cursor.getString(cursor.getColumnIndex(FavDB.KEY_ID)),
                        "" + cursor.getString(cursor.getColumnIndex(FavDB.FAVORITE_STATUS))
                ));

            }
        } finally {
            if (cursor != null && cursor.isClosed())
                cursor.close();
            db.close();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search_action);

        final SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.toolbarBottomHome:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomFav:
                intent = new Intent(this, BasicList.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomInfo:
                Toast.makeText(this, "Here is about us", Toast.LENGTH_LONG).show();
                break;
            case R.id.submitEx:
                Toast.makeText(this, "Here is submitting", Toast.LENGTH_LONG).show();
                int correct = ExAdapter.correctAnswers.size();
                Toast.makeText(this, "Correct answers: " + correct + " Out of: " + ExAdapter.allQuestions, Toast.LENGTH_LONG).show();

                break;
        }
    }
}