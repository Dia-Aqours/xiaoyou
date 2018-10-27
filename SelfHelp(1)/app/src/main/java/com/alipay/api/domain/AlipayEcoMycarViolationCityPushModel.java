/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoMycarViolationCityPushModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4214119372745654828L;
/* 10:   */   @ApiField("city_code")
/* 11:   */   private String cityCode;
/* 12:   */   @ApiField("push_type")
/* 13:   */   private String pushType;
/* 14:   */   @ApiField("service_status")
/* 15:   */   private String serviceStatus;
/* 16:   */   
/* 17:   */   public String getCityCode()
/* 18:   */   {
/* 19:35 */     return this.cityCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCityCode(String cityCode)
/* 23:   */   {
/* 24:38 */     this.cityCode = cityCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPushType()
/* 28:   */   {
/* 29:42 */     return this.pushType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPushType(String pushType)
/* 33:   */   {
/* 34:45 */     this.pushType = pushType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getServiceStatus()
/* 38:   */   {
/* 39:49 */     return this.serviceStatus;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setServiceStatus(String serviceStatus)
/* 43:   */   {
/* 44:52 */     this.serviceStatus = serviceStatus;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarViolationCityPushModel

 * JD-Core Version:    0.7.0.1

 */