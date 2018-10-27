/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayAcquireCreateandpayResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayAcquireCreateandpayRequest
/*  10:    */   implements AlipayRequest<AlipayAcquireCreateandpayResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String alipayCaRequest;
/*  15:    */   private String body;
/*  16:    */   private String buyerEmail;
/*  17:    */   private String buyerId;
/*  18:    */   private String channelParameters;
/*  19:    */   private String currency;
/*  20:    */   private String dynamicId;
/*  21:    */   private String dynamicIdType;
/*  22:    */   private String extendParams;
/*  23:    */   private String formatType;
/*  24:    */   private String goodsDetail;
/*  25:    */   private String itBPay;
/*  26:    */   private String mcardParameters;
/*  27:    */   private String operatorId;
/*  28:    */   private String operatorType;
/*  29:    */   private String outTradeNo;
/*  30:    */   private String price;
/*  31:    */   private String quantity;
/*  32:    */   private String refIds;
/*  33:    */   private String royaltyParameters;
/*  34:    */   private String royaltyType;
/*  35:    */   private String sellerEmail;
/*  36:    */   private String sellerId;
/*  37:    */   private String showUrl;
/*  38:    */   private String subject;
/*  39:    */   private String totalFee;
/*  40:    */   private String terminalType;
/*  41:    */   private String terminalInfo;
/*  42:    */   private String prodCode;
/*  43:    */   private String notifyUrl;
/*  44:    */   private String returnUrl;
/*  45:    */   
/*  46:    */   public void setAlipayCaRequest(String alipayCaRequest)
/*  47:    */   {
/*  48:184 */     this.alipayCaRequest = alipayCaRequest;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAlipayCaRequest()
/*  52:    */   {
/*  53:187 */     return this.alipayCaRequest;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBody(String body)
/*  57:    */   {
/*  58:191 */     this.body = body;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBody()
/*  62:    */   {
/*  63:194 */     return this.body;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBuyerEmail(String buyerEmail)
/*  67:    */   {
/*  68:198 */     this.buyerEmail = buyerEmail;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getBuyerEmail()
/*  72:    */   {
/*  73:201 */     return this.buyerEmail;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setBuyerId(String buyerId)
/*  77:    */   {
/*  78:205 */     this.buyerId = buyerId;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getBuyerId()
/*  82:    */   {
/*  83:208 */     return this.buyerId;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setChannelParameters(String channelParameters)
/*  87:    */   {
/*  88:212 */     this.channelParameters = channelParameters;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getChannelParameters()
/*  92:    */   {
/*  93:215 */     return this.channelParameters;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setCurrency(String currency)
/*  97:    */   {
/*  98:219 */     this.currency = currency;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getCurrency()
/* 102:    */   {
/* 103:222 */     return this.currency;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setDynamicId(String dynamicId)
/* 107:    */   {
/* 108:226 */     this.dynamicId = dynamicId;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getDynamicId()
/* 112:    */   {
/* 113:229 */     return this.dynamicId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setDynamicIdType(String dynamicIdType)
/* 117:    */   {
/* 118:233 */     this.dynamicIdType = dynamicIdType;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getDynamicIdType()
/* 122:    */   {
/* 123:236 */     return this.dynamicIdType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setExtendParams(String extendParams)
/* 127:    */   {
/* 128:240 */     this.extendParams = extendParams;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getExtendParams()
/* 132:    */   {
/* 133:243 */     return this.extendParams;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setFormatType(String formatType)
/* 137:    */   {
/* 138:247 */     this.formatType = formatType;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getFormatType()
/* 142:    */   {
/* 143:250 */     return this.formatType;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setGoodsDetail(String goodsDetail)
/* 147:    */   {
/* 148:254 */     this.goodsDetail = goodsDetail;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getGoodsDetail()
/* 152:    */   {
/* 153:257 */     return this.goodsDetail;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setItBPay(String itBPay)
/* 157:    */   {
/* 158:261 */     this.itBPay = itBPay;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getItBPay()
/* 162:    */   {
/* 163:264 */     return this.itBPay;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setMcardParameters(String mcardParameters)
/* 167:    */   {
/* 168:268 */     this.mcardParameters = mcardParameters;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getMcardParameters()
/* 172:    */   {
/* 173:271 */     return this.mcardParameters;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setOperatorId(String operatorId)
/* 177:    */   {
/* 178:275 */     this.operatorId = operatorId;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getOperatorId()
/* 182:    */   {
/* 183:278 */     return this.operatorId;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setOperatorType(String operatorType)
/* 187:    */   {
/* 188:282 */     this.operatorType = operatorType;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getOperatorType()
/* 192:    */   {
/* 193:285 */     return this.operatorType;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setOutTradeNo(String outTradeNo)
/* 197:    */   {
/* 198:289 */     this.outTradeNo = outTradeNo;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String getOutTradeNo()
/* 202:    */   {
/* 203:292 */     return this.outTradeNo;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setPrice(String price)
/* 207:    */   {
/* 208:296 */     this.price = price;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getPrice()
/* 212:    */   {
/* 213:299 */     return this.price;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void setQuantity(String quantity)
/* 217:    */   {
/* 218:303 */     this.quantity = quantity;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public String getQuantity()
/* 222:    */   {
/* 223:306 */     return this.quantity;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void setRefIds(String refIds)
/* 227:    */   {
/* 228:310 */     this.refIds = refIds;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public String getRefIds()
/* 232:    */   {
/* 233:313 */     return this.refIds;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public void setRoyaltyParameters(String royaltyParameters)
/* 237:    */   {
/* 238:317 */     this.royaltyParameters = royaltyParameters;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public String getRoyaltyParameters()
/* 242:    */   {
/* 243:320 */     return this.royaltyParameters;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void setRoyaltyType(String royaltyType)
/* 247:    */   {
/* 248:324 */     this.royaltyType = royaltyType;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public String getRoyaltyType()
/* 252:    */   {
/* 253:327 */     return this.royaltyType;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public void setSellerEmail(String sellerEmail)
/* 257:    */   {
/* 258:331 */     this.sellerEmail = sellerEmail;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public String getSellerEmail()
/* 262:    */   {
/* 263:334 */     return this.sellerEmail;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void setSellerId(String sellerId)
/* 267:    */   {
/* 268:338 */     this.sellerId = sellerId;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public String getSellerId()
/* 272:    */   {
/* 273:341 */     return this.sellerId;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public void setShowUrl(String showUrl)
/* 277:    */   {
/* 278:345 */     this.showUrl = showUrl;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public String getShowUrl()
/* 282:    */   {
/* 283:348 */     return this.showUrl;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public void setSubject(String subject)
/* 287:    */   {
/* 288:352 */     this.subject = subject;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public String getSubject()
/* 292:    */   {
/* 293:355 */     return this.subject;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public void setTotalFee(String totalFee)
/* 297:    */   {
/* 298:359 */     this.totalFee = totalFee;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public String getTotalFee()
/* 302:    */   {
/* 303:362 */     return this.totalFee;
/* 304:    */   }
/* 305:    */   
/* 306:369 */   private boolean needEncrypt = false;
/* 307:370 */   private AlipayObject bizModel = null;
/* 308:    */   
/* 309:    */   public String getNotifyUrl()
/* 310:    */   {
/* 311:373 */     return this.notifyUrl;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public void setNotifyUrl(String notifyUrl)
/* 315:    */   {
/* 316:377 */     this.notifyUrl = notifyUrl;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public String getReturnUrl()
/* 320:    */   {
/* 321:381 */     return this.returnUrl;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public void setReturnUrl(String returnUrl)
/* 325:    */   {
/* 326:385 */     this.returnUrl = returnUrl;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public String getApiVersion()
/* 330:    */   {
/* 331:389 */     return this.apiVersion;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public void setApiVersion(String apiVersion)
/* 335:    */   {
/* 336:393 */     this.apiVersion = apiVersion;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public void setTerminalType(String terminalType)
/* 340:    */   {
/* 341:397 */     this.terminalType = terminalType;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public String getTerminalType()
/* 345:    */   {
/* 346:401 */     return this.terminalType;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public void setTerminalInfo(String terminalInfo)
/* 350:    */   {
/* 351:405 */     this.terminalInfo = terminalInfo;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public String getTerminalInfo()
/* 355:    */   {
/* 356:409 */     return this.terminalInfo;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public void setProdCode(String prodCode)
/* 360:    */   {
/* 361:413 */     this.prodCode = prodCode;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public String getProdCode()
/* 365:    */   {
/* 366:417 */     return this.prodCode;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public String getApiMethodName()
/* 370:    */   {
/* 371:421 */     return "alipay.acquire.createandpay";
/* 372:    */   }
/* 373:    */   
/* 374:    */   public Map<String, String> getTextParams()
/* 375:    */   {
/* 376:425 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 377:426 */     txtParams.put("alipay_ca_request", this.alipayCaRequest);
/* 378:427 */     txtParams.put("body", this.body);
/* 379:428 */     txtParams.put("buyer_email", this.buyerEmail);
/* 380:429 */     txtParams.put("buyer_id", this.buyerId);
/* 381:430 */     txtParams.put("channel_parameters", this.channelParameters);
/* 382:431 */     txtParams.put("currency", this.currency);
/* 383:432 */     txtParams.put("dynamic_id", this.dynamicId);
/* 384:433 */     txtParams.put("dynamic_id_type", this.dynamicIdType);
/* 385:434 */     txtParams.put("extend_params", this.extendParams);
/* 386:435 */     txtParams.put("format_type", this.formatType);
/* 387:436 */     txtParams.put("goods_detail", this.goodsDetail);
/* 388:437 */     txtParams.put("it_b_pay", this.itBPay);
/* 389:438 */     txtParams.put("mcard_parameters", this.mcardParameters);
/* 390:439 */     txtParams.put("operator_id", this.operatorId);
/* 391:440 */     txtParams.put("operator_type", this.operatorType);
/* 392:441 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 393:442 */     txtParams.put("price", this.price);
/* 394:443 */     txtParams.put("quantity", this.quantity);
/* 395:444 */     txtParams.put("ref_ids", this.refIds);
/* 396:445 */     txtParams.put("royalty_parameters", this.royaltyParameters);
/* 397:446 */     txtParams.put("royalty_type", this.royaltyType);
/* 398:447 */     txtParams.put("seller_email", this.sellerEmail);
/* 399:448 */     txtParams.put("seller_id", this.sellerId);
/* 400:449 */     txtParams.put("show_url", this.showUrl);
/* 401:450 */     txtParams.put("subject", this.subject);
/* 402:451 */     txtParams.put("total_fee", this.totalFee);
/* 403:452 */     if (this.udfParams != null) {
/* 404:453 */       txtParams.putAll(this.udfParams);
/* 405:    */     }
/* 406:455 */     return txtParams;
/* 407:    */   }
/* 408:    */   
/* 409:    */   public void putOtherTextParam(String key, String value)
/* 410:    */   {
/* 411:459 */     if (this.udfParams == null) {
/* 412:460 */       this.udfParams = new AlipayHashMap();
/* 413:    */     }
/* 414:462 */     this.udfParams.put(key, value);
/* 415:    */   }
/* 416:    */   
/* 417:    */   public Class<AlipayAcquireCreateandpayResponse> getResponseClass()
/* 418:    */   {
/* 419:466 */     return AlipayAcquireCreateandpayResponse.class;
/* 420:    */   }
/* 421:    */   
/* 422:    */   public boolean isNeedEncrypt()
/* 423:    */   {
/* 424:472 */     return this.needEncrypt;
/* 425:    */   }
/* 426:    */   
/* 427:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 428:    */   {
/* 429:478 */     this.needEncrypt = needEncrypt;
/* 430:    */   }
/* 431:    */   
/* 432:    */   public AlipayObject getBizModel()
/* 433:    */   {
/* 434:483 */     return this.bizModel;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public void setBizModel(AlipayObject bizModel)
/* 438:    */   {
/* 439:489 */     this.bizModel = bizModel;
/* 440:    */   }
/* 441:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayAcquireCreateandpayRequest
 * JD-Core Version:    0.7.0.1
 */