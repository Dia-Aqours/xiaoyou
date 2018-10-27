/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceMedicalInstcardBindModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4847237242939256534L;
/* 10:   */   @ApiField("return_url")
/* 11:   */   private String returnUrl;
/* 12:   */   
/* 13:   */   public String getReturnUrl()
/* 14:   */   {
/* 15:23 */     return this.returnUrl;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setReturnUrl(String returnUrl)
/* 19:   */   {
/* 20:26 */     this.returnUrl = returnUrl;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceMedicalInstcardBindModel
 * JD-Core Version:    0.7.0.1
 */