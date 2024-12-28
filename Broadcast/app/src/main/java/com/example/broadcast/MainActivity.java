package com.example.broadcast;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // 2 ways for BroadCast Receiver
        // 1st way --> Add in AndroidManofest.xml file (Note: Its works only API level lower than 26...)
        // 2nd way --> Register Dynamically the BroadCast Receiver (Note: This type is shown below)

        // Here we're dealing with BroadCast Receiver @ AirplaneMode
//        IntentFilter intentFilter = new IntentFilter("andrid.intent.action.AIRPLANE_MODE");
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        AirplaneModeReceiver broadcastReceiver = new AirplaneModeReceiver();
        registerReceiver(broadcastReceiver, intentFilter);

    }
}