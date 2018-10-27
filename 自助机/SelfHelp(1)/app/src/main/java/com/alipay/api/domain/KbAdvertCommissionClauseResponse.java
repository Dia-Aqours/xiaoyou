/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertCommissionClauseResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1627893119743434245L;
/* 10:   */   @ApiField("percentage_clause")
/* 11:   */   private KbAdvertCommissionClausePercentageResponse percentageClause;
/* 12:   */   @ApiField("quota_clause")
/* 13:   */   private KbAdvertCommissionClauseQuotaResponse quotaClause;
/* 14:   */   @ApiField("type")
/* 15:   */   private String type;
/* 16:   */   
/* 17:   */   public KbAdvertCommissionClausePercentageResponse getPercentageClause()
/* 18:   */   {
/* 19:39 */     return this.percentageClause;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setPercentageClause(KbAdvertCommissionClausePercentageResponse percentageClause)
/* 23:   */   {
/* 24:42 */     this.percentageClause = percentageClause;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public KbAdvertCommissionClauseQuotaResponse getQuotaClause()
/* 28:   */   {
/* 29:46 */     return this.quotaClause;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setQuotaClause(KbAdvertCommissionClauseQuotaResponse quotaClause)
/* 33:   */   {
/* 34:49 */     this.quotaClause = quotaClause;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getType()
/* 38:   */   {
/* 39:53 */     return this.type;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setType(String type)
/* 43:   */   {
/* 44:56 */     this.type = type;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertCommissionClauseResponse
 * JD-Core Version:    0.7.0.1
 */