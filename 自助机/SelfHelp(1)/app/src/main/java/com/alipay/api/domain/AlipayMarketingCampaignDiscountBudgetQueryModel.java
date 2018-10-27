/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDiscountBudgetQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2853543332924578636L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   
/* 13:   */   public String getBudgetId()
/* 14:   */   {
/* 15:23 */     return this.budgetId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setBudgetId(String budgetId)
/* 19:   */   {
/* 20:26 */     this.budgetId = budgetId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDiscountBudgetQueryModel
 * JD-Core Version:    0.7.0.1
 */