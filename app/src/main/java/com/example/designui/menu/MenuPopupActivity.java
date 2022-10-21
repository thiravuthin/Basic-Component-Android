package com.example.designui.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import com.example.designui.R;

public class MenuPopupActivity extends AppCompatActivity {

    Button btnPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_popup_activity);

        btnPopupMenu = findViewById(R.id.btnPopupMenuId);
        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MenuPopupActivity.this, btnPopupMenu);
                popupMenu.getMenuInflater().inflate(R.menu.menu_option,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }
}