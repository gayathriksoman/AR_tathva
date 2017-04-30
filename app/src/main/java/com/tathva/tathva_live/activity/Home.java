package com.tathva.tathva_live.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tathva.tathva_live.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setLogo(R.mipmap.revelio_icon);
        setSupportActionBar(myToolbar);
    }

    public void maps(View view)
    {
         Intent i=new Intent(this,MapsActivity.class);
        startActivity(i);
    }

    public void explore(View view)
    {
        Intent i=new Intent(this,SpotsList.class);
        startActivity(i);
    }

    public void howto(View view)
    {
        Intent i=new Intent(this,HowTo.class);
        startActivity(i);
    }
}
