/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingAgreementQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7337671157868319879L;
/* 10:   */   @ApiField("car_number")
/* 11:   */   private String carNumber;
/* 12:   */   
/* 13:   */   public String getCarNumber()
/* 14:   */   {
/* 15:23 */     return this.carNumber;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCarNumber(String carNumber)
/* 19:   */   {
/* 20:26 */     this.carNumber = carNumber;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingAgreementQueryModel
 * JD-Core Version:    0.7.0.1
 */