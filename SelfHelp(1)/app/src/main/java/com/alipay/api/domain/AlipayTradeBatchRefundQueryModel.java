/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;

/*  5:   */
/*  6:   */ public class AlipayTradeBatchRefundQueryModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8174238381673284848L;
/* 10:   */   @ApiField("batch_no")
/* 11:   */   private String batchNo;
/* 12:   */   @ApiField("trade_no")
/* 13:   */   private String tradeNo;
/* 14:   */   
/* 15:   */   public String getBatchNo()
/* 16:   */   {
/* 17:31 */     return this.batchNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setBatchNo(String batchNo)
/* 21:   */   {
/* 22:34 */     this.batchNo = batchNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTradeNo()
/* 26:   */   {
/* 27:38 */     return this.tradeNo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTradeNo(String tradeNo)
/* 31:   */   {
/* 32:41 */     this.tradeNo = tradeNo;
/* 33:   */   }
/* 34:   */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayTradeBatchRefundQueryModel

 * JD-Core Version:    0.7.0.1

 */