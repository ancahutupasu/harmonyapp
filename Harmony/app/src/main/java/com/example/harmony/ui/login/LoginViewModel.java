package com.example.harmony.ui.login;

import android.app.Activity;
import android.app.Application;
import android.view.View;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;

import com.example.harmony.data.user.UserRepository;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class LoginViewModel extends AndroidViewModel {
    private final UserRepository userRepository;

    public LoginViewModel(Application app) {
        super(app);
        userRepository = UserRepository.getInstance(app);
    }

    public void loginAccount(Activity activity, String email, String password) {
        userRepository.loginAccount(activity, email, password);
    }

    public void setSignInPressed(Boolean isSignInPressed) {
        userRepository.setSignInPressed(isSignInPressed);
    }

    public void forgotPassword(View view){
        userRepository.forgotPassword(view);
    }

    public void firebaseAuthWithGoogle(boolean isRegister, GoogleSignInAccount account, FragmentActivity activity) {
        userRepository.firebaseAuthWithGoogle(isRegister,account,activity);
    }
}