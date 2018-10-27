/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenAuthIndustryPlatformCreateTokenResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1887824473297272962L;
/* 10:   */   @ApiField("auth_code")
/* 11:   */   private String authCode;
/* 12:   */   @ApiField("requst_app_id")
/* 13:   */   private String requstAppId;
/* 14:   */   @ApiField("scope")
/* 15:   */   private String scope;
/* 16:   */   
/* 17:   */   public void setAuthCode(String authCode)
/* 18:   */   {
/* 19:36 */     this.authCode = authCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getAuthCode()
/* 23:   */   {
/* 24:39 */     return this.authCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setRequstAppId(String requstAppId)
/* 28:   */   {
/* 29:43 */     this.requstAppId = requstAppId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getRequstAppId()
/* 33:   */   {
/* 34:46 */     return this.requstAppId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setScope(String scope)
/* 38:   */   {
/* 39:50 */     this.scope = scope;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getScope()
/* 43:   */   {
/* 44:53 */     return this.scope;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenAuthIndustryPlatformCreateTokenResponse
 * JD-Core Version:    0.7.0.1
 */