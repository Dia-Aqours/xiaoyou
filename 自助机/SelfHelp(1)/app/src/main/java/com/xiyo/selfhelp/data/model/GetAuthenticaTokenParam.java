package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;

@JsonObject
public class GetAuthenticaTokenParam implements Serializable{
    @JsonField
    private String username;
    @JsonField
    private String appid;
    @JsonField
    private String certno;

    public GetAuthenticaTokenParam() {
    }

    public GetAuthenticaTokenParam(String username, String appid, String certno) {
        this.username = username;
        this.appid = appid;
        this.certno = certno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }
}
