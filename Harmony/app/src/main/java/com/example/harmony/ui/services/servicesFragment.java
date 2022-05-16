package com.example.harmony.ui.services;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.harmony.R;
import com.example.harmony.databinding.FragmentServicesBinding;


public class servicesFragment extends Fragment {

    private FragmentServicesBinding binding;
    private ServicesViewModel servicesViewModel;

    public static servicesFragment newInstance(){
        return new servicesFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ServicesViewModel servicesViewModel =
                new ViewModelProvider(this).get(ServicesViewModel.class);

        binding = FragmentServicesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        View rootView = inflater.inflate(R.layout.fragment_services, container, false);

       /*Button button1= (Button) rootView.findViewById(R.id.editPackageAndPrice1);
        button1.setOnClickListener(v -> {
            FragmentTransaction fr = getParentFragmentManager().beginTransaction();
            fr.replace(R.id.container, new servicesFragment());
            fr.commit();
        });*/
        return rootView;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}