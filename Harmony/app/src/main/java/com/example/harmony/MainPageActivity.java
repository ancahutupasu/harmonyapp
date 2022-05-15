package com.example.harmony;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainPageActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
 // adding slideshow

    // creating object of ViewPager
    ViewPager mViewPager;

    // images array
    int[] images = {R.mipmap.image6, R.mipmap.image7, R.mipmap.image5, R.mipmap.image8, R.mipmap.ic_launcher};

    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

       /* ImageView imageView1=(ImageView) findViewById(R.id.imageView3);
        imageView1.setImageResource(R.mipmap.opening);*/



        // drawer layout instance to toggle the menu icon to open
        // drawer and back button to close drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // slideshow code



        // Initializing the ViewPager Object
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);

        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(MainPageActivity.this, images);



        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);

        //whatsApp button

       /* Button button1 = findViewById(R.id.whatsAppBtn);
        button1.setOnClickListener(v -> {
            try {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                Intent i = Intent.createChooser(intent, null);
                startActivity(i);
            }
            catch (Exception e){
                Toast.makeText(MainPageActivity.this, "WhatsApp not installed", Toast.LENGTH_SHORT).show();
            }
        });*/

    }

    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        int id= item.getItemId();
        if (id==R.id.miServices){
            Intent intent = new Intent(MainPageActivity.this, Services.class);
            startActivity(intent);
            return true;
        }
        else
            if (id==R.id.miAbout){
                Intent intent = new Intent(MainPageActivity.this, aboutUsFragment.class);
                startActivity(intent);
            return true;
        }
            else
            if (id==R.id.miHome) {
                Intent intent = new Intent(MainPageActivity.this, MainPageActivity.class);
                startActivity(intent);
                return true;
            }

            else
            if (id==R.id.miOffers) {
                Intent intent = new Intent(MainPageActivity.this, Offers.class);
                startActivity(intent);
                return true;
            }



        return super.onOptionsItemSelected(item);
    }




}
