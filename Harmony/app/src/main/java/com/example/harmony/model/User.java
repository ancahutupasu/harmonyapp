package com.example.harmony.model;


import java.util.ArrayList;


public class User {

    private String email, password, type;
    private UserDetails userDetails;
    private int points;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
        userDetails = new UserDetails();
        points = 0;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
