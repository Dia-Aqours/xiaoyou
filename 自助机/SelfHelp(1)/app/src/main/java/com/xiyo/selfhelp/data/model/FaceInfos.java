/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class FaceInfos {

    @JsonField
    private String Base64Img;
    @JsonField
    private String Name;
    @JsonField
    private String CardNo;
    public void setBase64Img(String Base64Img) {
         this.Base64Img = Base64Img;
     }
     public String getBase64Img() {
         return Base64Img;
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

}