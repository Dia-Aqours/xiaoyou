/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenAuthTokenAppResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4293712314476864311L;
/* 10:   */   @ApiField("app_auth_token")
/* 11:   */   private String appAuthToken;
/* 12:   */   @ApiField("app_refresh_token")
/* 13:   */   private String appRefreshToken;
/* 14:   */   @ApiField("auth_app_id")
/* 15:   */   private String authAppId;
/* 16:   */   @ApiField("expires_in")
/* 17:   */   private String expiresIn;
/* 18:   */   @ApiField("re_expires_in")
/* 19:   */   private String reExpiresIn;
/* 20:   */   @ApiField("user_id")
/* 21:   */   private String userId;
/* 22:   */   
/* 23:   */   public void setAppAuthToken(String appAuthToken)
/* 24:   */   {
/* 25:54 */     this.appAuthToken = appAuthToken;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getAppAuthToken()
/* 29:   */   {
/* 30:57 */     return this.appAuthToken;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setAppRefreshToken(String appRefreshToken)
/* 34:   */   {
/* 35:61 */     this.appRefreshToken = appRefreshToken;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getAppRefreshToken()
/* 39:   */   {
/* 40:64 */     return this.appRefreshToken;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setAuthAppId(String authAppId)
/* 44:   */   {
/* 45:68 */     this.authAppId = authAppId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getAuthAppId()
/* 49:   */   {
/* 50:71 */     return this.authAppId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setExpiresIn(String expiresIn)
/* 54:   */   {
/* 55:75 */     this.expiresIn = expiresIn;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getExpiresIn()
/* 59:   */   {
/* 60:78 */     return this.expiresIn;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setReExpiresIn(String reExpiresIn)
/* 64:   */   {
/* 65:82 */     this.reExpiresIn = reExpiresIn;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String getReExpiresIn()
/* 69:   */   {
/* 70:85 */     return this.reExpiresIn;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void setUserId(String userId)
/* 74:   */   {
/* 75:89 */     this.userId = userId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String getUserId()
/* 79:   */   {
/* 80:92 */     return this.userId;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenAuthTokenAppResponse
 * JD-Core Version:    0.7.0.1
 */