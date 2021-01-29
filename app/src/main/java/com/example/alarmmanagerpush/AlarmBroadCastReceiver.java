package com.example.alarmmanagerpush;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public class AlarmBroadCastReceiver extends BroadcastReceiver {

   // public static Context context;

    public AlarmBroadCastReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //if(intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Intent alarmIntentServiceIntent = new Intent(context, AlarmIntentService.class);
            context.startService(alarmIntentServiceIntent);
        //}
    }



}
