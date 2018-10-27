/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RecruitShopInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7483748249923134926L;
/* 10:   */   @ApiField("confirm_status")
/* 11:   */   private String confirmStatus;
/* 12:   */   @ApiField("shop_category")
/* 13:   */   private String shopCategory;
/* 14:   */   @ApiField("shop_id")
/* 15:   */   private String shopId;
/* 16:   */   @ApiField("shop_name")
/* 17:   */   private String shopName;
/* 18:   */   
/* 19:   */   public String getConfirmStatus()
/* 20:   */   {
/* 21:41 */     return this.confirmStatus;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setConfirmStatus(String confirmStatus)
/* 25:   */   {
/* 26:44 */     this.confirmStatus = confirmStatus;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getShopCategory()
/* 30:   */   {
/* 31:48 */     return this.shopCategory;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setShopCategory(String shopCategory)
/* 35:   */   {
/* 36:51 */     this.shopCategory = shopCategory;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getShopId()
/* 40:   */   {
/* 41:55 */     return this.shopId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setShopId(String shopId)
/* 45:   */   {
/* 46:58 */     this.shopId = shopId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getShopName()
/* 50:   */   {
/* 51:62 */     return this.shopName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setShopName(String shopName)
/* 55:   */   {
/* 56:65 */     this.shopName = shopName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RecruitShopInfo
 * JD-Core Version:    0.7.0.1
 */