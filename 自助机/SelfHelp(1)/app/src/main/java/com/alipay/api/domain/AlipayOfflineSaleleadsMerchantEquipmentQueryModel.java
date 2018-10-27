/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOfflineSaleleadsMerchantEquipmentQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6893719835248349912L;
/* 10:   */   @ApiField("merchant_pid")
/* 11:   */   private String merchantPid;
/* 12:   */   @ApiField("ope_pid")
/* 13:   */   private String opePid;
/* 14:   */   @ApiField("request_id")
/* 15:   */   private String requestId;
/* 16:   */   @ApiField("shop_id")
/* 17:   */   private String shopId;
/* 18:   */   
/* 19:   */   public String getMerchantPid()
/* 20:   */   {
/* 21:41 */     return this.merchantPid;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setMerchantPid(String merchantPid)
/* 25:   */   {
/* 26:44 */     this.merchantPid = merchantPid;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOpePid()
/* 30:   */   {
/* 31:48 */     return this.opePid;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOpePid(String opePid)
/* 35:   */   {
/* 36:51 */     this.opePid = opePid;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getRequestId()
/* 40:   */   {
/* 41:55 */     return this.requestId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setRequestId(String requestId)
/* 45:   */   {
/* 46:58 */     this.requestId = requestId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getShopId()
/* 50:   */   {
/* 51:62 */     return this.shopId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setShopId(String shopId)
/* 55:   */   {
/* 56:65 */     this.shopId = shopId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsMerchantEquipmentQueryModel
 * JD-Core Version:    0.7.0.1
 */