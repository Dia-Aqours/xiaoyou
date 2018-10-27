/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineMarketReportGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1461622643877162197L;
/* 10:   */   @ApiField("ope_pid")
/* 11:   */   private String opePid;
/* 12:   */   @ApiField("request_id")
/* 13:   */   private String requestId;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private String shopId;
/* 16:   */   
/* 17:   */   public String getOpePid()
/* 18:   */   {
/* 19:35 */     return this.opePid;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOpePid(String opePid)
/* 23:   */   {
/* 24:38 */     this.opePid = opePid;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getRequestId()
/* 28:   */   {
/* 29:42 */     return this.requestId;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setRequestId(String requestId)
/* 33:   */   {
/* 34:45 */     this.requestId = requestId;
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
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketReportGetModel
 * JD-Core Version:    0.7.0.1
 */