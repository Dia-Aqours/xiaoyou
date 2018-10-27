/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class NewsfeedLabelInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3112813967595788689L;
/* 10:   */   @ApiField("action")
/* 11:   */   private String action;
/* 12:   */   @ApiField("scheme")
/* 13:   */   private String scheme;
/* 14:   */   @ApiField("target")
/* 15:   */   private String target;
/* 16:   */   
/* 17:   */   public String getAction()
/* 18:   */   {
/* 19:35 */     return this.action;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAction(String action)
/* 23:   */   {
/* 24:38 */     this.action = action;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getScheme()
/* 28:   */   {
/* 29:42 */     return this.scheme;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setScheme(String scheme)
/* 33:   */   {
/* 34:45 */     this.scheme = scheme;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTarget()
/* 38:   */   {
/* 39:49 */     return this.target;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTarget(String target)
/* 43:   */   {
/* 44:52 */     this.target = target;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.NewsfeedLabelInfo
 * JD-Core Version:    0.7.0.1
 */