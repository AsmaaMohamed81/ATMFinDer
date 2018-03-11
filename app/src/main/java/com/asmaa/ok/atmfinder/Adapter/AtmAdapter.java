package com.asmaa.ok.atmfinder.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.asmaa.ok.atmfinder.Activities.Banks;
import com.asmaa.ok.atmfinder.Activities.MapsActivity;
import com.asmaa.ok.atmfinder.Activities.Places;
import com.asmaa.ok.atmfinder.Models.AtmModel;
import com.asmaa.ok.atmfinder.R;

import java.util.ArrayList;

import static com.asmaa.ok.atmfinder.Models.LAT.AKary_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Ahly_menof_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Ahly_qysna_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Ahly_sab3_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Ahly_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Alex_qysna_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Alex_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.CIB_menof_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.CIB_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Cairo_menof_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Cairo_sab3_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Cairo_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Eslamx_menof_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.Eslamx_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.masr_menof_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.masr_qysna_LAT;
import static com.asmaa.ok.atmfinder.Models.LAT.masr_sheben_LAT;
import static com.asmaa.ok.atmfinder.Models.NameBank.AKary_sheben;
import static com.asmaa.ok.atmfinder.Models.NameBank.Ahly_menof;
import static com.asmaa.ok.atmfinder.Models.NameBank.Ahly_qysna;
import static com.asmaa.ok.atmfinder.Models.NameBank.Ahly_sab3;
import static com.asmaa.ok.atmfinder.Models.NameBank.Ahly_sheben;
import static com.asmaa.ok.atmfinder.Models.NameBank.Alex_qysna;
import static com.asmaa.ok.atmfinder.Models.NameBank.Alex_sheben;
import static com.asmaa.ok.atmfinder.Models.NameBank.CIB_qysna;
import static com.asmaa.ok.atmfinder.Models.NameBank.CIB_sheben;
import static com.asmaa.ok.atmfinder.Models.NameBank.Cairo_menof;
import static com.asmaa.ok.atmfinder.Models.NameBank.Cairo_sab3;
import static com.asmaa.ok.atmfinder.Models.NameBank.Cairo_sheben;
import static com.asmaa.ok.atmfinder.Models.NameBank.Eslamx_menof;
import static com.asmaa.ok.atmfinder.Models.NameBank.Eslamx_sheben;
import static com.asmaa.ok.atmfinder.Models.NameBank.masr_menof;
import static com.asmaa.ok.atmfinder.Models.NameBank.masr_qysna;
import static com.asmaa.ok.atmfinder.Models.NameBank.masr_sheben;
import static com.asmaa.ok.atmfinder.Models.lNG.AKary_sheben_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Ahly_menof_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Ahly_qysna_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Ahly_sab3_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Ahly_sheben_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Alex_qysna_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Alex_sheben_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.CIB_menof_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.CIB_sheben_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Cairo_menof_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Cairo_sab3_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Cairo_sheben_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Eslamx_menof_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.Eslamx_sheben_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.masr_menof_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.masr_qysna_LNG;
import static com.asmaa.ok.atmfinder.Models.lNG.masr_sheben_LNG;

/**
 * Created by ok on 29/01/2018.
 */

public class AtmAdapter extends RecyclerView.Adapter<AtmAdapter.Holder>{
Context context;
AtmModel atmModel;
    ArrayList<AtmModel> atmArray;
    public static double lat;
    public static double longit;
    public static String adress;

    public AtmAdapter(Context context, ArrayList<AtmModel> atmArray) {
        this.context = context;
        this.atmArray = atmArray;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.atmitem,parent,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        atmModel=atmArray.get(position);
        holder.linearLayout.setTag(position);

        holder.bank.setText(atmModel.getTitle());
        holder.street.setText(atmModel.getStreet());

    }

    @Override
    public int getItemCount() {
        return  atmArray.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView bank, street;
        ImageView logo;
        LinearLayout linearLayout;

        public Holder(View itemView) {
            super(itemView);

            bank=(TextView)itemView.findViewById(R.id.id_bank);
            street=(TextView)itemView.findViewById(R.id.street);
            logo=(ImageView)itemView.findViewById(R.id.img_atm);

            linearLayout=(LinearLayout)itemView.findViewById(R.id.linnn);



            linearLayout.setOnClickListener(this);



        }

        @Override
        public void onClick(View view) {

            int position = (int) view.getTag();
//            for (int i=0;i< Ahly_shebenlat.length;i++){
//             lat=   Ahly_shebenlat[i];
//            }
//            if (position==0) {


            if (Banks.b == "Masr" && Places.p == "sheben") {

                lat = masr_sheben_LAT[position];
                longit = masr_sheben_LNG[position];
                adress= masr_sheben[position];
               // Toast.makeText(context, adress, Toast.LENGTH_SHORT).show();


            } else if (Banks.b == "Masr" && Places.p == "qysna") {

                lat = masr_qysna_LAT[position];
                longit = masr_qysna_LNG[position];
                adress= masr_qysna[position];


            } else if (Banks.b == "Masr" && Places.p == "menof") {

                lat=   masr_menof_LAT[position];
                longit=   masr_menof_LNG[position];
                adress= masr_menof[position];


            }
/////////////////////////////Ahly

            else if (Banks.b == "Ahly" && Places.p == "sheben") {

                lat=   Ahly_sheben_LAT[position];
                longit=   Ahly_sheben_LNG[position];
                adress= Ahly_sheben[position];

                Toast.makeText(context, lat+","+longit, Toast.LENGTH_SHORT).show();


            } else if (Banks.b == "Ahly" && Places.p == "sab3") {

                lat=   Ahly_sab3_LAT[position];
                longit=   Ahly_sab3_LNG[position];
                adress= Ahly_sab3[position];


            } else if (Banks.b == "Ahly" && Places.p == "qysna") {

                lat=   Ahly_qysna_LAT[position];
                longit=   Ahly_qysna_LNG[position];
                adress= Ahly_qysna[position];


            } else if (Banks.b == "Ahly" && Places.p == "menof") {

                lat=   Ahly_menof_LAT[position];
                longit=   Ahly_menof_LNG[position];
                adress= Ahly_menof[position];


            }


////////////////////////// Cairo

            else if (Banks.b == "Cairo" && Places.p == "sheben") {

                lat=   Cairo_sheben_LAT[position];
                longit=   Cairo_sheben_LNG[position];
                adress= Cairo_sheben[position];


            } else if (Banks.b == "Cairo" && Places.p == "sab3") {

                lat=   Cairo_sab3_LAT[position];
                longit=   Cairo_sab3_LNG[position];
                adress= Cairo_sab3[position];


            } else if (Banks.b == "Cairo" && Places.p == "menof") {

                lat=   Cairo_menof_LAT[position];
                longit=   Cairo_menof_LNG[position];
                adress= Cairo_menof[position];

            }

/////////////////////////////Akary

            else if (Banks.b == "Akary" && Places.p == "sheben") {

                lat=   AKary_sheben_LAT[position];
                longit=   AKary_sheben_LNG[position];
                adress= AKary_sheben[position];


            }
///////////////////////CIB

            else if (Banks.b == "CIB" && Places.p == "sheben") {

                lat=   CIB_sheben_LAT[position];
                longit=   CIB_sheben_LNG[position];
                adress= CIB_sheben[position];


            } else if (Banks.b == "CIB" && Places.p == "menof") {

                lat=   CIB_menof_LAT[position];
                longit=   CIB_menof_LNG[position];
                adress= CIB_qysna[position];


            }
//////////////////////////////////////////Alex
            else if (Banks.b == "Alex" && Places.p == "sheben") {

                lat=   Alex_sheben_LAT[position];
                longit=   Alex_sheben_LNG[position];
                adress= Alex_sheben[position];


            } else if (Banks.b == "Alex" && Places.p == "qysna") {

                lat=   Alex_qysna_LAT[position];
                longit=   Alex_qysna_LNG[position];
                adress= Alex_qysna[position];


            }

//////////////////////////Eslamx

            else if (Banks.b == "Eslamx" && Places.p == "sheben") {

                lat=   Eslamx_sheben_LAT[position];
                longit=   Eslamx_sheben_LNG[position];
                adress= Eslamx_sheben[position];
                


            } else if (Banks.b == "Eslamx" && Places.p == "menof") {
                lat=   Eslamx_menof_LAT[position];
                longit=   Eslamx_menof_LNG[position];
                adress= Eslamx_menof[position];


            }
            Intent i = new Intent(context, MapsActivity.class);

            i.putExtra("namegraund", Banks.b);
            i.putExtra("TiTle", adress);


            context.startActivity(i);

        }
    }
}
