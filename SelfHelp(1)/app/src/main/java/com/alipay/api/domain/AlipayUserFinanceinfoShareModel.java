/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserFinanceinfoShareModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4378364277214914736L;
/* 10:   */   @ApiField("user_id")
/* 11:   */   private String userId;
/* 12:   */   
/* 13:   */   public String getUserId()
/* 14:   */   {
/* 15:24 */     return this.userId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setUserId(String userId)
/* 19:   */   {
/* 20:27 */     this.userId = userId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserFinanceinfoShareModel
 * JD-Core Version:    0.7.0.1
 */