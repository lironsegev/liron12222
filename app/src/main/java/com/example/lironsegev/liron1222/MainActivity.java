package com.example.lironsegev.liron1222;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    LinearLayout liron;
    ToggleButton tB1;
    Switch sw1;
    Random rnd = new Random();
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liron= (LinearLayout) findViewById(R.id.liron);
        tB1= (ToggleButton)findViewById(R.id.tB1);
        sw1= (Switch)findViewById(R.id.sw1);
    }

    public void change(View view) {
        if ((sw1.isChecked())&& (!tB1.isChecked())){
            liron.setBackgroundColor(Color.GREEN);
        }
        if ((sw1.isChecked())&& (tB1.isChecked())){
            liron.setBackgroundColor(Color.YELLOW);
        }
        if ((!sw1.isChecked())&& (!tB1.isChecked())){
            liron.setBackgroundColor(Color.BLUE);
        }
        if ((!sw1.isChecked())&& (tB1.isChecked())){
            liron.setBackgroundColor(Color.RED);
        }


    }


}
