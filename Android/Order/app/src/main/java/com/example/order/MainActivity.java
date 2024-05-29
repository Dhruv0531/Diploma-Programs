package com.example.order;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3;
    Button btn;
    TextView txt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = 0;
                String result = "Selected Items:\n";
                if (cb1.isChecked()) {
                    result += "Pizza 100 Rs \n";
                    total += 100;
                }
                if (cb2.isChecked()) {
                    result += "Coffee 50 Rs\n";
                    total += 50;
                }
                if (cb3.isChecked()) {
                    result += "Burger 120 Rs\n";
                    total += 120;
                }
                txt.setText(result + "\nTotal:" + total);
                Toast.makeText(MainActivity.this, result + "\nTotal:" + total, Toast.LENGTH_SHORT).show();
            }
        });
    }
}