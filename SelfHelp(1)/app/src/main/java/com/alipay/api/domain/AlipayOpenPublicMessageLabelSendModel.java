/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayOpenPublicMessageLabelSendModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7292196814978154867L;
/* 10:   */   @ApiField("filter")
/* 11:   */   private Filter filter;
/* 12:   */   @ApiField("material")
/* 13:   */   private Material material;
/* 14:   */   
/* 15:   */   public Filter getFilter()
/* 16:   */   {
/* 17:29 */     return this.filter;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setFilter(Filter filter)
/* 21:   */   {
/* 22:32 */     this.filter = filter;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Material getMaterial()
/* 26:   */   {
/* 27:36 */     return this.material;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setMaterial(Material material)
/* 31:   */   {
/* 32:39 */     this.material = material;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOpenPublicMessageLabelSendModel
 * JD-Core Version:    0.7.0.1
 */