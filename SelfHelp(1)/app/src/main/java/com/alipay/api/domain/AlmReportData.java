/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlmReportData
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1861511953367379178L;
/* 10:   */   @ApiField("biz_type")
/* 11:   */   private String bizType;
/* 12:   */   @ApiField("date_type")
/* 13:   */   private String dateType;
/* 14:   */   @ApiField("report_date")
/* 15:   */   private String reportDate;
/* 16:   */   @ApiField("report_name")
/* 17:   */   private String reportName;
/* 18:   */   @ApiField("report_value")
/* 19:   */   private Long reportValue;
/* 20:   */   @ApiField("sub_biz_type")
/* 21:   */   private String subBizType;
/* 22:   */   
/* 23:   */   public String getBizType()
/* 24:   */   {
/* 25:56 */     return this.bizType;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBizType(String bizType)
/* 29:   */   {
/* 30:59 */     this.bizType = bizType;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getDateType()
/* 34:   */   {
/* 35:63 */     return this.dateType;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setDateType(String dateType)
/* 39:   */   {
/* 40:66 */     this.dateType = dateType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getReportDate()
/* 44:   */   {
/* 45:70 */     return this.reportDate;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setReportDate(String reportDate)
/* 49:   */   {
/* 50:73 */     this.reportDate = reportDate;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getReportName()
/* 54:   */   {
/* 55:77 */     return this.reportName;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setReportName(String reportName)
/* 59:   */   {
/* 60:80 */     this.reportName = reportName;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public Long getReportValue()
/* 64:   */   {
/* 65:84 */     return this.reportValue;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setReportValue(Long reportValue)
/* 69:   */   {
/* 70:87 */     this.reportValue = reportValue;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getSubBizType()
/* 74:   */   {
/* 75:91 */     return this.subBizType;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setSubBizType(String subBizType)
/* 79:   */   {
/* 80:94 */     this.subBizType = subBizType;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlmReportData
 * JD-Core Version:    0.7.0.1
 */