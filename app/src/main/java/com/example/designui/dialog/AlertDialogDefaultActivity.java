package com.example.designui.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.designui.R;

public class AlertDialogDefaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_alert_activity);

        TextView txtDialog = findViewById(R.id.txtDialog);
        txtDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* AlertDialog.builder: build shape of body dialog*/
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogDefaultActivity.this);
                builder.setTitle("Title Alert")
                        .setMessage("Are you sure you want to delete")
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertDialogDefaultActivity.this, "User say no", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertDialogDefaultActivity.this, "User confirm", Toast.LENGTH_SHORT).show();
                            }
                        });
                builder.create().show();

                /* AlertDialog */

            }
        });


    }
}