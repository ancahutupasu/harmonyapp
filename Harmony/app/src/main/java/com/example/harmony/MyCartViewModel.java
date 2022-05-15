package com.example.harmony;

import android.view.View;

import androidx.lifecycle.ViewModel;

public class MyCartViewModel extends ViewModel {

    public static MyCartFragment newInstance() {
        return new MyCartFragment();
    }


}