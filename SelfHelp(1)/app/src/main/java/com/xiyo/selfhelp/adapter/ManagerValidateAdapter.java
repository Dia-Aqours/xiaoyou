package com.xiyo.selfhelp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.ManagerEntity;
import com.xiyo.selfhelp.widget.GlideImageLoader;

import java.util.List;

public class ManagerValidateAdapter extends RecyclerView.Adapter<ManagerValidateViewHolder> {
    private Context mContext;
    private List<ManagerEntity> mDatas;
    private ManagerValidateAdapter.OnItemClickListener mClickListener;
    private GlideImageLoader imageLoader;

    public ManagerValidateAdapter(Context context, List<ManagerEntity> datas) {
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
    public void onBindViewHolder(ManagerValidateViewHolder arg0, int arg1) {
        if(mDatas.get(arg1).getPhone() != null && !mDatas.get(arg1).getPhone().isEmpty()){
            arg0.item_layout.setVisibility(View.VISIBLE);
            arg0.add_layout.setVisibility(View.GONE);
            arg0.name.setText("管理员" + arg1);
            arg0.phone.setText(mDatas.get(arg1).getPhone() + "");
        }else {
            arg0.item_layout.setVisibility(View.GONE);
            arg0.add_layout.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public ManagerValidateViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
        View view = null;
//        if(mDatas.get(arg1).getPhone() == null || "".equals(mDatas.get(arg1).getPhone())){
//            view = LayoutInflater.from(mContext).inflate(R.layout.manager_add, arg0, false);
//        }else {
            view = LayoutInflater.from(mContext).inflate(R.layout.manager_item, arg0, false);
//        }

        ManagerValidateViewHolder holder = new ManagerValidateViewHolder(view, mClickListener);
        return holder;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int postion);
    }

    public void setOnItemClickListener(ManagerValidateAdapter.OnItemClickListener listener) {
        this.mClickListener = listener;
    }
}

class ManagerValidateViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    LinearLayout item_layout, add_layout;
    LinearLayout delete;
    LinearLayout add;
    TextView name;
    TextView phone;

    ManagerValidateAdapter.OnItemClickListener mListener;


    public ManagerValidateViewHolder(View itemView, ManagerValidateAdapter.OnItemClickListener listener) {
        super(itemView);
        this.mListener = listener;
        item_layout = itemView.findViewById(R.id.item_layout);
        add_layout = itemView.findViewById(R.id.add_layout);
        delete = itemView.findViewById(R.id.delete);
        name = itemView.findViewById(R.id.name);
        phone = itemView.findViewById(R.id.phone);
        add = itemView.findViewById(R.id.add);
        delete.setOnClickListener(this);
        add_layout.setOnClickListener(this);
//        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("dc", "onClick: " + (v.getId() == R.id.delete) + "   " + (v.getId() == R.id.add) + "   " + (v.getId() == R.id.name) + "   " + (v.getId() == R.id.phone) + "   name = " + v.getClass().getName() + "   " + v.getId());
        if(mListener != null) {
            mListener.onItemClick(v, getPosition());
        }
    }
}
