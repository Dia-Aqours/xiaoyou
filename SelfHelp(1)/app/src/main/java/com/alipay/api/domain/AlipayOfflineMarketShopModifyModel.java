/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayOfflineMarketShopModifyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7438776432124367159L;
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
/*  40:    */   @ApiField("district_code")
/*  41:    */   private String districtCode;
/*  42:    */   @ApiField("implement_id")
/*  43:    */   private String implementId;
/*  44:    */   @ApiField("is_operating_online")
/*  45:    */   private String isOperatingOnline;
/*  46:    */   @ApiField("is_show")
/*  47:    */   private String isShow;
/*  48:    */   @ApiField("latitude")
/*  49:    */   private String latitude;
/*  50:    */   @ApiField("licence")
/*  51:    */   private String licence;
/*  52:    */   @ApiField("licence_code")
/*  53:    */   private String licenceCode;
/*  54:    */   @ApiField("licence_expires")
/*  55:    */   private String licenceExpires;
/*  56:    */   @ApiField("licence_name")
/*  57:    */   private String licenceName;
/*  58:    */   @ApiField("longitude")
/*  59:    */   private String longitude;
/*  60:    */   @ApiField("main_image")
/*  61:    */   private String mainImage;
/*  62:    */   @ApiField("main_shop_name")
/*  63:    */   private String mainShopName;
/*  64:    */   @ApiField("no_smoking")
/*  65:    */   private String noSmoking;
/*  66:    */   @ApiField("notify_mobile")
/*  67:    */   private String notifyMobile;
/*  68:    */   @ApiField("online_image")
/*  69:    */   private String onlineImage;
/*  70:    */   @ApiField("online_url")
/*  71:    */   private String onlineUrl;
/*  72:    */   @ApiField("op_id")
/*  73:    */   private String opId;
/*  74:    */   @ApiField("op_role")
/*  75:    */   private String opRole;
/*  76:    */   @ApiField("operate_notify_url")
/*  77:    */   private String operateNotifyUrl;
/*  78:    */   @ApiField("other_authorization")
/*  79:    */   private String otherAuthorization;
/*  80:    */   @ApiField("parking")
/*  81:    */   private String parking;
/*  82:    */   @ApiField("partner_id")
/*  83:    */   private String partnerId;
/*  84:    */   @ApiField("pay_type")
/*  85:    */   private String payType;
/*  86:    */   @ApiField("province_code")
/*  87:    */   private String provinceCode;
/*  88:    */   @ApiField("request_id")
/*  89:    */   private String requestId;
/*  90:    */   @ApiField("shop_id")
/*  91:    */   private String shopId;
/*  92:    */   @ApiField("store_id")
/*  93:    */   private String storeId;
/*  94:    */   @ApiField("value_added")
/*  95:    */   private String valueAdded;
/*  96:    */   @ApiField("version")
/*  97:    */   private String version;
/*  98:    */   @ApiField("wifi")
/*  99:    */   private String wifi;
/* 100:    */   
/* 101:    */   public String getAddress()
/* 102:    */   {
/* 103:289 */     return this.address;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setAddress(String address)
/* 107:    */   {
/* 108:292 */     this.address = address;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getAuditImages()
/* 112:    */   {
/* 113:296 */     return this.auditImages;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setAuditImages(String auditImages)
/* 117:    */   {
/* 118:299 */     this.auditImages = auditImages;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getAuthLetter()
/* 122:    */   {
/* 123:303 */     return this.authLetter;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setAuthLetter(String authLetter)
/* 127:    */   {
/* 128:306 */     this.authLetter = authLetter;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getAvgPrice()
/* 132:    */   {
/* 133:310 */     return this.avgPrice;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setAvgPrice(String avgPrice)
/* 137:    */   {
/* 138:313 */     this.avgPrice = avgPrice;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getBizVersion()
/* 142:    */   {
/* 143:317 */     return this.bizVersion;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setBizVersion(String bizVersion)
/* 147:    */   {
/* 148:320 */     this.bizVersion = bizVersion;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getBox()
/* 152:    */   {
/* 153:324 */     return this.box;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setBox(String box)
/* 157:    */   {
/* 158:327 */     this.box = box;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getBranchShopName()
/* 162:    */   {
/* 163:331 */     return this.branchShopName;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setBranchShopName(String branchShopName)
/* 167:    */   {
/* 168:334 */     this.branchShopName = branchShopName;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getBrandLogo()
/* 172:    */   {
/* 173:338 */     return this.brandLogo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setBrandLogo(String brandLogo)
/* 177:    */   {
/* 178:341 */     this.brandLogo = brandLogo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getBrandName()
/* 182:    */   {
/* 183:345 */     return this.brandName;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setBrandName(String brandName)
/* 187:    */   {
/* 188:348 */     this.brandName = brandName;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getBusinessCertificate()
/* 192:    */   {
/* 193:352 */     return this.businessCertificate;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setBusinessCertificate(String businessCertificate)
/* 197:    */   {
/* 198:355 */     this.businessCertificate = businessCertificate;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String getBusinessCertificateExpires()
/* 202:    */   {
/* 203:359 */     return this.businessCertificateExpires;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setBusinessCertificateExpires(String businessCertificateExpires)
/* 207:    */   {
/* 208:362 */     this.businessCertificateExpires = businessCertificateExpires;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getBusinessTime()
/* 212:    */   {
/* 213:366 */     return this.businessTime;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void setBusinessTime(String businessTime)
/* 217:    */   {
/* 218:369 */     this.businessTime = businessTime;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public String getCategoryId()
/* 222:    */   {
/* 223:373 */     return this.categoryId;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void setCategoryId(String categoryId)
/* 227:    */   {
/* 228:376 */     this.categoryId = categoryId;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public String getCityCode()
/* 232:    */   {
/* 233:380 */     return this.cityCode;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public void setCityCode(String cityCode)
/* 237:    */   {
/* 238:383 */     this.cityCode = cityCode;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public String getContactNumber()
/* 242:    */   {
/* 243:387 */     return this.contactNumber;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void setContactNumber(String contactNumber)
/* 247:    */   {
/* 248:390 */     this.contactNumber = contactNumber;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public String getDistrictCode()
/* 252:    */   {
/* 253:394 */     return this.districtCode;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public void setDistrictCode(String districtCode)
/* 257:    */   {
/* 258:397 */     this.districtCode = districtCode;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public String getImplementId()
/* 262:    */   {
/* 263:401 */     return this.implementId;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void setImplementId(String implementId)
/* 267:    */   {
/* 268:404 */     this.implementId = implementId;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public String getIsOperatingOnline()
/* 272:    */   {
/* 273:408 */     return this.isOperatingOnline;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public void setIsOperatingOnline(String isOperatingOnline)
/* 277:    */   {
/* 278:411 */     this.isOperatingOnline = isOperatingOnline;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public String getIsShow()
/* 282:    */   {
/* 283:415 */     return this.isShow;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public void setIsShow(String isShow)
/* 287:    */   {
/* 288:418 */     this.isShow = isShow;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public String getLatitude()
/* 292:    */   {
/* 293:422 */     return this.latitude;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public void setLatitude(String latitude)
/* 297:    */   {
/* 298:425 */     this.latitude = latitude;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public String getLicence()
/* 302:    */   {
/* 303:429 */     return this.licence;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public void setLicence(String licence)
/* 307:    */   {
/* 308:432 */     this.licence = licence;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public String getLicenceCode()
/* 312:    */   {
/* 313:436 */     return this.licenceCode;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public void setLicenceCode(String licenceCode)
/* 317:    */   {
/* 318:439 */     this.licenceCode = licenceCode;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public String getLicenceExpires()
/* 322:    */   {
/* 323:443 */     return this.licenceExpires;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void setLicenceExpires(String licenceExpires)
/* 327:    */   {
/* 328:446 */     this.licenceExpires = licenceExpires;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public String getLicenceName()
/* 332:    */   {
/* 333:450 */     return this.licenceName;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public void setLicenceName(String licenceName)
/* 337:    */   {
/* 338:453 */     this.licenceName = licenceName;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public String getLongitude()
/* 342:    */   {
/* 343:457 */     return this.longitude;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public void setLongitude(String longitude)
/* 347:    */   {
/* 348:460 */     this.longitude = longitude;
/* 349:    */   }
/* 350:    */   
/* 351:    */   public String getMainImage()
/* 352:    */   {
/* 353:464 */     return this.mainImage;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public void setMainImage(String mainImage)
/* 357:    */   {
/* 358:467 */     this.mainImage = mainImage;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public String getMainShopName()
/* 362:    */   {
/* 363:471 */     return this.mainShopName;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public void setMainShopName(String mainShopName)
/* 367:    */   {
/* 368:474 */     this.mainShopName = mainShopName;
/* 369:    */   }
/* 370:    */   
/* 371:    */   public String getNoSmoking()
/* 372:    */   {
/* 373:478 */     return this.noSmoking;
/* 374:    */   }
/* 375:    */   
/* 376:    */   public void setNoSmoking(String noSmoking)
/* 377:    */   {
/* 378:481 */     this.noSmoking = noSmoking;
/* 379:    */   }
/* 380:    */   
/* 381:    */   public String getNotifyMobile()
/* 382:    */   {
/* 383:485 */     return this.notifyMobile;
/* 384:    */   }
/* 385:    */   
/* 386:    */   public void setNotifyMobile(String notifyMobile)
/* 387:    */   {
/* 388:488 */     this.notifyMobile = notifyMobile;
/* 389:    */   }
/* 390:    */   
/* 391:    */   public String getOnlineImage()
/* 392:    */   {
/* 393:492 */     return this.onlineImage;
/* 394:    */   }
/* 395:    */   
/* 396:    */   public void setOnlineImage(String onlineImage)
/* 397:    */   {
/* 398:495 */     this.onlineImage = onlineImage;
/* 399:    */   }
/* 400:    */   
/* 401:    */   public String getOnlineUrl()
/* 402:    */   {
/* 403:499 */     return this.onlineUrl;
/* 404:    */   }
/* 405:    */   
/* 406:    */   public void setOnlineUrl(String onlineUrl)
/* 407:    */   {
/* 408:502 */     this.onlineUrl = onlineUrl;
/* 409:    */   }
/* 410:    */   
/* 411:    */   public String getOpId()
/* 412:    */   {
/* 413:506 */     return this.opId;
/* 414:    */   }
/* 415:    */   
/* 416:    */   public void setOpId(String opId)
/* 417:    */   {
/* 418:509 */     this.opId = opId;
/* 419:    */   }
/* 420:    */   
/* 421:    */   public String getOpRole()
/* 422:    */   {
/* 423:513 */     return this.opRole;
/* 424:    */   }
/* 425:    */   
/* 426:    */   public void setOpRole(String opRole)
/* 427:    */   {
/* 428:516 */     this.opRole = opRole;
/* 429:    */   }
/* 430:    */   
/* 431:    */   public String getOperateNotifyUrl()
/* 432:    */   {
/* 433:520 */     return this.operateNotifyUrl;
/* 434:    */   }
/* 435:    */   
/* 436:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 437:    */   {
/* 438:523 */     this.operateNotifyUrl = operateNotifyUrl;
/* 439:    */   }
/* 440:    */   
/* 441:    */   public String getOtherAuthorization()
/* 442:    */   {
/* 443:527 */     return this.otherAuthorization;
/* 444:    */   }
/* 445:    */   
/* 446:    */   public void setOtherAuthorization(String otherAuthorization)
/* 447:    */   {
/* 448:530 */     this.otherAuthorization = otherAuthorization;
/* 449:    */   }
/* 450:    */   
/* 451:    */   public String getParking()
/* 452:    */   {
/* 453:534 */     return this.parking;
/* 454:    */   }
/* 455:    */   
/* 456:    */   public void setParking(String parking)
/* 457:    */   {
/* 458:537 */     this.parking = parking;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public String getPartnerId()
/* 462:    */   {
/* 463:541 */     return this.partnerId;
/* 464:    */   }
/* 465:    */   
/* 466:    */   public void setPartnerId(String partnerId)
/* 467:    */   {
/* 468:544 */     this.partnerId = partnerId;
/* 469:    */   }
/* 470:    */   
/* 471:    */   public String getPayType()
/* 472:    */   {
/* 473:548 */     return this.payType;
/* 474:    */   }
/* 475:    */   
/* 476:    */   public void setPayType(String payType)
/* 477:    */   {
/* 478:551 */     this.payType = payType;
/* 479:    */   }
/* 480:    */   
/* 481:    */   public String getProvinceCode()
/* 482:    */   {
/* 483:555 */     return this.provinceCode;
/* 484:    */   }
/* 485:    */   
/* 486:    */   public void setProvinceCode(String provinceCode)
/* 487:    */   {
/* 488:558 */     this.provinceCode = provinceCode;
/* 489:    */   }
/* 490:    */   
/* 491:    */   public String getRequestId()
/* 492:    */   {
/* 493:562 */     return this.requestId;
/* 494:    */   }
/* 495:    */   
/* 496:    */   public void setRequestId(String requestId)
/* 497:    */   {
/* 498:565 */     this.requestId = requestId;
/* 499:    */   }
/* 500:    */   
/* 501:    */   public String getShopId()
/* 502:    */   {
/* 503:569 */     return this.shopId;
/* 504:    */   }
/* 505:    */   
/* 506:    */   public void setShopId(String shopId)
/* 507:    */   {
/* 508:572 */     this.shopId = shopId;
/* 509:    */   }
/* 510:    */   
/* 511:    */   public String getStoreId()
/* 512:    */   {
/* 513:576 */     return this.storeId;
/* 514:    */   }
/* 515:    */   
/* 516:    */   public void setStoreId(String storeId)
/* 517:    */   {
/* 518:579 */     this.storeId = storeId;
/* 519:    */   }
/* 520:    */   
/* 521:    */   public String getValueAdded()
/* 522:    */   {
/* 523:583 */     return this.valueAdded;
/* 524:    */   }
/* 525:    */   
/* 526:    */   public void setValueAdded(String valueAdded)
/* 527:    */   {
/* 528:586 */     this.valueAdded = valueAdded;
/* 529:    */   }
/* 530:    */   
/* 531:    */   public String getVersion()
/* 532:    */   {
/* 533:590 */     return this.version;
/* 534:    */   }
/* 535:    */   
/* 536:    */   public void setVersion(String version)
/* 537:    */   {
/* 538:593 */     this.version = version;
/* 539:    */   }
/* 540:    */   
/* 541:    */   public String getWifi()
/* 542:    */   {
/* 543:597 */     return this.wifi;
/* 544:    */   }
/* 545:    */   
/* 546:    */   public void setWifi(String wifi)
/* 547:    */   {
/* 548:600 */     this.wifi = wifi;
/* 549:    */   }
/* 550:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketShopModifyModel
 * JD-Core Version:    0.7.0.1
 */