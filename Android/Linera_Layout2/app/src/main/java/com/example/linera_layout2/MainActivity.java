package com.example.linera_layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.message);
        ed = findViewById(R.id.edit);
    }

    public void show(View v) {
        String name = ed.getText().toString();
//        tv.setText("Welcome " + name);
        Toast.makeText(this, "Welcome to Android", Toast.LENGTH_LONG).show();
    }


}