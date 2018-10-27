/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class NewsfeedWithMeInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1176637827558198846L;
/* 10:   */   @ApiField("login_id")
/* 11:   */   private String loginId;
/* 12:   */   @ApiField("user_id")
/* 13:   */   private String userId;
/* 14:   */   
/* 15:   */   public String getLoginId()
/* 16:   */   {
/* 17:29 */     return this.loginId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setLoginId(String loginId)
/* 21:   */   {
/* 22:32 */     this.loginId = loginId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUserId()
/* 26:   */   {
/* 27:36 */     return this.userId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUserId(String userId)
/* 31:   */   {
/* 32:39 */     this.userId = userId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.NewsfeedWithMeInfo
 * JD-Core Version:    0.7.0.1
 */