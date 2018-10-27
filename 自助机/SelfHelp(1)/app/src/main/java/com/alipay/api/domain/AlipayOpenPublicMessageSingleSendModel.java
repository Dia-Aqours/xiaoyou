/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicMessageSingleSendModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6827958683763791211L;
/* 10:   */   @ApiField("template")
/* 11:   */   private Template template;
/* 12:   */   @ApiField("to_user_id")
/* 13:   */   private String toUserId;
/* 14:   */   
/* 15:   */   public Template getTemplate()
/* 16:   */   {
/* 17:29 */     return this.template;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setTemplate(Template template)
/* 21:   */   {
/* 22:32 */     this.template = template;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getToUserId()
/* 26:   */   {
/* 27:36 */     return this.toUserId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setToUserId(String toUserId)
/* 31:   */   {
/* 32:39 */     this.toUserId = toUserId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicMessageSingleSendModel
 * JD-Core Version:    0.7.0.1
 */