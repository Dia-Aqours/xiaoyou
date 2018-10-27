/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketShopApplyorderCancelModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6112686855254934416L;
/* 10:   */   @ApiField("memo")
/* 11:   */   private String memo;
/* 12:   */   @ApiField("op_id")
/* 13:   */   private String opId;
/* 14:   */   @ApiField("order_id")
/* 15:   */   private String orderId;
/* 16:   */   
/* 17:   */   public String getMemo()
/* 18:   */   {
/* 19:35 */     return this.memo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setMemo(String memo)
/* 23:   */   {
/* 24:38 */     this.memo = memo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOpId()
/* 28:   */   {
/* 29:42 */     return this.opId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOpId(String opId)
/* 33:   */   {
/* 34:45 */     this.opId = opId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getOrderId()
/* 38:   */   {
/* 39:49 */     return this.orderId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setOrderId(String orderId)
/* 43:   */   {
/* 44:52 */     this.orderId = orderId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopApplyorderCancelModel
 * JD-Core Version:    0.7.0.1
 */