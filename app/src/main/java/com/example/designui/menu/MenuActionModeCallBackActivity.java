package com.example.designui.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.designui.R;

public class MenuActionModeCallBackActivity extends AppCompatActivity {

    Button btnCallbackActionModeMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_action_mode_callback_activity);

        btnCallbackActionModeMenu = findViewById(R.id.btnMenuActionModeCallBackID);

        btnCallbackActionModeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActionMode(mActionMode);
            }
        });
    }
    ActionMode.Callback mActionMode = new ActionMode.Callback() {

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu1, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    };

}