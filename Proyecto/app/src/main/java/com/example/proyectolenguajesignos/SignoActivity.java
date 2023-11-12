package com.example.proyectolenguajesignos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SignoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapterSigno recyclerDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signo);
        recyclerView = (RecyclerView) findViewById(R.id.rvSigno);
        ArrayList<Signo> signos = getIntent().getParcelableArrayListExtra("signos");
        List<Signo> signosList = new ArrayList<>(signos);
        recyclerDataAdapter= new RecyclerAdapterSigno(signosList);
        recyclerView.setAdapter(recyclerDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

    }
}