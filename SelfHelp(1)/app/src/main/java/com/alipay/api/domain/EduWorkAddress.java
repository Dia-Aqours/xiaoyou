/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class EduWorkAddress
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4787881744239687619L;
/* 10:   */   @ApiField("address")
/* 11:   */   private String address;
/* 12:   */   @ApiField("city")
/* 13:   */   private String city;
/* 14:   */   @ApiField("district_name")
/* 15:   */   private String districtName;
/* 16:   */   @ApiField("province")
/* 17:   */   private String province;
/* 18:   */   @ApiField("street_name")
/* 19:   */   private String streetName;
/* 20:   */   
/* 21:   */   public String getAddress()
/* 22:   */   {
/* 23:47 */     return this.address;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAddress(String address)
/* 27:   */   {
/* 28:50 */     this.address = address;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCity()
/* 32:   */   {
/* 33:54 */     return this.city;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCity(String city)
/* 37:   */   {
/* 38:57 */     this.city = city;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getDistrictName()
/* 42:   */   {
/* 43:61 */     return this.districtName;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setDistrictName(String districtName)
/* 47:   */   {
/* 48:64 */     this.districtName = districtName;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getProvince()
/* 52:   */   {
/* 53:68 */     return this.province;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setProvince(String province)
/* 57:   */   {
/* 58:71 */     this.province = province;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getStreetName()
/* 62:   */   {
/* 63:75 */     return this.streetName;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setStreetName(String streetName)
/* 67:   */   {
/* 68:78 */     this.streetName = streetName;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.EduWorkAddress
 * JD-Core Version:    0.7.0.1
 */