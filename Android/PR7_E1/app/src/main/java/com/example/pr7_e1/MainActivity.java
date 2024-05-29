package com.example.pr7_e1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.uname);
        e2 = (EditText) findViewById(R.id.pass);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ed1, ed2;
                ed1 = e1.getText().toString();
                ed2 = e2.getText().toString();
                Toast.makeText(MainActivity.this, "Username: " + ed1 + "\nPassword: " + ed2, Toast.LENGTH_LONG).show();
            }
        });
    }
}