/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class BenefitInfoDetail
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6635944399166875779L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("benefit_type")
/* 13:   */   private String benefitType;
/* 14:   */   @ApiField("count")
/* 15:   */   private String count;
/* 16:   */   @ApiField("description")
/* 17:   */   private String description;
/* 18:   */   
/* 19:   */   public String getAmount()
/* 20:   */   {
/* 21:46 */     return this.amount;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAmount(String amount)
/* 25:   */   {
/* 26:49 */     this.amount = amount;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getBenefitType()
/* 30:   */   {
/* 31:53 */     return this.benefitType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setBenefitType(String benefitType)
/* 35:   */   {
/* 36:56 */     this.benefitType = benefitType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getCount()
/* 40:   */   {
/* 41:60 */     return this.count;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setCount(String count)
/* 45:   */   {
/* 46:63 */     this.count = count;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getDescription()
/* 50:   */   {
/* 51:67 */     return this.description;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setDescription(String description)
/* 55:   */   {
/* 56:70 */     this.description = description;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BenefitInfoDetail
 * JD-Core Version:    0.7.0.1
 */