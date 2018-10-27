/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayOfflineMarketMcommentQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5796856617399234692L;
/* 11:   */   @ApiField("comment_id")
/* 12:   */   private String commentId;
/* 13:   */   @ApiField("comment_status")
/* 14:   */   private String commentStatus;
/* 15:   */   @ApiField("comment_time")
/* 16:   */   private Date commentTime;
/* 17:   */   @ApiField("score")
/* 18:   */   private Long score;
/* 19:   */   
/* 20:   */   public void setCommentId(String commentId)
/* 21:   */   {
/* 22:49 */     this.commentId = commentId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCommentId()
/* 26:   */   {
/* 27:52 */     return this.commentId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCommentStatus(String commentStatus)
/* 31:   */   {
/* 32:56 */     this.commentStatus = commentStatus;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getCommentStatus()
/* 36:   */   {
/* 37:59 */     return this.commentStatus;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setCommentTime(Date commentTime)
/* 41:   */   {
/* 42:63 */     this.commentTime = commentTime;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public Date getCommentTime()
/* 46:   */   {
/* 47:66 */     return this.commentTime;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setScore(Long score)
/* 51:   */   {
/* 52:70 */     this.score = score;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public Long getScore()
/* 56:   */   {
/* 57:73 */     return this.score;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketMcommentQueryResponse
 * JD-Core Version:    0.7.0.1
 */