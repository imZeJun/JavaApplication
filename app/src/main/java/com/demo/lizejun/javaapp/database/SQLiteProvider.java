package com.demo.lizejun.javaapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author lizejun
 */
public class SQLiteProvider extends SQLiteOpenHelper {

    /**
     * 数据库名称。
     */
    public static final String DB_NAME = "SQLite.db";

    /**
     * 数据库版本号。
     */
    public static final int DB_VERSION = 1;

    /**
     * 数据表名。
     */
    public static final String TABLE_NAME = "table";

    /**
     * 创建数据库表，包含以下几个字段 id, name, age, val。
     */
    private static final String CREATE_TABLE =
            "CREATE TABLE m_table (id INT, name VARCHAR(10), age INT, val VARCHAR(10))";

    /**
     * 在 name 字段上创建索引。
     */
    private static final String CREATE_TABLE_INDEX =
            "CREATE index idxMTable on m_table(name)";


    public SQLiteProvider(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        db.execSQL(CREATE_TABLE_INDEX);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
