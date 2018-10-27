/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDiscountBudgetCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6116773525788462326L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   
/* 13:   */   public void setBudgetId(String budgetId)
/* 14:   */   {
/* 15:24 */     this.budgetId = budgetId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getBudgetId()
/* 19:   */   {
/* 20:27 */     return this.budgetId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDiscountBudgetCreateResponse
 * JD-Core Version:    0.7.0.1
 */