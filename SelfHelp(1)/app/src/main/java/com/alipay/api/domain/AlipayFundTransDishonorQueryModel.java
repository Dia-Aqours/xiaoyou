/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundTransDishonorQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1325999739297663672L;
/* 10:   */   @ApiField("dishonor_begin")
/* 11:   */   private String dishonorBegin;
/* 12:   */   @ApiField("dishonor_end")
/* 13:   */   private String dishonorEnd;
/* 14:   */   @ApiField("page")
/* 15:   */   private String page;
/* 16:   */   
/* 17:   */   public String getDishonorBegin()
/* 18:   */   {
/* 19:41 */     return this.dishonorBegin;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setDishonorBegin(String dishonorBegin)
/* 23:   */   {
/* 24:44 */     this.dishonorBegin = dishonorBegin;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getDishonorEnd()
/* 28:   */   {
/* 29:48 */     return this.dishonorEnd;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setDishonorEnd(String dishonorEnd)
/* 33:   */   {
/* 34:51 */     this.dishonorEnd = dishonorEnd;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getPage()
/* 38:   */   {
/* 39:55 */     return this.page;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setPage(String page)
/* 43:   */   {
/* 44:58 */     this.page = page;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransDishonorQueryModel
 * JD-Core Version:    0.7.0.1
 */