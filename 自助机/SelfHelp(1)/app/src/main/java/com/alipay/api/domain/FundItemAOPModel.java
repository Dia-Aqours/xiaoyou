/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class FundItemAOPModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4662784838228884628L;
/*  11:    */   @ApiField("acctrans_out_biz_no")
/*  12:    */   private String acctransOutBizNo;
/*  13:    */   @ApiField("amount")
/*  14:    */   private String amount;
/*  15:    */   @ApiField("assert_type_code")
/*  16:    */   private String assertTypeCode;
/*  17:    */   @ApiField("bank_card_pay_type")
/*  18:    */   private String bankCardPayType;
/*  19:    */   @ApiField("bank_card_type")
/*  20:    */   private String bankCardType;
/*  21:    */   @ApiField("biz_id")
/*  22:    */   private String bizId;
/*  23:    */   @ApiField("biz_in_no")
/*  24:    */   private String bizInNo;
/*  25:    */   @ApiField("biz_out_no")
/*  26:    */   private String bizOutNo;
/*  27:    */   @ApiField("biz_type")
/*  28:    */   private String bizType;
/*  29:    */   @ApiField("currency")
/*  30:    */   private String currency;
/*  31:    */   @ApiField("dback_amount")
/*  32:    */   private String dbackAmount;
/*  33:    */   @ApiField("dback_gmt_create")
/*  34:    */   private Date dbackGmtCreate;
/*  35:    */   @ApiField("dback_gmt_est_bk_ack")
/*  36:    */   private Date dbackGmtEstBkAck;
/*  37:    */   @ApiField("dback_gmt_est_bk_into")
/*  38:    */   private Date dbackGmtEstBkInto;
/*  39:    */   @ApiField("dback_inst_account_name")
/*  40:    */   private String dbackInstAccountName;
/*  41:    */   @ApiField("dback_inst_account_no")
/*  42:    */   private String dbackInstAccountNo;
/*  43:    */   @ApiField("dback_inst_id")
/*  44:    */   private String dbackInstId;
/*  45:    */   @ApiField("dback_inst_name")
/*  46:    */   private String dbackInstName;
/*  47:    */   @ApiField("fid")
/*  48:    */   private String fid;
/*  49:    */   @ApiField("fund_access_type")
/*  50:    */   private Long fundAccessType;
/*  51:    */   @ApiField("fund_account_no")
/*  52:    */   private String fundAccountNo;
/*  53:    */   @ApiField("fund_biz_type")
/*  54:    */   private Long fundBizType;
/*  55:    */   @ApiField("fund_create_time")
/*  56:    */   private Date fundCreateTime;
/*  57:    */   @ApiField("fund_finish_time")
/*  58:    */   private Date fundFinishTime;
/*  59:    */   @ApiField("fund_in_out")
/*  60:    */   private Long fundInOut;
/*  61:    */   @ApiField("fund_inst_id")
/*  62:    */   private String fundInstId;
/*  63:    */   @ApiField("fund_modify_time")
/*  64:    */   private Date fundModifyTime;
/*  65:    */   @ApiField("fund_status")
/*  66:    */   private String fundStatus;
/*  67:    */   @ApiField("fund_tool_belong_to_crowner")
/*  68:    */   private Boolean fundToolBelongToCrowner;
/*  69:    */   @ApiField("fund_tool_owner_card_no")
/*  70:    */   private String fundToolOwnerCardNo;
/*  71:    */   @ApiField("fund_tool_type_for_crowner")
/*  72:    */   private String fundToolTypeForCrowner;
/*  73:    */   @ApiField("fund_tool_type_for_system")
/*  74:    */   private String fundToolTypeForSystem;
/*  75:    */   @ApiField("fund_tool_type_name")
/*  76:    */   private String fundToolTypeName;
/*  77:    */   @ApiField("gmt_biz_create")
/*  78:    */   private Date gmtBizCreate;
/*  79:    */   @ApiField("opposite_biz_card_alias")
/*  80:    */   private String oppositeBizCardAlias;
/*  81:    */   @ApiField("opposite_biz_card_no")
/*  82:    */   private String oppositeBizCardNo;
/*  83:    */   @ApiField("opposite_fund_card_no")
/*  84:    */   private String oppositeFundCardNo;
/*  85:    */   @ApiField("out_request_no")
/*  86:    */   private String outRequestNo;
/*  87:    */   @ApiField("owner_card_no")
/*  88:    */   private String ownerCardNo;
/*  89:    */   @ApiField("refund_bank_status")
/*  90:    */   private String refundBankStatus;
/*  91:    */   @ApiField("sub_prepaid_card_type")
/*  92:    */   private String subPrepaidCardType;
/*  93:    */   @ApiField("uid")
/*  94:    */   private String uid;
/*  95:    */   
/*  96:    */   public String getAcctransOutBizNo()
/*  97:    */   {
/*  98:271 */     return this.acctransOutBizNo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setAcctransOutBizNo(String acctransOutBizNo)
/* 102:    */   {
/* 103:274 */     this.acctransOutBizNo = acctransOutBizNo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getAmount()
/* 107:    */   {
/* 108:278 */     return this.amount;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setAmount(String amount)
/* 112:    */   {
/* 113:281 */     this.amount = amount;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getAssertTypeCode()
/* 117:    */   {
/* 118:285 */     return this.assertTypeCode;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setAssertTypeCode(String assertTypeCode)
/* 122:    */   {
/* 123:288 */     this.assertTypeCode = assertTypeCode;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getBankCardPayType()
/* 127:    */   {
/* 128:292 */     return this.bankCardPayType;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setBankCardPayType(String bankCardPayType)
/* 132:    */   {
/* 133:295 */     this.bankCardPayType = bankCardPayType;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getBankCardType()
/* 137:    */   {
/* 138:299 */     return this.bankCardType;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setBankCardType(String bankCardType)
/* 142:    */   {
/* 143:302 */     this.bankCardType = bankCardType;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getBizId()
/* 147:    */   {
/* 148:306 */     return this.bizId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setBizId(String bizId)
/* 152:    */   {
/* 153:309 */     this.bizId = bizId;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getBizInNo()
/* 157:    */   {
/* 158:313 */     return this.bizInNo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setBizInNo(String bizInNo)
/* 162:    */   {
/* 163:316 */     this.bizInNo = bizInNo;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getBizOutNo()
/* 167:    */   {
/* 168:320 */     return this.bizOutNo;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setBizOutNo(String bizOutNo)
/* 172:    */   {
/* 173:323 */     this.bizOutNo = bizOutNo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getBizType()
/* 177:    */   {
/* 178:327 */     return this.bizType;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setBizType(String bizType)
/* 182:    */   {
/* 183:330 */     this.bizType = bizType;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getCurrency()
/* 187:    */   {
/* 188:334 */     return this.currency;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setCurrency(String currency)
/* 192:    */   {
/* 193:337 */     this.currency = currency;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public String getDbackAmount()
/* 197:    */   {
/* 198:341 */     return this.dbackAmount;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void setDbackAmount(String dbackAmount)
/* 202:    */   {
/* 203:344 */     this.dbackAmount = dbackAmount;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public Date getDbackGmtCreate()
/* 207:    */   {
/* 208:348 */     return this.dbackGmtCreate;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setDbackGmtCreate(Date dbackGmtCreate)
/* 212:    */   {
/* 213:351 */     this.dbackGmtCreate = dbackGmtCreate;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public Date getDbackGmtEstBkAck()
/* 217:    */   {
/* 218:355 */     return this.dbackGmtEstBkAck;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setDbackGmtEstBkAck(Date dbackGmtEstBkAck)
/* 222:    */   {
/* 223:358 */     this.dbackGmtEstBkAck = dbackGmtEstBkAck;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public Date getDbackGmtEstBkInto()
/* 227:    */   {
/* 228:362 */     return this.dbackGmtEstBkInto;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void setDbackGmtEstBkInto(Date dbackGmtEstBkInto)
/* 232:    */   {
/* 233:365 */     this.dbackGmtEstBkInto = dbackGmtEstBkInto;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public String getDbackInstAccountName()
/* 237:    */   {
/* 238:369 */     return this.dbackInstAccountName;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void setDbackInstAccountName(String dbackInstAccountName)
/* 242:    */   {
/* 243:372 */     this.dbackInstAccountName = dbackInstAccountName;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public String getDbackInstAccountNo()
/* 247:    */   {
/* 248:376 */     return this.dbackInstAccountNo;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void setDbackInstAccountNo(String dbackInstAccountNo)
/* 252:    */   {
/* 253:379 */     this.dbackInstAccountNo = dbackInstAccountNo;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public String getDbackInstId()
/* 257:    */   {
/* 258:383 */     return this.dbackInstId;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public void setDbackInstId(String dbackInstId)
/* 262:    */   {
/* 263:386 */     this.dbackInstId = dbackInstId;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public String getDbackInstName()
/* 267:    */   {
/* 268:390 */     return this.dbackInstName;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public void setDbackInstName(String dbackInstName)
/* 272:    */   {
/* 273:393 */     this.dbackInstName = dbackInstName;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public String getFid()
/* 277:    */   {
/* 278:397 */     return this.fid;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public void setFid(String fid)
/* 282:    */   {
/* 283:400 */     this.fid = fid;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public Long getFundAccessType()
/* 287:    */   {
/* 288:404 */     return this.fundAccessType;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void setFundAccessType(Long fundAccessType)
/* 292:    */   {
/* 293:407 */     this.fundAccessType = fundAccessType;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public String getFundAccountNo()
/* 297:    */   {
/* 298:411 */     return this.fundAccountNo;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public void setFundAccountNo(String fundAccountNo)
/* 302:    */   {
/* 303:414 */     this.fundAccountNo = fundAccountNo;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public Long getFundBizType()
/* 307:    */   {
/* 308:418 */     return this.fundBizType;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public void setFundBizType(Long fundBizType)
/* 312:    */   {
/* 313:421 */     this.fundBizType = fundBizType;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public Date getFundCreateTime()
/* 317:    */   {
/* 318:425 */     return this.fundCreateTime;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public void setFundCreateTime(Date fundCreateTime)
/* 322:    */   {
/* 323:428 */     this.fundCreateTime = fundCreateTime;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public Date getFundFinishTime()
/* 327:    */   {
/* 328:432 */     return this.fundFinishTime;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public void setFundFinishTime(Date fundFinishTime)
/* 332:    */   {
/* 333:435 */     this.fundFinishTime = fundFinishTime;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public Long getFundInOut()
/* 337:    */   {
/* 338:439 */     return this.fundInOut;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public void setFundInOut(Long fundInOut)
/* 342:    */   {
/* 343:442 */     this.fundInOut = fundInOut;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public String getFundInstId()
/* 347:    */   {
/* 348:446 */     return this.fundInstId;
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void setFundInstId(String fundInstId)
/* 352:    */   {
/* 353:449 */     this.fundInstId = fundInstId;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public Date getFundModifyTime()
/* 357:    */   {
/* 358:453 */     return this.fundModifyTime;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public void setFundModifyTime(Date fundModifyTime)
/* 362:    */   {
/* 363:456 */     this.fundModifyTime = fundModifyTime;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public String getFundStatus()
/* 367:    */   {
/* 368:460 */     return this.fundStatus;
/* 369:    */   }
/* 370:    */   
/* 371:    */   public void setFundStatus(String fundStatus)
/* 372:    */   {
/* 373:463 */     this.fundStatus = fundStatus;
/* 374:    */   }
/* 375:    */   
/* 376:    */   public Boolean getFundToolBelongToCrowner()
/* 377:    */   {
/* 378:467 */     return this.fundToolBelongToCrowner;
/* 379:    */   }
/* 380:    */   
/* 381:    */   public void setFundToolBelongToCrowner(Boolean fundToolBelongToCrowner)
/* 382:    */   {
/* 383:470 */     this.fundToolBelongToCrowner = fundToolBelongToCrowner;
/* 384:    */   }
/* 385:    */   
/* 386:    */   public String getFundToolOwnerCardNo()
/* 387:    */   {
/* 388:474 */     return this.fundToolOwnerCardNo;
/* 389:    */   }
/* 390:    */   
/* 391:    */   public void setFundToolOwnerCardNo(String fundToolOwnerCardNo)
/* 392:    */   {
/* 393:477 */     this.fundToolOwnerCardNo = fundToolOwnerCardNo;
/* 394:    */   }
/* 395:    */   
/* 396:    */   public String getFundToolTypeForCrowner()
/* 397:    */   {
/* 398:481 */     return this.fundToolTypeForCrowner;
/* 399:    */   }
/* 400:    */   
/* 401:    */   public void setFundToolTypeForCrowner(String fundToolTypeForCrowner)
/* 402:    */   {
/* 403:484 */     this.fundToolTypeForCrowner = fundToolTypeForCrowner;
/* 404:    */   }
/* 405:    */   
/* 406:    */   public String getFundToolTypeForSystem()
/* 407:    */   {
/* 408:488 */     return this.fundToolTypeForSystem;
/* 409:    */   }
/* 410:    */   
/* 411:    */   public void setFundToolTypeForSystem(String fundToolTypeForSystem)
/* 412:    */   {
/* 413:491 */     this.fundToolTypeForSystem = fundToolTypeForSystem;
/* 414:    */   }
/* 415:    */   
/* 416:    */   public String getFundToolTypeName()
/* 417:    */   {
/* 418:495 */     return this.fundToolTypeName;
/* 419:    */   }
/* 420:    */   
/* 421:    */   public void setFundToolTypeName(String fundToolTypeName)
/* 422:    */   {
/* 423:498 */     this.fundToolTypeName = fundToolTypeName;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public Date getGmtBizCreate()
/* 427:    */   {
/* 428:502 */     return this.gmtBizCreate;
/* 429:    */   }
/* 430:    */   
/* 431:    */   public void setGmtBizCreate(Date gmtBizCreate)
/* 432:    */   {
/* 433:505 */     this.gmtBizCreate = gmtBizCreate;
/* 434:    */   }
/* 435:    */   
/* 436:    */   public String getOppositeBizCardAlias()
/* 437:    */   {
/* 438:509 */     return this.oppositeBizCardAlias;
/* 439:    */   }
/* 440:    */   
/* 441:    */   public void setOppositeBizCardAlias(String oppositeBizCardAlias)
/* 442:    */   {
/* 443:512 */     this.oppositeBizCardAlias = oppositeBizCardAlias;
/* 444:    */   }
/* 445:    */   
/* 446:    */   public String getOppositeBizCardNo()
/* 447:    */   {
/* 448:516 */     return this.oppositeBizCardNo;
/* 449:    */   }
/* 450:    */   
/* 451:    */   public void setOppositeBizCardNo(String oppositeBizCardNo)
/* 452:    */   {
/* 453:519 */     this.oppositeBizCardNo = oppositeBizCardNo;
/* 454:    */   }
/* 455:    */   
/* 456:    */   public String getOppositeFundCardNo()
/* 457:    */   {
/* 458:523 */     return this.oppositeFundCardNo;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public void setOppositeFundCardNo(String oppositeFundCardNo)
/* 462:    */   {
/* 463:526 */     this.oppositeFundCardNo = oppositeFundCardNo;
/* 464:    */   }
/* 465:    */   
/* 466:    */   public String getOutRequestNo()
/* 467:    */   {
/* 468:530 */     return this.outRequestNo;
/* 469:    */   }
/* 470:    */   
/* 471:    */   public void setOutRequestNo(String outRequestNo)
/* 472:    */   {
/* 473:533 */     this.outRequestNo = outRequestNo;
/* 474:    */   }
/* 475:    */   
/* 476:    */   public String getOwnerCardNo()
/* 477:    */   {
/* 478:537 */     return this.ownerCardNo;
/* 479:    */   }
/* 480:    */   
/* 481:    */   public void setOwnerCardNo(String ownerCardNo)
/* 482:    */   {
/* 483:540 */     this.ownerCardNo = ownerCardNo;
/* 484:    */   }
/* 485:    */   
/* 486:    */   public String getRefundBankStatus()
/* 487:    */   {
/* 488:544 */     return this.refundBankStatus;
/* 489:    */   }
/* 490:    */   
/* 491:    */   public void setRefundBankStatus(String refundBankStatus)
/* 492:    */   {
/* 493:547 */     this.refundBankStatus = refundBankStatus;
/* 494:    */   }
/* 495:    */   
/* 496:    */   public String getSubPrepaidCardType()
/* 497:    */   {
/* 498:551 */     return this.subPrepaidCardType;
/* 499:    */   }
/* 500:    */   
/* 501:    */   public void setSubPrepaidCardType(String subPrepaidCardType)
/* 502:    */   {
/* 503:554 */     this.subPrepaidCardType = subPrepaidCardType;
/* 504:    */   }
/* 505:    */   
/* 506:    */   public String getUid()
/* 507:    */   {
/* 508:558 */     return this.uid;
/* 509:    */   }
/* 510:    */   
/* 511:    */   public void setUid(String uid)
/* 512:    */   {
/* 513:561 */     this.uid = uid;
/* 514:    */   }
/* 515:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.FundItemAOPModel
 * JD-Core Version:    0.7.0.1
 */