/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicGisQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2599857334111397719L;
/* 10:   */   @ApiField("accuracy")
/* 11:   */   private String accuracy;
/* 12:   */   @ApiField("city")
/* 13:   */   private String city;
/* 14:   */   @ApiField("latitude")
/* 15:   */   private String latitude;
/* 16:   */   @ApiField("longitude")
/* 17:   */   private String longitude;
/* 18:   */   @ApiField("province")
/* 19:   */   private String province;
/* 20:   */   
/* 21:   */   public void setAccuracy(String accuracy)
/* 22:   */   {
/* 23:48 */     this.accuracy = accuracy;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getAccuracy()
/* 27:   */   {
/* 28:51 */     return this.accuracy;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setCity(String city)
/* 32:   */   {
/* 33:55 */     this.city = city;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getCity()
/* 37:   */   {
/* 38:58 */     return this.city;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setLatitude(String latitude)
/* 42:   */   {
/* 43:62 */     this.latitude = latitude;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getLatitude()
/* 47:   */   {
/* 48:65 */     return this.latitude;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setLongitude(String longitude)
/* 52:   */   {
/* 53:69 */     this.longitude = longitude;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getLongitude()
/* 57:   */   {
/* 58:72 */     return this.longitude;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setProvince(String province)
/* 62:   */   {
/* 63:76 */     this.province = province;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getProvince()
/* 67:   */   {
/* 68:79 */     return this.province;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicGisQueryResponse
 * JD-Core Version:    0.7.0.1
 */