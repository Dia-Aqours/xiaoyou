package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class StatusResult {
    @JsonField
    private String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public StatusResult() {
    }

    public StatusResult(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "StatusResult{" +
                "Status='" + Status + '\'' +
                '}';
    }
}
