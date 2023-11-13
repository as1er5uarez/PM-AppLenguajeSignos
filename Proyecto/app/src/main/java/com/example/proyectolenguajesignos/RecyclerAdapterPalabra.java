package com.example.proyectolenguajesignos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapterPalabra extends RecyclerView.Adapter<RecyclerAdapterPalabra.RecyclerDataHolder> {

    private List<Palabra> palabras;
    private OnItemClickListener itemListener;
    private int position;
    public RecyclerAdapterPalabra(List<Palabra> palabras, OnItemClickListener listener){
        this.palabras = palabras;
        this.itemListener = listener;
    }
    @NonNull
    @Override
    public RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.palabra_item, parent, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        Palabra palabra = palabras.get(position);
        holder.assignData(palabra, itemListener);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class RecyclerDataHolder extends RecyclerView.ViewHolder {

        public TextView tw;
        public ImageView iw;

        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void assignData(Palabra palabra, OnItemClickListener listener) {
            tw.setText(palabra.getNombre());
            iw.setImageResource(palabra.getSigno());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(palabra);
                }
            });
        }

    }




    public interface OnItemClickListener {
        void onItemClick(Palabra palabra);
    }

}