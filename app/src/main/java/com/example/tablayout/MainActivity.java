package com.example.tablayout;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.main_tabLayout);
        viewPager=findViewById(R.id.main_pager);
        PagerAdapter adapter= new com.example.tablayout.PagerAdapter(getSupportFragmentManager());

        adapter.addTab(new MyTab("Food",CategoryFragment.newInstance(1,"Food")));
        adapter.addTab(new MyTab("Drink",CategoryFragment.newInstance(2,"Drink")));
        adapter.addTab(new MyTab("Deasert",CategoryFragment.newInstance(3,"Deasert")));
        adapter.addTab(new MyTab("Other",CategoryFragment.newInstance(4,"Other")));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}