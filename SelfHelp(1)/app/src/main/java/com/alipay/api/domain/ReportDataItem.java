/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ReportDataItem
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5472679961495758285L;
/* 10:   */   @ApiField("row_data")
/* 11:   */   private String rowData;
/* 12:   */   
/* 13:   */   public String getRowData()
/* 14:   */   {
/* 15:23 */     return this.rowData;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setRowData(String rowData)
/* 19:   */   {
/* 20:26 */     this.rowData = rowData;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ReportDataItem
 * JD-Core Version:    0.7.0.1
 */