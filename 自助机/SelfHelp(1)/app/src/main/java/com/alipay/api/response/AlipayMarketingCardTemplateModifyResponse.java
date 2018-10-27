/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayMarketingCardTemplateModifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6741842512243372723L;
/* 10:   */   @ApiField("template_id")
/* 11:   */   private String templateId;
/* 12:   */   
/* 13:   */   public void setTemplateId(String templateId)
/* 14:   */   {
/* 15:24 */     this.templateId = templateId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getTemplateId()
/* 19:   */   {
/* 20:27 */     return this.templateId;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayMarketingCardTemplateModifyResponse

 * JD-Core Version:    0.7.0.1

 */