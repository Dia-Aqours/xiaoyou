/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoMycarTradeRefundModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4693491346366479143L;
/* 10:   */   @ApiField("isv")
/* 11:   */   private String isv;
/* 12:   */   @ApiField("refund_fee")
/* 13:   */   private String refundFee;
/* 14:   */   @ApiField("refund_reason")
/* 15:   */   private String refundReason;
/* 16:   */   @ApiField("trade_no")
/* 17:   */   private String tradeNo;
/* 18:   */   
/* 19:   */   public String getIsv()
/* 20:   */   {
/* 21:41 */     return this.isv;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setIsv(String isv)
/* 25:   */   {
/* 26:44 */     this.isv = isv;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getRefundFee()
/* 30:   */   {
/* 31:48 */     return this.refundFee;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setRefundFee(String refundFee)
/* 35:   */   {
/* 36:51 */     this.refundFee = refundFee;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getRefundReason()
/* 40:   */   {
/* 41:55 */     return this.refundReason;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setRefundReason(String refundReason)
/* 45:   */   {
/* 46:58 */     this.refundReason = refundReason;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTradeNo()
/* 50:   */   {
/* 51:62 */     return this.tradeNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTradeNo(String tradeNo)
/* 55:   */   {
/* 56:65 */     this.tradeNo = tradeNo;
/* 57:   */   }
/* 58:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarTradeRefundModel

 * JD-Core Version:    0.7.0.1

 */