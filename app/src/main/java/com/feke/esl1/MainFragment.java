package com.feke.esl1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.feke.esl1.basic.Adapter;
import com.feke.esl1.basic.BasicList;
import com.feke.esl1.basic.ExAdapter;
import com.feke.esl1.favorite.FavDB;

import java.util.ArrayList;
import java.util.List;

public class   MainFragment extends Fragment implements View.OnClickListener {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;


    private List<LearnItem> learnItems;
    private RecyclerView recyclerView;
    Button submitEx;

    private FavDB favDB;

    ImageView search, favorite, trash, info;
    String folder, select_en, select_ah;


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

        trash = view.findViewById(R.id.toolbarBottomTrash);
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
                    String folders[] = {"alphabet", "numbers", "body", "family", "days", "albasat", "animal", "family",
                            "food_drink", "fruits", "maths", "stationary", "vegetable"
                    };

                    if (folder.equals("all")) {
                        favorite.setImageResource(R.drawable.ic_favorite_red_24dp);
                        favorite.setEnabled(false);
                        for (int i = 0; i < folders.length; i++) {
                            addToLearnItems("fav", folders[i]);
                        }
                    } else {
                        addToLearnItems("single", folder);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Adapter adapter = new Adapter(learnItems, getContext());
            recyclerView.setAdapter(adapter);

            return view;
        }
        else{
            View view = inflater.inflate(R.layout.exercise_home, container, false);
            //remove bottom toolbar
//            AppBarLayout appBarLayout = view.findViewById(R.id.appBarLayout);
//            appBarLayout.setVisibility(View.GONE);

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
                    String folders[] = {"alphabet", "numbers", "body", "family", "days", "albasat", "animal", "family",
                            "food_drink", "fruits", "maths", "stationary", "vegetable"
                    };

                    if (folder.equals("all")) {
                        favorite.setImageResource(R.drawable.ic_favorite_red_24dp);
                        favorite.setEnabled(false);
                        for (int i = 0; i < folders.length; i++) {
                            addToLearnItems("fav", folders[i]);
                        }
                    } else {
                        addToLearnItems("single", folder);
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


    //Add to learItems list based on specfic folder
    public void addToLearnItems(String type, String folder){
        SQLiteDatabase db = favDB.getReadableDatabase();
        Cursor cursor = null;
        if (type.equals("fav")){
            cursor = favDB.selectAllFavoriteList(folder);
        }else if (type.equals("single")){
            cursor = favDB.selectAll(folder);
        }
        try {
            SharedPreferences pref = getContext().getSharedPreferences("LangSettings", Activity.MODE_PRIVATE);
            String lan = pref.getString("selected_language", "");

            int i=0, l = 1;
            if (lan.equals("am")){
                l=0;
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
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.toolbarBottomSearch:
                intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
//                Toast.makeText(this, "Search image view in the bottom tool bar was clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.toolbarBottomFav:

                intent = new Intent(getContext(), BasicList.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomTrash:
                Toast.makeText(getContext(), "Trah image view", Toast.LENGTH_LONG).show();
                break;
            case R.id.toolbarBottomInfo:
                Toast.makeText(getContext(), "Here is about us", Toast.LENGTH_LONG).show();
                break;
            case R.id.submitEx:
                Toast.makeText(getContext(), "Here is submitting", Toast.LENGTH_LONG).show();
                int correct = ExAdapter.correctAnswers.size();
                Toast.makeText(getContext(), "Correct answers: "+correct+" Out of: "+ExAdapter.allQuestions, Toast.LENGTH_LONG).show();

                break;
        }
    }
}



