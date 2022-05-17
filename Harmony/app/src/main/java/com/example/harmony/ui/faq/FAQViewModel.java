package com.example.harmony.ui.faq;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.user.UserRepository;

public class FAQViewModel extends ViewModel {

    private final UserRepository userRepository;


    public FAQViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setHomePresses(Boolean isHomeInPressed){
        userRepository.setHomePressed(isHomeInPressed);
    }
}