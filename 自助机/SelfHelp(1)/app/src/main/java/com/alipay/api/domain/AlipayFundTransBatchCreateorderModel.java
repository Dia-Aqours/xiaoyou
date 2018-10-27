/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayFundTransBatchCreateorderModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4833262992129694661L;
/* 10:   */   @ApiField("batch_no")
/* 11:   */   private String batchNo;
/* 12:   */   @ApiField("ext_param")
/* 13:   */   private String extParam;
/* 14:   */   @ApiField("pay_amount")
/* 15:   */   private String payAmount;
/* 16:   */   @ApiField("payee_id")
/* 17:   */   private String payeeId;
/* 18:   */   @ApiField("payer_id")
/* 19:   */   private String payerId;
/* 20:   */   @ApiField("token")
/* 21:   */   private String token;
/* 22:   */   
/* 23:   */   public String getBatchNo()
/* 24:   */   {
/* 25:53 */     return this.batchNo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setBatchNo(String batchNo)
/* 29:   */   {
/* 30:56 */     this.batchNo = batchNo;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getExtParam()
/* 34:   */   {
/* 35:60 */     return this.extParam;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setExtParam(String extParam)
/* 39:   */   {
/* 40:63 */     this.extParam = extParam;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getPayAmount()
/* 44:   */   {
/* 45:67 */     return this.payAmount;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setPayAmount(String payAmount)
/* 49:   */   {
/* 50:70 */     this.payAmount = payAmount;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getPayeeId()
/* 54:   */   {
/* 55:74 */     return this.payeeId;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setPayeeId(String payeeId)
/* 59:   */   {
/* 60:77 */     this.payeeId = payeeId;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getPayerId()
/* 64:   */   {
/* 65:81 */     return this.payerId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setPayerId(String payerId)
/* 69:   */   {
/* 70:84 */     this.payerId = payerId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getToken()
/* 74:   */   {
/* 75:88 */     return this.token;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setToken(String token)
/* 79:   */   {
/* 80:91 */     this.token = token;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayFundTransBatchCreateorderModel
 * JD-Core Version:    0.7.0.1
 */