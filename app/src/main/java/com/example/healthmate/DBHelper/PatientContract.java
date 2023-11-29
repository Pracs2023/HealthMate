package com.example.healthmate.DBHelper;

import android.provider.BaseColumns;

public final class PatientContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PatientContract() {
    }

    /* Inner class that defines the table contents */
    public static class PateintDetail implements BaseColumns {
        public static final String TABLE_NAME = "patients";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_USER = "username";
        public static final String COLUMN_AGE = "age";
        public static final String COLUMN_PASSWORD = "password";
    }
}
