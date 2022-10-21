package com.example.designui.fragment;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.designui.R;
import com.example.designui.fragment.DynamicFragment.DynamicFragmentA;
import com.example.designui.fragment.DynamicFragment.DynamicFragmentB;

public class DynamicBlankFragmentActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dynamic_activity);

        Button btnDynamicFragment = findViewById(R.id.btnDynamicFragmentID);

        btnDynamicFragment.setOnClickListener(view -> {
            DynamicFragmentA dynamicFragmentA = new DynamicFragmentA();
            InterfaceMoveToFragment(dynamicFragmentA);
        });

        /*on click long*/
        btnDynamicFragment.setOnLongClickListener(view ->{
            DynamicFragmentB dynamicFragmentB = new DynamicFragmentB();
            InterfaceMoveToFragment(dynamicFragmentB);
            return true;
        });
    }

    /*1 Make Interface to call blank constrain layout*/
    private void InterfaceMoveToFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.constraintLayoutBlankFragmentDynamicID,fragment);
        fragmentTransaction.commit();
    }

}
