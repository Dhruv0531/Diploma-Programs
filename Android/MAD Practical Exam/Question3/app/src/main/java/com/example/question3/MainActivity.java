package com.example.question3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText rollno, name, age;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rollno = findViewById(R.id.rollno);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
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
                String r = rollno.getText().toString();
                String n = name.getText().toString();
                String a = age.getText().toString();
                txt.setText("Roll No: " + r + "\nName: " + n + "\nAge: " + a);
                Toast.makeText(MainActivity.this, "Roll No: " + r + "\nName: " + n + "\nAge: " + a, Toast.LENGTH_SHORT).show();
            }
        });
    }
}