/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenAuthTokenAppModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2238375723563976914L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("grant_type")
/* 13:   */   private String grantType;
/* 14:   */   @ApiField("refresh_token")
/* 15:   */   private String refreshToken;
/* 16:   */   
/* 17:   */   public String getCode()
/* 18:   */   {
/* 19:36 */     return this.code;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCode(String code)
/* 23:   */   {
/* 24:39 */     this.code = code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getGrantType()
/* 28:   */   {
/* 29:43 */     return this.grantType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setGrantType(String grantType)
/* 33:   */   {
/* 34:46 */     this.grantType = grantType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getRefreshToken()
/* 38:   */   {
/* 39:50 */     return this.refreshToken;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setRefreshToken(String refreshToken)
/* 43:   */   {
/* 44:53 */     this.refreshToken = refreshToken;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenAuthTokenAppModel
 * JD-Core Version:    0.7.0.1
 */