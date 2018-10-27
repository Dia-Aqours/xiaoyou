/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarDataserviceViolationinfoShareModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3445522939741348992L;
/* 10:   */   @ApiField("app_id")
/* 11:   */   private String appId;
/* 12:   */   @ApiField("vehicle_id")
/* 13:   */   private String vehicleId;
/* 14:   */   
/* 15:   */   public String getAppId()
/* 16:   */   {
/* 17:29 */     return this.appId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAppId(String appId)
/* 21:   */   {
/* 22:32 */     this.appId = appId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getVehicleId()
/* 26:   */   {
/* 27:36 */     return this.vehicleId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setVehicleId(String vehicleId)
/* 31:   */   {
/* 32:39 */     this.vehicleId = vehicleId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarDataserviceViolationinfoShareModel
 * JD-Core Version:    0.7.0.1
 */