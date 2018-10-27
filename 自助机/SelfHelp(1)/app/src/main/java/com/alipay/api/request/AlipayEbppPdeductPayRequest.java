/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEbppPdeductPayResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEbppPdeductPayRequest
/*  10:    */   implements AlipayRequest<AlipayEbppPdeductPayResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String agentChannel;
/*  15:    */   private String agentCode;
/*  16:    */   private String agreementId;
/*  17:    */   private String billDate;
/*  18:    */   private String billKey;
/*  19:    */   private String extendField;
/*  20:    */   private String fineAmount;
/*  21:    */   private String memo;
/*  22:    */   private String outOrderNo;
/*  23:    */   private String payAmount;
/*  24:    */   private String pid;
/*  25:    */   private String userId;
/*  26:    */   private String terminalType;
/*  27:    */   private String terminalInfo;
/*  28:    */   private String prodCode;
/*  29:    */   private String notifyUrl;
/*  30:    */   private String returnUrl;
/*  31:    */   
/*  32:    */   public void setAgentChannel(String agentChannel)
/*  33:    */   {
/*  34: 85 */     this.agentChannel = agentChannel;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getAgentChannel()
/*  38:    */   {
/*  39: 88 */     return this.agentChannel;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setAgentCode(String agentCode)
/*  43:    */   {
/*  44: 92 */     this.agentCode = agentCode;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getAgentCode()
/*  48:    */   {
/*  49: 95 */     return this.agentCode;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setAgreementId(String agreementId)
/*  53:    */   {
/*  54: 99 */     this.agreementId = agreementId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getAgreementId()
/*  58:    */   {
/*  59:102 */     return this.agreementId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setBillDate(String billDate)
/*  63:    */   {
/*  64:106 */     this.billDate = billDate;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getBillDate()
/*  68:    */   {
/*  69:109 */     return this.billDate;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setBillKey(String billKey)
/*  73:    */   {
/*  74:113 */     this.billKey = billKey;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getBillKey()
/*  78:    */   {
/*  79:116 */     return this.billKey;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setExtendField(String extendField)
/*  83:    */   {
/*  84:120 */     this.extendField = extendField;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getExtendField()
/*  88:    */   {
/*  89:123 */     return this.extendField;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setFineAmount(String fineAmount)
/*  93:    */   {
/*  94:127 */     this.fineAmount = fineAmount;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getFineAmount()
/*  98:    */   {
/*  99:130 */     return this.fineAmount;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setMemo(String memo)
/* 103:    */   {
/* 104:134 */     this.memo = memo;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getMemo()
/* 108:    */   {
/* 109:137 */     return this.memo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setOutOrderNo(String outOrderNo)
/* 113:    */   {
/* 114:141 */     this.outOrderNo = outOrderNo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getOutOrderNo()
/* 118:    */   {
/* 119:144 */     return this.outOrderNo;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setPayAmount(String payAmount)
/* 123:    */   {
/* 124:148 */     this.payAmount = payAmount;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getPayAmount()
/* 128:    */   {
/* 129:151 */     return this.payAmount;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setPid(String pid)
/* 133:    */   {
/* 134:155 */     this.pid = pid;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getPid()
/* 138:    */   {
/* 139:158 */     return this.pid;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setUserId(String userId)
/* 143:    */   {
/* 144:162 */     this.userId = userId;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getUserId()
/* 148:    */   {
/* 149:165 */     return this.userId;
/* 150:    */   }
/* 151:    */   
/* 152:172 */   private boolean needEncrypt = false;
/* 153:173 */   private AlipayObject bizModel = null;
/* 154:    */   
/* 155:    */   public String getNotifyUrl()
/* 156:    */   {
/* 157:176 */     return this.notifyUrl;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setNotifyUrl(String notifyUrl)
/* 161:    */   {
/* 162:180 */     this.notifyUrl = notifyUrl;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getReturnUrl()
/* 166:    */   {
/* 167:184 */     return this.returnUrl;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setReturnUrl(String returnUrl)
/* 171:    */   {
/* 172:188 */     this.returnUrl = returnUrl;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getApiVersion()
/* 176:    */   {
/* 177:192 */     return this.apiVersion;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setApiVersion(String apiVersion)
/* 181:    */   {
/* 182:196 */     this.apiVersion = apiVersion;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setTerminalType(String terminalType)
/* 186:    */   {
/* 187:200 */     this.terminalType = terminalType;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getTerminalType()
/* 191:    */   {
/* 192:204 */     return this.terminalType;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setTerminalInfo(String terminalInfo)
/* 196:    */   {
/* 197:208 */     this.terminalInfo = terminalInfo;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getTerminalInfo()
/* 201:    */   {
/* 202:212 */     return this.terminalInfo;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setProdCode(String prodCode)
/* 206:    */   {
/* 207:216 */     this.prodCode = prodCode;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getProdCode()
/* 211:    */   {
/* 212:220 */     return this.prodCode;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public String getApiMethodName()
/* 216:    */   {
/* 217:224 */     return "alipay.ebpp.pdeduct.pay";
/* 218:    */   }
/* 219:    */   
/* 220:    */   public Map<String, String> getTextParams()
/* 221:    */   {
/* 222:228 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 223:229 */     txtParams.put("agent_channel", this.agentChannel);
/* 224:230 */     txtParams.put("agent_code", this.agentCode);
/* 225:231 */     txtParams.put("agreement_id", this.agreementId);
/* 226:232 */     txtParams.put("bill_date", this.billDate);
/* 227:233 */     txtParams.put("bill_key", this.billKey);
/* 228:234 */     txtParams.put("extend_field", this.extendField);
/* 229:235 */     txtParams.put("fine_amount", this.fineAmount);
/* 230:236 */     txtParams.put("memo", this.memo);
/* 231:237 */     txtParams.put("out_order_no", this.outOrderNo);
/* 232:238 */     txtParams.put("pay_amount", this.payAmount);
/* 233:239 */     txtParams.put("pid", this.pid);
/* 234:240 */     txtParams.put("user_id", this.userId);
/* 235:241 */     if (this.udfParams != null) {
/* 236:242 */       txtParams.putAll(this.udfParams);
/* 237:    */     }
/* 238:244 */     return txtParams;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void putOtherTextParam(String key, String value)
/* 242:    */   {
/* 243:248 */     if (this.udfParams == null) {
/* 244:249 */       this.udfParams = new AlipayHashMap();
/* 245:    */     }
/* 246:251 */     this.udfParams.put(key, value);
/* 247:    */   }
/* 248:    */   
/* 249:    */   public Class<AlipayEbppPdeductPayResponse> getResponseClass()
/* 250:    */   {
/* 251:255 */     return AlipayEbppPdeductPayResponse.class;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public boolean isNeedEncrypt()
/* 255:    */   {
/* 256:261 */     return this.needEncrypt;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 260:    */   {
/* 261:267 */     this.needEncrypt = needEncrypt;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public AlipayObject getBizModel()
/* 265:    */   {
/* 266:272 */     return this.bizModel;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setBizModel(AlipayObject bizModel)
/* 270:    */   {
/* 271:278 */     this.bizModel = bizModel;
/* 272:    */   }
/* 273:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayEbppPdeductPayRequest
 * JD-Core Version:    0.7.0.1
 */