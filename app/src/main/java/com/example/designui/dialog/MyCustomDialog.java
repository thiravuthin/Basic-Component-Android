package com.example.designui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.designui.R;

/*  1.  Custom dialog class custom must extend AppCompatDialog
*   2.  Type to Override onCreateDialog : handle on implementation interface
*       + Inflate
*       + View
*       + Alertdialog.builder
*       +
*   3.  Type to Override onAttach : handle try catch throw exception
*   4.  Make custom interface
* */

public class MyCustomDialog extends AppCompatDialogFragment {

    EditText editTextUsername, editTextPassword;
    MyCustomDialogListenerInterface myCustomDialogListener;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        /*Inflate */
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.dialog_alert_custom, null);

        /*AlertDialog*/
        builder.setView(view)
                .setTitle("This is Alert Dialog")
                .setPositiveButton("Yes", (dialogInterface, i) -> myCustomDialogListener.ApplyValue(
                        editTextUsername.getText().toString(),
                        editTextPassword.getText().toString()))
                .setNegativeButton("No", (dialogInterface, i) -> {

                });

         editTextUsername = view.findViewById(R.id.etUsername);
         editTextPassword = view.findViewById(R.id.etPassword);
        return builder.create();
    }
    /**/
    @Override
    public void onAttach(@NonNull Context context) {

        try {
            myCustomDialogListener = (MyCustomDialogListenerInterface) context;
        } catch (ClassCastException classCastException){
            throw new ClassCastException(context.toString()+ "must implement myCustomDialogListener");
        }
            super.onAttach(context);
    }

    interface MyCustomDialogListenerInterface {
        void ApplyValue(String username, String password);
    }
}

