/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaDataFeedbackurlQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7223443578492944341L;
/* 10:   */   @ApiField("merchant_id")
/* 11:   */   private String merchantId;
/* 12:   */   
/* 13:   */   public String getMerchantId()
/* 14:   */   {
/* 15:23 */     return this.merchantId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMerchantId(String merchantId)
/* 19:   */   {
/* 20:26 */     this.merchantId = merchantId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaDataFeedbackurlQueryModel
 * JD-Core Version:    0.7.0.1
 */