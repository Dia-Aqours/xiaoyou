/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenServicemarketOrderRejectModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8553213337767241544L;
/* 10:   */   @ApiField("commodity_order_id")
/* 11:   */   private String commodityOrderId;
/* 12:   */   @ApiField("reject_reason")
/* 13:   */   private String rejectReason;
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
/* 25:   */   public String getRejectReason()
/* 26:   */   {
/* 27:36 */     return this.rejectReason;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRejectReason(String rejectReason)
/* 31:   */   {
/* 32:39 */     this.rejectReason = rejectReason;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenServicemarketOrderRejectModel
 * JD-Core Version:    0.7.0.1
 */