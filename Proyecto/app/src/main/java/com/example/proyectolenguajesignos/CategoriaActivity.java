package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.proyectolenguajesignos.Models.Categoria;
import com.example.proyectolenguajesignos.Models.Signo;

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
        signos1.add(new Signo(R.drawable.ropa1,"ropa"));
        categorias.add(new Categoria(R.drawable.comida2 ,"Categoría 1",signos));
        categorias.add(new Categoria(R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(R.drawable.comida2 ,"Categoría 1",signos));
        categorias.add(new Categoria(R.drawable.ropa1 ,"Categoría 2",signos1));
        categorias.add(new Categoria(R.drawable.comida2 ,"Categoría 1", signos));
        categorias.add(new Categoria(R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(R.drawable.comida2 ,"Categoría 1", signos));
        categorias.add(new Categoria(R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(R.drawable.comida2 ,"Categoría 1",signos));
        categorias.add(new Categoria(R.drawable.ropa1 ,"Categoría 2", signos1));
        categorias.add(new Categoria(R.drawable.comida2 ,"Categoría 1", signos));
        categorias.add(new Categoria(R.drawable.ropa1 ,"Categoría 2", signos));
        recyclerDataAdapter = new RecyclerAdapterCategoria(categorias,new RecyclerAdapterCategoria.OnItemClickListener() {

            @Override
            public void onItemClick(Categoria categoria) {
               Intent intent =new Intent(CategoriaActivity.this, SignoActivity.class);
                intent.putExtra("categoria", categoria.getId());
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }
}