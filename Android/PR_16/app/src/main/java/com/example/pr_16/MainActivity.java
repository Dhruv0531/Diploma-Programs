package com.example.pr_16;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d = dp.getDayOfMonth();
                int m = dp.getMonth() + 1;
                int y = dp.getYear();
                Toast.makeText(MainActivity.this, "Date:" + d + "-" + m + "-" + y, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int h = tp.getHour();
                int m = tp.getMinute();
                if(h>12){

                }
                Toast.makeText(MainActivity.this, "Time:" + h + ":" + m, Toast.LENGTH_SHORT).show();
            }
        });
    }
}