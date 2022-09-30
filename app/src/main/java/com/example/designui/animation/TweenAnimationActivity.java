package com.example.designui.animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.designui.R;

public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
//Style 1
//         findViewById(R.id.btnPlayAnimation).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                YoYo.with(Techniques.ZoomIn)
//                        .duration(4000)
//                        .repeat(2)
//                        .playOn(findViewById(R.id.txtAnimation));
//            }
//        });
//Style 2
        Button button = findViewById(R.id.btnPlayAnimation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.ZoomOutDown)
                        .duration(4000)
                        .repeat(2)
                        .playOn(findViewById(R.id.txtAnimation));
            }
        });
    }
}