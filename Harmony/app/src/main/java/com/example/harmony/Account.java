package com.example.harmony;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Account extends Fragment {

    private AccountViewModel mViewModel;
    private Button button;

    public static Account newInstance() {
        return new Account();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_fragment_account, container, false);

       // button= rootView.findViewById(R.id.PersonInformation);
       // button.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
              //  Toast.makeText(getActivity(),"Hey",Toast.LENGTH_SHORT);
           // }
        //});
        return rootView;

    }


    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AccountViewModel.class);
        // TODO: Use the ViewModel
    }*/

}

