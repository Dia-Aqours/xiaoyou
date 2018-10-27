/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketProductBatchqueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6374376138935947582L;
/* 10:   */   @ApiField("op_role")
/* 11:   */   private String opRole;
/* 12:   */   @ApiField("page_no")
/* 13:   */   private String pageNo;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private String shopId;
/* 16:   */   
/* 17:   */   public String getOpRole()
/* 18:   */   {
/* 19:35 */     return this.opRole;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOpRole(String opRole)
/* 23:   */   {
/* 24:38 */     this.opRole = opRole;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getPageNo()
/* 28:   */   {
/* 29:42 */     return this.pageNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setPageNo(String pageNo)
/* 33:   */   {
/* 34:45 */     this.pageNo = pageNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getShopId()
/* 38:   */   {
/* 39:49 */     return this.shopId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setShopId(String shopId)
/* 43:   */   {
/* 44:52 */     this.shopId = shopId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketProductBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */