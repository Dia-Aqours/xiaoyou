/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayOpenPublicLifeAccountCreateResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2241689864716314481L;
/* 11:   */   @ApiField("expire_time")
/* 12:   */   private Date expireTime;
/* 13:   */   @ApiField("public_id")
/* 14:   */   private String publicId;
/* 15:   */   @ApiField("refresh_token")
/* 16:   */   private String refreshToken;
/* 17:   */   @ApiField("token")
/* 18:   */   private String token;
/* 19:   */   
/* 20:   */   public void setExpireTime(Date expireTime)
/* 21:   */   {
/* 22:43 */     this.expireTime = expireTime;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Date getExpireTime()
/* 26:   */   {
/* 27:46 */     return this.expireTime;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPublicId(String publicId)
/* 31:   */   {
/* 32:50 */     this.publicId = publicId;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getPublicId()
/* 36:   */   {
/* 37:53 */     return this.publicId;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setRefreshToken(String refreshToken)
/* 41:   */   {
/* 42:57 */     this.refreshToken = refreshToken;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getRefreshToken()
/* 46:   */   {
/* 47:60 */     return this.refreshToken;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setToken(String token)
/* 51:   */   {
/* 52:64 */     this.token = token;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getToken()
/* 56:   */   {
/* 57:67 */     return this.token;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicLifeAccountCreateResponse
 * JD-Core Version:    0.7.0.1
 */