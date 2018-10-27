package com.xiyo.selfhelp.data.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import cn.com.aratek.idcard.IDCard;

public class IDCardEntity implements Serializable{
    String mName;
    IDCard.Sex mSex;
    IDCard.Nationality mNationality;
    Date mBirthday;
    String mAddress;
    String mNumber;
    String mAuthority;
    Date mValidFrom;
    Date mValidTo;
    String mLatestAddress;
    Bitmap mPhoto;
    byte[] mFingerprint;



    public IDCardEntity(String name, int sex, int nationality, String birth, String address, String idNumber, String authority,
                 String validFrom, String validTo, String latestAdd, byte[] bmpPhoto, byte[] finger) throws ParseException {
        this.mName = name;
        this.mSex = IDCard.Sex.values()[sex - 1];
        if (nationality > 0 && nationality <= 56) {
            this.mNationality = IDCard.Nationality.values()[nationality - 1];
        } else if (nationality == 98) {
            this.mNationality = IDCard.Nationality.FOREIGN_ORIGIN;
        } else {
            this.mNationality = IDCard.Nationality.OTHER;
        }

        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        this.mBirthday = dt.parse(birth);
        this.mValidFrom = dt.parse(validFrom);
        if (validTo != null && !validTo.equals("")) {
            this.mValidTo = dt.parse(validTo);
        }

        this.mAddress = address;
        this.mNumber = idNumber;
        this.mAuthority = authority;
        this.mLatestAddress = latestAdd;
        if(bmpPhoto != null){
            this.mPhoto = BitmapFactory.decodeByteArray(bmpPhoto, 0, bmpPhoto.length);
        }
        this.mFingerprint = finger;
    }

    public String getName() {
        return this.mName;
    }

    public IDCard.Sex getSex() {
        return this.mSex;
    }

    public IDCard.Nationality getNationality() {
        return this.mNationality;
    }

    public Date getBirthday() {
        return this.mBirthday;
    }

    public String getAddress() {
        return this.mAddress;
    }

    public String getNumber() {
        return this.mNumber;
    }

    public String getAuthority() {
        return this.mAuthority;
    }

    public Date getValidFrom() {
        return this.mValidFrom;
    }

    public Date getValidTo() {
        return this.mValidTo;
    }

    public String getLatestAddress() {
        return this.mLatestAddress;
    }

    public Bitmap getPhoto() {
        return this.mPhoto;
    }

    public byte[] getFingerprint() {
        return this.mFingerprint;
    }

    public boolean isSupportFingerprint() {
        return this.mFingerprint != null;
    }

    public static enum Nationality {
        HAN("汉"),
        MENGGU("蒙古"),
        HUI("回"),
        ZANG("藏"),
        WEIWUER("维吾尔"),
        MIAO("苗"),
        YI("彝"),
        ZHUANG("壮"),
        BUYI("布依"),
        CHAOXIAN("朝鲜"),
        MAN("满"),
        DONG("侗"),
        YAO("瑶"),
        BAI("白"),
        TUJIA("土家"),
        HANI("哈尼"),
        HASAKE("哈萨克"),
        DAI("傣"),
        LI("黎"),
        LISU("傈僳"),
        WA("佤"),
        SHE("畲"),
        GAOSHAN("高山"),
        LAHU("拉祜"),
        SHUI("水"),
        DONGXIANG("东乡"),
        NAXI("纳西"),
        JINGPO("景颇"),
        KEERKEZI("柯尔克孜"),
        TU("土"),
        DAWOER("达斡尔"),
        MULAO("仫佬"),
        QIANG("羌"),
        BULANG("布朗"),
        SALA("撒拉"),
        MAONAN("毛南"),
        GELAO("仡佬"),
        XIBO("锡伯"),
        ACHANG("阿昌"),
        PUMI("普米"),
        TAJIKE("塔吉克"),
        NU("怒"),
        WUZIBIEKE("乌兹别克"),
        ELUOSI("俄罗斯"),
        EWENKE("鄂温克"),
        DEANG("德昂"),
        BAOAN("保安"),
        YUGU("裕固"),
        JING("京"),
        TATAER("塔塔尔"),
        DULONG("独龙"),
        ELUNCHUN("鄂伦春"),
        HEZHE("赫哲"),
        MENBA("门巴"),
        LUOBA("珞巴"),
        JINUO("基诺"),
        FOREIGN_ORIGIN("外国血统中国籍人士"),
        OTHER("其他");

        private String mName;

        private Nationality(String name) {
            this.mName = name;
        }

        public String toString() {
            return this.mName;
        }
    }

    public static enum Sex {
        MALE("男"),
        FEMALE("女");

        private String mName;

        private Sex(String name) {
            this.mName = name;
        }

        public String toString() {
            return this.mName;
        }
    }
}
