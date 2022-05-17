package com.example.harmony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.harmony.ui.MyPoints.MyPointsViewModel;

public class Main extends AppCompatActivity {

    /*private PersonInformationViewModel personViewModel;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

       /* Button button=findViewById(R.id.Id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PersonInformationFragment person=new PersonInformationFragment();
                person.on(getSupportFragmentManager(),"PersonInformationFragment");
            }
        });

        getSupportFragmentManager().beginTransaction()
                .add(R.id.Id,new PersonInformationFragment())
                .commit();

*/
    }
}