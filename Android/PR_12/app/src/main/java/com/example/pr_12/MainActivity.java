package com.example.pr_12;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1, rb2;
    RadioGroup rg;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rg = findViewById(R.id.rg);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = "";
                int id = rg.getCheckedRadioButtonId();
                RadioButton rb = findViewById(id);
                if (!rb1.isChecked() && !rb2.isChecked() && id == -1) {
                    Toast.makeText(MainActivity.this, "Nothing is Selected", Toast.LENGTH_SHORT).show();
                } else {
                    if (rb1.isChecked())
                        res += rb1.getText().toString() + "\n";
                    if (rb2.isChecked())
                        res += rb2.getText().toString() + "\n";
                    if (rb.isChecked())
                        res += rb.getText().toString() + "\n";
                    Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}