/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTrustUserTokenGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6727995712735745754L;
/* 10:   */   @ApiField("access_token")
/* 11:   */   private String accessToken;
/* 12:   */   @ApiField("refresh_token")
/* 13:   */   private String refreshToken;
/* 14:   */   
/* 15:   */   public void setAccessToken(String accessToken)
/* 16:   */   {
/* 17:30 */     this.accessToken = accessToken;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getAccessToken()
/* 21:   */   {
/* 22:33 */     return this.accessToken;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setRefreshToken(String refreshToken)
/* 26:   */   {
/* 27:37 */     this.refreshToken = refreshToken;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getRefreshToken()
/* 31:   */   {
/* 32:40 */     return this.refreshToken;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserTokenGetResponse
 * JD-Core Version:    0.7.0.1
 */