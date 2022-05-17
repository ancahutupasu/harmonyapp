package com.example.harmony.ui.my_cart;

import androidx.lifecycle.ViewModelProvider;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.harmony.R;

public class MyCart extends Fragment {

    private MyCartViewModel mViewModel;

    TextView titleCard;
    RadioButton radioButtonGiftCard;
    Button buttonDeleteMyItemCard;
    Button buttonAddMyCart;
    Button buttonCheckout;
    View view;


    public static MyCart newInstance() {
        return new MyCart();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        titleCard = view.findViewById(R.id.titleCard);
        radioButtonGiftCard = view.findViewById(R.id.radioButtonGiftCard);
        buttonDeleteMyItemCard = view.findViewById(R.id.buttonDeleteMyItemCard);
        buttonAddMyCart = view.findViewById(R.id.buttonAddMyCart);
        buttonCheckout = view.findViewById(R.id.buttonCheckout);

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MyCartViewModel.class);

       /* buttonAddMyCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonAddMyCart.navigate.(R.id.services);
            }


        buttonCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            buttonCheckout.navigate(R.id.home);
            }
        });
        return view; */

    }
}

