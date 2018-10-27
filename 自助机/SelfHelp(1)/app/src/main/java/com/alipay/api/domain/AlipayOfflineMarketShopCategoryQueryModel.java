/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayOfflineMarketShopCategoryQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4169145273776754776L;
/* 10:   */   @ApiField("category_id")
/* 11:   */   private String categoryId;
/* 12:   */   @ApiField("op_role")
/* 13:   */   private String opRole;
/* 14:   */   
/* 15:   */   public String getCategoryId()
/* 16:   */   {
/* 17:29 */     return this.categoryId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCategoryId(String categoryId)
/* 21:   */   {
/* 22:32 */     this.categoryId = categoryId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getOpRole()
/* 26:   */   {
/* 27:36 */     return this.opRole;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setOpRole(String opRole)
/* 31:   */   {
/* 32:39 */     this.opRole = opRole;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopCategoryQueryModel

 * JD-Core Version:    0.7.0.1

 */