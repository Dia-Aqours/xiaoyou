/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketShopDiscountQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5677526386712998231L;
/* 10:   */   @ApiField("shop_id")
/* 11:   */   private String shopId;
/* 12:   */   
/* 13:   */   public String getShopId()
/* 14:   */   {
/* 15:23 */     return this.shopId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setShopId(String shopId)
/* 19:   */   {
/* 20:26 */     this.shopId = shopId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopDiscountQueryModel
 * JD-Core Version:    0.7.0.1
 */