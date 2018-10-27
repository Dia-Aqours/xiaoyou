/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserLevelInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1444555761188386549L;
/* 10:   */   @ApiField("login_id")
/* 11:   */   private String loginId;
/* 12:   */   @ApiField("user_id")
/* 13:   */   private String userId;
/* 14:   */   @ApiField("user_level")
/* 15:   */   private String userLevel;
/* 16:   */   
/* 17:   */   public String getLoginId()
/* 18:   */   {
/* 19:35 */     return this.loginId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setLoginId(String loginId)
/* 23:   */   {
/* 24:38 */     this.loginId = loginId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getUserId()
/* 28:   */   {
/* 29:42 */     return this.userId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setUserId(String userId)
/* 33:   */   {
/* 34:45 */     this.userId = userId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUserLevel()
/* 38:   */   {
/* 39:49 */     return this.userLevel;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUserLevel(String userLevel)
/* 43:   */   {
/* 44:52 */     this.userLevel = userLevel;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserLevelInfo
 * JD-Core Version:    0.7.0.1
 */