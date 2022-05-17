package com.example.harmony.ui.forgetpassword;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.user.UserRepository;

public class ForgetPasswordViewModel extends ViewModel {
    private UserRepository userRepository;


    public ForgetPasswordViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}