package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView categorias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categorias = findViewById(R.id.textView);

        categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad solo después de completar la animación
                categorias.animate()
                        .scaleX(1.2f)
                        .scaleY(1.2f)
                        .setDuration(150)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                // Restaura la escala original después de completar la animación
                                categorias.animate()
                                        .scaleX(1.0f)
                                        .scaleY(1.0f)
                                        .setDuration(150);
                                // Inicia la nueva actividad
                                Intent intent = new Intent(MainActivity.this, CategoriaActivity.class);
                                startActivity(intent);
                            }
                        });
            }
        });
    }
}