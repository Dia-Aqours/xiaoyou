/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicTemplateMessageGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6572395696482153266L;
/* 10:   */   @ApiField("msg_template_id")
/* 11:   */   private String msgTemplateId;
/* 12:   */   @ApiField("template")
/* 13:   */   private String template;
/* 14:   */   
/* 15:   */   public void setMsgTemplateId(String msgTemplateId)
/* 16:   */   {
/* 17:30 */     this.msgTemplateId = msgTemplateId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getMsgTemplateId()
/* 21:   */   {
/* 22:33 */     return this.msgTemplateId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setTemplate(String template)
/* 26:   */   {
/* 27:37 */     this.template = template;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getTemplate()
/* 31:   */   {
/* 32:40 */     return this.template;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOpenPublicTemplateMessageGetResponse
 * JD-Core Version:    0.7.0.1
 */