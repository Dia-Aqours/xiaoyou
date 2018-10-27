/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class ConsumeInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7672892164591664786L;
/* 10:   */   @ApiField("taken_time")
/* 11:   */   private String takenTime;
/* 12:   */   @ApiField("user_name")
/* 13:   */   private String userName;
/* 14:   */   @ApiField("voucher_amt")
/* 15:   */   private String voucherAmt;
/* 16:   */   
/* 17:   */   public String getTakenTime()
/* 18:   */   {
/* 19:35 */     return this.takenTime;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setTakenTime(String takenTime)
/* 23:   */   {
/* 24:38 */     this.takenTime = takenTime;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getUserName()
/* 28:   */   {
/* 29:42 */     return this.userName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setUserName(String userName)
/* 33:   */   {
/* 34:45 */     this.userName = userName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getVoucherAmt()
/* 38:   */   {
/* 39:49 */     return this.voucherAmt;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setVoucherAmt(String voucherAmt)
/* 43:   */   {
/* 44:52 */     this.voucherAmt = voucherAmt;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ConsumeInfo

 * JD-Core Version:    0.7.0.1

 */