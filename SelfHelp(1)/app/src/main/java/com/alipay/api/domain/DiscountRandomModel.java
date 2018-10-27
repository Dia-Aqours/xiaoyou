/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class DiscountRandomModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5164462236338237655L;
/* 10:   */   @ApiField("max_amount")
/* 11:   */   private String maxAmount;
/* 12:   */   @ApiField("min_amount")
/* 13:   */   private String minAmount;
/* 14:   */   @ApiField("probability")
/* 15:   */   private String probability;
/* 16:   */   
/* 17:   */   public String getMaxAmount()
/* 18:   */   {
/* 19:36 */     return this.maxAmount;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMaxAmount(String maxAmount)
/* 23:   */   {
/* 24:39 */     this.maxAmount = maxAmount;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getMinAmount()
/* 28:   */   {
/* 29:43 */     return this.minAmount;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setMinAmount(String minAmount)
/* 33:   */   {
/* 34:46 */     this.minAmount = minAmount;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getProbability()
/* 38:   */   {
/* 39:50 */     return this.probability;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setProbability(String probability)
/* 43:   */   {
/* 44:53 */     this.probability = probability;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.DiscountRandomModel

 * JD-Core Version:    0.7.0.1

 */