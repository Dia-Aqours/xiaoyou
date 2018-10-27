/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcoMycarDialogonlineAnswererUpdateModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4349812731785271213L;
/* 10:   */   @ApiField("answer_id")
/* 11:   */   private String answerId;
/* 12:   */   @ApiField("answer_status")
/* 13:   */   private String answerStatus;
/* 14:   */   
/* 15:   */   public String getAnswerId()
/* 16:   */   {
/* 17:29 */     return this.answerId;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAnswerId(String answerId)
/* 21:   */   {
/* 22:32 */     this.answerId = answerId;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getAnswerStatus()
/* 26:   */   {
/* 27:36 */     return this.answerStatus;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setAnswerStatus(String answerStatus)
/* 31:   */   {
/* 32:39 */     this.answerStatus = answerStatus;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarDialogonlineAnswererUpdateModel
 * JD-Core Version:    0.7.0.1
 */