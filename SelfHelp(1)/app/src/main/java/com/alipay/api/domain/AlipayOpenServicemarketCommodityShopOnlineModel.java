/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenServicemarketCommodityShopOnlineModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2326497761371735128L;
/* 10:   */   @ApiField("commodity_id")
/* 11:   */   private String commodityId;
/* 12:   */   @ApiField("shop_id")
/* 13:   */   private String shopId;
/* 14:   */   
/* 15:   */   public String getCommodityId()
/* 16:   */   {
/* 17:29 */     return this.commodityId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCommodityId(String commodityId)
/* 21:   */   {
/* 22:32 */     this.commodityId = commodityId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getShopId()
/* 26:   */   {
/* 27:36 */     return this.shopId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setShopId(String shopId)
/* 31:   */   {
/* 32:39 */     this.shopId = shopId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenServicemarketCommodityShopOnlineModel
 * JD-Core Version:    0.7.0.1
 */