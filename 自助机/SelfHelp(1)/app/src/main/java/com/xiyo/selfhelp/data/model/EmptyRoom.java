package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;

@JsonObject
public class EmptyRoom implements Serializable {
    @JsonField
    public String Floor;
    @JsonField
    public String RoomNo;
    @JsonField
    public String Remark;
    @JsonField
    public String RoomImg;

    public EmptyRoom() {
    }

    public EmptyRoom(String floor, String roomNo, String remark, String roomImg) {
        Floor = floor;
        RoomNo = roomNo;
        Remark = remark;
        RoomImg = roomImg;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getRoomImg() {
        return RoomImg;
    }

    public void setRoomImg(String roomImg) {
        RoomImg = roomImg;
    }

    @Override
    public String toString() {
        return "EmptyRoom{" +
                "Floor='" + Floor + '\'' +
                ", RoomNo='" + RoomNo + '\'' +
                ", Remark='" + Remark + '\'' +
                ", RoomImg='" + RoomImg + '\'' +
                '}';
    }
}
