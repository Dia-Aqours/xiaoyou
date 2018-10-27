/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6834258214534444666L;
/* 10:   */   @ApiField("out_trade_no")
/* 11:   */   private String outTradeNo;
/* 12:   */   @ApiField("trade_no")
/* 13:   */   private String tradeNo;
/* 14:   */   
/* 15:   */   public void setOutTradeNo(String outTradeNo)
/* 16:   */   {
/* 17:30 */     this.outTradeNo = outTradeNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getOutTradeNo()
/* 21:   */   {
/* 22:33 */     return this.outTradeNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setTradeNo(String tradeNo)
/* 26:   */   {
/* 27:37 */     this.tradeNo = tradeNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getTradeNo()
/* 31:   */   {
/* 32:40 */     return this.tradeNo;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTradeCreateResponse
 * JD-Core Version:    0.7.0.1
 */