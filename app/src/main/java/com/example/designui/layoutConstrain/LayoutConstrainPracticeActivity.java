package com.example.designui.layoutConstrain;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.designui.R;

public class LayoutConstrainPracticeActivity extends AppCompatActivity {

    TextView textViewResult, labelFirst, labelSecond;
    EditText editText1, editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_constrain_practice_activity);

        textViewResult = findViewById(R.id.txtResult);
        labelFirst = findViewById(R.id.txtLabel1);
        labelSecond = findViewById(R.id.txtLabel2);
        editText1 = findViewById(R.id.editText3);
        editText2 = findViewById(R.id.editText4);
        button = findViewById(R.id.btnSum);
        onSum();
    }

    void onSum() {
        button.setOnClickListener(new View.OnClickListener() {
            int num1;

            @Override
            public void onClick(View view) {
                if (!editText1.getText().toString().isEmpty() || !editText2.getText().toString().isEmpty()) {
                    int num1 = Integer.parseInt(editText1.getText().toString());
                    int num2 = Integer.parseInt(editText2.getText().toString());
                    int result = num1 + num2;
                    textViewResult.setText(Integer.toString(result));
                    textViewResult.setVisibility(View.VISIBLE);
                } else {
                    labelFirst.setText("Number1 is required");
                    labelFirst.setTextColor(getResources().getColor(R.color.purple_200));
                    labelSecond.setText("Number2 is required");
                    textViewResult.setVisibility(View.GONE);
                }
            }
        });
    }
}