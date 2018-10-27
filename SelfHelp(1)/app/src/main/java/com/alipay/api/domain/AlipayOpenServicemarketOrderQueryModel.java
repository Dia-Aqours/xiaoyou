/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenServicemarketOrderQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8717422132943846446L;
/* 10:   */   @ApiField("commodity_order_id")
/* 11:   */   private String commodityOrderId;
/* 12:   */   @ApiField("start_page")
/* 13:   */   private String startPage;
/* 14:   */   
/* 15:   */   public String getCommodityOrderId()
/* 16:   */   {
/* 17:29 */     return this.commodityOrderId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCommodityOrderId(String commodityOrderId)
/* 21:   */   {
/* 22:32 */     this.commodityOrderId = commodityOrderId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getStartPage()
/* 26:   */   {
/* 27:36 */     return this.startPage;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setStartPage(String startPage)
/* 31:   */   {
/* 32:39 */     this.startPage = startPage;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenServicemarketOrderQueryModel
 * JD-Core Version:    0.7.0.1
 */