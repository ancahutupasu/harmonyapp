package com.example.harmony.ui.PersonInformation;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.harmony.R;
import com.example.harmony.ui.MyAccount.Account;

public class PersonInformationFragment extends Fragment {

    private PersonInformationViewModel mViewModel;

    EditText Name;
    EditText email;
    EditText phoneNumber;
    Button Back;
    Button Done;

    public static PersonInformationFragment newInstance() {
        return new PersonInformationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        email = view.findViewById(R.id.email);
        phoneNumber = view.findViewById(R.id.phoneNumber);
        Name = view.findViewById(R.id.Name);
        Back = view.findViewById(R.id.Back);
        Done = view.findViewById(R.id.Done);

        Button button4=(Button)view.findViewById(R.id.Back);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new Account());
                fr.commit();
            }
        });
        Button button5=(Button)view.findViewById(R.id.Done);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new Account());
                fr.commit();
            }
        });

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PersonInformationViewModel.class);


    }

}