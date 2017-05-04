package com.tathva.tathva_live.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tathva.tathva_live.R;


/**
 * Created by anand on 29/6/16.
 */
public class IntroSliderPagerAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public IntroSliderPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        int slideImgId;
        String slideText;
        String slideTitle;

        switch (position) {
            case 0:
                slideImgId = R.drawable.slide1;
                slideText = mContext.getResources().getString(R.string.slide1_text);
                slideTitle = mContext.getResources().getString(R.string.slide1_title);
                break;
            case 1:
                slideImgId = R.drawable.slide2;
                slideText = mContext.getResources().getString(R.string.slide2_text);
                slideTitle = mContext.getResources().getString(R.string.slide2_title);
                break;

            case 2:
                slideImgId = R.drawable.slide3;
                slideText = mContext.getResources().getString(R.string.slide3_text);
                slideTitle = mContext.getResources().getString(R.string.slide3_title);
                break;

            case 3:
                slideImgId = R.drawable.slide4;
                slideText = mContext.getResources().getString(R.string.slide4_text);
                slideTitle = mContext.getResources().getString(R.string.slide4_title);
                break;

            case 4:
                slideImgId = R.drawable.slide5;
                slideText = mContext.getResources().getString(R.string.slide5_text);
                slideTitle = mContext.getResources().getString(R.string.slide5_title);
                break;

            default:
                slideImgId = R.drawable.slide1;
                slideText = mContext.getResources().getString(R.string.slide1_text);
                slideTitle = mContext.getResources().getString(R.string.slide1_title);
                break;
        }

        bundle.putInt("slideImgId", slideImgId);
        bundle.putString("slideTitle", slideTitle);
        bundle.putString("slideText", slideText);

        IntroSliderFragment introSliderFragment = new IntroSliderFragment();
        introSliderFragment.setArguments(bundle);

        return introSliderFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(POSITION_NONE);
    }
}
