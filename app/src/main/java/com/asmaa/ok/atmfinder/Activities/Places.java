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
import android.widget.ImageView;

import com.asmaa.ok.atmfinder.Call_US;
import com.asmaa.ok.atmfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Places extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

   public static String p="null";
    @BindView(R.id.sheben)
    ImageView sheben;
    @BindView(R.id.sab3)
    ImageView sab3;
    @BindView(R.id.qysna)
    ImageView qysma;
    @BindView(R.id.menof)
    ImageView menof;


    @OnClick(R.id.sheben)
    protected void onClicksh(){
        p="sheben";
        Intent i = new Intent(Places.this,Banks.class);
       // i.putExtra("p1",p);
        startActivity(i);
        //the apply method called on button1 Click
    }

    @OnClick(R.id.sab3)
    protected void onClicksa(){
        p="sab3";
        Intent i = new Intent(Places.this,Banks.class);
        i.putExtra("p2",p);

        startActivity(i);
        //the apply method called on button1 Click
    }

    @OnClick(R.id.qysna)
    protected void onClickqy(){
        p="qysna";
        Intent i = new Intent(Places.this,Banks.class);
        //i.putExtra("p3",p);

        startActivity(i);
        //the apply method called on button1 Click
    }

    @OnClick(R.id.menof)
    protected void onClickme(){
        p="menof";
        Intent i = new Intent(Places.this,Banks.class);
        //i.putExtra("p4",p);

        startActivity(i);
        //the apply method called on button1 Click
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

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

            Intent i = new Intent(Places.this,Places.class);
            startActivity(i);


        } else if (id == R.id.bank) {
            Intent i = new Intent(Places.this,Banks.class);
            startActivity(i);

        } else if (id == R.id.map) {
            Intent i = new Intent(Places.this,MapsActivity.class);
            startActivity(i);

        } else if (id == R.id.share) {
            Intent i = new Intent(Places.this,Places.class);
            startActivity(i);

        } else if (id == R.id.we) {
            Intent i = new Intent(Places.this,About_Us.class);
            startActivity(i);

        } else if (id == R.id.callus) {
            Intent i = new Intent(Places.this,Call_US.class);
            startActivity(i);

        }
        else if (id == R.id.call) {
            Intent i = new Intent(Places.this,CallActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
