/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignCrowdCountResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3283833653756486928L;
/* 10:   */   @ApiField("dimension_values")
/* 11:   */   private String dimensionValues;
/* 12:   */   @ApiField("summary_values")
/* 13:   */   private String summaryValues;
/* 14:   */   
/* 15:   */   public void setDimensionValues(String dimensionValues)
/* 16:   */   {
/* 17:30 */     this.dimensionValues = dimensionValues;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getDimensionValues()
/* 21:   */   {
/* 22:33 */     return this.dimensionValues;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setSummaryValues(String summaryValues)
/* 26:   */   {
/* 27:37 */     this.summaryValues = summaryValues;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getSummaryValues()
/* 31:   */   {
/* 32:40 */     return this.summaryValues;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingCampaignCrowdCountResponse
 * JD-Core Version:    0.7.0.1
 */