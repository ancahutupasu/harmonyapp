package com.example.harmony.ui.MyPoints;

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
import com.example.harmony.ui.MyAccount.Account;


public class MyPoints extends Fragment {




    public static MyPoints newInstance() {
        return new MyPoints();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.account, container, false);
        Button button5=(Button)rootView.findViewById(R.id.Points);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new Account());
                fr.commit();
            }
        });
        return inflater.inflate(R.layout.mypoints, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        MyPointsViewModel mViewModel = new ViewModelProvider(this).get(MyPointsViewModel.class);


    }

}