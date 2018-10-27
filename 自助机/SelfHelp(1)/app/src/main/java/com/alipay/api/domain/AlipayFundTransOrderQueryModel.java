/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundTransOrderQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1826221169333137856L;
/* 10:   */   @ApiField("order_id")
/* 11:   */   private String orderId;
/* 12:   */   @ApiField("out_biz_no")
/* 13:   */   private String outBizNo;
/* 14:   */   
/* 15:   */   public String getOrderId()
/* 16:   */   {
/* 17:30 */     return this.orderId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setOrderId(String orderId)
/* 21:   */   {
/* 22:33 */     this.orderId = orderId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getOutBizNo()
/* 26:   */   {
/* 27:37 */     return this.outBizNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setOutBizNo(String outBizNo)
/* 31:   */   {
/* 32:40 */     this.outBizNo = outBizNo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransOrderQueryModel
 * JD-Core Version:    0.7.0.1
 */