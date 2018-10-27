/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class MedicalHospitalReportList
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5314545637843344598L;
/* 11:   */   @ApiField("report_date")
/* 12:   */   private Date reportDate;
/* 13:   */   @ApiField("report_desc")
/* 14:   */   private String reportDesc;
/* 15:   */   @ApiField("report_link")
/* 16:   */   private String reportLink;
/* 17:   */   @ApiField("report_name")
/* 18:   */   private String reportName;
/* 19:   */   @ApiField("report_type")
/* 20:   */   private String reportType;
/* 21:   */   
/* 22:   */   public Date getReportDate()
/* 23:   */   {
/* 24:51 */     return this.reportDate;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setReportDate(Date reportDate)
/* 28:   */   {
/* 29:54 */     this.reportDate = reportDate;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getReportDesc()
/* 33:   */   {
/* 34:58 */     return this.reportDesc;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setReportDesc(String reportDesc)
/* 38:   */   {
/* 39:61 */     this.reportDesc = reportDesc;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getReportLink()
/* 43:   */   {
/* 44:65 */     return this.reportLink;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void setReportLink(String reportLink)
/* 48:   */   {
/* 49:68 */     this.reportLink = reportLink;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public String getReportName()
/* 53:   */   {
/* 54:72 */     return this.reportName;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void setReportName(String reportName)
/* 58:   */   {
/* 59:75 */     this.reportName = reportName;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public String getReportType()
/* 63:   */   {
/* 64:79 */     return this.reportType;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void setReportType(String reportType)
/* 68:   */   {
/* 69:82 */     this.reportType = reportType;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MedicalHospitalReportList
 * JD-Core Version:    0.7.0.1
 */