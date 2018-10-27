/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CustomReportCondition;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiMarketingDataCustomreportBatchqueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6229475393178981167L;
/* 13:   */   @ApiListField("report_condition_list")
/* 14:   */   @ApiField("custom_report_condition")
/* 15:   */   private List<CustomReportCondition> reportConditionList;
/* 16:   */   
/* 17:   */   public void setReportConditionList(List<CustomReportCondition> reportConditionList)
/* 18:   */   {
/* 19:28 */     this.reportConditionList = reportConditionList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<CustomReportCondition> getReportConditionList()
/* 23:   */   {
/* 24:31 */     return this.reportConditionList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataCustomreportBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */