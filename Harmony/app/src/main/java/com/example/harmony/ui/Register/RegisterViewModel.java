package com.example.harmony.ui.Register;

import android.app.Activity;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.review.ReviewRepository;
import com.example.harmony.data.user.UserRepository;

public class RegisterViewModel extends ViewModel {

    private UserRepository userRepository;


    public RegisterViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}