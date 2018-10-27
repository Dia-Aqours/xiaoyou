/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicMessageTotalSendResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8134762339922657859L;
/* 10:   */   @ApiField("message_id")
/* 11:   */   private String messageId;
/* 12:   */   
/* 13:   */   public void setMessageId(String messageId)
/* 14:   */   {
/* 15:24 */     this.messageId = messageId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getMessageId()
/* 19:   */   {
/* 20:27 */     return this.messageId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicMessageTotalSendResponse
 * JD-Core Version:    0.7.0.1
 */