/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingEnterinfoSyncModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8533493788544272454L;
/* 10:   */   @ApiField("car_number")
/* 11:   */   private String carNumber;
/* 12:   */   @ApiField("in_time")
/* 13:   */   private String inTime;
/* 14:   */   @ApiField("parking_id")
/* 15:   */   private String parkingId;
/* 16:   */   
/* 17:   */   public String getCarNumber()
/* 18:   */   {
/* 19:35 */     return this.carNumber;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCarNumber(String carNumber)
/* 23:   */   {
/* 24:38 */     this.carNumber = carNumber;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getInTime()
/* 28:   */   {
/* 29:42 */     return this.inTime;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setInTime(String inTime)
/* 33:   */   {
/* 34:45 */     this.inTime = inTime;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getParkingId()
/* 38:   */   {
/* 39:49 */     return this.parkingId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setParkingId(String parkingId)
/* 43:   */   {
/* 44:52 */     this.parkingId = parkingId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingEnterinfoSyncModel
 * JD-Core Version:    0.7.0.1
 */