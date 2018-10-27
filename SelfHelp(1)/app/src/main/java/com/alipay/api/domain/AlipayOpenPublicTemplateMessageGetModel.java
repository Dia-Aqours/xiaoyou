/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicTemplateMessageGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7649995972597347598L;
/* 10:   */   @ApiField("template_id")
/* 11:   */   private String templateId;
/* 12:   */   
/* 13:   */   public String getTemplateId()
/* 14:   */   {
/* 15:23 */     return this.templateId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setTemplateId(String templateId)
/* 19:   */   {
/* 20:26 */     this.templateId = templateId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicTemplateMessageGetModel
 * JD-Core Version:    0.7.0.1
 */