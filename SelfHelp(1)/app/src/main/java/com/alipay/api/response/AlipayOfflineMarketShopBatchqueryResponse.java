/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayOfflineMarketShopBatchqueryResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 3897162897796269859L;
/* 12:   */   @ApiField("current_pageno")
/* 13:   */   private String currentPageno;
/* 14:   */   @ApiListField("shop_ids")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> shopIds;
/* 17:   */   @ApiField("total_pageno")
/* 18:   */   private String totalPageno;
/* 19:   */   
/* 20:   */   public void setCurrentPageno(String currentPageno)
/* 21:   */   {
/* 22:39 */     this.currentPageno = currentPageno;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCurrentPageno()
/* 26:   */   {
/* 27:42 */     return this.currentPageno;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setShopIds(List<String> shopIds)
/* 31:   */   {
/* 32:46 */     this.shopIds = shopIds;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public List<String> getShopIds()
/* 36:   */   {
/* 37:49 */     return this.shopIds;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setTotalPageno(String totalPageno)
/* 41:   */   {
/* 42:53 */     this.totalPageno = totalPageno;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getTotalPageno()
/* 46:   */   {
/* 47:56 */     return this.totalPageno;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopBatchqueryResponse
 * JD-Core Version:    0.7.0.1
 */