/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayDataDataserviceYuebaoassetDetailSendModel
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6761817369563825438L;
/* 12:   */   @ApiListField("alm_report_data")
/* 13:   */   @ApiField("alm_report_data")
/* 14:   */   private List<AlmReportData> almReportData;
/* 15:   */   
/* 16:   */   public List<AlmReportData> getAlmReportData()
/* 17:   */   {
/* 18:27 */     return this.almReportData;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setAlmReportData(List<AlmReportData> almReportData)
/* 22:   */   {
/* 23:30 */     this.almReportData = almReportData;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayDataDataserviceYuebaoassetDetailSendModel
 * JD-Core Version:    0.7.0.1
 */