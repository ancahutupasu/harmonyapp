package com.example.harmony.ui.contact_us;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.harmony.R;
import com.google.android.gms.maps.MapView;

public class ContactUsFragment extends Fragment {

    private ContactUsViewModel mViewModel;

    TextView contact;
    TextView location;
    EditText street;
    EditText city;
    EditText phone;
    EditText mail;
    TextView opening;
    TextView Monday;
    TextView tuesday;
    TextView wednesday;
    TextView thursday;
    TextView friday;
    TextView saturday;
    TextView sunday;
    ImageButton number;
    ImageButton Email;
    ImageButton facebook;
    MapView map;
    View view;

    public static ContactUsFragment newInstance() {
        return new ContactUsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_contact_us, container, false);

        contact = view.findViewById(R.id.contact);
        location = view.findViewById(R.id.location);
        street = view.findViewById(R.id.street);
        city = view.findViewById(R.id.city);
        phone = view.findViewById(R.id.phone);
        mail = view.findViewById(R.id.mail);
        opening = view.findViewById(R.id.opening);
        Monday = view.findViewById(R.id.Monday);
        tuesday = view.findViewById(R.id.tuesday);
        wednesday = view.findViewById(R.id.wednesday);
        thursday = view.findViewById(R.id.thursday);
        friday = view.findViewById(R.id.friday);
        saturday = view.findViewById(R.id.saturday);
        sunday = view.findViewById(R.id.sunday);
        number = view.findViewById(R.id.number);
        Email = view.findViewById(R.id.Email);
        facebook = view.findViewById(R.id.facebook);
        map = view.findViewById(R.id.map);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ContactUsViewModel.class);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+4591994163"));
                startActivity(intent);
            }
        });

        Email.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("https://mail.google.com/"));
                startActivity(intent);
            }
        }));

        facebook.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("https://www.facebook.com/massagebyelena"));
                startActivity(intent);
            }
        }));

        map.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("https://goo.gl/maps/V6XE5YLL22KbP7Qr6"));
                startActivity(intent);
            }
        }));


    }

}