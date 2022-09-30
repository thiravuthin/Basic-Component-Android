package com.example.designui.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.designui.R;

public class EditextActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editext);

        editText = findViewById(R.id.et1);
        button = findViewById(R.id.btn1);

        button.setOnClickListener(view -> {
            String text = editText.getText().toString();
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

            // add listener edit text
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                    String text = editText.getText().toString();
                    Toast.makeText(EditextActivity.this, text, Toast.LENGTH_SHORT).show();
                }
            });
            textView.setAllCaps(true);
            textView.setMaxLines(3);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        });
    }
}