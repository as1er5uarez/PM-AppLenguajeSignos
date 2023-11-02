package com.example.proyectolenguajesignos;

public class Signo {

    private  int imagenSigno;

    private  String palabra;

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
}
