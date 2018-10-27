/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class RecruitItemApplyData
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3167722644746281278L;
/* 10:   */   @ApiField("activity_price")
/* 11:   */   private String activityPrice;
/* 12:   */   @ApiField("activity_stock")
/* 13:   */   private String activityStock;
/* 14:   */   @ApiField("item_id")
/* 15:   */   private String itemId;
/* 16:   */   @ApiField("original_price")
/* 17:   */   private String originalPrice;
/* 18:   */   @ApiField("sales")
/* 19:   */   private String sales;
/* 20:   */   
/* 21:   */   public String getActivityPrice()
/* 22:   */   {
/* 23:47 */     return this.activityPrice;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setActivityPrice(String activityPrice)
/* 27:   */   {
/* 28:50 */     this.activityPrice = activityPrice;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getActivityStock()
/* 32:   */   {
/* 33:54 */     return this.activityStock;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setActivityStock(String activityStock)
/* 37:   */   {
/* 38:57 */     this.activityStock = activityStock;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getItemId()
/* 42:   */   {
/* 43:61 */     return this.itemId;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setItemId(String itemId)
/* 47:   */   {
/* 48:64 */     this.itemId = itemId;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOriginalPrice()
/* 52:   */   {
/* 53:68 */     return this.originalPrice;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOriginalPrice(String originalPrice)
/* 57:   */   {
/* 58:71 */     this.originalPrice = originalPrice;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getSales()
/* 62:   */   {
/* 63:75 */     return this.sales;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setSales(String sales)
/* 67:   */   {
/* 68:78 */     this.sales = sales;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.RecruitItemApplyData
 * JD-Core Version:    0.7.0.1
 */