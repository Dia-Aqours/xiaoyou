package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Replenish {

    @JsonField
    private String DeviceNo;

    @JsonField
    private String ChannelType;

    @JsonField
    private String PayType;

    @JsonField
    private double RoomFee;

    @JsonField
    private String CheckOutDT;

    @JsonField
    private String Prepayment;

    @JsonField
    private String OrderID;

    @JsonField
    private String TradeID;


    public Replenish() {

    }

    public Replenish(String deviceNo, String channelType, String payType, double roomFee, String checkOutDT, String prepayment, String orderID, String tradeID) {
        DeviceNo = deviceNo;
        ChannelType = channelType;
        PayType = payType;
        RoomFee = roomFee;
        CheckOutDT = checkOutDT;
        Prepayment = prepayment;
        OrderID = orderID;
        TradeID = tradeID;
    }

    public String getDeviceNo() {
        return DeviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        DeviceNo = deviceNo;
    }

    public String getChannelType() {
        return ChannelType;
    }

    public void setChannelType(String channelType) {
        ChannelType = channelType;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public double getRoomFee() {
        return RoomFee;
    }

    public void setRoomFee(double roomFee) {
        RoomFee = roomFee;
    }

    public String getCheckOutDT() {
        return CheckOutDT;
    }

    public void setCheckOutDT(String checkOutDT) {
        CheckOutDT = checkOutDT;
    }

    public String getPrepayment() {
        return Prepayment;
    }

    public void setPrepayment(String prepayment) {
        Prepayment = prepayment;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getTradeID() {
        return TradeID;
    }

    public void setTradeID(String tradeID) {
        TradeID = tradeID;
    }

    @Override
    public String toString() {
        return "Replenish{" +
                "DeviceNo='" + DeviceNo + '\'' +
                ", ChannelType='" + ChannelType + '\'' +
                ", PayType='" + PayType + '\'' +
                ", RoomFee='" + RoomFee + '\'' +
                ", CheckOutDT='" + CheckOutDT + '\'' +
                ", Prepayment='" + Prepayment + '\'' +
                ", OrderID='" + OrderID + '\'' +
                ", TradeID='" + TradeID + '\'' +
                '}';
    }
}
