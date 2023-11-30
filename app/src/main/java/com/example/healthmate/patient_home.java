package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.healthmate.MyAdapters.DoctorAdapter;

import java.util.ArrayList;

public class patient_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);
        String[] namelist = {"Ram", "Shaym", "Gopi", "Meera", "Rahul", "Topibaaz", "Kapil", "Amisha", "Prachi"};
        DoctorAdapter adapter = new DoctorAdapter(getApplicationContext(),namelist);
        ListView doctor_list = (ListView) findViewById(R.id.doctor_list);
        doctor_list.setAdapter(adapter);
        doctor_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent i2 = new Intent(getApplicationContext(),doctor_detail.class);
                i2.putExtra("name",namelist[i]);
                startActivity(i2);
            }
        });


    }
}