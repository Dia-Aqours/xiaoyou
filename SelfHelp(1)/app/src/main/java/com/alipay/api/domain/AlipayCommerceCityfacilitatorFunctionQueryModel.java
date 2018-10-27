/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceCityfacilitatorFunctionQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1514446187673837922L;
/* 10:   */   @ApiField("city_code")
/* 11:   */   private String cityCode;
/* 12:   */   @ApiField("device_code")
/* 13:   */   private String deviceCode;
/* 14:   */   
/* 15:   */   public String getCityCode()
/* 16:   */   {
/* 17:29 */     return this.cityCode;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCityCode(String cityCode)
/* 21:   */   {
/* 22:32 */     this.cityCode = cityCode;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getDeviceCode()
/* 26:   */   {
/* 27:36 */     return this.deviceCode;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setDeviceCode(String deviceCode)
/* 31:   */   {
/* 32:39 */     this.deviceCode = deviceCode;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceCityfacilitatorFunctionQueryModel
 * JD-Core Version:    0.7.0.1
 */