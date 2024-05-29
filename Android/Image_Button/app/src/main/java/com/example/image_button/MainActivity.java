package com.example.image_button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton r1, r2, r3;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.b);
        r1 = (RadioButton) findViewById(R.id.b1);
        r2 = (RadioButton) findViewById(R.id.b3);
        r3 = (RadioButton) findViewById(R.id.b3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()) {
                    Toast.makeText(MainActivity.this, r1.getText().toString(), Toast.LENGTH_LONG).show();
                } else if (r2.isChecked()) {
                    Toast.makeText(MainActivity.this, r2.getText().toString(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, r3.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}