/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class NewsfeedLocationInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3128941883346752882L;
/* 10:   */   @ApiField("ad_code")
/* 11:   */   private String adCode;
/* 12:   */   @ApiField("lat")
/* 13:   */   private String lat;
/* 14:   */   @ApiField("lon")
/* 15:   */   private String lon;
/* 16:   */   
/* 17:   */   public String getAdCode()
/* 18:   */   {
/* 19:35 */     return this.adCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAdCode(String adCode)
/* 23:   */   {
/* 24:38 */     this.adCode = adCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getLat()
/* 28:   */   {
/* 29:42 */     return this.lat;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setLat(String lat)
/* 33:   */   {
/* 34:45 */     this.lat = lat;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getLon()
/* 38:   */   {
/* 39:49 */     return this.lon;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setLon(String lon)
/* 43:   */   {
/* 44:52 */     this.lon = lon;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.NewsfeedLocationInfo
 * JD-Core Version:    0.7.0.1
 */