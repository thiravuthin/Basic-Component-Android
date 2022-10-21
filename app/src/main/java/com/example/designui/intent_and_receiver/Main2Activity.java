package com.example.designui.intent_and_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.designui.R;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resiver_main2_activity);

        textView = findViewById(R.id.txtActivity2);

        Intent intent = getIntent();
        String value = intent.getStringExtra("Name");
        String number   =  intent.getStringExtra("ID");
        StudentClass student = (StudentClass) intent.getSerializableExtra("keyStudent");

        textView.setText(value+ "::" + String.valueOf(number));

    }
}