/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPointBudgetGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7829723199244272241L;
/* 10:   */   @ApiField("budget_amount")
/* 11:   */   private Long budgetAmount;
/* 12:   */   
/* 13:   */   public void setBudgetAmount(Long budgetAmount)
/* 14:   */   {
/* 15:24 */     this.budgetAmount = budgetAmount;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Long getBudgetAmount()
/* 19:   */   {
/* 20:27 */     return this.budgetAmount;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayPointBudgetGetResponse
 * JD-Core Version:    0.7.0.1
 */