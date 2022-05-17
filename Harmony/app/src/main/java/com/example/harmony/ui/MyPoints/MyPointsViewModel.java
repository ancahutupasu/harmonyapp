package com.example.harmony.ui.MyPoints;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.example.harmony.data.review.ReviewRepository;
import com.example.harmony.data.user.UserRepository;

import java.net.HttpCookie;

public class MyPointsViewModel extends ViewModel {


    private UserRepository userRepository;

    public MyPointsViewModel(){
        Log.i("MyPointsViewModel", "View Model created");
    }



}