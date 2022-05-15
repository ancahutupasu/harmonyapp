package com.example.harmony;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {
    RadioButton radioGroupPayment;
    RadioGroup radioGroup;
    Button buttonContPay;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_payment);
            radioGroup = (RadioGroup)findViewById(R.id.radioGroupPayment);

    }

    public void onclickMethod(View v) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioGroupPayment = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(Payment.this, "Nothing selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Payment.this, radioGroupPayment.getText(), Toast.LENGTH_SHORT).show();
        }

        Button buttonContPay = findViewById(R.id.buttonContPay);
        buttonContPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThankYou.class);
                startActivity(intent);
            }
        });
    }
}