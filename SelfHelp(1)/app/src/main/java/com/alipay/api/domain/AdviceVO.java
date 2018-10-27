/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AdviceVO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 8127911278495732553L;
/*  11:    */   @ApiField("client_advice_timestamp")
/*  12:    */   private Date clientAdviceTimestamp;
/*  13:    */   @ApiField("client_id")
/*  14:    */   private String clientId;
/*  15:    */   @ApiField("client_ref")
/*  16:    */   private String clientRef;
/*  17:    */   @ApiField("contra_amount")
/*  18:    */   private String contraAmount;
/*  19:    */   @ApiField("contra_ccy")
/*  20:    */   private String contraCcy;
/*  21:    */   @ApiField("end_to_end_id")
/*  22:    */   private String endToEndId;
/*  23:    */   @ApiField("msg_type")
/*  24:    */   private String msgType;
/*  25:    */   @ApiField("partial_trade")
/*  26:    */   private String partialTrade;
/*  27:    */   @ApiField("payment_provider")
/*  28:    */   private String paymentProvider;
/*  29:    */   @ApiField("payment_type")
/*  30:    */   private String paymentType;
/*  31:    */   @ApiField("profile_id")
/*  32:    */   private String profileId;
/*  33:    */   @ApiField("rate_ref")
/*  34:    */   private String rateRef;
/*  35:    */   @ApiField("rate_request_mode")
/*  36:    */   private String rateRequestMode;
/*  37:    */   @ApiField("rate_type")
/*  38:    */   private String rateType;
/*  39:    */   @ApiField("reference_field1")
/*  40:    */   private String referenceField1;
/*  41:    */   @ApiField("reference_field2")
/*  42:    */   private String referenceField2;
/*  43:    */   @ApiField("reference_field3")
/*  44:    */   private String referenceField3;
/*  45:    */   @ApiField("related_message_id")
/*  46:    */   private String relatedMessageId;
/*  47:    */   @ApiField("request_message_id")
/*  48:    */   private String requestMessageId;
/*  49:    */   @ApiField("requested_rate")
/*  50:    */   private String requestedRate;
/*  51:    */   @ApiField("settlement_amount")
/*  52:    */   private String settlementAmount;
/*  53:    */   @ApiField("settlement_ccy")
/*  54:    */   private String settlementCcy;
/*  55:    */   @ApiField("side")
/*  56:    */   private String side;
/*  57:    */   @ApiField("slip_point")
/*  58:    */   private Long slipPoint;
/*  59:    */   @ApiField("source_event_code")
/*  60:    */   private String sourceEventCode;
/*  61:    */   @ApiField("source_product_code")
/*  62:    */   private String sourceProductCode;
/*  63:    */   @ApiField("time_zone")
/*  64:    */   private String timeZone;
/*  65:    */   @ApiField("trade_timestamp")
/*  66:    */   private Date tradeTimestamp;
/*  67:    */   @ApiField("transaction_amount")
/*  68:    */   private String transactionAmount;
/*  69:    */   @ApiField("transaction_ccy")
/*  70:    */   private String transactionCcy;
/*  71:    */   @ApiField("transaction_ccy_type")
/*  72:    */   private String transactionCcyType;
/*  73:    */   @ApiField("transaction_type")
/*  74:    */   private String transactionType;
/*  75:    */   @ApiField("value_date")
/*  76:    */   private String valueDate;
/*  77:    */   
/*  78:    */   public Date getClientAdviceTimestamp()
/*  79:    */   {
/*  80:230 */     return this.clientAdviceTimestamp;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setClientAdviceTimestamp(Date clientAdviceTimestamp)
/*  84:    */   {
/*  85:233 */     this.clientAdviceTimestamp = clientAdviceTimestamp;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getClientId()
/*  89:    */   {
/*  90:237 */     return this.clientId;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setClientId(String clientId)
/*  94:    */   {
/*  95:240 */     this.clientId = clientId;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getClientRef()
/*  99:    */   {
/* 100:244 */     return this.clientRef;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setClientRef(String clientRef)
/* 104:    */   {
/* 105:247 */     this.clientRef = clientRef;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getContraAmount()
/* 109:    */   {
/* 110:251 */     return this.contraAmount;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setContraAmount(String contraAmount)
/* 114:    */   {
/* 115:254 */     this.contraAmount = contraAmount;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getContraCcy()
/* 119:    */   {
/* 120:258 */     return this.contraCcy;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setContraCcy(String contraCcy)
/* 124:    */   {
/* 125:261 */     this.contraCcy = contraCcy;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getEndToEndId()
/* 129:    */   {
/* 130:265 */     return this.endToEndId;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setEndToEndId(String endToEndId)
/* 134:    */   {
/* 135:268 */     this.endToEndId = endToEndId;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getMsgType()
/* 139:    */   {
/* 140:272 */     return this.msgType;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setMsgType(String msgType)
/* 144:    */   {
/* 145:275 */     this.msgType = msgType;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getPartialTrade()
/* 149:    */   {
/* 150:279 */     return this.partialTrade;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setPartialTrade(String partialTrade)
/* 154:    */   {
/* 155:282 */     this.partialTrade = partialTrade;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getPaymentProvider()
/* 159:    */   {
/* 160:286 */     return this.paymentProvider;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setPaymentProvider(String paymentProvider)
/* 164:    */   {
/* 165:289 */     this.paymentProvider = paymentProvider;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getPaymentType()
/* 169:    */   {
/* 170:293 */     return this.paymentType;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setPaymentType(String paymentType)
/* 174:    */   {
/* 175:296 */     this.paymentType = paymentType;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getProfileId()
/* 179:    */   {
/* 180:300 */     return this.profileId;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setProfileId(String profileId)
/* 184:    */   {
/* 185:303 */     this.profileId = profileId;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getRateRef()
/* 189:    */   {
/* 190:307 */     return this.rateRef;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setRateRef(String rateRef)
/* 194:    */   {
/* 195:310 */     this.rateRef = rateRef;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getRateRequestMode()
/* 199:    */   {
/* 200:314 */     return this.rateRequestMode;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setRateRequestMode(String rateRequestMode)
/* 204:    */   {
/* 205:317 */     this.rateRequestMode = rateRequestMode;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getRateType()
/* 209:    */   {
/* 210:321 */     return this.rateType;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setRateType(String rateType)
/* 214:    */   {
/* 215:324 */     this.rateType = rateType;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getReferenceField1()
/* 219:    */   {
/* 220:328 */     return this.referenceField1;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setReferenceField1(String referenceField1)
/* 224:    */   {
/* 225:331 */     this.referenceField1 = referenceField1;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public String getReferenceField2()
/* 229:    */   {
/* 230:335 */     return this.referenceField2;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void setReferenceField2(String referenceField2)
/* 234:    */   {
/* 235:338 */     this.referenceField2 = referenceField2;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public String getReferenceField3()
/* 239:    */   {
/* 240:342 */     return this.referenceField3;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public void setReferenceField3(String referenceField3)
/* 244:    */   {
/* 245:345 */     this.referenceField3 = referenceField3;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public String getRelatedMessageId()
/* 249:    */   {
/* 250:349 */     return this.relatedMessageId;
/* 251:    */   }
/* 252:    */   
/* 253:    */   public void setRelatedMessageId(String relatedMessageId)
/* 254:    */   {
/* 255:352 */     this.relatedMessageId = relatedMessageId;
/* 256:    */   }
/* 257:    */   
/* 258:    */   public String getRequestMessageId()
/* 259:    */   {
/* 260:356 */     return this.requestMessageId;
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void setRequestMessageId(String requestMessageId)
/* 264:    */   {
/* 265:359 */     this.requestMessageId = requestMessageId;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public String getRequestedRate()
/* 269:    */   {
/* 270:363 */     return this.requestedRate;
/* 271:    */   }
/* 272:    */   
/* 273:    */   public void setRequestedRate(String requestedRate)
/* 274:    */   {
/* 275:366 */     this.requestedRate = requestedRate;
/* 276:    */   }
/* 277:    */   
/* 278:    */   public String getSettlementAmount()
/* 279:    */   {
/* 280:370 */     return this.settlementAmount;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public void setSettlementAmount(String settlementAmount)
/* 284:    */   {
/* 285:373 */     this.settlementAmount = settlementAmount;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public String getSettlementCcy()
/* 289:    */   {
/* 290:377 */     return this.settlementCcy;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void setSettlementCcy(String settlementCcy)
/* 294:    */   {
/* 295:380 */     this.settlementCcy = settlementCcy;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public String getSide()
/* 299:    */   {
/* 300:384 */     return this.side;
/* 301:    */   }
/* 302:    */   
/* 303:    */   public void setSide(String side)
/* 304:    */   {
/* 305:387 */     this.side = side;
/* 306:    */   }
/* 307:    */   
/* 308:    */   public Long getSlipPoint()
/* 309:    */   {
/* 310:391 */     return this.slipPoint;
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void setSlipPoint(Long slipPoint)
/* 314:    */   {
/* 315:394 */     this.slipPoint = slipPoint;
/* 316:    */   }
/* 317:    */   
/* 318:    */   public String getSourceEventCode()
/* 319:    */   {
/* 320:398 */     return this.sourceEventCode;
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void setSourceEventCode(String sourceEventCode)
/* 324:    */   {
/* 325:401 */     this.sourceEventCode = sourceEventCode;
/* 326:    */   }
/* 327:    */   
/* 328:    */   public String getSourceProductCode()
/* 329:    */   {
/* 330:405 */     return this.sourceProductCode;
/* 331:    */   }
/* 332:    */   
/* 333:    */   public void setSourceProductCode(String sourceProductCode)
/* 334:    */   {
/* 335:408 */     this.sourceProductCode = sourceProductCode;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public String getTimeZone()
/* 339:    */   {
/* 340:412 */     return this.timeZone;
/* 341:    */   }
/* 342:    */   
/* 343:    */   public void setTimeZone(String timeZone)
/* 344:    */   {
/* 345:415 */     this.timeZone = timeZone;
/* 346:    */   }
/* 347:    */   
/* 348:    */   public Date getTradeTimestamp()
/* 349:    */   {
/* 350:419 */     return this.tradeTimestamp;
/* 351:    */   }
/* 352:    */   
/* 353:    */   public void setTradeTimestamp(Date tradeTimestamp)
/* 354:    */   {
/* 355:422 */     this.tradeTimestamp = tradeTimestamp;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public String getTransactionAmount()
/* 359:    */   {
/* 360:426 */     return this.transactionAmount;
/* 361:    */   }
/* 362:    */   
/* 363:    */   public void setTransactionAmount(String transactionAmount)
/* 364:    */   {
/* 365:429 */     this.transactionAmount = transactionAmount;
/* 366:    */   }
/* 367:    */   
/* 368:    */   public String getTransactionCcy()
/* 369:    */   {
/* 370:433 */     return this.transactionCcy;
/* 371:    */   }
/* 372:    */   
/* 373:    */   public void setTransactionCcy(String transactionCcy)
/* 374:    */   {
/* 375:436 */     this.transactionCcy = transactionCcy;
/* 376:    */   }
/* 377:    */   
/* 378:    */   public String getTransactionCcyType()
/* 379:    */   {
/* 380:440 */     return this.transactionCcyType;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void setTransactionCcyType(String transactionCcyType)
/* 384:    */   {
/* 385:443 */     this.transactionCcyType = transactionCcyType;
/* 386:    */   }
/* 387:    */   
/* 388:    */   public String getTransactionType()
/* 389:    */   {
/* 390:447 */     return this.transactionType;
/* 391:    */   }
/* 392:    */   
/* 393:    */   public void setTransactionType(String transactionType)
/* 394:    */   {
/* 395:450 */     this.transactionType = transactionType;
/* 396:    */   }
/* 397:    */   
/* 398:    */   public String getValueDate()
/* 399:    */   {
/* 400:454 */     return this.valueDate;
/* 401:    */   }
/* 402:    */   
/* 403:    */   public void setValueDate(String valueDate)
/* 404:    */   {
/* 405:457 */     this.valueDate = valueDate;
/* 406:    */   }
/* 407:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AdviceVO
 * JD-Core Version:    0.7.0.1
 */