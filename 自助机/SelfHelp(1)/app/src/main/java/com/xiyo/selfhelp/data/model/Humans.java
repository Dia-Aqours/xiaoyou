/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * Auto-generated: 2018-08-02 11:54:7
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@JsonObject
public class Humans {
    @JsonField
    private String HumCardID;
    @JsonField
    private String HumId;
    @JsonField
    private String HumName;
    @JsonField
    private String RoomNo;
    @JsonField
    private String HumTel;
    public void setHumCardID(String HumCardID) {
         this.HumCardID = HumCardID;
     }
     public String getHumCardID() {
         return HumCardID;
     }

    public void setHumId(String HumId) {
         this.HumId = HumId;
     }
     public String getHumId() {
         return HumId;
     }

    public void setHumName(String HumName) {
         this.HumName = HumName;
     }
     public String getHumName() {
         return HumName;
     }

    public void setRoomNo(String RoomNo) {
         this.RoomNo = RoomNo;
     }
     public String getRoomNo() {
         return RoomNo;
     }

    public void setHumTel(String HumTel) {
         this.HumTel = HumTel;
     }
     public String getHumTel() {
         return HumTel;
     }

    public Humans() {
    }

    public Humans(String humCardID, String humId, String humName, String roomNo, String humTel) {
        HumCardID = humCardID;
        HumId = humId;
        HumName = humName;
        RoomNo = roomNo;
        HumTel = humTel;
    }
}