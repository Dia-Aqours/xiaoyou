/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayInsMarketingCampaignQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8854753294849418846L;
/* 10:   */   @ApiField("campaign_id")
/* 11:   */   private String campaignId;
/* 12:   */   @ApiField("request_id")
/* 13:   */   private String requestId;
/* 14:   */   
/* 15:   */   public String getCampaignId()
/* 16:   */   {
/* 17:29 */     return this.campaignId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCampaignId(String campaignId)
/* 21:   */   {
/* 22:32 */     this.campaignId = campaignId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRequestId()
/* 26:   */   {
/* 27:36 */     return this.requestId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRequestId(String requestId)
/* 31:   */   {
/* 32:39 */     this.requestId = requestId;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayInsMarketingCampaignQueryModel

 * JD-Core Version:    0.7.0.1

 */