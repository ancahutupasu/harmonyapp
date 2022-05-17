package com.example.harmony.ui.PersonInformation;

import androidx.lifecycle.ViewModel;

import com.example.harmony.data.user.UserRepository;

public class PersonInformationViewModel extends ViewModel {

    private final UserRepository userRepository;

    public PersonInformationViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void setBackPressed(Boolean isBackInPressed) {
        userRepository.setBackPressed(isBackInPressed);
    }

}