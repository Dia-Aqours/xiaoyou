/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.Date;

/**
 * Auto-generated: 2018-07-18 17:53:43
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@JsonObject
public class DailyFees implements Serializable {

    @JsonField
    private Date Date;
    @JsonField
    private double Fee;
    public void setDate(Date Date) {
         this.Date = Date;
     }
     public Date getDate() {
         return Date;
     }

    public void setFee(double Fee) {
         this.Fee = Fee;
     }
     public double getFee() {
         return Fee;
     }

    public DailyFees() {
    }

    public DailyFees(java.util.Date date, int fee) {
        Date = date;
        Fee = fee;
    }

    @Override
    public String toString() {
        return "DailyFees{" +
                "Date=" + Date +
                ", Fee=" + Fee +
                '}';
    }
}