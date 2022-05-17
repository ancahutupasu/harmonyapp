package com.example.harmony.ui.before_checkout;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.harmony.R;

public class BeforeCheckoutPage extends Fragment {

    private BeforeCheckoutPageViewModel mViewModel;

    Button buttonLog;
    Button buttonSignup;
    EditText persName;
    EditText phone1;
    EditText email1;
    TextView terms;
    TextView cancelText;
    CheckBox agreeTerms;
    Button cont;
    View view;


    public static BeforeCheckoutPage newInstance() {
        return new BeforeCheckoutPage();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_before_checkout_page, container, false);

        buttonLog = view.findViewById(R.id.buttonLog);
        buttonSignup = view.findViewById(R.id.buttonSignup);
        persName = view.findViewById(R.id.persName);
        phone1 = view.findViewById(R.id.phone1);
        email1 = view.findViewById(R.id.email1);
        terms = view.findViewById(R.id.terms);
        cancelText = view.findViewById(R.id.cancelText);
        agreeTerms = view.findViewById(R.id.agreeTerms);
        cont = view.findViewById(R.id.cont);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BeforeCheckoutPageViewModel.class);

       /* buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonLog.navigate.(R.id.LoginFragment);

            }
        });
        
        */
    }



}