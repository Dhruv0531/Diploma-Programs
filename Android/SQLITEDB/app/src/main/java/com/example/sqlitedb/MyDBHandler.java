package com.example.sqlitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHandler extends SQLiteOpenHelper {
    private static final String DB_NAME = "STUD_DB";
    private static final int DB_VERSION = 1;
    private static final String TB_CONTACT = "STUD_DETAILS";
    private static final String KEY_ID = "id";
    private static final String STUD_NAME = "name";
    private static final String STUD_ADD = "address";

    public MyDBHandler(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        String CREATE_TABLE = String.format("CREATE TABLE%s(%sINTEGER PRIMARY KEY AUTOINCREMENT,%sTEXT,%sTEXT)", TB_CONTACT, KEY_ID, STUD_ADD, STUD_ADD);
        String CREATE_TABLE = "CREATE TABLE " + TB_CONTACT + "(" + KEY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," + STUD_NAME + "TEXT," + STUD_ADD + "TEXT" + ")";
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TB_CONTACT);
        onCreate(db);
    }

    public void addNewContact(String name, String address) {
        //Get the Data Repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();
        //Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(STUD_NAME, name);
        values.put(STUD_ADD, address);
        // after adding all values we are passing content values to our table.
        db.insert(TB_CONTACT, null, values);
        // at last we are closing our database after adding database.
        db.close();
    }
}
