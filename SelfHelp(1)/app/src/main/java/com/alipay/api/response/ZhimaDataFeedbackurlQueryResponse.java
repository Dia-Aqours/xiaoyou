/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaDataFeedbackurlQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5796826186562426967L;
/* 10:   */   @ApiField("feedback_url")
/* 11:   */   private String feedbackUrl;
/* 12:   */   
/* 13:   */   public void setFeedbackUrl(String feedbackUrl)
/* 14:   */   {
/* 15:24 */     this.feedbackUrl = feedbackUrl;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getFeedbackUrl()
/* 19:   */   {
/* 20:27 */     return this.feedbackUrl;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.ZhimaDataFeedbackurlQueryResponse
 * JD-Core Version:    0.7.0.1
 */