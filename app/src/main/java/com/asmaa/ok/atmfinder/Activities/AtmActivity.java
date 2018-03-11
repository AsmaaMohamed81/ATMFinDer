package com.asmaa.ok.atmfinder.Activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.asmaa.ok.atmfinder.Adapter.AtmAdapter;
import com.asmaa.ok.atmfinder.Call_US;
import com.asmaa.ok.atmfinder.Models.AtmModel;
import com.asmaa.ok.atmfinder.Models.NameBank;
import com.asmaa.ok.atmfinder.R;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    RecyclerView recyclerView;
    AtmAdapter adapter;
    ArrayList<AtmModel> atmArray = new ArrayList<>();
    NameBank nameBank;

    String[] masr_sheben = nameBank.masr_sheben;
    String[] masr_qysna = nameBank.masr_qysna;
    String[] masr_menof = nameBank.masr_menof;

    String[] Alex_sheben = nameBank.Alex_sheben;
    String[] Alex_qysna = nameBank.Alex_qysna;

    String[] Ahly_sheben = nameBank.Ahly_sheben;
    String[] Ahly_qysna = nameBank.Ahly_qysna;
    String[] Ahly_sab3 = nameBank.Ahly_sab3;
    String[] Ahly_menof = nameBank.Ahly_menof;

    String[] Cairo_sheben = nameBank.Cairo_sheben;
    String[] Cairo_sab3 = nameBank.Cairo_sab3;
    String[] Cairo_menof = nameBank.Cairo_menof;

    String[] Eslamx_sheben = nameBank.Eslamx_sheben;
    String[] Eslamx_menof = nameBank.Eslamx_menof;


    String[] CIB_sheben = nameBank.CIB_sheben;
    String[] CIB_menof = NameBank.CIB_qysna;


    String[] AKary_sheben = NameBank.AKary_sheben;


    Banks banks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (Banks.b == "null" || Places.p == "null") {
            final AlertDialog.Builder alertadd = new AlertDialog.Builder(AtmActivity.this);
            LayoutInflater factory = LayoutInflater.from(AtmActivity.this);
            final View viewu = factory.inflate(R.layout.sample, null);
            alertadd.setView(viewu);

            alertadd.setNeutralButton("OK!", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dlg, int sumthin) {

                    Intent i = new Intent(AtmActivity.this,Places.class);



                    startActivity(i);

                }
            });
            AlertDialog dialog = alertadd.create();
            dialog.getWindow().getAttributes().windowAnimations = R.style.CustomAnimations_slide; //style id

            dialog.show();

           // dateall.setText("Choose date");



        }

       else if (Banks.b == "Masr" && Places.p == "sheben") {
            for (int i = 0; i < masr_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(masr_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Masr" && Places.p == "qysna") {
            for (int i = 0; i < masr_qysna.length; i++) {

                AtmModel atmModel = new AtmModel(masr_qysna[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Masr" && Places.p == "menof") {
            for (int i = 0; i < masr_menof.length; i++) {

                AtmModel atmModel = new AtmModel(masr_menof[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Masr" && Places.p == "sab3") {
            Methot_Toast();
        }
/////////////////////////////Ahly

        else if (Banks.b == "Ahly" && Places.p == "sheben") {
            for (int i = 0; i < Ahly_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(Ahly_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Ahly" && Places.p == "sab3") {
            for (int i = 0; i < Ahly_sab3.length; i++) {

                AtmModel atmModel = new AtmModel(Ahly_sab3[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Ahly" && Places.p == "qysna") {
            for (int i = 0; i < Ahly_qysna.length; i++) {

                AtmModel atmModel = new AtmModel(Ahly_qysna[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Ahly" && Places.p == "menof") {
            for (int i = 0; i < Ahly_menof.length; i++) {

                AtmModel atmModel = new AtmModel(Ahly_menof[i]);
                atmArray.add(atmModel);
            }
        }


////////////////////////// Cairo

        else if (Banks.b == "Cairo" && Places.p == "sheben") {
            for (int i = 0; i < Cairo_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(Cairo_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Cairo" && Places.p == "sab3") {
            for (int i = 0; i < Cairo_sab3.length; i++) {

                AtmModel atmModel = new AtmModel(Cairo_sab3[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Cairo" && Places.p == "menof") {
            for (int i = 0; i < Cairo_menof.length; i++) {

                AtmModel atmModel = new AtmModel(Cairo_menof[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Cairo" && Places.p == "qysna") {
            Methot_Toast();
        }

/////////////////////////////Akary

        else if (Banks.b == "Akary" && Places.p == "sheben") {
            for (int i = 0; i < AKary_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(AKary_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Akary" && Places.p == "sab3") {
            Methot_Toast();

        } else if (Banks.b == "Akary" && Places.p == "menof") {
            Methot_Toast();

        } else if (Banks.b == "Akary" && Places.p == "qysna") {
            Methot_Toast();
        }
///////////////////////CIB

        else if (Banks.b == "CIB" && Places.p == "sheben") {
            for (int i = 0; i < CIB_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(CIB_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "CIB" && Places.p == "menof") {
            for (int i = 0; i < CIB_menof.length; i++) {

                AtmModel atmModel = new AtmModel(CIB_menof[i]);
                atmArray.add(atmModel);
            }
        }

        else if (Banks.b == "CIB" && Places.p == "sab3") {
            Methot_Toast();

        } else if (Banks.b == "CIB" && Places.p == "qysna") {
            Methot_Toast();
        }
//////////////////////////////////////////Alex
        else if (Banks.b == "Alex" && Places.p == "sheben") {
            for (int i = 0; i < Alex_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(Alex_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Alex" && Places.p == "qysna") {
            for (int i = 0; i < Alex_qysna.length; i++) {

                AtmModel atmModel = new AtmModel(Alex_qysna[i]);
                atmArray.add(atmModel);
            }
        }

        else if (Banks.b == "Alex" && Places.p == "menof") {
            Methot_Toast();

        }

        else if (Banks.b == "Alex" && Places.p == "sab3") {
            Methot_Toast();

        }

//////////////////////////Eslamx

        else if (Banks.b == "Eslamx" && Places.p == "sheben") {
            for (int i = 0; i < Eslamx_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(Eslamx_sheben[i]);
                atmArray.add(atmModel);
            }
        } else if (Banks.b == "Eslamx" && Places.p == "menof") {
            for (int i = 0; i < Eslamx_menof.length; i++) {

                AtmModel atmModel = new AtmModel(Eslamx_menof[i]);
                atmArray.add(atmModel);
            }
        }

        else if (Banks.b == "Eslamx" && Places.p == "sab3") {
            Methot_Toast();

        } else if (Banks.b == "Eslamx" && Places.p == "qysna") {
            Methot_Toast();
        }


///////////////////////////////////////
        recyclerView = (RecyclerView) findViewById(R.id.recyAtm);

        recyclerView.setLayoutManager(new GridLayoutManager(AtmActivity.this, 1));
        recyclerView.setHasFixedSize(true);

        adapter = new AtmAdapter(AtmActivity.this, atmArray);

        recyclerView.setAdapter(adapter);
    }

    public void Methot_Toast() {

        Toast toast = new Toast(AtmActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);

        LayoutInflater ly = getLayoutInflater();

        View v = ly.inflate(R.layout.activity_toast__image_item, (ViewGroup) findViewById(R.id.lay));

        TextView txt1 = (TextView) v.findViewById(R.id.textView1);
        TextView txt2 = (TextView) v.findViewById(R.id.textView2);

        txt1.setText("مرحبا بيك في بنامجنا");
        txt2.setText("لا يوجد ماكينه للصرف لهذا الفرع ");

        toast.setView(v);
        toast.show();

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

            Intent i = new Intent(AtmActivity.this,Places.class);
            startActivity(i);


        } else if (id == R.id.bank) {
            Intent i = new Intent(AtmActivity.this,Banks.class);
            startActivity(i);

        } else if (id == R.id.map) {
            Intent i = new Intent(AtmActivity.this,MapsActivity.class);
            startActivity(i);

        } else if (id == R.id.share) {
            Intent i = new Intent(AtmActivity.this,Places.class);
            startActivity(i);

        } else if (id == R.id.we) {
            Intent i = new Intent(AtmActivity.this,About_Us.class);
            startActivity(i);

        } else if (id == R.id.callus) {
            Intent i = new Intent(AtmActivity.this,Call_US.class);
            startActivity(i);

        }
        else if (id == R.id.call) {
            Intent i = new Intent(AtmActivity.this,CallActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}


