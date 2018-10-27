/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ShopCommentInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6416725668479356179L;
/* 10:   */   @ApiField("score")
/* 11:   */   private String score;
/* 12:   */   @ApiField("star")
/* 13:   */   private String star;
/* 14:   */   
/* 15:   */   public String getScore()
/* 16:   */   {
/* 17:29 */     return this.score;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setScore(String score)
/* 21:   */   {
/* 22:32 */     this.score = score;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getStar()
/* 26:   */   {
/* 27:36 */     return this.star;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setStar(String star)
/* 31:   */   {
/* 32:39 */     this.star = star;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ShopCommentInfo
 * JD-Core Version:    0.7.0.1
 */