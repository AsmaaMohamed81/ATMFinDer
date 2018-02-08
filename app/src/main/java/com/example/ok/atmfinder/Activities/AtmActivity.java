package com.example.ok.atmfinder.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ok.atmfinder.Adapter.AtmAdapter;
import com.example.ok.atmfinder.Models.AtmModel;
import com.example.ok.atmfinder.Models.NameBank;
import com.example.ok.atmfinder.R;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity {
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
    String[] CIB_menof = NameBank.CIB_menof;


    String[] AKary_sheben = NameBank.AKary_sheben;


    Banks banks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);


        if (Banks.b == "Masr" && Places.p == "sheben") {
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
        }

/////////////////////////////Akary

        else if (Banks.b == "Akary" && Places.p == "sheben") {
            for (int i = 0; i < AKary_sheben.length; i++) {

                AtmModel atmModel = new AtmModel(AKary_sheben[i]);
                atmArray.add(atmModel);
            }
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


///////////////////////////////////////
        recyclerView = (RecyclerView) findViewById(R.id.recyAtm);

        recyclerView.setLayoutManager(new GridLayoutManager(AtmActivity.this, 1));
        recyclerView.setHasFixedSize(true);

        adapter = new AtmAdapter(AtmActivity.this, atmArray);

        recyclerView.setAdapter(adapter);
    }
}
