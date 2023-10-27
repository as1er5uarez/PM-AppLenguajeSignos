package com.example.proyectolenguajesignos;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerDataAdapter  extends RecyclerView.Adapter<RecyclerDataAdapter> {

    public RecyclerDataAdapter(List<Signo> list){
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerDataAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.)
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
