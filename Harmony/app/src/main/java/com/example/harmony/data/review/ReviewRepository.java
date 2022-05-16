package com.example.harmony.data.review;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.harmony.data.DAO.ReviewDAO;
import com.example.harmony.data.DAO.UserDAO;
import com.example.harmony.model.review.Review;
import com.example.harmony.model.user.User;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

public class ReviewRepository {
    private ReviewDAO reviewDAO;
    private UserDAO userDAO;
    private static ReviewRepository instance;

    public static ReviewRepository getInstance(Application app) {
        if(instance == null) {
            instance = new ReviewRepository(app);
        }
        return instance;
    }

    public ReviewRepository(Application application)
    {
        reviewDAO = ReviewDAO.getInstance(application);
        userDAO = UserDAO.getInstance(application);
    }

    public void setAuthenticationMessage(boolean thread, String message)
    {
        userDAO.setAuthenticationMessage(thread,message);
    }

//    public MutableLiveData<Review> getReviewLiveData() {
//        return reviewDAO.getReviewLiveData();
//    }
//
//    public void setReviewLiveData(Review review)
//    {
//        reviewDAO.setReviewLiveData(review);
//    }
//
//    public MutableLiveData<ArrayList<Review>> getReviewsLiveData()
//    {
//        return reviewDAO.getReviewsLiveData();
//    }
//
//    public MutableLiveData<Boolean> getProgressBar()
//    {
//        return reviewDAO.getProgressBar();
//    }

    public LiveData<FirebaseUser> getCurrentUser()
    {
        return userDAO.getCurrentUser();
    }

//    public User getUserModal(String id)
//    {
//        return userDAO.getUserModal(id);
//    }
}
