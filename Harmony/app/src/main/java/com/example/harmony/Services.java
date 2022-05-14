package com.example.harmony;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Services extends AppCompatActivity {

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Button button = findViewById(R.id.buttonback);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainPageActivity.class);
                startActivity(intent);
            }
        });
       // SearchView searchView = findViewById(R.id.searchView);
       /* ListView listView = findViewById(R.id.listView);

        final String[] texts ={"Package nr 1", "Package nr 2", "Package nr 3", "Package nr 4"};
        adapter = new ArrayAdapter<String>(this, androidx.transition.R.layout.support_simple_spinner_dropdown_item, texts);

        //set adapter
       listView.setAdapter(adapter);

       searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String itemName =(String) parent.getItemAtPosition(position);
               switch (itemName){
                   case "Package nr 1":
                       Toast.makeText(Services.this, "Package nr 1", Toast.LENGTH_SHORT).show();
                       break;
                   case "Package nr 2":
                       Toast.makeText(Services.this, "Package nr 2", Toast.LENGTH_SHORT).show();
                       break;
                   case "Package nr 3":
                       Toast.makeText(Services.this, "Package nr 3", Toast.LENGTH_SHORT).show();
                       break;
                   case "Package nr 4":
                       Toast.makeText(Services.this, "Package nr 4", Toast.LENGTH_SHORT).show();
                       break;
               }
           }
       }); */


        }

// --Commented out by Inspection START (12/05/2022 21.39):
//        public boolean onQueryTextSubmit(String query){
//        return false;
//        }
// --Commented out by Inspection STOP (12/05/2022 21.39)


// --Commented out by Inspection START (12/05/2022 21.40):
//    public boolean onQueryTextChange(String newText){
//        adapter.getFilter().filter(newText);
//        return false;
//        }
// --Commented out by Inspection STOP (12/05/2022 21.40)


    }



//}