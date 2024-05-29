package com.example.temperature_convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.temp);
        tv = (TextView) findViewById(R.id.result);
    }

    public void convert(View v) {
        String temperature = et.getText().toString();
        float temp = Float.parseFloat(temperature);
        float c = (temp - 32) * 5 / 9;
        tv.setText(temp + " Fahrenheit =" + c + " Celsius");

    }
}