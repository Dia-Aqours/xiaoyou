/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayCommerceTransportOfflinepayUserblacklistQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2712246631874246899L;
/* 10:   */   @ApiField("page_index")
/* 11:   */   private Long pageIndex;
/* 12:   */   @ApiField("page_size")
/* 13:   */   private Long pageSize;
/* 14:   */   
/* 15:   */   public Long getPageIndex()
/* 16:   */   {
/* 17:29 */     return this.pageIndex;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setPageIndex(Long pageIndex)
/* 21:   */   {
/* 22:32 */     this.pageIndex = pageIndex;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Long getPageSize()
/* 26:   */   {
/* 27:36 */     return this.pageSize;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setPageSize(Long pageSize)
/* 31:   */   {
/* 32:39 */     this.pageSize = pageSize;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceTransportOfflinepayUserblacklistQueryModel
 * JD-Core Version:    0.7.0.1
 */