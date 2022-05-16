package com.example.harmony;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.harmony.ui.MyAccount.Account;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.ForgetPassword);
        Button button1 = findViewById(R.id.Login);
        Button button2 = findViewById(R.id.Register);

        button.setOnClickListener(v -> {

            Intent intent = new Intent(this,ForgetPasswordConfirm.class);

            startActivity(intent);



        });

                button1.setOnClickListener(v -> {

                    Intent intent1 = new Intent(this, Account.class);

                    startActivity(intent1);
                });

        button2.setOnClickListener(v -> {

            Intent intent2 = new Intent(this, Login.class);

            startActivity(intent2);
        });


    }

}