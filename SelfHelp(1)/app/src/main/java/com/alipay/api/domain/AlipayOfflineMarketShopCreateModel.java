/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketShopCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8879975825631424935L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("audit_images")
/*  13:    */   private String auditImages;
/*  14:    */   @ApiField("auth_letter")
/*  15:    */   private String authLetter;
/*  16:    */   @ApiField("avg_price")
/*  17:    */   private String avgPrice;
/*  18:    */   @ApiField("biz_version")
/*  19:    */   private String bizVersion;
/*  20:    */   @ApiField("box")
/*  21:    */   private String box;
/*  22:    */   @ApiField("branch_shop_name")
/*  23:    */   private String branchShopName;
/*  24:    */   @ApiField("brand_logo")
/*  25:    */   private String brandLogo;
/*  26:    */   @ApiField("brand_name")
/*  27:    */   private String brandName;
/*  28:    */   @ApiField("business_certificate")
/*  29:    */   private String businessCertificate;
/*  30:    */   @ApiField("business_certificate_expires")
/*  31:    */   private String businessCertificateExpires;
/*  32:    */   @ApiField("business_time")
/*  33:    */   private String businessTime;
/*  34:    */   @ApiField("category_id")
/*  35:    */   private String categoryId;
/*  36:    */   @ApiField("city_code")
/*  37:    */   private String cityCode;
/*  38:    */   @ApiField("contact_number")
/*  39:    */   private String contactNumber;
/*  40:    */   @ApiField("creator")
/*  41:    */   private String creator;
/*  42:    */   @ApiField("district_code")
/*  43:    */   private String districtCode;
/*  44:    */   @ApiField("enterprise_logon_id")
/*  45:    */   private String enterpriseLogonId;
/*  46:    */   @ApiField("enterprise_name")
/*  47:    */   private String enterpriseName;
/*  48:    */   @ApiField("implement_id")
/*  49:    */   private String implementId;
/*  50:    */   @ApiField("is_operating_online")
/*  51:    */   private String isOperatingOnline;
/*  52:    */   @ApiField("isv_uid")
/*  53:    */   private String isvUid;
/*  54:    */   @ApiField("latitude")
/*  55:    */   private String latitude;
/*  56:    */   @ApiField("leads_id")
/*  57:    */   private String leadsId;
/*  58:    */   @ApiField("licence")
/*  59:    */   private String licence;
/*  60:    */   @ApiField("licence_code")
/*  61:    */   private String licenceCode;
/*  62:    */   @ApiField("licence_expires")
/*  63:    */   private String licenceExpires;
/*  64:    */   @ApiField("licence_name")
/*  65:    */   private String licenceName;
/*  66:    */   @ApiField("longitude")
/*  67:    */   private Long longitude;
/*  68:    */   @ApiField("main_image")
/*  69:    */   private String mainImage;
/*  70:    */   @ApiField("main_shop_name")
/*  71:    */   private String mainShopName;
/*  72:    */   @ApiField("no_smoking")
/*  73:    */   private String noSmoking;
/*  74:    */   @ApiField("notify_mobile")
/*  75:    */   private String notifyMobile;
/*  76:    */   @ApiField("online_image")
/*  77:    */   private String onlineImage;
/*  78:    */   @ApiField("online_url")
/*  79:    */   private String onlineUrl;
/*  80:    */   @ApiField("op_role")
/*  81:    */   private String opRole;
/*  82:    */   @ApiField("operate_notify_url")
/*  83:    */   private String operateNotifyUrl;
/*  84:    */   @ApiField("other_authorization")
/*  85:    */   private String otherAuthorization;
/*  86:    */   @ApiField("parking")
/*  87:    */   private String parking;
/*  88:    */   @ApiField("partner_id")
/*  89:    */   private String partnerId;
/*  90:    */   @ApiField("pay_type")
/*  91:    */   private String payType;
/*  92:    */   @ApiField("province_code")
/*  93:    */   private String provinceCode;
/*  94:    */   @ApiField("ref_apply_id")
/*  95:    */   private String refApplyId;
/*  96:    */   @ApiField("request_id")
/*  97:    */   private String requestId;
/*  98:    */   @ApiField("store_id")
/*  99:    */   private String storeId;
/* 100:    */   @ApiField("value_added")
/* 101:    */   private String valueAdded;
/* 102:    */   @ApiField("version")
/* 103:    */   private String version;
/* 104:    */   @ApiField("wifi")
/* 105:    */   private String wifi;
/* 106:    */   
/* 107:    */   public String getAddress()
/* 108:    */   {
/* 109:306 */     return this.address;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setAddress(String address)
/* 113:    */   {
/* 114:309 */     this.address = address;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getAuditImages()
/* 118:    */   {
/* 119:313 */     return this.auditImages;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setAuditImages(String auditImages)
/* 123:    */   {
/* 124:316 */     this.auditImages = auditImages;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getAuthLetter()
/* 128:    */   {
/* 129:320 */     return this.authLetter;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setAuthLetter(String authLetter)
/* 133:    */   {
/* 134:323 */     this.authLetter = authLetter;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getAvgPrice()
/* 138:    */   {
/* 139:327 */     return this.avgPrice;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setAvgPrice(String avgPrice)
/* 143:    */   {
/* 144:330 */     this.avgPrice = avgPrice;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getBizVersion()
/* 148:    */   {
/* 149:334 */     return this.bizVersion;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setBizVersion(String bizVersion)
/* 153:    */   {
/* 154:337 */     this.bizVersion = bizVersion;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getBox()
/* 158:    */   {
/* 159:341 */     return this.box;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setBox(String box)
/* 163:    */   {
/* 164:344 */     this.box = box;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getBranchShopName()
/* 168:    */   {
/* 169:348 */     return this.branchShopName;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setBranchShopName(String branchShopName)
/* 173:    */   {
/* 174:351 */     this.branchShopName = branchShopName;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getBrandLogo()
/* 178:    */   {
/* 179:355 */     return this.brandLogo;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setBrandLogo(String brandLogo)
/* 183:    */   {
/* 184:358 */     this.brandLogo = brandLogo;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getBrandName()
/* 188:    */   {
/* 189:362 */     return this.brandName;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setBrandName(String brandName)
/* 193:    */   {
/* 194:365 */     this.brandName = brandName;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getBusinessCertificate()
/* 198:    */   {
/* 199:369 */     return this.businessCertificate;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setBusinessCertificate(String businessCertificate)
/* 203:    */   {
/* 204:372 */     this.businessCertificate = businessCertificate;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getBusinessCertificateExpires()
/* 208:    */   {
/* 209:376 */     return this.businessCertificateExpires;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setBusinessCertificateExpires(String businessCertificateExpires)
/* 213:    */   {
/* 214:379 */     this.businessCertificateExpires = businessCertificateExpires;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getBusinessTime()
/* 218:    */   {
/* 219:383 */     return this.businessTime;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setBusinessTime(String businessTime)
/* 223:    */   {
/* 224:386 */     this.businessTime = businessTime;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public String getCategoryId()
/* 228:    */   {
/* 229:390 */     return this.categoryId;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void setCategoryId(String categoryId)
/* 233:    */   {
/* 234:393 */     this.categoryId = categoryId;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getCityCode()
/* 238:    */   {
/* 239:397 */     return this.cityCode;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void setCityCode(String cityCode)
/* 243:    */   {
/* 244:400 */     this.cityCode = cityCode;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public String getContactNumber()
/* 248:    */   {
/* 249:404 */     return this.contactNumber;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void setContactNumber(String contactNumber)
/* 253:    */   {
/* 254:407 */     this.contactNumber = contactNumber;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public String getCreator()
/* 258:    */   {
/* 259:411 */     return this.creator;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void setCreator(String creator)
/* 263:    */   {
/* 264:414 */     this.creator = creator;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public String getDistrictCode()
/* 268:    */   {
/* 269:418 */     return this.districtCode;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public void setDistrictCode(String districtCode)
/* 273:    */   {
/* 274:421 */     this.districtCode = districtCode;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public String getEnterpriseLogonId()
/* 278:    */   {
/* 279:425 */     return this.enterpriseLogonId;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void setEnterpriseLogonId(String enterpriseLogonId)
/* 283:    */   {
/* 284:428 */     this.enterpriseLogonId = enterpriseLogonId;
/* 285:    */   }
/* 286:    */   
/* 287:    */   public String getEnterpriseName()
/* 288:    */   {
/* 289:432 */     return this.enterpriseName;
/* 290:    */   }
/* 291:    */   
/* 292:    */   public void setEnterpriseName(String enterpriseName)
/* 293:    */   {
/* 294:435 */     this.enterpriseName = enterpriseName;
/* 295:    */   }
/* 296:    */   
/* 297:    */   public String getImplementId()
/* 298:    */   {
/* 299:439 */     return this.implementId;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public void setImplementId(String implementId)
/* 303:    */   {
/* 304:442 */     this.implementId = implementId;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public String getIsOperatingOnline()
/* 308:    */   {
/* 309:446 */     return this.isOperatingOnline;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void setIsOperatingOnline(String isOperatingOnline)
/* 313:    */   {
/* 314:449 */     this.isOperatingOnline = isOperatingOnline;
/* 315:    */   }
/* 316:    */   
/* 317:    */   public String getIsvUid()
/* 318:    */   {
/* 319:453 */     return this.isvUid;
/* 320:    */   }
/* 321:    */   
/* 322:    */   public void setIsvUid(String isvUid)
/* 323:    */   {
/* 324:456 */     this.isvUid = isvUid;
/* 325:    */   }
/* 326:    */   
/* 327:    */   public String getLatitude()
/* 328:    */   {
/* 329:460 */     return this.latitude;
/* 330:    */   }
/* 331:    */   
/* 332:    */   public void setLatitude(String latitude)
/* 333:    */   {
/* 334:463 */     this.latitude = latitude;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public String getLeadsId()
/* 338:    */   {
/* 339:467 */     return this.leadsId;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public void setLeadsId(String leadsId)
/* 343:    */   {
/* 344:470 */     this.leadsId = leadsId;
/* 345:    */   }
/* 346:    */   
/* 347:    */   public String getLicence()
/* 348:    */   {
/* 349:474 */     return this.licence;
/* 350:    */   }
/* 351:    */   
/* 352:    */   public void setLicence(String licence)
/* 353:    */   {
/* 354:477 */     this.licence = licence;
/* 355:    */   }
/* 356:    */   
/* 357:    */   public String getLicenceCode()
/* 358:    */   {
/* 359:481 */     return this.licenceCode;
/* 360:    */   }
/* 361:    */   
/* 362:    */   public void setLicenceCode(String licenceCode)
/* 363:    */   {
/* 364:484 */     this.licenceCode = licenceCode;
/* 365:    */   }
/* 366:    */   
/* 367:    */   public String getLicenceExpires()
/* 368:    */   {
/* 369:488 */     return this.licenceExpires;
/* 370:    */   }
/* 371:    */   
/* 372:    */   public void setLicenceExpires(String licenceExpires)
/* 373:    */   {
/* 374:491 */     this.licenceExpires = licenceExpires;
/* 375:    */   }
/* 376:    */   
/* 377:    */   public String getLicenceName()
/* 378:    */   {
/* 379:495 */     return this.licenceName;
/* 380:    */   }
/* 381:    */   
/* 382:    */   public void setLicenceName(String licenceName)
/* 383:    */   {
/* 384:498 */     this.licenceName = licenceName;
/* 385:    */   }
/* 386:    */   
/* 387:    */   public Long getLongitude()
/* 388:    */   {
/* 389:502 */     return this.longitude;
/* 390:    */   }
/* 391:    */   
/* 392:    */   public void setLongitude(Long longitude)
/* 393:    */   {
/* 394:505 */     this.longitude = longitude;
/* 395:    */   }
/* 396:    */   
/* 397:    */   public String getMainImage()
/* 398:    */   {
/* 399:509 */     return this.mainImage;
/* 400:    */   }
/* 401:    */   
/* 402:    */   public void setMainImage(String mainImage)
/* 403:    */   {
/* 404:512 */     this.mainImage = mainImage;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public String getMainShopName()
/* 408:    */   {
/* 409:516 */     return this.mainShopName;
/* 410:    */   }
/* 411:    */   
/* 412:    */   public void setMainShopName(String mainShopName)
/* 413:    */   {
/* 414:519 */     this.mainShopName = mainShopName;
/* 415:    */   }
/* 416:    */   
/* 417:    */   public String getNoSmoking()
/* 418:    */   {
/* 419:523 */     return this.noSmoking;
/* 420:    */   }
/* 421:    */   
/* 422:    */   public void setNoSmoking(String noSmoking)
/* 423:    */   {
/* 424:526 */     this.noSmoking = noSmoking;
/* 425:    */   }
/* 426:    */   
/* 427:    */   public String getNotifyMobile()
/* 428:    */   {
/* 429:530 */     return this.notifyMobile;
/* 430:    */   }
/* 431:    */   
/* 432:    */   public void setNotifyMobile(String notifyMobile)
/* 433:    */   {
/* 434:533 */     this.notifyMobile = notifyMobile;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public String getOnlineImage()
/* 438:    */   {
/* 439:537 */     return this.onlineImage;
/* 440:    */   }
/* 441:    */   
/* 442:    */   public void setOnlineImage(String onlineImage)
/* 443:    */   {
/* 444:540 */     this.onlineImage = onlineImage;
/* 445:    */   }
/* 446:    */   
/* 447:    */   public String getOnlineUrl()
/* 448:    */   {
/* 449:544 */     return this.onlineUrl;
/* 450:    */   }
/* 451:    */   
/* 452:    */   public void setOnlineUrl(String onlineUrl)
/* 453:    */   {
/* 454:547 */     this.onlineUrl = onlineUrl;
/* 455:    */   }
/* 456:    */   
/* 457:    */   public String getOpRole()
/* 458:    */   {
/* 459:551 */     return this.opRole;
/* 460:    */   }
/* 461:    */   
/* 462:    */   public void setOpRole(String opRole)
/* 463:    */   {
/* 464:554 */     this.opRole = opRole;
/* 465:    */   }
/* 466:    */   
/* 467:    */   public String getOperateNotifyUrl()
/* 468:    */   {
/* 469:558 */     return this.operateNotifyUrl;
/* 470:    */   }
/* 471:    */   
/* 472:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 473:    */   {
/* 474:561 */     this.operateNotifyUrl = operateNotifyUrl;
/* 475:    */   }
/* 476:    */   
/* 477:    */   public String getOtherAuthorization()
/* 478:    */   {
/* 479:565 */     return this.otherAuthorization;
/* 480:    */   }
/* 481:    */   
/* 482:    */   public void setOtherAuthorization(String otherAuthorization)
/* 483:    */   {
/* 484:568 */     this.otherAuthorization = otherAuthorization;
/* 485:    */   }
/* 486:    */   
/* 487:    */   public String getParking()
/* 488:    */   {
/* 489:572 */     return this.parking;
/* 490:    */   }
/* 491:    */   
/* 492:    */   public void setParking(String parking)
/* 493:    */   {
/* 494:575 */     this.parking = parking;
/* 495:    */   }
/* 496:    */   
/* 497:    */   public String getPartnerId()
/* 498:    */   {
/* 499:579 */     return this.partnerId;
/* 500:    */   }
/* 501:    */   
/* 502:    */   public void setPartnerId(String partnerId)
/* 503:    */   {
/* 504:582 */     this.partnerId = partnerId;
/* 505:    */   }
/* 506:    */   
/* 507:    */   public String getPayType()
/* 508:    */   {
/* 509:586 */     return this.payType;
/* 510:    */   }
/* 511:    */   
/* 512:    */   public void setPayType(String payType)
/* 513:    */   {
/* 514:589 */     this.payType = payType;
/* 515:    */   }
/* 516:    */   
/* 517:    */   public String getProvinceCode()
/* 518:    */   {
/* 519:593 */     return this.provinceCode;
/* 520:    */   }
/* 521:    */   
/* 522:    */   public void setProvinceCode(String provinceCode)
/* 523:    */   {
/* 524:596 */     this.provinceCode = provinceCode;
/* 525:    */   }
/* 526:    */   
/* 527:    */   public String getRefApplyId()
/* 528:    */   {
/* 529:600 */     return this.refApplyId;
/* 530:    */   }
/* 531:    */   
/* 532:    */   public void setRefApplyId(String refApplyId)
/* 533:    */   {
/* 534:603 */     this.refApplyId = refApplyId;
/* 535:    */   }
/* 536:    */   
/* 537:    */   public String getRequestId()
/* 538:    */   {
/* 539:607 */     return this.requestId;
/* 540:    */   }
/* 541:    */   
/* 542:    */   public void setRequestId(String requestId)
/* 543:    */   {
/* 544:610 */     this.requestId = requestId;
/* 545:    */   }
/* 546:    */   
/* 547:    */   public String getStoreId()
/* 548:    */   {
/* 549:614 */     return this.storeId;
/* 550:    */   }
/* 551:    */   
/* 552:    */   public void setStoreId(String storeId)
/* 553:    */   {
/* 554:617 */     this.storeId = storeId;
/* 555:    */   }
/* 556:    */   
/* 557:    */   public String getValueAdded()
/* 558:    */   {
/* 559:621 */     return this.valueAdded;
/* 560:    */   }
/* 561:    */   
/* 562:    */   public void setValueAdded(String valueAdded)
/* 563:    */   {
/* 564:624 */     this.valueAdded = valueAdded;
/* 565:    */   }
/* 566:    */   
/* 567:    */   public String getVersion()
/* 568:    */   {
/* 569:628 */     return this.version;
/* 570:    */   }
/* 571:    */   
/* 572:    */   public void setVersion(String version)
/* 573:    */   {
/* 574:631 */     this.version = version;
/* 575:    */   }
/* 576:    */   
/* 577:    */   public String getWifi()
/* 578:    */   {
/* 579:635 */     return this.wifi;
/* 580:    */   }
/* 581:    */   
/* 582:    */   public void setWifi(String wifi)
/* 583:    */   {
/* 584:638 */     this.wifi = wifi;
/* 585:    */   }
/* 586:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopCreateModel
 * JD-Core Version:    0.7.0.1
 */