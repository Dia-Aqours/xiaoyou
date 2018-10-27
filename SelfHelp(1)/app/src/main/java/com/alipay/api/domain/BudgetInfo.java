/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class BudgetInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7857695744912135786L;
/* 10:   */   @ApiField("budget_total")
/* 11:   */   private String budgetTotal;
/* 12:   */   @ApiField("budget_type")
/* 13:   */   private String budgetType;
/* 14:   */   
/* 15:   */   public String getBudgetTotal()
/* 16:   */   {
/* 17:29 */     return this.budgetTotal;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBudgetTotal(String budgetTotal)
/* 21:   */   {
/* 22:32 */     this.budgetTotal = budgetTotal;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getBudgetType()
/* 26:   */   {
/* 27:36 */     return this.budgetType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setBudgetType(String budgetType)
/* 31:   */   {
/* 32:39 */     this.budgetType = budgetType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BudgetInfo
 * JD-Core Version:    0.7.0.1
 */