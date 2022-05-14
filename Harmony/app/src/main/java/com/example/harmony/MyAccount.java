package com.example.harmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        Button button = findViewById(R.id.button11);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, PersonInformation.class);
            startActivity(intent);
        });


    }
}