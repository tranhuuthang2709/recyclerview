package com.example.recyclerview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.FoodViewHolder> {
    private List<food> mListFood;

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private imageView imgFood;
        private Textview tvNameFood;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFood = itemView.findViewById(R.id.img_food);
            tvNameFood = itemView.findViewById(R.id.tv_name_food);
        }
    }
}
