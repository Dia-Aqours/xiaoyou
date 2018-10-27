/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayUserMemberCardUpdateResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayUserMemberCardUpdateRequest
/*  10:    */   implements AlipayRequest<AlipayUserMemberCardUpdateResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String balance;
/*  15:    */   private String bizCardNo;
/*  16:    */   private String cardMerchantInfo;
/*  17:    */   private String extInfo;
/*  18:    */   private String externalCardNo;
/*  19:    */   private String issuerType;
/*  20:    */   private String level;
/*  21:    */   private String orrurTime;
/*  22:    */   private Long point;
/*  23:    */   private String requestFrom;
/*  24:    */   private String terminalType;
/*  25:    */   private String terminalInfo;
/*  26:    */   private String prodCode;
/*  27:    */   private String notifyUrl;
/*  28:    */   private String returnUrl;
/*  29:    */   
/*  30:    */   public void setBalance(String balance)
/*  31:    */   {
/*  32: 87 */     this.balance = balance;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getBalance()
/*  36:    */   {
/*  37: 90 */     return this.balance;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setBizCardNo(String bizCardNo)
/*  41:    */   {
/*  42: 94 */     this.bizCardNo = bizCardNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getBizCardNo()
/*  46:    */   {
/*  47: 97 */     return this.bizCardNo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  51:    */   {
/*  52:101 */     this.cardMerchantInfo = cardMerchantInfo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getCardMerchantInfo()
/*  56:    */   {
/*  57:104 */     return this.cardMerchantInfo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setExtInfo(String extInfo)
/*  61:    */   {
/*  62:108 */     this.extInfo = extInfo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getExtInfo()
/*  66:    */   {
/*  67:111 */     return this.extInfo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setExternalCardNo(String externalCardNo)
/*  71:    */   {
/*  72:115 */     this.externalCardNo = externalCardNo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getExternalCardNo()
/*  76:    */   {
/*  77:118 */     return this.externalCardNo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setIssuerType(String issuerType)
/*  81:    */   {
/*  82:122 */     this.issuerType = issuerType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getIssuerType()
/*  86:    */   {
/*  87:125 */     return this.issuerType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setLevel(String level)
/*  91:    */   {
/*  92:129 */     this.level = level;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getLevel()
/*  96:    */   {
/*  97:132 */     return this.level;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setOrrurTime(String orrurTime)
/* 101:    */   {
/* 102:136 */     this.orrurTime = orrurTime;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getOrrurTime()
/* 106:    */   {
/* 107:139 */     return this.orrurTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setPoint(Long point)
/* 111:    */   {
/* 112:143 */     this.point = point;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Long getPoint()
/* 116:    */   {
/* 117:146 */     return this.point;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setRequestFrom(String requestFrom)
/* 121:    */   {
/* 122:150 */     this.requestFrom = requestFrom;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getRequestFrom()
/* 126:    */   {
/* 127:153 */     return this.requestFrom;
/* 128:    */   }
/* 129:    */   
/* 130:160 */   private boolean needEncrypt = false;
/* 131:161 */   private AlipayObject bizModel = null;
/* 132:    */   
/* 133:    */   public String getNotifyUrl()
/* 134:    */   {
/* 135:164 */     return this.notifyUrl;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setNotifyUrl(String notifyUrl)
/* 139:    */   {
/* 140:168 */     this.notifyUrl = notifyUrl;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getReturnUrl()
/* 144:    */   {
/* 145:172 */     return this.returnUrl;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setReturnUrl(String returnUrl)
/* 149:    */   {
/* 150:176 */     this.returnUrl = returnUrl;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getApiVersion()
/* 154:    */   {
/* 155:180 */     return this.apiVersion;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setApiVersion(String apiVersion)
/* 159:    */   {
/* 160:184 */     this.apiVersion = apiVersion;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setTerminalType(String terminalType)
/* 164:    */   {
/* 165:188 */     this.terminalType = terminalType;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getTerminalType()
/* 169:    */   {
/* 170:192 */     return this.terminalType;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setTerminalInfo(String terminalInfo)
/* 174:    */   {
/* 175:196 */     this.terminalInfo = terminalInfo;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getTerminalInfo()
/* 179:    */   {
/* 180:200 */     return this.terminalInfo;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setProdCode(String prodCode)
/* 184:    */   {
/* 185:204 */     this.prodCode = prodCode;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getProdCode()
/* 189:    */   {
/* 190:208 */     return this.prodCode;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getApiMethodName()
/* 194:    */   {
/* 195:212 */     return "alipay.user.member.card.update";
/* 196:    */   }
/* 197:    */   
/* 198:    */   public Map<String, String> getTextParams()
/* 199:    */   {
/* 200:216 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 201:217 */     txtParams.put("balance", this.balance);
/* 202:218 */     txtParams.put("biz_card_no", this.bizCardNo);
/* 203:219 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 204:220 */     txtParams.put("ext_info", this.extInfo);
/* 205:221 */     txtParams.put("external_card_no", this.externalCardNo);
/* 206:222 */     txtParams.put("issuer_type", this.issuerType);
/* 207:223 */     txtParams.put("level", this.level);
/* 208:224 */     txtParams.put("orrur_time", this.orrurTime);
/* 209:225 */     txtParams.put("point", this.point);
/* 210:226 */     txtParams.put("request_from", this.requestFrom);
/* 211:227 */     if (this.udfParams != null) {
/* 212:228 */       txtParams.putAll(this.udfParams);
/* 213:    */     }
/* 214:230 */     return txtParams;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void putOtherTextParam(String key, String value)
/* 218:    */   {
/* 219:234 */     if (this.udfParams == null) {
/* 220:235 */       this.udfParams = new AlipayHashMap();
/* 221:    */     }
/* 222:237 */     this.udfParams.put(key, value);
/* 223:    */   }
/* 224:    */   
/* 225:    */   public Class<AlipayUserMemberCardUpdateResponse> getResponseClass()
/* 226:    */   {
/* 227:241 */     return AlipayUserMemberCardUpdateResponse.class;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public boolean isNeedEncrypt()
/* 231:    */   {
/* 232:247 */     return this.needEncrypt;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 236:    */   {
/* 237:253 */     this.needEncrypt = needEncrypt;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public AlipayObject getBizModel()
/* 241:    */   {
/* 242:258 */     return this.bizModel;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void setBizModel(AlipayObject bizModel)
/* 246:    */   {
/* 247:264 */     this.bizModel = bizModel;
/* 248:    */   }
/* 249:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayUserMemberCardUpdateRequest

 * JD-Core Version:    0.7.0.1

 */