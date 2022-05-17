package com.example.harmony.ui.faq;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.harmony.R;

public class FAQFragment extends Fragment {

    private FAQViewModel mViewModel;

    TextView faq;
    TextView policy;
    TextView cancel;
    TextView offer;
    TextView gift;
    TextView rules;
    TextView rules1;
    TextView rules2;
    TextView rules3;
    TextView rules4;
    TextView pregnant;
    TextView pillow;
    TextView parking;
    TextView park;
    TextView students;
    TextView stud;
    Button Home;
    View view;

    public static FAQFragment newInstance() {
        return new FAQFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f_a_q, container, false);

        faq = view.findViewById(R.id.faq);
        policy = view.findViewById(R.id.policy);
        cancel = view.findViewById(R.id.cancel);
        offer = view.findViewById(R.id.offer);
        gift = view.findViewById(R.id.gift);
        rules = view.findViewById(R.id.rules);
        rules1 = view.findViewById(R.id.rules1);
        rules2 = view.findViewById(R.id.rules2);
        rules3 = view.findViewById(R.id.rules3);
        rules4 = view.findViewById(R.id.rules4);
        pregnant = view.findViewById(R.id.pregnant);
        pillow = view.findViewById(R.id.pillow);
        parking = view.findViewById(R.id.parking);
        park = view.findViewById(R.id.park);
        students = view.findViewById(R.id.students);
        stud = view.findViewById(R.id.stud);
        Home = view.findViewById(R.id.Home);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FAQViewModel.class);
        // TODO: Use the ViewModel
    }

}