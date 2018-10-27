/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOfflineMarketProductQuerydetailModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3272795925916298681L;
/* 10:   */   @ApiField("item_id")
/* 11:   */   private String itemId;
/* 12:   */   @ApiField("op_role")
/* 13:   */   private String opRole;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private String shopId;
/* 16:   */   
/* 17:   */   public String getItemId()
/* 18:   */   {
/* 19:35 */     return this.itemId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setItemId(String itemId)
/* 23:   */   {
/* 24:38 */     this.itemId = itemId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOpRole()
/* 28:   */   {
/* 29:42 */     return this.opRole;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOpRole(String opRole)
/* 33:   */   {
/* 34:45 */     this.opRole = opRole;
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

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketProductQuerydetailModel

 * JD-Core Version:    0.7.0.1

 */