package com.example.designui.animation.lottie;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.example.designui.R;
public class LottieActivity extends AppCompatActivity {

    boolean isSwitchOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);

        LottieAnimationView lottieAnimationView = findViewById(R.id.animaLottieID);
//play animation
//        lottieAnimationView.playAnimation();
//        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animator) {
//                lottieAnimationView.playAnimation();
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animator) {
//
//            }
//        });

//        lottie
//        lottieAnimationView.setOnClickListener(view -> {
//            lottieAnimationView.setSpeed(2f);
//
//            if(isSwitchOn){
//                lottieAnimationView.setMinAndMaxProgress(0.5f, 1.0f);
//                lottieAnimationView.playAnimation();
//                isSwitchOn = false;
//            }else {
//                lottieAnimationView.setMinAndMaxProgress(0.0f, 0.5f);
//                lottieAnimationView.playAnimation();
//                isSwitchOn = true;
//            }
//        });


    }
}