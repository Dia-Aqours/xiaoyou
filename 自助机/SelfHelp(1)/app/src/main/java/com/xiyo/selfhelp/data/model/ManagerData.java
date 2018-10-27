package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class ManagerData {
    @JsonField
    private String name;
    @JsonField
    private String phone;
    @JsonField
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ManagerData() {
    }

    public ManagerData(String name, String phone, String code) {
        this.name = name;
        this.phone = phone;
        this.code = code;
    }
}
