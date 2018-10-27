/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class KoubeiMarketingCampaignCrowdDeleteModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3111797897797768377L;
/* 10:   */   @ApiField("crowd_group_id")
/* 11:   */   private String crowdGroupId;
/* 12:   */   
/* 13:   */   public String getCrowdGroupId()
/* 14:   */   {
/* 15:23 */     return this.crowdGroupId;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCrowdGroupId(String crowdGroupId)
/* 19:   */   {
/* 20:26 */     this.crowdGroupId = crowdGroupId;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignCrowdDeleteModel

 * JD-Core Version:    0.7.0.1

 */