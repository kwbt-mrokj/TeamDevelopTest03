package com.example.kawabata.studysqlite_listviewfor0526;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kawabata on 2015/05/26.
 */
public class MyDbHelper extends SQLiteOpenHelper{

    static final String DATABASE_NAME = "myDatabase.db";
    static final int DATABASE_VERSION = 1;
    static final String TABLE_NAME = "myData";

    static final String ID = "_id";
    // 登録者
    static final String REG_NAME = "regName";
    // 登録内容
    static final String REG_CONTENT = "regContent";
    // 登録日時
    static final String REG_DATE = "regDate";


    public MyDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    public void onCreate(SQLiteDatabase db) {
        String query = "create table " + TABLE_NAME + "(" +
                ID + " INTEGER PRIMARY KEY autoincrement," +
                REG_NAME + " TEXT," +
                REG_CONTENT + " TEXT," +
                REG_DATE + " TEXT);";
        db.execSQL(query);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(db);
    }
}
