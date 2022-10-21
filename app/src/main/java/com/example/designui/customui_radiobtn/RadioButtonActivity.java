package com.example.designui.customui_radiobtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.designui.R;

public class RadioButtonActivity extends AppCompatActivity {

    private String TAG = "log";
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button_activity);

        radioGroup = findViewById(R.id.radioGroupGender);
        radioGroup.setOnCheckedChangeListener((radioGroup, buttonId) -> {
            radioButton = findViewById(buttonId);
            Toast.makeText(this, radioButton.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}