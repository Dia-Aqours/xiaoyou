/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAssetPointOrderQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3155123359148453919L;
/* 10:   */   @ApiField("merchant_order_no")
/* 11:   */   private String merchantOrderNo;
/* 12:   */   
/* 13:   */   public String getMerchantOrderNo()
/* 14:   */   {
/* 15:23 */     return this.merchantOrderNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMerchantOrderNo(String merchantOrderNo)
/* 19:   */   {
/* 20:26 */     this.merchantOrderNo = merchantOrderNo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayAssetPointOrderQueryModel
 * JD-Core Version:    0.7.0.1
 */