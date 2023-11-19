package com.example.proyectolenguajesignos.Models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Subcategoria extends RealmObject {
    public Subcategoria() {
    }
    @PrimaryKey
    public  int id;

    private String nombre;

    private int idCategoria;
    private RealmList<Signo> signos;

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

    public RealmList<Signo> getSignos() {
        return signos;
    }

    public void setSignos(RealmList<Signo> signos) {
        this.signos = signos;
    }

    public Subcategoria(String nombre, int idCategoria, RealmList<Signo> signos) {
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.signos = signos;
    }
}
