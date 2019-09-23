package com.android.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
                Toast.makeText(context, "Boot completedSER", Toast.LENGTH_SHORT).show();
            }

            if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                Toast.makeText(context, "CONNECTION", Toast.LENGTH_SHORT).show();
            }
    }

}
