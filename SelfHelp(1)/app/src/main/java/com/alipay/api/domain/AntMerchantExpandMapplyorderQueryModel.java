/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AntMerchantExpandMapplyorderQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2665532326769513981L;
/* 10:   */   @ApiField("order_no")
/* 11:   */   private String orderNo;
/* 12:   */   
/* 13:   */   public String getOrderNo()
/* 14:   */   {
/* 15:23 */     return this.orderNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setOrderNo(String orderNo)
/* 19:   */   {
/* 20:26 */     this.orderNo = orderNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AntMerchantExpandMapplyorderQueryModel
 * JD-Core Version:    0.7.0.1
 */