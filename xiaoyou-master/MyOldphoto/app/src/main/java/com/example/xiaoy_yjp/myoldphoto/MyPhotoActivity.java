package com.example.xiaoy_yjp.myoldphoto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.Vector;

public class MyPhotoActivity extends BaseActivity  {
    /**
     * 相册界面的退出按钮
     */
    private ImageButton album_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_photo);
        //view层的控件和业务层的控件，靠id关联和映射  给ib1赋值，即设置布局文件中的Button按钮Iimageid进行关联
        album_exit = findViewById(R.id.album_exit);
        album_exit.setOnClickListener(new OnClickListener() { //给ib1绑定监听事件
            @Override
            public void onClick(View v3) {
                Intent intent3 = new Intent(MyPhotoActivity.this, MainActivity.class); //给ib1添加响应事件
                startActivity(intent3); //启动
            }
        });
    }
}



