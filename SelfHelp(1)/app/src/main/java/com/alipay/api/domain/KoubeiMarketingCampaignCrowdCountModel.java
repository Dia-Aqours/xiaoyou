/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignCrowdCountModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2189156697972889132L;
/* 10:   */   @ApiField("conditions")
/* 11:   */   private String conditions;
/* 12:   */   @ApiField("crowd_group_id")
/* 13:   */   private String crowdGroupId;
/* 14:   */   @ApiField("dimensions")
/* 15:   */   private String dimensions;
/* 16:   */   
/* 17:   */   public String getConditions()
/* 18:   */   {
/* 19:39 */     return this.conditions;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setConditions(String conditions)
/* 23:   */   {
/* 24:42 */     this.conditions = conditions;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCrowdGroupId()
/* 28:   */   {
/* 29:46 */     return this.crowdGroupId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCrowdGroupId(String crowdGroupId)
/* 33:   */   {
/* 34:49 */     this.crowdGroupId = crowdGroupId;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getDimensions()
/* 38:   */   {
/* 39:53 */     return this.dimensions;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setDimensions(String dimensions)
/* 43:   */   {
/* 44:56 */     this.dimensions = dimensions;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignCrowdCountModel
 * JD-Core Version:    0.7.0.1
 */