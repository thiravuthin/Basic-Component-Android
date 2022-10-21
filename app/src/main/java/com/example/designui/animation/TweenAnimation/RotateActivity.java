package com.example.designui.animation.TweenAnimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.designui.R;

public class RotateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_rotate_activity);

        ImageView imageView = findViewById(R.id.imgRotateID);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.my_rotate);
        imageView.startAnimation(animation);

    }
}