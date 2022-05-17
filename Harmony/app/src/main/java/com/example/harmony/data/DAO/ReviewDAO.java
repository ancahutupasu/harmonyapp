package com.example.harmony.data.DAO;

import static android.content.ContentValues.TAG;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.harmony.model.review.Review;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.Source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ReviewDAO {
    private static ReviewDAO instance;
    private final UserDAO userDAO;
    private ArrayList<Review> reviewsArrayList = new ArrayList<>();

    private FirebaseFirestore firebaseDatabase;

    private MutableLiveData<Boolean> getProgressBar = new MutableLiveData<>(false);
    private MutableLiveData<ArrayList<Review>> reviewsLiveData = new MutableLiveData<>(new ArrayList<>());
    private MutableLiveData<Review> review = new MutableLiveData<>();
    private MutableLiveData<String> hotelNameLiveData = new MutableLiveData<>(null);
    private MutableLiveData<Boolean> isLikePressed = new MutableLiveData<>(false);

    public ReviewDAO(Application app) {
        firebaseDatabase = FirebaseFirestore.getInstance();
        userDAO = UserDAO.getInstance(app);

        //getReviews();
    }

    public static ReviewDAO getInstance(Application application) {
        if (instance == null) {
            instance = new ReviewDAO(application);
        }
        return instance;
    }

   /* public MutableLiveData<Boolean> getProgressBar() {
        return getProgressBar;
    }

    public MutableLiveData<ArrayList<Review>> getReviewsLiveData() {
        return reviewsLiveData;
    }

    public MutableLiveData<Review> getReviewLiveData() {
        return review;
    }

    public MutableLiveData<Boolean> getIsLikePressed() {
        return isLikePressed;
    }

    public void setIsLikePressed(boolean statement) {
        this.isLikePressed.postValue(statement);
    }

    public void setReviewLiveData(Review review) {
        this.review.setValue(review);
    }


//    public Review getReview(String hotelName, String userUID) {
//        ArrayList<Review> reviews = getReviews();
//        for(Review reviewItem : reviews)
//        {
//            if(reviewItem.getHotelName().equals(hotelName) && reviewItem.getUserUID().equals(userUID))
//            {
//                return reviewItem;
//            }
//        }
//        return null;
//    }

    public void getReviews() {
        getHotels();
        firebaseDatabase.collection("hotels")
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            Hotel hotel = document.toObject(Hotel.class);
                            hotelsArrayList.add(hotel);
                            hotelsLiveData.postValue(hotelsArrayList);
                            firebaseDatabase.collection("hotels").document(hotel.getName()).
                                    get().addOnCompleteListener(taskListener -> {
                                        if(taskListener.isSuccessful())
                                        {
                                            reviewsArrayList.addAll(hotel.getReviews());
                                            reviewsLiveData.postValue(reviewsArrayList);
                                        }
                                    });
                        }
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }
                });
    }*/
}
