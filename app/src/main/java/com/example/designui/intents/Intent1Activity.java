package com.example.designui.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.designui.R;

public class Intent1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        Button btnDial = findViewById(R.id.btnDialID);
        Button btnOpen = findViewById(R.id.btnOpenID);

        btnOpen.setOnClickListener(view -> {
            //Intent.ACTION_VIEW
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.youtube.com"));
            startActivity(intent);
        });

        btnDial.setOnClickListener(view -> {
            //Intent.ACTION_DIAL
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+ "0964141077"));
            startActivity(intent);
        });



    }
}