/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class GetRuleInfo
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 8153316321213112171L;
/* 11:   */   @ApiField("end_time")
/* 12:   */   private Date endTime;
/* 13:   */   @ApiField("get_count_limit")
/* 14:   */   private PeriodInfo getCountLimit;
/* 15:   */   @ApiField("start_time")
/* 16:   */   private Date startTime;
/* 17:   */   
/* 18:   */   public Date getEndTime()
/* 19:   */   {
/* 20:37 */     return this.endTime;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setEndTime(Date endTime)
/* 24:   */   {
/* 25:40 */     this.endTime = endTime;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public PeriodInfo getGetCountLimit()
/* 29:   */   {
/* 30:44 */     return this.getCountLimit;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setGetCountLimit(PeriodInfo getCountLimit)
/* 34:   */   {
/* 35:47 */     this.getCountLimit = getCountLimit;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public Date getStartTime()
/* 39:   */   {
/* 40:51 */     return this.startTime;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setStartTime(Date startTime)
/* 44:   */   {
/* 45:54 */     this.startTime = startTime;
/* 46:   */   }
/* 47:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.GetRuleInfo
 * JD-Core Version:    0.7.0.1
 */