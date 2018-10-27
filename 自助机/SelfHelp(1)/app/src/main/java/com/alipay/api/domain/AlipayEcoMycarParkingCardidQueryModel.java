/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarParkingCardidQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3187918269778228435L;
/* 10:   */   @ApiField("car_number")
/* 11:   */   private String carNumber;
/* 12:   */   @ApiField("parking_id")
/* 13:   */   private String parkingId;
/* 14:   */   @ApiField("sel_time")
/* 15:   */   private String selTime;
/* 16:   */   @ApiField("transaction_no")
/* 17:   */   private String transactionNo;
/* 18:   */   
/* 19:   */   public String getCarNumber()
/* 20:   */   {
/* 21:41 */     return this.carNumber;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCarNumber(String carNumber)
/* 25:   */   {
/* 26:44 */     this.carNumber = carNumber;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getParkingId()
/* 30:   */   {
/* 31:48 */     return this.parkingId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setParkingId(String parkingId)
/* 35:   */   {
/* 36:51 */     this.parkingId = parkingId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getSelTime()
/* 40:   */   {
/* 41:55 */     return this.selTime;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setSelTime(String selTime)
/* 45:   */   {
/* 46:58 */     this.selTime = selTime;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTransactionNo()
/* 50:   */   {
/* 51:62 */     return this.transactionNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTransactionNo(String transactionNo)
/* 55:   */   {
/* 56:65 */     this.transactionNo = transactionNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingCardidQueryModel
 * JD-Core Version:    0.7.0.1
 */