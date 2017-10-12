package com.jikexueyuan.hellonotes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class NotesDB extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "notes";  // 表名
    public static final String CONTENT = "content";   // 内容
    public static final String ID = "_id";          // id
    public static final String TIME = "time";    //创建时间

    public NotesDB(Context context) {
        //context, 库名, null, 版本号
        super(context, "notes", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建新表 + （ID列 id为INTEGER 类型并且主键自增 + 内容列 内容为 TEXT 类型且不为空 + 时间列 时间为 TEXT 类型且不为空）
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + CONTENT
                + " TEXT NOT NULL," + TIME + " TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
