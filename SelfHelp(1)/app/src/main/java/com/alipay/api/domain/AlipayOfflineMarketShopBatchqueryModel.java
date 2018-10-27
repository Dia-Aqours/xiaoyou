/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOfflineMarketShopBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2867695148749656555L;
/* 10:   */   @ApiField("page_no")
/* 11:   */   private String pageNo;
/* 12:   */   
/* 13:   */   public String getPageNo()
/* 14:   */   {
/* 15:23 */     return this.pageNo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setPageNo(String pageNo)
/* 19:   */   {
/* 20:26 */     this.pageNo = pageNo;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopBatchqueryModel

 * JD-Core Version:    0.7.0.1

 */