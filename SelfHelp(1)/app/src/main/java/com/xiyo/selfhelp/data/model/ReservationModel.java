package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.List;

@JsonObject
public class ReservationModel implements Serializable{

    @JsonField
    private String RoomTypeID;
    @JsonField
    private String RoomTypeName;
    @JsonField
    private int RoomType;
    @JsonField
    private int Person;
    @JsonField
    private int Breakfast;
    @JsonField
    private String Remark;
    @JsonField
    private double Prepayment;
    @JsonField
    private String HourlyBaseFee;
    @JsonField
    private String HourlyBaseTime;
    @JsonField
    private String HourlyFee;
    @JsonField
    private List<String> RoomTypeImgs;
    @JsonField
    private DailyFees DailyFees;
    @JsonField
    private RoomState RoomState;


    public void setRoomTypeID(String RoomTypeID) {
        this.RoomTypeID = RoomTypeID;
    }
    public String getRoomTypeID() {
        return RoomTypeID;
    }

    public void setRoomTypeName(String RoomTypeName) {
        this.RoomTypeName = RoomTypeName;
    }
    public String getRoomTypeName() {
        return RoomTypeName;
    }

    public void setRoomType(int RoomType) {
        this.RoomType = RoomType;
    }
    public int getRoomType() {
        return RoomType;
    }

    public void setPerson(int Person) {
        this.Person = Person;
    }
    public int getPerson() {
        return Person;
    }

    public void setBreakfast(int Breakfast) {
        this.Breakfast = Breakfast;
    }
    public int getBreakfast() {
        return Breakfast;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }
    public String getRemark() {
        return Remark;
    }

    public void setPrepayment(double Prepayment) {
        this.Prepayment = Prepayment;
    }
    public double getPrepayment() {
        return Prepayment;
    }

    public void setHourlyBaseFee(String HourlyBaseFee) {
        this.HourlyBaseFee = HourlyBaseFee;
    }
    public String getHourlyBaseFee() {
        return HourlyBaseFee;
    }

    public void setHourlyBaseTime(String HourlyBaseTime) {
        this.HourlyBaseTime = HourlyBaseTime;
    }
    public String getHourlyBaseTime() {
        return HourlyBaseTime;
    }

    public void setHourlyFee(String HourlyFee) {
        this.HourlyFee = HourlyFee;
    }
    public String getHourlyFee() {
        return HourlyFee;
    }

    public void setRoomTypeImgs(List<String> RoomTypeImgs) {
        this.RoomTypeImgs = RoomTypeImgs;
    }
    public List<String> getRoomTypeImgs() {
        return RoomTypeImgs;
    }

    public void setDailyFees(DailyFees DailyFees) {
        this.DailyFees = DailyFees;
    }
    public DailyFees getDailyFees() {
        return DailyFees;
    }

    public void setRoomState(RoomState RoomState) {
        this.RoomState = RoomState;
    }
    public RoomState getRoomState() {
        return RoomState;
    }

    public ReservationModel() {

    }

    public ReservationModel(String roomTypeID, String roomTypeName, int roomType, int person, int breakfast, String remark, double prepayment, String hourlyBaseFee, String hourlyBaseTime, String hourlyFee, List<String> roomTypeImgs, com.xiyo.selfhelp.data.model.DailyFees dailyFees, com.xiyo.selfhelp.data.model.RoomState roomState) {
        RoomTypeID = roomTypeID;
        RoomTypeName = roomTypeName;
        RoomType = roomType;
        Person = person;
        Breakfast = breakfast;
        Remark = remark;
        Prepayment = prepayment;
        HourlyBaseFee = hourlyBaseFee;
        HourlyBaseTime = hourlyBaseTime;
        HourlyFee = hourlyFee;
        RoomTypeImgs = roomTypeImgs;
        DailyFees = dailyFees;
        RoomState = roomState;
    }

    @Override
    public String toString() {
        return "ReservationModel{" +
                "RoomTypeID='" + RoomTypeID + '\'' +
                ", RoomTypeName='" + RoomTypeName + '\'' +
                ", RoomType=" + RoomType +
                ", Person=" + Person +
                ", Breakfast=" + Breakfast +
                ", Remark='" + Remark + '\'' +
                ", Prepayment=" + Prepayment +
                ", HourlyBaseFee='" + HourlyBaseFee + '\'' +
                ", HourlyBaseTime='" + HourlyBaseTime + '\'' +
                ", HourlyFee='" + HourlyFee + '\'' +
                ", RoomTypeImgs=" + RoomTypeImgs +
                ", DailyFees=" + DailyFees +
                ", RoomState=" + RoomState +
                '}';
    }
}
