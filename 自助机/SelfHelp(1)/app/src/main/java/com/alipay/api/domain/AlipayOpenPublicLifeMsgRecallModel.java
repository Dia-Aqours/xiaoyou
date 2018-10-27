/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicLifeMsgRecallModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3198378588959761346L;
/* 10:   */   @ApiField("message_id")
/* 11:   */   private String messageId;
/* 12:   */   
/* 13:   */   public String getMessageId()
/* 14:   */   {
/* 15:23 */     return this.messageId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMessageId(String messageId)
/* 19:   */   {
/* 20:26 */     this.messageId = messageId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicLifeMsgRecallModel
 * JD-Core Version:    0.7.0.1
 */