package com.example.harmony.ui.MyAccount;

import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.harmony.ui.PersonInformation.PersonInformationFragment;
import com.example.harmony.R;
import com.example.harmony.ui.Bookings.BookingsFragment;
import com.example.harmony.ui.MyPoints.MyPoints;

public class Account extends Fragment {

    private AccountViewModel mViewModel;
    private Button button;

    public static Account newInstance() {
        return new Account();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.account, container, false);

        //FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();

        //fragmentTransaction.add(R.id.container,new PersonInformationFragment());
        //fragmentTransaction.commit();

        Button button=(Button)rootView.findViewById(R.id.PersonInformation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new PersonInformationFragment());
                fr.commit();
            }
        });
        Button button1=(Button)rootView.findViewById(R.id.MyPoints);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new MyPoints());
                fr.commit();
            }
        });

        Button button2=(Button)rootView.findViewById(R.id.Bookings);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new BookingsFragment());
                fr.commit();
            }
        });
        Button button3=(Button)rootView.findViewById(R.id.Subscriptions);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new PersonInformationFragment());
                fr.commit();
            }
        });
        Button button4=(Button)rootView.findViewById(R.id.Logout);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.container,new Account());
                fr.commit();
            }
        });
       // button= rootView.findViewById(R.id.PersonInformation);
       // button.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View view) {
              //  Toast.makeText(getActivity(),"Hey",Toast.LENGTH_SHORT);
           // }
        //});
        return rootView;



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AccountViewModel.class);



    }

}

