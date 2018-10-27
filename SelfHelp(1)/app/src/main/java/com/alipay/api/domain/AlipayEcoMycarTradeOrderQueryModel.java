/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayEcoMycarTradeOrderQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2497164786999178599L;
/* 10:   */   @ApiField("biz_trade_no")
/* 11:   */   private String bizTradeNo;
/* 12:   */   @ApiField("out_biz_trade_no")
/* 13:   */   private String outBizTradeNo;
/* 14:   */   @ApiField("trade_no")
/* 15:   */   private String tradeNo;
/* 16:   */   
/* 17:   */   public String getBizTradeNo()
/* 18:   */   {
/* 19:35 */     return this.bizTradeNo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBizTradeNo(String bizTradeNo)
/* 23:   */   {
/* 24:38 */     this.bizTradeNo = bizTradeNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getOutBizTradeNo()
/* 28:   */   {
/* 29:42 */     return this.outBizTradeNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setOutBizTradeNo(String outBizTradeNo)
/* 33:   */   {
/* 34:45 */     this.outBizTradeNo = outBizTradeNo;
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

 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarTradeOrderQueryModel

 * JD-Core Version:    0.7.0.1

 */