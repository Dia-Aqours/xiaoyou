/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class InvestigCategoryResult
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2566417298887559597L;
/* 12:   */   @ApiField("category")
/* 13:   */   private String category;
/* 14:   */   @ApiListField("category_result")
/* 15:   */   @ApiField("investig_category_data")
/* 16:   */   private List<InvestigCategoryData> categoryResult;
/* 17:   */   
/* 18:   */   public String getCategory()
/* 19:   */   {
/* 20:33 */     return this.category;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setCategory(String category)
/* 24:   */   {
/* 25:36 */     this.category = category;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<InvestigCategoryData> getCategoryResult()
/* 29:   */   {
/* 30:40 */     return this.categoryResult;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setCategoryResult(List<InvestigCategoryData> categoryResult)
/* 34:   */   {
/* 35:43 */     this.categoryResult = categoryResult;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InvestigCategoryResult
 * JD-Core Version:    0.7.0.1
 */