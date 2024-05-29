package com.example.gridview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String lang[] = {"C", "C++", "Java", "Python", "Android XML", "Php", "HTML"};
    GridView gv;
    ArrayAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = findViewById(R.id.gv);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lang);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String r = adapter.getItem(position).toString();
                Toast.makeText(MainActivity.this, r, Toast.LENGTH_SHORT).show();
            }
        });


    }
}