/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarMerchantshopCommentBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3259227547916498956L;
/* 10:   */   @ApiField("page_num")
/* 11:   */   private Long pageNum;
/* 12:   */   @ApiField("page_size")
/* 13:   */   private Long pageSize;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private Long shopId;
/* 16:   */   
/* 17:   */   public Long getPageNum()
/* 18:   */   {
/* 19:35 */     return this.pageNum;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setPageNum(Long pageNum)
/* 23:   */   {
/* 24:38 */     this.pageNum = pageNum;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Long getPageSize()
/* 28:   */   {
/* 29:42 */     return this.pageSize;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageSize(Long pageSize)
/* 33:   */   {
/* 34:45 */     this.pageSize = pageSize;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Long getShopId()
/* 38:   */   {
/* 39:49 */     return this.shopId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setShopId(Long shopId)
/* 43:   */   {
/* 44:52 */     this.shopId = shopId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMerchantshopCommentBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */