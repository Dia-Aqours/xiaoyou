/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMemberConsumeNotifyResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMemberConsumeNotifyRequest
/*  10:    */   implements AlipayRequest<AlipayMemberConsumeNotifyResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String actPayAmount;
/*  15:    */   private String bizCardNo;
/*  16:    */   private String cardInfo;
/*  17:    */   private String externalCardNo;
/*  18:    */   private String gainBenefitList;
/*  19:    */   private String memo;
/*  20:    */   private String shopCode;
/*  21:    */   private String swipeCertType;
/*  22:    */   private String tradeAmount;
/*  23:    */   private String tradeName;
/*  24:    */   private String tradeNo;
/*  25:    */   private String tradeTime;
/*  26:    */   private String tradeType;
/*  27:    */   private String useBenefitList;
/*  28:    */   private String terminalType;
/*  29:    */   private String terminalInfo;
/*  30:    */   private String prodCode;
/*  31:    */   private String notifyUrl;
/*  32:    */   private String returnUrl;
/*  33:    */   
/*  34:    */   public void setActPayAmount(String actPayAmount)
/*  35:    */   {
/*  36:120 */     this.actPayAmount = actPayAmount;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getActPayAmount()
/*  40:    */   {
/*  41:123 */     return this.actPayAmount;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setBizCardNo(String bizCardNo)
/*  45:    */   {
/*  46:127 */     this.bizCardNo = bizCardNo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getBizCardNo()
/*  50:    */   {
/*  51:130 */     return this.bizCardNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setCardInfo(String cardInfo)
/*  55:    */   {
/*  56:134 */     this.cardInfo = cardInfo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getCardInfo()
/*  60:    */   {
/*  61:137 */     return this.cardInfo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setExternalCardNo(String externalCardNo)
/*  65:    */   {
/*  66:141 */     this.externalCardNo = externalCardNo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getExternalCardNo()
/*  70:    */   {
/*  71:144 */     return this.externalCardNo;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setGainBenefitList(String gainBenefitList)
/*  75:    */   {
/*  76:148 */     this.gainBenefitList = gainBenefitList;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getGainBenefitList()
/*  80:    */   {
/*  81:151 */     return this.gainBenefitList;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setMemo(String memo)
/*  85:    */   {
/*  86:155 */     this.memo = memo;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getMemo()
/*  90:    */   {
/*  91:158 */     return this.memo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setShopCode(String shopCode)
/*  95:    */   {
/*  96:162 */     this.shopCode = shopCode;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getShopCode()
/* 100:    */   {
/* 101:165 */     return this.shopCode;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setSwipeCertType(String swipeCertType)
/* 105:    */   {
/* 106:169 */     this.swipeCertType = swipeCertType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getSwipeCertType()
/* 110:    */   {
/* 111:172 */     return this.swipeCertType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTradeAmount(String tradeAmount)
/* 115:    */   {
/* 116:176 */     this.tradeAmount = tradeAmount;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTradeAmount()
/* 120:    */   {
/* 121:179 */     return this.tradeAmount;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setTradeName(String tradeName)
/* 125:    */   {
/* 126:183 */     this.tradeName = tradeName;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getTradeName()
/* 130:    */   {
/* 131:186 */     return this.tradeName;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setTradeNo(String tradeNo)
/* 135:    */   {
/* 136:190 */     this.tradeNo = tradeNo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getTradeNo()
/* 140:    */   {
/* 141:193 */     return this.tradeNo;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setTradeTime(String tradeTime)
/* 145:    */   {
/* 146:197 */     this.tradeTime = tradeTime;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getTradeTime()
/* 150:    */   {
/* 151:200 */     return this.tradeTime;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setTradeType(String tradeType)
/* 155:    */   {
/* 156:204 */     this.tradeType = tradeType;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getTradeType()
/* 160:    */   {
/* 161:207 */     return this.tradeType;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setUseBenefitList(String useBenefitList)
/* 165:    */   {
/* 166:211 */     this.useBenefitList = useBenefitList;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getUseBenefitList()
/* 170:    */   {
/* 171:214 */     return this.useBenefitList;
/* 172:    */   }
/* 173:    */   
/* 174:221 */   private boolean needEncrypt = false;
/* 175:222 */   private AlipayObject bizModel = null;
/* 176:    */   
/* 177:    */   public String getNotifyUrl()
/* 178:    */   {
/* 179:225 */     return this.notifyUrl;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setNotifyUrl(String notifyUrl)
/* 183:    */   {
/* 184:229 */     this.notifyUrl = notifyUrl;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getReturnUrl()
/* 188:    */   {
/* 189:233 */     return this.returnUrl;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setReturnUrl(String returnUrl)
/* 193:    */   {
/* 194:237 */     this.returnUrl = returnUrl;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getApiVersion()
/* 198:    */   {
/* 199:241 */     return this.apiVersion;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setApiVersion(String apiVersion)
/* 203:    */   {
/* 204:245 */     this.apiVersion = apiVersion;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void setTerminalType(String terminalType)
/* 208:    */   {
/* 209:249 */     this.terminalType = terminalType;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public String getTerminalType()
/* 213:    */   {
/* 214:253 */     return this.terminalType;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void setTerminalInfo(String terminalInfo)
/* 218:    */   {
/* 219:257 */     this.terminalInfo = terminalInfo;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String getTerminalInfo()
/* 223:    */   {
/* 224:261 */     return this.terminalInfo;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void setProdCode(String prodCode)
/* 228:    */   {
/* 229:265 */     this.prodCode = prodCode;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public String getProdCode()
/* 233:    */   {
/* 234:269 */     return this.prodCode;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getApiMethodName()
/* 238:    */   {
/* 239:273 */     return "alipay.member.consume.notify";
/* 240:    */   }
/* 241:    */   
/* 242:    */   public Map<String, String> getTextParams()
/* 243:    */   {
/* 244:277 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 245:278 */     txtParams.put("act_pay_amount", this.actPayAmount);
/* 246:279 */     txtParams.put("biz_card_no", this.bizCardNo);
/* 247:280 */     txtParams.put("card_info", this.cardInfo);
/* 248:281 */     txtParams.put("external_card_no", this.externalCardNo);
/* 249:282 */     txtParams.put("gain_benefit_list", this.gainBenefitList);
/* 250:283 */     txtParams.put("memo", this.memo);
/* 251:284 */     txtParams.put("shop_code", this.shopCode);
/* 252:285 */     txtParams.put("swipe_cert_type", this.swipeCertType);
/* 253:286 */     txtParams.put("trade_amount", this.tradeAmount);
/* 254:287 */     txtParams.put("trade_name", this.tradeName);
/* 255:288 */     txtParams.put("trade_no", this.tradeNo);
/* 256:289 */     txtParams.put("trade_time", this.tradeTime);
/* 257:290 */     txtParams.put("trade_type", this.tradeType);
/* 258:291 */     txtParams.put("use_benefit_list", this.useBenefitList);
/* 259:292 */     if (this.udfParams != null) {
/* 260:293 */       txtParams.putAll(this.udfParams);
/* 261:    */     }
/* 262:295 */     return txtParams;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void putOtherTextParam(String key, String value)
/* 266:    */   {
/* 267:299 */     if (this.udfParams == null) {
/* 268:300 */       this.udfParams = new AlipayHashMap();
/* 269:    */     }
/* 270:302 */     this.udfParams.put(key, value);
/* 271:    */   }
/* 272:    */   
/* 273:    */   public Class<AlipayMemberConsumeNotifyResponse> getResponseClass()
/* 274:    */   {
/* 275:306 */     return AlipayMemberConsumeNotifyResponse.class;
/* 276:    */   }
/* 277:    */   
/* 278:    */   public boolean isNeedEncrypt()
/* 279:    */   {
/* 280:312 */     return this.needEncrypt;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 284:    */   {
/* 285:318 */     this.needEncrypt = needEncrypt;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public AlipayObject getBizModel()
/* 289:    */   {
/* 290:323 */     return this.bizModel;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void setBizModel(AlipayObject bizModel)
/* 294:    */   {
/* 295:329 */     this.bizModel = bizModel;
/* 296:    */   }
/* 297:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMemberConsumeNotifyRequest
 * JD-Core Version:    0.7.0.1
 */