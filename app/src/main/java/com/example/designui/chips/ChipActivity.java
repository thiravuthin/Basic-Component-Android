package com.example.designui.chips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.designui.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

public class ChipActivity extends AppCompatActivity {

    ChipGroup chipGroup;
    Chip chip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);

        chipGroup = findViewById(R.id.chip_groupID);

        chipGroup.setOnCheckedStateChangeListener((group, checkedIds) -> {
            chip = findViewById(group.getCheckedChipId());
            Toast.makeText(ChipActivity.this, chip.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}