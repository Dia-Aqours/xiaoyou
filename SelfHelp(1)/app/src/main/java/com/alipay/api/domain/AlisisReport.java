/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlisisReport
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8367632725358837813L;
/* 10:   */   @ApiField("report_desc")
/* 11:   */   private String reportDesc;
/* 12:   */   @ApiField("report_name")
/* 13:   */   private String reportName;
/* 14:   */   @ApiField("report_uk")
/* 15:   */   private String reportUk;
/* 16:   */   
/* 17:   */   public String getReportDesc()
/* 18:   */   {
/* 19:35 */     return this.reportDesc;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setReportDesc(String reportDesc)
/* 23:   */   {
/* 24:38 */     this.reportDesc = reportDesc;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getReportName()
/* 28:   */   {
/* 29:42 */     return this.reportName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setReportName(String reportName)
/* 33:   */   {
/* 34:45 */     this.reportName = reportName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getReportUk()
/* 38:   */   {
/* 39:49 */     return this.reportUk;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setReportUk(String reportUk)
/* 43:   */   {
/* 44:52 */     this.reportUk = reportUk;
/* 45:   */   }
/* 46:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlisisReport

 * JD-Core Version:    0.7.0.1

 */