/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MybankFinanceYulibaoAccountQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8274873985921445474L;
/* 10:   */   @ApiField("fund_code")
/* 11:   */   private String fundCode;
/* 12:   */   
/* 13:   */   public String getFundCode()
/* 14:   */   {
/* 15:23 */     return this.fundCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setFundCode(String fundCode)
/* 19:   */   {
/* 20:26 */     this.fundCode = fundCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MybankFinanceYulibaoAccountQueryModel
 * JD-Core Version:    0.7.0.1
 */