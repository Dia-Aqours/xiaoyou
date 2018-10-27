/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KbAdvertCommissionClausePercentage
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3211639148711333559L;
/* 10:   */   @ApiField("commission_rate_end")
/* 11:   */   private String commissionRateEnd;
/* 12:   */   @ApiField("commission_rate_start")
/* 13:   */   private String commissionRateStart;
/* 14:   */   @ApiField("max_limit_end")
/* 15:   */   private String maxLimitEnd;
/* 16:   */   @ApiField("max_limit_start")
/* 17:   */   private String maxLimitStart;
/* 18:   */   
/* 19:   */   public String getCommissionRateEnd()
/* 20:   */   {
/* 21:41 */     return this.commissionRateEnd;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setCommissionRateEnd(String commissionRateEnd)
/* 25:   */   {
/* 26:44 */     this.commissionRateEnd = commissionRateEnd;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCommissionRateStart()
/* 30:   */   {
/* 31:48 */     return this.commissionRateStart;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCommissionRateStart(String commissionRateStart)
/* 35:   */   {
/* 36:51 */     this.commissionRateStart = commissionRateStart;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getMaxLimitEnd()
/* 40:   */   {
/* 41:55 */     return this.maxLimitEnd;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setMaxLimitEnd(String maxLimitEnd)
/* 45:   */   {
/* 46:58 */     this.maxLimitEnd = maxLimitEnd;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getMaxLimitStart()
/* 50:   */   {
/* 51:62 */     return this.maxLimitStart;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setMaxLimitStart(String maxLimitStart)
/* 55:   */   {
/* 56:65 */     this.maxLimitStart = maxLimitStart;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KbAdvertCommissionClausePercentage
 * JD-Core Version:    0.7.0.1
 */