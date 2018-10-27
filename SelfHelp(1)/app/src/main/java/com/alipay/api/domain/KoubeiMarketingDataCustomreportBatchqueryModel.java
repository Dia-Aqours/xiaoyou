/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataCustomreportBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1729865738858631695L;
/* 10:   */   @ApiField("page_no")
/* 11:   */   private String pageNo;
/* 12:   */   @ApiField("page_size")
/* 13:   */   private String pageSize;
/* 14:   */   
/* 15:   */   public String getPageNo()
/* 16:   */   {
/* 17:29 */     return this.pageNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setPageNo(String pageNo)
/* 21:   */   {
/* 22:32 */     this.pageNo = pageNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getPageSize()
/* 26:   */   {
/* 27:36 */     return this.pageSize;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPageSize(String pageSize)
/* 31:   */   {
/* 32:39 */     this.pageSize = pageSize;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataCustomreportBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */