/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class OpenPromoPrizeRelativeTime
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5253298236145812324L;
/* 10:   */   @ApiField("dimension")
/* 11:   */   private String dimension;
/* 12:   */   @ApiField("value")
/* 13:   */   private String value;
/* 14:   */   
/* 15:   */   public String getDimension()
/* 16:   */   {
/* 17:34 */     return this.dimension;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setDimension(String dimension)
/* 21:   */   {
/* 22:37 */     this.dimension = dimension;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getValue()
/* 26:   */   {
/* 27:41 */     return this.value;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setValue(String value)
/* 31:   */   {
/* 32:44 */     this.value = value;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.OpenPromoPrizeRelativeTime

 * JD-Core Version:    0.7.0.1

 */