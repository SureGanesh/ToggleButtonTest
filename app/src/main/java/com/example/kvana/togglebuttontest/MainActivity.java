package com.example.kvana.togglebuttontest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;

import static com.example.kvana.togglebuttontest.R.id.layout;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    ToggleButton tg;
    RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tg= (ToggleButton) findViewById(R.id.togglebutton);
        r= (RelativeLayout) findViewById(layout);
        tg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked)
        {
            r.setBackgroundColor(Color.BLACK);
        }
        else
        {
            r.setBackgroundColor(Color.WHITE);
        }
    }
}
