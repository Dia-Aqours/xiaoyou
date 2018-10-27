/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InsMktFactorDTO
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4154991986318692452L;
/* 10:   */   @ApiField("key")
/* 11:   */   private String key;
/* 12:   */   @ApiField("value")
/* 13:   */   private String value;
/* 14:   */   
/* 15:   */   public String getKey()
/* 16:   */   {
/* 17:29 */     return this.key;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setKey(String key)
/* 21:   */   {
/* 22:32 */     this.key = key;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getValue()
/* 26:   */   {
/* 27:36 */     return this.value;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setValue(String value)
/* 31:   */   {
/* 32:39 */     this.value = value;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsMktFactorDTO
 * JD-Core Version:    0.7.0.1
 */