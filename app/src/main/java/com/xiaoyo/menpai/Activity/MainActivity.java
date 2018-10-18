package com.xiaoyo.menpai.Activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.xiaoyo.menpai.R;
import com.xiaoyo.menpai.Tools.ImageCarousel;
import com.xiaoyo.menpai.Tools.ImageInfo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 图片轮播控件
    private ViewPager mViewPager;
    private TextView mTvPagerTitle;
    private LinearLayout mLineLayoutDot;
    private ImageCarousel imageCarousel;
    private List<View> dots;//小点

    // 图片数据，包括图片标题、图片链接、数据、点击要打开的网站（点击打开的网页或一些提示指令）
    private List<ImageInfo> imageInfoList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
        imageStart();
    }

//    @Override
//    public void onClick(View v) {
//
//    }

    /**
     * 初始化事件
     */
    private void initEvent() {
        imageInfoList = new ArrayList<>();
        imageInfoList.add(new ImageInfo(1, "酒店广告1，公告1", "", "http://d.hiphotos.baidu.com/image/pic/item/6159252dd42a2834a75bb01156b5c9ea15cebf2f.jpg", "http://www.cnblogs.com/luhuan/"));
        imageInfoList.add(new ImageInfo(1, "酒店广告2，公告2", "", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1540447617&di=feec3c9fc21a97bb0cd02eba3cf92a59&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.wallcoo.com%2Fcartoon%2Ffuture_tech_background%2Fwallpapers%2F1920x1200%2F%255Bwallcoo_com%255D_3537_future_TECH_Image.jpg", "http://www.cnblogs.com/luhuan/"));
        imageInfoList.add(new ImageInfo(1, "酒店广告3，公告3", "", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1540447576&di=847ecce2f4657b94236a5205ceccf8cc&imgtype=jpg&er=1&src=http%3A%2F%2Fuploads.5068.com%2Fallimg%2F151024%2F48-151024134134-50.jpg", "http://www.cnblogs.com/luhuan/"));
        imageInfoList.add(new ImageInfo(1, "酒店广告4，公告4", "仅展示", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1539852742788&di=b4882ca2012e7cd055013c856e8eae16&imgtype=0&src=http%3A%2F%2Fimg5q.duitang.com%2Fuploads%2Fitem%2F201302%2F05%2F20130205191740_85ada.jpeg", ""));
        imageInfoList.add(new ImageInfo(1, "酒店广告5，公告5", "仅展示", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1539852832184&di=fcee60f1dbc7a51aaa3a38d37c699c23&imgtype=0&src=http%3A%2F%2Fimg14.poco.cn%2Fmypoco%2Fmyphoto%2F20130217%2F15%2F65835566201302171524102449422322537_024.jpg", ""));


    }

    /**
     * 初始化控件
     */
    private void initView() {

        mViewPager = findViewById(R.id.viewPager);
        mTvPagerTitle = findViewById(R.id.tv_pager_title);
        mLineLayoutDot = findViewById(R.id.lineLayout_dot);

    }

    private void imageStart() {
        //设置图片轮播
        int[] imgaeIds = new int[]{R.id.pager_image1, R.id.pager_image2, R.id.pager_image3, R.id.pager_image4,
                R.id.pager_image5, R.id.pager_image6, R.id.pager_image7, R.id.pager_image8};
        String[] titles = new String[imageInfoList.size()];
        List<SimpleDraweeView> simpleDraweeViewList = new ArrayList<>();

        for (int i = 0; i < imageInfoList.size(); i++) {
            titles[i] = imageInfoList.get(i).getTitle();
            Fresco.initialize(this);
            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this);
            simpleDraweeView.setAspectRatio(1.78f);
            // 设置一张默认的图片
            GenericDraweeHierarchy hierarchy = new GenericDraweeHierarchyBuilder(this.getResources())
                    .setPlaceholderImage(ContextCompat.getDrawable(this, R.drawable.defult), ScalingUtils.ScaleType.CENTER_CROP).build();
            simpleDraweeView.setHierarchy(hierarchy);
            simpleDraweeView.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.WRAP_CONTENT));

            //加载高分辨率图片;
            ImageRequest imageRequest = ImageRequestBuilder.newBuilderWithSource(Uri.parse(imageInfoList.get(i).getImage()))
                    .setResizeOptions(new ResizeOptions(1280, 720))
                    .build();
            PipelineDraweeController controller = (PipelineDraweeController) Fresco.newDraweeControllerBuilder()
                    //.setLowResImageRequest(ImageRequest.fromUri(Uri.parse(listItemBean.test_pic_low))) //在加载高分辨率图片之前加载低分辨率图片
                    .setImageRequest(imageRequest)
                    .setOldController(simpleDraweeView.getController())
                    .build();
            simpleDraweeView.setController(controller);

            simpleDraweeView.setId(imgaeIds[i]);//给view设置id
            simpleDraweeView.setTag(imageInfoList.get(i));
            simpleDraweeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            titles[i] = imageInfoList.get(i).getTitle();
            simpleDraweeViewList.add(simpleDraweeView);

        }

        dots = addDots(mLineLayoutDot, fromResToDrawable(this, R.drawable.ic_dot_focused), simpleDraweeViewList.size());
        imageCarousel = new ImageCarousel(this, mViewPager, mTvPagerTitle, dots, 5000);
        imageCarousel.init(simpleDraweeViewList, titles)
                .startAutoPlay();
        imageCarousel.start();

    }


    /**
     * 动态添加一个点
     *
     * @param linearLayout 添加到LinearLayout布局
     * @param backgount    设置
     * @return 小点的Id
     */
    private int addDot(final LinearLayout linearLayout, Drawable backgount) {
        final View dot = new View(this);
        LinearLayout.LayoutParams dotParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        dotParams.width = 16;
        dotParams.height = 16;
        dotParams.setMargins(4, 0, 4, 0);
        dot.setLayoutParams(dotParams);
        dot.setBackground(backgount);
        dot.setId(View.generateViewId());
        (this).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                linearLayout.addView(dot);
            }
        });

        return dot.getId();
    }


    /**
     * 资源图片转Drawable
     *
     * @param context 上下文
     * @param resId   资源ID
     * @return 返回Drawable图像
     */
    public static Drawable fromResToDrawable(Context context, int resId) {
        return ContextCompat.getDrawable(context, resId);
        //return context.getResources().getDrawable(resId);
    }

    /**
     * 添加多个轮播小点到横向线性布局
     *
     * @param linearLayout 线性横向布局
     * @param backgount    小点资源图标
     * @param number       数量
     * @return 返回小点View集合
     */
    private List<View> addDots(final LinearLayout linearLayout, Drawable backgount, int number) {
        List<View> dots = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int dotId = addDot(linearLayout, backgount);
            dots.add(findViewById(dotId));

        }
        return dots;
    }


}
