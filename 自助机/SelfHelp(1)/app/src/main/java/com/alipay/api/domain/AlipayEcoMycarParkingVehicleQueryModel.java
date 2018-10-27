/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingVehicleQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3656946141722791895L;
/* 10:   */   @ApiField("car_id")
/* 11:   */   private String carId;
/* 12:   */   
/* 13:   */   public String getCarId()
/* 14:   */   {
/* 15:23 */     return this.carId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCarId(String carId)
/* 19:   */   {
/* 20:26 */     this.carId = carId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingVehicleQueryModel
 * JD-Core Version:    0.7.0.1
 */