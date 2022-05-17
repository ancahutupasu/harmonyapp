package com.example.harmony.ui.contact_us;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.user.UserRepository;

public class ContactUsViewModel extends ViewModel {
    private final UserRepository userRepository;

    public ContactUsViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setNumberPressed(Boolean isNumberPressed) {
        userRepository.setNumberPressed(isNumberPressed);
    }

    public void setEmailPressed(Boolean isEmailPressed) {
        userRepository.setEmailPressed(isEmailPressed);
    }

    public void setFacebookPressed(Boolean isFacebookPressed) {
        userRepository.setFacebookPressed(isFacebookPressed);
    }

    public void setMapPressed(Boolean isMapPressed) {
        userRepository.setMapPressed(isMapPressed);
    }

}