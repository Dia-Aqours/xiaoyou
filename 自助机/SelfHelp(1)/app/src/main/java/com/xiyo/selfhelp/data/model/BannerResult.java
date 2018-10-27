package com.xiyo.selfhelp.data.model;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;
import com.xiyo.selfhelp.data.model.banner.Data;

@JsonObject
public class BannerResult {
    @JsonField
    private String Msg;
    @JsonField
    private boolean Result;
    @JsonField
    private List<Data> Data;
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

    public void setData(List<Data> Data) {
         this.Data = Data;
     }
     public List<Data> getData() {
         return Data;
     }

}