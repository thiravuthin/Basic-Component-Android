package com.example.designui.AutoCompletTextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.designui.R;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    String[] fruits = {"coconut", "spastic", "banana", "Orange", "Apple",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete_textview_activity);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, R.layout.my_custom_simpl_list, fruits);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
    }
}