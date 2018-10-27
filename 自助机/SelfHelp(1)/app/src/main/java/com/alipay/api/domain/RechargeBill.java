/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RechargeBill
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1597688561394557855L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("deposit_time")
/* 13:   */   private String depositTime;
/* 14:   */   @ApiField("status")
/* 15:   */   private String status;
/* 16:   */   @ApiField("trade_no")
/* 17:   */   private String tradeNo;
/* 18:   */   
/* 19:   */   public String getAmount()
/* 20:   */   {
/* 21:43 */     return this.amount;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAmount(String amount)
/* 25:   */   {
/* 26:46 */     this.amount = amount;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getDepositTime()
/* 30:   */   {
/* 31:50 */     return this.depositTime;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setDepositTime(String depositTime)
/* 35:   */   {
/* 36:53 */     this.depositTime = depositTime;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getStatus()
/* 40:   */   {
/* 41:57 */     return this.status;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setStatus(String status)
/* 45:   */   {
/* 46:60 */     this.status = status;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTradeNo()
/* 50:   */   {
/* 51:64 */     return this.tradeNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTradeNo(String tradeNo)
/* 55:   */   {
/* 56:67 */     this.tradeNo = tradeNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RechargeBill
 * JD-Core Version:    0.7.0.1
 */