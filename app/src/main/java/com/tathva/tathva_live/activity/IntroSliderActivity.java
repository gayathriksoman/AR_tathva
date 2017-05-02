package com.tathva.tathva_live.activity;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tathva.tathva_live.R;
import com.viewpagerindicator.CirclePageIndicator;


public class IntroSliderActivity extends AppCompatActivity {
    public static final String PREFS_FILE= "CliquePrepPreferences";

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_slider);

        mContext=this;

        editPreferenceFile();

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        IntroSliderPagerAdapter pagerAdapter = new IntroSliderPagerAdapter(getSupportFragmentManager(),mContext);
        if (viewPager != null) {
            viewPager.setAdapter(pagerAdapter);
        }

        CirclePageIndicator dotIndicator = (CirclePageIndicator) findViewById(R.id.dots);
        if (dotIndicator != null && viewPager != null) {
            dotIndicator.setViewPager(viewPager);
        }
    }



    public void editPreferenceFile(){
        SharedPreferences sharedpreferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean("isVisited", true);
        editor.apply();
    }
}