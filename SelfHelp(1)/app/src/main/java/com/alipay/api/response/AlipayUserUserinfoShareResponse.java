/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.DeliverAddress;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayUserUserinfoShareResponse
/*  10:    */   extends AlipayResponse
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 5757266137161818576L;
/*  13:    */   @ApiField("address")
/*  14:    */   private String address;
/*  15:    */   @ApiField("address_code")
/*  16:    */   private String addressCode;
/*  17:    */   @ApiField("alipay_user_id")
/*  18:    */   private String alipayUserId;
/*  19:    */   @ApiField("area")
/*  20:    */   private String area;
/*  21:    */   @ApiField("avatar")
/*  22:    */   private String avatar;
/*  23:    */   @ApiField("balance_freeze_type")
/*  24:    */   private String balanceFreezeType;
/*  25:    */   @ApiField("birthday")
/*  26:    */   private String birthday;
/*  27:    */   @ApiField("cert_no")
/*  28:    */   private String certNo;
/*  29:    */   @ApiField("cert_type_value")
/*  30:    */   private String certTypeValue;
/*  31:    */   @ApiField("city")
/*  32:    */   private String city;
/*  33:    */   @ApiField("default_deliver_address")
/*  34:    */   private String defaultDeliverAddress;
/*  35:    */   @ApiListField("deliver_address_list")
/*  36:    */   @ApiField("deliver_address")
/*  37:    */   private List<DeliverAddress> deliverAddressList;
/*  38:    */   @ApiField("deliver_area")
/*  39:    */   private String deliverArea;
/*  40:    */   @ApiField("deliver_city")
/*  41:    */   private String deliverCity;
/*  42:    */   @ApiField("deliver_fullname")
/*  43:    */   private String deliverFullname;
/*  44:    */   @ApiField("deliver_mobile")
/*  45:    */   private String deliverMobile;
/*  46:    */   @ApiField("deliver_phone")
/*  47:    */   private String deliverPhone;
/*  48:    */   @ApiField("deliver_province")
/*  49:    */   private String deliverProvince;
/*  50:    */   @ApiField("email")
/*  51:    */   private String email;
/*  52:    */   @ApiField("family_name")
/*  53:    */   private String familyName;
/*  54:    */   @ApiField("firm_name")
/*  55:    */   private String firmName;
/*  56:    */   @ApiField("gender")
/*  57:    */   private String gender;
/*  58:    */   @ApiField("is_balance_frozen")
/*  59:    */   private String isBalanceFrozen;
/*  60:    */   @ApiField("is_bank_auth")
/*  61:    */   private String isBankAuth;
/*  62:    */   @ApiField("is_certified")
/*  63:    */   private String isCertified;
/*  64:    */   @ApiField("is_certify_grade_a")
/*  65:    */   private String isCertifyGradeA;
/*  66:    */   @ApiField("is_id_auth")
/*  67:    */   private String isIdAuth;
/*  68:    */   @ApiField("is_licence_auth")
/*  69:    */   private String isLicenceAuth;
/*  70:    */   @ApiField("is_mobile_auth")
/*  71:    */   private String isMobileAuth;
/*  72:    */   @ApiField("is_student_certified")
/*  73:    */   private String isStudentCertified;
/*  74:    */   @ApiField("mobile")
/*  75:    */   private String mobile;
/*  76:    */   @ApiField("nick_name")
/*  77:    */   private String nickName;
/*  78:    */   @ApiField("phone")
/*  79:    */   private String phone;
/*  80:    */   @ApiField("province")
/*  81:    */   private String province;
/*  82:    */   @ApiField("real_name")
/*  83:    */   private String realName;
/*  84:    */   @ApiField("reduced_birthday")
/*  85:    */   private String reducedBirthday;
/*  86:    */   @ApiField("user_id")
/*  87:    */   private String userId;
/*  88:    */   @ApiField("user_status")
/*  89:    */   private String userStatus;
/*  90:    */   @ApiField("user_type_value")
/*  91:    */   private String userTypeValue;
/*  92:    */   @ApiField("zip")
/*  93:    */   private String zip;
/*  94:    */   
/*  95:    */   public void setAddress(String address)
/*  96:    */   {
/*  97:285 */     this.address = address;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getAddress()
/* 101:    */   {
/* 102:288 */     return this.address;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setAddressCode(String addressCode)
/* 106:    */   {
/* 107:292 */     this.addressCode = addressCode;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getAddressCode()
/* 111:    */   {
/* 112:295 */     return this.addressCode;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setAlipayUserId(String alipayUserId)
/* 116:    */   {
/* 117:299 */     this.alipayUserId = alipayUserId;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getAlipayUserId()
/* 121:    */   {
/* 122:302 */     return this.alipayUserId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setArea(String area)
/* 126:    */   {
/* 127:306 */     this.area = area;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getArea()
/* 131:    */   {
/* 132:309 */     return this.area;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setAvatar(String avatar)
/* 136:    */   {
/* 137:313 */     this.avatar = avatar;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getAvatar()
/* 141:    */   {
/* 142:316 */     return this.avatar;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setBalanceFreezeType(String balanceFreezeType)
/* 146:    */   {
/* 147:320 */     this.balanceFreezeType = balanceFreezeType;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getBalanceFreezeType()
/* 151:    */   {
/* 152:323 */     return this.balanceFreezeType;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setBirthday(String birthday)
/* 156:    */   {
/* 157:327 */     this.birthday = birthday;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getBirthday()
/* 161:    */   {
/* 162:330 */     return this.birthday;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setCertNo(String certNo)
/* 166:    */   {
/* 167:334 */     this.certNo = certNo;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getCertNo()
/* 171:    */   {
/* 172:337 */     return this.certNo;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setCertTypeValue(String certTypeValue)
/* 176:    */   {
/* 177:341 */     this.certTypeValue = certTypeValue;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public String getCertTypeValue()
/* 181:    */   {
/* 182:344 */     return this.certTypeValue;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setCity(String city)
/* 186:    */   {
/* 187:348 */     this.city = city;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getCity()
/* 191:    */   {
/* 192:351 */     return this.city;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setDefaultDeliverAddress(String defaultDeliverAddress)
/* 196:    */   {
/* 197:355 */     this.defaultDeliverAddress = defaultDeliverAddress;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getDefaultDeliverAddress()
/* 201:    */   {
/* 202:358 */     return this.defaultDeliverAddress;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setDeliverAddressList(List<DeliverAddress> deliverAddressList)
/* 206:    */   {
/* 207:362 */     this.deliverAddressList = deliverAddressList;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public List<DeliverAddress> getDeliverAddressList()
/* 211:    */   {
/* 212:365 */     return this.deliverAddressList;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setDeliverArea(String deliverArea)
/* 216:    */   {
/* 217:369 */     this.deliverArea = deliverArea;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getDeliverArea()
/* 221:    */   {
/* 222:372 */     return this.deliverArea;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setDeliverCity(String deliverCity)
/* 226:    */   {
/* 227:376 */     this.deliverCity = deliverCity;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String getDeliverCity()
/* 231:    */   {
/* 232:379 */     return this.deliverCity;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setDeliverFullname(String deliverFullname)
/* 236:    */   {
/* 237:383 */     this.deliverFullname = deliverFullname;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public String getDeliverFullname()
/* 241:    */   {
/* 242:386 */     return this.deliverFullname;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void setDeliverMobile(String deliverMobile)
/* 246:    */   {
/* 247:390 */     this.deliverMobile = deliverMobile;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public String getDeliverMobile()
/* 251:    */   {
/* 252:393 */     return this.deliverMobile;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void setDeliverPhone(String deliverPhone)
/* 256:    */   {
/* 257:397 */     this.deliverPhone = deliverPhone;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public String getDeliverPhone()
/* 261:    */   {
/* 262:400 */     return this.deliverPhone;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void setDeliverProvince(String deliverProvince)
/* 266:    */   {
/* 267:404 */     this.deliverProvince = deliverProvince;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public String getDeliverProvince()
/* 271:    */   {
/* 272:407 */     return this.deliverProvince;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public void setEmail(String email)
/* 276:    */   {
/* 277:411 */     this.email = email;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public String getEmail()
/* 281:    */   {
/* 282:414 */     return this.email;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void setFamilyName(String familyName)
/* 286:    */   {
/* 287:418 */     this.familyName = familyName;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public String getFamilyName()
/* 291:    */   {
/* 292:421 */     return this.familyName;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public void setFirmName(String firmName)
/* 296:    */   {
/* 297:425 */     this.firmName = firmName;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public String getFirmName()
/* 301:    */   {
/* 302:428 */     return this.firmName;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void setGender(String gender)
/* 306:    */   {
/* 307:432 */     this.gender = gender;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public String getGender()
/* 311:    */   {
/* 312:435 */     return this.gender;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void setIsBalanceFrozen(String isBalanceFrozen)
/* 316:    */   {
/* 317:439 */     this.isBalanceFrozen = isBalanceFrozen;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public String getIsBalanceFrozen()
/* 321:    */   {
/* 322:442 */     return this.isBalanceFrozen;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public void setIsBankAuth(String isBankAuth)
/* 326:    */   {
/* 327:446 */     this.isBankAuth = isBankAuth;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public String getIsBankAuth()
/* 331:    */   {
/* 332:449 */     return this.isBankAuth;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public void setIsCertified(String isCertified)
/* 336:    */   {
/* 337:453 */     this.isCertified = isCertified;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public String getIsCertified()
/* 341:    */   {
/* 342:456 */     return this.isCertified;
/* 343:    */   }
/* 344:    */   
/* 345:    */   public void setIsCertifyGradeA(String isCertifyGradeA)
/* 346:    */   {
/* 347:460 */     this.isCertifyGradeA = isCertifyGradeA;
/* 348:    */   }
/* 349:    */   
/* 350:    */   public String getIsCertifyGradeA()
/* 351:    */   {
/* 352:463 */     return this.isCertifyGradeA;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public void setIsIdAuth(String isIdAuth)
/* 356:    */   {
/* 357:467 */     this.isIdAuth = isIdAuth;
/* 358:    */   }
/* 359:    */   
/* 360:    */   public String getIsIdAuth()
/* 361:    */   {
/* 362:470 */     return this.isIdAuth;
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void setIsLicenceAuth(String isLicenceAuth)
/* 366:    */   {
/* 367:474 */     this.isLicenceAuth = isLicenceAuth;
/* 368:    */   }
/* 369:    */   
/* 370:    */   public String getIsLicenceAuth()
/* 371:    */   {
/* 372:477 */     return this.isLicenceAuth;
/* 373:    */   }
/* 374:    */   
/* 375:    */   public void setIsMobileAuth(String isMobileAuth)
/* 376:    */   {
/* 377:481 */     this.isMobileAuth = isMobileAuth;
/* 378:    */   }
/* 379:    */   
/* 380:    */   public String getIsMobileAuth()
/* 381:    */   {
/* 382:484 */     return this.isMobileAuth;
/* 383:    */   }
/* 384:    */   
/* 385:    */   public void setIsStudentCertified(String isStudentCertified)
/* 386:    */   {
/* 387:488 */     this.isStudentCertified = isStudentCertified;
/* 388:    */   }
/* 389:    */   
/* 390:    */   public String getIsStudentCertified()
/* 391:    */   {
/* 392:491 */     return this.isStudentCertified;
/* 393:    */   }
/* 394:    */   
/* 395:    */   public void setMobile(String mobile)
/* 396:    */   {
/* 397:495 */     this.mobile = mobile;
/* 398:    */   }
/* 399:    */   
/* 400:    */   public String getMobile()
/* 401:    */   {
/* 402:498 */     return this.mobile;
/* 403:    */   }
/* 404:    */   
/* 405:    */   public void setNickName(String nickName)
/* 406:    */   {
/* 407:502 */     this.nickName = nickName;
/* 408:    */   }
/* 409:    */   
/* 410:    */   public String getNickName()
/* 411:    */   {
/* 412:505 */     return this.nickName;
/* 413:    */   }
/* 414:    */   
/* 415:    */   public void setPhone(String phone)
/* 416:    */   {
/* 417:509 */     this.phone = phone;
/* 418:    */   }
/* 419:    */   
/* 420:    */   public String getPhone()
/* 421:    */   {
/* 422:512 */     return this.phone;
/* 423:    */   }
/* 424:    */   
/* 425:    */   public void setProvince(String province)
/* 426:    */   {
/* 427:516 */     this.province = province;
/* 428:    */   }
/* 429:    */   
/* 430:    */   public String getProvince()
/* 431:    */   {
/* 432:519 */     return this.province;
/* 433:    */   }
/* 434:    */   
/* 435:    */   public void setRealName(String realName)
/* 436:    */   {
/* 437:523 */     this.realName = realName;
/* 438:    */   }
/* 439:    */   
/* 440:    */   public String getRealName()
/* 441:    */   {
/* 442:526 */     return this.realName;
/* 443:    */   }
/* 444:    */   
/* 445:    */   public void setReducedBirthday(String reducedBirthday)
/* 446:    */   {
/* 447:530 */     this.reducedBirthday = reducedBirthday;
/* 448:    */   }
/* 449:    */   
/* 450:    */   public String getReducedBirthday()
/* 451:    */   {
/* 452:533 */     return this.reducedBirthday;
/* 453:    */   }
/* 454:    */   
/* 455:    */   public void setUserId(String userId)
/* 456:    */   {
/* 457:537 */     this.userId = userId;
/* 458:    */   }
/* 459:    */   
/* 460:    */   public String getUserId()
/* 461:    */   {
/* 462:540 */     return this.userId;
/* 463:    */   }
/* 464:    */   
/* 465:    */   public void setUserStatus(String userStatus)
/* 466:    */   {
/* 467:544 */     this.userStatus = userStatus;
/* 468:    */   }
/* 469:    */   
/* 470:    */   public String getUserStatus()
/* 471:    */   {
/* 472:547 */     return this.userStatus;
/* 473:    */   }
/* 474:    */   
/* 475:    */   public void setUserTypeValue(String userTypeValue)
/* 476:    */   {
/* 477:551 */     this.userTypeValue = userTypeValue;
/* 478:    */   }
/* 479:    */   
/* 480:    */   public String getUserTypeValue()
/* 481:    */   {
/* 482:554 */     return this.userTypeValue;
/* 483:    */   }
/* 484:    */   
/* 485:    */   public void setZip(String zip)
/* 486:    */   {
/* 487:558 */     this.zip = zip;
/* 488:    */   }
/* 489:    */   
/* 490:    */   public String getZip()
/* 491:    */   {
/* 492:561 */     return this.zip;
/* 493:    */   }
/* 494:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayUserUserinfoShareResponse
 * JD-Core Version:    0.7.0.1
 */