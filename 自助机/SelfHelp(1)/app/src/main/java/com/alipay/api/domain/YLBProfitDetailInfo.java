/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class YLBProfitDetailInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3766325994565687225L;
/* 10:   */   @ApiField("day_profit")
/* 11:   */   private String dayProfit;
/* 12:   */   @ApiField("month_profit")
/* 13:   */   private String monthProfit;
/* 14:   */   @ApiField("total_profit")
/* 15:   */   private String totalProfit;
/* 16:   */   @ApiField("week_profit")
/* 17:   */   private String weekProfit;
/* 18:   */   
/* 19:   */   public String getDayProfit()
/* 20:   */   {
/* 21:41 */     return this.dayProfit;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setDayProfit(String dayProfit)
/* 25:   */   {
/* 26:44 */     this.dayProfit = dayProfit;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getMonthProfit()
/* 30:   */   {
/* 31:48 */     return this.monthProfit;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setMonthProfit(String monthProfit)
/* 35:   */   {
/* 36:51 */     this.monthProfit = monthProfit;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getTotalProfit()
/* 40:   */   {
/* 41:55 */     return this.totalProfit;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setTotalProfit(String totalProfit)
/* 45:   */   {
/* 46:58 */     this.totalProfit = totalProfit;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getWeekProfit()
/* 50:   */   {
/* 51:62 */     return this.weekProfit;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setWeekProfit(String weekProfit)
/* 55:   */   {
/* 56:65 */     this.weekProfit = weekProfit;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.YLBProfitDetailInfo
 * JD-Core Version:    0.7.0.1
 */