/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenServicemarketOrderItemCancelModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8389472393838655611L;
/* 10:   */   @ApiField("cancel_reason")
/* 11:   */   private String cancelReason;
/* 12:   */   @ApiField("commodity_order_id")
/* 13:   */   private String commodityOrderId;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private String shopId;
/* 16:   */   
/* 17:   */   public String getCancelReason()
/* 18:   */   {
/* 19:35 */     return this.cancelReason;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCancelReason(String cancelReason)
/* 23:   */   {
/* 24:38 */     this.cancelReason = cancelReason;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCommodityOrderId()
/* 28:   */   {
/* 29:42 */     return this.commodityOrderId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCommodityOrderId(String commodityOrderId)
/* 33:   */   {
/* 34:45 */     this.commodityOrderId = commodityOrderId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getShopId()
/* 38:   */   {
/* 39:49 */     return this.shopId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setShopId(String shopId)
/* 43:   */   {
/* 44:52 */     this.shopId = shopId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenServicemarketOrderItemCancelModel
 * JD-Core Version:    0.7.0.1
 */