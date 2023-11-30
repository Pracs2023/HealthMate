package com.example.healthmate.DBHelper;

import android.provider.BaseColumns;

public final class PatientContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PatientContract() {
    }

    /* Inner class that defines the table contents */
    public static class PatientDetail implements BaseColumns {
        public static final String TABLE_NAME = "patients";
        public static final String COLUMN_USER = "username";
        public static final String COLUMN_AGE = "age";
        public static final String COLUMN_PASSWORD = "password";
    }

}
