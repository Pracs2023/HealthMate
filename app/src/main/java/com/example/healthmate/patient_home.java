package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.healthmate.MyAdapters.DoctorAdapter;

import java.util.ArrayList;

public class patient_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);
        ArrayList<String> doctors = new ArrayList<>();
        String names[] = {"Ram", "Shaym", "Gopi", "Meera", "Rahul", "Topibaaz", "Kapil", "Amisha", "Prachi"};
        DoctorAdapter adapter = new DoctorAdapter(getApplicationContext(),names);
        ListView doctor_list = (ListView) findViewById(R.id.doctor_list);
        doctor_list.setAdapter(adapter);
    }
}