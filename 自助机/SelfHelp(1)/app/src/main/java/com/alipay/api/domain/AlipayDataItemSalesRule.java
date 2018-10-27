/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayDataItemSalesRule
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2337599469781478696L;
/* 12:   */   @ApiField("buyer_crowd_limit")
/* 13:   */   private String buyerCrowdLimit;
/* 14:   */   @ApiField("daily_sales_limit")
/* 15:   */   private Long dailySalesLimit;
/* 16:   */   @ApiListField("user_sales_limit")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> userSalesLimit;
/* 19:   */   
/* 20:   */   public String getBuyerCrowdLimit()
/* 21:   */   {
/* 22:41 */     return this.buyerCrowdLimit;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBuyerCrowdLimit(String buyerCrowdLimit)
/* 26:   */   {
/* 27:44 */     this.buyerCrowdLimit = buyerCrowdLimit;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getDailySalesLimit()
/* 31:   */   {
/* 32:48 */     return this.dailySalesLimit;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setDailySalesLimit(Long dailySalesLimit)
/* 36:   */   {
/* 37:51 */     this.dailySalesLimit = dailySalesLimit;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public List<String> getUserSalesLimit()
/* 41:   */   {
/* 42:55 */     return this.userSalesLimit;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setUserSalesLimit(List<String> userSalesLimit)
/* 46:   */   {
/* 47:58 */     this.userSalesLimit = userSalesLimit;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataItemSalesRule
 * JD-Core Version:    0.7.0.1
 */