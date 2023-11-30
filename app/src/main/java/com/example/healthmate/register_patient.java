package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.healthmate.DBHelper.DBHelper;

public class register_patient extends AppCompatActivity {
    DBHelper db;


    boolean checkusername(String u){
        return ! u.contains(" ");
    }
    boolean checkPassword(String Pass){
        return Pass.length() > 6 && !Pass.contains(" ");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_patient);
        db = new DBHelper(getApplicationContext());
        Button reg_btn = findViewById(R.id.reg_btn);
        EditText username = (EditText) findViewById(R.id.userName);
        EditText pass1 = (EditText) findViewById(R.id.password);
        EditText pass2 = (EditText) findViewById(R.id.cnf_password);
        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = username.getText().toString();
                String p1 = pass1.getText().toString();
                String p2 = pass2.getText().toString();
                if(!checkusername(u)){
                    return;
                }
                if(!checkPassword(p1)){
                    return;
                }
                if(!p1.equals(p2)){
                    return;
                }
                long id = db.insertPatient(u,p1);
                if(id > -1){
                    Toast.makeText(register_patient.this, "Registration Succesful", Toast.LENGTH_SHORT).show();
                }
                System.out.println(u + " " + p1 + " " + p2);
            }
        });
    }
}