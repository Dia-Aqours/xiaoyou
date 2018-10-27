/**
  * Copyright 2018 bejson.com 
  */
package com.xiyo.selfhelp.data.model;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.List;

@JsonObject
public class CheckIn implements Serializable{

    @JsonField
    private String DeviceNo;
    @JsonField
    private String OrderID;
    @JsonField
    private List<Humans> Humans;
    @JsonField
    private String TradeID;
    @JsonField
    private String CheckInDT;
    @JsonField
    private String CheckOutDT;
    @JsonField
    private double RoomFee;
    @JsonField
    private String PayType;
    @JsonField
    private String Prepayment;
    @JsonField
    private String RoomTypeID;
    @JsonField
    private String CheckInType;
    @JsonField
    private String ChannelType;
    public void setDeviceNo(String DeviceNo) {
         this.DeviceNo = DeviceNo;
     }
     public String getDeviceNo() {
         return DeviceNo;
     }

    public void setOrderID(String OrderID) {
         this.OrderID = OrderID;
     }
     public String getOrderID() {
         return OrderID;
     }

    public void setHumans(List<Humans> Humans) {
         this.Humans = Humans;
     }
     public List<Humans> getHumans() {
         return Humans;
     }

    public void setTradeID(String TradeID) {
         this.TradeID = TradeID;
     }
     public String getTradeID() {
         return TradeID;
     }

    public void setCheckInDT(String CheckInDT) {
         this.CheckInDT = CheckInDT;
     }
     public String getCheckInDT() {
         return CheckInDT;
     }

    public void setCheckOutDT(String CheckOutDT) {
         this.CheckOutDT = CheckOutDT;
     }
     public String getCheckOutDT() {
         return CheckOutDT;
     }

    public void setRoomFee(double RoomFee) {
         this.RoomFee = RoomFee;
     }
     public double getRoomFee() {
         return RoomFee;
     }

    public void setPayType(String PayType) {
         this.PayType = PayType;
     }
     public String getPayType() {
         return PayType;
     }

    public void setPrepayment(String Prepayment) {
         this.Prepayment = Prepayment;
     }
     public String getPrepayment() {
         return Prepayment;
     }

    public void setRoomTypeID(String RoomTypeID) {
         this.RoomTypeID = RoomTypeID;
     }
     public String getRoomTypeID() {
         return RoomTypeID;
     }

    public void setCheckInType(String CheckInType) {
         this.CheckInType = CheckInType;
     }
     public String getCheckInType() {
         return CheckInType;
     }

    public void setChannelType(String ChannelType) {
         this.ChannelType = ChannelType;
     }
     public String getChannelType() {
         return ChannelType;
     }

}