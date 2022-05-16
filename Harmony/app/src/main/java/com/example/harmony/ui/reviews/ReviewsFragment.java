package com.example.harmony.ui.reviews;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.harmony.R;
import com.example.harmony.ui.add_review.AddReviewsFragment;

public class ReviewsFragment extends Fragment {

    private ReviewsViewModel mViewModel;
    View root;

    public static ReviewsFragment newInstance() {
        return new ReviewsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mViewModel = new ViewModelProvider(this).get(ReviewsViewModel.class);
        root = inflater.inflate(R.layout.fragment_reviews, container, false);

        Button button = root.findViewById(R.id.bt_add);
        button.setOnClickListener(view -> {
            Fragment fragment = new AddReviewsFragment();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.add_review, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        });

        return root;
    }



}