package com.jmarkstar.s4;

import android.app.Application;


import com.jmarkstar.s4.greendao.DaoMaster;
import com.jmarkstar.s4.greendao.DaoSession;

import org.greenrobot.greendao.database.Database;

/**
 * Created by jmarkstar on 30/09/2017.
 */
public class S4Application extends Application {

    private DaoSession daoSession;

    @Override public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "mydb");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

}
