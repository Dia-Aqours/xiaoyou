/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicThirdCustomerServiceResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3453175181138437694L;
/* 10:   */   @ApiField("public_name")
/* 11:   */   private String publicName;
/* 12:   */   
/* 13:   */   public void setPublicName(String publicName)
/* 14:   */   {
/* 15:24 */     this.publicName = publicName;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getPublicName()
/* 19:   */   {
/* 20:27 */     return this.publicName;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicThirdCustomerServiceResponse
 * JD-Core Version:    0.7.0.1
 */