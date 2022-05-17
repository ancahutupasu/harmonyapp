package com.example.harmony.ui.add_review;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.harmony.R;

import java.util.ArrayList;
import java.util.Random;

public class AddReviewsFragment extends Fragment {

    private AddReviewsViewModel mViewModel;

    TextView reviewDescription;
    RatingBar ratingReviewBar;
    Button addReview;
    Button cancelReview;

    public static AddReviewsFragment newInstance() {
        return new AddReviewsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_reviews, container, false);

        reviewDescription = view.findViewById(R.id.inputReviewDescription);
        ratingReviewBar = view.findViewById(R.id.ratingReviewBar);
        addReview = view.findViewById(R.id.addReviewButton);
        cancelReview = view.findViewById(R.id.cancelReviewButton);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddReviewsViewModel.class);

        addReview.setOnClickListener(v -> {
            if (mViewModel.getCurrentUser().getValue() != null) { }
        });
    }

}