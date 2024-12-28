package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import android.provider.Settings;


public class AirplaneModeReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        // This method is called when the Broadcast Receiver receives a broadcast

        if(intent.getAction() != null &&
                intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED) )
        {
//            boolean isAirplaneModeOn = intent.getBooleanExtra("State", false);
            // NOTE --> Above line is not properly handling the change from OFF to ON for Airplane Mode.
            boolean isAirplaneModeOn = Settings.System.getInt(context.getContentResolver(),
                    Settings.System.AIRPLANE_MODE_ON, 0) != 0;

            String message = isAirplaneModeOn ? "Airplane Mode is ON" : "Airplane Mode is OFF" ;

            Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show();
        }
    }
}
