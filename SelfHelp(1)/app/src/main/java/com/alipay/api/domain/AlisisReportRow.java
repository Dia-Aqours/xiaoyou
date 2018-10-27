/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlisisReportRow
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1622692379726738199L;
/* 12:   */   @ApiListField("row_data")
/* 13:   */   @ApiField("alisis_report_column")
/* 14:   */   private List<AlisisReportColumn> rowData;
/* 15:   */   
/* 16:   */   public List<AlisisReportColumn> getRowData()
/* 17:   */   {
/* 18:27 */     return this.rowData;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setRowData(List<AlisisReportColumn> rowData)
/* 22:   */   {
/* 23:30 */     this.rowData = rowData;
/* 24:   */   }
/* 25:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlisisReportRow
 * JD-Core Version:    0.7.0.1
 */