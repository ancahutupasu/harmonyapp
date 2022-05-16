package com.example.harmony.ui.Register;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
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
import com.example.harmony.ui.reviews.ReviewsViewModel;

public class Register extends Fragment {

    private RegisterViewModel mViewModel;
    View root;

    public static Register newInstance() {
        return new Register();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);
        root = inflater.inflate(R.layout.fragment_register, container, false);

        Button button = root.findViewById(R.id.Register);
        button.setOnClickListener(view -> {
            Fragment fragment = new Register();
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.Register, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        });

        return root;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);


    }

}