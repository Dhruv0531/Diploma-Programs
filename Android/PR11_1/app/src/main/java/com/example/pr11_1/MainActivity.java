package com.example.pr11_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.c);
        cb2 = findViewById(R.id.cpp);
        cb3 = findViewById(R.id.java);
        cb4 = findViewById(R.id.py);
        cb5 = findViewById(R.id.js);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                if (cb1.isChecked()) {
                    result += cb1.getText().toString() + "\n";
                }
                if (cb2.isChecked()) {
                    result += cb2.getText().toString() + "\n";
                }
                if (cb3.isChecked()) {
                    result += cb3.getText().toString() + "\n";
                }
                if (cb4.isChecked()) {
                    result += cb4.getText().toString() + "\n";
                }
                if (cb5.isChecked()) {
                    result += cb5.getText().toString() + "\n";
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}