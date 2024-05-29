package com.example.extract_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
    }

    public void submit(View v) {
        String u = uname.getText().toString();
        String p = pass.getText().toString();
        String t = "Username:" + u + "\n Password:" + p;
        Toast.makeText(this,t,Toast.LENGTH_LONG).show();

    }
}