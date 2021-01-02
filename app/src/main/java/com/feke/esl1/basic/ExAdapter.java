package com.feke.esl1.basic;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.feke.esl1.LearnItem;
import com.feke.esl1.R;
import com.feke.esl1.favorite.FavDB;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.droidsonroids.gif.GifDrawable;

public class ExAdapter extends RecyclerView.Adapter<ExAdapter.ViewHolder> {

    private String folder;
    private String[] select_ah = new String[4];
    private String[] select_en = new String[4];
    private List<LearnItem> learnItems;
    private Context context;
    private FavDB favDB;

    public static Set<String> correctAnswers;
    public static int allQuestions;


    public ExAdapter(List<LearnItem> learnItems, Context context, String folder) {
        this.learnItems = learnItems;
        this.context = context;
        this.folder = folder;
        allQuestions = learnItems.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        favDB = new FavDB(context);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custome_ex_list,
                parent, false);
        correctAnswers = new HashSet<>();

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final LearnItem learnItem = learnItems.get(position);

        SQLiteDatabase db = favDB.getReadableDatabase();
        Cursor cursor = null;
        cursor = favDB.selectRandom(folder);


        SharedPreferences pref = context.getSharedPreferences("LangSettings", Activity.MODE_PRIVATE);
        String lan = pref.getString("selected_language", "");

        int i = 0, l = 0;
        if (lan.equals("am")) {
            l = 0;
        } else if (lan.equals("en")) {
            l = 1;
        }
        while (cursor.moveToNext()) {
            String[] whi = cursor.getString(cursor.getColumnIndex(FavDB.ITEM_TITLE)).split("/");
            select_en[i] = whi[l];
//            if (i==0){
//                holder.choose1.setText(learnItem.getTitle());
//            }else if (i==1){
//                holder.choose2.setText(learnItem.getTitle());
//            }else if(i==2){
//                holder.choose3.setText(learnItem.getTitle());
//            }else{
//                holder.choose4.setText(learnItem.getTitle());
//            }
            i++;
        }
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(4) + 1;
        if (rand == 1) {
            holder.choose1.setText(learnItem.getTitle());
            holder.choose2.setText(select_en[1]);
            holder.choose3.setText(select_en[2]);
            holder.choose4.setText(select_en[3]);
        } else if (rand == 2) {
            holder.choose1.setText(select_en[0]);
            holder.choose2.setText(learnItem.getTitle());
            holder.choose3.setText(select_en[2]);
            holder.choose4.setText(select_en[3]);
        } else if (rand == 3) {
            holder.choose1.setText(select_en[0]);
            holder.choose2.setText(select_en[1]);
            holder.choose3.setText(learnItem.getTitle());
            holder.choose4.setText(select_en[3]);
        } else if (rand == 4) {
            holder.choose1.setText(select_en[0]);
            holder.choose2.setText(select_en[1]);
            holder.choose3.setText(select_en[2]);
            holder.choose4.setText(learnItem.getTitle());
        }

        holder.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int selectedId = holder.radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadio = holder.itemView.findViewById(selectedId);
                String selectedValue = selectedRadio.getText().toString();
                if (selectedValue.equals(learnItem.getTitle())) {
                    Toast.makeText(context, "Correct choose", Toast.LENGTH_LONG).show();
                    correctAnswers.add(learnItem.getTitle());
                } else {
                    Toast.makeText(context, "Wrong choose", Toast.LENGTH_LONG).show();
                }
            }
        });

        String path = learnItem.getImageResource();
        if (path.contains(".png") || path.contains(".PNG") || path.contains(".JPG") || path.contains(".jpg")) {
            holder.imageView.setImageBitmap(loadBitmapFromAssets(context, path));
        } else if (path.contains(".GIF") || path.contains(".gif")) {
            holder.imageView.setImageDrawable(loadGifDrawable(context, path));
        }

        Drawable drawable = holder.imageView.getDrawable();
        if (drawable instanceof Animatable) {
            if (((Animatable) drawable).isRunning()) {
                ((Animatable) drawable).stop();
            }
        }

    }

    public GifDrawable loadGifDrawable(Context context, String path) {
        GifDrawable gifFromAssets = null;
        try {
            gifFromAssets = new GifDrawable(context.getAssets(), path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gifFromAssets;
    }

    public Bitmap loadBitmapFromAssets(Context context, String path) {
        InputStream stream = null;
        try {
            stream = context.getAssets().open(path);
            return BitmapFactory.decodeStream(stream);
        } catch (Exception ignored) {
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (Exception ignored) {
            }
        }
        return null;
    }


    @Override
    public int getItemCount() {
        return learnItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        RadioButton choose1, choose2, choose3, choose4;
        RadioGroup radioGroup;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            radioGroup = itemView.findViewById(R.id.chooseRadioGroup);
            choose1 = itemView.findViewById(R.id.choose1);
            choose2 = itemView.findViewById(R.id.choose2);
            choose3 = itemView.findViewById(R.id.choose3);
            choose4 = itemView.findViewById(R.id.choose4);


        }
    }


}
