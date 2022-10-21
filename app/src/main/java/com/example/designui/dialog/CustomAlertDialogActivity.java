package com.example.designui.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.designui.R;



public class CustomAlertDialogActivity extends AppCompatActivity implements MyCustomDialog.MyCustomDialogListenerInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_custom_alert_activity);
        btnDialog();

    }
    /*btn click*/
    public void btnDialog(){
        Button btnCustomDialog = findViewById(R.id.btnCustomDialogID);
        btnCustomDialog.setOnClickListener(view -> {
            MyCustomDialog myCustomDialog = new MyCustomDialog();
            myCustomDialog.show(getSupportFragmentManager(),"MyCustomDialog");
        }
        );
    }

    @Override
    public void ApplyValue(String username, String password) {
        Log.d(CustomAlertDialogActivity.class.getSimpleName(), "applyValue :: " + username + "::" + password);
    }
}