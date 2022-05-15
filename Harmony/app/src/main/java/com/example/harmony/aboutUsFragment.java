package com.example.harmony;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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
import android.widget.ImageView;

public class aboutUsFragment extends Fragment {

    private AboutUsViewModel mViewModel;

    public static aboutUsFragment newInstance()
    {
        return new aboutUsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_about_us, container, false);


       Button button = root.findViewById(R.id.buttonBack2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              updateDetail();

            }
        });

        return root;


    }

    public void updateDetail(){
        Intent intent = new Intent(getActivity(), MainPageActivity.class);
        startActivity(intent);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AboutUsViewModel.class);
        // TODO: Use the ViewModel



    }

}