package com.feke.esl1;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection extends AsyncTask<String, Integer, String> {

    private Context context;
    ProgressDialog mProgressDialog;
    private List<LearnItem> learnItems;

    public DatabaseConnection(Context context) {
        this.context = context;
        this.mProgressDialog = new ProgressDialog(context);
        learnItems = new ArrayList<>();
    }

    @Override
    protected String doInBackground(String... strings) {
        final String URL_SIGNS = "http://10.194.76.42/esl/my_api.php";

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

                                //adding the product to product list
                                learnItems.add(new LearnItem(
                                        signs.getString("image_location") + "",
                                        signs.getString("text") + "",
                                        signs.getString("description") + "",
                                        "Click for more",
                                        signs.getInt("sign_id") + "",
                                        "0"
                                ));
                            }

                            Toast.makeText(context, "Length is " + learnItems.size(), Toast.LENGTH_LONG).show();
                            //creating adapter object and setting it to recyclerview
//                            Adapter adapter = new Adapter(learnItems, context);
//                            recyclerView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(context, e.toString(), Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        //adding our stringrequest to queue
        Volley.newRequestQueue(context).add(stringRequest);
        return null;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialog.setMessage("Downloading");
        mProgressDialog.setIndeterminate(false);
        mProgressDialog.setMax(10);
        mProgressDialog.setCancelable(true);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mProgressDialog.show();
    }
//
//    @Override
//    protected String doInBackground(String... aurl) {
//        int count;
//        final String URL_SIGNS = "http://10.194.76.31/esl/get.php";
//        try {
//            URL url = new URL(URL_SIGNS);
//            URLConnection connection = url.openConnection();
//            connection.connect();
//            String targetFileName = "Name";//Change name and subname
//            int lengthOfFile = connection.getContentLength();
//            String esl = "esl";
//            String PATH = Environment.getExternalStorageDirectory() + "/" + esl + "/";
//            File folder = new File(PATH);
//            if (!folder.exists()) {
//                folder.mkdir();//If there is no folder it will be created.
//            }
//            InputStream input = new BufferedInputStream(url.openStream());
//            OutputStream output = new FileOutputStream(PATH + targetFileName);
//            byte data[] = new byte[1024];
//            long total = 0;
//            while ((count = input.read(data)) != -1) {
//                total += count;
//                publishProgress((int) (total * 100 / lengthOfFile));
//                output.write(data, 0, count);
//            }
//            output.flush();
//            output.close();
//            input.close();
//        } catch (Exception e) {
//        }
//        return null;
//    }

    protected void onProgressUpdate(Integer... progress) {
        mProgressDialog.setProgress(progress[0]);
        if (mProgressDialog.getProgress() == mProgressDialog.getMax()) {
            mProgressDialog.dismiss();
            Toast.makeText(context, "File Downloaded", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onPostExecute(String result) {
    }

}