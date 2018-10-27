/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ReportDataItem;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;

/*  8:   */
/*  9:   */ public class KoubeiMarketingDataCustomreportQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 5886341978629656493L;
/* 13:   */   @ApiField("count")
/* 14:   */   private String count;
/* 15:   */   @ApiListField("report_data")
/* 16:   */   @ApiField("report_data_item")
/* 17:   */   private List<ReportDataItem> reportData;
/* 18:   */   
/* 19:   */   public void setCount(String count)
/* 20:   */   {
/* 21:34 */     this.count = count;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getCount()
/* 25:   */   {
/* 26:37 */     return this.count;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setReportData(List<ReportDataItem> reportData)
/* 30:   */   {
/* 31:41 */     this.reportData = reportData;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public List<ReportDataItem> getReportData()
/* 35:   */   {
/* 36:44 */     return this.reportData;
/* 37:   */   }
/* 38:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomreportQueryResponse

 * JD-Core Version:    0.7.0.1

 */