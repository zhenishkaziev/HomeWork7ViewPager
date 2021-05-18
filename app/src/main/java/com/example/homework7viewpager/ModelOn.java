package com.example.homework7viewpager;

public class ModelOn {
     private String title, description;
     private int imagions;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImagions() {
        return imagions;
    }

    public ModelOn(String title, String description, int imagions) {
        this.title = title;
        this.description = description;
        this.imagions = imagions;
    }
}
