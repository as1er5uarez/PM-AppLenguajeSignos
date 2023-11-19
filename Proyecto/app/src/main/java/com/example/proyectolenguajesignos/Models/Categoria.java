package com.example.proyectolenguajesignos.Models;

import com.example.proyectolenguajesignos.App.MyApplication;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Categoria  extends RealmObject {
    // La clase categoria tiene una propiedad lista de palabras que a ser rellenada identificando que id de categoria tiene
    // Se puede hacer que Palabra tenga idCategoria directamente y mostrar la imagen controlando si el id es igual al id pulsado

    @PrimaryKey
    private int id;
    private String nombre;
    
    private int imagen;
    private RealmList<Subcategoria> subcategorias;

    public RealmList<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(RealmList<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Categoria(String nombre, int imagen, RealmList<Subcategoria> subcategorias) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.subcategorias = subcategorias;
    }
    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


    private ArrayList<Signo> signos;

    public ArrayList<Signo> getSignos() {
        return signos;
    }

    public void setSignos(ArrayList<Signo> signos) {
        this.signos = signos;
    }

    public Categoria(int imagen, String nombre, ArrayList<Signo> signos) {
        this.id = MyApplication.categoriaID.incrementAndGet();
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


}
