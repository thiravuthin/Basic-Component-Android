package com.example.designui.notification;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.widget.TextView;

import com.example.designui.R;

@RequiresApi(api = Build.VERSION_CODES.O)
public class NotificationActivityDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_demo1_activity);

        TextView button = findViewById(R.id.txtNotification);
        button.setOnClickListener(view -> {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

                NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                NotificationChannel channel = new NotificationChannel("ChannelID","myApp", NotificationManager.IMPORTANCE_HIGH);

                // Create Pending Intent
                Intent intent = new Intent(getBaseContext(), NotificationActivityDemo.class);
                PendingIntent pendingIntent = PendingIntent.getActivities(getBaseContext(),0, new Intent[]{intent},0);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(getBaseContext(),"ChannelID");
                builder.setContentTitle("Hello")
                        .setSmallIcon(R.drawable.facebook)
                        .setContentText("This is content info")
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setWhen(System.currentTimeMillis())
                        .setContentIntent(pendingIntent);

                notificationManager.createNotificationChannel(channel);
                notificationManager.notify(1, builder.build());
            }
        });
    }

}