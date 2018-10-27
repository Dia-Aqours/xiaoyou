package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.List;

@JsonObject
public class PoliceComparisonResult implements Serializable{
    @JsonField
    private boolean Result;
    @JsonField
    private String Data;
    @JsonField
    private List<Msg> Msg;

    public void setData(String Data) {
        this.Data = Data;
    }
    public String getData() {
        return Data;
    }

    public void setMsg(List<Msg> Msg) {
        this.Msg = Msg;
    }
    public List<Msg> getMsg() {
        return Msg;
    }

    public void setResult(boolean Result) {
        this.Result = Result;
    }
    public boolean getResult() {
        return Result;
    }

    public PoliceComparisonResult() {
    }

    public PoliceComparisonResult(boolean result, String data, List<com.xiyo.selfhelp.data.model.Msg> msg) {
        Result = result;
        Data = data;
        Msg = msg;
    }
}
