package com.imooc.submenudemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    //添加点击菜单显示的内容
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //设置点击子菜单操作

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.op:
                Toast.makeText(this,"打开",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sa:
                Toast.makeText(this,"保存",Toast.LENGTH_SHORT).show();
                break;
            case R.id.de:
                Toast.makeText(this,"删除",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cp:
                Toast.makeText(this,"保存",Toast.LENGTH_SHORT).show();
                break;
            case R.id.xx:
                Toast.makeText(this,"剪切",Toast.LENGTH_SHORT).show();
                break;
            case R.id.vv:
                Toast.makeText(this,"粘贴",Toast.LENGTH_SHORT).show();
                break;
            case R.id.re:
                Toast.makeText(this,"重命名",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
