package com.tathva.tathva_live.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tathva.tathva_live.R;


/**
 * Created by anand on 29/6/16.
 */
public class IntroSliderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_intro_slide, container, false);

        int slideImgId = getArguments().getInt("slideImgId", 0);
        String slideText = getArguments().getString("slideText", null);
        String slideTitle = getArguments().getString("slideTitle", null);

        ImageView slideImage = (ImageView) rootView.findViewById(R.id.slide);
        if (slideImage != null) {
            slideImage.setImageDrawable(getResources().getDrawable(slideImgId));
        }

        TextView slideTextView = (TextView) rootView.findViewById(R.id.slide_text);
        if (slideTextView != null) {
            slideTextView.setText(slideText);
        }

        TextView slideTitleView = (TextView) rootView.findViewById(R.id.title);
        if (slideTitleView != null) {
            slideTitleView.setText(slideTitle);
        }

        return rootView;
    }


}
