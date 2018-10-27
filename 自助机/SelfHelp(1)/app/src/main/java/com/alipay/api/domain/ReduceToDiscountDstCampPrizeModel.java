/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ReduceToDiscountDstCampPrizeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7656296437928132562L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("id")
/* 13:   */   private String id;
/* 14:   */   @ApiField("max_discount_amt")
/* 15:   */   private String maxDiscountAmt;
/* 16:   */   @ApiField("reduce_to_discount_rate")
/* 17:   */   private String reduceToDiscountRate;
/* 18:   */   
/* 19:   */   public String getBudgetId()
/* 20:   */   {
/* 21:41 */     return this.budgetId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBudgetId(String budgetId)
/* 25:   */   {
/* 26:44 */     this.budgetId = budgetId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getId()
/* 30:   */   {
/* 31:48 */     return this.id;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setId(String id)
/* 35:   */   {
/* 36:51 */     this.id = id;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getMaxDiscountAmt()
/* 40:   */   {
/* 41:55 */     return this.maxDiscountAmt;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setMaxDiscountAmt(String maxDiscountAmt)
/* 45:   */   {
/* 46:58 */     this.maxDiscountAmt = maxDiscountAmt;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getReduceToDiscountRate()
/* 50:   */   {
/* 51:62 */     return this.reduceToDiscountRate;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setReduceToDiscountRate(String reduceToDiscountRate)
/* 55:   */   {
/* 56:65 */     this.reduceToDiscountRate = reduceToDiscountRate;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ReduceToDiscountDstCampPrizeModel
 * JD-Core Version:    0.7.0.1
 */