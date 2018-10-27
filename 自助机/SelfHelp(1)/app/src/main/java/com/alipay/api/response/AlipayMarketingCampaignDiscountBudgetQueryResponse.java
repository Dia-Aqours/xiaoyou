/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignDiscountBudgetQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4788985214579419923L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("total_amount")
/* 13:   */   private String totalAmount;
/* 14:   */   @ApiField("used_amount")
/* 15:   */   private String usedAmount;
/* 16:   */   
/* 17:   */   public void setBudgetId(String budgetId)
/* 18:   */   {
/* 19:36 */     this.budgetId = budgetId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getBudgetId()
/* 23:   */   {
/* 24:39 */     return this.budgetId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setTotalAmount(String totalAmount)
/* 28:   */   {
/* 29:43 */     this.totalAmount = totalAmount;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getTotalAmount()
/* 33:   */   {
/* 34:46 */     return this.totalAmount;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setUsedAmount(String usedAmount)
/* 38:   */   {
/* 39:50 */     this.usedAmount = usedAmount;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getUsedAmount()
/* 43:   */   {
/* 44:53 */     return this.usedAmount;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDiscountBudgetQueryResponse
 * JD-Core Version:    0.7.0.1
 */