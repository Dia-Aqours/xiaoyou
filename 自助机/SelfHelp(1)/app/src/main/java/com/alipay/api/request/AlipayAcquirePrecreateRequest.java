/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayAcquirePrecreateResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayAcquirePrecreateRequest
/*  10:    */   implements AlipayRequest<AlipayAcquirePrecreateResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String body;
/*  15:    */   private String channelParameters;
/*  16:    */   private String currency;
/*  17:    */   private String extendParams;
/*  18:    */   private String goodsDetail;
/*  19:    */   private String itBPay;
/*  20:    */   private String operatorCode;
/*  21:    */   private String operatorId;
/*  22:    */   private String outTradeNo;
/*  23:    */   private String price;
/*  24:    */   private String quantity;
/*  25:    */   private String royaltyParameters;
/*  26:    */   private String royaltyType;
/*  27:    */   private String sellerEmail;
/*  28:    */   private String sellerId;
/*  29:    */   private String showUrl;
/*  30:    */   private String subject;
/*  31:    */   private String totalFee;
/*  32:    */   private String terminalType;
/*  33:    */   private String terminalInfo;
/*  34:    */   private String prodCode;
/*  35:    */   private String notifyUrl;
/*  36:    */   private String returnUrl;
/*  37:    */   
/*  38:    */   public void setBody(String body)
/*  39:    */   {
/*  40:124 */     this.body = body;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getBody()
/*  44:    */   {
/*  45:127 */     return this.body;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setChannelParameters(String channelParameters)
/*  49:    */   {
/*  50:131 */     this.channelParameters = channelParameters;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getChannelParameters()
/*  54:    */   {
/*  55:134 */     return this.channelParameters;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setCurrency(String currency)
/*  59:    */   {
/*  60:138 */     this.currency = currency;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getCurrency()
/*  64:    */   {
/*  65:141 */     return this.currency;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setExtendParams(String extendParams)
/*  69:    */   {
/*  70:145 */     this.extendParams = extendParams;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getExtendParams()
/*  74:    */   {
/*  75:148 */     return this.extendParams;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setGoodsDetail(String goodsDetail)
/*  79:    */   {
/*  80:152 */     this.goodsDetail = goodsDetail;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getGoodsDetail()
/*  84:    */   {
/*  85:155 */     return this.goodsDetail;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setItBPay(String itBPay)
/*  89:    */   {
/*  90:159 */     this.itBPay = itBPay;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getItBPay()
/*  94:    */   {
/*  95:162 */     return this.itBPay;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setOperatorCode(String operatorCode)
/*  99:    */   {
/* 100:166 */     this.operatorCode = operatorCode;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getOperatorCode()
/* 104:    */   {
/* 105:169 */     return this.operatorCode;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setOperatorId(String operatorId)
/* 109:    */   {
/* 110:173 */     this.operatorId = operatorId;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getOperatorId()
/* 114:    */   {
/* 115:176 */     return this.operatorId;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setOutTradeNo(String outTradeNo)
/* 119:    */   {
/* 120:180 */     this.outTradeNo = outTradeNo;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getOutTradeNo()
/* 124:    */   {
/* 125:183 */     return this.outTradeNo;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setPrice(String price)
/* 129:    */   {
/* 130:187 */     this.price = price;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getPrice()
/* 134:    */   {
/* 135:190 */     return this.price;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setQuantity(String quantity)
/* 139:    */   {
/* 140:194 */     this.quantity = quantity;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getQuantity()
/* 144:    */   {
/* 145:197 */     return this.quantity;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setRoyaltyParameters(String royaltyParameters)
/* 149:    */   {
/* 150:201 */     this.royaltyParameters = royaltyParameters;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getRoyaltyParameters()
/* 154:    */   {
/* 155:204 */     return this.royaltyParameters;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setRoyaltyType(String royaltyType)
/* 159:    */   {
/* 160:208 */     this.royaltyType = royaltyType;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getRoyaltyType()
/* 164:    */   {
/* 165:211 */     return this.royaltyType;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setSellerEmail(String sellerEmail)
/* 169:    */   {
/* 170:215 */     this.sellerEmail = sellerEmail;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getSellerEmail()
/* 174:    */   {
/* 175:218 */     return this.sellerEmail;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setSellerId(String sellerId)
/* 179:    */   {
/* 180:222 */     this.sellerId = sellerId;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getSellerId()
/* 184:    */   {
/* 185:225 */     return this.sellerId;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setShowUrl(String showUrl)
/* 189:    */   {
/* 190:229 */     this.showUrl = showUrl;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getShowUrl()
/* 194:    */   {
/* 195:232 */     return this.showUrl;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setSubject(String subject)
/* 199:    */   {
/* 200:236 */     this.subject = subject;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public String getSubject()
/* 204:    */   {
/* 205:239 */     return this.subject;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public void setTotalFee(String totalFee)
/* 209:    */   {
/* 210:243 */     this.totalFee = totalFee;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public String getTotalFee()
/* 214:    */   {
/* 215:246 */     return this.totalFee;
/* 216:    */   }
/* 217:    */   
/* 218:253 */   private boolean needEncrypt = false;
/* 219:254 */   private AlipayObject bizModel = null;
/* 220:    */   
/* 221:    */   public String getNotifyUrl()
/* 222:    */   {
/* 223:257 */     return this.notifyUrl;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void setNotifyUrl(String notifyUrl)
/* 227:    */   {
/* 228:261 */     this.notifyUrl = notifyUrl;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public String getReturnUrl()
/* 232:    */   {
/* 233:265 */     return this.returnUrl;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public void setReturnUrl(String returnUrl)
/* 237:    */   {
/* 238:269 */     this.returnUrl = returnUrl;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public String getApiVersion()
/* 242:    */   {
/* 243:273 */     return this.apiVersion;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void setApiVersion(String apiVersion)
/* 247:    */   {
/* 248:277 */     this.apiVersion = apiVersion;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void setTerminalType(String terminalType)
/* 252:    */   {
/* 253:281 */     this.terminalType = terminalType;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public String getTerminalType()
/* 257:    */   {
/* 258:285 */     return this.terminalType;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public void setTerminalInfo(String terminalInfo)
/* 262:    */   {
/* 263:289 */     this.terminalInfo = terminalInfo;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public String getTerminalInfo()
/* 267:    */   {
/* 268:293 */     return this.terminalInfo;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public void setProdCode(String prodCode)
/* 272:    */   {
/* 273:297 */     this.prodCode = prodCode;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public String getProdCode()
/* 277:    */   {
/* 278:301 */     return this.prodCode;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public String getApiMethodName()
/* 282:    */   {
/* 283:305 */     return "alipay.acquire.precreate";
/* 284:    */   }
/* 285:    */   
/* 286:    */   public Map<String, String> getTextParams()
/* 287:    */   {
/* 288:309 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 289:310 */     txtParams.put("body", this.body);
/* 290:311 */     txtParams.put("channel_parameters", this.channelParameters);
/* 291:312 */     txtParams.put("currency", this.currency);
/* 292:313 */     txtParams.put("extend_params", this.extendParams);
/* 293:314 */     txtParams.put("goods_detail", this.goodsDetail);
/* 294:315 */     txtParams.put("it_b_pay", this.itBPay);
/* 295:316 */     txtParams.put("operator_code", this.operatorCode);
/* 296:317 */     txtParams.put("operator_id", this.operatorId);
/* 297:318 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 298:319 */     txtParams.put("price", this.price);
/* 299:320 */     txtParams.put("quantity", this.quantity);
/* 300:321 */     txtParams.put("royalty_parameters", this.royaltyParameters);
/* 301:322 */     txtParams.put("royalty_type", this.royaltyType);
/* 302:323 */     txtParams.put("seller_email", this.sellerEmail);
/* 303:324 */     txtParams.put("seller_id", this.sellerId);
/* 304:325 */     txtParams.put("show_url", this.showUrl);
/* 305:326 */     txtParams.put("subject", this.subject);
/* 306:327 */     txtParams.put("total_fee", this.totalFee);
/* 307:328 */     if (this.udfParams != null) {
/* 308:329 */       txtParams.putAll(this.udfParams);
/* 309:    */     }
/* 310:331 */     return txtParams;
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void putOtherTextParam(String key, String value)
/* 314:    */   {
/* 315:335 */     if (this.udfParams == null) {
/* 316:336 */       this.udfParams = new AlipayHashMap();
/* 317:    */     }
/* 318:338 */     this.udfParams.put(key, value);
/* 319:    */   }
/* 320:    */   
/* 321:    */   public Class<AlipayAcquirePrecreateResponse> getResponseClass()
/* 322:    */   {
/* 323:342 */     return AlipayAcquirePrecreateResponse.class;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public boolean isNeedEncrypt()
/* 327:    */   {
/* 328:348 */     return this.needEncrypt;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 332:    */   {
/* 333:354 */     this.needEncrypt = needEncrypt;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public AlipayObject getBizModel()
/* 337:    */   {
/* 338:359 */     return this.bizModel;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public void setBizModel(AlipayObject bizModel)
/* 342:    */   {
/* 343:365 */     this.bizModel = bizModel;
/* 344:    */   }
/* 345:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayAcquirePrecreateRequest

 * JD-Core Version:    0.7.0.1

 */