/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertCommissionClausePercentageResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4627169948432994146L;
/* 10:   */   @ApiField("commission_rate")
/* 11:   */   private String commissionRate;
/* 12:   */   @ApiField("max_limit")
/* 13:   */   private String maxLimit;
/* 14:   */   
/* 15:   */   public String getCommissionRate()
/* 16:   */   {
/* 17:29 */     return this.commissionRate;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCommissionRate(String commissionRate)
/* 21:   */   {
/* 22:32 */     this.commissionRate = commissionRate;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getMaxLimit()
/* 26:   */   {
/* 27:36 */     return this.maxLimit;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setMaxLimit(String maxLimit)
/* 31:   */   {
/* 32:39 */     this.maxLimit = maxLimit;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertCommissionClausePercentageResponse
 * JD-Core Version:    0.7.0.1
 */