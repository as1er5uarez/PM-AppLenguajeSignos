package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class signoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        Intent intent = getIntent();

        // Verificar si el Intent contiene datos extras
        if (intent != null && intent.hasExtra("categoria_id")) {
            // Obtener el valor del extra
            int categoriaId = intent.getIntExtra("categoria_id", -1);

            // Ahora tienes el valor de "categoria_id" en la variable categoriaId
            // Puedes usarlo como lo necesites en tu Activity
        }


    }
}