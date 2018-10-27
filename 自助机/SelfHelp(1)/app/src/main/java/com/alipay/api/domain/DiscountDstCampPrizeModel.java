/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class DiscountDstCampPrizeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2431522246846326813L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("discount_rate")
/* 13:   */   private String discountRate;
/* 14:   */   @ApiField("id")
/* 15:   */   private String id;
/* 16:   */   @ApiField("max_discount_amt")
/* 17:   */   private String maxDiscountAmt;
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
/* 29:   */   public String getDiscountRate()
/* 30:   */   {
/* 31:48 */     return this.discountRate;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setDiscountRate(String discountRate)
/* 35:   */   {
/* 36:51 */     this.discountRate = discountRate;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getId()
/* 40:   */   {
/* 41:55 */     return this.id;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setId(String id)
/* 45:   */   {
/* 46:58 */     this.id = id;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getMaxDiscountAmt()
/* 50:   */   {
/* 51:62 */     return this.maxDiscountAmt;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setMaxDiscountAmt(String maxDiscountAmt)
/* 55:   */   {
/* 56:65 */     this.maxDiscountAmt = maxDiscountAmt;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.DiscountDstCampPrizeModel

 * JD-Core Version:    0.7.0.1

 */