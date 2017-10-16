package com.example.vic72.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by vic72 on 2017/10/01.
 */

public class TaskApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Realmを初期化
        Realm.init(this);
    }
}
