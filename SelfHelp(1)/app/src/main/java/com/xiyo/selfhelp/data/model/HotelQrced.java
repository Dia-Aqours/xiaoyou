package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class HotelQrced {
    @JsonField
    private String Status;

    @Override
    public String toString() {
        return "HotelQrced{" +
                "Status='" + Status + '\'' +
                '}';
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public HotelQrced() {

    }

    public HotelQrced(String status) {

        Status = status;
    }
}
