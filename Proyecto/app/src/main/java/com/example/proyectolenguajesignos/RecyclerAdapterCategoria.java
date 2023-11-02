package com.example.proyectolenguajesignos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterCategoria extends RecyclerView.Adapter<RecyclerAdapterCategoria.RecyclerDataHolder> {

    List<Categoria> categorias;
    private OnItemClickListener listener;

    public RecyclerAdapterCategoria(List<Categoria> categorias, OnItemClickListener listener) {
        this.categorias = categorias;
        this.listener = listener;
    }
    @NonNull
    @Override
    public RecyclerAdapterCategoria.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoria_item, parent, false);
        return new RecyclerDataHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterCategoria.RecyclerDataHolder holder, int position) {
        holder.assignData(categorias.get(position), (OnItemClickListener) listener);
    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    public static class  RecyclerDataHolder extends RecyclerView.ViewHolder {
        TextView tw;
        ImageView iw;
        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            tw = itemView.findViewById(R.id.textView);
            iw=itemView.findViewById(R.id.imageView);
        }

        public void assignData(Categoria categoria, OnItemClickListener listener){
            tw.setText(categoria.getNombre());
            iw.setImageResource(categoria.getImagen());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(categoria);
                }
            });

        }
    }
    public interface OnItemClickListener {
        void onItemClick(Categoria categoria);
    }
}
