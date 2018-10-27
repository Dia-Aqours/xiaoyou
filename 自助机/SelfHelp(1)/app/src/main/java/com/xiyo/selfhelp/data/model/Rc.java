/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Rc {
    @JsonField
    private int c;
    @JsonField
    private String p;
    public void setC(int c) {
         this.c = c;
     }
     public int getC() {
         return c;
     }

    public void setP(String p) {
         this.p = p;
     }
     public String getP() {
         return p;
     }

}