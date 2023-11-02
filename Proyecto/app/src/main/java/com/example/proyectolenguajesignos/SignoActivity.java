package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SignoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapterCategoria recyclerDataAdapter;
    TextView textViewPalabra = (TextView) findViewById(R.id.textViewPalabra);

    ImageView imageViewPalrabra=(ImageView) findViewById(R.id.imageViewSigno);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        recyclerView = (RecyclerView) findViewById(R.id.rvSigno);
        String titulo=getIntent().getStringExtra("palabra");
        int imagen=getIntent().getIntExtra("imagenSigno",-1);

        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        textViewPalabra.setText(titulo);
        imageViewPalrabra.setImageResource(imagen);
    }
}