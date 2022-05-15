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
import android.widget.ImageView;
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

        Button button1 = findViewById(R.id.editPackageAndPrice1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Package1.class);
                startActivity(intent);
            }
        });


        Button button2 = findViewById(R.id.editPackageNr2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Package2.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.editPackageNr3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Package3.class);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.editPackageNr4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Package4.class);
                startActivity(intent);
            }
        });

        //images
        ImageView imageView1=(ImageView) findViewById(R.id.imageView3);
        imageView1.setImageResource(R.mipmap.image3);
        ImageView imageView2= (ImageView) findViewById(R.id.imageView4);
        imageView2.setImageResource(R.mipmap.ic_launcher_foreground);
        ImageView imageView3= (ImageView) findViewById(R.id.imageView5);
        imageView3.setImageResource(R.mipmap.image8);
        ImageView imageView4= (ImageView) findViewById(R.id.imageView6);
        imageView4.setImageResource(R.mipmap.image7);




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