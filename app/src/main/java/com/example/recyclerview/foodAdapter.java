package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.foodViewHoder> {
    private List<food> mfoods;
    public void setData(List<food> list){
        this.mfoods = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public foodViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        return new foodViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodViewHoder holder, int position) {

        food food =mfoods.get(position);
        if (food == null){
            return;
        }
        holder.imgfood.setImageResource(food.getImage());
        holder.tvtitle.setText(food.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mfoods != null){
            return mfoods.size();
        }
        return 0;
    }

    public class foodViewHoder extends RecyclerView.ViewHolder {

        private ImageView imgfood;
        private TextView tvtitle;

        public foodViewHoder(@NonNull View itemView) {
            super(itemView);

            imgfood = itemView.findViewById(R.id.img_food);
            tvtitle =itemView.findViewById((R.id.tv_title));
        }
    }
}