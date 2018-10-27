/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipaySystemOauthTokenResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8233938293599966471L;
/* 10:   */   @ApiField("access_token")
/* 11:   */   private String accessToken;
/* 12:   */   @ApiField("alipay_user_id")
/* 13:   */   private String alipayUserId;
/* 14:   */   @ApiField("expires_in")
/* 15:   */   private String expiresIn;
/* 16:   */   @ApiField("re_expires_in")
/* 17:   */   private String reExpiresIn;
/* 18:   */   @ApiField("refresh_token")
/* 19:   */   private String refreshToken;
/* 20:   */   @ApiField("user_id")
/* 21:   */   private String userId;
/* 22:   */   
/* 23:   */   public void setAccessToken(String accessToken)
/* 24:   */   {
/* 25:54 */     this.accessToken = accessToken;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getAccessToken()
/* 29:   */   {
/* 30:57 */     return this.accessToken;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setAlipayUserId(String alipayUserId)
/* 34:   */   {
/* 35:61 */     this.alipayUserId = alipayUserId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getAlipayUserId()
/* 39:   */   {
/* 40:64 */     return this.alipayUserId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setExpiresIn(String expiresIn)
/* 44:   */   {
/* 45:68 */     this.expiresIn = expiresIn;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getExpiresIn()
/* 49:   */   {
/* 50:71 */     return this.expiresIn;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setReExpiresIn(String reExpiresIn)
/* 54:   */   {
/* 55:75 */     this.reExpiresIn = reExpiresIn;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getReExpiresIn()
/* 59:   */   {
/* 60:78 */     return this.reExpiresIn;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setRefreshToken(String refreshToken)
/* 64:   */   {
/* 65:82 */     this.refreshToken = refreshToken;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String getRefreshToken()
/* 69:   */   {
/* 70:85 */     return this.refreshToken;
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

 * Qualified Name:     com.alipay.api.response.AlipaySystemOauthTokenResponse

 * JD-Core Version:    0.7.0.1

 */