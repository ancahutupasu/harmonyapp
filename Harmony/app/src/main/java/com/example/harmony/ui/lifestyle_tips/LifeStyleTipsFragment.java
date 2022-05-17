package com.example.harmony.ui.lifestyle_tips;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.harmony.R;

public class LifeStyleTipsFragment extends Fragment {

    private LifeStyleTipsViewModel mViewModel;

    public static LifeStyleTipsFragment newInstance() {
        return new LifeStyleTipsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lifestyle_tips, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LifeStyleTipsViewModel.class);
        // TODO: Use the ViewModel
    }

}