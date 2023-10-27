package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerDataAdapater recyclerDataAdapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerDataAdapater = new RecyclerDataAdapter(list, new RecyclerDataAdapter.onItemClickListener(){
            public void onItemClick(int posistion)
        });

    }
}