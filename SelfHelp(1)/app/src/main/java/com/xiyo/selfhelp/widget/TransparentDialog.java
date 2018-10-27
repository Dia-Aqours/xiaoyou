package com.xiyo.selfhelp.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

import com.xiyo.selfhelp.R;

class TransparentDialog extends Dialog {

	public TransparentDialog(Context context, int theme) {
		super(context, theme);
	}
	
	public static TransparentDialog createDialog(Context context) {
		TransparentDialog dialog = new TransparentDialog(context, R.style.Transparent);
		dialog.setContentView(R.layout.transparent);
		dialog.getWindow().getAttributes().gravity = Gravity.CENTER;
//        dialog.getWindow().getAttributes().horizontalMargin = 818;
//        dialog.getWindow().getAttributes().verticalMargin = 575;
		return dialog;
	}

	public void setMessage(String message) {
		TextView msgView = findViewById(R.id.transparent_message);
		msgView.setText(message);
	}

}
