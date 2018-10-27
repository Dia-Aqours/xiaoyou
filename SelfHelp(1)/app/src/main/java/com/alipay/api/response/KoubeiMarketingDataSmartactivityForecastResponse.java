/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataSmartactivityForecastResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5113228966136587967L;
/* 10:   */   @ApiField("repay_rate_range_max")
/* 11:   */   private String repayRateRangeMax;
/* 12:   */   @ApiField("repay_rate_range_min")
/* 13:   */   private String repayRateRangeMin;
/* 14:   */   @ApiField("trade_amt_range_max")
/* 15:   */   private String tradeAmtRangeMax;
/* 16:   */   @ApiField("trade_amt_range_min")
/* 17:   */   private String tradeAmtRangeMin;
/* 18:   */   @ApiField("verify_count_range_max")
/* 19:   */   private String verifyCountRangeMax;
/* 20:   */   @ApiField("verify_count_range_min")
/* 21:   */   private String verifyCountRangeMin;
/* 22:   */   
/* 23:   */   public void setRepayRateRangeMax(String repayRateRangeMax)
/* 24:   */   {
/* 25:54 */     this.repayRateRangeMax = repayRateRangeMax;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getRepayRateRangeMax()
/* 29:   */   {
/* 30:57 */     return this.repayRateRangeMax;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setRepayRateRangeMin(String repayRateRangeMin)
/* 34:   */   {
/* 35:61 */     this.repayRateRangeMin = repayRateRangeMin;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getRepayRateRangeMin()
/* 39:   */   {
/* 40:64 */     return this.repayRateRangeMin;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setTradeAmtRangeMax(String tradeAmtRangeMax)
/* 44:   */   {
/* 45:68 */     this.tradeAmtRangeMax = tradeAmtRangeMax;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getTradeAmtRangeMax()
/* 49:   */   {
/* 50:71 */     return this.tradeAmtRangeMax;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setTradeAmtRangeMin(String tradeAmtRangeMin)
/* 54:   */   {
/* 55:75 */     this.tradeAmtRangeMin = tradeAmtRangeMin;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getTradeAmtRangeMin()
/* 59:   */   {
/* 60:78 */     return this.tradeAmtRangeMin;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setVerifyCountRangeMax(String verifyCountRangeMax)
/* 64:   */   {
/* 65:82 */     this.verifyCountRangeMax = verifyCountRangeMax;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String getVerifyCountRangeMax()
/* 69:   */   {
/* 70:85 */     return this.verifyCountRangeMax;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void setVerifyCountRangeMin(String verifyCountRangeMin)
/* 74:   */   {
/* 75:89 */     this.verifyCountRangeMin = verifyCountRangeMin;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String getVerifyCountRangeMin()
/* 79:   */   {
/* 80:92 */     return this.verifyCountRangeMin;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.KoubeiMarketingDataSmartactivityForecastResponse
 * JD-Core Version:    0.7.0.1
 */