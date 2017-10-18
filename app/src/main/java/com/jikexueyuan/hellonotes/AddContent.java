package com.jikexueyuan.hellonotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class AddContent extends AppCompatActivity {

    private String val;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.addcontent);
        val = getIntent().getStringExtra("flag");
    }
}
