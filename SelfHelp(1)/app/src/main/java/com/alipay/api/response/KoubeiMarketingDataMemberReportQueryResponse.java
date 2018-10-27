/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataMemberReportQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1646226144449236172L;
/* 10:   */   @ApiField("report_data")
/* 11:   */   private String reportData;
/* 12:   */   
/* 13:   */   public void setReportData(String reportData)
/* 14:   */   {
/* 15:24 */     this.reportData = reportData;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getReportData()
/* 19:   */   {
/* 20:27 */     return this.reportData;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataMemberReportQueryResponse
 * JD-Core Version:    0.7.0.1
 */