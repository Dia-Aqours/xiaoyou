/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ResetZeroDstCampPrizeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6655249632781474818L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("id")
/* 13:   */   private String id;
/* 14:   */   @ApiField("max_discount_amt")
/* 15:   */   private String maxDiscountAmt;
/* 16:   */   @ApiField("reset_zero_amt")
/* 17:   */   private String resetZeroAmt;
/* 18:   */   
/* 19:   */   public String getBudgetId()
/* 20:   */   {
/* 21:45 */     return this.budgetId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setBudgetId(String budgetId)
/* 25:   */   {
/* 26:48 */     this.budgetId = budgetId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getId()
/* 30:   */   {
/* 31:52 */     return this.id;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setId(String id)
/* 35:   */   {
/* 36:55 */     this.id = id;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getMaxDiscountAmt()
/* 40:   */   {
/* 41:59 */     return this.maxDiscountAmt;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setMaxDiscountAmt(String maxDiscountAmt)
/* 45:   */   {
/* 46:62 */     this.maxDiscountAmt = maxDiscountAmt;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getResetZeroAmt()
/* 50:   */   {
/* 51:66 */     return this.resetZeroAmt;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setResetZeroAmt(String resetZeroAmt)
/* 55:   */   {
/* 56:69 */     this.resetZeroAmt = resetZeroAmt;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ResetZeroDstCampPrizeModel
 * JD-Core Version:    0.7.0.1
 */