package com.example.xiaoy_yjp.myoldphoto;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.widget.Toast;
import android.view.View;

public class setting extends AppCompatActivity {
    /**
     * 设置界面的退出按钮
     */
    private ImageButton setting_exit;

    /**
     * 设置界面的发送QQ消息按钮
     */
    private Button QQ_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //view层的控件和业务层的控件，靠id关联和映射  给ib1赋值，即设置布局文件中的Button按钮Iimageid进行关联
        setting_exit = findViewById(R.id.setting_exit);
        setting_exit.setOnClickListener(new OnClickListener() { //给ib1绑定监听事件
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(setting.this, MainActivity.class); //给ib1添加响应事件
                startActivity(intent2); //启动
            }

        });

        QQ_send = findViewById(R.id.QQ_send);
        QQ_send.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="mqqwpa://im/chat?chat_type=wpa&uin=7403754";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });
    }

}
