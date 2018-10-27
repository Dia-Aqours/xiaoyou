package com.xiyo.selfhelp.data.model;

import android.graphics.Bitmap;

public class IDCardShowModel {
    private String name;
    private String number;
    private int verifyCode;
    private Bitmap bitmap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(int verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public IDCardShowModel() {
    }

    public IDCardShowModel(String name, String number, int verifyCode, Bitmap bitmap) {
        this.name = name;
        this.number = number;
        this.verifyCode = verifyCode;
        this.bitmap = bitmap;
    }
}
