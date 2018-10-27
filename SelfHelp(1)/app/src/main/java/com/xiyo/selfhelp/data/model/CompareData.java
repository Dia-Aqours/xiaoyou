package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class CompareData {

    @JsonField
    private String cardCtrlVer;
    @JsonField
    private String picCtrlVer;
    @JsonField
    private String name;
    @JsonField
    private String idNum;
    @JsonField
    private String startDate;
    @JsonField
    private String endDate;
    @JsonField
    private String authMode;
    @JsonField
    private String picIDcard;
    @JsonField
    private String picCamera;
    @JsonField
    private String dN;
    @JsonField
    private String xBDM;
    @JsonField
    private String mZDM;
    @JsonField
    private String cSRQ;
    @JsonField
    private String zZ;
    @JsonField
    private String qFJG;



    public void setCardCtrlVer(String cardCtrlVer) {
        this.cardCtrlVer = cardCtrlVer;
    }

    public String getCardCtrlVer() {
        return cardCtrlVer;
    }

    public void setPicCtrlVer(String picCtrlVer) {
        this.picCtrlVer = picCtrlVer;
    }

    public String getPicCtrlVer() {
        return picCtrlVer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public String getAuthMode() {
        return authMode;
    }

    public void setpicIDcard(String picIDcard) {
        this.picIDcard = picIDcard;
    }

    public String getpicIDcard() {
        return picIDcard;
    }

    public void setpicCamera(String picCamera) {
        this.picCamera = picCamera;
    }

    public String getpicCamera() {
        return picCamera;
    }

    public String getPicIDcard() {
        return picIDcard;
    }

    public void setPicIDcard(String picIDcard) {
        this.picIDcard = picIDcard;
    }

    public String getPicCamera() {
        return picCamera;
    }

    public void setPicCamera(String picCamera) {
        this.picCamera = picCamera;
    }

    public String getdN() {
        return dN;
    }

    public void setdN(String dN) {
        this.dN = dN;
    }

    public String getxBDM() {
        return xBDM;
    }

    public void setxBDM(String xBDM) {
        this.xBDM = xBDM;
    }

    public String getmZDM() {
        return mZDM;
    }

    public void setmZDM(String mZDM) {
        this.mZDM = mZDM;
    }

    public String getcSRQ() {
        return cSRQ;
    }

    public void setcSRQ(String cSRQ) {
        this.cSRQ = cSRQ;
    }

    public String getzZ() {
        return zZ;
    }

    public void setzZ(String zZ) {
        this.zZ = zZ;
    }

    public String getqFJG() {
        return qFJG;
    }

    public void setqFJG(String qFJG) {
        this.qFJG = qFJG;
    }
}