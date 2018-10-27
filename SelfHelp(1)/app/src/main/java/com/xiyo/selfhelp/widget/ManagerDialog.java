package com.xiyo.selfhelp.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xiyo.selfhelp.R;
import com.xiyo.selfhelp.data.model.ManagerData;

import java.util.Timer;
import java.util.TimerTask;

public class ManagerDialog extends Dialog implements android.view.View.OnClickListener{

    private Context context;
    private LeaveMyDialogListener listener;
    private PhoneInputListener phoneInputListener;
    EditText phone, validate;
    TextView save, send, name;
    LinearLayout delete;


    public interface LeaveMyDialogListener {
        public void onClick(View view, ManagerData data);
    }

    public interface PhoneInputListener {
        public void onError(String error);
        public void onSuccess();
    }

    public ManagerDialog(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        this.context = context;
    }

    public ManagerDialog(Context context, int theme, LeaveMyDialogListener listener, PhoneInputListener phoneInputListener) {
        super(context, theme);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.listener = listener;
        this.phoneInputListener = phoneInputListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.add_manager);
        phone = findViewById(R.id.phone);
        validate = findViewById(R.id.validate);
        name = findViewById(R.id.name);
        save = findViewById(R.id.save);
        send = findViewById(R.id.send_sms);
        delete = findViewById(R.id.delete);
        save.setOnClickListener(this);
        send.setOnClickListener(this);
        delete.setOnClickListener(this);
        phone.addTextChangedListener(new InputTextWatcher(phone, 11, context, phoneInputListener));
        send.setEnabled(false);
        validate.addTextChangedListener(new InputTextWatcher(validate, 6, context));
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if(v.getId() == R.id.send_sms){
            listener.onClick(v, new ManagerData("", phone.getText().toString().trim(), ""));
        }else if(v.getId() == R.id.save) {
            listener.onClick(v, new ManagerData(name.getText().toString().trim(), phone.getText().toString().trim(), validate.getText().toString().trim()));
        }else if(v.getId() == R.id.delete){
            listener.onClick(v, new ManagerData(name.getText().toString().trim(), phone.getText().toString().trim(), validate.getText().toString().trim()));
        }
    }

    public void setEnable(boolean enable, String times){
        send.setEnabled(enable);
        if(enable)
            send.setText("获取验证码");
        else
            send.setText(times);
    }

    public void setFocusToValidate(){
        validate.requestFocus();
    }

    public void setName(String name){
        this.name.setText(name);
    }
}
