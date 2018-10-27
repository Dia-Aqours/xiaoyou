/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketShopQuerydetailResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6488521667531697373L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("audit_desc")
/*  13:    */   private String auditDesc;
/*  14:    */   @ApiField("audit_images")
/*  15:    */   private String auditImages;
/*  16:    */   @ApiField("audit_status")
/*  17:    */   private String auditStatus;
/*  18:    */   @ApiField("auth_letter")
/*  19:    */   private String authLetter;
/*  20:    */   @ApiField("avg_price")
/*  21:    */   private String avgPrice;
/*  22:    */   @ApiField("box")
/*  23:    */   private String box;
/*  24:    */   @ApiField("branch_shop_name")
/*  25:    */   private String branchShopName;
/*  26:    */   @ApiField("brand_logo")
/*  27:    */   private String brandLogo;
/*  28:    */   @ApiField("brand_name")
/*  29:    */   private String brandName;
/*  30:    */   @ApiField("business_certificate")
/*  31:    */   private String businessCertificate;
/*  32:    */   @ApiField("business_certificate_expires")
/*  33:    */   private String businessCertificateExpires;
/*  34:    */   @ApiField("business_time")
/*  35:    */   private String businessTime;
/*  36:    */   @ApiField("category_id")
/*  37:    */   private String categoryId;
/*  38:    */   @ApiField("city_code")
/*  39:    */   private String cityCode;
/*  40:    */   @ApiField("contact_number")
/*  41:    */   private String contactNumber;
/*  42:    */   @ApiField("create_channel")
/*  43:    */   private String createChannel;
/*  44:    */   @ApiField("district_code")
/*  45:    */   private String districtCode;
/*  46:    */   @ApiField("gmt_shop_create")
/*  47:    */   private String gmtShopCreate;
/*  48:    */   @ApiField("gmt_shop_modified")
/*  49:    */   private String gmtShopModified;
/*  50:    */   @ApiField("implement_id")
/*  51:    */   private String implementId;
/*  52:    */   @ApiField("is_online")
/*  53:    */   private String isOnline;
/*  54:    */   @ApiField("is_operating_online")
/*  55:    */   private String isOperatingOnline;
/*  56:    */   @ApiField("is_show")
/*  57:    */   private String isShow;
/*  58:    */   @ApiField("isv_uid")
/*  59:    */   private String isvUid;
/*  60:    */   @ApiField("latitude")
/*  61:    */   private String latitude;
/*  62:    */   @ApiField("licence")
/*  63:    */   private String licence;
/*  64:    */   @ApiField("licence_code")
/*  65:    */   private String licenceCode;
/*  66:    */   @ApiField("licence_expires")
/*  67:    */   private String licenceExpires;
/*  68:    */   @ApiField("licence_name")
/*  69:    */   private String licenceName;
/*  70:    */   @ApiField("longitude")
/*  71:    */   private String longitude;
/*  72:    */   @ApiField("main_image")
/*  73:    */   private String mainImage;
/*  74:    */   @ApiField("main_shop_name")
/*  75:    */   private String mainShopName;
/*  76:    */   @ApiField("no_smoking")
/*  77:    */   private String noSmoking;
/*  78:    */   @ApiField("notify_mobile")
/*  79:    */   private String notifyMobile;
/*  80:    */   @ApiField("online_image")
/*  81:    */   private String onlineImage;
/*  82:    */   @ApiField("operate_notify_url")
/*  83:    */   private String operateNotifyUrl;
/*  84:    */   @ApiField("other_auth_images")
/*  85:    */   private String otherAuthImages;
/*  86:    */   @ApiField("parking")
/*  87:    */   private String parking;
/*  88:    */   @ApiField("partner_id")
/*  89:    */   private String partnerId;
/*  90:    */   @ApiField("pay_type")
/*  91:    */   private String payType;
/*  92:    */   @ApiField("payment_account")
/*  93:    */   private String paymentAccount;
/*  94:    */   @ApiField("pic_coll")
/*  95:    */   private String picColl;
/*  96:    */   @ApiField("processed_qr_code")
/*  97:    */   private String processedQrCode;
/*  98:    */   @ApiField("provider_xiaoer_uid")
/*  99:    */   private String providerXiaoerUid;
/* 100:    */   @ApiField("province_code")
/* 101:    */   private String provinceCode;
/* 102:    */   @ApiField("qr_code")
/* 103:    */   private String qrCode;
/* 104:    */   @ApiField("shop_tags")
/* 105:    */   private String shopTags;
/* 106:    */   @ApiField("store_id")
/* 107:    */   private String storeId;
/* 108:    */   @ApiField("value_added")
/* 109:    */   private String valueAdded;
/* 110:    */   @ApiField("wifi")
/* 111:    */   private String wifi;
/* 112:    */   
/* 113:    */   public void setAddress(String address)
/* 114:    */   {
/* 115:324 */     this.address = address;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getAddress()
/* 119:    */   {
/* 120:327 */     return this.address;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setAuditDesc(String auditDesc)
/* 124:    */   {
/* 125:331 */     this.auditDesc = auditDesc;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getAuditDesc()
/* 129:    */   {
/* 130:334 */     return this.auditDesc;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setAuditImages(String auditImages)
/* 134:    */   {
/* 135:338 */     this.auditImages = auditImages;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getAuditImages()
/* 139:    */   {
/* 140:341 */     return this.auditImages;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setAuditStatus(String auditStatus)
/* 144:    */   {
/* 145:345 */     this.auditStatus = auditStatus;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getAuditStatus()
/* 149:    */   {
/* 150:348 */     return this.auditStatus;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setAuthLetter(String authLetter)
/* 154:    */   {
/* 155:352 */     this.authLetter = authLetter;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getAuthLetter()
/* 159:    */   {
/* 160:355 */     return this.authLetter;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setAvgPrice(String avgPrice)
/* 164:    */   {
/* 165:359 */     this.avgPrice = avgPrice;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getAvgPrice()
/* 169:    */   {
/* 170:362 */     return this.avgPrice;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setBox(String box)
/* 174:    */   {
/* 175:366 */     this.box = box;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getBox()
/* 179:    */   {
/* 180:369 */     return this.box;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setBranchShopName(String branchShopName)
/* 184:    */   {
/* 185:373 */     this.branchShopName = branchShopName;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getBranchShopName()
/* 189:    */   {
/* 190:376 */     return this.branchShopName;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setBrandLogo(String brandLogo)
/* 194:    */   {
/* 195:380 */     this.brandLogo = brandLogo;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getBrandLogo()
/* 199:    */   {
/* 200:383 */     return this.brandLogo;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setBrandName(String brandName)
/* 204:    */   {
/* 205:387 */     this.brandName = brandName;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getBrandName()
/* 209:    */   {
/* 210:390 */     return this.brandName;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setBusinessCertificate(String businessCertificate)
/* 214:    */   {
/* 215:394 */     this.businessCertificate = businessCertificate;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getBusinessCertificate()
/* 219:    */   {
/* 220:397 */     return this.businessCertificate;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setBusinessCertificateExpires(String businessCertificateExpires)
/* 224:    */   {
/* 225:401 */     this.businessCertificateExpires = businessCertificateExpires;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public String getBusinessCertificateExpires()
/* 229:    */   {
/* 230:404 */     return this.businessCertificateExpires;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void setBusinessTime(String businessTime)
/* 234:    */   {
/* 235:408 */     this.businessTime = businessTime;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public String getBusinessTime()
/* 239:    */   {
/* 240:411 */     return this.businessTime;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public void setCategoryId(String categoryId)
/* 244:    */   {
/* 245:415 */     this.categoryId = categoryId;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public String getCategoryId()
/* 249:    */   {
/* 250:418 */     return this.categoryId;
/* 251:    */   }
/* 252:    */   
/* 253:    */   public void setCityCode(String cityCode)
/* 254:    */   {
/* 255:422 */     this.cityCode = cityCode;
/* 256:    */   }
/* 257:    */   
/* 258:    */   public String getCityCode()
/* 259:    */   {
/* 260:425 */     return this.cityCode;
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void setContactNumber(String contactNumber)
/* 264:    */   {
/* 265:429 */     this.contactNumber = contactNumber;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public String getContactNumber()
/* 269:    */   {
/* 270:432 */     return this.contactNumber;
/* 271:    */   }
/* 272:    */   
/* 273:    */   public void setCreateChannel(String createChannel)
/* 274:    */   {
/* 275:436 */     this.createChannel = createChannel;
/* 276:    */   }
/* 277:    */   
/* 278:    */   public String getCreateChannel()
/* 279:    */   {
/* 280:439 */     return this.createChannel;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public void setDistrictCode(String districtCode)
/* 284:    */   {
/* 285:443 */     this.districtCode = districtCode;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public String getDistrictCode()
/* 289:    */   {
/* 290:446 */     return this.districtCode;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void setGmtShopCreate(String gmtShopCreate)
/* 294:    */   {
/* 295:450 */     this.gmtShopCreate = gmtShopCreate;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public String getGmtShopCreate()
/* 299:    */   {
/* 300:453 */     return this.gmtShopCreate;
/* 301:    */   }
/* 302:    */   
/* 303:    */   public void setGmtShopModified(String gmtShopModified)
/* 304:    */   {
/* 305:457 */     this.gmtShopModified = gmtShopModified;
/* 306:    */   }
/* 307:    */   
/* 308:    */   public String getGmtShopModified()
/* 309:    */   {
/* 310:460 */     return this.gmtShopModified;
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void setImplementId(String implementId)
/* 314:    */   {
/* 315:464 */     this.implementId = implementId;
/* 316:    */   }
/* 317:    */   
/* 318:    */   public String getImplementId()
/* 319:    */   {
/* 320:467 */     return this.implementId;
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void setIsOnline(String isOnline)
/* 324:    */   {
/* 325:471 */     this.isOnline = isOnline;
/* 326:    */   }
/* 327:    */   
/* 328:    */   public String getIsOnline()
/* 329:    */   {
/* 330:474 */     return this.isOnline;
/* 331:    */   }
/* 332:    */   
/* 333:    */   public void setIsOperatingOnline(String isOperatingOnline)
/* 334:    */   {
/* 335:478 */     this.isOperatingOnline = isOperatingOnline;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public String getIsOperatingOnline()
/* 339:    */   {
/* 340:481 */     return this.isOperatingOnline;
/* 341:    */   }
/* 342:    */   
/* 343:    */   public void setIsShow(String isShow)
/* 344:    */   {
/* 345:485 */     this.isShow = isShow;
/* 346:    */   }
/* 347:    */   
/* 348:    */   public String getIsShow()
/* 349:    */   {
/* 350:488 */     return this.isShow;
/* 351:    */   }
/* 352:    */   
/* 353:    */   public void setIsvUid(String isvUid)
/* 354:    */   {
/* 355:492 */     this.isvUid = isvUid;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public String getIsvUid()
/* 359:    */   {
/* 360:495 */     return this.isvUid;
/* 361:    */   }
/* 362:    */   
/* 363:    */   public void setLatitude(String latitude)
/* 364:    */   {
/* 365:499 */     this.latitude = latitude;
/* 366:    */   }
/* 367:    */   
/* 368:    */   public String getLatitude()
/* 369:    */   {
/* 370:502 */     return this.latitude;
/* 371:    */   }
/* 372:    */   
/* 373:    */   public void setLicence(String licence)
/* 374:    */   {
/* 375:506 */     this.licence = licence;
/* 376:    */   }
/* 377:    */   
/* 378:    */   public String getLicence()
/* 379:    */   {
/* 380:509 */     return this.licence;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public void setLicenceCode(String licenceCode)
/* 384:    */   {
/* 385:513 */     this.licenceCode = licenceCode;
/* 386:    */   }
/* 387:    */   
/* 388:    */   public String getLicenceCode()
/* 389:    */   {
/* 390:516 */     return this.licenceCode;
/* 391:    */   }
/* 392:    */   
/* 393:    */   public void setLicenceExpires(String licenceExpires)
/* 394:    */   {
/* 395:520 */     this.licenceExpires = licenceExpires;
/* 396:    */   }
/* 397:    */   
/* 398:    */   public String getLicenceExpires()
/* 399:    */   {
/* 400:523 */     return this.licenceExpires;
/* 401:    */   }
/* 402:    */   
/* 403:    */   public void setLicenceName(String licenceName)
/* 404:    */   {
/* 405:527 */     this.licenceName = licenceName;
/* 406:    */   }
/* 407:    */   
/* 408:    */   public String getLicenceName()
/* 409:    */   {
/* 410:530 */     return this.licenceName;
/* 411:    */   }
/* 412:    */   
/* 413:    */   public void setLongitude(String longitude)
/* 414:    */   {
/* 415:534 */     this.longitude = longitude;
/* 416:    */   }
/* 417:    */   
/* 418:    */   public String getLongitude()
/* 419:    */   {
/* 420:537 */     return this.longitude;
/* 421:    */   }
/* 422:    */   
/* 423:    */   public void setMainImage(String mainImage)
/* 424:    */   {
/* 425:541 */     this.mainImage = mainImage;
/* 426:    */   }
/* 427:    */   
/* 428:    */   public String getMainImage()
/* 429:    */   {
/* 430:544 */     return this.mainImage;
/* 431:    */   }
/* 432:    */   
/* 433:    */   public void setMainShopName(String mainShopName)
/* 434:    */   {
/* 435:548 */     this.mainShopName = mainShopName;
/* 436:    */   }
/* 437:    */   
/* 438:    */   public String getMainShopName()
/* 439:    */   {
/* 440:551 */     return this.mainShopName;
/* 441:    */   }
/* 442:    */   
/* 443:    */   public void setNoSmoking(String noSmoking)
/* 444:    */   {
/* 445:555 */     this.noSmoking = noSmoking;
/* 446:    */   }
/* 447:    */   
/* 448:    */   public String getNoSmoking()
/* 449:    */   {
/* 450:558 */     return this.noSmoking;
/* 451:    */   }
/* 452:    */   
/* 453:    */   public void setNotifyMobile(String notifyMobile)
/* 454:    */   {
/* 455:562 */     this.notifyMobile = notifyMobile;
/* 456:    */   }
/* 457:    */   
/* 458:    */   public String getNotifyMobile()
/* 459:    */   {
/* 460:565 */     return this.notifyMobile;
/* 461:    */   }
/* 462:    */   
/* 463:    */   public void setOnlineImage(String onlineImage)
/* 464:    */   {
/* 465:569 */     this.onlineImage = onlineImage;
/* 466:    */   }
/* 467:    */   
/* 468:    */   public String getOnlineImage()
/* 469:    */   {
/* 470:572 */     return this.onlineImage;
/* 471:    */   }
/* 472:    */   
/* 473:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 474:    */   {
/* 475:576 */     this.operateNotifyUrl = operateNotifyUrl;
/* 476:    */   }
/* 477:    */   
/* 478:    */   public String getOperateNotifyUrl()
/* 479:    */   {
/* 480:579 */     return this.operateNotifyUrl;
/* 481:    */   }
/* 482:    */   
/* 483:    */   public void setOtherAuthImages(String otherAuthImages)
/* 484:    */   {
/* 485:583 */     this.otherAuthImages = otherAuthImages;
/* 486:    */   }
/* 487:    */   
/* 488:    */   public String getOtherAuthImages()
/* 489:    */   {
/* 490:586 */     return this.otherAuthImages;
/* 491:    */   }
/* 492:    */   
/* 493:    */   public void setParking(String parking)
/* 494:    */   {
/* 495:590 */     this.parking = parking;
/* 496:    */   }
/* 497:    */   
/* 498:    */   public String getParking()
/* 499:    */   {
/* 500:593 */     return this.parking;
/* 501:    */   }
/* 502:    */   
/* 503:    */   public void setPartnerId(String partnerId)
/* 504:    */   {
/* 505:597 */     this.partnerId = partnerId;
/* 506:    */   }
/* 507:    */   
/* 508:    */   public String getPartnerId()
/* 509:    */   {
/* 510:600 */     return this.partnerId;
/* 511:    */   }
/* 512:    */   
/* 513:    */   public void setPayType(String payType)
/* 514:    */   {
/* 515:604 */     this.payType = payType;
/* 516:    */   }
/* 517:    */   
/* 518:    */   public String getPayType()
/* 519:    */   {
/* 520:607 */     return this.payType;
/* 521:    */   }
/* 522:    */   
/* 523:    */   public void setPaymentAccount(String paymentAccount)
/* 524:    */   {
/* 525:611 */     this.paymentAccount = paymentAccount;
/* 526:    */   }
/* 527:    */   
/* 528:    */   public String getPaymentAccount()
/* 529:    */   {
/* 530:614 */     return this.paymentAccount;
/* 531:    */   }
/* 532:    */   
/* 533:    */   public void setPicColl(String picColl)
/* 534:    */   {
/* 535:618 */     this.picColl = picColl;
/* 536:    */   }
/* 537:    */   
/* 538:    */   public String getPicColl()
/* 539:    */   {
/* 540:621 */     return this.picColl;
/* 541:    */   }
/* 542:    */   
/* 543:    */   public void setProcessedQrCode(String processedQrCode)
/* 544:    */   {
/* 545:625 */     this.processedQrCode = processedQrCode;
/* 546:    */   }
/* 547:    */   
/* 548:    */   public String getProcessedQrCode()
/* 549:    */   {
/* 550:628 */     return this.processedQrCode;
/* 551:    */   }
/* 552:    */   
/* 553:    */   public void setProviderXiaoerUid(String providerXiaoerUid)
/* 554:    */   {
/* 555:632 */     this.providerXiaoerUid = providerXiaoerUid;
/* 556:    */   }
/* 557:    */   
/* 558:    */   public String getProviderXiaoerUid()
/* 559:    */   {
/* 560:635 */     return this.providerXiaoerUid;
/* 561:    */   }
/* 562:    */   
/* 563:    */   public void setProvinceCode(String provinceCode)
/* 564:    */   {
/* 565:639 */     this.provinceCode = provinceCode;
/* 566:    */   }
/* 567:    */   
/* 568:    */   public String getProvinceCode()
/* 569:    */   {
/* 570:642 */     return this.provinceCode;
/* 571:    */   }
/* 572:    */   
/* 573:    */   public void setQrCode(String qrCode)
/* 574:    */   {
/* 575:646 */     this.qrCode = qrCode;
/* 576:    */   }
/* 577:    */   
/* 578:    */   public String getQrCode()
/* 579:    */   {
/* 580:649 */     return this.qrCode;
/* 581:    */   }
/* 582:    */   
/* 583:    */   public void setShopTags(String shopTags)
/* 584:    */   {
/* 585:653 */     this.shopTags = shopTags;
/* 586:    */   }
/* 587:    */   
/* 588:    */   public String getShopTags()
/* 589:    */   {
/* 590:656 */     return this.shopTags;
/* 591:    */   }
/* 592:    */   
/* 593:    */   public void setStoreId(String storeId)
/* 594:    */   {
/* 595:660 */     this.storeId = storeId;
/* 596:    */   }
/* 597:    */   
/* 598:    */   public String getStoreId()
/* 599:    */   {
/* 600:663 */     return this.storeId;
/* 601:    */   }
/* 602:    */   
/* 603:    */   public void setValueAdded(String valueAdded)
/* 604:    */   {
/* 605:667 */     this.valueAdded = valueAdded;
/* 606:    */   }
/* 607:    */   
/* 608:    */   public String getValueAdded()
/* 609:    */   {
/* 610:670 */     return this.valueAdded;
/* 611:    */   }
/* 612:    */   
/* 613:    */   public void setWifi(String wifi)
/* 614:    */   {
/* 615:674 */     this.wifi = wifi;
/* 616:    */   }
/* 617:    */   
/* 618:    */   public String getWifi()
/* 619:    */   {
/* 620:677 */     return this.wifi;
/* 621:    */   }
/* 622:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketShopQuerydetailResponse
 * JD-Core Version:    0.7.0.1
 */