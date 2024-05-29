package com.example.progress_bar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ProgressBar cp, hp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cp = findViewById(R.id.cp);
        hp = findViewById(R.id.hp);
    }

    public void showcp(View view) {
        cp.setVisibility(View.VISIBLE);
    }

    public void showhp(View view) {
        hp.setVisibility(View.VISIBLE);

    }
}