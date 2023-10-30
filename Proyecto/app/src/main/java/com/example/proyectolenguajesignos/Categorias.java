package com.example.proyectolenguajesignos;

import java.util.ArrayList;

public class Categorias {
    // La clase categoria tiene una propiedad lista de palabras que a ser rellenada identificando que id de categoria tiene
    // Se puede hacer que Palabra tenga idCategoria directamente y mostrar la imagen controlando si el id es igual al id pulsado
    private int id;
    private String nombre;
    private ArrayList<Palabra> palabras;

    public Categorias(int id, String nombre, ArrayList<Palabra> palabras) {
        this.id = id;
        this.nombre = nombre;
        this.palabras = palabras;
    }

    public Categorias() {
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

    public ArrayList<Palabra> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<Palabra> palabras) {
        this.palabras = palabras;
    }
}
