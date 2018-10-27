package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Token {

    @JsonField
    public String access_token;
    @JsonField
    public String token_type;
    @JsonField
    public String expires_in;
    @JsonField
    public String userId;
    @JsonField
    public String userName;
    @JsonField
    public String issued;
    @JsonField
    public String expires;


    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public Token() {
    }

    public Token(String access_token, String token_type, String expires_in, String userId, String userName, String issued, String expires) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.userId = userId;
        this.userName = userName;
        this.issued = issued;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "Token{" +
                "access_token='" + access_token + '\'' +
                ", token_type='" + token_type + '\'' +
                ", expires_in='" + expires_in + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", issued='" + issued + '\'' +
                ", expires='" + expires + '\'' +
                '}';
    }
}
