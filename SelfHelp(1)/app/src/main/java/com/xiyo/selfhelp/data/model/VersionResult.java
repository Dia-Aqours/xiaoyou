package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.xiyo.selfhelp.data.model.version.Data;

import java.util.List;

@JsonObject
public class VersionResult {
    @JsonField
    private String Msg;
    @JsonField
    private boolean Result;
    @JsonField
    private Data Data;
    public void setMsg(String Msg) {
         this.Msg = Msg;
     }
     public String getMsg() {
         return Msg;
     }

    public void setResult(boolean Result) {
         this.Result = Result;
     }
     public boolean getResult() {
         return Result;
     }

    public void setData(Data Data) {
         this.Data = Data;
     }
     public Data getData() {
         return Data;
     }

}