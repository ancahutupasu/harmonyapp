package com.example.harmony.ui.Subscription;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.user.UserRepository;

public class SubscriptionsViewModel extends ViewModel {
    private final UserRepository userRepository;

    public SubscriptionsViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}