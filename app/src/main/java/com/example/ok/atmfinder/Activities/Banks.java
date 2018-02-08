package com.example.ok.atmfinder.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ok.atmfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Banks extends AppCompatActivity {

    public static String b = "";


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

        ButterKnife.bind(this);
    }
}
