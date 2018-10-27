/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeWapPayResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6627189388417289451L;
/* 10:   */   @ApiField("out_trade_no")
/* 11:   */   private String outTradeNo;
/* 12:   */   @ApiField("seller_id")
/* 13:   */   private String sellerId;
/* 14:   */   @ApiField("total_amount")
/* 15:   */   private String totalAmount;
/* 16:   */   @ApiField("trade_no")
/* 17:   */   private String tradeNo;
/* 18:   */   
/* 19:   */   public void setOutTradeNo(String outTradeNo)
/* 20:   */   {
/* 21:43 */     this.outTradeNo = outTradeNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getOutTradeNo()
/* 25:   */   {
/* 26:46 */     return this.outTradeNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setSellerId(String sellerId)
/* 30:   */   {
/* 31:50 */     this.sellerId = sellerId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getSellerId()
/* 35:   */   {
/* 36:53 */     return this.sellerId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setTotalAmount(String totalAmount)
/* 40:   */   {
/* 41:57 */     this.totalAmount = totalAmount;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getTotalAmount()
/* 45:   */   {
/* 46:60 */     return this.totalAmount;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setTradeNo(String tradeNo)
/* 50:   */   {
/* 51:64 */     this.tradeNo = tradeNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getTradeNo()
/* 55:   */   {
/* 56:67 */     return this.tradeNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTradeWapPayResponse
 * JD-Core Version:    0.7.0.1
 */