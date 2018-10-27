/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarOrderRefundModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2568377778661858672L;
/* 10:   */   @ApiField("order_no")
/* 11:   */   private String orderNo;
/* 12:   */   @ApiField("refund_reason")
/* 13:   */   private String refundReason;
/* 14:   */   
/* 15:   */   public String getOrderNo()
/* 16:   */   {
/* 17:29 */     return this.orderNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOrderNo(String orderNo)
/* 21:   */   {
/* 22:32 */     this.orderNo = orderNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRefundReason()
/* 26:   */   {
/* 27:36 */     return this.refundReason;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRefundReason(String refundReason)
/* 31:   */   {
/* 32:39 */     this.refundReason = refundReason;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarOrderRefundModel
 * JD-Core Version:    0.7.0.1
 */