/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class YLBPriceDetailInfo
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2554886282374182542L;
/* 11:   */   @ApiField("price_date")
/* 12:   */   private Date priceDate;
/* 13:   */   @ApiField("sevendays_yeild_rate")
/* 14:   */   private String sevendaysYeildRate;
/* 15:   */   @ApiField("tenthousand_income")
/* 16:   */   private String tenthousandIncome;
/* 17:   */   
/* 18:   */   public Date getPriceDate()
/* 19:   */   {
/* 20:37 */     return this.priceDate;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setPriceDate(Date priceDate)
/* 24:   */   {
/* 25:40 */     this.priceDate = priceDate;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getSevendaysYeildRate()
/* 29:   */   {
/* 30:44 */     return this.sevendaysYeildRate;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setSevendaysYeildRate(String sevendaysYeildRate)
/* 34:   */   {
/* 35:47 */     this.sevendaysYeildRate = sevendaysYeildRate;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getTenthousandIncome()
/* 39:   */   {
/* 40:51 */     return this.tenthousandIncome;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setTenthousandIncome(String tenthousandIncome)
/* 44:   */   {
/* 45:54 */     this.tenthousandIncome = tenthousandIncome;
/* 46:   */   }
/* 47:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.YLBPriceDetailInfo
 * JD-Core Version:    0.7.0.1
 */