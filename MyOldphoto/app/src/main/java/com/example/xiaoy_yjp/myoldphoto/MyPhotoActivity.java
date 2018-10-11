package com.example.xiaoy_yjp.myoldphoto;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.File;
import java.util.Vector;


public class MyPhotoActivity extends BaseActivity  {
    private ImageButton ib3;
    private ImageView photo2;
    private ImageView emptyy;
    private ImageView imgShow;
    private File fileCrUri = new File(Environment.getExternalStorageDirectory().getPath() + "/myImage/");
    private File fileUri = new File(Environment.getExternalStorageDirectory().getPath() + "/picture/crop_photo.jpg");
    private static final int CODE_GALLERY_REQUEST = 0xa0;
    private static final int CODE_CAMERA_REQUEST = 0xa1;
    private static final int CODE_RESULT_REQUEST = 0xa2;
    private Uri imageUri;
    private Uri cropImageUri;
    Button button2;
    String s = Environment.getExternalStorageDirectory().getAbsolutePath() + "/picture/crop_photo 0.jpg";
    private LinearLayout llGroup;
    Vector<String> imagePathArray=new Vector<String>();
    String a[];
    int num = 0;
    private LinearLayout contentLlayout;
    private ImageView addImg;
    public Uri dog;

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
        imglist();
        imgselect();
    }

    public static boolean hasSdcard() {
        String state = Environment.getExternalStorageState();
        return state.equals(Environment.MEDIA_MOUNTED);
    }

    public void imglist(){
        File dir = new File(Environment.getExternalStorageDirectory().getPath() + "/myImage/");
        File dirr = new File(Environment.getExternalStorageDirectory().getPath() + "/myImage/20181009114128.jpg");
        File file[] = dir.listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile())
            {
                String icon=file[i].getAbsolutePath();
                if (icon.endsWith(".png") || icon.endsWith(".PNG") ||//这里仅仅加入png和jpg文件格式，需要其他格式就在这里增加判断
                        icon.endsWith(".jpg") || icon.endsWith(".jpg"))
                    imagePathArray.add(icon);
            }
        }
        dog = Uri.fromFile(dirr);
    }

    public void imgselect(){
        File sceneFile = new File(Environment.getExternalStorageDirectory().getPath() + "/myImage/");
        File[] files = sceneFile.listFiles();

        if (null != files) {

            for (int i = 0; i < files.length; i++) {

              //  uri[i] = files[i].getName();

            }
            num = files.length;

        }

    }


}



