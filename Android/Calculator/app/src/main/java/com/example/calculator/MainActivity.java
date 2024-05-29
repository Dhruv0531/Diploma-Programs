package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ip1, ip2;
    TextView op, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ip1 = (EditText) findViewById(R.id.val1);
        ip2 = (EditText) findViewById(R.id.val2);
        op = (TextView) findViewById(R.id.operator);
        result = (TextView) findViewById(R.id.result);
    }

    public void clear(View v) {
        ip1.setText("");
        ip2.setText("");
        op.setText("");
        result.setText("");
    }

    public void divide(View v) {
        op.setText("/");
    }

    public void mul(View v) {
        op.setText("*");
    }

    public void sub(View v) {
        op.setText("-");
    }

    public void add(View v) {
        op.setText("+");
    }

    public void mod(View v) {
        op.setText("%");
    }

    public void equal(View v) {
        String val1, val2, o, r;
        val1 = ip1.getText().toString();
        val2 = ip2.getText().toString();
        o = op.getText().toString();
        Float v1 = Float.parseFloat(val1);
        Float v2 = Float.parseFloat(val2);
        if (o == "/") {
            Float div = v1 / v2;
            r = div.toString();
            result.setText(r);
        } else if (o == "%") {
            Float mod = v1 % v2;
            r = mod.toString();
            result.setText(r);
        } else if (o == "*") {
            Float mul = v1 * v2;
            r = mul.toString();
            result.setText(r);
        } else if (o == "+") {
            Float add = v1 + v2;
            r = add.toString();
            result.setText(r);
        } else if (o == "-") {
            Float sub = v1 - v2;
            r = sub.toString();
            result.setText(r);
        } else {
            op.setText("Invalid Input");
        }

    }
}