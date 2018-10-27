/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class OpenPromoPrizeDimension
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1771382111552655284L;
/* 12:   */   @ApiField("dimension")
/* 13:   */   private String dimension;
/* 14:   */   @ApiListField("values")
/* 15:   */   @ApiField("number")
/* 16:   */   private List<Long> values;
/* 17:   */   
/* 18:   */   public String getDimension()
/* 19:   */   {
/* 20:35 */     return this.dimension;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setDimension(String dimension)
/* 24:   */   {
/* 25:38 */     this.dimension = dimension;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List<Long> getValues()
/* 29:   */   {
/* 30:42 */     return this.values;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setValues(List<Long> values)
/* 34:   */   {
/* 35:45 */     this.values = values;
/* 36:   */   }
/* 37:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OpenPromoPrizeDimension
 * JD-Core Version:    0.7.0.1
 */