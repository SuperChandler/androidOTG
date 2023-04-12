package com.superfan.otgDemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.superfan.otgDemo.otg.OTGUtil;

public class MainActivity extends AppCompatActivity {
    private Button bt_regist_listener,bt_save_file, bt_save_img, bt_read, bt_delete, bt_modify_name;
    private TextView tv_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {

    }

    private void initView() {
        bt_save_file = findViewById(R.id.bt_save_file);
        bt_save_img = findViewById(R.id.bt_save_img);
        bt_read = findViewById(R.id.bt_read);
        bt_delete = findViewById(R.id.bt_delete);
        bt_modify_name = findViewById(R.id.bt_modify_name);
        tv_log = findViewById(R.id.tv_log);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_regist_listener:
                OTGUtil.getInstance().init(MainActivity.this);
                break;
            case R.id.bt_save_file:
                break;
            case R.id.bt_save_img:
                break;
            case R.id.bt_read:
                break;
            case R.id.bt_delete:
                break;
            case R.id.bt_modify_name:
                break;
            default:
                break;
        }
    }
}