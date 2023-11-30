package com.example.healthmate.DBHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PatientContract.PatientDetail.TABLE_NAME + " (" +
                    PatientContract.PatientDetail._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    PatientContract.PatientDetail.COLUMN_USER + " TEXT," +
                    PatientContract.PatientDetail.COLUMN_PASSWORD + " TEXT," +
                    PatientContract.PatientDetail.COLUMN_AGE  + " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PatientContract.PatientDetail.TABLE_NAME;
    private static  final  String DB_NAME = "healthmate.db";
    private static final  int VERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES);
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);

    }
    public long insertPatient(String name, String pass){
        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(PatientContract.PatientDetail.COLUMN_USER, name);
        values.put(PatientContract.PatientDetail.COLUMN_PASSWORD, pass);


// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(PatientContract.PatientDetail.TABLE_NAME, null, values);
        return newRowId;
    }



}
