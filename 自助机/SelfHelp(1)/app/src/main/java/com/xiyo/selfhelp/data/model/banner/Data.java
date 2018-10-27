package com.xiyo.selfhelp.data.model.banner;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Data {

    @JsonField
    private int ID;
    @JsonField
    private String ImgUrl;
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }
    public String getImgUrl() {
        return ImgUrl;
    }

}