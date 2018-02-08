package com.example.ok.atmfinder.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ok.atmfinder.Activities.MapsActivity;
import com.example.ok.atmfinder.Models.AtmModel;
import com.example.ok.atmfinder.R;

import java.util.ArrayList;

/**
 * Created by ok on 29/01/2018.
 */

public class AtmAdapter extends RecyclerView.Adapter<AtmAdapter.Holder>{
Context context;
AtmModel atmModel;
    ArrayList<AtmModel> atmArray;

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

            Intent i = new Intent(context, MapsActivity.class);
            context.startActivity(i);

        }
    }
}
