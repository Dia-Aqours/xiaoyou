/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.List;

@JsonObject
public class ReceiveFace {

    @JsonField
    private List<FaceInfos> FaceInfos;
    @JsonField
    private String DeviceNo;
    @JsonField
    private String DeviceOwner;
    @JsonField
    private String RoomNo;
    @JsonField
    private long Timestamp;

    public void setFaceInfos(List<FaceInfos> FaceInfos) {
         this.FaceInfos = FaceInfos;
     }
     public List<FaceInfos> getFaceInfos() {
         return FaceInfos;
     }

    public void setDeviceNo(String DeviceNo) {
         this.DeviceNo = DeviceNo;
     }
     public String getDeviceNo() {
         return DeviceNo;
     }

    public void setDeviceOwner(String DeviceOwner) {
         this.DeviceOwner = DeviceOwner;
     }
     public String getDeviceOwner() {
         return DeviceOwner;
     }

    public void setTimestamp(long Timestamp) {
         this.Timestamp = Timestamp;
     }
     public long getTimestamp() {
         return Timestamp;
     }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }
}