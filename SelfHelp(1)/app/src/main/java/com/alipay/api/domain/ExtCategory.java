/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ExtCategory
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2682638696955525831L;
/* 10:   */   @ApiField("category_code")
/* 11:   */   private String categoryCode;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("parent_id")
/* 15:   */   private String parentId;
/* 16:   */   
/* 17:   */   public String getCategoryCode()
/* 18:   */   {
/* 19:35 */     return this.categoryCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setCategoryCode(String categoryCode)
/* 23:   */   {
/* 24:38 */     this.categoryCode = categoryCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getName()
/* 28:   */   {
/* 29:42 */     return this.name;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setName(String name)
/* 33:   */   {
/* 34:45 */     this.name = name;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getParentId()
/* 38:   */   {
/* 39:49 */     return this.parentId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setParentId(String parentId)
/* 43:   */   {
/* 44:52 */     this.parentId = parentId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ExtCategory
 * JD-Core Version:    0.7.0.1
 */