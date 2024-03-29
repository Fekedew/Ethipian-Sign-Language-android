package com.feke.esl1;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.feke.esl1.basic.Adapter;
import com.feke.esl1.basic.BasicHome;
import com.feke.esl1.basic.BasicList;
import com.feke.esl1.basic.ExAdapter;
import com.feke.esl1.favorite.FavDB;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment implements View.OnClickListener {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    Button submitEx;
    ImageView search, favorite, trash, info;
    String folder, select_en, select_ah;
    private String mParam1;
    private String mParam2;
    //Create learn item variable form Lear item clas
    private List<LearnItem> learnItems;
    private RecyclerView recyclerView;
    private FavDB favDB;

    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            this.mParam1 = getArguments().getString(ARG_PARAM1);
            this.mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String type = getArguments().getString("type");
        folder = getArguments().getString("folder");

        if (type.equals("Learn")) {
            View view = inflater.inflate(R.layout.learn_or_ex_list_frament, container, false);

            recyclerView = view.findViewById(R.id.basicRecyclerView);
            recyclerView.setHasFixedSize(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            //Getting the bottom toolbar image
            search = view.findViewById(R.id.toolbarBottomSearch);
            search.setOnClickListener(this);

            favorite = view.findViewById(R.id.toolbarBottomFav);
            favorite.setOnClickListener(this);

            trash = view.findViewById(R.id.toolbarBottomHome);
            trash.setOnClickListener(this);

            info = view.findViewById(R.id.toolbarBottomInfo);
            info.setOnClickListener(this);


            learnItems = new ArrayList<>();


            favDB = new FavDB(getContext());

            //create table on first start
            Cursor cu = favDB.isFirstStart();
            if (cu == null || cu.getCount() == 0) {
                createTableOnFirstStart();
            }
            final AssetManager assetManager = getActivity().getAssets();
            try {
                // for assets folder add empty string
                String[] fileList = assetManager.list(folder);
                if (fileList == null) {
                    // dir does not exist or is not a directory
                } else {
                    String folders[] = {"alphabet", "numbers", "body", "days", "albasat", "animal", "family",
                            "food_drink", "fruits", "maths", "vegetable", "amharicFidel", "nature", "spiritual",
                            "weeks", "wild_animal", "names", "color"
                    };

                    if (folder.equals("all")) {
                        favorite.setImageResource(R.drawable.ic_favorite_red_24dp);
                        favorite.setEnabled(false);
                        for (int i = 0; i < folders.length; i++) {
                            addToLearnItems("fav", folders[i], "le");
                        }
                    } else {
                        addToLearnItems("single", folder, "le");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Adapter adapter = new Adapter(learnItems, getContext());
            recyclerView.setAdapter(adapter);
            return view;
        } else {
            View view = inflater.inflate(R.layout.exercise_home, container, false);
            recyclerView = view.findViewById(R.id.exRecyclerView);
            recyclerView.setHasFixedSize(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

            submitEx = view.findViewById(R.id.submitEx);
            submitEx.setOnClickListener(this);

            learnItems = new ArrayList<>();
            favDB = new FavDB(getContext());

            //create table on first start
            Cursor cu = favDB.isFirstStart();
            if (cu == null || cu.getCount() == 0) {
                createTableOnFirstStart();
            }
            final AssetManager assetManager = getActivity().getAssets();
            try {
                // for assets folder add empty string
                String[] fileList = assetManager.list(folder);
                if (fileList == null) {
                    // dir does not exist or is not a directory
                } else {
                    String folders[] = {"alphabet", "numbers", "body", "days", "albasat", "animal", "family",
                            "food_drink", "fruits", "maths", "vegetable", "amharicFidel", "nature", "spiritual",
                            "weeks", "wild_animal", "names", "color"
                    };

                    if (folder.equals("all")) {
                        favorite.setImageResource(R.drawable.ic_favorite_red_24dp);
                        favorite.setEnabled(false);
                        for (int i = 0; i < folders.length; i++) {
                            addToLearnItems("fav", folders[i], "ex");
                        }
                    } else {
                        addToLearnItems("single", folder, "ex");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ExAdapter adapter = new ExAdapter(learnItems, getContext(), folder);
            recyclerView.setAdapter(adapter);

            return view;
        }


    }

    private void createTableOnFirstStart() {
        favDB.insertAssets();
        favDB.insertFirstStart();
    }


    //Add to learItems list based on specific folder
    public void addToLearnItems(String type, String folder, String ex) {
        SQLiteDatabase db = favDB.getReadableDatabase();
        Cursor cursor = null;
        if (type.equals("fav")) {
            cursor = favDB.selectAllFavoriteList(folder);
        } else if (type.equals("single") && ex.equals("le")) {
            cursor = favDB.selectAll(folder);
        } else if (type.equals("single") && ex.equals("ex")) {
            cursor = favDB.selectRandomFive(folder);
        }
        try {
            SharedPreferences pref = getContext().getSharedPreferences("LangSettings", Activity.MODE_PRIVATE);
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
                        "See More 👇",
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
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.toolbarBottomSearch:
                intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.toolbarBottomFav:
                intent = new Intent(getContext(), BasicList.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomHome:
                intent = new Intent(getContext(), MainActivity.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomInfo:
                intent = new Intent(getContext(), AboutUs.class);
                startActivity(intent);
                break;
            case R.id.submitEx:
                List<String> correctAns = ExAdapter.correctAns;
                int correct = correctAns.size();
                favDB.updateProgress(folder, correct);

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());
                mBuilder.setTitle(R.string.start_again);
                mBuilder.setMessage("Results\n\n" + "Correct answers: " + correct + " Out of: "
                        + ExAdapter.allQuestions + "\n\n List of correct answers :" + correctAns.toString());
                mBuilder.setNegativeButton(R.string.enough, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getContext(), BasicHome.class);
                        startActivity(intent);
                        dialog.dismiss();
                    }
                });
                mBuilder.setPositiveButton(R.string.try_again, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                //Show the alert dialog
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

                break;
        }
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
//        inflater.inflate(R.menu.language_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.menu.language_menu:
                Toast.makeText(getContext(), item.getTitle(), Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}



