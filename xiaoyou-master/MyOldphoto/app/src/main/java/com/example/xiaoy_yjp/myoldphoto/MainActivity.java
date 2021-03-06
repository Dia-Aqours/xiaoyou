package com.example.xiaoy_yjp.myoldphoto;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends BaseActivity  {
    /**
     * 主页前往设置的按钮
     */
    private ImageButton main_Goto_setting;

    /**
     * 主页前往相册的按钮
     */
    private ImageButton main_Goto_Album;

    /**
     * 主页前往照相的按钮
     */
    private ImageButton btnTakePhoto;

    /**
     * 相册的请求码
     */
    private static final int CODE_GALLERY_REQUEST = 0xa0;

    /**
     * 相机的请求码
     */
    private static final int CODE_CAMERA_REQUEST = 0xa1;

    /**
     * 拍照完成的请求码
     */
    private static final int CODE_RESULT_REQUEST = 0xa2;

    /**
     * 裁剪之前拍照后的暂时存储地
     */
    File fileUri = new File(Environment.getExternalStorageDirectory().getPath()  + "/picture2/photo.jpg");

    /**
     * 裁剪之前拍照后的暂时存储地的uri
     */
    private Uri imageUri;

    /**
     * 裁剪之后的照片的uri
     */
    private Uri cropImageUri;

    /**
     * 以时间命名后的图片路径
     */
    String copyNameF;


    private Context context = null;

    /**
     * 侧菜单
     */
    private PopupWindow popupWindow;
    private int from = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view层的控件和业务层的控件，靠id关联和映射  给main_Goto_setting赋值，即设置布局文件中的Button按钮Iimageid进行关联
        main_Goto_setting = findViewById(R.id.main_Goto_setting);
        main_Goto_setting.setOnClickListener(new OnClickListener(){ //给main_Goto_setting绑定监听事件
            @Override
            public void onClick(View v1){
                Intent intent1 = new Intent(MainActivity.this,setting.class) ; //给main_Goto_setting添加响应事件
                startActivity(intent1); //启动
            }

        });

        //view层的控件和业务层的控件，靠id关联和映射  给main_Goto_Album赋值，即设置布局文件中的Button按钮Iimageid进行关联
        main_Goto_Album = findViewById(R.id.main_Goto_Album);
        main_Goto_Album.setOnClickListener(new OnClickListener(){ //给main_Goto_Album绑定监听事件
            @Override
            public void onClick(View v6){
                Intent intent6 = new Intent(MainActivity.this,MyPhotoActivity.class) ; //给main_Goto_setting添加响应事件
                startActivity(intent6); //启动
            }

        });

        initView();
        btnTakePhoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v_p){
                openPicture();
            }
        });

        Button popLeftBtn = findViewById(R.id.menu);
//        Button popRightBtn = (Button)findViewById(R.id.pop_right_btn);
//        Button popBottomBtn = (Button)findViewById(R.id.pop_bottom_btn);
        popLeftBtn.setOnClickListener(popClick);
//        popRightBtn.setOnClickListener(popClick);
//        popBottomBtn.setOnClickListener(popClick);



    }
    private void initView(){
        btnTakePhoto = findViewById(R.id.main_Select_Photo);
    }


    private void openPicture(){

        AlertDialog.Builder builder = new  AlertDialog.Builder(MainActivity.this);
        builder.setTitle("请选择");
        builder.setItems(new String[]{"相机","相册"},new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog,int which){
                switch (which){
                    case 0: //相机
                        requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE}, new BaseActivity.RequestPermissionCallBack() {
                            @Override
                            public void granted() {
                                if (hasSdcard()) {
                                    imageUri = Uri.fromFile(fileUri);
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                                        //通过FileProvider创建一个content类型的Uri
                                        imageUri = FileProvider.getUriForFile(MainActivity.this, "com.example.xiaoy_yjp.myoldphoto.fileprovider", fileUri);
                                    PhotoUtils.takePicture(MainActivity.this, imageUri, CODE_CAMERA_REQUEST);
                                } else {
                                    Toast.makeText(MainActivity.this, "设备没有SD卡！", Toast.LENGTH_SHORT).show();
                                    Log.e("asd", "设备没有SD卡");
                                }
                            }

                            @Override
                            public void denied() {
                                Toast.makeText(MainActivity.this, "部分权限获取失败，正常功能受到影响", Toast.LENGTH_LONG).show();
                            }
                        });
                        break;
                    case 1 : //相册
                        requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, new BaseActivity.RequestPermissionCallBack() {
                            @Override
                            public void granted() {
                                PhotoUtils.openPic(MainActivity.this, CODE_GALLERY_REQUEST);
                            }

                            @Override
                            public void denied() {
                                Toast.makeText(MainActivity.this, "部分权限获取失败，正常功能受到影响", Toast.LENGTH_LONG).show();
                            }
                        });
                        break;
                }
            }
        });
        builder.create().show();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int output_X = 480, output_Y = 480;
        if (resultCode == RESULT_OK) {
            //创建文件夹和给图片按时间命名
            Bitmap bitmap =BitmapFactory.decodeStream(getClass().getResourceAsStream("/picture2/photo.jpg"));// 获取相机返回的数据，并转换为Bitmap图片格式
            String str= null;
            FileOutputStream b = null;
            File file = new File(Environment.getExternalStorageDirectory().getPath() + "/myImage/");
            file.mkdirs();// 创建文件夹，名称为myimage
            Date date= null;
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");//获取当前时间，进一步转化为字符串
            date =new Date();
            str=format.format(date);
            String fileName = "/myImage/"+str+".jpg";
            try {
                b = new FileOutputStream(fileName);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, b);// 把数据写入文件

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
//              try {
//                   b.flush();
//                   b.close();
 //           } catch (IOException e) {
 //                 e.printStackTrace();
 //           }
            }
            copyNameF = fileName ; //把路径传递出来
            File fileCropUri = new File(Environment.getExternalStorageDirectory().getPath() + copyNameF);

            switch (requestCode) {
                case CODE_CAMERA_REQUEST://拍照完成回调

                    cropImageUri = Uri.fromFile(fileCropUri);
                    PhotoUtils.cropImageUri(this, imageUri, cropImageUri, 1, 1, output_X, output_Y, CODE_RESULT_REQUEST);
                    //getBitmapFromUri(cropImageUri);
                  //  Bitmap newBitmap2 = GrayFilter.changeToGray(newBitmap,1);
                    //cropImageUri = Uri.parse(MediaStore.Images.Media.insertImage(getContentResolver(), newBitmap, null,null));
                    break;
                case CODE_GALLERY_REQUEST://访问相册完成回调
                    if (hasSdcard()) {
                        cropImageUri = Uri.fromFile(fileCropUri);
                        Uri newUri = Uri.parse(PhotoUtils.getPath(this, data.getData()));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
                            newUri = FileProvider.getUriForFile(this, "com.example.xiaoy_yjp.myoldphoto.fileprovider", new File(newUri.getPath()));
                        PhotoUtils.cropImageUri(this, newUri, cropImageUri, 1, 1, output_X, output_Y, CODE_RESULT_REQUEST);
                    } else {
                        Toast.makeText(MainActivity.this, "设备没有SD卡!", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }
        }
    }

    /**
     * 检查设备是否存在SDCard的工具方法
     */
    public static boolean hasSdcard() {
        String state = Environment.getExternalStorageState();
        return state.equals(Environment.MEDIA_MOUNTED);
    }


    OnClickListener popClick = new OnClickListener() {

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.menu:{
                    from = Location.LEFT.ordinal();
                    break;
                }
            }
            //调用此方法，menu不会顶置
            //popupWindow.showAsDropDown(v);
            initPopupWindow();

        }
    };


    /**
     * 添加新笔记时弹出的popWin关闭的事件，主要是为了将背景透明度改回来
     *
     */
    class popupDismissListener implements PopupWindow.OnDismissListener{

        @Override
        public void onDismiss() {
            backgroundAlpha(1f);
        }

    }

    /**
     * 侧边栏弹出
     *
     */
    protected void initPopupWindow(){
        View popupWindowView = getLayoutInflater().inflate(R.layout.pop, null);
        //内容，高度，宽度
        if(Location.BOTTOM.ordinal() == from){
            popupWindow = new PopupWindow(popupWindowView, WindowManager.LayoutParams.FILL_PARENT, WindowManager.LayoutParams.WRAP_CONTENT, true);
        }else{
            popupWindow = new PopupWindow(popupWindowView, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.FILL_PARENT, true);
        }
        //动画效果
        if(Location.LEFT.ordinal() == from){
            popupWindow.setAnimationStyle(R.style.AnimationLeftFade);
//        }else if(Location.RIGHT.ordinal() == from){
//            popupWindow.setAnimationStyle(R.style.AnimationRightFade);
//        }else if(Location.BOTTOM.ordinal() == from){
//            popupWindow.setAnimationStyle(R.style.AnimationBottomFade);
        }
        //菜单背景色
        ColorDrawable dw = new ColorDrawable(0xffffffff);
        popupWindow.setBackgroundDrawable(dw);
        //宽度
        //popupWindow.setWidth(LayoutParams.WRAP_CONTENT);
        //高度
        //popupWindow.setHeight(LayoutParams.FILL_PARENT);
        //显示位置
        if(Location.LEFT.ordinal() == from){
            popupWindow.showAtLocation(getLayoutInflater().inflate(R.layout.activity_main, null), Gravity.LEFT, 0, 500);
        }else if(Location.RIGHT.ordinal() == from){
            popupWindow.showAtLocation(getLayoutInflater().inflate(R.layout.activity_main, null), Gravity.RIGHT, 0, 500);
        }else if(Location.BOTTOM.ordinal() == from){
            popupWindow.showAtLocation(getLayoutInflater().inflate(R.layout.activity_main, null), Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);
        }
        //设置背景半透明
        backgroundAlpha(0.5f);
        //关闭事件
        popupWindow.setOnDismissListener(new popupDismissListener());

        popupWindowView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
				/*if( popupWindow!=null && popupWindow.isShowing()){
					popupWindow.dismiss();
					popupWindow=null;
				}*/
                // 这里如果返回true的话，touch事件将被拦截
                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
                return false;
            }
        });

        Button open = popupWindowView.findViewById(R.id.open);
        Button save = popupWindowView.findViewById(R.id.save);
        Button close = popupWindowView.findViewById(R.id.close);


        open.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Open", Toast.LENGTH_LONG).show();
                popupWindow.dismiss();
            }
        });

        save.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Open", Toast.LENGTH_LONG).show();
                popupWindow.dismiss();
            }
        });

        close.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Open", Toast.LENGTH_LONG).show();
                popupWindow.dismiss();
            }
        });
    }

    /**
     * 设置添加屏幕的背景透明度
     * @param bgAlpha
     */
    public void backgroundAlpha(float bgAlpha)
    {
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = bgAlpha; //0.0-1.0
        getWindow().setAttributes(lp);
    }

    /**
     * 菜单弹出方向
     *
     */
    public enum Location {

        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

    }

}











