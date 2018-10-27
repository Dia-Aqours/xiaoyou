package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class TokenResult {
    @JsonField
    private String code;
    @JsonField
    private String msg;
    @JsonField
    private String token;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TokenResult() {
    }

    public TokenResult(String code, String msg, String token) {
        this.code = code;
        this.msg = msg;
        this.token = token;
    }
}
