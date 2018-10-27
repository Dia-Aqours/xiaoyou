/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class SendRule
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2114443645286897129L;
/* 10:   */   @ApiField("allow_repeat_send")
/* 11:   */   private String allowRepeatSend;
/* 12:   */   @ApiField("min_cost")
/* 13:   */   private String minCost;
/* 14:   */   @ApiField("send_budget")
/* 15:   */   private String sendBudget;
/* 16:   */   @ApiField("send_num")
/* 17:   */   private String sendNum;
/* 18:   */   
/* 19:   */   public String getAllowRepeatSend()
/* 20:   */   {
/* 21:47 */     return this.allowRepeatSend;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAllowRepeatSend(String allowRepeatSend)
/* 25:   */   {
/* 26:50 */     this.allowRepeatSend = allowRepeatSend;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getMinCost()
/* 30:   */   {
/* 31:54 */     return this.minCost;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setMinCost(String minCost)
/* 35:   */   {
/* 36:57 */     this.minCost = minCost;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getSendBudget()
/* 40:   */   {
/* 41:61 */     return this.sendBudget;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setSendBudget(String sendBudget)
/* 45:   */   {
/* 46:64 */     this.sendBudget = sendBudget;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getSendNum()
/* 50:   */   {
/* 51:68 */     return this.sendNum;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setSendNum(String sendNum)
/* 55:   */   {
/* 56:71 */     this.sendNum = sendNum;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.SendRule
 * JD-Core Version:    0.7.0.1
 */