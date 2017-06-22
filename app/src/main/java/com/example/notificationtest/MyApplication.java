package com.example.notificationtest;

import android.app.Application;
import android.content.Context;

/**
 * Created by tom on 2017/6/22.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate(){
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
