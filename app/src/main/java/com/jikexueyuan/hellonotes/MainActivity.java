package com.jikexueyuan.hellonotes;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // 创建数据库对象
    private NotesDB notesDB;
    // 创建可添加的权限
    private SQLiteDatabase dbWriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notesDB = new NotesDB(this);
        dbWriter = notesDB.getWritableDatabase();
        addDB();
    }

    public void addDB() {
        ContentValues cv = new ContentValues();
        cv.put(NotesDB.CONTENT, "Hello");
        cv.put(NotesDB.TIME, getTime());
        // 添加数据（表名，条件，添加内容）
        dbWriter.insert(NotesDB.TABLE_NAME, null, cv);
    }

    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date curData = new Date();
        String str = format.format(curData);
        return str;
    }
}
