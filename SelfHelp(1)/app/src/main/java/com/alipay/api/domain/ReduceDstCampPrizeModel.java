/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ReduceDstCampPrizeModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1152435257389524338L;
/* 10:   */   @ApiField("budget_id")
/* 11:   */   private String budgetId;
/* 12:   */   @ApiField("id")
/* 13:   */   private String id;
/* 14:   */   @ApiField("max_discount_amt")
/* 15:   */   private String maxDiscountAmt;
/* 16:   */   @ApiField("reduce_amt_pre")
/* 17:   */   private String reduceAmtPre;
/* 18:   */   @ApiField("reduce_amt_suf")
/* 19:   */   private String reduceAmtSuf;
/* 20:   */   
/* 21:   */   public String getBudgetId()
/* 22:   */   {
/* 23:47 */     return this.budgetId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setBudgetId(String budgetId)
/* 27:   */   {
/* 28:50 */     this.budgetId = budgetId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getId()
/* 32:   */   {
/* 33:54 */     return this.id;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setId(String id)
/* 37:   */   {
/* 38:57 */     this.id = id;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getMaxDiscountAmt()
/* 42:   */   {
/* 43:61 */     return this.maxDiscountAmt;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setMaxDiscountAmt(String maxDiscountAmt)
/* 47:   */   {
/* 48:64 */     this.maxDiscountAmt = maxDiscountAmt;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getReduceAmtPre()
/* 52:   */   {
/* 53:68 */     return this.reduceAmtPre;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setReduceAmtPre(String reduceAmtPre)
/* 57:   */   {
/* 58:71 */     this.reduceAmtPre = reduceAmtPre;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getReduceAmtSuf()
/* 62:   */   {
/* 63:75 */     return this.reduceAmtSuf;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setReduceAmtSuf(String reduceAmtSuf)
/* 67:   */   {
/* 68:78 */     this.reduceAmtSuf = reduceAmtSuf;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ReduceDstCampPrizeModel
 * JD-Core Version:    0.7.0.1
 */