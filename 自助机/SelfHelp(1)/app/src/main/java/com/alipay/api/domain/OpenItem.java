/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class OpenItem
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1141534655514624897L;
/* 10:   */   @ApiField("item_id")
/* 11:   */   private String itemId;
/* 12:   */   @ApiField("item_status")
/* 13:   */   private String itemStatus;
/* 14:   */   @ApiField("store_id")
/* 15:   */   private String storeId;
/* 16:   */   
/* 17:   */   public String getItemId()
/* 18:   */   {
/* 19:38 */     return this.itemId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setItemId(String itemId)
/* 23:   */   {
/* 24:41 */     this.itemId = itemId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getItemStatus()
/* 28:   */   {
/* 29:45 */     return this.itemStatus;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setItemStatus(String itemStatus)
/* 33:   */   {
/* 34:48 */     this.itemStatus = itemStatus;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStoreId()
/* 38:   */   {
/* 39:52 */     return this.storeId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStoreId(String storeId)
/* 43:   */   {
/* 44:55 */     this.storeId = storeId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenItem
 * JD-Core Version:    0.7.0.1
 */