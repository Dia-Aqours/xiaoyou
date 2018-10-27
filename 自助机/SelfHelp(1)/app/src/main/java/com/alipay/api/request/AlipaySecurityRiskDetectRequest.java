/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipaySecurityRiskDetectResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipaySecurityRiskDetectRequest
/*  10:    */   implements AlipayRequest<AlipaySecurityRiskDetectResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String buyerAccountNo;
/*  15:    */   private String buyerBindBankcard;
/*  16:    */   private String buyerBindBankcardType;
/*  17:    */   private String buyerBindMobile;
/*  18:    */   private String buyerGrade;
/*  19:    */   private String buyerIdentityNo;
/*  20:    */   private String buyerIdentityType;
/*  21:    */   private String buyerRealName;
/*  22:    */   private String buyerRegDate;
/*  23:    */   private String buyerRegEmail;
/*  24:    */   private String buyerRegMobile;
/*  25:    */   private String buyerSceneBankcard;
/*  26:    */   private String buyerSceneBankcardType;
/*  27:    */   private String buyerSceneEmail;
/*  28:    */   private String buyerSceneMobile;
/*  29:    */   private String currency;
/*  30:    */   private String envClientBaseBand;
/*  31:    */   private String envClientBaseStation;
/*  32:    */   private String envClientCoordinates;
/*  33:    */   private String envClientImei;
/*  34:    */   private String envClientImsi;
/*  35:    */   private String envClientIosUdid;
/*  36:    */   private String envClientIp;
/*  37:    */   private String envClientMac;
/*  38:    */   private String envClientScreen;
/*  39:    */   private String envClientUuid;
/*  40:    */   private String itemQuantity;
/*  41:    */   private String itemUnitPrice;
/*  42:    */   private String jsTokenId;
/*  43:    */   private String orderAmount;
/*  44:    */   private String orderCategory;
/*  45:    */   private String orderCredateTime;
/*  46:    */   private String orderItemCity;
/*  47:    */   private String orderItemName;
/*  48:    */   private String orderNo;
/*  49:    */   private String partnerId;
/*  50:    */   private String receiverAddress;
/*  51:    */   private String receiverCity;
/*  52:    */   private String receiverDistrict;
/*  53:    */   private String receiverEmail;
/*  54:    */   private String receiverMobile;
/*  55:    */   private String receiverName;
/*  56:    */   private String receiverState;
/*  57:    */   private String receiverZip;
/*  58:    */   private String sceneCode;
/*  59:    */   private String sellerAccountNo;
/*  60:    */   private String sellerBindBankcard;
/*  61:    */   private String sellerBindBankcardType;
/*  62:    */   private String sellerBindMobile;
/*  63:    */   private String sellerIdentityNo;
/*  64:    */   private String sellerIdentityType;
/*  65:    */   private String sellerRealName;
/*  66:    */   private String sellerRegDate;
/*  67:    */   private String sellerRegEmail;
/*  68:    */   private String sellerRegMoile;
/*  69:    */   private String transportType;
/*  70:    */   private String terminalType;
/*  71:    */   private String terminalInfo;
/*  72:    */   private String prodCode;
/*  73:    */   private String notifyUrl;
/*  74:    */   private String returnUrl;
/*  75:    */   
/*  76:    */   public void setBuyerAccountNo(String buyerAccountNo)
/*  77:    */   {
/*  78:302 */     this.buyerAccountNo = buyerAccountNo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getBuyerAccountNo()
/*  82:    */   {
/*  83:305 */     return this.buyerAccountNo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setBuyerBindBankcard(String buyerBindBankcard)
/*  87:    */   {
/*  88:309 */     this.buyerBindBankcard = buyerBindBankcard;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getBuyerBindBankcard()
/*  92:    */   {
/*  93:312 */     return this.buyerBindBankcard;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setBuyerBindBankcardType(String buyerBindBankcardType)
/*  97:    */   {
/*  98:316 */     this.buyerBindBankcardType = buyerBindBankcardType;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getBuyerBindBankcardType()
/* 102:    */   {
/* 103:319 */     return this.buyerBindBankcardType;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setBuyerBindMobile(String buyerBindMobile)
/* 107:    */   {
/* 108:323 */     this.buyerBindMobile = buyerBindMobile;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getBuyerBindMobile()
/* 112:    */   {
/* 113:326 */     return this.buyerBindMobile;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setBuyerGrade(String buyerGrade)
/* 117:    */   {
/* 118:330 */     this.buyerGrade = buyerGrade;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getBuyerGrade()
/* 122:    */   {
/* 123:333 */     return this.buyerGrade;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setBuyerIdentityNo(String buyerIdentityNo)
/* 127:    */   {
/* 128:337 */     this.buyerIdentityNo = buyerIdentityNo;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getBuyerIdentityNo()
/* 132:    */   {
/* 133:340 */     return this.buyerIdentityNo;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setBuyerIdentityType(String buyerIdentityType)
/* 137:    */   {
/* 138:344 */     this.buyerIdentityType = buyerIdentityType;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getBuyerIdentityType()
/* 142:    */   {
/* 143:347 */     return this.buyerIdentityType;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setBuyerRealName(String buyerRealName)
/* 147:    */   {
/* 148:351 */     this.buyerRealName = buyerRealName;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getBuyerRealName()
/* 152:    */   {
/* 153:354 */     return this.buyerRealName;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setBuyerRegDate(String buyerRegDate)
/* 157:    */   {
/* 158:358 */     this.buyerRegDate = buyerRegDate;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getBuyerRegDate()
/* 162:    */   {
/* 163:361 */     return this.buyerRegDate;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setBuyerRegEmail(String buyerRegEmail)
/* 167:    */   {
/* 168:365 */     this.buyerRegEmail = buyerRegEmail;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getBuyerRegEmail()
/* 172:    */   {
/* 173:368 */     return this.buyerRegEmail;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setBuyerRegMobile(String buyerRegMobile)
/* 177:    */   {
/* 178:372 */     this.buyerRegMobile = buyerRegMobile;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getBuyerRegMobile()
/* 182:    */   {
/* 183:375 */     return this.buyerRegMobile;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setBuyerSceneBankcard(String buyerSceneBankcard)
/* 187:    */   {
/* 188:379 */     this.buyerSceneBankcard = buyerSceneBankcard;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getBuyerSceneBankcard()
/* 192:    */   {
/* 193:382 */     return this.buyerSceneBankcard;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setBuyerSceneBankcardType(String buyerSceneBankcardType)
/* 197:    */   {
/* 198:386 */     this.buyerSceneBankcardType = buyerSceneBankcardType;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String getBuyerSceneBankcardType()
/* 202:    */   {
/* 203:389 */     return this.buyerSceneBankcardType;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setBuyerSceneEmail(String buyerSceneEmail)
/* 207:    */   {
/* 208:393 */     this.buyerSceneEmail = buyerSceneEmail;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getBuyerSceneEmail()
/* 212:    */   {
/* 213:396 */     return this.buyerSceneEmail;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void setBuyerSceneMobile(String buyerSceneMobile)
/* 217:    */   {
/* 218:400 */     this.buyerSceneMobile = buyerSceneMobile;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public String getBuyerSceneMobile()
/* 222:    */   {
/* 223:403 */     return this.buyerSceneMobile;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void setCurrency(String currency)
/* 227:    */   {
/* 228:407 */     this.currency = currency;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public String getCurrency()
/* 232:    */   {
/* 233:410 */     return this.currency;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public void setEnvClientBaseBand(String envClientBaseBand)
/* 237:    */   {
/* 238:414 */     this.envClientBaseBand = envClientBaseBand;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public String getEnvClientBaseBand()
/* 242:    */   {
/* 243:417 */     return this.envClientBaseBand;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void setEnvClientBaseStation(String envClientBaseStation)
/* 247:    */   {
/* 248:421 */     this.envClientBaseStation = envClientBaseStation;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public String getEnvClientBaseStation()
/* 252:    */   {
/* 253:424 */     return this.envClientBaseStation;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public void setEnvClientCoordinates(String envClientCoordinates)
/* 257:    */   {
/* 258:428 */     this.envClientCoordinates = envClientCoordinates;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public String getEnvClientCoordinates()
/* 262:    */   {
/* 263:431 */     return this.envClientCoordinates;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void setEnvClientImei(String envClientImei)
/* 267:    */   {
/* 268:435 */     this.envClientImei = envClientImei;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public String getEnvClientImei()
/* 272:    */   {
/* 273:438 */     return this.envClientImei;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public void setEnvClientImsi(String envClientImsi)
/* 277:    */   {
/* 278:442 */     this.envClientImsi = envClientImsi;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public String getEnvClientImsi()
/* 282:    */   {
/* 283:445 */     return this.envClientImsi;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public void setEnvClientIosUdid(String envClientIosUdid)
/* 287:    */   {
/* 288:449 */     this.envClientIosUdid = envClientIosUdid;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public String getEnvClientIosUdid()
/* 292:    */   {
/* 293:452 */     return this.envClientIosUdid;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public void setEnvClientIp(String envClientIp)
/* 297:    */   {
/* 298:456 */     this.envClientIp = envClientIp;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public String getEnvClientIp()
/* 302:    */   {
/* 303:459 */     return this.envClientIp;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public void setEnvClientMac(String envClientMac)
/* 307:    */   {
/* 308:463 */     this.envClientMac = envClientMac;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public String getEnvClientMac()
/* 312:    */   {
/* 313:466 */     return this.envClientMac;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public void setEnvClientScreen(String envClientScreen)
/* 317:    */   {
/* 318:470 */     this.envClientScreen = envClientScreen;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public String getEnvClientScreen()
/* 322:    */   {
/* 323:473 */     return this.envClientScreen;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void setEnvClientUuid(String envClientUuid)
/* 327:    */   {
/* 328:477 */     this.envClientUuid = envClientUuid;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public String getEnvClientUuid()
/* 332:    */   {
/* 333:480 */     return this.envClientUuid;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public void setItemQuantity(String itemQuantity)
/* 337:    */   {
/* 338:484 */     this.itemQuantity = itemQuantity;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public String getItemQuantity()
/* 342:    */   {
/* 343:487 */     return this.itemQuantity;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public void setItemUnitPrice(String itemUnitPrice)
/* 347:    */   {
/* 348:491 */     this.itemUnitPrice = itemUnitPrice;
/* 349:    */   }
/* 350:    */   
/* 351:    */   public String getItemUnitPrice()
/* 352:    */   {
/* 353:494 */     return this.itemUnitPrice;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public void setJsTokenId(String jsTokenId)
/* 357:    */   {
/* 358:498 */     this.jsTokenId = jsTokenId;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public String getJsTokenId()
/* 362:    */   {
/* 363:501 */     return this.jsTokenId;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public void setOrderAmount(String orderAmount)
/* 367:    */   {
/* 368:505 */     this.orderAmount = orderAmount;
/* 369:    */   }
/* 370:    */   
/* 371:    */   public String getOrderAmount()
/* 372:    */   {
/* 373:508 */     return this.orderAmount;
/* 374:    */   }
/* 375:    */   
/* 376:    */   public void setOrderCategory(String orderCategory)
/* 377:    */   {
/* 378:512 */     this.orderCategory = orderCategory;
/* 379:    */   }
/* 380:    */   
/* 381:    */   public String getOrderCategory()
/* 382:    */   {
/* 383:515 */     return this.orderCategory;
/* 384:    */   }
/* 385:    */   
/* 386:    */   public void setOrderCredateTime(String orderCredateTime)
/* 387:    */   {
/* 388:519 */     this.orderCredateTime = orderCredateTime;
/* 389:    */   }
/* 390:    */   
/* 391:    */   public String getOrderCredateTime()
/* 392:    */   {
/* 393:522 */     return this.orderCredateTime;
/* 394:    */   }
/* 395:    */   
/* 396:    */   public void setOrderItemCity(String orderItemCity)
/* 397:    */   {
/* 398:526 */     this.orderItemCity = orderItemCity;
/* 399:    */   }
/* 400:    */   
/* 401:    */   public String getOrderItemCity()
/* 402:    */   {
/* 403:529 */     return this.orderItemCity;
/* 404:    */   }
/* 405:    */   
/* 406:    */   public void setOrderItemName(String orderItemName)
/* 407:    */   {
/* 408:533 */     this.orderItemName = orderItemName;
/* 409:    */   }
/* 410:    */   
/* 411:    */   public String getOrderItemName()
/* 412:    */   {
/* 413:536 */     return this.orderItemName;
/* 414:    */   }
/* 415:    */   
/* 416:    */   public void setOrderNo(String orderNo)
/* 417:    */   {
/* 418:540 */     this.orderNo = orderNo;
/* 419:    */   }
/* 420:    */   
/* 421:    */   public String getOrderNo()
/* 422:    */   {
/* 423:543 */     return this.orderNo;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public void setPartnerId(String partnerId)
/* 427:    */   {
/* 428:547 */     this.partnerId = partnerId;
/* 429:    */   }
/* 430:    */   
/* 431:    */   public String getPartnerId()
/* 432:    */   {
/* 433:550 */     return this.partnerId;
/* 434:    */   }
/* 435:    */   
/* 436:    */   public void setReceiverAddress(String receiverAddress)
/* 437:    */   {
/* 438:554 */     this.receiverAddress = receiverAddress;
/* 439:    */   }
/* 440:    */   
/* 441:    */   public String getReceiverAddress()
/* 442:    */   {
/* 443:557 */     return this.receiverAddress;
/* 444:    */   }
/* 445:    */   
/* 446:    */   public void setReceiverCity(String receiverCity)
/* 447:    */   {
/* 448:561 */     this.receiverCity = receiverCity;
/* 449:    */   }
/* 450:    */   
/* 451:    */   public String getReceiverCity()
/* 452:    */   {
/* 453:564 */     return this.receiverCity;
/* 454:    */   }
/* 455:    */   
/* 456:    */   public void setReceiverDistrict(String receiverDistrict)
/* 457:    */   {
/* 458:568 */     this.receiverDistrict = receiverDistrict;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public String getReceiverDistrict()
/* 462:    */   {
/* 463:571 */     return this.receiverDistrict;
/* 464:    */   }
/* 465:    */   
/* 466:    */   public void setReceiverEmail(String receiverEmail)
/* 467:    */   {
/* 468:575 */     this.receiverEmail = receiverEmail;
/* 469:    */   }
/* 470:    */   
/* 471:    */   public String getReceiverEmail()
/* 472:    */   {
/* 473:578 */     return this.receiverEmail;
/* 474:    */   }
/* 475:    */   
/* 476:    */   public void setReceiverMobile(String receiverMobile)
/* 477:    */   {
/* 478:582 */     this.receiverMobile = receiverMobile;
/* 479:    */   }
/* 480:    */   
/* 481:    */   public String getReceiverMobile()
/* 482:    */   {
/* 483:585 */     return this.receiverMobile;
/* 484:    */   }
/* 485:    */   
/* 486:    */   public void setReceiverName(String receiverName)
/* 487:    */   {
/* 488:589 */     this.receiverName = receiverName;
/* 489:    */   }
/* 490:    */   
/* 491:    */   public String getReceiverName()
/* 492:    */   {
/* 493:592 */     return this.receiverName;
/* 494:    */   }
/* 495:    */   
/* 496:    */   public void setReceiverState(String receiverState)
/* 497:    */   {
/* 498:596 */     this.receiverState = receiverState;
/* 499:    */   }
/* 500:    */   
/* 501:    */   public String getReceiverState()
/* 502:    */   {
/* 503:599 */     return this.receiverState;
/* 504:    */   }
/* 505:    */   
/* 506:    */   public void setReceiverZip(String receiverZip)
/* 507:    */   {
/* 508:603 */     this.receiverZip = receiverZip;
/* 509:    */   }
/* 510:    */   
/* 511:    */   public String getReceiverZip()
/* 512:    */   {
/* 513:606 */     return this.receiverZip;
/* 514:    */   }
/* 515:    */   
/* 516:    */   public void setSceneCode(String sceneCode)
/* 517:    */   {
/* 518:610 */     this.sceneCode = sceneCode;
/* 519:    */   }
/* 520:    */   
/* 521:    */   public String getSceneCode()
/* 522:    */   {
/* 523:613 */     return this.sceneCode;
/* 524:    */   }
/* 525:    */   
/* 526:    */   public void setSellerAccountNo(String sellerAccountNo)
/* 527:    */   {
/* 528:617 */     this.sellerAccountNo = sellerAccountNo;
/* 529:    */   }
/* 530:    */   
/* 531:    */   public String getSellerAccountNo()
/* 532:    */   {
/* 533:620 */     return this.sellerAccountNo;
/* 534:    */   }
/* 535:    */   
/* 536:    */   public void setSellerBindBankcard(String sellerBindBankcard)
/* 537:    */   {
/* 538:624 */     this.sellerBindBankcard = sellerBindBankcard;
/* 539:    */   }
/* 540:    */   
/* 541:    */   public String getSellerBindBankcard()
/* 542:    */   {
/* 543:627 */     return this.sellerBindBankcard;
/* 544:    */   }
/* 545:    */   
/* 546:    */   public void setSellerBindBankcardType(String sellerBindBankcardType)
/* 547:    */   {
/* 548:631 */     this.sellerBindBankcardType = sellerBindBankcardType;
/* 549:    */   }
/* 550:    */   
/* 551:    */   public String getSellerBindBankcardType()
/* 552:    */   {
/* 553:634 */     return this.sellerBindBankcardType;
/* 554:    */   }
/* 555:    */   
/* 556:    */   public void setSellerBindMobile(String sellerBindMobile)
/* 557:    */   {
/* 558:638 */     this.sellerBindMobile = sellerBindMobile;
/* 559:    */   }
/* 560:    */   
/* 561:    */   public String getSellerBindMobile()
/* 562:    */   {
/* 563:641 */     return this.sellerBindMobile;
/* 564:    */   }
/* 565:    */   
/* 566:    */   public void setSellerIdentityNo(String sellerIdentityNo)
/* 567:    */   {
/* 568:645 */     this.sellerIdentityNo = sellerIdentityNo;
/* 569:    */   }
/* 570:    */   
/* 571:    */   public String getSellerIdentityNo()
/* 572:    */   {
/* 573:648 */     return this.sellerIdentityNo;
/* 574:    */   }
/* 575:    */   
/* 576:    */   public void setSellerIdentityType(String sellerIdentityType)
/* 577:    */   {
/* 578:652 */     this.sellerIdentityType = sellerIdentityType;
/* 579:    */   }
/* 580:    */   
/* 581:    */   public String getSellerIdentityType()
/* 582:    */   {
/* 583:655 */     return this.sellerIdentityType;
/* 584:    */   }
/* 585:    */   
/* 586:    */   public void setSellerRealName(String sellerRealName)
/* 587:    */   {
/* 588:659 */     this.sellerRealName = sellerRealName;
/* 589:    */   }
/* 590:    */   
/* 591:    */   public String getSellerRealName()
/* 592:    */   {
/* 593:662 */     return this.sellerRealName;
/* 594:    */   }
/* 595:    */   
/* 596:    */   public void setSellerRegDate(String sellerRegDate)
/* 597:    */   {
/* 598:666 */     this.sellerRegDate = sellerRegDate;
/* 599:    */   }
/* 600:    */   
/* 601:    */   public String getSellerRegDate()
/* 602:    */   {
/* 603:669 */     return this.sellerRegDate;
/* 604:    */   }
/* 605:    */   
/* 606:    */   public void setSellerRegEmail(String sellerRegEmail)
/* 607:    */   {
/* 608:673 */     this.sellerRegEmail = sellerRegEmail;
/* 609:    */   }
/* 610:    */   
/* 611:    */   public String getSellerRegEmail()
/* 612:    */   {
/* 613:676 */     return this.sellerRegEmail;
/* 614:    */   }
/* 615:    */   
/* 616:    */   public void setSellerRegMoile(String sellerRegMoile)
/* 617:    */   {
/* 618:680 */     this.sellerRegMoile = sellerRegMoile;
/* 619:    */   }
/* 620:    */   
/* 621:    */   public String getSellerRegMoile()
/* 622:    */   {
/* 623:683 */     return this.sellerRegMoile;
/* 624:    */   }
/* 625:    */   
/* 626:    */   public void setTransportType(String transportType)
/* 627:    */   {
/* 628:687 */     this.transportType = transportType;
/* 629:    */   }
/* 630:    */   
/* 631:    */   public String getTransportType()
/* 632:    */   {
/* 633:690 */     return this.transportType;
/* 634:    */   }
/* 635:    */   
/* 636:697 */   private boolean needEncrypt = false;
/* 637:698 */   private AlipayObject bizModel = null;
/* 638:    */   
/* 639:    */   public String getNotifyUrl()
/* 640:    */   {
/* 641:701 */     return this.notifyUrl;
/* 642:    */   }
/* 643:    */   
/* 644:    */   public void setNotifyUrl(String notifyUrl)
/* 645:    */   {
/* 646:705 */     this.notifyUrl = notifyUrl;
/* 647:    */   }
/* 648:    */   
/* 649:    */   public String getReturnUrl()
/* 650:    */   {
/* 651:709 */     return this.returnUrl;
/* 652:    */   }
/* 653:    */   
/* 654:    */   public void setReturnUrl(String returnUrl)
/* 655:    */   {
/* 656:713 */     this.returnUrl = returnUrl;
/* 657:    */   }
/* 658:    */   
/* 659:    */   public String getApiVersion()
/* 660:    */   {
/* 661:717 */     return this.apiVersion;
/* 662:    */   }
/* 663:    */   
/* 664:    */   public void setApiVersion(String apiVersion)
/* 665:    */   {
/* 666:721 */     this.apiVersion = apiVersion;
/* 667:    */   }
/* 668:    */   
/* 669:    */   public void setTerminalType(String terminalType)
/* 670:    */   {
/* 671:725 */     this.terminalType = terminalType;
/* 672:    */   }
/* 673:    */   
/* 674:    */   public String getTerminalType()
/* 675:    */   {
/* 676:729 */     return this.terminalType;
/* 677:    */   }
/* 678:    */   
/* 679:    */   public void setTerminalInfo(String terminalInfo)
/* 680:    */   {
/* 681:733 */     this.terminalInfo = terminalInfo;
/* 682:    */   }
/* 683:    */   
/* 684:    */   public String getTerminalInfo()
/* 685:    */   {
/* 686:737 */     return this.terminalInfo;
/* 687:    */   }
/* 688:    */   
/* 689:    */   public void setProdCode(String prodCode)
/* 690:    */   {
/* 691:741 */     this.prodCode = prodCode;
/* 692:    */   }
/* 693:    */   
/* 694:    */   public String getProdCode()
/* 695:    */   {
/* 696:745 */     return this.prodCode;
/* 697:    */   }
/* 698:    */   
/* 699:    */   public String getApiMethodName()
/* 700:    */   {
/* 701:749 */     return "alipay.security.risk.detect";
/* 702:    */   }
/* 703:    */   
/* 704:    */   public Map<String, String> getTextParams()
/* 705:    */   {
/* 706:753 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 707:754 */     txtParams.put("buyer_account_no", this.buyerAccountNo);
/* 708:755 */     txtParams.put("buyer_bind_bankcard", this.buyerBindBankcard);
/* 709:756 */     txtParams.put("buyer_bind_bankcard_type", this.buyerBindBankcardType);
/* 710:757 */     txtParams.put("buyer_bind_mobile", this.buyerBindMobile);
/* 711:758 */     txtParams.put("buyer_grade", this.buyerGrade);
/* 712:759 */     txtParams.put("buyer_identity_no", this.buyerIdentityNo);
/* 713:760 */     txtParams.put("buyer_identity_type", this.buyerIdentityType);
/* 714:761 */     txtParams.put("buyer_real_name", this.buyerRealName);
/* 715:762 */     txtParams.put("buyer_reg_date", this.buyerRegDate);
/* 716:763 */     txtParams.put("buyer_reg_email", this.buyerRegEmail);
/* 717:764 */     txtParams.put("buyer_reg_mobile", this.buyerRegMobile);
/* 718:765 */     txtParams.put("buyer_scene_bankcard", this.buyerSceneBankcard);
/* 719:766 */     txtParams.put("buyer_scene_bankcard_type", this.buyerSceneBankcardType);
/* 720:767 */     txtParams.put("buyer_scene_email", this.buyerSceneEmail);
/* 721:768 */     txtParams.put("buyer_scene_mobile", this.buyerSceneMobile);
/* 722:769 */     txtParams.put("currency", this.currency);
/* 723:770 */     txtParams.put("env_client_base_band", this.envClientBaseBand);
/* 724:771 */     txtParams.put("env_client_base_station", this.envClientBaseStation);
/* 725:772 */     txtParams.put("env_client_coordinates", this.envClientCoordinates);
/* 726:773 */     txtParams.put("env_client_imei", this.envClientImei);
/* 727:774 */     txtParams.put("env_client_imsi", this.envClientImsi);
/* 728:775 */     txtParams.put("env_client_ios_udid", this.envClientIosUdid);
/* 729:776 */     txtParams.put("env_client_ip", this.envClientIp);
/* 730:777 */     txtParams.put("env_client_mac", this.envClientMac);
/* 731:778 */     txtParams.put("env_client_screen", this.envClientScreen);
/* 732:779 */     txtParams.put("env_client_uuid", this.envClientUuid);
/* 733:780 */     txtParams.put("item_quantity", this.itemQuantity);
/* 734:781 */     txtParams.put("item_unit_price", this.itemUnitPrice);
/* 735:782 */     txtParams.put("js_token_id", this.jsTokenId);
/* 736:783 */     txtParams.put("order_amount", this.orderAmount);
/* 737:784 */     txtParams.put("order_category", this.orderCategory);
/* 738:785 */     txtParams.put("order_credate_time", this.orderCredateTime);
/* 739:786 */     txtParams.put("order_item_city", this.orderItemCity);
/* 740:787 */     txtParams.put("order_item_name", this.orderItemName);
/* 741:788 */     txtParams.put("order_no", this.orderNo);
/* 742:789 */     txtParams.put("partner_id", this.partnerId);
/* 743:790 */     txtParams.put("receiver_address", this.receiverAddress);
/* 744:791 */     txtParams.put("receiver_city", this.receiverCity);
/* 745:792 */     txtParams.put("receiver_district", this.receiverDistrict);
/* 746:793 */     txtParams.put("receiver_email", this.receiverEmail);
/* 747:794 */     txtParams.put("receiver_mobile", this.receiverMobile);
/* 748:795 */     txtParams.put("receiver_name", this.receiverName);
/* 749:796 */     txtParams.put("receiver_state", this.receiverState);
/* 750:797 */     txtParams.put("receiver_zip", this.receiverZip);
/* 751:798 */     txtParams.put("scene_code", this.sceneCode);
/* 752:799 */     txtParams.put("seller_account_no", this.sellerAccountNo);
/* 753:800 */     txtParams.put("seller_bind_bankcard", this.sellerBindBankcard);
/* 754:801 */     txtParams.put("seller_bind_bankcard_type", this.sellerBindBankcardType);
/* 755:802 */     txtParams.put("seller_bind_mobile", this.sellerBindMobile);
/* 756:803 */     txtParams.put("seller_identity_no", this.sellerIdentityNo);
/* 757:804 */     txtParams.put("seller_identity_type", this.sellerIdentityType);
/* 758:805 */     txtParams.put("seller_real_name", this.sellerRealName);
/* 759:806 */     txtParams.put("seller_reg_date", this.sellerRegDate);
/* 760:807 */     txtParams.put("seller_reg_email", this.sellerRegEmail);
/* 761:808 */     txtParams.put("seller_reg_moile", this.sellerRegMoile);
/* 762:809 */     txtParams.put("transport_type", this.transportType);
/* 763:810 */     if (this.udfParams != null) {
/* 764:811 */       txtParams.putAll(this.udfParams);
/* 765:    */     }
/* 766:813 */     return txtParams;
/* 767:    */   }
/* 768:    */   
/* 769:    */   public void putOtherTextParam(String key, String value)
/* 770:    */   {
/* 771:817 */     if (this.udfParams == null) {
/* 772:818 */       this.udfParams = new AlipayHashMap();
/* 773:    */     }
/* 774:820 */     this.udfParams.put(key, value);
/* 775:    */   }
/* 776:    */   
/* 777:    */   public Class<AlipaySecurityRiskDetectResponse> getResponseClass()
/* 778:    */   {
/* 779:824 */     return AlipaySecurityRiskDetectResponse.class;
/* 780:    */   }
/* 781:    */   
/* 782:    */   public boolean isNeedEncrypt()
/* 783:    */   {
/* 784:830 */     return this.needEncrypt;
/* 785:    */   }
/* 786:    */   
/* 787:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 788:    */   {
/* 789:836 */     this.needEncrypt = needEncrypt;
/* 790:    */   }
/* 791:    */   
/* 792:    */   public AlipayObject getBizModel()
/* 793:    */   {
/* 794:841 */     return this.bizModel;
/* 795:    */   }
/* 796:    */   
/* 797:    */   public void setBizModel(AlipayObject bizModel)
/* 798:    */   {
/* 799:847 */     this.bizModel = bizModel;
/* 800:    */   }
/* 801:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipaySecurityRiskDetectRequest

 * JD-Core Version:    0.7.0.1

 */