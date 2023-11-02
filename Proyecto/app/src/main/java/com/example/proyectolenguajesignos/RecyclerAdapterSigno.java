package com.example.proyectolenguajesignos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterSigno extends RecyclerView.Adapter<RecyclerAdapterSigno.RecyclerDataHolder> {
    List<Signo> signos;

    public RecyclerAdapterSigno(List<Signo> signos) {
        this.signos = signos;
    }

    @NonNull
    @Override
    public RecyclerAdapterSigno.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.signo_item, null, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        holder.assignData(signos.get(position));

    }
    @Override
    public int getItemCount() {
        return signos.size();
    }
    public static class  RecyclerDataHolder extends RecyclerView.ViewHolder {
        TextView tw;
        ImageView iw;
        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            tw = itemView.findViewById(R.id.textViewPalabra);
            iw=itemView.findViewById(R.id.imageViewSigno);
        }

        public void assignData(Signo signo){

            tw.setText(signo.getPalabra());
            iw.setImageResource(signo.getImagenSigno());

        }


    }
}
