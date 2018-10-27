/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class RandomDiscountDstCampPrizeModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6249624331167916777L;
/* 12:   */   @ApiField("budget_id")
/* 13:   */   private String budgetId;
/* 14:   */   @ApiListField("discount_random_model_list")
/* 15:   */   @ApiField("discount_random_model")
/* 16:   */   private List<DiscountRandomModel> discountRandomModelList;
/* 17:   */   @ApiField("id")
/* 18:   */   private String id;
/* 19:   */   @ApiField("max_random_discount_rate")
/* 20:   */   private String maxRandomDiscountRate;
/* 21:   */   
/* 22:   */   public String getBudgetId()
/* 23:   */   {
/* 24:46 */     return this.budgetId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setBudgetId(String budgetId)
/* 28:   */   {
/* 29:49 */     this.budgetId = budgetId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public List<DiscountRandomModel> getDiscountRandomModelList()
/* 33:   */   {
/* 34:53 */     return this.discountRandomModelList;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setDiscountRandomModelList(List<DiscountRandomModel> discountRandomModelList)
/* 38:   */   {
/* 39:56 */     this.discountRandomModelList = discountRandomModelList;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getId()
/* 43:   */   {
/* 44:60 */     return this.id;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setId(String id)
/* 48:   */   {
/* 49:63 */     this.id = id;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getMaxRandomDiscountRate()
/* 53:   */   {
/* 54:67 */     return this.maxRandomDiscountRate;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setMaxRandomDiscountRate(String maxRandomDiscountRate)
/* 58:   */   {
/* 59:70 */     this.maxRandomDiscountRate = maxRandomDiscountRate;
/* 60:   */   }
/* 61:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RandomDiscountDstCampPrizeModel
 * JD-Core Version:    0.7.0.1
 */