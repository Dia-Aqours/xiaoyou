/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignCrowdBatchqueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3465179695959365776L;
/* 10:   */   @ApiField("crowd_group_sets")
/* 11:   */   private String crowdGroupSets;
/* 12:   */   @ApiField("total_number")
/* 13:   */   private String totalNumber;
/* 14:   */   
/* 15:   */   public void setCrowdGroupSets(String crowdGroupSets)
/* 16:   */   {
/* 17:30 */     this.crowdGroupSets = crowdGroupSets;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCrowdGroupSets()
/* 21:   */   {
/* 22:33 */     return this.crowdGroupSets;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setTotalNumber(String totalNumber)
/* 26:   */   {
/* 27:37 */     this.totalNumber = totalNumber;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getTotalNumber()
/* 31:   */   {
/* 32:40 */     return this.totalNumber;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignCrowdBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */