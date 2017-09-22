package com.jmarkstar.s3.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.jmarkstar.s3.model.ProductoModel;

/**
 * Created by jmarkstar on 9/20/17.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "mydb.db";
    private static final int DB_VERSION = 1;

    private StringBuilder sbCreateTableProducto = new StringBuilder()
            .append("CREATE TABLE IF NOT EXISTS "+ ProductoModel.TABLE_NAME+" ( ")
            .append(ProductoModel.ID_FIELD+" INTEGER PRIMARY KEY AUTOINCREMENT, ")
            .append(ProductoModel.NOMBRE_FIELD+" TEXT, ")
            .append(ProductoModel.CATEGORIA_FIELD+" TEXT, ")
            .append(ProductoModel.STOCK_FIELD+" INTEGER )");

    public MySQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(sbCreateTableProducto.toString());
    }

    @Override public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
