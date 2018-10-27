/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlisisReport;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class KoubeiMarketingDataAlisisReportBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4192249223292525991L;
/* 13:   */   @ApiListField("report_list")
/* 14:   */   @ApiField("alisis_report")
/* 15:   */   private List<AlisisReport> reportList;
/* 16:   */   @ApiField("total_count")
/* 17:   */   private String totalCount;
/* 18:   */   
/* 19:   */   public void setReportList(List<AlisisReport> reportList)
/* 20:   */   {
/* 21:34 */     this.reportList = reportList;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<AlisisReport> getReportList()
/* 25:   */   {
/* 26:37 */     return this.reportList;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setTotalCount(String totalCount)
/* 30:   */   {
/* 31:41 */     this.totalCount = totalCount;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getTotalCount()
/* 35:   */   {
/* 36:44 */     return this.totalCount;
/* 37:   */   }
/* 38:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataAlisisReportBatchqueryResponse

 * JD-Core Version:    0.7.0.1

 */