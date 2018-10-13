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
    private ImageButton ib2;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //view层的控件和业务层的控件，靠id关联和映射  给ib1赋值，即设置布局文件中的Button按钮Iimageid进行关联
        ib2 = (ImageButton) findViewById(R.id.iB2);

        ib2.setOnClickListener(new OnClickListener() { //给ib1绑定监听事件
            @Override
            public void onClick(View vv) {
                Intent intent2 = new Intent(setting.this, MainActivity.class); //给ib1添加响应事件
                startActivity(intent2); //启动
            }

        });

        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);

        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="mqqwpa://im/chat?chat_type=wpa&uin=7403754";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });
    }

}
