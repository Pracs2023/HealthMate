package com.example.healthmate.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + PatientContract.PateintDetail.TABLE_NAME + " (" +
                    PatientContract.PateintDetail._ID + " INTEGER PRIMARY KEY AUTO_INCREMENT," +
                    PatientContract.PateintDetail.COLUMN_NAME + " TEXT," +
                    PatientContract.PateintDetail.COLUMN_USER + " TEXT," +
                    PatientContract.PateintDetail.COLUMN_PASSWORD + " TEXT," +
                    PatientContract.PateintDetail.COLUMN_AGE  + " INTEGER)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + PatientContract.PateintDetail.TABLE_NAME;
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
}
