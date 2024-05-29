package com.example.auto_complete_text;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView tv;
    String sub[] = {"English", "Physics and Chemistry",
            "Basic Mathematics",
            "Fundamental of ICT",
            "Engineering Graphics",
            "Workshop Practice",
            "Elements of electrical Engineering",
            "Applied Mathematics",
            "Basic Electronics",
            "Programming in C",
            "Business Communication using Computers",
            "Computer Pheripheral and Hardware Maintenance",
            "Web page Designing with HTML",
            "Object Oriented Programming Using C++",
            "Data Structures in C",
            "Computer Graphics",
            "Database Management System ",
            "Digital Techniques",
            "Java Programming ",
            "Software Engineering",
            "Data Communication and Computer Network",
            "Microprocessor",
            "GUI Application Development using VB.Net",
            "Environmental Studies ",
            "Operating System",
            "Advanced Java Programming",
            "Software Testing",
            "Advanced Computer Network",
            "Capstone Project Planning",
            "Management",
            "Programming with Python",
            "Mobile Application Development",
            "Network Information Security",
            "Emerging Trends in Computer and Information Technology",
            "Enterpreneurship Development",
            "Capstone Project-Execution & Report Writing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (AutoCompleteTextView) findViewById(R.id.tv);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sub);
        tv.setAdapter(adapter);
        tv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String txt = tv.getText().toString();
                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_LONG).show();
            }
        });
    }
}