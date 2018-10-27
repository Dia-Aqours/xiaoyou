/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ZhimaCreditWatchlistiiGetModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5169973761299355914L;
/* 10:   */   @ApiField("alipay_user_id")
/* 11:   */   private String alipayUserId;
/* 12:   */   @ApiField("product_code")
/* 13:   */   private String productCode;
/* 14:   */   @ApiField("transaction_id")
/* 15:   */   private String transactionId;
/* 16:   */   
/* 17:   */   public String getAlipayUserId()
/* 18:   */   {
/* 19:35 */     return this.alipayUserId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setAlipayUserId(String alipayUserId)
/* 23:   */   {
/* 24:38 */     this.alipayUserId = alipayUserId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getProductCode()
/* 28:   */   {
/* 29:42 */     return this.productCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setProductCode(String productCode)
/* 33:   */   {
/* 34:45 */     this.productCode = productCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getTransactionId()
/* 38:   */   {
/* 39:49 */     return this.transactionId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setTransactionId(String transactionId)
/* 43:   */   {
/* 44:52 */     this.transactionId = transactionId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaCreditWatchlistiiGetModel
 * JD-Core Version:    0.7.0.1
 */