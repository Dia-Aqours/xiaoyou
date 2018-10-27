/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserAntpaasTokenThirdTrustLoginModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7375459648435637827L;
/* 10:   */   @ApiField("login_target")
/* 11:   */   private String loginTarget;
/* 12:   */   
/* 13:   */   public String getLoginTarget()
/* 14:   */   {
/* 15:23 */     return this.loginTarget;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setLoginTarget(String loginTarget)
/* 19:   */   {
/* 20:26 */     this.loginTarget = loginTarget;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserAntpaasTokenThirdTrustLoginModel
 * JD-Core Version:    0.7.0.1
 */