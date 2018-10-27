/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class SingleDstCampPrizeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4886752156962324841L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("id")
/* 13:   */   private String id;
/* 14:   */   @ApiField("reduce_amt")
/* 15:   */   private String reduceAmt;
/* 16:   */   
/* 17:   */   public String getBudgetId()
/* 18:   */   {
/* 19:35 */     return this.budgetId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBudgetId(String budgetId)
/* 23:   */   {
/* 24:38 */     this.budgetId = budgetId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getId()
/* 28:   */   {
/* 29:42 */     return this.id;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setId(String id)
/* 33:   */   {
/* 34:45 */     this.id = id;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getReduceAmt()
/* 38:   */   {
/* 39:49 */     return this.reduceAmt;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setReduceAmt(String reduceAmt)
/* 43:   */   {
/* 44:52 */     this.reduceAmt = reduceAmt;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.SingleDstCampPrizeModel
 * JD-Core Version:    0.7.0.1
 */