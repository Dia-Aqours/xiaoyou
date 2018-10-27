/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlisisReportRow;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMarketingDataAlisisReportQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5532888582529191446L;
/* 13:   */   @ApiListField("report_data")
/* 14:   */   @ApiField("alisis_report_row")
/* 15:   */   private List<AlisisReportRow> reportData;
/* 16:   */   
/* 17:   */   public void setReportData(List<AlisisReportRow> reportData)
/* 18:   */   {
/* 19:28 */     this.reportData = reportData;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<AlisisReportRow> getReportData()
/* 23:   */   {
/* 24:31 */     return this.reportData;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataAlisisReportQueryResponse
 * JD-Core Version:    0.7.0.1
 */