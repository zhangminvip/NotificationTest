package com.example.notificationtest;

import android.app.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button sendNotice ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendNotice =  (Button)findViewById(R.id.send_notice);
        sendNotice.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.send_notice:
                Notification.sendNotification();
                break;
            default:
                break;
        }
    }
}
