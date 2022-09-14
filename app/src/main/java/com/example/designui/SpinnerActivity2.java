package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
//
public class SpinnerActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);

        Spinner spinner= findViewById(R.id.spinner2);

        //initialize list of string
        List<String> categorizes = new ArrayList<>();
        categorizes.add("Apple");
        categorizes.add("Orange");
        categorizes.add("Banana");
        categorizes.add("Apple");
        categorizes.add("Apple");

        // create an array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,categorizes
        );
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        // set adapter to spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selectItem = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this,adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this,"Nothing",Toast.LENGTH_SHORT).show();
    }
}