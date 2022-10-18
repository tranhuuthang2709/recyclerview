package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;

public class categoryAdapter extends RecyclerView.Adapter<categoryAdapter.CategoryViewHolder> {
    private Context mContest;
    private List<category> mlistCategory;

    public categoryAdapter(Context mContest) {
        this.mContest = mContest;
    }
    public  void setData(List<category> list){
     this.mlistCategory = list;
     notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        category category = mlistCategory.get(position);
        if(category == null){
            return;
        }
        holder.tvNameCategory.setText(category.getNameCategory());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContest, RecyclerView.HORIZONTAL,false);
        holder.tcvfood.setLayoutManager(linearLayoutManager);

        foodAdapter foodAdapter = new foodAdapter();
        foodAdapter.setData(category.getFoods());
        holder.tcvfood.setAdapter(foodAdapter);

    }


    @Override
    public int getItemCount() {
        if (mlistCategory !=null){
            return mlistCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNameCategory;
        private RecyclerView tcvfood;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameCategory = itemView.findViewById(R.id.tv_name_category);
            tcvfood = itemView.findViewById(R.id.rcv_food);
        }
    }
}
