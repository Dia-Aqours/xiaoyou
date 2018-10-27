package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class HotelInfo {
    @JsonField
    private String HotelMainID;
    @JsonField
    private String HotelName;
    @JsonField
    private String HotelAppID;
    @JsonField
    private String HotelLogo;

    @Override
    public String toString() {
        return "HotelInfo{" +
                "HotelMainID='" + HotelMainID + '\'' +
                ", HotelName='" + HotelName + '\'' +
                ", HotelAppID='" + HotelAppID + '\'' +
                ", HotelLogo='" + HotelLogo + '\'' +
                '}';
    }

    public String getHotelMainID() {
        return HotelMainID;
    }

    public void setHotelMainID(String hotelMainID) {
        HotelMainID = hotelMainID;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getHotelAppID() {
        return HotelAppID;
    }

    public void setHotelAppID(String hotelAppID) {
        HotelAppID = hotelAppID;
    }

    public String getHotelLogo() {
        return HotelLogo;
    }

    public void setHotelLogo(String hotelLogo) {
        HotelLogo = hotelLogo;
    }

    public HotelInfo() {

    }

    public HotelInfo(String hotelMainID, String hotelName, String hotelAppID, String hotelLogo) {

        HotelMainID = hotelMainID;
        HotelName = hotelName;
        HotelAppID = hotelAppID;
        HotelLogo = hotelLogo;
    }
}
