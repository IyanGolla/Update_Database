package com.example.updatedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String Database_name = "Student.db";
    public static final String Table_name = "Student.table";
    public static final String Column_1 = "Student.column1";
    public static final String name = "Student.name";
    public static final String surname = "Student.surname";

    public DatabaseHelper(Context context)


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
