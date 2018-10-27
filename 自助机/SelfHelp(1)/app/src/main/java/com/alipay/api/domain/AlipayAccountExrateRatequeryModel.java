/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayAccountExrateRatequeryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8645599717111413543L;
/* 10:   */   @ApiField("currency_pair")
/* 11:   */   private String currencyPair;
/* 12:   */   
/* 13:   */   public String getCurrencyPair()
/* 14:   */   {
/* 15:23 */     return this.currencyPair;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setCurrencyPair(String currencyPair)
/* 19:   */   {
/* 20:26 */     this.currencyPair = currencyPair;
/* 21:   */   }
/* 22:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayAccountExrateRatequeryModel

 * JD-Core Version:    0.7.0.1

 */