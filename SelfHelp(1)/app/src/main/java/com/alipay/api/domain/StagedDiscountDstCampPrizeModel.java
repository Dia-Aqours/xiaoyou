/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class StagedDiscountDstCampPrizeModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8145499633979352972L;
/* 12:   */   @ApiField("budget_id")
/* 13:   */   private String budgetId;
/* 14:   */   @ApiListField("discount_rate_model_list")
/* 15:   */   @ApiField("discount_rate_model")
/* 16:   */   private List<DiscountRateModel> discountRateModelList;
/* 17:   */   @ApiField("id")
/* 18:   */   private String id;
/* 19:   */   @ApiField("max_discount_amt")
/* 20:   */   private String maxDiscountAmt;
/* 21:   */   
/* 22:   */   public String getBudgetId()
/* 23:   */   {
/* 24:45 */     return this.budgetId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setBudgetId(String budgetId)
/* 28:   */   {
/* 29:48 */     this.budgetId = budgetId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public List<DiscountRateModel> getDiscountRateModelList()
/* 33:   */   {
/* 34:52 */     return this.discountRateModelList;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setDiscountRateModelList(List<DiscountRateModel> discountRateModelList)
/* 38:   */   {
/* 39:55 */     this.discountRateModelList = discountRateModelList;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getId()
/* 43:   */   {
/* 44:59 */     return this.id;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setId(String id)
/* 48:   */   {
/* 49:62 */     this.id = id;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getMaxDiscountAmt()
/* 53:   */   {
/* 54:66 */     return this.maxDiscountAmt;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setMaxDiscountAmt(String maxDiscountAmt)
/* 58:   */   {
/* 59:69 */     this.maxDiscountAmt = maxDiscountAmt;
/* 60:   */   }
/* 61:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.StagedDiscountDstCampPrizeModel
 * JD-Core Version:    0.7.0.1
 */