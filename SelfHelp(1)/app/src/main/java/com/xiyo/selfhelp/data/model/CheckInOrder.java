/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonObject
public class CheckInOrder implements Serializable{
    @JsonField
    private int OrderID;
    @JsonField
    private String OrderNo;
    @JsonField
    private String PMSCode;
    @JsonField
    private int OrderStatus;
    @JsonField
    private String RoomTypeName;
    @JsonField
    private String RoomTypeID;
    @JsonField
    private String CheckIn;
    @JsonField
    private String CheckOut;
    @JsonField
    private String OrderType;
    @JsonField
    private String Remark;
    @JsonField
    private String RoomNo;
    @JsonField
    private double RoomFee;
    @JsonField
    private String RoomFloor;
    @JsonField
    private double Prepayment;
    @JsonField
    private boolean IsPayed;
    @JsonField
    private List<Tenants> Tenants;
    @JsonField
    private int PeopleNum;

    private List<String> RoomTypeImgs;

    public void setOrderID(int OrderID) {
         this.OrderID = OrderID;
     }
     public int getOrderID() {
         return OrderID;
     }

    public void setOrderNo(String OrderNo) {
         this.OrderNo = OrderNo;
     }
     public String getOrderNo() {
         return OrderNo;
     }

    public void setPMSCode(String PMSCode) {
         this.PMSCode = PMSCode;
     }
     public String getPMSCode() {
         return PMSCode;
     }

    public void setOrderStatus(int OrderStatus) {
         this.OrderStatus = OrderStatus;
     }
     public int getOrderStatus() {
         return OrderStatus;
     }

    public void setRoomTypeName(String RoomTypeName) {
         this.RoomTypeName = RoomTypeName;
     }
     public String getRoomTypeName() {
         return RoomTypeName;
     }

    public void setRoomTypeID(String RoomTypeID) {
         this.RoomTypeID = RoomTypeID;
     }
     public String getRoomTypeID() {
         return RoomTypeID;
     }

    public void setCheckIn(String CheckIn) {
         this.CheckIn = CheckIn;
     }
     public String getCheckIn() {
         return CheckIn;
     }

    public void setCheckOut(String CheckOut) {
         this.CheckOut = CheckOut;
     }
     public String getCheckOut() {
         return CheckOut;
     }

    public void setOrderType(String OrderType) {
         this.OrderType = OrderType;
     }
     public String getOrderType() {
         return OrderType;
     }

    public void setRemark(String Remark) {
         this.Remark = Remark;
     }
     public String getRemark() {
         return Remark;
     }

    public void setRoomNo(String RoomNo) {
         this.RoomNo = RoomNo;
     }
     public String getRoomNo() {
         return RoomNo;
     }

    public void setRoomFee(double RoomFee) {
         this.RoomFee = RoomFee;
     }
     public double getRoomFee() {
         return RoomFee;
     }

    public void setRoomFloor(String RoomFloor) {
         this.RoomFloor = RoomFloor;
     }
     public String getRoomFloor() {
         return RoomFloor;
     }

    public void setPrepayment(double Prepayment) {
         this.Prepayment = Prepayment;
     }
     public double getPrepayment() {
         return Prepayment;
     }

    public void setIsPayed(boolean IsPayed) {
         this.IsPayed = IsPayed;
     }
     public boolean getIsPayed() {
         return IsPayed;
     }

    public void setTenants(List<Tenants> Tenants) {
         this.Tenants = Tenants;
     }
     public List<Tenants> getTenants() {
         return Tenants;
     }

    public void setPeopleNum(int PeopleNum) {
         this.PeopleNum = PeopleNum;
     }
     public int getPeopleNum() {
         return PeopleNum;
     }

    public List<String> getRoomTypeImgs() {
        return RoomTypeImgs;
    }

    public void setRoomTypeImgs(List<String> roomTypeImgs) {
        RoomTypeImgs = roomTypeImgs;
    }

    @Override
    public String toString() {
        return "CheckInOrder{" +
                "OrderID=" + OrderID +
                ", OrderNo='" + OrderNo + '\'' +
                ", PMSCode='" + PMSCode + '\'' +
                ", OrderStatus=" + OrderStatus +
                ", RoomTypeName='" + RoomTypeName + '\'' +
                ", RoomTypeID='" + RoomTypeID + '\'' +
                ", CheckIn='" + CheckIn + '\'' +
                ", CheckOut='" + CheckOut + '\'' +
                ", OrderType='" + OrderType + '\'' +
                ", Remark='" + Remark + '\'' +
                ", RoomNo='" + RoomNo + '\'' +
                ", RoomFee=" + RoomFee +
                ", RoomFloor='" + RoomFloor + '\'' +
                ", Prepayment=" + Prepayment +
                ", IsPayed=" + IsPayed +
                ", Tenants=" + Tenants +
                ", PeopleNum=" + PeopleNum +
                ", RoomTypeImgs=" + RoomTypeImgs +
                '}';
    }
}