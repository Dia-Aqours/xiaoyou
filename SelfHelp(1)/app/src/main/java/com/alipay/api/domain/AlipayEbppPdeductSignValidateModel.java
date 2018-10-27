/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEbppPdeductSignValidateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3139844725619573187L;
/*  10:    */   @ApiField("agent_channel")
/*  11:    */   private String agentChannel;
/*  12:    */   @ApiField("agent_code")
/*  13:    */   private String agentCode;
/*  14:    */   @ApiField("bill_key")
/*  15:    */   private String billKey;
/*  16:    */   @ApiField("biz_type")
/*  17:    */   private String bizType;
/*  18:    */   @ApiField("charge_inst")
/*  19:    */   private String chargeInst;
/*  20:    */   @ApiField("deduct_type")
/*  21:    */   private String deductType;
/*  22:    */   @ApiField("extend_field")
/*  23:    */   private String extendField;
/*  24:    */   @ApiField("notify_config")
/*  25:    */   private String notifyConfig;
/*  26:    */   @ApiField("out_agreement_id")
/*  27:    */   private String outAgreementId;
/*  28:    */   @ApiField("owner_name")
/*  29:    */   private String ownerName;
/*  30:    */   @ApiField("pay_config")
/*  31:    */   private String payConfig;
/*  32:    */   @ApiField("pid")
/*  33:    */   private String pid;
/*  34:    */   @ApiField("sign_expire_date")
/*  35:    */   private String signExpireDate;
/*  36:    */   @ApiField("sub_biz_type")
/*  37:    */   private String subBizType;
/*  38:    */   @ApiField("user_id")
/*  39:    */   private String userId;
/*  40:    */   
/*  41:    */   public String getAgentChannel()
/*  42:    */   {
/*  43:121 */     return this.agentChannel;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAgentChannel(String agentChannel)
/*  47:    */   {
/*  48:124 */     this.agentChannel = agentChannel;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAgentCode()
/*  52:    */   {
/*  53:128 */     return this.agentCode;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setAgentCode(String agentCode)
/*  57:    */   {
/*  58:131 */     this.agentCode = agentCode;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBillKey()
/*  62:    */   {
/*  63:135 */     return this.billKey;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBillKey(String billKey)
/*  67:    */   {
/*  68:138 */     this.billKey = billKey;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getBizType()
/*  72:    */   {
/*  73:142 */     return this.bizType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setBizType(String bizType)
/*  77:    */   {
/*  78:145 */     this.bizType = bizType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getChargeInst()
/*  82:    */   {
/*  83:149 */     return this.chargeInst;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setChargeInst(String chargeInst)
/*  87:    */   {
/*  88:152 */     this.chargeInst = chargeInst;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getDeductType()
/*  92:    */   {
/*  93:156 */     return this.deductType;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setDeductType(String deductType)
/*  97:    */   {
/*  98:159 */     this.deductType = deductType;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getExtendField()
/* 102:    */   {
/* 103:163 */     return this.extendField;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setExtendField(String extendField)
/* 107:    */   {
/* 108:166 */     this.extendField = extendField;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getNotifyConfig()
/* 112:    */   {
/* 113:170 */     return this.notifyConfig;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setNotifyConfig(String notifyConfig)
/* 117:    */   {
/* 118:173 */     this.notifyConfig = notifyConfig;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getOutAgreementId()
/* 122:    */   {
/* 123:177 */     return this.outAgreementId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setOutAgreementId(String outAgreementId)
/* 127:    */   {
/* 128:180 */     this.outAgreementId = outAgreementId;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getOwnerName()
/* 132:    */   {
/* 133:184 */     return this.ownerName;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setOwnerName(String ownerName)
/* 137:    */   {
/* 138:187 */     this.ownerName = ownerName;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getPayConfig()
/* 142:    */   {
/* 143:191 */     return this.payConfig;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setPayConfig(String payConfig)
/* 147:    */   {
/* 148:194 */     this.payConfig = payConfig;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getPid()
/* 152:    */   {
/* 153:198 */     return this.pid;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setPid(String pid)
/* 157:    */   {
/* 158:201 */     this.pid = pid;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getSignExpireDate()
/* 162:    */   {
/* 163:205 */     return this.signExpireDate;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setSignExpireDate(String signExpireDate)
/* 167:    */   {
/* 168:208 */     this.signExpireDate = signExpireDate;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getSubBizType()
/* 172:    */   {
/* 173:212 */     return this.subBizType;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setSubBizType(String subBizType)
/* 177:    */   {
/* 178:215 */     this.subBizType = subBizType;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getUserId()
/* 182:    */   {
/* 183:219 */     return this.userId;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setUserId(String userId)
/* 187:    */   {
/* 188:222 */     this.userId = userId;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEbppPdeductSignValidateModel
 * JD-Core Version:    0.7.0.1
 */