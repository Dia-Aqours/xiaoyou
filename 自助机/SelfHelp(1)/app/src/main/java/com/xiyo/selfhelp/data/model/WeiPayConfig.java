package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class WeiPayConfig {
    @JsonField
    private String appid;
    @JsonField
    private String mchid;
    @JsonField
    private String subappid;
    @JsonField
    private String submchid;
    @JsonField
    private String notifyurl;
    @JsonField
    private long timestamp;
    public void setAppid(String appid) {
        this.appid = appid;
    }
    public String getAppid() {
        return appid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }
    public String getMchid() {
        return mchid;
    }

    public void setSubappid(String subappid) {
        this.subappid = subappid;
    }
    public String getSubappid() {
        return subappid;
    }

    public void setSubmchid(String submchid) {
        this.submchid = submchid;
    }
    public String getSubmchid() {
        return submchid;
    }

    public void setNotifyurl(String notifyurl) {
        this.notifyurl = notifyurl;
    }
    public String getNotifyurl() {
        return notifyurl;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public long getTimestamp() {
        return timestamp;
    }

}