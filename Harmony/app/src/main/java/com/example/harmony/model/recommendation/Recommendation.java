package com.example.harmony.model.recommendation;

public class Recommendation {
    private String title, description;

    public Recommendation(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
