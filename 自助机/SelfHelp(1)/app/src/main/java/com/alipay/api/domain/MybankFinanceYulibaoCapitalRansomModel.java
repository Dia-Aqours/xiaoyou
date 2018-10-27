/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankFinanceYulibaoCapitalRansomModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7541192767236848838L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private Long amount;
/* 12:   */   @ApiField("currency")
/* 13:   */   private String currency;
/* 14:   */   @ApiField("fund_code")
/* 15:   */   private String fundCode;
/* 16:   */   @ApiField("out_biz_no")
/* 17:   */   private String outBizNo;
/* 18:   */   @ApiField("ransom_mode")
/* 19:   */   private String ransomMode;
/* 20:   */   
/* 21:   */   public Long getAmount()
/* 22:   */   {
/* 23:47 */     return this.amount;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAmount(Long amount)
/* 27:   */   {
/* 28:50 */     this.amount = amount;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getCurrency()
/* 32:   */   {
/* 33:54 */     return this.currency;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setCurrency(String currency)
/* 37:   */   {
/* 38:57 */     this.currency = currency;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getFundCode()
/* 42:   */   {
/* 43:61 */     return this.fundCode;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setFundCode(String fundCode)
/* 47:   */   {
/* 48:64 */     this.fundCode = fundCode;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getOutBizNo()
/* 52:   */   {
/* 53:68 */     return this.outBizNo;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setOutBizNo(String outBizNo)
/* 57:   */   {
/* 58:71 */     this.outBizNo = outBizNo;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getRansomMode()
/* 62:   */   {
/* 63:75 */     return this.ransomMode;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setRansomMode(String ransomMode)
/* 67:   */   {
/* 68:78 */     this.ransomMode = ransomMode;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MybankFinanceYulibaoCapitalRansomModel
 * JD-Core Version:    0.7.0.1
 */