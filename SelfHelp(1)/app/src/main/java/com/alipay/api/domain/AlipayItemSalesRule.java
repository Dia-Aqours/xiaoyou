/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayItemSalesRule
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3436291523595621796L;
/* 12:   */   @ApiListField("buyer_crowd_limit")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> buyerCrowdLimit;
/* 15:   */   @ApiField("daily_sales_limit")
/* 16:   */   private Long dailySalesLimit;
/* 17:   */   @ApiField("user_sales_limit")
/* 18:   */   private String userSalesLimit;
/* 19:   */   
/* 20:   */   public List<String> getBuyerCrowdLimit()
/* 21:   */   {
/* 22:41 */     return this.buyerCrowdLimit;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setBuyerCrowdLimit(List<String> buyerCrowdLimit)
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
/* 40:   */   public String getUserSalesLimit()
/* 41:   */   {
/* 42:55 */     return this.userSalesLimit;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setUserSalesLimit(String userSalesLimit)
/* 46:   */   {
/* 47:58 */     this.userSalesLimit = userSalesLimit;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayItemSalesRule
 * JD-Core Version:    0.7.0.1
 */