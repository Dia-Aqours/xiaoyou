/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketExpensePostModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6146211596652915168L;
/* 10:   */   @ApiField("action")
/* 11:   */   private String action;
/* 12:   */   @ApiField("request")
/* 13:   */   private String request;
/* 14:   */   
/* 15:   */   public String getAction()
/* 16:   */   {
/* 17:29 */     return this.action;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAction(String action)
/* 21:   */   {
/* 22:32 */     this.action = action;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRequest()
/* 26:   */   {
/* 27:36 */     return this.request;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRequest(String request)
/* 31:   */   {
/* 32:39 */     this.request = request;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketExpensePostModel
 * JD-Core Version:    0.7.0.1
 */