package com.example.harmony.data.user;

import android.app.Activity;
import android.app.Application;
import android.view.View;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.harmony.data.DAO.UserDAO;
import com.example.harmony.model.user.User;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseUser;

public class UserRepository {
    private static UserRepository instance;
    private static UserDAO userDAO;

    private UserRepository(Application app) {
        userDAO = UserDAO.getInstance(app);
    }


    public static UserRepository getInstance(Application app) {
        if (instance == null) {
            instance = new UserRepository(app);
        }
        return instance;
    }

    public LiveData<Boolean> getSignInPressed() {
        return userDAO.getSignInPressed();
    }

    public void setSignInPressed(Boolean isSignInPressed) {
        userDAO.setSignInPressed(isSignInPressed);
    }

    public LiveData<String> getAuthenticationMessage() {
        return userDAO.getAuthenticationMessage();
    }

    public LiveData<Boolean> getProgressBar() {
        return userDAO.getProgressBar();
    }

    public LiveData<FirebaseUser> getCurrentUser() {
        return userDAO.getCurrentUser();
    }

    public LiveData<Boolean> getSignOut() {
        return userDAO.getSignOut();
    }

    public void signOut() {
        userDAO.signOut();
    }

    public void registerAccount(Activity activity, String email, String password) {
        userDAO.registerAccount(activity, email, password);
    }

    public void loginAccount(Activity activity, String email, String password) {
        userDAO.loginAccount(activity, email, password);
    }

    public void forgotPassword(View view) {
        userDAO.forgotPassword(view);
    }

    public MutableLiveData<Boolean> isEmailVerified() {
        return userDAO.isEmailVerified();
    }

    public LiveData<User> getUser() {
        return userDAO.getUser();
    }

    public void verifyEmail() {
        userDAO.verifyEmail();
    }

    public void setUser(String id) {
        userDAO.setUser(id);
    }

    public void updateUserInformation(String userName, String fullName, String phone, String streetAddress, String numberStreet) {
        userDAO.updateUserInformation(userName,fullName,phone,streetAddress,numberStreet);
    }

    public void updateUser(String column, Object object)
    {
        userDAO.updateUser(column,object);
    }

    public User getUserModal(String id)
    {
        return userDAO.getUserModal(id);
    }

    public void firebaseAuthWithGoogle(boolean isRegister, GoogleSignInAccount account, FragmentActivity activity) {
        userDAO.firebaseAuthWithGoogle(isRegister,account, activity);
    }

    public void setBackPressed(Boolean isBackInPressed) {
    }

    public void setNumberPressed(Boolean isNumberPressed) {
    }

    public void setEmailPressed(Boolean isEmailPressed) {
    }

    public void setFacebookPressed(Boolean isFacebookPressed) {
    }

    public void setMapPressed(Boolean isMapPressed) {
    }
}
