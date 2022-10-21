package com.example.designui.chipsAndChipGroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.designui.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class ChipActivity extends AppCompatActivity {

    ChipGroup chipGroup;
    Chip chip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chip_activity);

        chipGroup = findViewById(R.id.chip_groupID);

        chipGroup.setOnCheckedStateChangeListener((group, checkedIds) -> {
            chip = findViewById(group.getCheckedChipId());
            Toast.makeText(ChipActivity.this, chip.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}