package com.example.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("Activity Lifecycle", "onCreate() is called");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecycle", "onStart() is called");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle", "onPause() is called");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle", "onStop() is called");
    }

    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle", "onResume() is called");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecycle", "onRestart() is called");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle", "onDestroy() is called");
    }
}
