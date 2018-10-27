/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class CardInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2699153758461247943L;
/* 10:   */   @ApiField("taken_time")
/* 11:   */   private String takenTime;
/* 12:   */   @ApiField("user_name")
/* 13:   */   private String userName;
/* 14:   */   
/* 15:   */   public String getTakenTime()
/* 16:   */   {
/* 17:29 */     return this.takenTime;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setTakenTime(String takenTime)
/* 21:   */   {
/* 22:32 */     this.takenTime = takenTime;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUserName()
/* 26:   */   {
/* 27:36 */     return this.userName;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUserName(String userName)
/* 31:   */   {
/* 32:39 */     this.userName = userName;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.CardInfo
 * JD-Core Version:    0.7.0.1
 */