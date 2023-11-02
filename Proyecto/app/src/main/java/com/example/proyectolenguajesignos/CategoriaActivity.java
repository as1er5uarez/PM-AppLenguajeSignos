package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CategoriaActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapterCategoria recyclerDataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewCategoria);

        List<Categoria> categorias=new ArrayList<>();

        categorias.add(new Categoria(1,R.drawable.comida2 ,"Categoría 1", new ArrayList<Palabra>()));
        categorias.add(new Categoria(2,R.drawable.ropa1 ,"Categoría 2", new ArrayList<Palabra>()));
        categorias.add(new Categoria(3,R.drawable.comida2 ,"Categoría 1", new ArrayList<Palabra>()));
        categorias.add(new Categoria(4,R.drawable.ropa1 ,"Categoría 2", new ArrayList<Palabra>()));
        categorias.add(new Categoria(1,R.drawable.comida2 ,"Categoría 1", new ArrayList<Palabra>()));
        categorias.add(new Categoria(2,R.drawable.ropa1 ,"Categoría 2", new ArrayList<Palabra>()));
        categorias.add(new Categoria(3,R.drawable.comida2 ,"Categoría 1", new ArrayList<Palabra>()));
        categorias.add(new Categoria(4,R.drawable.ropa1 ,"Categoría 2", new ArrayList<Palabra>()));
        categorias.add(new Categoria(1,R.drawable.comida2 ,"Categoría 1", new ArrayList<Palabra>()));
        categorias.add(new Categoria(2,R.drawable.ropa1 ,"Categoría 2", new ArrayList<Palabra>()));
        categorias.add(new Categoria(3,R.drawable.comida2 ,"Categoría 1", new ArrayList<Palabra>()));
        categorias.add(new Categoria(4,R.drawable.ropa1 ,"Categoría 2", new ArrayList<Palabra>()));

        recyclerDataAdapter = new RecyclerAdapterCategoria(categorias,new RecyclerAdapterCategoria.OnItemClickListener() {

            @Override
            public void onItemClick(Categoria categoria) {
               Intent intent =new Intent(CategoriaActivity.this, SignoActivity.class);
               intent.putExtra("imagenSigno", categoria.getImagen());
               intent.putExtra("palabra", categoria.getNombre()); // Ejemplo de cómo pasar el ID de la categoría
               // Ejemplo de cómo pasar el ID de la categoría

                // Iniciar la nueva Activity
                startActivity(intent);
            }
        });
        // Inicializar el adaptador y configurar el RecyclerView
        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }
}