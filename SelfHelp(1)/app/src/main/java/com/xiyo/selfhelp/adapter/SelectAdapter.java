package com.xiyo.selfhelp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.ReservationModel;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.util.List;

public class SelectAdapter extends RecyclerView.Adapter<SelectViewHolder> {
    private Context mContext;
    private List<ReservationModel> mDatas;
    private OnItemClickListener mClickListener;
    private GlideImageLoader imageLoader;

    public SelectAdapter(Context context, List<ReservationModel> datas) {
        this.mContext = context;
        this.mDatas = datas;
        imageLoader = new GlideImageLoader();
    }

    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        return mDatas.size();
    }


    @Override
    public void onBindViewHolder(SelectViewHolder arg0, int arg1) {
        List<String> imgs = mDatas.get(arg1).getRoomTypeImgs();
        String url = imgs != null && imgs.size() != 0 ? mDatas.get(arg1).getRoomTypeImgs().get(0) : "";
//        if(imgs != null && imgs.size() != 0){
//            url = mDatas.get(arg1).getRoomTypeImgs().get(0);
//        }

//        Uri uri = !url.isEmpty() ? Uri.parse(url) : ;
        if(!url.isEmpty()){
            imageLoader.displayImage(mContext, url, arg0.img);
        }
//        arg0.img.setImageURI(uri);
        arg0.title.setText(mDatas.get(arg1).getRoomTypeName());
        Log.i("dc", "onBindViewHolder: " + mDatas.get(arg1).getDailyFees().getFee());
        arg0.price.setText(mDatas.get(arg1).getDailyFees().getFee() + "");
    }

    @Override
    public SelectViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.select_item, arg0, false);
        SelectViewHolder holder = new SelectViewHolder(view, mClickListener);
        return holder;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int postion);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mClickListener = listener;
    }

}

class SelectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    // Item子布局上的一个元素
    ImageView img;
    TextView title;
    TextView price;

    SelectAdapter.OnItemClickListener mListener;

    public SelectViewHolder(View itemView, SelectAdapter.OnItemClickListener listener) {
        super(itemView);
        // 关联引动该元素 ，在item.xml中findView，注意不要忘写(itemview.)
        this.mListener = listener;
        img = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.title);
        price = itemView.findViewById(R.id.price);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("dc", "onClick: ");
        if(mListener != null) {
            mListener.onItemClick(v, getPosition());
        }
        // getpostion()为Viewholder自带的一个方法，用来获取RecyclerView当前的位置，将此作为参数，传出去
    }

}