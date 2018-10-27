/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class TradeFundBill
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6497388393845431735L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("fund_channel")
/* 13:   */   private String fundChannel;
/* 14:   */   @ApiField("real_amount")
/* 15:   */   private String realAmount;
/* 16:   */   
/* 17:   */   public String getAmount()
/* 18:   */   {
/* 19:35 */     return this.amount;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAmount(String amount)
/* 23:   */   {
/* 24:38 */     this.amount = amount;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getFundChannel()
/* 28:   */   {
/* 29:42 */     return this.fundChannel;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFundChannel(String fundChannel)
/* 33:   */   {
/* 34:45 */     this.fundChannel = fundChannel;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getRealAmount()
/* 38:   */   {
/* 39:49 */     return this.realAmount;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setRealAmount(String realAmount)
/* 43:   */   {
/* 44:52 */     this.realAmount = realAmount;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.TradeFundBill
 * JD-Core Version:    0.7.0.1
 */