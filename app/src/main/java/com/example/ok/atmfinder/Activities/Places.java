package com.example.ok.atmfinder.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.ok.atmfinder.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Places extends AppCompatActivity {

   public static String p="";
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
        startActivity(i);
        //the apply method called on button1 Click
    }

    @OnClick(R.id.sab3)
    protected void onClicksa(){
        p="sab3";
        Intent i = new Intent(Places.this,Banks.class);
        startActivity(i);
        //the apply method called on button1 Click
    }

    @OnClick(R.id.qysna)
    protected void onClickqy(){
        p="qysna";
        Intent i = new Intent(Places.this,Banks.class);
        startActivity(i);
        //the apply method called on button1 Click
    }

    @OnClick(R.id.menof)
    protected void onClickme(){
        p="menof";
        Intent i = new Intent(Places.this,Banks.class);
        startActivity(i);
        //the apply method called on button1 Click
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ButterKnife.bind(this);

    }
}
