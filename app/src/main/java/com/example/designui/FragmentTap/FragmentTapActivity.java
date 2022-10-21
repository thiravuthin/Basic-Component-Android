package com.example.designui.FragmentTap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.designui.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentTapActivity extends AppCompatActivity {

    TabLayout tableLayout;
    ViewPager2 viewPager2;
     ViewPagerAdapter viewPagerAdapter;
     ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_tap_activity);

        tableLayout = findViewById(R.id.tabLayoutID);
        viewPager2 = findViewById(R.id.viewPapger2ID);
        adapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator( tableLayout, viewPager2,(tab,  position) -> {
            tab.setText(labels[position]);
        }).attach();
    }

    /**/
    String[] labels = {"One","Two","Three"};
    class ViewPagerAdapter extends FragmentStateAdapter{
        public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {

            Fragment fragment=null;

            switch (position){
                case 0: fragment = new fragmentOne(); break;
                case 1: fragment = new fragmentTwo(); break;
                case 2: fragment = new fragmentThree(); break;
            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return labels.length;
        }
    }

}