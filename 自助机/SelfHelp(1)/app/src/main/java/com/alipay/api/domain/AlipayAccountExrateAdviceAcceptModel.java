/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAccountExrateAdviceAcceptModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7536677238814692816L;
/* 10:   */   @ApiField("advice")
/* 11:   */   private AdviceVO advice;
/* 12:   */   
/* 13:   */   public AdviceVO getAdvice()
/* 14:   */   {
/* 15:23 */     return this.advice;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setAdvice(AdviceVO advice)
/* 19:   */   {
/* 20:26 */     this.advice = advice;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayAccountExrateAdviceAcceptModel
 * JD-Core Version:    0.7.0.1
 */