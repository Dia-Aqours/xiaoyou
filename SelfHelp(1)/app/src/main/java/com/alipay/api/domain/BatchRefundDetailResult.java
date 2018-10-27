/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class BatchRefundDetailResult
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1297422997977795433L;
/*  12:    */   @ApiField("batch_no")
/*  13:    */   private String batchNo;
/*  14:    */   @ApiField("dback_status")
/*  15:    */   private String dbackStatus;
/*  16:    */   @ApiField("est_bank_ack_time")
/*  17:    */   private String estBankAckTime;
/*  18:    */   @ApiField("est_bank_receipt_time")
/*  19:    */   private String estBankReceiptTime;
/*  20:    */   @ApiField("has_deposit_back")
/*  21:    */   private Boolean hasDepositBack;
/*  22:    */   @ApiField("refund_amount")
/*  23:    */   private String refundAmount;
/*  24:    */   @ApiListField("refund_royaltys")
/*  25:    */   @ApiField("refund_royalty_result")
/*  26:    */   private List<RefundRoyaltyResult> refundRoyaltys;
/*  27:    */   @ApiField("refund_suppl_amount")
/*  28:    */   private String refundSupplAmount;
/*  29:    */   @ApiField("refund_suppl_result_code")
/*  30:    */   private String refundSupplResultCode;
/*  31:    */   @ApiField("rest_suppl_amount")
/*  32:    */   private String restSupplAmount;
/*  33:    */   @ApiField("result_code")
/*  34:    */   private String resultCode;
/*  35:    */   @ApiField("trade_no")
/*  36:    */   private String tradeNo;
/*  37:    */   @ApiField("unfreeze_details")
/*  38:    */   private RefundUnfreezeResult unfreezeDetails;
/*  39:    */   
/*  40:    */   public String getBatchNo()
/*  41:    */   {
/*  42: 99 */     return this.batchNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setBatchNo(String batchNo)
/*  46:    */   {
/*  47:102 */     this.batchNo = batchNo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getDbackStatus()
/*  51:    */   {
/*  52:106 */     return this.dbackStatus;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setDbackStatus(String dbackStatus)
/*  56:    */   {
/*  57:109 */     this.dbackStatus = dbackStatus;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getEstBankAckTime()
/*  61:    */   {
/*  62:113 */     return this.estBankAckTime;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setEstBankAckTime(String estBankAckTime)
/*  66:    */   {
/*  67:116 */     this.estBankAckTime = estBankAckTime;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getEstBankReceiptTime()
/*  71:    */   {
/*  72:120 */     return this.estBankReceiptTime;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setEstBankReceiptTime(String estBankReceiptTime)
/*  76:    */   {
/*  77:123 */     this.estBankReceiptTime = estBankReceiptTime;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public Boolean getHasDepositBack()
/*  81:    */   {
/*  82:127 */     return this.hasDepositBack;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setHasDepositBack(Boolean hasDepositBack)
/*  86:    */   {
/*  87:130 */     this.hasDepositBack = hasDepositBack;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getRefundAmount()
/*  91:    */   {
/*  92:134 */     return this.refundAmount;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setRefundAmount(String refundAmount)
/*  96:    */   {
/*  97:137 */     this.refundAmount = refundAmount;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public List<RefundRoyaltyResult> getRefundRoyaltys()
/* 101:    */   {
/* 102:141 */     return this.refundRoyaltys;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setRefundRoyaltys(List<RefundRoyaltyResult> refundRoyaltys)
/* 106:    */   {
/* 107:144 */     this.refundRoyaltys = refundRoyaltys;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getRefundSupplAmount()
/* 111:    */   {
/* 112:148 */     return this.refundSupplAmount;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setRefundSupplAmount(String refundSupplAmount)
/* 116:    */   {
/* 117:151 */     this.refundSupplAmount = refundSupplAmount;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getRefundSupplResultCode()
/* 121:    */   {
/* 122:155 */     return this.refundSupplResultCode;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setRefundSupplResultCode(String refundSupplResultCode)
/* 126:    */   {
/* 127:158 */     this.refundSupplResultCode = refundSupplResultCode;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getRestSupplAmount()
/* 131:    */   {
/* 132:162 */     return this.restSupplAmount;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setRestSupplAmount(String restSupplAmount)
/* 136:    */   {
/* 137:165 */     this.restSupplAmount = restSupplAmount;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getResultCode()
/* 141:    */   {
/* 142:169 */     return this.resultCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setResultCode(String resultCode)
/* 146:    */   {
/* 147:172 */     this.resultCode = resultCode;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getTradeNo()
/* 151:    */   {
/* 152:176 */     return this.tradeNo;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setTradeNo(String tradeNo)
/* 156:    */   {
/* 157:179 */     this.tradeNo = tradeNo;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public RefundUnfreezeResult getUnfreezeDetails()
/* 161:    */   {
/* 162:183 */     return this.unfreezeDetails;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setUnfreezeDetails(RefundUnfreezeResult unfreezeDetails)
/* 166:    */   {
/* 167:186 */     this.unfreezeDetails = unfreezeDetails;
/* 168:    */   }
/* 169:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.BatchRefundDetailResult
 * JD-Core Version:    0.7.0.1
 */