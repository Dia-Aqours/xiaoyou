/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketShopAssignstaffResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7447342753253176828L;
/* 10:   */   @ApiField("error_msg")
/* 11:   */   private String errorMsg;
/* 12:   */   @ApiField("result")
/* 13:   */   private String result;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private String shopId;
/* 16:   */   
/* 17:   */   public void setErrorMsg(String errorMsg)
/* 18:   */   {
/* 19:36 */     this.errorMsg = errorMsg;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getErrorMsg()
/* 23:   */   {
/* 24:39 */     return this.errorMsg;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setResult(String result)
/* 28:   */   {
/* 29:43 */     this.result = result;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getResult()
/* 33:   */   {
/* 34:46 */     return this.result;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setShopId(String shopId)
/* 38:   */   {
/* 39:50 */     this.shopId = shopId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getShopId()
/* 43:   */   {
/* 44:53 */     return this.shopId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopAssignstaffResponse
 * JD-Core Version:    0.7.0.1
 */