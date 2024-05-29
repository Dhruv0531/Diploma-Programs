package com.example.question5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button add, sub, mul, div;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.val1);
        e2 = (EditText) findViewById(R.id.val2);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        tv = (TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2;
                num1 = Float.parseFloat(e1.getText().toString());
                num2 = Float.parseFloat(e2.getText().toString());
                float r = num1 + num2;
                tv.setText("Addition:" + r);
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2;
                num1 = Float.parseFloat(e1.getText().toString());
                num2 = Float.parseFloat(e2.getText().toString());
                float r = num1 - num2;
                tv.setText("Subtraction:" + r);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2;
                num1 = Float.parseFloat(e1.getText().toString());
                num2 = Float.parseFloat(e2.getText().toString());
                float r = num1 * num2;
                tv.setText("Multiplication:" + r);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2;
                num1 = Float.parseFloat(e1.getText().toString());
                num2 = Float.parseFloat(e2.getText().toString());
                float r = num1 / num2;
                tv.setText("Division:" + r);
            }
        });
    }
}