/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicLifeMsgSendResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2553978425851561885L;
/* 10:   */   @ApiField("alipay_msg_id")
/* 11:   */   private String alipayMsgId;
/* 12:   */   
/* 13:   */   public void setAlipayMsgId(String alipayMsgId)
/* 14:   */   {
/* 15:24 */     this.alipayMsgId = alipayMsgId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getAlipayMsgId()
/* 19:   */   {
/* 20:27 */     return this.alipayMsgId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicLifeMsgSendResponse
 * JD-Core Version:    0.7.0.1
 */