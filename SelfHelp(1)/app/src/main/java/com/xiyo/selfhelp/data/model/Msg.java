/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;


import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;

@JsonObject
public class Msg implements Serializable {

    @JsonField
    private String Number;
    @JsonField
    private boolean IsSuccess;
    @JsonField
    private String PoliceResponse;

    public void setNumber(String Number) {
         this.Number = Number;
     }
     public String getNumber() {
         return Number;
     }

    public void setIsSuccess(boolean IsSuccess) {
         this.IsSuccess = IsSuccess;
     }
     public boolean getIsSuccess() {
         return IsSuccess;
     }

    public void setPoliceResponse(String PoliceResponse) {
         this.PoliceResponse = PoliceResponse;
     }
     public String getPoliceResponse() {
         return PoliceResponse;
     }

}