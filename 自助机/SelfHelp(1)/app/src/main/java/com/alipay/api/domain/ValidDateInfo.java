/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class ValidDateInfo
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7565755367437162464L;
/* 11:   */   @ApiField("end_time")
/* 12:   */   private Date endTime;
/* 13:   */   @ApiField("relative_time")
/* 14:   */   private PeriodInfo relativeTime;
/* 15:   */   @ApiField("start_time")
/* 16:   */   private Date startTime;
/* 17:   */   @ApiField("time_mode")
/* 18:   */   private String timeMode;
/* 19:   */   
/* 20:   */   public Date getEndTime()
/* 21:   */   {
/* 22:43 */     return this.endTime;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setEndTime(Date endTime)
/* 26:   */   {
/* 27:46 */     this.endTime = endTime;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public PeriodInfo getRelativeTime()
/* 31:   */   {
/* 32:50 */     return this.relativeTime;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setRelativeTime(PeriodInfo relativeTime)
/* 36:   */   {
/* 37:53 */     this.relativeTime = relativeTime;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public Date getStartTime()
/* 41:   */   {
/* 42:57 */     return this.startTime;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setStartTime(Date startTime)
/* 46:   */   {
/* 47:60 */     this.startTime = startTime;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String getTimeMode()
/* 51:   */   {
/* 52:64 */     return this.timeMode;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setTimeMode(String timeMode)
/* 56:   */   {
/* 57:67 */     this.timeMode = timeMode;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ValidDateInfo
 * JD-Core Version:    0.7.0.1
 */