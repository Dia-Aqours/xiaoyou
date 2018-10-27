/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignCrowdDetailQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8148281673674878715L;
/* 10:   */   @ApiField("crowd_group_info")
/* 11:   */   private String crowdGroupInfo;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   
/* 15:   */   public void setCrowdGroupInfo(String crowdGroupInfo)
/* 16:   */   {
/* 17:32 */     this.crowdGroupInfo = crowdGroupInfo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCrowdGroupInfo()
/* 21:   */   {
/* 22:35 */     return this.crowdGroupInfo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setName(String name)
/* 26:   */   {
/* 27:39 */     this.name = name;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getName()
/* 31:   */   {
/* 32:42 */     return this.name;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignCrowdDetailQueryResponse
 * JD-Core Version:    0.7.0.1
 */