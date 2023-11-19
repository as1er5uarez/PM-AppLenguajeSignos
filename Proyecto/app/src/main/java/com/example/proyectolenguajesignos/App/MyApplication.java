package com.example.proyectolenguajesignos.App;

import android.app.Application;

import com.example.proyectolenguajesignos.Models.Categoria;
import com.example.proyectolenguajesignos.Models.Signo;
import com.example.proyectolenguajesignos.Models.Subcategoria;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyApplication extends Application {

    public static AtomicInteger categoriaID = new AtomicInteger();
    public static AtomicInteger signoID = new AtomicInteger();

    public static AtomicInteger subCategoriaID = new AtomicInteger();


    @Override
    public void onCreate() {
        super.onCreate();
        setUpRealmConfig();
        Realm realm = Realm.getDefaultInstance();
        categoriaID = getIdByTable(realm, Categoria.class);
        signoID =getIdByTable(realm, Signo.class);
        subCategoriaID=getIdByTable(realm, Subcategoria.class);
        realm.close();
    }

    private void setUpRealmConfig(){
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);
    }
    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){

        RealmResults<T> results = realm.where(anyClass).findAll();

        if (results.size()>0){
            return new AtomicInteger(results.max("id").intValue());
        }else{
            return new AtomicInteger(0);
        }
    }
}


