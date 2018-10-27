package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Auto-generated: 2018-08-02 15:49:59
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@JsonObject
public class CheckInResult {

    @JsonField
    private String Msg;
    @JsonField
    private boolean Result;
    @JsonField
    private String Data;
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

    public void setData(String Data) {
        this.Data = Data;
    }
    public String getData() {
        return Data;
    }

}