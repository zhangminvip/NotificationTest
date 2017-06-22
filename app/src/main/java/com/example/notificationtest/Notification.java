package com.example.notificationtest;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;

/**
 * Created by tom on 2017/6/22.
 */

public class Notification {

    public static void sendNotification(){
        NotificationManager manager = (NotificationManager)MyApplication.getContext()
                .getSystemService(NOTIFICATION_SERVICE);
        android.app.Notification notification = new NotificationCompat.Builder(MyApplication.getContext())
                .setContentTitle("this is content title")
                .setContentText("this is content text")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(MyApplication.getContext().getResources(),
                        R.mipmap.ic_launcher))
                .build();


        manager.notify(1,notification);

    }
}
