package com.feke.esl1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.feke.esl1.favorite.FavDB;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import pl.droidsonroids.gif.GifDrawable;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> implements Filterable {

    private List<LearnItem> learnItems;
    private List<LearnItem> learnItemsAll;
    private Context context;
    private FavDB favDB;



    public SearchAdapter(List<LearnItem> learnItems, Context context) {
        this.learnItems = learnItems;
        this.context = context;
        this.learnItemsAll = new ArrayList<>(learnItems);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        favDB = new FavDB(context);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custome_list_view,
                parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        LearnItem learnItem = learnItems.get(position);
        readCursorData(learnItem, holder);

        holder.txtName.setText(learnItem.getName());
//        holder.description.setText(learnItem.getDescName());
        holder.descName.setText(learnItem.getDescName());
        holder.descTip.setText(learnItem.getDescTip());
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

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {

        //Runs in background
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            List<LearnItem> filteredList = new ArrayList<>();
            if (constraint.toString().isEmpty()){
                filteredList.addAll(learnItemsAll);
            }else{
                for (LearnItem learnItem : learnItemsAll){
                    if (learnItem.getTitle().toLowerCase().contains(constraint.toString().toLowerCase())
                            || learnItem.getDescName().toLowerCase().contains(constraint.toString().toLowerCase())){
                        filteredList.add(learnItem);
                    }
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;

            return filterResults;
        }

        //runs in ui elements
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            learnItems.clear();
            learnItems.addAll((Collection<? extends LearnItem>) results.values);
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView description;
        TextView descName;
        TextView descTip;
        Button playBtn;
        Button favBtn;
        Button downArrowBtn;
        ConstraintLayout expandableView;
        CardView cardView;
        ImageView imageView;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            txtName = itemView.findViewById(R.id.name);
//            description = itemView.findViewById(R.id.description);
            descName = itemView.findViewById(R.id.descName);
            descTip = itemView.findViewById(R.id.descTip);
            favBtn = itemView.findViewById(R.id.favBtn);
            playBtn = itemView.findViewById(R.id.playBtn);
            downArrowBtn = itemView.findViewById(R.id.downplayBtn);
            expandableView = itemView.findViewById(R.id.expandableView);
            cardView = itemView.findViewById(R.id.cardView);

            playBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable instanceof Animatable) {
                        if (((Animatable) drawable).isRunning()) {
                            ((Animatable) drawable).stop();
                            playBtn.setText(R.string.play_btn);
                        } else {
                            ((Animatable) drawable).start();
                            playBtn.setText("Stop");
                        }
                    } else {
                        playBtn.setVisibility(View.GONE);
                        Toast.makeText(context, "This can not Animate", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            downArrowBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (expandableView.getVisibility() == View.GONE) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        }
                        expandableView.setVisibility(View.VISIBLE);
                        downArrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                    } else {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        }
                        expandableView.setVisibility(View.GONE);
                        downArrowBtn.setBackgroundResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                    }
                }
            });
            favBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    LearnItem learnItem = learnItems.get(position);
                    if (learnItem.getFavStatus().equals("0")) {
                        learnItem.setFavStatus("1");
                        favDB.updateFavorite(learnItem.getkey_id(), learnItem.getFavStatus());
                        favBtn.setBackgroundResource(R.drawable.ic_favorite_red_24dp);
                    } else {
                        learnItem.setFavStatus("0");
                        favDB.removeFavoriteById(learnItem.getkey_id());
                        favBtn.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);
                    }
                }
            });
        }
    }



    private void readCursorData(LearnItem learnItem, ViewHolder viewHolder) {
        Cursor cursor = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
            cursor = favDB.readDataById(learnItem.getkey_id());
        } else {
            Toast.makeText(context, "Your android version does not match", Toast.LENGTH_SHORT).show();
        }
//        Cursor cursor = favDB.readDataById(key_id[0]);
        SQLiteDatabase db = favDB.getReadableDatabase();

        try {
            while (cursor.moveToNext()) {
                String item_fav_status = cursor.getString(cursor.getColumnIndex(FavDB.FAVORITE_STATUS));
                learnItem.setFavStatus(item_fav_status);

                //check favorite status
                if (item_fav_status != null && item_fav_status.equals("1")) {
                    viewHolder.favBtn.setBackgroundResource(R.drawable.ic_favorite_red_24dp);
                } else if (item_fav_status != null && item_fav_status.equals("0")) {
                    viewHolder.favBtn.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);
                }
            }
        } finally {
            if (cursor != null && cursor.isClosed())
                cursor.close();
            db.close();
        }
    }
}
