package com.example.harmony.ui.MyPoints;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harmony.R;

public class MyPoints extends Fragment {

    private MyPointsViewModel mViewModel;


    public static MyPoints newInstance() {
        return new MyPoints();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mypoints, container, false);
        /*mViewModel=new MyPointsViewModel();
        Log.i("MyPoints","Main view model ois initialized");*/
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MyPointsViewModel.class);
        // TODO: Use the ViewModel
    }

}