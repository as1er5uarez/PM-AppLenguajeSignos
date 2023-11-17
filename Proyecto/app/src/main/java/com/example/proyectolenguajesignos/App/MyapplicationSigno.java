package com.example.proyectolenguajesignos.App;

import android.app.Application;

import com.example.proyectolenguajesignos.Signo;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyapplicationSigno extends Application {

    public static AtomicInteger signoID = new AtomicInteger();

    @Override
    public void onCreate() {
        super.onCreate();
        setUpRealmConfig();
        Realm realm = Realm.getDefaultInstance();
        signoID = getIdByTable(realm, Signo.class);
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
