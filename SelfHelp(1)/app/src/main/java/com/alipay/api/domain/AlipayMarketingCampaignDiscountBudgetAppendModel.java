/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCampaignDiscountBudgetAppendModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7352427115523496641L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("total_amount")
/* 13:   */   private String totalAmount;
/* 14:   */   
/* 15:   */   public String getBudgetId()
/* 16:   */   {
/* 17:29 */     return this.budgetId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBudgetId(String budgetId)
/* 21:   */   {
/* 22:32 */     this.budgetId = budgetId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTotalAmount()
/* 26:   */   {
/* 27:36 */     return this.totalAmount;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTotalAmount(String totalAmount)
/* 31:   */   {
/* 32:39 */     this.totalAmount = totalAmount;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDiscountBudgetAppendModel

 * JD-Core Version:    0.7.0.1

 */