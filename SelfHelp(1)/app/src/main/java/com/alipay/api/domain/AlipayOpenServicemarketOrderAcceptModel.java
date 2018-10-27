/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOpenServicemarketOrderAcceptModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1689783443517284543L;
/* 10:   */   @ApiField("commodity_order_id")
/* 11:   */   private String commodityOrderId;
/* 12:   */   
/* 13:   */   public String getCommodityOrderId()
/* 14:   */   {
/* 15:23 */     return this.commodityOrderId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCommodityOrderId(String commodityOrderId)
/* 19:   */   {
/* 20:26 */     this.commodityOrderId = commodityOrderId;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOpenServicemarketOrderAcceptModel

 * JD-Core Version:    0.7.0.1

 */