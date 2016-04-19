package com.tonikamitv.loginregister;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pc on 11/04/2016.
 */
public class AddJobData extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "DataBase.db";
    public static final String TABLE_NAME = "AddJob";
    public static final String COL_1 = "NameJob";
    public static final String COL_2 = "NameCompany";
    public static final String COL_3 = "Categry";
    public static final String COL_4 = "Adress";


    public AddJobData(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (NameJob TEXT, NameCompany TEXT,Category TEXT, Adress TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String NameJob, String NameCompany, String Category, String Adress) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,NameJob);
        contentValues.put(COL_2,NameCompany);
        contentValues.put(COL_3,Category);
        contentValues.put(COL_4,Adress);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }





}
