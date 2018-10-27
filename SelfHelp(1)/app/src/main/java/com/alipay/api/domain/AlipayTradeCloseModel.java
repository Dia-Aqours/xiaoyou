/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeCloseModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7646541913291138366L;
/* 10:   */   @ApiField("operator_id")
/* 11:   */   private String operatorId;
/* 12:   */   @ApiField("out_trade_no")
/* 13:   */   private String outTradeNo;
/* 14:   */   @ApiField("trade_no")
/* 15:   */   private String tradeNo;
/* 16:   */   
/* 17:   */   public String getOperatorId()
/* 18:   */   {
/* 19:35 */     return this.operatorId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setOperatorId(String operatorId)
/* 23:   */   {
/* 24:38 */     this.operatorId = operatorId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOutTradeNo()
/* 28:   */   {
/* 29:42 */     return this.outTradeNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOutTradeNo(String outTradeNo)
/* 33:   */   {
/* 34:45 */     this.outTradeNo = outTradeNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTradeNo()
/* 38:   */   {
/* 39:49 */     return this.tradeNo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTradeNo(String tradeNo)
/* 43:   */   {
/* 44:52 */     this.tradeNo = tradeNo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeCloseModel
 * JD-Core Version:    0.7.0.1
 */