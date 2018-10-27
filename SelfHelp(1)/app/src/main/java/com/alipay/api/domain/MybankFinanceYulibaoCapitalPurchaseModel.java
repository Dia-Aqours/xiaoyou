/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class MybankFinanceYulibaoCapitalPurchaseModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3482873232884695123L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private Long amount;
/* 12:   */   @ApiField("currency")
/* 13:   */   private String currency;
/* 14:   */   @ApiField("fund_code")
/* 15:   */   private String fundCode;
/* 16:   */   @ApiField("out_biz_no")
/* 17:   */   private String outBizNo;
/* 18:   */   
/* 19:   */   public Long getAmount()
/* 20:   */   {
/* 21:41 */     return this.amount;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAmount(Long amount)
/* 25:   */   {
/* 26:44 */     this.amount = amount;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getCurrency()
/* 30:   */   {
/* 31:48 */     return this.currency;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setCurrency(String currency)
/* 35:   */   {
/* 36:51 */     this.currency = currency;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getFundCode()
/* 40:   */   {
/* 41:55 */     return this.fundCode;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setFundCode(String fundCode)
/* 45:   */   {
/* 46:58 */     this.fundCode = fundCode;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getOutBizNo()
/* 50:   */   {
/* 51:62 */     return this.outBizNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setOutBizNo(String outBizNo)
/* 55:   */   {
/* 56:65 */     this.outBizNo = outBizNo;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.MybankFinanceYulibaoCapitalPurchaseModel

 * JD-Core Version:    0.7.0.1

 */