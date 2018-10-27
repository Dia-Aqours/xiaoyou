package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

@JsonObject
public class ReceiveFaceResult {
    @JsonField
    private String Result;
    @JsonField
    private String Msg;
    @JsonField
    private List<String> FailCardNo;

    @Override
    public String toString() {
        return "ReceiveFaceResult{" +
                "Result='" + Result + '\'' +
                ", Msg='" + Msg + '\'' +
                ", FailCardNo=" + FailCardNo +
                '}';
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public List<String> getFailCardNo() {
        return FailCardNo;
    }

    public void setFailCardNo(List<String> failCardNo) {
        FailCardNo = failCardNo;
    }

    public ReceiveFaceResult() {

    }

    public ReceiveFaceResult(String result, String msg, List<String> failCardNo) {
        Result = result;
        Msg = msg;
        FailCardNo = failCardNo;
    }
}
