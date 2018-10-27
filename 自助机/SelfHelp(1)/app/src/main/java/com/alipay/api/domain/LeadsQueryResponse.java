/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class LeadsQueryResponse
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 7572656292586464127L;
/*  13:    */   @ApiField("address")
/*  14:    */   private String address;
/*  15:    */   @ApiField("auth_letter")
/*  16:    */   private String authLetter;
/*  17:    */   @ApiField("auth_letter_url")
/*  18:    */   private String authLetterUrl;
/*  19:    */   @ApiField("avg_price")
/*  20:    */   private String avgPrice;
/*  21:    */   @ApiField("box")
/*  22:    */   private String box;
/*  23:    */   @ApiField("branch_shop_name")
/*  24:    */   private String branchShopName;
/*  25:    */   @ApiField("brand_logo")
/*  26:    */   private String brandLogo;
/*  27:    */   @ApiField("brand_logo_url")
/*  28:    */   private String brandLogoUrl;
/*  29:    */   @ApiField("brand_name")
/*  30:    */   private String brandName;
/*  31:    */   @ApiField("business_certificate")
/*  32:    */   private String businessCertificate;
/*  33:    */   @ApiField("business_certificate_expires")
/*  34:    */   private String businessCertificateExpires;
/*  35:    */   @ApiField("business_certificate_url")
/*  36:    */   private String businessCertificateUrl;
/*  37:    */   @ApiField("business_time")
/*  38:    */   private String businessTime;
/*  39:    */   @ApiField("category_id")
/*  40:    */   private String categoryId;
/*  41:    */   @ApiField("city_code")
/*  42:    */   private String cityCode;
/*  43:    */   @ApiField("claim_time")
/*  44:    */   private Date claimTime;
/*  45:    */   @ApiField("company_name")
/*  46:    */   private String companyName;
/*  47:    */   @ApiField("contact_name")
/*  48:    */   private String contactName;
/*  49:    */   @ApiField("contact_number")
/*  50:    */   private String contactNumber;
/*  51:    */   @ApiField("create_time")
/*  52:    */   private Date createTime;
/*  53:    */   @ApiListField("detail_images")
/*  54:    */   @ApiField("string")
/*  55:    */   private List<String> detailImages;
/*  56:    */   @ApiListField("detail_images_name")
/*  57:    */   @ApiField("string")
/*  58:    */   private List<String> detailImagesName;
/*  59:    */   @ApiListField("detail_images_url")
/*  60:    */   @ApiField("string")
/*  61:    */   private List<String> detailImagesUrl;
/*  62:    */   @ApiField("district_code")
/*  63:    */   private String districtCode;
/*  64:    */   @ApiField("ext_info")
/*  65:    */   private String extInfo;
/*  66:    */   @ApiField("implement_id")
/*  67:    */   private String implementId;
/*  68:    */   @ApiField("is_complete")
/*  69:    */   private String isComplete;
/*  70:    */   @ApiField("is_hidden")
/*  71:    */   private String isHidden;
/*  72:    */   @ApiField("is_operating_online")
/*  73:    */   private String isOperatingOnline;
/*  74:    */   @ApiField("is_system_import")
/*  75:    */   private String isSystemImport;
/*  76:    */   @ApiField("latitude")
/*  77:    */   private Long latitude;
/*  78:    */   @ApiField("leads_id")
/*  79:    */   private String leadsId;
/*  80:    */   @ApiField("leads_range")
/*  81:    */   private String leadsRange;
/*  82:    */   @ApiField("licence")
/*  83:    */   private String licence;
/*  84:    */   @ApiField("licence_code")
/*  85:    */   private String licenceCode;
/*  86:    */   @ApiField("licence_expires")
/*  87:    */   private String licenceExpires;
/*  88:    */   @ApiField("licence_name")
/*  89:    */   private String licenceName;
/*  90:    */   @ApiField("licence_url")
/*  91:    */   private String licenceUrl;
/*  92:    */   @ApiField("longitude")
/*  93:    */   private Long longitude;
/*  94:    */   @ApiField("main_image")
/*  95:    */   private String mainImage;
/*  96:    */   @ApiField("main_image_name")
/*  97:    */   private String mainImageName;
/*  98:    */   @ApiField("main_image_url")
/*  99:    */   private String mainImageUrl;
/* 100:    */   @ApiField("main_shop_name")
/* 101:    */   private String mainShopName;
/* 102:    */   @ApiField("memo")
/* 103:    */   private String memo;
/* 104:    */   @ApiField("no_smoking")
/* 105:    */   private String noSmoking;
/* 106:    */   @ApiField("online_url")
/* 107:    */   private String onlineUrl;
/* 108:    */   @ApiField("op_id")
/* 109:    */   private String opId;
/* 110:    */   @ApiField("other_authorization")
/* 111:    */   private String otherAuthorization;
/* 112:    */   @ApiField("other_authorization_url")
/* 113:    */   private String otherAuthorizationUrl;
/* 114:    */   @ApiField("other_contact_info")
/* 115:    */   private String otherContactInfo;
/* 116:    */   @ApiField("parking")
/* 117:    */   private String parking;
/* 118:    */   @ApiField("pay_type")
/* 119:    */   private String payType;
/* 120:    */   @ApiField("province_code")
/* 121:    */   private String provinceCode;
/* 122:    */   @ApiField("request_id")
/* 123:    */   private String requestId;
/* 124:    */   @ApiField("status")
/* 125:    */   private String status;
/* 126:    */   @ApiField("store_id")
/* 127:    */   private String storeId;
/* 128:    */   @ApiField("value_added")
/* 129:    */   private String valueAdded;
/* 130:    */   @ApiField("wifi")
/* 131:    */   private String wifi;
/* 132:    */   
/* 133:    */   public String getAddress()
/* 134:    */   {
/* 135:379 */     return this.address;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setAddress(String address)
/* 139:    */   {
/* 140:382 */     this.address = address;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getAuthLetter()
/* 144:    */   {
/* 145:386 */     return this.authLetter;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setAuthLetter(String authLetter)
/* 149:    */   {
/* 150:389 */     this.authLetter = authLetter;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getAuthLetterUrl()
/* 154:    */   {
/* 155:393 */     return this.authLetterUrl;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setAuthLetterUrl(String authLetterUrl)
/* 159:    */   {
/* 160:396 */     this.authLetterUrl = authLetterUrl;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getAvgPrice()
/* 164:    */   {
/* 165:400 */     return this.avgPrice;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setAvgPrice(String avgPrice)
/* 169:    */   {
/* 170:403 */     this.avgPrice = avgPrice;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getBox()
/* 174:    */   {
/* 175:407 */     return this.box;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setBox(String box)
/* 179:    */   {
/* 180:410 */     this.box = box;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getBranchShopName()
/* 184:    */   {
/* 185:414 */     return this.branchShopName;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setBranchShopName(String branchShopName)
/* 189:    */   {
/* 190:417 */     this.branchShopName = branchShopName;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getBrandLogo()
/* 194:    */   {
/* 195:421 */     return this.brandLogo;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setBrandLogo(String brandLogo)
/* 199:    */   {
/* 200:424 */     this.brandLogo = brandLogo;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public String getBrandLogoUrl()
/* 204:    */   {
/* 205:428 */     return this.brandLogoUrl;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public void setBrandLogoUrl(String brandLogoUrl)
/* 209:    */   {
/* 210:431 */     this.brandLogoUrl = brandLogoUrl;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public String getBrandName()
/* 214:    */   {
/* 215:435 */     return this.brandName;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void setBrandName(String brandName)
/* 219:    */   {
/* 220:438 */     this.brandName = brandName;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public String getBusinessCertificate()
/* 224:    */   {
/* 225:442 */     return this.businessCertificate;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public void setBusinessCertificate(String businessCertificate)
/* 229:    */   {
/* 230:445 */     this.businessCertificate = businessCertificate;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public String getBusinessCertificateExpires()
/* 234:    */   {
/* 235:449 */     return this.businessCertificateExpires;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public void setBusinessCertificateExpires(String businessCertificateExpires)
/* 239:    */   {
/* 240:452 */     this.businessCertificateExpires = businessCertificateExpires;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public String getBusinessCertificateUrl()
/* 244:    */   {
/* 245:456 */     return this.businessCertificateUrl;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public void setBusinessCertificateUrl(String businessCertificateUrl)
/* 249:    */   {
/* 250:459 */     this.businessCertificateUrl = businessCertificateUrl;
/* 251:    */   }
/* 252:    */   
/* 253:    */   public String getBusinessTime()
/* 254:    */   {
/* 255:463 */     return this.businessTime;
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void setBusinessTime(String businessTime)
/* 259:    */   {
/* 260:466 */     this.businessTime = businessTime;
/* 261:    */   }
/* 262:    */   
/* 263:    */   public String getCategoryId()
/* 264:    */   {
/* 265:470 */     return this.categoryId;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public void setCategoryId(String categoryId)
/* 269:    */   {
/* 270:473 */     this.categoryId = categoryId;
/* 271:    */   }
/* 272:    */   
/* 273:    */   public String getCityCode()
/* 274:    */   {
/* 275:477 */     return this.cityCode;
/* 276:    */   }
/* 277:    */   
/* 278:    */   public void setCityCode(String cityCode)
/* 279:    */   {
/* 280:480 */     this.cityCode = cityCode;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public Date getClaimTime()
/* 284:    */   {
/* 285:484 */     return this.claimTime;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public void setClaimTime(Date claimTime)
/* 289:    */   {
/* 290:487 */     this.claimTime = claimTime;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public String getCompanyName()
/* 294:    */   {
/* 295:491 */     return this.companyName;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public void setCompanyName(String companyName)
/* 299:    */   {
/* 300:494 */     this.companyName = companyName;
/* 301:    */   }
/* 302:    */   
/* 303:    */   public String getContactName()
/* 304:    */   {
/* 305:498 */     return this.contactName;
/* 306:    */   }
/* 307:    */   
/* 308:    */   public void setContactName(String contactName)
/* 309:    */   {
/* 310:501 */     this.contactName = contactName;
/* 311:    */   }
/* 312:    */   
/* 313:    */   public String getContactNumber()
/* 314:    */   {
/* 315:505 */     return this.contactNumber;
/* 316:    */   }
/* 317:    */   
/* 318:    */   public void setContactNumber(String contactNumber)
/* 319:    */   {
/* 320:508 */     this.contactNumber = contactNumber;
/* 321:    */   }
/* 322:    */   
/* 323:    */   public Date getCreateTime()
/* 324:    */   {
/* 325:512 */     return this.createTime;
/* 326:    */   }
/* 327:    */   
/* 328:    */   public void setCreateTime(Date createTime)
/* 329:    */   {
/* 330:515 */     this.createTime = createTime;
/* 331:    */   }
/* 332:    */   
/* 333:    */   public List<String> getDetailImages()
/* 334:    */   {
/* 335:519 */     return this.detailImages;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public void setDetailImages(List<String> detailImages)
/* 339:    */   {
/* 340:522 */     this.detailImages = detailImages;
/* 341:    */   }
/* 342:    */   
/* 343:    */   public List<String> getDetailImagesName()
/* 344:    */   {
/* 345:526 */     return this.detailImagesName;
/* 346:    */   }
/* 347:    */   
/* 348:    */   public void setDetailImagesName(List<String> detailImagesName)
/* 349:    */   {
/* 350:529 */     this.detailImagesName = detailImagesName;
/* 351:    */   }
/* 352:    */   
/* 353:    */   public List<String> getDetailImagesUrl()
/* 354:    */   {
/* 355:533 */     return this.detailImagesUrl;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public void setDetailImagesUrl(List<String> detailImagesUrl)
/* 359:    */   {
/* 360:536 */     this.detailImagesUrl = detailImagesUrl;
/* 361:    */   }
/* 362:    */   
/* 363:    */   public String getDistrictCode()
/* 364:    */   {
/* 365:540 */     return this.districtCode;
/* 366:    */   }
/* 367:    */   
/* 368:    */   public void setDistrictCode(String districtCode)
/* 369:    */   {
/* 370:543 */     this.districtCode = districtCode;
/* 371:    */   }
/* 372:    */   
/* 373:    */   public String getExtInfo()
/* 374:    */   {
/* 375:547 */     return this.extInfo;
/* 376:    */   }
/* 377:    */   
/* 378:    */   public void setExtInfo(String extInfo)
/* 379:    */   {
/* 380:550 */     this.extInfo = extInfo;
/* 381:    */   }
/* 382:    */   
/* 383:    */   public String getImplementId()
/* 384:    */   {
/* 385:554 */     return this.implementId;
/* 386:    */   }
/* 387:    */   
/* 388:    */   public void setImplementId(String implementId)
/* 389:    */   {
/* 390:557 */     this.implementId = implementId;
/* 391:    */   }
/* 392:    */   
/* 393:    */   public String getIsComplete()
/* 394:    */   {
/* 395:561 */     return this.isComplete;
/* 396:    */   }
/* 397:    */   
/* 398:    */   public void setIsComplete(String isComplete)
/* 399:    */   {
/* 400:564 */     this.isComplete = isComplete;
/* 401:    */   }
/* 402:    */   
/* 403:    */   public String getIsHidden()
/* 404:    */   {
/* 405:568 */     return this.isHidden;
/* 406:    */   }
/* 407:    */   
/* 408:    */   public void setIsHidden(String isHidden)
/* 409:    */   {
/* 410:571 */     this.isHidden = isHidden;
/* 411:    */   }
/* 412:    */   
/* 413:    */   public String getIsOperatingOnline()
/* 414:    */   {
/* 415:575 */     return this.isOperatingOnline;
/* 416:    */   }
/* 417:    */   
/* 418:    */   public void setIsOperatingOnline(String isOperatingOnline)
/* 419:    */   {
/* 420:578 */     this.isOperatingOnline = isOperatingOnline;
/* 421:    */   }
/* 422:    */   
/* 423:    */   public String getIsSystemImport()
/* 424:    */   {
/* 425:582 */     return this.isSystemImport;
/* 426:    */   }
/* 427:    */   
/* 428:    */   public void setIsSystemImport(String isSystemImport)
/* 429:    */   {
/* 430:585 */     this.isSystemImport = isSystemImport;
/* 431:    */   }
/* 432:    */   
/* 433:    */   public Long getLatitude()
/* 434:    */   {
/* 435:589 */     return this.latitude;
/* 436:    */   }
/* 437:    */   
/* 438:    */   public void setLatitude(Long latitude)
/* 439:    */   {
/* 440:592 */     this.latitude = latitude;
/* 441:    */   }
/* 442:    */   
/* 443:    */   public String getLeadsId()
/* 444:    */   {
/* 445:596 */     return this.leadsId;
/* 446:    */   }
/* 447:    */   
/* 448:    */   public void setLeadsId(String leadsId)
/* 449:    */   {
/* 450:599 */     this.leadsId = leadsId;
/* 451:    */   }
/* 452:    */   
/* 453:    */   public String getLeadsRange()
/* 454:    */   {
/* 455:603 */     return this.leadsRange;
/* 456:    */   }
/* 457:    */   
/* 458:    */   public void setLeadsRange(String leadsRange)
/* 459:    */   {
/* 460:606 */     this.leadsRange = leadsRange;
/* 461:    */   }
/* 462:    */   
/* 463:    */   public String getLicence()
/* 464:    */   {
/* 465:610 */     return this.licence;
/* 466:    */   }
/* 467:    */   
/* 468:    */   public void setLicence(String licence)
/* 469:    */   {
/* 470:613 */     this.licence = licence;
/* 471:    */   }
/* 472:    */   
/* 473:    */   public String getLicenceCode()
/* 474:    */   {
/* 475:617 */     return this.licenceCode;
/* 476:    */   }
/* 477:    */   
/* 478:    */   public void setLicenceCode(String licenceCode)
/* 479:    */   {
/* 480:620 */     this.licenceCode = licenceCode;
/* 481:    */   }
/* 482:    */   
/* 483:    */   public String getLicenceExpires()
/* 484:    */   {
/* 485:624 */     return this.licenceExpires;
/* 486:    */   }
/* 487:    */   
/* 488:    */   public void setLicenceExpires(String licenceExpires)
/* 489:    */   {
/* 490:627 */     this.licenceExpires = licenceExpires;
/* 491:    */   }
/* 492:    */   
/* 493:    */   public String getLicenceName()
/* 494:    */   {
/* 495:631 */     return this.licenceName;
/* 496:    */   }
/* 497:    */   
/* 498:    */   public void setLicenceName(String licenceName)
/* 499:    */   {
/* 500:634 */     this.licenceName = licenceName;
/* 501:    */   }
/* 502:    */   
/* 503:    */   public String getLicenceUrl()
/* 504:    */   {
/* 505:638 */     return this.licenceUrl;
/* 506:    */   }
/* 507:    */   
/* 508:    */   public void setLicenceUrl(String licenceUrl)
/* 509:    */   {
/* 510:641 */     this.licenceUrl = licenceUrl;
/* 511:    */   }
/* 512:    */   
/* 513:    */   public Long getLongitude()
/* 514:    */   {
/* 515:645 */     return this.longitude;
/* 516:    */   }
/* 517:    */   
/* 518:    */   public void setLongitude(Long longitude)
/* 519:    */   {
/* 520:648 */     this.longitude = longitude;
/* 521:    */   }
/* 522:    */   
/* 523:    */   public String getMainImage()
/* 524:    */   {
/* 525:652 */     return this.mainImage;
/* 526:    */   }
/* 527:    */   
/* 528:    */   public void setMainImage(String mainImage)
/* 529:    */   {
/* 530:655 */     this.mainImage = mainImage;
/* 531:    */   }
/* 532:    */   
/* 533:    */   public String getMainImageName()
/* 534:    */   {
/* 535:659 */     return this.mainImageName;
/* 536:    */   }
/* 537:    */   
/* 538:    */   public void setMainImageName(String mainImageName)
/* 539:    */   {
/* 540:662 */     this.mainImageName = mainImageName;
/* 541:    */   }
/* 542:    */   
/* 543:    */   public String getMainImageUrl()
/* 544:    */   {
/* 545:666 */     return this.mainImageUrl;
/* 546:    */   }
/* 547:    */   
/* 548:    */   public void setMainImageUrl(String mainImageUrl)
/* 549:    */   {
/* 550:669 */     this.mainImageUrl = mainImageUrl;
/* 551:    */   }
/* 552:    */   
/* 553:    */   public String getMainShopName()
/* 554:    */   {
/* 555:673 */     return this.mainShopName;
/* 556:    */   }
/* 557:    */   
/* 558:    */   public void setMainShopName(String mainShopName)
/* 559:    */   {
/* 560:676 */     this.mainShopName = mainShopName;
/* 561:    */   }
/* 562:    */   
/* 563:    */   public String getMemo()
/* 564:    */   {
/* 565:680 */     return this.memo;
/* 566:    */   }
/* 567:    */   
/* 568:    */   public void setMemo(String memo)
/* 569:    */   {
/* 570:683 */     this.memo = memo;
/* 571:    */   }
/* 572:    */   
/* 573:    */   public String getNoSmoking()
/* 574:    */   {
/* 575:687 */     return this.noSmoking;
/* 576:    */   }
/* 577:    */   
/* 578:    */   public void setNoSmoking(String noSmoking)
/* 579:    */   {
/* 580:690 */     this.noSmoking = noSmoking;
/* 581:    */   }
/* 582:    */   
/* 583:    */   public String getOnlineUrl()
/* 584:    */   {
/* 585:694 */     return this.onlineUrl;
/* 586:    */   }
/* 587:    */   
/* 588:    */   public void setOnlineUrl(String onlineUrl)
/* 589:    */   {
/* 590:697 */     this.onlineUrl = onlineUrl;
/* 591:    */   }
/* 592:    */   
/* 593:    */   public String getOpId()
/* 594:    */   {
/* 595:701 */     return this.opId;
/* 596:    */   }
/* 597:    */   
/* 598:    */   public void setOpId(String opId)
/* 599:    */   {
/* 600:704 */     this.opId = opId;
/* 601:    */   }
/* 602:    */   
/* 603:    */   public String getOtherAuthorization()
/* 604:    */   {
/* 605:708 */     return this.otherAuthorization;
/* 606:    */   }
/* 607:    */   
/* 608:    */   public void setOtherAuthorization(String otherAuthorization)
/* 609:    */   {
/* 610:711 */     this.otherAuthorization = otherAuthorization;
/* 611:    */   }
/* 612:    */   
/* 613:    */   public String getOtherAuthorizationUrl()
/* 614:    */   {
/* 615:715 */     return this.otherAuthorizationUrl;
/* 616:    */   }
/* 617:    */   
/* 618:    */   public void setOtherAuthorizationUrl(String otherAuthorizationUrl)
/* 619:    */   {
/* 620:718 */     this.otherAuthorizationUrl = otherAuthorizationUrl;
/* 621:    */   }
/* 622:    */   
/* 623:    */   public String getOtherContactInfo()
/* 624:    */   {
/* 625:722 */     return this.otherContactInfo;
/* 626:    */   }
/* 627:    */   
/* 628:    */   public void setOtherContactInfo(String otherContactInfo)
/* 629:    */   {
/* 630:725 */     this.otherContactInfo = otherContactInfo;
/* 631:    */   }
/* 632:    */   
/* 633:    */   public String getParking()
/* 634:    */   {
/* 635:729 */     return this.parking;
/* 636:    */   }
/* 637:    */   
/* 638:    */   public void setParking(String parking)
/* 639:    */   {
/* 640:732 */     this.parking = parking;
/* 641:    */   }
/* 642:    */   
/* 643:    */   public String getPayType()
/* 644:    */   {
/* 645:736 */     return this.payType;
/* 646:    */   }
/* 647:    */   
/* 648:    */   public void setPayType(String payType)
/* 649:    */   {
/* 650:739 */     this.payType = payType;
/* 651:    */   }
/* 652:    */   
/* 653:    */   public String getProvinceCode()
/* 654:    */   {
/* 655:743 */     return this.provinceCode;
/* 656:    */   }
/* 657:    */   
/* 658:    */   public void setProvinceCode(String provinceCode)
/* 659:    */   {
/* 660:746 */     this.provinceCode = provinceCode;
/* 661:    */   }
/* 662:    */   
/* 663:    */   public String getRequestId()
/* 664:    */   {
/* 665:750 */     return this.requestId;
/* 666:    */   }
/* 667:    */   
/* 668:    */   public void setRequestId(String requestId)
/* 669:    */   {
/* 670:753 */     this.requestId = requestId;
/* 671:    */   }
/* 672:    */   
/* 673:    */   public String getStatus()
/* 674:    */   {
/* 675:757 */     return this.status;
/* 676:    */   }
/* 677:    */   
/* 678:    */   public void setStatus(String status)
/* 679:    */   {
/* 680:760 */     this.status = status;
/* 681:    */   }
/* 682:    */   
/* 683:    */   public String getStoreId()
/* 684:    */   {
/* 685:764 */     return this.storeId;
/* 686:    */   }
/* 687:    */   
/* 688:    */   public void setStoreId(String storeId)
/* 689:    */   {
/* 690:767 */     this.storeId = storeId;
/* 691:    */   }
/* 692:    */   
/* 693:    */   public String getValueAdded()
/* 694:    */   {
/* 695:771 */     return this.valueAdded;
/* 696:    */   }
/* 697:    */   
/* 698:    */   public void setValueAdded(String valueAdded)
/* 699:    */   {
/* 700:774 */     this.valueAdded = valueAdded;
/* 701:    */   }
/* 702:    */   
/* 703:    */   public String getWifi()
/* 704:    */   {
/* 705:778 */     return this.wifi;
/* 706:    */   }
/* 707:    */   
/* 708:    */   public void setWifi(String wifi)
/* 709:    */   {
/* 710:781 */     this.wifi = wifi;
/* 711:    */   }
/* 712:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.LeadsQueryResponse
 * JD-Core Version:    0.7.0.1
 */