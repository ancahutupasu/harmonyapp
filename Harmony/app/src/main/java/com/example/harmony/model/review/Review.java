package com.example.harmony.model.review;

public class Review {
    private String name, review;

    public Review(String name, String review) {
        this.name = name;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
