package com.example.designui.images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.designui.R;

public class ImageViewActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view_activity);

        imageView = findViewById(R.id.img1);

        Glide.with(this)
                .load("https://www.billboard.com/wp-content/uploads/2020/04/Lisa-BlackPink-2019-Coachella-skdo-Billboard-1548-1588262269.jpg?w=942&h=623&crop=1")
                .placeholder(R.drawable.ic_vuthin).into(imageView);
        // place holder user for
    }
}