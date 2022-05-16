package com.example.harmony.ui.PersonInformation;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harmony.Main;
import com.example.harmony.MainPageActivity;
import com.example.harmony.R;
import com.example.harmony.ui.MyAccount.Account;
import com.example.harmony.ui.MyPoints.MyPoints;

public class PersonInformationFragment extends Fragment {


    private PersonInformationViewModel mViewModel;
    //private Button b1;
    private EditText editText;
    EditText email;
    EditText name;
    Button Back;
    Button Done;


    public static PersonInformationFragment newInstance() {
        return new PersonInformationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.personinformation, container, false);

        editText=rootView.findViewById(R.id.Name);
        email =  rootView.findViewById(R.id.email);
        name = rootView.findViewById(R.id.Name);
        Back = rootView.findViewById(R.id.Back);
        Done = rootView.findViewById(R.id.Done);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.setText(editText.getText());
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new Account());
                fr.commit();
            }
        });

        Button button2=(Button)rootView.findViewById(R.id.Back);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new Account());
                fr.commit();
            }
        });

        Button button3=(Button)rootView.findViewById(R.id.Done);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new MyPoints());
                fr.commit();
            }
        });



        return rootView;



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PersonInformationViewModel.class);
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<CharSequence>() {
            @Override
            public void onChanged(CharSequence charSequence) {
                editText.setText(charSequence);
            }
        });

    }


    public void on(FragmentManager supportFragmentManager, String personInformationFragment) {
    }
}