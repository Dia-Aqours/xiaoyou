/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class LabelContext
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8397567767621985492L;
/* 10:   */   @ApiField("a")
/* 11:   */   private LabelFilter a;
/* 12:   */   
/* 13:   */   public LabelFilter getA()
/* 14:   */   {
/* 15:23 */     return this.a;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setA(LabelFilter a)
/* 19:   */   {
/* 20:26 */     this.a = a;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.LabelContext
 * JD-Core Version:    0.7.0.1
 */