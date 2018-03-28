package com.asmaa.ok.atmfinder.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.asmaa.ok.atmfinder.Call_US;
import com.asmaa.ok.atmfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Banks extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public static String b = "null";
    public String place;


    ////////////////////////Masr
    @BindView(R.id.Masr)
    ImageView Masr;

    @OnClick(R.id.Masr)

    protected void onClickMasr() {
        b = "Masr";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }

//////////////////////Alex

    @BindView(R.id.Alex)
    ImageView Alex;

    @OnClick(R.id.Alex)

    protected void onClickAlex() {
        b = "Alex";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }


//////////////CIB

    @BindView(R.id.CIB)
    ImageView CIB;

    @OnClick(R.id.CIB)

    protected void onClickCIB() {
        b = "CIB";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }

/////////////Akary

    @BindView(R.id.Akary)
    ImageView Akary;

    @OnClick(R.id.Akary)

    protected void onClickAkary() {
        b = "Akary";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }

///////////////////////Cairo

    @BindView(R.id.Cairo)
    ImageView Cairo;

    @OnClick(R.id.Cairo)

    protected void onClickCairo() {
        b = "Cairo";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }

//////////////Ahly

    @BindView(R.id.Ahly)
    ImageView Ahly;

    @OnClick(R.id.Ahly)

    protected void onClickAhly() {
        b = "Ahly";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }

    //////////////Ahly

    @BindView(R.id.Eslamx)
    ImageView Eslamx;

    @OnClick(R.id.Eslamx)

    protected void onClickEslamx() {
        b = "Eslamx";
        Intent i = new Intent(Banks.this, AtmActivity.class);
        startActivity(i);
        //the apply method called on button1 Click

        Toast.makeText(this, b + " " + Places.p + " ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banks);

        //getDataFromIntent();
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (Places.p == "sab3") {

            CIB.setVisibility(View.GONE);
            Akary.setVisibility(View.GONE);
            Masr.setVisibility(View.GONE);
            Alex.setVisibility(View.GONE);
            Eslamx.setVisibility(View.GONE);


        } else if (Places.p == "qysna") {


            Akary.setVisibility(View.GONE);
            Cairo.setVisibility(View.GONE);
            CIB.setVisibility(View.GONE);
            Eslamx.setVisibility(View.GONE);

        }
        else if (Places.p == "menof") {

            Akary.setVisibility(View.GONE);
            Alex.setVisibility(View.GONE);        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main2, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.places) {

            Intent i = new Intent(Banks.this,Places.class);
            startActivity(i);


        } else if (id == R.id.bank) {
            Intent i = new Intent(Banks.this,Banks.class);
            startActivity(i);

        } else if (id == R.id.map) {
            Intent i = new Intent(Banks.this,MapsActivity.class);
            startActivity(i);

        } else if (id == R.id.share) {
            String text = "ATM Finder";
            String link = "https://play.google.com/store/apps/details?id=com.asmaa.ok.atmfinder";

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, text + "\n" + link);
            intent.setType("text/plain");

            startActivity(intent);

        } else if (id == R.id.we) {
            Intent i = new Intent(Banks.this,About_Us.class);
            startActivity(i);

        } else if (id == R.id.callus) {
            Intent i = new Intent(Banks.this,Call_US.class);
            startActivity(i);

        }
        else if (id == R.id.call) {
            Intent i = new Intent(Banks.this,CallActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    private void getDataFromIntent() {
//        Intent intent = getIntent();
//        if (intent!=null)
//        {
//            if (intent.hasExtra("p1"))
//            {
//
//            }
//        }
//    }
}
