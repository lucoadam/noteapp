package com.example.tuesday;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MYViewHolder> {
    Context context;
    ArrayList<MyDoes> mydoes;

    public  DoesAdapter(Context context ,ArrayList<MyDoes> p){
        context = context;
        mydoes = p;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MYViewHolder(LayoutInflater.from(context).inflate(R.layout.item_does,viewGroup,false));
    }

//    @Override
//    public void onBindViewHolder(@NonNull MYViewHolder myViewHolder, int i) {
//
//    }

    @Override
    public void onBindViewHolder(@NonNull MYViewHolder myViewHolder, int i) {
        myViewHolder.titledoes.setText(mydoes.get(i).getTitledoes());
        myViewHolder.descdoes.setText(mydoes.get(i).getDescdoes());
        myViewHolder.datedoes.setText(mydoes.get(i).getDatedoes());

    }

    @Override
    public int getItemCount() {
        return mydoes.size();
    }

    class MYViewHolder extends RecyclerView.ViewHolder {

        TextView titledoes,descdoes,datedoes;

        public MYViewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descdoes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);

        }
    }
}