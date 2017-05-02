package com.tathva.tathva_live.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tathva.tathva_live.R;


public class HowTo extends AppCompatActivity {
    public TextView instruction;
    public Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to);
        //instruction = (TextView) findViewById(R.id.instruction);
        back = (Button) findViewById(R.id.home);

    }

    public void onBackClick(View v) {
        finish();
        //Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
    }

}
