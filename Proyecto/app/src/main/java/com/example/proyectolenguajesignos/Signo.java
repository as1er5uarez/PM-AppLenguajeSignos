package com.example.proyectolenguajesignos;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Signo implements Parcelable {

    private  int imagenSigno;

    private  String palabra;

    protected Signo(Parcel in) {
        imagenSigno = in.readInt();
        palabra = in.readString();
    }

    public static final Creator<Signo> CREATOR = new Creator<Signo>() {
        @Override
        public Signo createFromParcel(Parcel in) {
            return new Signo(in);
        }

        @Override
        public Signo[] newArray(int size) {
            return new Signo[size];
        }
    };

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
        this.imagenSigno = imagenSigno;
        this.palabra = palabra;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(imagenSigno);
        dest.writeString(palabra);
    }
}
