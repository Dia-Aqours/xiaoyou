/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOfflineProviderDishQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2788528372284575136L;
/* 10:   */   @ApiField("dish_type_name")
/* 11:   */   private String dishTypeName;
/* 12:   */   @ApiField("order_by")
/* 13:   */   private String orderBy;
/* 14:   */   @ApiField("outer_dish_id")
/* 15:   */   private String outerDishId;
/* 16:   */   @ApiField("page")
/* 17:   */   private Long page;
/* 18:   */   @ApiField("page_size")
/* 19:   */   private Long pageSize;
/* 20:   */   @ApiField("shop_id")
/* 21:   */   private String shopId;
/* 22:   */   
/* 23:   */   public String getDishTypeName()
/* 24:   */   {
/* 25:53 */     return this.dishTypeName;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setDishTypeName(String dishTypeName)
/* 29:   */   {
/* 30:56 */     this.dishTypeName = dishTypeName;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getOrderBy()
/* 34:   */   {
/* 35:60 */     return this.orderBy;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setOrderBy(String orderBy)
/* 39:   */   {
/* 40:63 */     this.orderBy = orderBy;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getOuterDishId()
/* 44:   */   {
/* 45:67 */     return this.outerDishId;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setOuterDishId(String outerDishId)
/* 49:   */   {
/* 50:70 */     this.outerDishId = outerDishId;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public Long getPage()
/* 54:   */   {
/* 55:74 */     return this.page;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setPage(Long page)
/* 59:   */   {
/* 60:77 */     this.page = page;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public Long getPageSize()
/* 64:   */   {
/* 65:81 */     return this.pageSize;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setPageSize(Long pageSize)
/* 69:   */   {
/* 70:84 */     this.pageSize = pageSize;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getShopId()
/* 74:   */   {
/* 75:88 */     return this.shopId;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setShopId(String shopId)
/* 79:   */   {
/* 80:91 */     this.shopId = shopId;
/* 81:   */   }
/* 82:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineProviderDishQueryModel

 * JD-Core Version:    0.7.0.1

 */