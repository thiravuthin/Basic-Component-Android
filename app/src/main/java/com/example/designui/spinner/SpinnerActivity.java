package com.example.designui.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.designui.R;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        Spinner spinner = findViewById(R.id.sn_id);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(
                this, R.array.countries, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        spinner.setAdapter(arrayAdapter);
    }
}