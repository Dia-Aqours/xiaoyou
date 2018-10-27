/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;

/*   6:    */
/*   7:    */ public class ExClientRateVO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1487584295752265318L;
/*  11:    */   @ApiField("agreement_id")
/*  12:    */   private String agreementId;
/*  13:    */   @ApiField("base_ccy")
/*  14:    */   private String baseCcy;
/*  15:    */   @ApiField("bid_rate")
/*  16:    */   private String bidRate;
/*  17:    */   @ApiField("client_bid_rate")
/*  18:    */   private String clientBidRate;
/*  19:    */   @ApiField("client_id")
/*  20:    */   private String clientId;
/*  21:    */   @ApiField("client_offer_rate")
/*  22:    */   private String clientOfferRate;
/*  23:    */   @ApiField("currency_pair")
/*  24:    */   private String currencyPair;
/*  25:    */   @ApiField("expiry_time")
/*  26:    */   private String expiryTime;
/*  27:    */   @ApiField("generate_date")
/*  28:    */   private String generateDate;
/*  29:    */   @ApiField("generate_time")
/*  30:    */   private Date generateTime;
/*  31:    */   @ApiField("guaranteed")
/*  32:    */   private String guaranteed;
/*  33:    */   @ApiField("maturity_date")
/*  34:    */   private String maturityDate;
/*  35:    */   @ApiField("maximum_bid_amount")
/*  36:    */   private Long maximumBidAmount;
/*  37:    */   @ApiField("maximum_offer_amount")
/*  38:    */   private Long maximumOfferAmount;
/*  39:    */   @ApiField("mid_rate")
/*  40:    */   private String midRate;
/*  41:    */   @ApiField("minimum_bid_amount")
/*  42:    */   private String minimumBidAmount;
/*  43:    */   @ApiField("minimum_offer_amount")
/*  44:    */   private String minimumOfferAmount;
/*  45:    */   @ApiField("offer_rate")
/*  46:    */   private String offerRate;
/*  47:    */   @ApiField("on_off_shore")
/*  48:    */   private String onOffShore;
/*  49:    */   @ApiField("origin_rate_inst")
/*  50:    */   private String originRateInst;
/*  51:    */   @ApiField("origin_rate_ref")
/*  52:    */   private String originRateRef;
/*  53:    */   @ApiField("period")
/*  54:    */   private String period;
/*  55:    */   @ApiField("profile_id")
/*  56:    */   private String profileId;
/*  57:    */   @ApiField("quote_ccy")
/*  58:    */   private String quoteCcy;
/*  59:    */   @ApiField("rate_ref")
/*  60:    */   private String rateRef;
/*  61:    */   @ApiField("rate_time")
/*  62:    */   private String rateTime;
/*  63:    */   @ApiField("rate_type")
/*  64:    */   private String rateType;
/*  65:    */   @ApiField("sp_bid")
/*  66:    */   private String spBid;
/*  67:    */   @ApiField("sp_mid")
/*  68:    */   private String spMid;
/*  69:    */   @ApiField("sp_offer")
/*  70:    */   private String spOffer;
/*  71:    */   @ApiField("standard_product_rate_id")
/*  72:    */   private String standardProductRateId;
/*  73:    */   @ApiField("start_time")
/*  74:    */   private String startTime;
/*  75:    */   @ApiField("sub_agreement_id")
/*  76:    */   private String subAgreementId;
/*  77:    */   @ApiField("threshold_time")
/*  78:    */   private String thresholdTime;
/*  79:    */   @ApiField("time_zone")
/*  80:    */   private String timeZone;
/*  81:    */   @ApiField("transaction_ccy_type")
/*  82:    */   private String transactionCcyType;
/*  83:    */   @ApiField("valid_time")
/*  84:    */   private String validTime;
/*  85:    */   
/*  86:    */   public String getAgreementId()
/*  87:    */   {
/*  88:241 */     return this.agreementId;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setAgreementId(String agreementId)
/*  92:    */   {
/*  93:244 */     this.agreementId = agreementId;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getBaseCcy()
/*  97:    */   {
/*  98:248 */     return this.baseCcy;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setBaseCcy(String baseCcy)
/* 102:    */   {
/* 103:251 */     this.baseCcy = baseCcy;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getBidRate()
/* 107:    */   {
/* 108:255 */     return this.bidRate;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setBidRate(String bidRate)
/* 112:    */   {
/* 113:258 */     this.bidRate = bidRate;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getClientBidRate()
/* 117:    */   {
/* 118:262 */     return this.clientBidRate;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setClientBidRate(String clientBidRate)
/* 122:    */   {
/* 123:265 */     this.clientBidRate = clientBidRate;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getClientId()
/* 127:    */   {
/* 128:269 */     return this.clientId;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setClientId(String clientId)
/* 132:    */   {
/* 133:272 */     this.clientId = clientId;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getClientOfferRate()
/* 137:    */   {
/* 138:276 */     return this.clientOfferRate;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setClientOfferRate(String clientOfferRate)
/* 142:    */   {
/* 143:279 */     this.clientOfferRate = clientOfferRate;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getCurrencyPair()
/* 147:    */   {
/* 148:283 */     return this.currencyPair;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setCurrencyPair(String currencyPair)
/* 152:    */   {
/* 153:286 */     this.currencyPair = currencyPair;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getExpiryTime()
/* 157:    */   {
/* 158:290 */     return this.expiryTime;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setExpiryTime(String expiryTime)
/* 162:    */   {
/* 163:293 */     this.expiryTime = expiryTime;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getGenerateDate()
/* 167:    */   {
/* 168:297 */     return this.generateDate;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setGenerateDate(String generateDate)
/* 172:    */   {
/* 173:300 */     this.generateDate = generateDate;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public Date getGenerateTime()
/* 177:    */   {
/* 178:304 */     return this.generateTime;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setGenerateTime(Date generateTime)
/* 182:    */   {
/* 183:307 */     this.generateTime = generateTime;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getGuaranteed()
/* 187:    */   {
/* 188:311 */     return this.guaranteed;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setGuaranteed(String guaranteed)
/* 192:    */   {
/* 193:314 */     this.guaranteed = guaranteed;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public String getMaturityDate()
/* 197:    */   {
/* 198:318 */     return this.maturityDate;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void setMaturityDate(String maturityDate)
/* 202:    */   {
/* 203:321 */     this.maturityDate = maturityDate;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public Long getMaximumBidAmount()
/* 207:    */   {
/* 208:325 */     return this.maximumBidAmount;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setMaximumBidAmount(Long maximumBidAmount)
/* 212:    */   {
/* 213:328 */     this.maximumBidAmount = maximumBidAmount;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public Long getMaximumOfferAmount()
/* 217:    */   {
/* 218:332 */     return this.maximumOfferAmount;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setMaximumOfferAmount(Long maximumOfferAmount)
/* 222:    */   {
/* 223:335 */     this.maximumOfferAmount = maximumOfferAmount;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public String getMidRate()
/* 227:    */   {
/* 228:339 */     return this.midRate;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void setMidRate(String midRate)
/* 232:    */   {
/* 233:342 */     this.midRate = midRate;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public String getMinimumBidAmount()
/* 237:    */   {
/* 238:346 */     return this.minimumBidAmount;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void setMinimumBidAmount(String minimumBidAmount)
/* 242:    */   {
/* 243:349 */     this.minimumBidAmount = minimumBidAmount;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public String getMinimumOfferAmount()
/* 247:    */   {
/* 248:353 */     return this.minimumOfferAmount;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void setMinimumOfferAmount(String minimumOfferAmount)
/* 252:    */   {
/* 253:356 */     this.minimumOfferAmount = minimumOfferAmount;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public String getOfferRate()
/* 257:    */   {
/* 258:360 */     return this.offerRate;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public void setOfferRate(String offerRate)
/* 262:    */   {
/* 263:363 */     this.offerRate = offerRate;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public String getOnOffShore()
/* 267:    */   {
/* 268:367 */     return this.onOffShore;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public void setOnOffShore(String onOffShore)
/* 272:    */   {
/* 273:370 */     this.onOffShore = onOffShore;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public String getOriginRateInst()
/* 277:    */   {
/* 278:374 */     return this.originRateInst;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public void setOriginRateInst(String originRateInst)
/* 282:    */   {
/* 283:377 */     this.originRateInst = originRateInst;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public String getOriginRateRef()
/* 287:    */   {
/* 288:381 */     return this.originRateRef;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void setOriginRateRef(String originRateRef)
/* 292:    */   {
/* 293:384 */     this.originRateRef = originRateRef;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public String getPeriod()
/* 297:    */   {
/* 298:388 */     return this.period;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public void setPeriod(String period)
/* 302:    */   {
/* 303:391 */     this.period = period;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public String getProfileId()
/* 307:    */   {
/* 308:395 */     return this.profileId;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public void setProfileId(String profileId)
/* 312:    */   {
/* 313:398 */     this.profileId = profileId;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public String getQuoteCcy()
/* 317:    */   {
/* 318:402 */     return this.quoteCcy;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public void setQuoteCcy(String quoteCcy)
/* 322:    */   {
/* 323:405 */     this.quoteCcy = quoteCcy;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public String getRateRef()
/* 327:    */   {
/* 328:409 */     return this.rateRef;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public void setRateRef(String rateRef)
/* 332:    */   {
/* 333:412 */     this.rateRef = rateRef;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public String getRateTime()
/* 337:    */   {
/* 338:416 */     return this.rateTime;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public void setRateTime(String rateTime)
/* 342:    */   {
/* 343:419 */     this.rateTime = rateTime;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public String getRateType()
/* 347:    */   {
/* 348:423 */     return this.rateType;
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void setRateType(String rateType)
/* 352:    */   {
/* 353:426 */     this.rateType = rateType;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public String getSpBid()
/* 357:    */   {
/* 358:430 */     return this.spBid;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public void setSpBid(String spBid)
/* 362:    */   {
/* 363:433 */     this.spBid = spBid;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public String getSpMid()
/* 367:    */   {
/* 368:437 */     return this.spMid;
/* 369:    */   }
/* 370:    */   
/* 371:    */   public void setSpMid(String spMid)
/* 372:    */   {
/* 373:440 */     this.spMid = spMid;
/* 374:    */   }
/* 375:    */   
/* 376:    */   public String getSpOffer()
/* 377:    */   {
/* 378:444 */     return this.spOffer;
/* 379:    */   }
/* 380:    */   
/* 381:    */   public void setSpOffer(String spOffer)
/* 382:    */   {
/* 383:447 */     this.spOffer = spOffer;
/* 384:    */   }
/* 385:    */   
/* 386:    */   public String getStandardProductRateId()
/* 387:    */   {
/* 388:451 */     return this.standardProductRateId;
/* 389:    */   }
/* 390:    */   
/* 391:    */   public void setStandardProductRateId(String standardProductRateId)
/* 392:    */   {
/* 393:454 */     this.standardProductRateId = standardProductRateId;
/* 394:    */   }
/* 395:    */   
/* 396:    */   public String getStartTime()
/* 397:    */   {
/* 398:458 */     return this.startTime;
/* 399:    */   }
/* 400:    */   
/* 401:    */   public void setStartTime(String startTime)
/* 402:    */   {
/* 403:461 */     this.startTime = startTime;
/* 404:    */   }
/* 405:    */   
/* 406:    */   public String getSubAgreementId()
/* 407:    */   {
/* 408:465 */     return this.subAgreementId;
/* 409:    */   }
/* 410:    */   
/* 411:    */   public void setSubAgreementId(String subAgreementId)
/* 412:    */   {
/* 413:468 */     this.subAgreementId = subAgreementId;
/* 414:    */   }
/* 415:    */   
/* 416:    */   public String getThresholdTime()
/* 417:    */   {
/* 418:472 */     return this.thresholdTime;
/* 419:    */   }
/* 420:    */   
/* 421:    */   public void setThresholdTime(String thresholdTime)
/* 422:    */   {
/* 423:475 */     this.thresholdTime = thresholdTime;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public String getTimeZone()
/* 427:    */   {
/* 428:479 */     return this.timeZone;
/* 429:    */   }
/* 430:    */   
/* 431:    */   public void setTimeZone(String timeZone)
/* 432:    */   {
/* 433:482 */     this.timeZone = timeZone;
/* 434:    */   }
/* 435:    */   
/* 436:    */   public String getTransactionCcyType()
/* 437:    */   {
/* 438:486 */     return this.transactionCcyType;
/* 439:    */   }
/* 440:    */   
/* 441:    */   public void setTransactionCcyType(String transactionCcyType)
/* 442:    */   {
/* 443:489 */     this.transactionCcyType = transactionCcyType;
/* 444:    */   }
/* 445:    */   
/* 446:    */   public String getValidTime()
/* 447:    */   {
/* 448:493 */     return this.validTime;
/* 449:    */   }
/* 450:    */   
/* 451:    */   public void setValidTime(String validTime)
/* 452:    */   {
/* 453:496 */     this.validTime = validTime;
/* 454:    */   }
/* 455:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ExClientRateVO

 * JD-Core Version:    0.7.0.1

 */