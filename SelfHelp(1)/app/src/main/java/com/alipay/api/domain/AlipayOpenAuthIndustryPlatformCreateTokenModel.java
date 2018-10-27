/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenAuthIndustryPlatformCreateTokenModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4158644979819843624L;
/* 10:   */   @ApiField("isv_appid")
/* 11:   */   private String isvAppid;
/* 12:   */   @ApiField("scope")
/* 13:   */   private String scope;
/* 14:   */   
/* 15:   */   public String getIsvAppid()
/* 16:   */   {
/* 17:29 */     return this.isvAppid;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setIsvAppid(String isvAppid)
/* 21:   */   {
/* 22:32 */     this.isvAppid = isvAppid;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getScope()
/* 26:   */   {
/* 27:36 */     return this.scope;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setScope(String scope)
/* 31:   */   {
/* 32:39 */     this.scope = scope;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenAuthIndustryPlatformCreateTokenModel
 * JD-Core Version:    0.7.0.1
 */