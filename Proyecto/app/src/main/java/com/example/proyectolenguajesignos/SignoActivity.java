package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;

import com.example.proyectolenguajesignos.Models.Signo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SignoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapterSigno recyclerDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        recyclerView = (RecyclerView) findViewById(R.id.rvSigno);
        ArrayList<Signo> signos = getIntent().getParcelableArrayListExtra("signos");
        List<Signo> signosList = new ArrayList<>();
        recyclerDataAdapter = new RecyclerAdapterSigno(signosList);
        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));*/


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);

        recyclerView = findViewById(R.id.rvSigno);

        // Obtener la lista de signos de la actividad anterior

        List<Signo> signosList = new ArrayList<>();
        recyclerDataAdapter = new RecyclerAdapterSigno(signosList);

        // Configurar el listener de clic en el adaptador
        recyclerDataAdapter.setOnItemClickListener(new RecyclerAdapterSigno.OnItemClickListener() {
            @Override
            public void onItemClick(Signo signo) {
                mostrarPalabras(signo.getPalabra());
            }
        });

        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Agregar los signos a la lista
        /*if (signos != null) {
            signosList.addAll(signos);
            recyclerDataAdapter.notifyDataSetChanged();
        }*/
    }

    private void mostrarPalabras(String palabras) {
        // Aquí puedes mostrar las palabras de la categoría seleccionada, por ejemplo, en un diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Palabras de la categoría");
        builder.setMessage(TextUtils.join(", ", Collections.singleton(palabras)));
        builder.setPositiveButton("OK", null);
        builder.show();
    }

    }
