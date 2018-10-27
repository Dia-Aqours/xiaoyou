/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEcardEduPublicBindResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEcardEduPublicBindRequest
/*  10:    */   implements AlipayRequest<AlipayEcardEduPublicBindResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String agentCode;
/*  15:    */   private String agreementId;
/*  16:    */   private String alipayUserId;
/*  17:    */   private String cardName;
/*  18:    */   private String cardNo;
/*  19:    */   private String publicId;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setAgentCode(String agentCode)
/*  27:    */   {
/*  28: 52 */     this.agentCode = agentCode;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getAgentCode()
/*  32:    */   {
/*  33: 55 */     return this.agentCode;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAgreementId(String agreementId)
/*  37:    */   {
/*  38: 59 */     this.agreementId = agreementId;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAgreementId()
/*  42:    */   {
/*  43: 62 */     return this.agreementId;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAlipayUserId(String alipayUserId)
/*  47:    */   {
/*  48: 66 */     this.alipayUserId = alipayUserId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAlipayUserId()
/*  52:    */   {
/*  53: 69 */     return this.alipayUserId;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setCardName(String cardName)
/*  57:    */   {
/*  58: 73 */     this.cardName = cardName;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getCardName()
/*  62:    */   {
/*  63: 76 */     return this.cardName;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setCardNo(String cardNo)
/*  67:    */   {
/*  68: 80 */     this.cardNo = cardNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getCardNo()
/*  72:    */   {
/*  73: 83 */     return this.cardNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setPublicId(String publicId)
/*  77:    */   {
/*  78: 87 */     this.publicId = publicId;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getPublicId()
/*  82:    */   {
/*  83: 90 */     return this.publicId;
/*  84:    */   }
/*  85:    */   
/*  86: 97 */   private boolean needEncrypt = false;
/*  87: 98 */   private AlipayObject bizModel = null;
/*  88:    */   
/*  89:    */   public String getNotifyUrl()
/*  90:    */   {
/*  91:101 */     return this.notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setNotifyUrl(String notifyUrl)
/*  95:    */   {
/*  96:105 */     this.notifyUrl = notifyUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getReturnUrl()
/* 100:    */   {
/* 101:109 */     return this.returnUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setReturnUrl(String returnUrl)
/* 105:    */   {
/* 106:113 */     this.returnUrl = returnUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getApiVersion()
/* 110:    */   {
/* 111:117 */     return this.apiVersion;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setApiVersion(String apiVersion)
/* 115:    */   {
/* 116:121 */     this.apiVersion = apiVersion;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalType(String terminalType)
/* 120:    */   {
/* 121:125 */     this.terminalType = terminalType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalType()
/* 125:    */   {
/* 126:129 */     return this.terminalType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTerminalInfo(String terminalInfo)
/* 130:    */   {
/* 131:133 */     this.terminalInfo = terminalInfo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTerminalInfo()
/* 135:    */   {
/* 136:137 */     return this.terminalInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setProdCode(String prodCode)
/* 140:    */   {
/* 141:141 */     this.prodCode = prodCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getProdCode()
/* 145:    */   {
/* 146:145 */     return this.prodCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getApiMethodName()
/* 150:    */   {
/* 151:149 */     return "alipay.ecard.edu.public.bind";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:153 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:154 */     txtParams.put("agent_code", this.agentCode);
/* 158:155 */     txtParams.put("agreement_id", this.agreementId);
/* 159:156 */     txtParams.put("alipay_user_id", this.alipayUserId);
/* 160:157 */     txtParams.put("card_name", this.cardName);
/* 161:158 */     txtParams.put("card_no", this.cardNo);
/* 162:159 */     txtParams.put("public_id", this.publicId);
/* 163:160 */     if (this.udfParams != null) {
/* 164:161 */       txtParams.putAll(this.udfParams);
/* 165:    */     }
/* 166:163 */     return txtParams;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void putOtherTextParam(String key, String value)
/* 170:    */   {
/* 171:167 */     if (this.udfParams == null) {
/* 172:168 */       this.udfParams = new AlipayHashMap();
/* 173:    */     }
/* 174:170 */     this.udfParams.put(key, value);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Class<AlipayEcardEduPublicBindResponse> getResponseClass()
/* 178:    */   {
/* 179:174 */     return AlipayEcardEduPublicBindResponse.class;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public boolean isNeedEncrypt()
/* 183:    */   {
/* 184:180 */     return this.needEncrypt;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 188:    */   {
/* 189:186 */     this.needEncrypt = needEncrypt;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public AlipayObject getBizModel()
/* 193:    */   {
/* 194:191 */     return this.bizModel;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setBizModel(AlipayObject bizModel)
/* 198:    */   {
/* 199:197 */     this.bizModel = bizModel;
/* 200:    */   }
/* 201:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayEcardEduPublicBindRequest
 * JD-Core Version:    0.7.0.1
 */