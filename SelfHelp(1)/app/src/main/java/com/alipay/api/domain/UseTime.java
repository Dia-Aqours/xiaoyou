/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class UseTime
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8255874869996591814L;
/* 10:   */   @ApiField("dimension")
/* 11:   */   private String dimension;
/* 12:   */   @ApiField("times")
/* 13:   */   private String times;
/* 14:   */   @ApiField("values")
/* 15:   */   private String values;
/* 16:   */   
/* 17:   */   public String getDimension()
/* 18:   */   {
/* 19:40 */     return this.dimension;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setDimension(String dimension)
/* 23:   */   {
/* 24:43 */     this.dimension = dimension;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getTimes()
/* 28:   */   {
/* 29:47 */     return this.times;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setTimes(String times)
/* 33:   */   {
/* 34:50 */     this.times = times;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getValues()
/* 38:   */   {
/* 39:54 */     return this.values;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setValues(String values)
/* 43:   */   {
/* 44:57 */     this.values = values;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.UseTime
 * JD-Core Version:    0.7.0.1
 */