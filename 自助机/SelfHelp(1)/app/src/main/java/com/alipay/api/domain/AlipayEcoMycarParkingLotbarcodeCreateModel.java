/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingLotbarcodeCreateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3769812823347522176L;
/* 10:   */   @ApiField("parking_id")
/* 11:   */   private String parkingId;
/* 12:   */   
/* 13:   */   public String getParkingId()
/* 14:   */   {
/* 15:23 */     return this.parkingId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setParkingId(String parkingId)
/* 19:   */   {
/* 20:26 */     this.parkingId = parkingId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingLotbarcodeCreateModel
 * JD-Core Version:    0.7.0.1
 */