/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;

/*   8:    */
/*   9:    */ public class ConsumeRecordAOPModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 4131486638721765138L;
/*  13:    */   @ApiField("access_channel")
/*  14:    */   private String accessChannel;
/*  15:    */   @ApiField("additional_status")
/*  16:    */   private String additionalStatus;
/*  17:    */   @ApiListField("biz_actions")
/*  18:    */   @ApiField("string")
/*  19:    */   private List<String> bizActions;
/*  20:    */   @ApiField("biz_extra_no")
/*  21:    */   private String bizExtraNo;
/*  22:    */   @ApiField("biz_in_no")
/*  23:    */   private String bizInNo;
/*  24:    */   @ApiField("biz_memo")
/*  25:    */   private String bizMemo;
/*  26:    */   @ApiField("biz_orig")
/*  27:    */   private String bizOrig;
/*  28:    */   @ApiField("biz_out_no")
/*  29:    */   private String bizOutNo;
/*  30:    */   @ApiField("biz_state")
/*  31:    */   private String bizState;
/*  32:    */   @ApiField("biz_sub_type")
/*  33:    */   private String bizSubType;
/*  34:    */   @ApiField("biz_type")
/*  35:    */   private String bizType;
/*  36:    */   @ApiField("category_id")
/*  37:    */   private String categoryId;
/*  38:    */   @ApiField("consume_fee")
/*  39:    */   private String consumeFee;
/*  40:    */   @ApiField("consume_refund_status")
/*  41:    */   private String consumeRefundStatus;
/*  42:    */   @ApiField("consume_site")
/*  43:    */   private String consumeSite;
/*  44:    */   @ApiField("consume_status")
/*  45:    */   private String consumeStatus;
/*  46:    */   @ApiField("consume_title")
/*  47:    */   private String consumeTitle;
/*  48:    */   @ApiField("consume_type")
/*  49:    */   private String consumeType;
/*  50:    */   @ApiField("currency")
/*  51:    */   private String currency;
/*  52:    */   @ApiField("delete_over_time")
/*  53:    */   private Date deleteOverTime;
/*  54:    */   @ApiField("delete_time")
/*  55:    */   private Date deleteTime;
/*  56:    */   @ApiField("delete_type")
/*  57:    */   private String deleteType;
/*  58:    */   @ApiField("depositback_status")
/*  59:    */   private String depositbackStatus;
/*  60:    */   @ApiField("flag_locked")
/*  61:    */   private String flagLocked;
/*  62:    */   @ApiField("flag_refund")
/*  63:    */   private String flagRefund;
/*  64:    */   @ApiField("gmt_biz_create")
/*  65:    */   private Date gmtBizCreate;
/*  66:    */   @ApiField("gmt_biz_modified")
/*  67:    */   private Date gmtBizModified;
/*  68:    */   @ApiField("gmt_create")
/*  69:    */   private Date gmtCreate;
/*  70:    */   @ApiField("gmt_modified")
/*  71:    */   private Date gmtModified;
/*  72:    */   @ApiField("gmt_receive_pay")
/*  73:    */   private Date gmtReceivePay;
/*  74:    */   @ApiField("gmt_send_pay")
/*  75:    */   private Date gmtSendPay;
/*  76:    */   @ApiField("has_fund_item")
/*  77:    */   private Boolean hasFundItem;
/*  78:    */   @ApiField("has_new_fund_item")
/*  79:    */   private Boolean hasNewFundItem;
/*  80:    */   @ApiField("in_out")
/*  81:    */   private String inOut;
/*  82:    */   @ApiField("opposite_card_no")
/*  83:    */   private String oppositeCardNo;
/*  84:    */   @ApiField("opposite_login_id")
/*  85:    */   private String oppositeLoginId;
/*  86:    */   @ApiField("opposite_name")
/*  87:    */   private String oppositeName;
/*  88:    */   @ApiField("opposite_nick_name")
/*  89:    */   private String oppositeNickName;
/*  90:    */   @ApiField("orig_consume_title")
/*  91:    */   private String origConsumeTitle;
/*  92:    */   @ApiField("owner_card_no")
/*  93:    */   private String ownerCardNo;
/*  94:    */   @ApiField("owner_customer_id")
/*  95:    */   private String ownerCustomerId;
/*  96:    */   @ApiField("owner_login_id")
/*  97:    */   private String ownerLoginId;
/*  98:    */   @ApiField("owner_name")
/*  99:    */   private String ownerName;
/* 100:    */   @ApiField("owner_nick")
/* 101:    */   private String ownerNick;
/* 102:    */   @ApiField("partner_id")
/* 103:    */   private String partnerId;
/* 104:    */   @ApiField("pay_channel")
/* 105:    */   private String payChannel;
/* 106:    */   @ApiField("peerpayer_real_name")
/* 107:    */   private String peerpayerRealName;
/* 108:    */   @ApiField("product")
/* 109:    */   private String product;
/* 110:    */   @ApiField("refund_fee")
/* 111:    */   private String refundFee;
/* 112:    */   @ApiField("service_fee")
/* 113:    */   private String serviceFee;
/* 114:    */   @ApiField("total_refund_fee")
/* 115:    */   private String totalRefundFee;
/* 116:    */   @ApiField("trade_from")
/* 117:    */   private String tradeFrom;
/* 118:    */   
/* 119:    */   public String getAccessChannel()
/* 120:    */   {
/* 121:334 */     return this.accessChannel;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setAccessChannel(String accessChannel)
/* 125:    */   {
/* 126:337 */     this.accessChannel = accessChannel;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getAdditionalStatus()
/* 130:    */   {
/* 131:341 */     return this.additionalStatus;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setAdditionalStatus(String additionalStatus)
/* 135:    */   {
/* 136:344 */     this.additionalStatus = additionalStatus;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public List<String> getBizActions()
/* 140:    */   {
/* 141:348 */     return this.bizActions;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setBizActions(List<String> bizActions)
/* 145:    */   {
/* 146:351 */     this.bizActions = bizActions;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getBizExtraNo()
/* 150:    */   {
/* 151:355 */     return this.bizExtraNo;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setBizExtraNo(String bizExtraNo)
/* 155:    */   {
/* 156:358 */     this.bizExtraNo = bizExtraNo;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getBizInNo()
/* 160:    */   {
/* 161:362 */     return this.bizInNo;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setBizInNo(String bizInNo)
/* 165:    */   {
/* 166:365 */     this.bizInNo = bizInNo;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getBizMemo()
/* 170:    */   {
/* 171:369 */     return this.bizMemo;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setBizMemo(String bizMemo)
/* 175:    */   {
/* 176:372 */     this.bizMemo = bizMemo;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public String getBizOrig()
/* 180:    */   {
/* 181:376 */     return this.bizOrig;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setBizOrig(String bizOrig)
/* 185:    */   {
/* 186:379 */     this.bizOrig = bizOrig;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public String getBizOutNo()
/* 190:    */   {
/* 191:383 */     return this.bizOutNo;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void setBizOutNo(String bizOutNo)
/* 195:    */   {
/* 196:386 */     this.bizOutNo = bizOutNo;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public String getBizState()
/* 200:    */   {
/* 201:390 */     return this.bizState;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setBizState(String bizState)
/* 205:    */   {
/* 206:393 */     this.bizState = bizState;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public String getBizSubType()
/* 210:    */   {
/* 211:397 */     return this.bizSubType;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setBizSubType(String bizSubType)
/* 215:    */   {
/* 216:400 */     this.bizSubType = bizSubType;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public String getBizType()
/* 220:    */   {
/* 221:404 */     return this.bizType;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setBizType(String bizType)
/* 225:    */   {
/* 226:407 */     this.bizType = bizType;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public String getCategoryId()
/* 230:    */   {
/* 231:411 */     return this.categoryId;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public void setCategoryId(String categoryId)
/* 235:    */   {
/* 236:414 */     this.categoryId = categoryId;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public String getConsumeFee()
/* 240:    */   {
/* 241:418 */     return this.consumeFee;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public void setConsumeFee(String consumeFee)
/* 245:    */   {
/* 246:421 */     this.consumeFee = consumeFee;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public String getConsumeRefundStatus()
/* 250:    */   {
/* 251:425 */     return this.consumeRefundStatus;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public void setConsumeRefundStatus(String consumeRefundStatus)
/* 255:    */   {
/* 256:428 */     this.consumeRefundStatus = consumeRefundStatus;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public String getConsumeSite()
/* 260:    */   {
/* 261:432 */     return this.consumeSite;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public void setConsumeSite(String consumeSite)
/* 265:    */   {
/* 266:435 */     this.consumeSite = consumeSite;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public String getConsumeStatus()
/* 270:    */   {
/* 271:439 */     return this.consumeStatus;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public void setConsumeStatus(String consumeStatus)
/* 275:    */   {
/* 276:442 */     this.consumeStatus = consumeStatus;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public String getConsumeTitle()
/* 280:    */   {
/* 281:446 */     return this.consumeTitle;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public void setConsumeTitle(String consumeTitle)
/* 285:    */   {
/* 286:449 */     this.consumeTitle = consumeTitle;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public String getConsumeType()
/* 290:    */   {
/* 291:453 */     return this.consumeType;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void setConsumeType(String consumeType)
/* 295:    */   {
/* 296:456 */     this.consumeType = consumeType;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public String getCurrency()
/* 300:    */   {
/* 301:460 */     return this.currency;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void setCurrency(String currency)
/* 305:    */   {
/* 306:463 */     this.currency = currency;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public Date getDeleteOverTime()
/* 310:    */   {
/* 311:467 */     return this.deleteOverTime;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public void setDeleteOverTime(Date deleteOverTime)
/* 315:    */   {
/* 316:470 */     this.deleteOverTime = deleteOverTime;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public Date getDeleteTime()
/* 320:    */   {
/* 321:474 */     return this.deleteTime;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public void setDeleteTime(Date deleteTime)
/* 325:    */   {
/* 326:477 */     this.deleteTime = deleteTime;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public String getDeleteType()
/* 330:    */   {
/* 331:481 */     return this.deleteType;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public void setDeleteType(String deleteType)
/* 335:    */   {
/* 336:484 */     this.deleteType = deleteType;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public String getDepositbackStatus()
/* 340:    */   {
/* 341:488 */     return this.depositbackStatus;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public void setDepositbackStatus(String depositbackStatus)
/* 345:    */   {
/* 346:491 */     this.depositbackStatus = depositbackStatus;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public String getFlagLocked()
/* 350:    */   {
/* 351:495 */     return this.flagLocked;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public void setFlagLocked(String flagLocked)
/* 355:    */   {
/* 356:498 */     this.flagLocked = flagLocked;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public String getFlagRefund()
/* 360:    */   {
/* 361:502 */     return this.flagRefund;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public void setFlagRefund(String flagRefund)
/* 365:    */   {
/* 366:505 */     this.flagRefund = flagRefund;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public Date getGmtBizCreate()
/* 370:    */   {
/* 371:509 */     return this.gmtBizCreate;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public void setGmtBizCreate(Date gmtBizCreate)
/* 375:    */   {
/* 376:512 */     this.gmtBizCreate = gmtBizCreate;
/* 377:    */   }
/* 378:    */   
/* 379:    */   public Date getGmtBizModified()
/* 380:    */   {
/* 381:516 */     return this.gmtBizModified;
/* 382:    */   }
/* 383:    */   
/* 384:    */   public void setGmtBizModified(Date gmtBizModified)
/* 385:    */   {
/* 386:519 */     this.gmtBizModified = gmtBizModified;
/* 387:    */   }
/* 388:    */   
/* 389:    */   public Date getGmtCreate()
/* 390:    */   {
/* 391:523 */     return this.gmtCreate;
/* 392:    */   }
/* 393:    */   
/* 394:    */   public void setGmtCreate(Date gmtCreate)
/* 395:    */   {
/* 396:526 */     this.gmtCreate = gmtCreate;
/* 397:    */   }
/* 398:    */   
/* 399:    */   public Date getGmtModified()
/* 400:    */   {
/* 401:530 */     return this.gmtModified;
/* 402:    */   }
/* 403:    */   
/* 404:    */   public void setGmtModified(Date gmtModified)
/* 405:    */   {
/* 406:533 */     this.gmtModified = gmtModified;
/* 407:    */   }
/* 408:    */   
/* 409:    */   public Date getGmtReceivePay()
/* 410:    */   {
/* 411:537 */     return this.gmtReceivePay;
/* 412:    */   }
/* 413:    */   
/* 414:    */   public void setGmtReceivePay(Date gmtReceivePay)
/* 415:    */   {
/* 416:540 */     this.gmtReceivePay = gmtReceivePay;
/* 417:    */   }
/* 418:    */   
/* 419:    */   public Date getGmtSendPay()
/* 420:    */   {
/* 421:544 */     return this.gmtSendPay;
/* 422:    */   }
/* 423:    */   
/* 424:    */   public void setGmtSendPay(Date gmtSendPay)
/* 425:    */   {
/* 426:547 */     this.gmtSendPay = gmtSendPay;
/* 427:    */   }
/* 428:    */   
/* 429:    */   public Boolean getHasFundItem()
/* 430:    */   {
/* 431:551 */     return this.hasFundItem;
/* 432:    */   }
/* 433:    */   
/* 434:    */   public void setHasFundItem(Boolean hasFundItem)
/* 435:    */   {
/* 436:554 */     this.hasFundItem = hasFundItem;
/* 437:    */   }
/* 438:    */   
/* 439:    */   public Boolean getHasNewFundItem()
/* 440:    */   {
/* 441:558 */     return this.hasNewFundItem;
/* 442:    */   }
/* 443:    */   
/* 444:    */   public void setHasNewFundItem(Boolean hasNewFundItem)
/* 445:    */   {
/* 446:561 */     this.hasNewFundItem = hasNewFundItem;
/* 447:    */   }
/* 448:    */   
/* 449:    */   public String getInOut()
/* 450:    */   {
/* 451:565 */     return this.inOut;
/* 452:    */   }
/* 453:    */   
/* 454:    */   public void setInOut(String inOut)
/* 455:    */   {
/* 456:568 */     this.inOut = inOut;
/* 457:    */   }
/* 458:    */   
/* 459:    */   public String getOppositeCardNo()
/* 460:    */   {
/* 461:572 */     return this.oppositeCardNo;
/* 462:    */   }
/* 463:    */   
/* 464:    */   public void setOppositeCardNo(String oppositeCardNo)
/* 465:    */   {
/* 466:575 */     this.oppositeCardNo = oppositeCardNo;
/* 467:    */   }
/* 468:    */   
/* 469:    */   public String getOppositeLoginId()
/* 470:    */   {
/* 471:579 */     return this.oppositeLoginId;
/* 472:    */   }
/* 473:    */   
/* 474:    */   public void setOppositeLoginId(String oppositeLoginId)
/* 475:    */   {
/* 476:582 */     this.oppositeLoginId = oppositeLoginId;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public String getOppositeName()
/* 480:    */   {
/* 481:586 */     return this.oppositeName;
/* 482:    */   }
/* 483:    */   
/* 484:    */   public void setOppositeName(String oppositeName)
/* 485:    */   {
/* 486:589 */     this.oppositeName = oppositeName;
/* 487:    */   }
/* 488:    */   
/* 489:    */   public String getOppositeNickName()
/* 490:    */   {
/* 491:593 */     return this.oppositeNickName;
/* 492:    */   }
/* 493:    */   
/* 494:    */   public void setOppositeNickName(String oppositeNickName)
/* 495:    */   {
/* 496:596 */     this.oppositeNickName = oppositeNickName;
/* 497:    */   }
/* 498:    */   
/* 499:    */   public String getOrigConsumeTitle()
/* 500:    */   {
/* 501:600 */     return this.origConsumeTitle;
/* 502:    */   }
/* 503:    */   
/* 504:    */   public void setOrigConsumeTitle(String origConsumeTitle)
/* 505:    */   {
/* 506:603 */     this.origConsumeTitle = origConsumeTitle;
/* 507:    */   }
/* 508:    */   
/* 509:    */   public String getOwnerCardNo()
/* 510:    */   {
/* 511:607 */     return this.ownerCardNo;
/* 512:    */   }
/* 513:    */   
/* 514:    */   public void setOwnerCardNo(String ownerCardNo)
/* 515:    */   {
/* 516:610 */     this.ownerCardNo = ownerCardNo;
/* 517:    */   }
/* 518:    */   
/* 519:    */   public String getOwnerCustomerId()
/* 520:    */   {
/* 521:614 */     return this.ownerCustomerId;
/* 522:    */   }
/* 523:    */   
/* 524:    */   public void setOwnerCustomerId(String ownerCustomerId)
/* 525:    */   {
/* 526:617 */     this.ownerCustomerId = ownerCustomerId;
/* 527:    */   }
/* 528:    */   
/* 529:    */   public String getOwnerLoginId()
/* 530:    */   {
/* 531:621 */     return this.ownerLoginId;
/* 532:    */   }
/* 533:    */   
/* 534:    */   public void setOwnerLoginId(String ownerLoginId)
/* 535:    */   {
/* 536:624 */     this.ownerLoginId = ownerLoginId;
/* 537:    */   }
/* 538:    */   
/* 539:    */   public String getOwnerName()
/* 540:    */   {
/* 541:628 */     return this.ownerName;
/* 542:    */   }
/* 543:    */   
/* 544:    */   public void setOwnerName(String ownerName)
/* 545:    */   {
/* 546:631 */     this.ownerName = ownerName;
/* 547:    */   }
/* 548:    */   
/* 549:    */   public String getOwnerNick()
/* 550:    */   {
/* 551:635 */     return this.ownerNick;
/* 552:    */   }
/* 553:    */   
/* 554:    */   public void setOwnerNick(String ownerNick)
/* 555:    */   {
/* 556:638 */     this.ownerNick = ownerNick;
/* 557:    */   }
/* 558:    */   
/* 559:    */   public String getPartnerId()
/* 560:    */   {
/* 561:642 */     return this.partnerId;
/* 562:    */   }
/* 563:    */   
/* 564:    */   public void setPartnerId(String partnerId)
/* 565:    */   {
/* 566:645 */     this.partnerId = partnerId;
/* 567:    */   }
/* 568:    */   
/* 569:    */   public String getPayChannel()
/* 570:    */   {
/* 571:649 */     return this.payChannel;
/* 572:    */   }
/* 573:    */   
/* 574:    */   public void setPayChannel(String payChannel)
/* 575:    */   {
/* 576:652 */     this.payChannel = payChannel;
/* 577:    */   }
/* 578:    */   
/* 579:    */   public String getPeerpayerRealName()
/* 580:    */   {
/* 581:656 */     return this.peerpayerRealName;
/* 582:    */   }
/* 583:    */   
/* 584:    */   public void setPeerpayerRealName(String peerpayerRealName)
/* 585:    */   {
/* 586:659 */     this.peerpayerRealName = peerpayerRealName;
/* 587:    */   }
/* 588:    */   
/* 589:    */   public String getProduct()
/* 590:    */   {
/* 591:663 */     return this.product;
/* 592:    */   }
/* 593:    */   
/* 594:    */   public void setProduct(String product)
/* 595:    */   {
/* 596:666 */     this.product = product;
/* 597:    */   }
/* 598:    */   
/* 599:    */   public String getRefundFee()
/* 600:    */   {
/* 601:670 */     return this.refundFee;
/* 602:    */   }
/* 603:    */   
/* 604:    */   public void setRefundFee(String refundFee)
/* 605:    */   {
/* 606:673 */     this.refundFee = refundFee;
/* 607:    */   }
/* 608:    */   
/* 609:    */   public String getServiceFee()
/* 610:    */   {
/* 611:677 */     return this.serviceFee;
/* 612:    */   }
/* 613:    */   
/* 614:    */   public void setServiceFee(String serviceFee)
/* 615:    */   {
/* 616:680 */     this.serviceFee = serviceFee;
/* 617:    */   }
/* 618:    */   
/* 619:    */   public String getTotalRefundFee()
/* 620:    */   {
/* 621:684 */     return this.totalRefundFee;
/* 622:    */   }
/* 623:    */   
/* 624:    */   public void setTotalRefundFee(String totalRefundFee)
/* 625:    */   {
/* 626:687 */     this.totalRefundFee = totalRefundFee;
/* 627:    */   }
/* 628:    */   
/* 629:    */   public String getTradeFrom()
/* 630:    */   {
/* 631:691 */     return this.tradeFrom;
/* 632:    */   }
/* 633:    */   
/* 634:    */   public void setTradeFrom(String tradeFrom)
/* 635:    */   {
/* 636:694 */     this.tradeFrom = tradeFrom;
/* 637:    */   }
/* 638:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.ConsumeRecordAOPModel

 * JD-Core Version:    0.7.0.1

 */