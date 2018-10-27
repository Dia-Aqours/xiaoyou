/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMaintainOrderCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3688184355838137599L;
/* 10:   */   @ApiField("order_no")
/* 11:   */   private String orderNo;
/* 12:   */   
/* 13:   */   public void setOrderNo(String orderNo)
/* 14:   */   {
/* 15:24 */     this.orderNo = orderNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getOrderNo()
/* 19:   */   {
/* 20:27 */     return this.orderNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEcoMycarMaintainOrderCreateResponse
 * JD-Core Version:    0.7.0.1
 */