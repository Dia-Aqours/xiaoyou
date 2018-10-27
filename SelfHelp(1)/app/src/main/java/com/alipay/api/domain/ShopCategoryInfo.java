/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ShopCategoryInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2493438665494928587L;
/* 10:   */   @ApiField("category_id")
/* 11:   */   private String categoryId;
/* 12:   */   @ApiField("category_level")
/* 13:   */   private String categoryLevel;
/* 14:   */   @ApiField("category_name")
/* 15:   */   private String categoryName;
/* 16:   */   
/* 17:   */   public String getCategoryId()
/* 18:   */   {
/* 19:35 */     return this.categoryId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCategoryId(String categoryId)
/* 23:   */   {
/* 24:38 */     this.categoryId = categoryId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getCategoryLevel()
/* 28:   */   {
/* 29:42 */     return this.categoryLevel;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setCategoryLevel(String categoryLevel)
/* 33:   */   {
/* 34:45 */     this.categoryLevel = categoryLevel;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getCategoryName()
/* 38:   */   {
/* 39:49 */     return this.categoryName;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setCategoryName(String categoryName)
/* 43:   */   {
/* 44:52 */     this.categoryName = categoryName;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ShopCategoryInfo
 * JD-Core Version:    0.7.0.1
 */