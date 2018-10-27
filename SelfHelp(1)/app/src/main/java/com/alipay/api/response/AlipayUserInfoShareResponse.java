/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.AlipayUserDeliverAddress;
/*   5:    */ import com.alipay.api.domain.AlipayUserPicture;
/*   6:    */ import com.alipay.api.internal.mapping.ApiField;
/*   7:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   8:    */ import java.util.List;
/*   9:    */ 
/*  10:    */ public class AlipayUserInfoShareResponse
/*  11:    */   extends AlipayResponse
/*  12:    */ {
/*  13:    */   private static final long serialVersionUID = 6648837638481633658L;
/*  14:    */   @ApiField("address")
/*  15:    */   private String address;
/*  16:    */   @ApiField("area")
/*  17:    */   private String area;
/*  18:    */   @ApiField("avatar")
/*  19:    */   private String avatar;
/*  20:    */   @ApiField("business_scope")
/*  21:    */   private String businessScope;
/*  22:    */   @ApiField("cert_no")
/*  23:    */   private String certNo;
/*  24:    */   @ApiField("cert_type")
/*  25:    */   private String certType;
/*  26:    */   @ApiField("city")
/*  27:    */   private String city;
/*  28:    */   @ApiListField("deliver_addresses")
/*  29:    */   @ApiField("alipay_user_deliver_address")
/*  30:    */   private List<AlipayUserDeliverAddress> deliverAddresses;
/*  31:    */   @ApiField("email")
/*  32:    */   private String email;
/*  33:    */   @ApiField("firm_agent_person_cert_expiry_date")
/*  34:    */   private String firmAgentPersonCertExpiryDate;
/*  35:    */   @ApiField("firm_agent_person_cert_no")
/*  36:    */   private String firmAgentPersonCertNo;
/*  37:    */   @ApiField("firm_agent_person_cert_type")
/*  38:    */   private String firmAgentPersonCertType;
/*  39:    */   @ApiField("firm_agent_person_name")
/*  40:    */   private String firmAgentPersonName;
/*  41:    */   @ApiField("firm_legal_person_cert_expiry_date")
/*  42:    */   private String firmLegalPersonCertExpiryDate;
/*  43:    */   @ApiField("firm_legal_person_cert_no")
/*  44:    */   private String firmLegalPersonCertNo;
/*  45:    */   @ApiField("firm_legal_person_cert_type")
/*  46:    */   private String firmLegalPersonCertType;
/*  47:    */   @ApiField("firm_legal_person_name")
/*  48:    */   private String firmLegalPersonName;
/*  49:    */   @ApiListField("firm_legal_person_pictures")
/*  50:    */   @ApiField("alipay_user_picture")
/*  51:    */   private List<AlipayUserPicture> firmLegalPersonPictures;
/*  52:    */   @ApiListField("firm_pictures")
/*  53:    */   @ApiField("alipay_user_picture")
/*  54:    */   private List<AlipayUserPicture> firmPictures;
/*  55:    */   @ApiField("firm_type")
/*  56:    */   private String firmType;
/*  57:    */   @ApiField("gender")
/*  58:    */   private String gender;
/*  59:    */   @ApiField("is_balance_frozen")
/*  60:    */   private String isBalanceFrozen;
/*  61:    */   @ApiField("is_certified")
/*  62:    */   private String isCertified;
/*  63:    */   @ApiField("is_student_certified")
/*  64:    */   private String isStudentCertified;
/*  65:    */   @ApiField("license_expiry_date")
/*  66:    */   private String licenseExpiryDate;
/*  67:    */   @ApiField("license_no")
/*  68:    */   private String licenseNo;
/*  69:    */   @ApiField("mobile")
/*  70:    */   private String mobile;
/*  71:    */   @ApiField("nick_name")
/*  72:    */   private String nickName;
/*  73:    */   @ApiField("organization_code")
/*  74:    */   private String organizationCode;
/*  75:    */   @ApiField("person_birthday")
/*  76:    */   private String personBirthday;
/*  77:    */   @ApiField("person_cert_expiry_date")
/*  78:    */   private String personCertExpiryDate;
/*  79:    */   @ApiListField("person_pictures")
/*  80:    */   @ApiField("alipay_user_picture")
/*  81:    */   private List<AlipayUserPicture> personPictures;
/*  82:    */   @ApiField("phone")
/*  83:    */   private String phone;
/*  84:    */   @ApiField("profession")
/*  85:    */   private String profession;
/*  86:    */   @ApiField("province")
/*  87:    */   private String province;
/*  88:    */   @ApiField("user_id")
/*  89:    */   private String userId;
/*  90:    */   @ApiField("user_name")
/*  91:    */   private String userName;
/*  92:    */   @ApiField("user_status")
/*  93:    */   private String userStatus;
/*  94:    */   @ApiField("user_type")
/*  95:    */   private String userType;
/*  96:    */   @ApiField("zip")
/*  97:    */   private String zip;
/*  98:    */   
/*  99:    */   public void setAddress(String address)
/* 100:    */   {
/* 101:287 */     this.address = address;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getAddress()
/* 105:    */   {
/* 106:290 */     return this.address;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setArea(String area)
/* 110:    */   {
/* 111:294 */     this.area = area;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getArea()
/* 115:    */   {
/* 116:297 */     return this.area;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setAvatar(String avatar)
/* 120:    */   {
/* 121:301 */     this.avatar = avatar;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getAvatar()
/* 125:    */   {
/* 126:304 */     return this.avatar;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setBusinessScope(String businessScope)
/* 130:    */   {
/* 131:308 */     this.businessScope = businessScope;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getBusinessScope()
/* 135:    */   {
/* 136:311 */     return this.businessScope;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setCertNo(String certNo)
/* 140:    */   {
/* 141:315 */     this.certNo = certNo;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getCertNo()
/* 145:    */   {
/* 146:318 */     return this.certNo;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setCertType(String certType)
/* 150:    */   {
/* 151:322 */     this.certType = certType;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getCertType()
/* 155:    */   {
/* 156:325 */     return this.certType;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setCity(String city)
/* 160:    */   {
/* 161:329 */     this.city = city;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getCity()
/* 165:    */   {
/* 166:332 */     return this.city;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setDeliverAddresses(List<AlipayUserDeliverAddress> deliverAddresses)
/* 170:    */   {
/* 171:336 */     this.deliverAddresses = deliverAddresses;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public List<AlipayUserDeliverAddress> getDeliverAddresses()
/* 175:    */   {
/* 176:339 */     return this.deliverAddresses;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setEmail(String email)
/* 180:    */   {
/* 181:343 */     this.email = email;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getEmail()
/* 185:    */   {
/* 186:346 */     return this.email;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setFirmAgentPersonCertExpiryDate(String firmAgentPersonCertExpiryDate)
/* 190:    */   {
/* 191:350 */     this.firmAgentPersonCertExpiryDate = firmAgentPersonCertExpiryDate;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public String getFirmAgentPersonCertExpiryDate()
/* 195:    */   {
/* 196:353 */     return this.firmAgentPersonCertExpiryDate;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setFirmAgentPersonCertNo(String firmAgentPersonCertNo)
/* 200:    */   {
/* 201:357 */     this.firmAgentPersonCertNo = firmAgentPersonCertNo;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getFirmAgentPersonCertNo()
/* 205:    */   {
/* 206:360 */     return this.firmAgentPersonCertNo;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setFirmAgentPersonCertType(String firmAgentPersonCertType)
/* 210:    */   {
/* 211:364 */     this.firmAgentPersonCertType = firmAgentPersonCertType;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getFirmAgentPersonCertType()
/* 215:    */   {
/* 216:367 */     return this.firmAgentPersonCertType;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setFirmAgentPersonName(String firmAgentPersonName)
/* 220:    */   {
/* 221:371 */     this.firmAgentPersonName = firmAgentPersonName;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getFirmAgentPersonName()
/* 225:    */   {
/* 226:374 */     return this.firmAgentPersonName;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setFirmLegalPersonCertExpiryDate(String firmLegalPersonCertExpiryDate)
/* 230:    */   {
/* 231:378 */     this.firmLegalPersonCertExpiryDate = firmLegalPersonCertExpiryDate;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getFirmLegalPersonCertExpiryDate()
/* 235:    */   {
/* 236:381 */     return this.firmLegalPersonCertExpiryDate;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setFirmLegalPersonCertNo(String firmLegalPersonCertNo)
/* 240:    */   {
/* 241:385 */     this.firmLegalPersonCertNo = firmLegalPersonCertNo;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getFirmLegalPersonCertNo()
/* 245:    */   {
/* 246:388 */     return this.firmLegalPersonCertNo;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setFirmLegalPersonCertType(String firmLegalPersonCertType)
/* 250:    */   {
/* 251:392 */     this.firmLegalPersonCertType = firmLegalPersonCertType;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public String getFirmLegalPersonCertType()
/* 255:    */   {
/* 256:395 */     return this.firmLegalPersonCertType;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setFirmLegalPersonName(String firmLegalPersonName)
/* 260:    */   {
/* 261:399 */     this.firmLegalPersonName = firmLegalPersonName;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public String getFirmLegalPersonName()
/* 265:    */   {
/* 266:402 */     return this.firmLegalPersonName;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setFirmLegalPersonPictures(List<AlipayUserPicture> firmLegalPersonPictures)
/* 270:    */   {
/* 271:406 */     this.firmLegalPersonPictures = firmLegalPersonPictures;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public List<AlipayUserPicture> getFirmLegalPersonPictures()
/* 275:    */   {
/* 276:409 */     return this.firmLegalPersonPictures;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public void setFirmPictures(List<AlipayUserPicture> firmPictures)
/* 280:    */   {
/* 281:413 */     this.firmPictures = firmPictures;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public List<AlipayUserPicture> getFirmPictures()
/* 285:    */   {
/* 286:416 */     return this.firmPictures;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void setFirmType(String firmType)
/* 290:    */   {
/* 291:420 */     this.firmType = firmType;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public String getFirmType()
/* 295:    */   {
/* 296:423 */     return this.firmType;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void setGender(String gender)
/* 300:    */   {
/* 301:427 */     this.gender = gender;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public String getGender()
/* 305:    */   {
/* 306:430 */     return this.gender;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public void setIsBalanceFrozen(String isBalanceFrozen)
/* 310:    */   {
/* 311:434 */     this.isBalanceFrozen = isBalanceFrozen;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public String getIsBalanceFrozen()
/* 315:    */   {
/* 316:437 */     return this.isBalanceFrozen;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void setIsCertified(String isCertified)
/* 320:    */   {
/* 321:441 */     this.isCertified = isCertified;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public String getIsCertified()
/* 325:    */   {
/* 326:444 */     return this.isCertified;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public void setIsStudentCertified(String isStudentCertified)
/* 330:    */   {
/* 331:448 */     this.isStudentCertified = isStudentCertified;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public String getIsStudentCertified()
/* 335:    */   {
/* 336:451 */     return this.isStudentCertified;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public void setLicenseExpiryDate(String licenseExpiryDate)
/* 340:    */   {
/* 341:455 */     this.licenseExpiryDate = licenseExpiryDate;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public String getLicenseExpiryDate()
/* 345:    */   {
/* 346:458 */     return this.licenseExpiryDate;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public void setLicenseNo(String licenseNo)
/* 350:    */   {
/* 351:462 */     this.licenseNo = licenseNo;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public String getLicenseNo()
/* 355:    */   {
/* 356:465 */     return this.licenseNo;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public void setMobile(String mobile)
/* 360:    */   {
/* 361:469 */     this.mobile = mobile;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public String getMobile()
/* 365:    */   {
/* 366:472 */     return this.mobile;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public void setNickName(String nickName)
/* 370:    */   {
/* 371:476 */     this.nickName = nickName;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public String getNickName()
/* 375:    */   {
/* 376:479 */     return this.nickName;
/* 377:    */   }
/* 378:    */   
/* 379:    */   public void setOrganizationCode(String organizationCode)
/* 380:    */   {
/* 381:483 */     this.organizationCode = organizationCode;
/* 382:    */   }
/* 383:    */   
/* 384:    */   public String getOrganizationCode()
/* 385:    */   {
/* 386:486 */     return this.organizationCode;
/* 387:    */   }
/* 388:    */   
/* 389:    */   public void setPersonBirthday(String personBirthday)
/* 390:    */   {
/* 391:490 */     this.personBirthday = personBirthday;
/* 392:    */   }
/* 393:    */   
/* 394:    */   public String getPersonBirthday()
/* 395:    */   {
/* 396:493 */     return this.personBirthday;
/* 397:    */   }
/* 398:    */   
/* 399:    */   public void setPersonCertExpiryDate(String personCertExpiryDate)
/* 400:    */   {
/* 401:497 */     this.personCertExpiryDate = personCertExpiryDate;
/* 402:    */   }
/* 403:    */   
/* 404:    */   public String getPersonCertExpiryDate()
/* 405:    */   {
/* 406:500 */     return this.personCertExpiryDate;
/* 407:    */   }
/* 408:    */   
/* 409:    */   public void setPersonPictures(List<AlipayUserPicture> personPictures)
/* 410:    */   {
/* 411:504 */     this.personPictures = personPictures;
/* 412:    */   }
/* 413:    */   
/* 414:    */   public List<AlipayUserPicture> getPersonPictures()
/* 415:    */   {
/* 416:507 */     return this.personPictures;
/* 417:    */   }
/* 418:    */   
/* 419:    */   public void setPhone(String phone)
/* 420:    */   {
/* 421:511 */     this.phone = phone;
/* 422:    */   }
/* 423:    */   
/* 424:    */   public String getPhone()
/* 425:    */   {
/* 426:514 */     return this.phone;
/* 427:    */   }
/* 428:    */   
/* 429:    */   public void setProfession(String profession)
/* 430:    */   {
/* 431:518 */     this.profession = profession;
/* 432:    */   }
/* 433:    */   
/* 434:    */   public String getProfession()
/* 435:    */   {
/* 436:521 */     return this.profession;
/* 437:    */   }
/* 438:    */   
/* 439:    */   public void setProvince(String province)
/* 440:    */   {
/* 441:525 */     this.province = province;
/* 442:    */   }
/* 443:    */   
/* 444:    */   public String getProvince()
/* 445:    */   {
/* 446:528 */     return this.province;
/* 447:    */   }
/* 448:    */   
/* 449:    */   public void setUserId(String userId)
/* 450:    */   {
/* 451:532 */     this.userId = userId;
/* 452:    */   }
/* 453:    */   
/* 454:    */   public String getUserId()
/* 455:    */   {
/* 456:535 */     return this.userId;
/* 457:    */   }
/* 458:    */   
/* 459:    */   public void setUserName(String userName)
/* 460:    */   {
/* 461:539 */     this.userName = userName;
/* 462:    */   }
/* 463:    */   
/* 464:    */   public String getUserName()
/* 465:    */   {
/* 466:542 */     return this.userName;
/* 467:    */   }
/* 468:    */   
/* 469:    */   public void setUserStatus(String userStatus)
/* 470:    */   {
/* 471:546 */     this.userStatus = userStatus;
/* 472:    */   }
/* 473:    */   
/* 474:    */   public String getUserStatus()
/* 475:    */   {
/* 476:549 */     return this.userStatus;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public void setUserType(String userType)
/* 480:    */   {
/* 481:553 */     this.userType = userType;
/* 482:    */   }
/* 483:    */   
/* 484:    */   public String getUserType()
/* 485:    */   {
/* 486:556 */     return this.userType;
/* 487:    */   }
/* 488:    */   
/* 489:    */   public void setZip(String zip)
/* 490:    */   {
/* 491:560 */     this.zip = zip;
/* 492:    */   }
/* 493:    */   
/* 494:    */   public String getZip()
/* 495:    */   {
/* 496:563 */     return this.zip;
/* 497:    */   }
/* 498:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayUserInfoShareResponse
 * JD-Core Version:    0.7.0.1
 */