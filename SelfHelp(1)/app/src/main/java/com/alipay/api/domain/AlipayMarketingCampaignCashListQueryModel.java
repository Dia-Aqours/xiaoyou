/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMarketingCampaignCashListQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8583851291679748653L;
/* 10:   */   @ApiField("camp_status")
/* 11:   */   private String campStatus;
/* 12:   */   @ApiField("page_index")
/* 13:   */   private String pageIndex;
/* 14:   */   @ApiField("page_size")
/* 15:   */   private String pageSize;
/* 16:   */   
/* 17:   */   public String getCampStatus()
/* 18:   */   {
/* 19:43 */     return this.campStatus;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCampStatus(String campStatus)
/* 23:   */   {
/* 24:46 */     this.campStatus = campStatus;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPageIndex()
/* 28:   */   {
/* 29:50 */     return this.pageIndex;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageIndex(String pageIndex)
/* 33:   */   {
/* 34:53 */     this.pageIndex = pageIndex;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPageSize()
/* 38:   */   {
/* 39:57 */     return this.pageSize;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPageSize(String pageSize)
/* 43:   */   {
/* 44:60 */     this.pageSize = pageSize;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignCashListQueryModel
 * JD-Core Version:    0.7.0.1
 */