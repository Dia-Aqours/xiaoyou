/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeFastpayRefundQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4458824777674187772L;
/* 10:   */   @ApiField("out_request_no")
/* 11:   */   private String outRequestNo;
/* 12:   */   @ApiField("out_trade_no")
/* 13:   */   private String outTradeNo;
/* 14:   */   @ApiField("refund_amount")
/* 15:   */   private String refundAmount;
/* 16:   */   @ApiField("refund_reason")
/* 17:   */   private String refundReason;
/* 18:   */   @ApiField("total_amount")
/* 19:   */   private String totalAmount;
/* 20:   */   @ApiField("trade_no")
/* 21:   */   private String tradeNo;
/* 22:   */   
/* 23:   */   public void setOutRequestNo(String outRequestNo)
/* 24:   */   {
/* 25:54 */     this.outRequestNo = outRequestNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getOutRequestNo()
/* 29:   */   {
/* 30:57 */     return this.outRequestNo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setOutTradeNo(String outTradeNo)
/* 34:   */   {
/* 35:61 */     this.outTradeNo = outTradeNo;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getOutTradeNo()
/* 39:   */   {
/* 40:64 */     return this.outTradeNo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setRefundAmount(String refundAmount)
/* 44:   */   {
/* 45:68 */     this.refundAmount = refundAmount;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getRefundAmount()
/* 49:   */   {
/* 50:71 */     return this.refundAmount;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setRefundReason(String refundReason)
/* 54:   */   {
/* 55:75 */     this.refundReason = refundReason;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public String getRefundReason()
/* 59:   */   {
/* 60:78 */     return this.refundReason;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setTotalAmount(String totalAmount)
/* 64:   */   {
/* 65:82 */     this.totalAmount = totalAmount;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String getTotalAmount()
/* 69:   */   {
/* 70:85 */     return this.totalAmount;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void setTradeNo(String tradeNo)
/* 74:   */   {
/* 75:89 */     this.tradeNo = tradeNo;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String getTradeNo()
/* 79:   */   {
/* 80:92 */     return this.tradeNo;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse
 * JD-Core Version:    0.7.0.1
 */