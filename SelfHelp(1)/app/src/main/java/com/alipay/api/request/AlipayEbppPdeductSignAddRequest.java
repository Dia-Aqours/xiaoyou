/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEbppPdeductSignAddResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEbppPdeductSignAddRequest
/*  10:    */   implements AlipayRequest<AlipayEbppPdeductSignAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String agentChannel;
/*  15:    */   private String agentCode;
/*  16:    */   private String billKey;
/*  17:    */   private String bizType;
/*  18:    */   private String chargeInst;
/*  19:    */   private String deductType;
/*  20:    */   private String extendField;
/*  21:    */   private String notifyConfig;
/*  22:    */   private String outAgreementId;
/*  23:    */   private String ownerName;
/*  24:    */   private String payConfig;
/*  25:    */   private String payPasswordToken;
/*  26:    */   private String pid;
/*  27:    */   private String signExpireDate;
/*  28:    */   private String subBizType;
/*  29:    */   private String userId;
/*  30:    */   private String terminalType;
/*  31:    */   private String terminalInfo;
/*  32:    */   private String prodCode;
/*  33:    */   private String notifyUrl;
/*  34:    */   private String returnUrl;
/*  35:    */   
/*  36:    */   public void setAgentChannel(String agentChannel)
/*  37:    */   {
/*  38:116 */     this.agentChannel = agentChannel;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAgentChannel()
/*  42:    */   {
/*  43:119 */     return this.agentChannel;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAgentCode(String agentCode)
/*  47:    */   {
/*  48:123 */     this.agentCode = agentCode;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAgentCode()
/*  52:    */   {
/*  53:126 */     return this.agentCode;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBillKey(String billKey)
/*  57:    */   {
/*  58:130 */     this.billKey = billKey;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBillKey()
/*  62:    */   {
/*  63:133 */     return this.billKey;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBizType(String bizType)
/*  67:    */   {
/*  68:137 */     this.bizType = bizType;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getBizType()
/*  72:    */   {
/*  73:140 */     return this.bizType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setChargeInst(String chargeInst)
/*  77:    */   {
/*  78:144 */     this.chargeInst = chargeInst;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getChargeInst()
/*  82:    */   {
/*  83:147 */     return this.chargeInst;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setDeductType(String deductType)
/*  87:    */   {
/*  88:151 */     this.deductType = deductType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getDeductType()
/*  92:    */   {
/*  93:154 */     return this.deductType;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setExtendField(String extendField)
/*  97:    */   {
/*  98:158 */     this.extendField = extendField;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getExtendField()
/* 102:    */   {
/* 103:161 */     return this.extendField;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setNotifyConfig(String notifyConfig)
/* 107:    */   {
/* 108:165 */     this.notifyConfig = notifyConfig;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getNotifyConfig()
/* 112:    */   {
/* 113:168 */     return this.notifyConfig;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setOutAgreementId(String outAgreementId)
/* 117:    */   {
/* 118:172 */     this.outAgreementId = outAgreementId;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getOutAgreementId()
/* 122:    */   {
/* 123:175 */     return this.outAgreementId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setOwnerName(String ownerName)
/* 127:    */   {
/* 128:179 */     this.ownerName = ownerName;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getOwnerName()
/* 132:    */   {
/* 133:182 */     return this.ownerName;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setPayConfig(String payConfig)
/* 137:    */   {
/* 138:186 */     this.payConfig = payConfig;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getPayConfig()
/* 142:    */   {
/* 143:189 */     return this.payConfig;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setPayPasswordToken(String payPasswordToken)
/* 147:    */   {
/* 148:193 */     this.payPasswordToken = payPasswordToken;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getPayPasswordToken()
/* 152:    */   {
/* 153:196 */     return this.payPasswordToken;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setPid(String pid)
/* 157:    */   {
/* 158:200 */     this.pid = pid;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getPid()
/* 162:    */   {
/* 163:203 */     return this.pid;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setSignExpireDate(String signExpireDate)
/* 167:    */   {
/* 168:207 */     this.signExpireDate = signExpireDate;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getSignExpireDate()
/* 172:    */   {
/* 173:210 */     return this.signExpireDate;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setSubBizType(String subBizType)
/* 177:    */   {
/* 178:214 */     this.subBizType = subBizType;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getSubBizType()
/* 182:    */   {
/* 183:217 */     return this.subBizType;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setUserId(String userId)
/* 187:    */   {
/* 188:221 */     this.userId = userId;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getUserId()
/* 192:    */   {
/* 193:224 */     return this.userId;
/* 194:    */   }
/* 195:    */   
/* 196:231 */   private boolean needEncrypt = false;
/* 197:232 */   private AlipayObject bizModel = null;
/* 198:    */   
/* 199:    */   public String getNotifyUrl()
/* 200:    */   {
/* 201:235 */     return this.notifyUrl;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setNotifyUrl(String notifyUrl)
/* 205:    */   {
/* 206:239 */     this.notifyUrl = notifyUrl;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public String getReturnUrl()
/* 210:    */   {
/* 211:243 */     return this.returnUrl;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setReturnUrl(String returnUrl)
/* 215:    */   {
/* 216:247 */     this.returnUrl = returnUrl;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public String getApiVersion()
/* 220:    */   {
/* 221:251 */     return this.apiVersion;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setApiVersion(String apiVersion)
/* 225:    */   {
/* 226:255 */     this.apiVersion = apiVersion;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setTerminalType(String terminalType)
/* 230:    */   {
/* 231:259 */     this.terminalType = terminalType;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getTerminalType()
/* 235:    */   {
/* 236:263 */     return this.terminalType;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setTerminalInfo(String terminalInfo)
/* 240:    */   {
/* 241:267 */     this.terminalInfo = terminalInfo;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getTerminalInfo()
/* 245:    */   {
/* 246:271 */     return this.terminalInfo;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setProdCode(String prodCode)
/* 250:    */   {
/* 251:275 */     this.prodCode = prodCode;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public String getProdCode()
/* 255:    */   {
/* 256:279 */     return this.prodCode;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public String getApiMethodName()
/* 260:    */   {
/* 261:283 */     return "alipay.ebpp.pdeduct.sign.add";
/* 262:    */   }
/* 263:    */   
/* 264:    */   public Map<String, String> getTextParams()
/* 265:    */   {
/* 266:287 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 267:288 */     txtParams.put("agent_channel", this.agentChannel);
/* 268:289 */     txtParams.put("agent_code", this.agentCode);
/* 269:290 */     txtParams.put("bill_key", this.billKey);
/* 270:291 */     txtParams.put("biz_type", this.bizType);
/* 271:292 */     txtParams.put("charge_inst", this.chargeInst);
/* 272:293 */     txtParams.put("deduct_type", this.deductType);
/* 273:294 */     txtParams.put("extend_field", this.extendField);
/* 274:295 */     txtParams.put("notify_config", this.notifyConfig);
/* 275:296 */     txtParams.put("out_agreement_id", this.outAgreementId);
/* 276:297 */     txtParams.put("owner_name", this.ownerName);
/* 277:298 */     txtParams.put("pay_config", this.payConfig);
/* 278:299 */     txtParams.put("pay_password_token", this.payPasswordToken);
/* 279:300 */     txtParams.put("pid", this.pid);
/* 280:301 */     txtParams.put("sign_expire_date", this.signExpireDate);
/* 281:302 */     txtParams.put("sub_biz_type", this.subBizType);
/* 282:303 */     txtParams.put("user_id", this.userId);
/* 283:304 */     if (this.udfParams != null) {
/* 284:305 */       txtParams.putAll(this.udfParams);
/* 285:    */     }
/* 286:307 */     return txtParams;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void putOtherTextParam(String key, String value)
/* 290:    */   {
/* 291:311 */     if (this.udfParams == null) {
/* 292:312 */       this.udfParams = new AlipayHashMap();
/* 293:    */     }
/* 294:314 */     this.udfParams.put(key, value);
/* 295:    */   }
/* 296:    */   
/* 297:    */   public Class<AlipayEbppPdeductSignAddResponse> getResponseClass()
/* 298:    */   {
/* 299:318 */     return AlipayEbppPdeductSignAddResponse.class;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public boolean isNeedEncrypt()
/* 303:    */   {
/* 304:324 */     return this.needEncrypt;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 308:    */   {
/* 309:330 */     this.needEncrypt = needEncrypt;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public AlipayObject getBizModel()
/* 313:    */   {
/* 314:335 */     return this.bizModel;
/* 315:    */   }
/* 316:    */   
/* 317:    */   public void setBizModel(AlipayObject bizModel)
/* 318:    */   {
/* 319:341 */     this.bizModel = bizModel;
/* 320:    */   }
/* 321:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayEbppPdeductSignAddRequest
 * JD-Core Version:    0.7.0.1
 */