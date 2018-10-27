/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Data {
    @JsonField
    private City city;
    @JsonField
    private Condition condition;
    public void setCity(City city) {
         this.city = city;
     }
     public City getCity() {
         return city;
     }

    public void setCondition(Condition condition) {
         this.condition = condition;
     }
     public Condition getCondition() {
         return condition;
     }

}