/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingCampaignCrowdBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4235642454827444523L;
/* 10:   */   @ApiField("name")
/* 11:   */   private String name;
/* 12:   */   @ApiField("page_number")
/* 13:   */   private String pageNumber;
/* 14:   */   @ApiField("page_size")
/* 15:   */   private String pageSize;
/* 16:   */   
/* 17:   */   public String getName()
/* 18:   */   {
/* 19:35 */     return this.name;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setName(String name)
/* 23:   */   {
/* 24:38 */     this.name = name;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPageNumber()
/* 28:   */   {
/* 29:42 */     return this.pageNumber;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageNumber(String pageNumber)
/* 33:   */   {
/* 34:45 */     this.pageNumber = pageNumber;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPageSize()
/* 38:   */   {
/* 39:49 */     return this.pageSize;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPageSize(String pageSize)
/* 43:   */   {
/* 44:52 */     this.pageSize = pageSize;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingCampaignCrowdBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */