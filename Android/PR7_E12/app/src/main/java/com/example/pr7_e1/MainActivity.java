package com.example.pr7_e1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4;
    Button btn;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        e3 = (EditText) findViewById(R.id.et3);
        e4 = (EditText) findViewById(R.id.et4);
        tv = (TextView) findViewById(R.id.tv1);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, roll, b, d;
                name = e1.getText().toString();
                roll = e2.getText().toString();
                b = e3.getText().toString();
                d = e4.getText().toString();
                tv.setText("Name: "+name+"\nRoll No: "+roll+"\nBranch: "+b+"\nDivision:"+d);
            }
        });
    }
}