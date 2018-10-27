/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AliTrustScore
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7113974389111445831L;
/* 10:   */   @ApiField("score")
/* 11:   */   private Long score;
/* 12:   */   
/* 13:   */   public Long getScore()
/* 14:   */   {
/* 15:23 */     return this.score;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setScore(Long score)
/* 19:   */   {
/* 20:26 */     this.score = score;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AliTrustScore
 * JD-Core Version:    0.7.0.1
 */