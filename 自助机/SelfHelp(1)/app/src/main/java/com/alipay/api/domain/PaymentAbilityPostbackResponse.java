/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PaymentAbilityPostbackResponse
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3678668414114859847L;
/* 10:   */   @ApiField("error_order")
/* 11:   */   private String errorOrder;
/* 12:   */   @ApiField("order_ids")
/* 13:   */   private String orderIds;
/* 14:   */   
/* 15:   */   public String getErrorOrder()
/* 16:   */   {
/* 17:29 */     return this.errorOrder;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setErrorOrder(String errorOrder)
/* 21:   */   {
/* 22:32 */     this.errorOrder = errorOrder;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getOrderIds()
/* 26:   */   {
/* 27:36 */     return this.orderIds;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setOrderIds(String orderIds)
/* 31:   */   {
/* 32:39 */     this.orderIds = orderIds;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PaymentAbilityPostbackResponse
 * JD-Core Version:    0.7.0.1
 */