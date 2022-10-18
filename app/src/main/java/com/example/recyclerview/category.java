package com.example.recyclerview;

import java.util.List;

public class category {

    private  String nameCategory;
    private List<food> foods;

    public category(String nameCategory, List<food> foods) {
        this.nameCategory = nameCategory;
        this.foods = foods;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<food> getFoods() {
        return foods;
    }

    public void setFoods(List<food> foods) {
        this.foods = foods;
    }
}
