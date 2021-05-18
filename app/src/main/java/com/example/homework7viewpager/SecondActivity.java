package com.example.homework7viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.circularreveal.CircularRevealWidget;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private ViewPageAdapter adapter;
    private ViewPager pager;
    private Button bntFirst, bntTwo, bntThree, bntGetStarted;
    private View view1;
    private TableLayout tableLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pager = findViewById(R.id.view_pager);
        bntFirst = findViewById(R.id.button_first);
        bntTwo = findViewById(R.id.button_two);
        bntThree = findViewById(R.id.button_three);
        bntGetStarted = findViewById(R.id.get_started);
        tableLayout = findViewById(R.id.table_lay);

        view1 = findViewById(R.id.layout_one);


        List<ModelOn> list = new ArrayList<>();
        list.add(new ModelOn(" ", " ", 0));
        list.add(new ModelOn("Smart Wallet", "Managing your money can be the easiest  thing you do all day.", R.drawable.walet3));
        list.add(new ModelOn("Effortless Budgeting", "Customize your budget categories and stay on top of your spending 24/7.", R.drawable.second));
        list.add(new ModelOn("Automatic Savings", "Set your savings goal, and let Empower figure out how to get you there.", R.drawable.svinya));
        adapter = new ViewPageAdapter(getSupportFragmentManager(), list);
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    view1.setVisibility(View.VISIBLE);
                } else {
                    view1.setVisibility(View.GONE);
                }

                if (position == 1) {
                    bntFirst.setVisibility(View.VISIBLE);
                } else {
                    bntFirst.setVisibility(View.GONE);
                }
                if (position == 2) {
                    bntTwo.setVisibility(View.VISIBLE);
                } else {
                    bntTwo.setVisibility(View.GONE);
                }
                if (position == 3) {
                    bntThree.setVisibility(View.VISIBLE);
                } else {
                    bntThree.setVisibility(View.GONE);
                }
                if (position == 3) {
                    bntThree.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    });
                }
            }



            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        bntGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });
        bntFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });
        bntTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });


    }
}
