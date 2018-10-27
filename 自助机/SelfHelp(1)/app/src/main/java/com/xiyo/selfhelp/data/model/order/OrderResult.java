package com.xiyo.selfhelp.data.model.order;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class OrderResult {
    @JsonField
    private String Msg;
    @JsonField
    private String Status;

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public OrderResult() {
    }

    public OrderResult(String msg, String status) {
        Msg = msg;
        Status = status;
    }
}
