package com.feke.esl1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cloudinary.android.MediaManager;
import com.feke.esl1.basic.BasicHome;
import com.feke.esl1.basic.BasicList;
import com.feke.esl1.basic.ExAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadMore extends AppCompatActivity implements View.OnClickListener{

    //this is the JSON Data URL
    private static final String URL_SIGNS = "http://192.168.43.193/esl/my_api.php";
    static boolean parseIsInit = false;
    //a list to store all the products
    List<LearnItem> learnItems;
    //the recyclerview
    RecyclerView recyclerView;

    ImageView search, favorite, trash, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_or_ex_list_frament);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.load_more));

        //Getting the bottom toolbar image
                search = findViewById(R.id.toolbarBottomSearch);
        search.setOnClickListener(this);

        favorite = findViewById(R.id.toolbarBottomFav);
        favorite.setOnClickListener(this);

        trash = findViewById(R.id.toolbarBottomHome);
        trash.setOnClickListener(this);

        info = findViewById(R.id.toolbarBottomInfo);
        info.setOnClickListener(this);

        if (!parseIsInit) {
            Map config = new HashMap();
            config.put("cloud_name", "ethiopians-coder");
            MediaManager.init(this, config);
            parseIsInit = true;
        }

        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.basicRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        learnItems = new ArrayList<>();

        //this method will fetch and parse json
        //to display it in recyclerview
        loadProducts();
    }

    private void loadProducts() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_SIGNS,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //converting the string to json array object
                            JSONArray array = new JSONArray(response);

                            //traversing through all the object
                            for (int i = 0; i < array.length(); i++) {

                                //getting product object from json array
                                JSONObject signs = array.getJSONObject(i);

                                Toast.makeText(LoadMore.this, "You are on load more", Toast.LENGTH_LONG).show();
                                //adding the product to product list
                                learnItems.add(new LearnItem(
                                        signs.getString("img") + "",
                                        signs.getString("name") + "",
                                        signs.getString("desc") + "",
                                        "Click for more",
                                        signs.getInt("id") + "",
                                        "0"
                                ));
                            }

                            //creating adapter object and setting it to recyclerview
                            LoadMoreAdapter adapter = new LoadMoreAdapter(learnItems, LoadMore.this);
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {

                            Toast.makeText(LoadMore.this, "You are on load more error " + e.getMessage(), Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        System.out.println(error.getMessage());
                        Toast.makeText(LoadMore.this, "You are on load more error" + error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(this).add(stringRequest);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.toolbarBottomSearch:
                intent = new Intent(this, SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.toolbarBottomFav:
                intent = new Intent(this, BasicList.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomHome:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("type", "all");
                startActivity(intent);
                break;
            case R.id.toolbarBottomInfo:
                intent = new Intent(this, AboutUs.class);
                startActivity(intent);
                break;
        }
    }
}