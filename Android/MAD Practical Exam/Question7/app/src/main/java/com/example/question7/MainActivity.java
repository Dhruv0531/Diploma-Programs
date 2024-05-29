package com.example.question7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    Button btn;
    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rg);
        btn = findViewById(R.id.btn);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
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
                        res += rb1.getText().toString();
                    if (rb2.isChecked())
                        res += rb2.getText().toString();
                    Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}