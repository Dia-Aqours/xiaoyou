package com.xiyo.selfhelp.data.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.io.Serializable;

@JsonObject
public class GuestInfo implements Serializable {
    @JsonField
    private String Name;
    @JsonField
    private String Type;
    @JsonField
    private String Sex;
    @JsonField
    private String Nationality;
    @JsonField
    private String Address;
    @JsonField
    private String Number;
    @JsonField
    private String Authority;
    @JsonField
    private String ValidFrom;
    @JsonField
    private String ValidTo;
    @JsonField
    private String Photo;
    @JsonField
    private String checkintime;
    @JsonField
    private int checkinmodeid;
    @JsonField
    private int checkintypeid;
    @JsonField
    private int guesttype;
    @JsonField
    private String Papertypeid;
    @JsonField
    private int Is2ndcard;
    @JsonField
    private String RoomNo;

    public GuestInfo() {
    }

    public GuestInfo(String name, String type, String sex, String nationality, String address, String number, String authority, String validFrom, String validTo, String photo, String checkintime, int checkinmodeid, int checkintypeid, int guesttype, String papertypeid, int is2ndcard, String roomNo) {
        Name = name;
        Type = type;
        Sex = sex;
        Nationality = nationality;
        Address = address;
        Number = number;
        Authority = authority;
        ValidFrom = validFrom;
        ValidTo = validTo;
        Photo = photo;
        this.checkintime = checkintime;
        this.checkinmodeid = checkinmodeid;
        this.checkintypeid = checkintypeid;
        this.guesttype = guesttype;
        Papertypeid = papertypeid;
        Is2ndcard = is2ndcard;
        RoomNo = roomNo;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    public int getCheckinmodeid() {
        return checkinmodeid;
    }

    public void setCheckinmodeid(int checkinmodeid) {
        this.checkinmodeid = checkinmodeid;
    }

    public int getCheckintypeid() {
        return checkintypeid;
    }

    public void setCheckintypeid(int checkintypeid) {
        this.checkintypeid = checkintypeid;
    }

    public int getGuesttype() {
        return guesttype;
    }

    public void setGuesttype(int guesttype) {
        this.guesttype = guesttype;
    }

    public String getPapertypeid() {
        return Papertypeid;
    }

    public void setPapertypeid(String papertypeid) {
        Papertypeid = papertypeid;
    }

    public int getIs2ndcard() {
        return Is2ndcard;
    }

    public void setIs2ndcard(int is2ndcard) {
        Is2ndcard = is2ndcard;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String roomNo) {
        RoomNo = roomNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getAuthority() {
        return Authority;
    }

    public void setAuthority(String authority) {
        Authority = authority;
    }

    public String getValidFrom() {
        return ValidFrom;
    }

    public void setValidFrom(String validFrom) {
        ValidFrom = validFrom;
    }

    public String getValidTo() {
        return ValidTo;
    }

    public void setValidTo(String validTo) {
        ValidTo = validTo;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getCheckintime() {
        return checkintime;
    }

}
