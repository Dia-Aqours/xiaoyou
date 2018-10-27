package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;
import java.util.List;

@JsonObject
public class PoliceComparison implements Serializable {
    @JsonField
    private String DeviceNo;
    @JsonField
    private String DeviceOwner;

    @JsonField
    private List<GuestInfo> guestInfoList;

    public PoliceComparison() {
    }

    public PoliceComparison(String deviceNo, String deviceOwner, List<GuestInfo> guestInfoList) {
        DeviceNo = deviceNo;
        DeviceOwner = deviceOwner;
        this.guestInfoList = guestInfoList;
    }

    public String getDeviceNo() {
        return DeviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        DeviceNo = deviceNo;
    }

    public String getDeviceOwner() {
        return DeviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        DeviceOwner = deviceOwner;
    }

    public List<GuestInfo> getGuestInfoList() {
        return guestInfoList;
    }

    public void setGuestInfoList(List<GuestInfo> guestInfoList) {
        this.guestInfoList = guestInfoList;
    }

    @Override
    public String toString() {
        return "PoliceComparison{" +
                "DeviceNo='" + DeviceNo + '\'' +
                ", DeviceOwner='" + DeviceOwner + '\'' +
                ", guestInfoList=" + guestInfoList +
                '}';
    }
}
