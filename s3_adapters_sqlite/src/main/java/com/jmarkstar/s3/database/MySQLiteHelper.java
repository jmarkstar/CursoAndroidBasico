package com.jmarkstar.s3.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jmarkstar on 9/20/17.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "mydb.db";
    private static final int DB_VERSION = 1;

    public MySQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
