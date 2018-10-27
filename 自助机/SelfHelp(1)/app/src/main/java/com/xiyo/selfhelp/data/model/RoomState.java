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
public class RoomState implements Serializable {

    @JsonField
    private Date Date;
    @JsonField
    private boolean IsFull;
    public void setDate(Date Date) {
         this.Date = Date;
     }
     public Date getDate() {
         return Date;
     }

    public void setIsFull(boolean IsFull) {
         this.IsFull = IsFull;
     }
     public boolean getIsFull() {
         return IsFull;
     }

    public RoomState() {
    }

    public RoomState(java.util.Date date, boolean isFull) {
        Date = date;
        IsFull = isFull;
    }

    @Override
    public String toString() {
        return "RoomState{" +
                "Date=" + Date +
                ", IsFull=" + IsFull +
                '}';
    }
}