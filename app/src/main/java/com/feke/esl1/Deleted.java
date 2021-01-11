//package com.feke.esl1;
//
//import android.content.Context;
//import android.content.res.AssetManager;
//import android.os.Bundle;
//import android.os.Environment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.recyclerview.widget.LinearLayoutManager;
//
//import com.feke.esl1.basic.Adapter;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class Deleted {
//}
//
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.basic_list, container, false);
//
//        activity = this;
//
////         Get all value from database
//        recyclerView = view.findViewById(R.id.basicRecyclerView);
//        recyclerView   .setHasFixedSize(false);
//        recyclerView.setAdapter(new Adapter(learnItems, getActivity()));
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//        learnItems = new ArrayList<>();
//
//        final AssetManager assetManager = activity.getAssets();
//        try {
//            // for assets folder add empty string
//            String[] filelist = assetManager.list("all");
//            // for assets/subFolderInAssets add only subfolder name
//            String[] filelistInSubfolder = assetManager.list("");
//            if (filelist == null) {
//                // dir does not exist or is not a directory
//            } else {
//                for (int i=0; i<filelist.length; i++) {
//                    // Get filename of file or directory
//                    String filename = filelist[i];
//                    learnItems.add(new LearnItem(
//                            "all/"+filename,
//                            "text ",
//                            "description",
//                            "See More ☝",
//                            "0",
//                            "0"
//                    ));
//
//
//                    //creating adapter object and setting it to recyclerview
//                    Adapter adapter = new Adapter(learnItems, getActivity());
//                    recyclerView.setAdapter(adapter);
//                }
//            }
//
//            // if(filelistInSubfolder == null) ............
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        loadSigns();
//
////        learnItems.add(new LearnItem(R.drawable.ha, "Ha", "Description", "Click more", "0", "0"));
//        return view;
//    }
//
//
////    private void loadSigns() {
////
////        // check network status
////        ConnectivityManager cm = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
////        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
////        if (activeNetwork != null){
////            Toast.makeText(getContext(), "There is internet connection", Toast.LENGTH_SHORT).show();
////
////            StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_SIGNS,
////                    new Response.Listener<String>() {
////                        @Override
////                        public void onResponse(String response) {
////                            try {
////                                //converting the string to json array object
////                                JSONArray array = new JSONArray(response);
////
////                                //traversing through all the object
////                                for (int i = 0; i < array.length(); i++) {
////
////                                    //getting product object from json array
////                                    JSONObject signs = array.getJSONObject(i);
////
////                                    //adding the product to product list
////                                    learnItems.add(new LearnItem(
////                                            signs.getString("image_location")+"",
////                                            signs.getString("text")+"",
////                                            signs.getString("description")+"",
////                                            "See More ☝",
////                                            signs.getInt("sign_id")+"",
////                                            "0"
////                                    ));
////                                }
////
////                                //creating adapter object and setting it to recyclerview
////                                Adapter adapter = new Adapter(learnItems, getActivity());
////                                recyclerView.setAdapter(adapter);
////                            } catch (JSONException e) {
////                                e.printStackTrace();
////                            }
////                        }
////                    },
////                    new Response.ErrorListener() {
////                        @Override
////                        public void onErrorResponse(VolleyError error) {
////
////                        }
////                    });
////
////            //adding our string request to queue
////            Volley.newRequestQueue(getActivity()).add(stringRequest);
////        }
////        else {
////            Toast.makeText(getContext(), "There is no internet connection", Toast.LENGTH_SHORT).show();
////        }
////
////    }
//
//    public File getDataFolder(Context context) {
//        File dataDir = null;
//        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
//            dataDir = new File(Environment.getExternalStorageDirectory(), "eslappdata");
//            if(!dataDir.isDirectory()) {
//                dataDir.mkdirs();
//            }
//        }
//
//        if(!dataDir.isDirectory()) {
//            dataDir = context.getFilesDir();
//        }
//
//        return dataDir;
//    }


//    private void loadSigns() {
//
//        // check network status
//        ConnectivityManager cm = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
//        if (activeNetwork != null){
//            Toast.makeText(getContext(), "There is internet connection", Toast.LENGTH_SHORT).show();
//
//            StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_SIGNS,
//                    new Response.Listener<String>() {
//                        @Override
//                        public void onResponse(String response) {
//                            try {
//                                //converting the string to json array object
//                                JSONArray array = new JSONArray(response);
//
//                                //traversing through all the object
//                                for (int i = 0; i < array.length(); i++) {
//
//                                    //getting product object from json array
//                                    JSONObject signs = array.getJSONObject(i);
//
//                                    //adding the product to product list
//                                    learnItems.add(new LearnItem(
//                                            signs.getString("image_location")+"",
//                                            signs.getString("text")+"",
//                                            signs.getString("description")+"",
//                                            "See More ☝",
//                                            signs.getInt("sign_id")+"",
//                                            "0"
//                                    ));
//                                }
//
//                                //creating adapter object and setting it to recyclerview
//                                Adapter adapter = new Adapter(learnItems, getActivity());
//                                recyclerView.setAdapter(adapter);
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    },
//                    new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//
//                        }
//                    });
//
//            //adding our string request to queue
//            Volley.newRequestQueue(getActivity()).add(stringRequest);
//        }
//        else {
//            Toast.makeText(getContext(), "There is no internet connection", Toast.LENGTH_SHORT).show();
//        }
//
//    }


// Get all value from database
//        name = "Name";
//        descName = "Description name";
//        descTip = "Click arrow for more";
//        favStatus = "0";
//        key_id = "0";
//        imageResource = R.drawable.ha;
//        recyclerView = view.findViewById(R.id.basicRecyclerView);
//        recyclerView   .setHasFixedSize(false);
//        recyclerView.setAdapter(new Adapter(learnItems, getActivity()));
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

//        learnItems = new ArrayList<>();
//        DatabaseConnection databaseConnection = new DatabaseConnection(getContext());
//        databaseConnection.execute();
//        loadSigns();

//        learnItems.add(new LearnItem(R.drawable.ha, "Ha", "Description", "Click more", "0", "0"));


//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.basic_home, container, false);
//
//        activity = getActivity();
//        learnNumber = view.findViewById(R.id.ln);
//        learnAlphabet = view.findViewById(R.id.la);
//        learnMonth = view.findViewById(R.id.learnMonth);
//        learnBodyPart = view.findViewById(R.id.bodyPart);
//
//
//
//        learnBodyPart.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//
//        Intent in = new Intent(activity, BasicList.class);
//        in.putExtra("type", "body");
//        startActivity(in);
//        }
//        });
//        learnMonth.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent in = new Intent(activity, BasicList.class);
//        in.putExtra("type", "day");
//        startActivity(in);
//        }
//        });
//
//        //Set on click listner for the card view
//        learnAlphabet.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent in = new Intent(activity, BasicList.class);
//        in.putExtra("type", "alphabet");
//        startActivity(in);
//
//        }
//        });
//
//        learnNumber.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent in = new Intent(activity, BasicList.class);
//        in.putExtra("type", "number");
//        startActivity(in);
//        }
//        });
//        return view;
//        }


//package com.feke.esl1;
//
//import android.content.res.AssetManager;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.cardview.widget.CardView;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.feke.esl1.basic.Adapter;
//import com.feke.esl1.favorite.FavDB;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LearnListHomeFragment extends Fragment {
//
//
//    private List<LearnItem> learnItems;
//    private RecyclerView recyclerView;
//
//    private FavDB favDB;
//
//    ImageView search, favorite, trash, info;
//    String folder, select_en, select_ah;
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.learn_or_ex_list_frament, container, false);
//
//        String type = getArguments().getString("type");
//        folder = getArguments().getString("folder");
//        if (type.equals("Learn")) {
//            recyclerView = view.findViewById(R.id.basicRecyclerView);
//            recyclerView.setHasFixedSize(false);
//            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//            learnItems = new ArrayList<>();
//
//
//            favDB = new FavDB(getContext());
//
//            //create table on first start
//            Cursor cu = favDB.isFirstStart();
//            if (cu == null || cu.getCount() == 0) {
//                createTableOnFirstStart();
//            }
//            final AssetManager assetManager = getActivity().getAssets();
//            try {
//                // for assets folder add empty string
//                String[] fileList = assetManager.list(folder);
//                if (fileList == null) {
//                    // dir does not exist or is not a directory
//                } else {
//                    String folders[] = {"number", "alphabet", "body", "family", "day"};
//
//                    if (folder.equals("all")) {
//                        favorite.setImageResource(R.drawable.ic_favorite_red_24dp);
//                        favorite.setEnabled(false);
//                        for (int i = 0; i < folders.length; i++) {
//                            addToLearnItems("fav", folders[i]);
//                        }
//                    } else {
//                        addToLearnItems("single", folder);
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            Adapter adapter = new Adapter(learnItems, getContext());
//            recyclerView.setAdapter(adapter);
//        }else{
//
//        }
//
//        return view;
//    }
//
//    private void createTableOnFirstStart() {
//        favDB.insertAssets();
//        favDB.insertFirstStart();
//    }
//
//
//    //Add to learItems list based on specfic folder
//    public void addToLearnItems(String type, String folder){
//        SQLiteDatabase db = favDB.getReadableDatabase();
//        Cursor cursor = null;
//        if (type.equals("fav")){
//            cursor = favDB.selectAllFavoriteList(folder);
//        }else if (type.equals("single")){
//            cursor = favDB.selectAll(folder);
//        }
//        try {
//            while (cursor.moveToNext()) {
//                String[] whi = cursor.getString(cursor.getColumnIndex(FavDB.ITEM_TITLE)).split("/");
//                select_en = whi[1];
//                select_ah = whi[0];
//                learnItems.add(new LearnItem(
//                        folder + "/" + cursor.getString(cursor.getColumnIndex(FavDB.KEY_ID)),
//                        "" + select_en,
//                        "" + cursor.getString(cursor.getColumnIndex(FavDB.ITEM_DISK)),
//                        "See More ☝",
//                        "" + cursor.getString(cursor.getColumnIndex(FavDB.KEY_ID)),
//                        "" + cursor.getString(cursor.getColumnIndex(FavDB.FAVORITE_STATUS))
//                ));
//
//            }
//        } finally {
//            if (cursor != null && cursor.isClosed())
//                cursor.close();
//            db.close();
//        }
//    }
//
//}

//
//
//package com.feke.esl1;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.drawable.BitmapDrawable;
//import android.widget.ImageView;
//
//import java.io.File;
//import java.io.FileOutputStream;
//
//public class Download {
//    public static String save(Context context, String str, ImageView imageView) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(context.getFilesDir().getPath());
//        sb.append(context.getPackageName());
//        String str2 = "";
//        sb.append(str2);
//        String sb2 = sb.toString();
//        StringBuilder sb3 = new StringBuilder();
//        sb3.append(sb2);
//        sb3.append("/ESL");
//        File file = new File(sb3.toString());
//        if (!file.exists()) {
//            file.mkdir();
//            System.out.println("\n\nThis is file");
//            System.out.println(file.toString() + "\n\n");
//        }
//        StringBuilder sb4 = new StringBuilder();
//        sb4.append(file.getAbsolutePath());
////        sb4.append("/thumb");
//        File file2 = new File(sb4.toString());
//        if (!file2.exists()) {
//            file2.mkdir();
//            System.out.println("\n\nThis is file2");
//            System.out.println(file2.toString() + "\n\n");
//        }
//        StringBuilder sb5 = new StringBuilder();
//        sb5.append(getPureFileName(str));
//        sb5.append(".jpg");
//        File file3 = new File(file2, sb5.toString());
//        try {
//            Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
//            FileOutputStream fileOutputStream = new FileOutputStream(file3);
//            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
//            fileOutputStream.flush();
//            fileOutputStream.close();
//            System.out.println("\n\nThis is file3");
//            System.out.println(file3.getAbsolutePath() + "\n\n");
//            return file3.getAbsolutePath();
//        } catch (Exception unused) {
//            System.out.println("\n\nThis is exception");
//            System.out.println(unused + "\n\n");
//            return str2;
//        }
//    }
//
//    public static String getPureFileName(String str) {
//        String str2 = "";
//        return str.replace("/", str2).replace("\\", "_").replace(":", str2).replace("*", str2).replace("\"", str2).replace("<", str2).replace(">", str2).replace("|", str2).replace("?", str2);
//    }
//}
