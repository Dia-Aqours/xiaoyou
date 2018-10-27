/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaAuthInfoAuthqueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2764218146618492669L;
/* 10:   */   @ApiField("authorized")
/* 11:   */   private Boolean authorized;
/* 12:   */   
/* 13:   */   public void setAuthorized(Boolean authorized)
/* 14:   */   {
/* 15:24 */     this.authorized = authorized;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Boolean getAuthorized()
/* 19:   */   {
/* 20:27 */     return this.authorized;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaAuthInfoAuthqueryResponse
 * JD-Core Version:    0.7.0.1
 */