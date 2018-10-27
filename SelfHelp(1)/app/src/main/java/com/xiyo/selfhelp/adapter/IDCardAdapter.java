package com.xiyo.selfhelp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.IDCardShowModel;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.util.List;

public class IDCardAdapter extends RecyclerView.Adapter<IDCardViewHolder> {
    private Context mContext;
    private List<IDCardShowModel> mDatas;
    private IDCardAdapter.OnItemClickListener mClickListener;
    private GlideImageLoader imageLoader;

    public IDCardAdapter(Context context, List<IDCardShowModel> datas) {
        this.mContext = context;
        this.mDatas = datas;
        imageLoader = new GlideImageLoader();
    }

    @Override
    public int getItemCount() {
        // TODO Auto-generated method stub
        Log.i("dc", "getItemCount: " + mDatas.size());
        return mDatas.size();
    }


    @Override
    public void onBindViewHolder(IDCardViewHolder arg0, int arg1) {
        Log.i("dc", "onBindViewHolder: " + arg1);
        arg0.id_name.setText(mDatas.get(arg1).getName());
        String number = mDatas.get(arg1).getNumber();
        arg0.id_num.setText(number.substring(0, 6) + "********" + number.substring(number.length() - 4));
        if (mDatas.get(arg1).getBitmap() != null) {
            arg0.idcard_face.setImageBitmap(mDatas.get(arg1).getBitmap());
        } else {
            arg0.idcard_face.setImageResource(R.mipmap.nophoto);
        }
        if(mDatas.get(arg1).getVerifyCode() == 0){
            arg0.comparison_status.setImageResource(R.mipmap.in_comparison);
        }else if(mDatas.get(arg1).getVerifyCode() == 1){
            arg0.comparison_status.setImageResource(R.mipmap.comparison_success);
        }else if(mDatas.get(arg1).getVerifyCode() == 2){
            arg0.comparison_status.setImageResource(R.mipmap.comparison_fail);
        }
    }

    @Override
    public IDCardViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.idcard_item, arg0, false);
        IDCardViewHolder holder = new IDCardViewHolder(view, mClickListener);
        return holder;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(IDCardAdapter.OnItemClickListener listener) {
        this.mClickListener = listener;
    }
}

class IDCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    // Item子布局上的一个元素
    ImageView idcard_face;
    RelativeLayout delete;
    ImageView comparison_status;
    TextView id_name;
    TextView id_num;

    IDCardAdapter.OnItemClickListener mListener;

    public IDCardViewHolder(View itemView, IDCardAdapter.OnItemClickListener listener) {
        super(itemView);
        // 关联引动该元素 ，在item.xml中findView，注意不要忘写(itemview.)
        this.mListener = listener;
        idcard_face = itemView.findViewById(R.id.idcard_face);
        delete = itemView.findViewById(R.id.delete);
        comparison_status = itemView.findViewById(R.id.comparison_status);
        id_name = itemView.findViewById(R.id.id_name);
        id_num = itemView.findViewById(R.id.id_num);
        delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("dc", "onClick: ");
        if(v.getId() == R.id.delete){
            if (mListener != null) {
                mListener.onItemClick(v, getPosition());
            }
        }

        // getpostion()为Viewholder自带的一个方法，用来获取RecyclerView当前的位置，将此作为参数，传出去
    }
}
