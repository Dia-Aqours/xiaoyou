/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankFinanceYulibaoPriceQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8811147285171797811L;
/* 10:   */   @ApiField("end_date")
/* 11:   */   private String endDate;
/* 12:   */   @ApiField("fund_code")
/* 13:   */   private String fundCode;
/* 14:   */   @ApiField("start_date")
/* 15:   */   private String startDate;
/* 16:   */   
/* 17:   */   public String getEndDate()
/* 18:   */   {
/* 19:35 */     return this.endDate;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setEndDate(String endDate)
/* 23:   */   {
/* 24:38 */     this.endDate = endDate;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getFundCode()
/* 28:   */   {
/* 29:42 */     return this.fundCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFundCode(String fundCode)
/* 33:   */   {
/* 34:45 */     this.fundCode = fundCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getStartDate()
/* 38:   */   {
/* 39:49 */     return this.startDate;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setStartDate(String startDate)
/* 43:   */   {
/* 44:52 */     this.startDate = startDate;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MybankFinanceYulibaoPriceQueryModel
 * JD-Core Version:    0.7.0.1
 */