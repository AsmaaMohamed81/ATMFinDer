package com.asmaa.ok.atmfinder.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.asmaa.ok.atmfinder.Call_US;
import com.asmaa.ok.atmfinder.R;

public class CallActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
TextView tbank1,tbank2,tbank3,tbank4,tbank5,tbank6,tbank7;
    ImageView Ibank1,Ibank2,Ibank3,Ibank4,Ibank5,Ibank6,Ibank7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        tbank1=findViewById(R.id.Tbank1);
        tbank2=findViewById(R.id.Tbank2);
        tbank3=findViewById(R.id.Tbank3);
        tbank4=findViewById(R.id.Tbank4);
        tbank5=findViewById(R.id.Tbank5);
        tbank6=findViewById(R.id.Tbank6);
        tbank7=findViewById(R.id.Tbank7);


        Ibank1=findViewById(R.id.Ibank1);
        Ibank2=findViewById(R.id.Ibank2);
        Ibank3=findViewById(R.id.Ibank3);
        Ibank4=findViewById(R.id.Ibank4);
        Ibank5=findViewById(R.id.Ibank5);
        Ibank6=findViewById(R.id.Ibank6);
        Ibank7=findViewById(R.id.Ibank7);

        final String T1=  tbank1.getText().toString();
        final String T2=  tbank2.getText().toString();
        final String T3=  tbank3.getText().toString();
        final String T4=  tbank4.getText().toString();
        final String T5=  tbank5.getText().toString();
        final String T6=  tbank6.getText().toString();
        final String T7=  tbank7.getText().toString();
        
        
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        Ibank1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T1));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });


        Ibank2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T2));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });

        Ibank3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T3));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });

        Ibank4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T4));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });

        Ibank5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T5));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });

        Ibank6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T6));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });

        Ibank7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+T7));
                // Intent intent=Intent.createChooser(i,"make call with");
                startActivity(i);
            }
        });






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

            Intent i = new Intent(CallActivity.this,Places.class);
            startActivity(i);


        } else if (id == R.id.bank) {
            Intent i = new Intent(CallActivity.this,Banks.class);
            startActivity(i);

        } else if (id == R.id.map) {
            Intent i = new Intent(CallActivity.this,MapsActivity.class);
            startActivity(i);

        } else if (id == R.id.share) {
            String text = "ATM Finder";
            String link = "https://play.google.com/store/apps/details?id=com.asmaa.ok.atmfinder";

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, text + "\n" + link);
            intent.setType("text/plain");

            startActivity(intent);

        } else if (id == R.id.we) {
            Intent i = new Intent(CallActivity.this,About_Us.class);
            startActivity(i);

        } else if (id == R.id.callus) {
            Intent i = new Intent(CallActivity.this,Call_US.class);
            startActivity(i);

        }
        else if (id == R.id.call) {
            Intent i = new Intent(CallActivity.this,CallActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
}}
