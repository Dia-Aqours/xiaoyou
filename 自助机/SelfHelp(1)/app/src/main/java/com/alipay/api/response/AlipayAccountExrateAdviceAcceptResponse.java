/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayAccountExrateAdviceAcceptResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3463149573993524674L;
/*  10:    */   @ApiField("client_id")
/*  11:    */   private String clientId;
/*  12:    */   @ApiField("contra_amount")
/*  13:    */   private String contraAmount;
/*  14:    */   @ApiField("contra_ccy")
/*  15:    */   private String contraCcy;
/*  16:    */   @ApiField("deal_ref")
/*  17:    */   private String dealRef;
/*  18:    */   @ApiField("dealt_rate")
/*  19:    */   private String dealtRate;
/*  20:    */   @ApiField("duplicate")
/*  21:    */   private Boolean duplicate;
/*  22:    */   @ApiField("messag_id")
/*  23:    */   private String messagId;
/*  24:    */   @ApiField("msg_type")
/*  25:    */   private String msgType;
/*  26:    */   @ApiField("requested_rate_status")
/*  27:    */   private String requestedRateStatus;
/*  28:    */   @ApiField("side")
/*  29:    */   private String side;
/*  30:    */   @ApiField("transaction_amount")
/*  31:    */   private String transactionAmount;
/*  32:    */   @ApiField("transaction_ccy")
/*  33:    */   private String transactionCcy;
/*  34:    */   @ApiField("value_date")
/*  35:    */   private String valueDate;
/*  36:    */   
/*  37:    */   public void setClientId(String clientId)
/*  38:    */   {
/*  39:104 */     this.clientId = clientId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getClientId()
/*  43:    */   {
/*  44:107 */     return this.clientId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setContraAmount(String contraAmount)
/*  48:    */   {
/*  49:111 */     this.contraAmount = contraAmount;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getContraAmount()
/*  53:    */   {
/*  54:114 */     return this.contraAmount;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setContraCcy(String contraCcy)
/*  58:    */   {
/*  59:118 */     this.contraCcy = contraCcy;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getContraCcy()
/*  63:    */   {
/*  64:121 */     return this.contraCcy;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setDealRef(String dealRef)
/*  68:    */   {
/*  69:125 */     this.dealRef = dealRef;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getDealRef()
/*  73:    */   {
/*  74:128 */     return this.dealRef;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setDealtRate(String dealtRate)
/*  78:    */   {
/*  79:132 */     this.dealtRate = dealtRate;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getDealtRate()
/*  83:    */   {
/*  84:135 */     return this.dealtRate;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setDuplicate(Boolean duplicate)
/*  88:    */   {
/*  89:139 */     this.duplicate = duplicate;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public Boolean getDuplicate()
/*  93:    */   {
/*  94:142 */     return this.duplicate;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setMessagId(String messagId)
/*  98:    */   {
/*  99:146 */     this.messagId = messagId;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getMessagId()
/* 103:    */   {
/* 104:149 */     return this.messagId;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setMsgType(String msgType)
/* 108:    */   {
/* 109:153 */     this.msgType = msgType;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getMsgType()
/* 113:    */   {
/* 114:156 */     return this.msgType;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setRequestedRateStatus(String requestedRateStatus)
/* 118:    */   {
/* 119:160 */     this.requestedRateStatus = requestedRateStatus;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getRequestedRateStatus()
/* 123:    */   {
/* 124:163 */     return this.requestedRateStatus;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setSide(String side)
/* 128:    */   {
/* 129:167 */     this.side = side;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getSide()
/* 133:    */   {
/* 134:170 */     return this.side;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setTransactionAmount(String transactionAmount)
/* 138:    */   {
/* 139:174 */     this.transactionAmount = transactionAmount;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getTransactionAmount()
/* 143:    */   {
/* 144:177 */     return this.transactionAmount;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setTransactionCcy(String transactionCcy)
/* 148:    */   {
/* 149:181 */     this.transactionCcy = transactionCcy;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getTransactionCcy()
/* 153:    */   {
/* 154:184 */     return this.transactionCcy;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setValueDate(String valueDate)
/* 158:    */   {
/* 159:188 */     this.valueDate = valueDate;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getValueDate()
/* 163:    */   {
/* 164:191 */     return this.valueDate;
/* 165:    */   }
/* 166:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.response.AlipayAccountExrateAdviceAcceptResponse

 * JD-Core Version:    0.7.0.1

 */