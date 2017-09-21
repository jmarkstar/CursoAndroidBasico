package com.jmarkstar.s3;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SqliteActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, SqliteActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        getSQLiteVersion();
    }


    private void getSQLiteVersion(){
        String query = "select sqlite_version() AS sqlite_version";
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(":memory:", null);
        Cursor cursor = db.rawQuery(query, null);
        String sqliteVersion = "";
        if (cursor.moveToNext()) {
            sqliteVersion = cursor.getString(0);
            Log.v("SqliteActivity", "sqliteVersion = "+sqliteVersion);
        }
        cursor.close();
    }
}
