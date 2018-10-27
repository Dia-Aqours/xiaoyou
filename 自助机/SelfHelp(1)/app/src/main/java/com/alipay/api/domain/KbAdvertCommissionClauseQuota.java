/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertCommissionClauseQuota
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5373286634462351324L;
/* 10:   */   @ApiField("quota_amount_end")
/* 11:   */   private String quotaAmountEnd;
/* 12:   */   @ApiField("quota_amount_start")
/* 13:   */   private String quotaAmountStart;
/* 14:   */   
/* 15:   */   public String getQuotaAmountEnd()
/* 16:   */   {
/* 17:29 */     return this.quotaAmountEnd;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setQuotaAmountEnd(String quotaAmountEnd)
/* 21:   */   {
/* 22:32 */     this.quotaAmountEnd = quotaAmountEnd;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getQuotaAmountStart()
/* 26:   */   {
/* 27:36 */     return this.quotaAmountStart;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setQuotaAmountStart(String quotaAmountStart)
/* 31:   */   {
/* 32:39 */     this.quotaAmountStart = quotaAmountStart;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertCommissionClauseQuota
 * JD-Core Version:    0.7.0.1
 */