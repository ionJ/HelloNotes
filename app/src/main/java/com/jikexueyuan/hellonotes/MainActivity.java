package com.jikexueyuan.hellonotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button textbtn, imgbtn, videobtn;
    private ListView lv;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        lv = (ListView)findViewById(R.id.list);
        textbtn = (Button)findViewById(R.id.text);
        imgbtn = (Button)findViewById(R.id.img);
        videobtn = (Button)findViewById(R.id.video);
        textbtn.setOnClickListener(this);
        imgbtn.setOnClickListener(this);
        videobtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        i = new Intent(this, AddContent.class);
        switch (v.getId()){
            case R.id.text:
                i.putExtra("flag", "1");
                startActivity(i);
                break;
            case R.id.img:
                i.putExtra("flag", "2");
                startActivity(i);
                break;
            case R.id.video:
                i.putExtra("flag", "3");
                startActivity(i);
                break;
        }
    }


}
