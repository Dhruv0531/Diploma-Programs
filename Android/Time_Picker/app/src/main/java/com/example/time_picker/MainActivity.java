package com.example.time_picker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
//import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
//    TimePicker tp;
    Button btn, btn1;
    DatePicker dp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tp = (TimePicker) findViewById(R.id.tp);
        dp = (DatePicker) findViewById(R.id.dp);
        btn = (Button) findViewById(R.id.b1);
//        btn1 = (Button) findViewById(R.id.b2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int d = dp.getDayOfMonth();
                int m = dp.getMonth() + 1;
                int y = dp.getYear();
                Toast.makeText(MainActivity.this, "Date:" + d + "-" + m + "-" + y, Toast.LENGTH_SHORT).show();
            }
        });
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int hours = tp.getHour();
//                int min = tp.getMinute();
//                String a;
//                if (hours > 12) {
//                    hours -= 12;
//                    a = "PM";
//                } else {
//                    a = "AM";
//                }
//                Toast.makeText(MainActivity.this, "Time:" + hours + ":" + min + " " + a, Toast.LENGTH_LONG).show();
//            }
//        });
    }
}