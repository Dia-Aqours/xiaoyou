/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class FilterTag
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2331172993234457336L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("filter_items")
/* 13:   */   private String filterItems;
/* 14:   */   
/* 15:   */   public String getCode()
/* 16:   */   {
/* 17:30 */     return this.code;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCode(String code)
/* 21:   */   {
/* 22:33 */     this.code = code;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getFilterItems()
/* 26:   */   {
/* 27:37 */     return this.filterItems;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setFilterItems(String filterItems)
/* 31:   */   {
/* 32:40 */     this.filterItems = filterItems;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.FilterTag

 * JD-Core Version:    0.7.0.1

 */