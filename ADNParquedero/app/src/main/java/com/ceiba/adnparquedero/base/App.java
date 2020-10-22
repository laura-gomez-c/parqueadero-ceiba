package com.ceiba.adnparquedero.base;

import android.app.Application;
import android.util.Log;

import com.ceiba.adnparquedero.base.di.DaggerAppComponent;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        this.initDagger();
        this.initRealmDB();
        Log.d("init...", "init application");
    }

    private void initDagger() {
        DaggerAppComponent.builder().build().inject(this);
    }

    private void initRealmDB() {
        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}