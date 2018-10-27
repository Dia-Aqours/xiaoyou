/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Auto-generated: 2018-08-09 10:22:12
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@JsonObject
public class WeatherData {
    @JsonField
    private int code;
    @JsonField
    private Data data;
    @JsonField
    private String msg;
    @JsonField
    private Rc rc;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

    public void setMsg(String msg) {
         this.msg = msg;
     }
     public String getMsg() {
         return msg;
     }

    public void setRc(Rc rc) {
         this.rc = rc;
     }
     public Rc getRc() {
         return rc;
     }

}