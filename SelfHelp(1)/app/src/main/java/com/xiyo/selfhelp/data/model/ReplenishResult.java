package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;

@JsonObject
public class ReplenishResult implements Serializable{
    @JsonField
    private String Status;

    @Override
    public String toString() {
        return "ReplenishResult{" +
                "Status='" + Status + '\'' +
                '}';
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public ReplenishResult() {

    }

    public ReplenishResult(String status) {

        Status = status;
    }
}
