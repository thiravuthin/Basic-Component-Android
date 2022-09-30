package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Method1Activity extends AppCompatActivity {

    String[] fruits = {"coconut", "spacti", "banana", "Orange", "Apple",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method1);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, R.layout.mycustom_simpl_list, fruits);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
    }
}