package com.example.recyclerview;

public class food {
    private int image;
    private String title;
    private int type;

    public food(int image, String title, int type) {
        this.image = image;
        this.title = title;
        this.type = type;
    }

    public food(int comchien, String cơm_chiên) {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
