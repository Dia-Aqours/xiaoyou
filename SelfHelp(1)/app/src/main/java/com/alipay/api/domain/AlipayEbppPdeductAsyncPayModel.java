/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEbppPdeductAsyncPayModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2629568215626151187L;
/*  10:    */   @ApiField("agent_channel")
/*  11:    */   private String agentChannel;
/*  12:    */   @ApiField("agent_code")
/*  13:    */   private String agentCode;
/*  14:    */   @ApiField("agreement_id")
/*  15:    */   private String agreementId;
/*  16:    */   @ApiField("bill_date")
/*  17:    */   private String billDate;
/*  18:    */   @ApiField("bill_key")
/*  19:    */   private String billKey;
/*  20:    */   @ApiField("extend_field")
/*  21:    */   private String extendField;
/*  22:    */   @ApiField("fine_amount")
/*  23:    */   private String fineAmount;
/*  24:    */   @ApiField("memo")
/*  25:    */   private String memo;
/*  26:    */   @ApiField("out_order_no")
/*  27:    */   private String outOrderNo;
/*  28:    */   @ApiField("pay_amount")
/*  29:    */   private String payAmount;
/*  30:    */   @ApiField("pid")
/*  31:    */   private String pid;
/*  32:    */   @ApiField("user_id")
/*  33:    */   private String userId;
/*  34:    */   
/*  35:    */   public String getAgentChannel()
/*  36:    */   {
/*  37: 89 */     return this.agentChannel;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAgentChannel(String agentChannel)
/*  41:    */   {
/*  42: 92 */     this.agentChannel = agentChannel;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getAgentCode()
/*  46:    */   {
/*  47: 96 */     return this.agentCode;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setAgentCode(String agentCode)
/*  51:    */   {
/*  52: 99 */     this.agentCode = agentCode;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getAgreementId()
/*  56:    */   {
/*  57:103 */     return this.agreementId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setAgreementId(String agreementId)
/*  61:    */   {
/*  62:106 */     this.agreementId = agreementId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getBillDate()
/*  66:    */   {
/*  67:110 */     return this.billDate;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setBillDate(String billDate)
/*  71:    */   {
/*  72:113 */     this.billDate = billDate;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getBillKey()
/*  76:    */   {
/*  77:117 */     return this.billKey;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setBillKey(String billKey)
/*  81:    */   {
/*  82:120 */     this.billKey = billKey;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getExtendField()
/*  86:    */   {
/*  87:124 */     return this.extendField;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setExtendField(String extendField)
/*  91:    */   {
/*  92:127 */     this.extendField = extendField;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getFineAmount()
/*  96:    */   {
/*  97:131 */     return this.fineAmount;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setFineAmount(String fineAmount)
/* 101:    */   {
/* 102:134 */     this.fineAmount = fineAmount;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getMemo()
/* 106:    */   {
/* 107:138 */     return this.memo;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setMemo(String memo)
/* 111:    */   {
/* 112:141 */     this.memo = memo;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getOutOrderNo()
/* 116:    */   {
/* 117:145 */     return this.outOrderNo;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setOutOrderNo(String outOrderNo)
/* 121:    */   {
/* 122:148 */     this.outOrderNo = outOrderNo;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getPayAmount()
/* 126:    */   {
/* 127:152 */     return this.payAmount;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setPayAmount(String payAmount)
/* 131:    */   {
/* 132:155 */     this.payAmount = payAmount;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getPid()
/* 136:    */   {
/* 137:159 */     return this.pid;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setPid(String pid)
/* 141:    */   {
/* 142:162 */     this.pid = pid;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getUserId()
/* 146:    */   {
/* 147:166 */     return this.userId;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setUserId(String userId)
/* 151:    */   {
/* 152:169 */     this.userId = userId;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEbppPdeductAsyncPayModel
 * JD-Core Version:    0.7.0.1
 */