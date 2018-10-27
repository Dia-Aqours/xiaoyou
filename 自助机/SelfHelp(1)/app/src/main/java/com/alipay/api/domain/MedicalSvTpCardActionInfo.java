/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MedicalSvTpCardActionInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2869736145369163473L;
/* 10:   */   @ApiField("action_code")
/* 11:   */   private String actionCode;
/* 12:   */   @ApiField("action_name")
/* 13:   */   private String actionName;
/* 14:   */   @ApiField("action_url")
/* 15:   */   private String actionUrl;
/* 16:   */   
/* 17:   */   public String getActionCode()
/* 18:   */   {
/* 19:36 */     return this.actionCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setActionCode(String actionCode)
/* 23:   */   {
/* 24:39 */     this.actionCode = actionCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getActionName()
/* 28:   */   {
/* 29:43 */     return this.actionName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setActionName(String actionName)
/* 33:   */   {
/* 34:46 */     this.actionName = actionName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getActionUrl()
/* 38:   */   {
/* 39:50 */     return this.actionUrl;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setActionUrl(String actionUrl)
/* 43:   */   {
/* 44:53 */     this.actionUrl = actionUrl;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalSvTpCardActionInfo
 * JD-Core Version:    0.7.0.1
 */