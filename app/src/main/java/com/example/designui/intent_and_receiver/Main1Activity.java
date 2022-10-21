package com.example.designui.intent_and_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.designui.R;

public class Main1Activity extends AppCompatActivity {

    Button button1, button2;
    Receiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proadcast_resiver_activity);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.bnt2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=w3schools&oq=W3schools&aqs=chrome.0.0i131i433i512j0i20i131i263i433i512j0i512l7.7454j0j4&sourceid=chrome&ie=UTF-8"));
                startActivity(i);
            }
        });

        button2.setOnClickListener(view -> {
            Intent intent = new Intent( Main1Activity.this, Main2Activity.class);
            StudentClass student = new StudentClass(15,"vuthin");
            intent.putExtra("Name" ,"vuthin");
            intent.putExtra("ID", "00009");
            intent.putExtra("keyStudent",student);
            startActivity(intent);
        });
    }
    //when close app
    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }
}