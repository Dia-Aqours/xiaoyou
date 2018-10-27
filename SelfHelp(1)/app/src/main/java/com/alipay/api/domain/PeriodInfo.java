/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PeriodInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6473993273623618533L;
/* 10:   */   @ApiField("dimension")
/* 11:   */   private String dimension;
/* 12:   */   @ApiField("value")
/* 13:   */   private Long value;
/* 14:   */   
/* 15:   */   public String getDimension()
/* 16:   */   {
/* 17:29 */     return this.dimension;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setDimension(String dimension)
/* 21:   */   {
/* 22:32 */     this.dimension = dimension;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Long getValue()
/* 26:   */   {
/* 27:36 */     return this.value;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setValue(Long value)
/* 31:   */   {
/* 32:39 */     this.value = value;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PeriodInfo
 * JD-Core Version:    0.7.0.1
 */