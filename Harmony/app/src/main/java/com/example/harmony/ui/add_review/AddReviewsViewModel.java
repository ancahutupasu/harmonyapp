package com.example.harmony.ui.add_review;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.harmony.data.user.UserRepository;
import com.example.harmony.data.review.ReviewRepository;
import com.example.harmony.model.user.User;
import com.google.firebase.auth.FirebaseUser;

public class AddReviewsViewModel extends AndroidViewModel {

    private ReviewRepository reviewRepository;
    private UserRepository userRepository;

    public AddReviewsViewModel(@NonNull Application application) {
        super(application);
        reviewRepository = ReviewRepository.getInstance(application);
        userRepository = UserRepository.getInstance(application);
    }

    public void setAuthenticationMessage(boolean thread, String message) {
        reviewRepository.setAuthenticationMessage(thread, message);
    }

    public LiveData<FirebaseUser> getCurrentUser()
    {
        return reviewRepository.getCurrentUser();
    }

    public LiveData<User> getUser()
    {
        return userRepository.getUser();
    }

    public void updateUser(String column, Object object)
    {
        userRepository.updateUser(column,object);
    }

    public void setUser(String id)
    {
        userRepository.setUser(id);
    }
}