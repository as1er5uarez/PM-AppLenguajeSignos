package com.example.proyectolenguajesignos;

public class Palabra {
    private int id;
    private String nombre;
    private String significado;
    private int signo;

    public Palabra(int id, String nombre, String significado, int signo) {
        this.id = id;
        this.nombre = nombre;
        this.significado = significado;
        this.signo = signo;
    }

    public Palabra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public int getSigno() {
        return signo;
    }

    public void setSigno(int signo) {
        this.signo = signo;
    }
}
