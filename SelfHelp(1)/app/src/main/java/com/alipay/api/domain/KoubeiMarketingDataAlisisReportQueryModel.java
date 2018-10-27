/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataAlisisReportQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7163782792121939169L;
/* 10:   */   @ApiField("report_uk")
/* 11:   */   private String reportUk;
/* 12:   */   
/* 13:   */   public String getReportUk()
/* 14:   */   {
/* 15:23 */     return this.reportUk;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setReportUk(String reportUk)
/* 19:   */   {
/* 20:26 */     this.reportUk = reportUk;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataAlisisReportQueryModel
 * JD-Core Version:    0.7.0.1
 */