/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayTradeRefundModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8735667975645713341L;
/*  10:    */   @ApiField("operator_id")
/*  11:    */   private String operatorId;
/*  12:    */   @ApiField("out_request_no")
/*  13:    */   private String outRequestNo;
/*  14:    */   @ApiField("out_trade_no")
/*  15:    */   private String outTradeNo;
/*  16:    */   @ApiField("refund_amount")
/*  17:    */   private String refundAmount;
/*  18:    */   @ApiField("refund_reason")
/*  19:    */   private String refundReason;
/*  20:    */   @ApiField("store_id")
/*  21:    */   private String storeId;
/*  22:    */   @ApiField("terminal_id")
/*  23:    */   private String terminalId;
/*  24:    */   @ApiField("trade_no")
/*  25:    */   private String tradeNo;
/*  26:    */   
/*  27:    */   public String getOperatorId()
/*  28:    */   {
/*  29: 65 */     return this.operatorId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setOperatorId(String operatorId)
/*  33:    */   {
/*  34: 68 */     this.operatorId = operatorId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOutRequestNo()
/*  38:    */   {
/*  39: 72 */     return this.outRequestNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setOutRequestNo(String outRequestNo)
/*  43:    */   {
/*  44: 75 */     this.outRequestNo = outRequestNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getOutTradeNo()
/*  48:    */   {
/*  49: 79 */     return this.outTradeNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setOutTradeNo(String outTradeNo)
/*  53:    */   {
/*  54: 82 */     this.outTradeNo = outTradeNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getRefundAmount()
/*  58:    */   {
/*  59: 86 */     return this.refundAmount;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setRefundAmount(String refundAmount)
/*  63:    */   {
/*  64: 89 */     this.refundAmount = refundAmount;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getRefundReason()
/*  68:    */   {
/*  69: 93 */     return this.refundReason;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setRefundReason(String refundReason)
/*  73:    */   {
/*  74: 96 */     this.refundReason = refundReason;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getStoreId()
/*  78:    */   {
/*  79:100 */     return this.storeId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setStoreId(String storeId)
/*  83:    */   {
/*  84:103 */     this.storeId = storeId;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalId()
/*  88:    */   {
/*  89:107 */     return this.terminalId;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalId(String terminalId)
/*  93:    */   {
/*  94:110 */     this.terminalId = terminalId;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTradeNo()
/*  98:    */   {
/*  99:114 */     return this.tradeNo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setTradeNo(String tradeNo)
/* 103:    */   {
/* 104:117 */     this.tradeNo = tradeNo;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayTradeRefundModel
 * JD-Core Version:    0.7.0.1
 */