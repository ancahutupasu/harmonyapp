package com.example.harmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.harmony.ui.MyAccount.Account;

public class PersonInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_information);

        Button button = findViewById(R.id.Done);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, Account.class);
            startActivity(intent);
        });
    }
}