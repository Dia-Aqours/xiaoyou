package com.example.xiaoy_yjp.myoldphoto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;


public class MyPhotoActivity extends BaseActivity  {
    private ImageButton ib3;
    private ImageView photo2;
    private ImageView emptyy;
    private ImageView imgShow;
    private File fileCropUri = new File(Environment.getExternalStorageDirectory().getPath() + "/picture/crop_photo.jpg");
    private File fileUri = new File(Environment.getExternalStorageDirectory().getPath() + "/picture/crop_photo.jpg");
    private static final int CODE_GALLERY_REQUEST = 0xa0;
    private static final int CODE_CAMERA_REQUEST = 0xa1;
    private static final int CODE_RESULT_REQUEST = 0xa2;
    private Uri imageUri;
    private Uri cropImageUri;
    Button button2;
    String s = Environment.getExternalStorageDirectory().getAbsolutePath() + "/picture/crop_photo 0.jpg";



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_photo);
        //view层的控件和业务层的控件，靠id关联和映射  给ib1赋值，即设置布局文件中的Button按钮Iimageid进行关联
        ib3 = (ImageButton) findViewById(R.id.iB3);
        ib3.setOnClickListener(new OnClickListener() { //给ib1绑定监听事件
            @Override
            public void onClick(View v3) {
                Intent intent3 = new Intent(MyPhotoActivity.this, MainActivity.class); //给ib1添加响应事件
                startActivity(intent3); //启动
            }

        });
    }

    public static boolean hasSdcard() {
        String state = Environment.getExternalStorageState();
        return state.equals(Environment.MEDIA_MOUNTED);
    }

}



