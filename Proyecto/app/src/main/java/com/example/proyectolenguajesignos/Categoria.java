package com.example.proyectolenguajesignos;

import java.util.ArrayList;

public class Categoria {
    // La clase categoria tiene una propiedad lista de palabras que a ser rellenada identificando que id de categoria tiene
    // Se puede hacer que Palabra tenga idCategoria directamente y mostrar la imagen controlando si el id es igual al id pulsado
    private int id;
    private String nombre;
    
    private int imagen;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    private ArrayList<Palabra> palabras;

    private ArrayList<Signo> signos;


    public ArrayList<Signo> getSignos() {
        return signos;
    }

    public void setSignos(ArrayList<Signo> signos) {
        this.signos = signos;
    }

    public Categoria(int id, int imagen, String nombre, ArrayList<Signo> signos) {
        this.id = id;
        this.imagen=imagen;
        this.nombre = nombre;
       this.signos=signos;
    }

    public Categoria() {
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
