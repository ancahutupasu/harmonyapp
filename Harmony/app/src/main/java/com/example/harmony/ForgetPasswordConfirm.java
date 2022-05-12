package com.example.harmony;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ForgetPasswordConfirm extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password_confirm);



        Button button = findViewById(R.id.Submit);
        textView = findViewById(R.id.email);
        button.setOnClickListener(v -> {
            String result = textView.getText().toString();
            Intent intent = new Intent(this,Login.class);
            intent.putExtra("Result", result);
                    setResult(Activity.RESULT_OK, intent);
                    finish();
            //startActivity(intent);



        });
    }
}