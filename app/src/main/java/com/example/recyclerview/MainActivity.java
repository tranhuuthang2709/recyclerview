package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvCategory;
private categoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new categoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
        private List<category> getListCategory(){
        List<category> listCategory = new ArrayList<>();
        List<food> listfood = new ArrayList<>();
        listfood.add(new food(R.drawable.comchien,"cơm chiên"));
        listfood.add(new food(R.drawable.mixao,"mì xào"));
        listfood.add(new food(R.drawable.pizza,"pizza"));
            listfood.add(new food(R.drawable.banhmi,"bánh mì"));

            listCategory.add(new category("category 1",listfood));
            listCategory.add(new category("category 2",listfood));
            listCategory.add(new category("category 3",listfood));
            listCategory.add(new category("category 4",listfood));
        return listCategory;
    }   }