/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.ExtCategory;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class KoubeiItemExtitemCategoryQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1445565137963235823L;
/* 13:   */   @ApiListField("category_list")
/* 14:   */   @ApiField("ext_category")
/* 15:   */   private List<ExtCategory> categoryList;
/* 16:   */   
/* 17:   */   public void setCategoryList(List<ExtCategory> categoryList)
/* 18:   */   {
/* 19:28 */     this.categoryList = categoryList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<ExtCategory> getCategoryList()
/* 23:   */   {
/* 24:31 */     return this.categoryList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiItemExtitemCategoryQueryResponse
 * JD-Core Version:    0.7.0.1
 */