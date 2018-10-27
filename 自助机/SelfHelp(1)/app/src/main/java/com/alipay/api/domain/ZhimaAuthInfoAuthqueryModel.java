/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaAuthInfoAuthqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2444471683539583925L;
/* 10:   */   @ApiField("identity_param")
/* 11:   */   private String identityParam;
/* 12:   */   
/* 13:   */   public String getIdentityParam()
/* 14:   */   {
/* 15:23 */     return this.identityParam;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setIdentityParam(String identityParam)
/* 19:   */   {
/* 20:26 */     this.identityParam = identityParam;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaAuthInfoAuthqueryModel
 * JD-Core Version:    0.7.0.1
 */