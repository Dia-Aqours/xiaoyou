/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CustomReportCondition;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class KoubeiMarketingDataCustomreportDetailQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 6179948189643161598L;
/* 11:   */   @ApiField("report_condition_info")
/* 12:   */   private CustomReportCondition reportConditionInfo;
/* 13:   */   
/* 14:   */   public void setReportConditionInfo(CustomReportCondition reportConditionInfo)
/* 15:   */   {
/* 16:25 */     this.reportConditionInfo = reportConditionInfo;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public CustomReportCondition getReportConditionInfo()
/* 20:   */   {
/* 21:28 */     return this.reportConditionInfo;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomreportDetailQueryResponse
 * JD-Core Version:    0.7.0.1
 */