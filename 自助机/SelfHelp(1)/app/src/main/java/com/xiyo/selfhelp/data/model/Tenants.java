/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;


@JsonObject
public class Tenants implements Serializable{
    @JsonField
    private String ID;
    @JsonField
    private String Name;
    @JsonField
    private String CardNo;
    @JsonField
    private String Mobile;
    public void setID(String ID) {
         this.ID = ID;
     }
     public String getID() {
         return ID;
     }

    public void setName(String Name) {
         this.Name = Name;
     }
     public String getName() {
         return Name;
     }

    public void setCardNo(String CardNo) {
         this.CardNo = CardNo;
     }
     public String getCardNo() {
         return CardNo;
     }

    public void setMobile(String Mobile) {
         this.Mobile = Mobile;
     }
     public String getMobile() {
         return Mobile;
     }

}