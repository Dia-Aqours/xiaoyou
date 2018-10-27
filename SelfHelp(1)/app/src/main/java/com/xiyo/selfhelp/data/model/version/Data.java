package com.xiyo.selfhelp.data.model.version;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Data {
    @JsonField
    private String AppName;
    @JsonField
    private String PackageName;
    @JsonField
    private String Version;
    @JsonField
    private String Url;
    @JsonField
    private String UpdatedTime;
    @JsonField
    private String ForceUpdate;
    @JsonField
    private String HotelID;
    @JsonField
    private String RoomNo;

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public String getPackageName() {
        return PackageName;
    }

    public void setPackageName(String packageName) {
        PackageName = packageName;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        UpdatedTime = updatedTime;
    }

    public String getForceUpdate() {
        return ForceUpdate;
    }

    public void setForceUpdate(String forceUpdate) {
        ForceUpdate = forceUpdate;
    }

    public String getHotelID() {
        return HotelID;
    }

    public void setHotelID(String hotelID) {
        HotelID = hotelID;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public Data() {
    }

    public Data(String appName, String packageName, String version, String url, String updatedTime, String forceUpdate, String hotelID, String roomNo) {
        AppName = appName;
        PackageName = packageName;
        Version = version;
        Url = url;
        UpdatedTime = updatedTime;
        ForceUpdate = forceUpdate;
        HotelID = hotelID;
        RoomNo = roomNo;
    }
}
