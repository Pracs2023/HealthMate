package com.example.healthmate.MyAdapters;



import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.healthmate.R;


import java.util.ArrayList;

public class DoctorAdapter extends ArrayAdapter<String> {
    String [] namelist;
    Context _context;
    public DoctorAdapter(@NonNull Context context, String[] list) {
        super(context, 0,list);
        namelist = list;
        _context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View curr = convertView;
        if(curr == null){
            curr = LayoutInflater.from(getContext()).inflate(R.layout.doctor_card,parent,false);
        }
        TextView name_field = (TextView) curr.findViewById(R.id.name);
        TextView specialization = (TextView) curr.findViewById(R.id.specialization);
        name_field.setText(namelist[position]);

        return curr;
    }
}
