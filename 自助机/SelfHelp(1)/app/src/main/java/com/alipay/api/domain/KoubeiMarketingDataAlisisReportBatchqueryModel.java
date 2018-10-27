/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataAlisisReportBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5727975443457141926L;
/* 10:   */   @ApiField("page")
/* 11:   */   private String page;
/* 12:   */   @ApiField("size")
/* 13:   */   private String size;
/* 14:   */   
/* 15:   */   public String getPage()
/* 16:   */   {
/* 17:29 */     return this.page;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setPage(String page)
/* 21:   */   {
/* 22:32 */     this.page = page;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getSize()
/* 26:   */   {
/* 27:36 */     return this.size;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setSize(String size)
/* 31:   */   {
/* 32:39 */     this.size = size;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataAlisisReportBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */