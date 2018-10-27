package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class PayConfig {

    @JsonField
    private String HotelName;
    @JsonField
    private String WXPayConfig;
    @JsonField
    private String ALPayConfig;
    @JsonField
    private long Timestamp;

    @Override
    public String toString() {
        return "PayConfig{" +
                "HotelName='" + HotelName + '\'' +
                ", WXPayConfig='" + WXPayConfig + '\'' +
                ", ALPayConfig='" + ALPayConfig + '\'' +
                ", Timestamp=" + Timestamp +
                '}';
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getWXPayConfig() {
        return WXPayConfig;
    }

    public void setWXPayConfig(String WXPayConfig) {
        this.WXPayConfig = WXPayConfig;
    }

    public String getALPayConfig() {
        return ALPayConfig;
    }

    public void setALPayConfig(String ALPayConfig) {
        this.ALPayConfig = ALPayConfig;
    }

    public long getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(long timestamp) {
        Timestamp = timestamp;
    }

    public PayConfig(String hotelName, String WXPayConfig, String ALPayConfig, long timestamp) {

        HotelName = hotelName;
        this.WXPayConfig = WXPayConfig;
        this.ALPayConfig = ALPayConfig;
        Timestamp = timestamp;
    }

    public PayConfig() {

    }
}
