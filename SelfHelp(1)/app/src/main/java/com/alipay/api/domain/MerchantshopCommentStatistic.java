/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MerchantshopCommentStatistic
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5442819112815286452L;
/* 10:   */   @ApiField("comment_count")
/* 11:   */   private Long commentCount;
/* 12:   */   @ApiField("score")
/* 13:   */   private Long score;
/* 14:   */   
/* 15:   */   public Long getCommentCount()
/* 16:   */   {
/* 17:29 */     return this.commentCount;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCommentCount(Long commentCount)
/* 21:   */   {
/* 22:32 */     this.commentCount = commentCount;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Long getScore()
/* 26:   */   {
/* 27:36 */     return this.score;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setScore(Long score)
/* 31:   */   {
/* 32:39 */     this.score = score;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantshopCommentStatistic
 * JD-Core Version:    0.7.0.1
 */