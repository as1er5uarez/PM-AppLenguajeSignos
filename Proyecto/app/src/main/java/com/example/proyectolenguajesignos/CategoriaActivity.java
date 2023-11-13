package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

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
        ArrayList<Signo>signos =new ArrayList<>();
        signos.add(new Signo(R.drawable.comida2,"comida"));
        signos.add(new Signo(R.drawable.comida2,"comida"));
        signos.add(new Signo(R.drawable.comida2,"comida"));
        signos.add(new Signo(R.drawable.comida2,"comida"));
        signos.add(new Signo(R.drawable.comida2,"comida"));
        ArrayList<Signo>signos1 =new ArrayList<>();
        signos1.add(new Signo(R.drawable.comida2,"comida"));
        categorias.add(new Categoria(1,R.drawable.comida2 ,"Categoría 1",signos));
        categorias.add(new Categoria(2,R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(3,R.drawable.comida2 ,"Categoría 1",signos));
        categorias.add(new Categoria(4,R.drawable.ropa1 ,"Categoría 2",signos1));
        categorias.add(new Categoria(1,R.drawable.comida2 ,"Categoría 1", signos));
        categorias.add(new Categoria(2,R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(3,R.drawable.comida2 ,"Categoría 1", signos));
        categorias.add(new Categoria(4,R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(1,R.drawable.comida2 ,"Categoría 1",signos));
        categorias.add(new Categoria(2,R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(3,R.drawable.comida2 ,"Categoría 1", signos));
        categorias.add(new Categoria(4,R.drawable.ropa1 ,"Categoría 2", signos));

        recyclerDataAdapter = new RecyclerAdapterCategoria(categorias,new RecyclerAdapterCategoria.OnItemClickListener() {

            @Override
            public void onItemClick(Categoria categoria) {
               Intent intent =new Intent(CategoriaActivity.this, SignoActivity.class);

                intent.putParcelableArrayListExtra("signos", categoria.getSignos());
                startActivity(intent);
            }
        });
        // Inicializar el adaptador y configurar el RecyclerView
        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
}