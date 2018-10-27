/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignCrowdCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4896836617636632186L;
/* 10:   */   @ApiField("crowd_group_id")
/* 11:   */   private String crowdGroupId;
/* 12:   */   
/* 13:   */   public void setCrowdGroupId(String crowdGroupId)
/* 14:   */   {
/* 15:24 */     this.crowdGroupId = crowdGroupId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getCrowdGroupId()
/* 19:   */   {
/* 20:27 */     return this.crowdGroupId;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignCrowdCreateResponse
 * JD-Core Version:    0.7.0.1
 */