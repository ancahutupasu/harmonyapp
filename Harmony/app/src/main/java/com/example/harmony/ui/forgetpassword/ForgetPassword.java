package com.example.harmony.ui.forgetpassword;

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
import android.widget.EditText;

import com.example.harmony.R;
import com.example.harmony.ui.PersonInformation.PersonInformationFragment;

public class ForgetPassword extends Fragment {

    EditText email;

    public static ForgetPassword newInstance() {
        return new ForgetPassword();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forgetpassword, container, false);
        email =  view.findViewById(R.id.email);

        Button button4=(Button)view.findViewById(R.id.Confirm);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new ForgetPassword());
                fr.commit();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ForgetPasswordViewModel mViewModel = new ViewModelProvider(this).get(ForgetPasswordViewModel.class);

    }


}