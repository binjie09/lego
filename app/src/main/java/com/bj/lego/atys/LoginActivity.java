package com.bj.lego.atys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bj.lego.R;

/**
 * Created by asus on 2016/4/19/019.
 */
public class LoginActivity extends Activity{
    private TextView reg_btn;
    private TextView forget_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        reg_btn = (TextView) findViewById(R.id.reg_button);
        reg_btn.setOnClickListener(new View.OnClickListener() { //注册按钮（一个TextView）的监听事件
          @Override
           public void onClick(View v) {
              Intent intent = new Intent(LoginActivity.this, RegActivity.class);
              startActivity(intent);
            }
        });
        forget_btn = (TextView) findViewById(R.id.forget_pwd);
        forget_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
