package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class IDCardModel {
    @JsonField
    private String name;
    @JsonField
    private String cardno;
    @JsonField
    private long timestamp;

    public IDCardModel() {
    }

    public IDCardModel(String name, String cardno, long timestamp) {

        this.name = name;
        this.cardno = cardno;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "IDCardModel{" +
                "name='" + name + '\'' +
                ", cardno='" + cardno + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


}
