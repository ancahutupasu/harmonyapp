package com.example.harmony.ui.MyAccount;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.user.UserRepository;

public class AccountViewModel extends ViewModel {
    private final UserRepository userRepository;

    public AccountViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}