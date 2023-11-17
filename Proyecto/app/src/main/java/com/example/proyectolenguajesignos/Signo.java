package com.example.proyectolenguajesignos;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.example.proyectolenguajesignos.App.MyapplicationSigno;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Signo  extends RealmObject {

    @PrimaryKey
    private int id;

    private  int imagenSigno;

    private  String palabra;

    public Signo(){

    }


    public int getImagenSigno() {
        return imagenSigno;
    }

    public void setImagenSigno(int imagenSigno) {
        this.imagenSigno = imagenSigno;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Signo(int imagenSigno, String palabra) {
        this.id= MyapplicationSigno.signoID.incrementAndGet();
        this.imagenSigno = imagenSigno;
        this.palabra = palabra;
    }


}
