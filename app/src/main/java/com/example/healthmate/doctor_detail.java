package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class doctor_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        TextView doc_name = (TextView) findViewById(R.id.doc_name);
        doc_name.setText(name);
    }
}