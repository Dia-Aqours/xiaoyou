/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbOrderShopModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7598853755895252428L;
/* 10:   */   @ApiField("shop_id")
/* 11:   */   private String shopId;
/* 12:   */   @ApiField("shop_name")
/* 13:   */   private String shopName;
/* 14:   */   @ApiField("store_id")
/* 15:   */   private String storeId;
/* 16:   */   
/* 17:   */   public String getShopId()
/* 18:   */   {
/* 19:35 */     return this.shopId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setShopId(String shopId)
/* 23:   */   {
/* 24:38 */     this.shopId = shopId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getShopName()
/* 28:   */   {
/* 29:42 */     return this.shopName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setShopName(String shopName)
/* 33:   */   {
/* 34:45 */     this.shopName = shopName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStoreId()
/* 38:   */   {
/* 39:49 */     return this.storeId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStoreId(String storeId)
/* 43:   */   {
/* 44:52 */     this.storeId = storeId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbOrderShopModel
 * JD-Core Version:    0.7.0.1
 */