/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenAuthTokenAppQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2174189799544831369L;
/* 10:   */   @ApiField("app_auth_token")
/* 11:   */   private String appAuthToken;
/* 12:   */   
/* 13:   */   public String getAppAuthToken()
/* 14:   */   {
/* 15:23 */     return this.appAuthToken;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setAppAuthToken(String appAuthToken)
/* 19:   */   {
/* 20:26 */     this.appAuthToken = appAuthToken;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenAuthTokenAppQueryModel
 * JD-Core Version:    0.7.0.1
 */