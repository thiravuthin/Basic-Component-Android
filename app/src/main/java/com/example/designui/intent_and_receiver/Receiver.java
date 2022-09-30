package com.example.designui.intent_and_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String status = NetworkStatus.getConnectivityStatusString(context);
        Toast.makeText(context, status, Toast.LENGTH_SHORT).show();
    }
}
