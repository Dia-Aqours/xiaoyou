/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertCommissionClauseQuotaResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8442638781587318788L;
/* 10:   */   @ApiField("quota_amount")
/* 11:   */   private String quotaAmount;
/* 12:   */   
/* 13:   */   public String getQuotaAmount()
/* 14:   */   {
/* 15:23 */     return this.quotaAmount;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setQuotaAmount(String quotaAmount)
/* 19:   */   {
/* 20:26 */     this.quotaAmount = quotaAmount;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertCommissionClauseQuotaResponse
 * JD-Core Version:    0.7.0.1
 */