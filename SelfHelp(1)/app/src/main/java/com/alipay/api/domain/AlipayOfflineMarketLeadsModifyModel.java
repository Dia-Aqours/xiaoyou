/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayOfflineMarketLeadsModifyModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2833471521961298653L;
/*  12:    */   @ApiField("address")
/*  13:    */   private String address;
/*  14:    */   @ApiField("auth_letter")
/*  15:    */   private String authLetter;
/*  16:    */   @ApiField("avg_price")
/*  17:    */   private String avgPrice;
/*  18:    */   @ApiField("box")
/*  19:    */   private String box;
/*  20:    */   @ApiField("branch_shop_name")
/*  21:    */   private String branchShopName;
/*  22:    */   @ApiField("brand_logo")
/*  23:    */   private String brandLogo;
/*  24:    */   @ApiField("brand_name")
/*  25:    */   private String brandName;
/*  26:    */   @ApiField("business_certificate")
/*  27:    */   private String businessCertificate;
/*  28:    */   @ApiField("business_certificate_expires")
/*  29:    */   private String businessCertificateExpires;
/*  30:    */   @ApiField("business_time")
/*  31:    */   private String businessTime;
/*  32:    */   @ApiField("category_id")
/*  33:    */   private String categoryId;
/*  34:    */   @ApiField("city_code")
/*  35:    */   private String cityCode;
/*  36:    */   @ApiField("company_name")
/*  37:    */   private String companyName;
/*  38:    */   @ApiField("contact_name")
/*  39:    */   private String contactName;
/*  40:    */   @ApiField("contact_number")
/*  41:    */   private String contactNumber;
/*  42:    */   @ApiListField("detail_images")
/*  43:    */   @ApiField("string")
/*  44:    */   private List<String> detailImages;
/*  45:    */   @ApiField("district_code")
/*  46:    */   private String districtCode;
/*  47:    */   @ApiField("implement_id")
/*  48:    */   private String implementId;
/*  49:    */   @ApiField("is_complete")
/*  50:    */   private String isComplete;
/*  51:    */   @ApiField("is_operating_online")
/*  52:    */   private String isOperatingOnline;
/*  53:    */   @ApiField("latitude")
/*  54:    */   private Long latitude;
/*  55:    */   @ApiField("leads_id")
/*  56:    */   private String leadsId;
/*  57:    */   @ApiField("licence")
/*  58:    */   private String licence;
/*  59:    */   @ApiField("licence_code")
/*  60:    */   private String licenceCode;
/*  61:    */   @ApiField("licence_expires")
/*  62:    */   private String licenceExpires;
/*  63:    */   @ApiField("licence_name")
/*  64:    */   private String licenceName;
/*  65:    */   @ApiField("longitude")
/*  66:    */   private Long longitude;
/*  67:    */   @ApiField("main_image")
/*  68:    */   private String mainImage;
/*  69:    */   @ApiField("main_shop_name")
/*  70:    */   private String mainShopName;
/*  71:    */   @ApiField("memo")
/*  72:    */   private String memo;
/*  73:    */   @ApiField("no_smoking")
/*  74:    */   private String noSmoking;
/*  75:    */   @ApiField("online_url")
/*  76:    */   private String onlineUrl;
/*  77:    */   @ApiField("op_id")
/*  78:    */   private String opId;
/*  79:    */   @ApiField("operate_notify_url")
/*  80:    */   private String operateNotifyUrl;
/*  81:    */   @ApiField("other_authorization")
/*  82:    */   private String otherAuthorization;
/*  83:    */   @ApiField("other_contact_info")
/*  84:    */   private String otherContactInfo;
/*  85:    */   @ApiField("parking")
/*  86:    */   private String parking;
/*  87:    */   @ApiField("pay_type")
/*  88:    */   private String payType;
/*  89:    */   @ApiField("province_code")
/*  90:    */   private String provinceCode;
/*  91:    */   @ApiField("request_id")
/*  92:    */   private String requestId;
/*  93:    */   @ApiField("store_id")
/*  94:    */   private String storeId;
/*  95:    */   @ApiField("value_added")
/*  96:    */   private String valueAdded;
/*  97:    */   @ApiField("wifi")
/*  98:    */   private String wifi;
/*  99:    */   
/* 100:    */   public String getAddress()
/* 101:    */   {
/* 102:280 */     return this.address;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setAddress(String address)
/* 106:    */   {
/* 107:283 */     this.address = address;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getAuthLetter()
/* 111:    */   {
/* 112:287 */     return this.authLetter;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setAuthLetter(String authLetter)
/* 116:    */   {
/* 117:290 */     this.authLetter = authLetter;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getAvgPrice()
/* 121:    */   {
/* 122:294 */     return this.avgPrice;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setAvgPrice(String avgPrice)
/* 126:    */   {
/* 127:297 */     this.avgPrice = avgPrice;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getBox()
/* 131:    */   {
/* 132:301 */     return this.box;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setBox(String box)
/* 136:    */   {
/* 137:304 */     this.box = box;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getBranchShopName()
/* 141:    */   {
/* 142:308 */     return this.branchShopName;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setBranchShopName(String branchShopName)
/* 146:    */   {
/* 147:311 */     this.branchShopName = branchShopName;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getBrandLogo()
/* 151:    */   {
/* 152:315 */     return this.brandLogo;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setBrandLogo(String brandLogo)
/* 156:    */   {
/* 157:318 */     this.brandLogo = brandLogo;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getBrandName()
/* 161:    */   {
/* 162:322 */     return this.brandName;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setBrandName(String brandName)
/* 166:    */   {
/* 167:325 */     this.brandName = brandName;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getBusinessCertificate()
/* 171:    */   {
/* 172:329 */     return this.businessCertificate;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setBusinessCertificate(String businessCertificate)
/* 176:    */   {
/* 177:332 */     this.businessCertificate = businessCertificate;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public String getBusinessCertificateExpires()
/* 181:    */   {
/* 182:336 */     return this.businessCertificateExpires;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setBusinessCertificateExpires(String businessCertificateExpires)
/* 186:    */   {
/* 187:339 */     this.businessCertificateExpires = businessCertificateExpires;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getBusinessTime()
/* 191:    */   {
/* 192:343 */     return this.businessTime;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setBusinessTime(String businessTime)
/* 196:    */   {
/* 197:346 */     this.businessTime = businessTime;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getCategoryId()
/* 201:    */   {
/* 202:350 */     return this.categoryId;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setCategoryId(String categoryId)
/* 206:    */   {
/* 207:353 */     this.categoryId = categoryId;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getCityCode()
/* 211:    */   {
/* 212:357 */     return this.cityCode;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setCityCode(String cityCode)
/* 216:    */   {
/* 217:360 */     this.cityCode = cityCode;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getCompanyName()
/* 221:    */   {
/* 222:364 */     return this.companyName;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setCompanyName(String companyName)
/* 226:    */   {
/* 227:367 */     this.companyName = companyName;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String getContactName()
/* 231:    */   {
/* 232:371 */     return this.contactName;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setContactName(String contactName)
/* 236:    */   {
/* 237:374 */     this.contactName = contactName;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public String getContactNumber()
/* 241:    */   {
/* 242:378 */     return this.contactNumber;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void setContactNumber(String contactNumber)
/* 246:    */   {
/* 247:381 */     this.contactNumber = contactNumber;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public List<String> getDetailImages()
/* 251:    */   {
/* 252:385 */     return this.detailImages;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void setDetailImages(List<String> detailImages)
/* 256:    */   {
/* 257:388 */     this.detailImages = detailImages;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public String getDistrictCode()
/* 261:    */   {
/* 262:392 */     return this.districtCode;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void setDistrictCode(String districtCode)
/* 266:    */   {
/* 267:395 */     this.districtCode = districtCode;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public String getImplementId()
/* 271:    */   {
/* 272:399 */     return this.implementId;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public void setImplementId(String implementId)
/* 276:    */   {
/* 277:402 */     this.implementId = implementId;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public String getIsComplete()
/* 281:    */   {
/* 282:406 */     return this.isComplete;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void setIsComplete(String isComplete)
/* 286:    */   {
/* 287:409 */     this.isComplete = isComplete;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public String getIsOperatingOnline()
/* 291:    */   {
/* 292:413 */     return this.isOperatingOnline;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public void setIsOperatingOnline(String isOperatingOnline)
/* 296:    */   {
/* 297:416 */     this.isOperatingOnline = isOperatingOnline;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public Long getLatitude()
/* 301:    */   {
/* 302:420 */     return this.latitude;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void setLatitude(Long latitude)
/* 306:    */   {
/* 307:423 */     this.latitude = latitude;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public String getLeadsId()
/* 311:    */   {
/* 312:427 */     return this.leadsId;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void setLeadsId(String leadsId)
/* 316:    */   {
/* 317:430 */     this.leadsId = leadsId;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public String getLicence()
/* 321:    */   {
/* 322:434 */     return this.licence;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public void setLicence(String licence)
/* 326:    */   {
/* 327:437 */     this.licence = licence;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public String getLicenceCode()
/* 331:    */   {
/* 332:441 */     return this.licenceCode;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public void setLicenceCode(String licenceCode)
/* 336:    */   {
/* 337:444 */     this.licenceCode = licenceCode;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public String getLicenceExpires()
/* 341:    */   {
/* 342:448 */     return this.licenceExpires;
/* 343:    */   }
/* 344:    */   
/* 345:    */   public void setLicenceExpires(String licenceExpires)
/* 346:    */   {
/* 347:451 */     this.licenceExpires = licenceExpires;
/* 348:    */   }
/* 349:    */   
/* 350:    */   public String getLicenceName()
/* 351:    */   {
/* 352:455 */     return this.licenceName;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public void setLicenceName(String licenceName)
/* 356:    */   {
/* 357:458 */     this.licenceName = licenceName;
/* 358:    */   }
/* 359:    */   
/* 360:    */   public Long getLongitude()
/* 361:    */   {
/* 362:462 */     return this.longitude;
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void setLongitude(Long longitude)
/* 366:    */   {
/* 367:465 */     this.longitude = longitude;
/* 368:    */   }
/* 369:    */   
/* 370:    */   public String getMainImage()
/* 371:    */   {
/* 372:469 */     return this.mainImage;
/* 373:    */   }
/* 374:    */   
/* 375:    */   public void setMainImage(String mainImage)
/* 376:    */   {
/* 377:472 */     this.mainImage = mainImage;
/* 378:    */   }
/* 379:    */   
/* 380:    */   public String getMainShopName()
/* 381:    */   {
/* 382:476 */     return this.mainShopName;
/* 383:    */   }
/* 384:    */   
/* 385:    */   public void setMainShopName(String mainShopName)
/* 386:    */   {
/* 387:479 */     this.mainShopName = mainShopName;
/* 388:    */   }
/* 389:    */   
/* 390:    */   public String getMemo()
/* 391:    */   {
/* 392:483 */     return this.memo;
/* 393:    */   }
/* 394:    */   
/* 395:    */   public void setMemo(String memo)
/* 396:    */   {
/* 397:486 */     this.memo = memo;
/* 398:    */   }
/* 399:    */   
/* 400:    */   public String getNoSmoking()
/* 401:    */   {
/* 402:490 */     return this.noSmoking;
/* 403:    */   }
/* 404:    */   
/* 405:    */   public void setNoSmoking(String noSmoking)
/* 406:    */   {
/* 407:493 */     this.noSmoking = noSmoking;
/* 408:    */   }
/* 409:    */   
/* 410:    */   public String getOnlineUrl()
/* 411:    */   {
/* 412:497 */     return this.onlineUrl;
/* 413:    */   }
/* 414:    */   
/* 415:    */   public void setOnlineUrl(String onlineUrl)
/* 416:    */   {
/* 417:500 */     this.onlineUrl = onlineUrl;
/* 418:    */   }
/* 419:    */   
/* 420:    */   public String getOpId()
/* 421:    */   {
/* 422:504 */     return this.opId;
/* 423:    */   }
/* 424:    */   
/* 425:    */   public void setOpId(String opId)
/* 426:    */   {
/* 427:507 */     this.opId = opId;
/* 428:    */   }
/* 429:    */   
/* 430:    */   public String getOperateNotifyUrl()
/* 431:    */   {
/* 432:511 */     return this.operateNotifyUrl;
/* 433:    */   }
/* 434:    */   
/* 435:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 436:    */   {
/* 437:514 */     this.operateNotifyUrl = operateNotifyUrl;
/* 438:    */   }
/* 439:    */   
/* 440:    */   public String getOtherAuthorization()
/* 441:    */   {
/* 442:518 */     return this.otherAuthorization;
/* 443:    */   }
/* 444:    */   
/* 445:    */   public void setOtherAuthorization(String otherAuthorization)
/* 446:    */   {
/* 447:521 */     this.otherAuthorization = otherAuthorization;
/* 448:    */   }
/* 449:    */   
/* 450:    */   public String getOtherContactInfo()
/* 451:    */   {
/* 452:525 */     return this.otherContactInfo;
/* 453:    */   }
/* 454:    */   
/* 455:    */   public void setOtherContactInfo(String otherContactInfo)
/* 456:    */   {
/* 457:528 */     this.otherContactInfo = otherContactInfo;
/* 458:    */   }
/* 459:    */   
/* 460:    */   public String getParking()
/* 461:    */   {
/* 462:532 */     return this.parking;
/* 463:    */   }
/* 464:    */   
/* 465:    */   public void setParking(String parking)
/* 466:    */   {
/* 467:535 */     this.parking = parking;
/* 468:    */   }
/* 469:    */   
/* 470:    */   public String getPayType()
/* 471:    */   {
/* 472:539 */     return this.payType;
/* 473:    */   }
/* 474:    */   
/* 475:    */   public void setPayType(String payType)
/* 476:    */   {
/* 477:542 */     this.payType = payType;
/* 478:    */   }
/* 479:    */   
/* 480:    */   public String getProvinceCode()
/* 481:    */   {
/* 482:546 */     return this.provinceCode;
/* 483:    */   }
/* 484:    */   
/* 485:    */   public void setProvinceCode(String provinceCode)
/* 486:    */   {
/* 487:549 */     this.provinceCode = provinceCode;
/* 488:    */   }
/* 489:    */   
/* 490:    */   public String getRequestId()
/* 491:    */   {
/* 492:553 */     return this.requestId;
/* 493:    */   }
/* 494:    */   
/* 495:    */   public void setRequestId(String requestId)
/* 496:    */   {
/* 497:556 */     this.requestId = requestId;
/* 498:    */   }
/* 499:    */   
/* 500:    */   public String getStoreId()
/* 501:    */   {
/* 502:560 */     return this.storeId;
/* 503:    */   }
/* 504:    */   
/* 505:    */   public void setStoreId(String storeId)
/* 506:    */   {
/* 507:563 */     this.storeId = storeId;
/* 508:    */   }
/* 509:    */   
/* 510:    */   public String getValueAdded()
/* 511:    */   {
/* 512:567 */     return this.valueAdded;
/* 513:    */   }
/* 514:    */   
/* 515:    */   public void setValueAdded(String valueAdded)
/* 516:    */   {
/* 517:570 */     this.valueAdded = valueAdded;
/* 518:    */   }
/* 519:    */   
/* 520:    */   public String getWifi()
/* 521:    */   {
/* 522:574 */     return this.wifi;
/* 523:    */   }
/* 524:    */   
/* 525:    */   public void setWifi(String wifi)
/* 526:    */   {
/* 527:577 */     this.wifi = wifi;
/* 528:    */   }
/* 529:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketLeadsModifyModel
 * JD-Core Version:    0.7.0.1
 */