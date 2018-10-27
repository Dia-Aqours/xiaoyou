/*    1:     */ package com.alipay.api.response;
/*    2:     */ 
/*    3:     */ import com.alipay.api.AlipayResponse;
/*    4:     */ import com.alipay.api.internal.mapping.ApiField;
/*    5:     */ import java.util.Date;
/*    6:     */ 
/*    7:     */ public class AlipayOfflineMarketReportGetResponse
/*    8:     */   extends AlipayResponse
/*    9:     */ {
/*   10:     */   private static final long serialVersionUID = 6225777531561528679L;
/*   11:     */   @ApiField("address")
/*   12:     */   private String address;
/*   13:     */   @ApiField("amount_in_30_days")
/*   14:     */   private String amountIn30Days;
/*   15:     */   @ApiField("amount_in_7_days")
/*   16:     */   private String amountIn7Days;
/*   17:     */   @ApiField("amount_per_capita")
/*   18:     */   private String amountPerCapita;
/*   19:     */   @ApiField("amount_yesterday")
/*   20:     */   private String amountYesterday;
/*   21:     */   @ApiField("area")
/*   22:     */   private String area;
/*   23:     */   @ApiField("assign_status")
/*   24:     */   private String assignStatus;
/*   25:     */   @ApiField("bd_staff_uid")
/*   26:     */   private String bdStaffUid;
/*   27:     */   @ApiField("brand_name")
/*   28:     */   private String brandName;
/*   29:     */   @ApiField("city")
/*   30:     */   private String city;
/*   31:     */   @ApiField("city_code")
/*   32:     */   private String cityCode;
/*   33:     */   @ApiField("city_manager_name")
/*   34:     */   private String cityManagerName;
/*   35:     */   @ApiField("city_manager_uid")
/*   36:     */   private String cityManagerUid;
/*   37:     */   @ApiField("competitor_lowest_discount")
/*   38:     */   private String competitorLowestDiscount;
/*   39:     */   @ApiField("create_channel")
/*   40:     */   private String createChannel;
/*   41:     */   @ApiField("detail_category")
/*   42:     */   private String detailCategory;
/*   43:     */   @ApiField("detail_category_code")
/*   44:     */   private String detailCategoryCode;
/*   45:     */   @ApiField("discount_id")
/*   46:     */   private String discountId;
/*   47:     */   @ApiField("district")
/*   48:     */   private String district;
/*   49:     */   @ApiField("district_code")
/*   50:     */   private String districtCode;
/*   51:     */   @ApiField("f2f_audit_status")
/*   52:     */   private String f2fAuditStatus;
/*   53:     */   @ApiField("f2f_online")
/*   54:     */   private Date f2fOnline;
/*   55:     */   @ApiField("f2f_sign_count")
/*   56:     */   private String f2fSignCount;
/*   57:     */   @ApiField("f2f_status")
/*   58:     */   private String f2fStatus;
/*   59:     */   @ApiField("f2f_version")
/*   60:     */   private String f2fVersion;
/*   61:     */   @ApiField("ff_audit_status")
/*   62:     */   private String ffAuditStatus;
/*   63:     */   @ApiField("ff_online")
/*   64:     */   private Date ffOnline;
/*   65:     */   @ApiField("ff_sign_count")
/*   66:     */   private String ffSignCount;
/*   67:     */   @ApiField("ff_status")
/*   68:     */   private String ffStatus;
/*   69:     */   @ApiField("ff_version")
/*   70:     */   private String ffVersion;
/*   71:     */   @ApiField("gmt_create")
/*   72:     */   private Date gmtCreate;
/*   73:     */   @ApiField("gmt_modified")
/*   74:     */   private Date gmtModified;
/*   75:     */   @ApiField("has_discount")
/*   76:     */   private String hasDiscount;
/*   77:     */   @ApiField("has_discount_privilege")
/*   78:     */   private String hasDiscountPrivilege;
/*   79:     */   @ApiField("has_equipment")
/*   80:     */   private String hasEquipment;
/*   81:     */   @ApiField("has_shuangzheng")
/*   82:     */   private String hasShuangzheng;
/*   83:     */   @ApiField("has_whole_people_discount")
/*   84:     */   private String hasWholePeopleDiscount;
/*   85:     */   @ApiField("id")
/*   86:     */   private String id;
/*   87:     */   @ApiField("in_blacklist")
/*   88:     */   private String inBlacklist;
/*   89:     */   @ApiField("item_consumed_30")
/*   90:     */   private String itemConsumed30;
/*   91:     */   @ApiField("item_count_30")
/*   92:     */   private String itemCount30;
/*   93:     */   @ApiField("ka")
/*   94:     */   private String ka;
/*   95:     */   @ApiField("leads_name")
/*   96:     */   private String leadsName;
/*   97:     */   @ApiField("manual_confirm_assign_time")
/*   98:     */   private Date manualConfirmAssignTime;
/*   99:     */   @ApiField("merchant_name")
/*  100:     */   private String merchantName;
/*  101:     */   @ApiField("merchant_pid")
/*  102:     */   private String merchantPid;
/*  103:     */   @ApiField("mobile")
/*  104:     */   private String mobile;
/*  105:     */   @ApiField("order_1")
/*  106:     */   private String order1;
/*  107:     */   @ApiField("order_in_1_day")
/*  108:     */   private String orderIn1Day;
/*  109:     */   @ApiField("order_in_7_days")
/*  110:     */   private String orderIn7Days;
/*  111:     */   @ApiField("pri_category")
/*  112:     */   private String priCategory;
/*  113:     */   @ApiField("pri_category_code")
/*  114:     */   private String priCategoryCode;
/*  115:     */   @ApiField("prov_code")
/*  116:     */   private String provCode;
/*  117:     */   @ApiField("provider_name")
/*  118:     */   private String providerName;
/*  119:     */   @ApiField("provider_pid")
/*  120:     */   private String providerPid;
/*  121:     */   @ApiField("provider_staff_name")
/*  122:     */   private String providerStaffName;
/*  123:     */   @ApiField("provider_staff_uid")
/*  124:     */   private String providerStaffUid;
/*  125:     */   @ApiField("province")
/*  126:     */   private String province;
/*  127:     */   @ApiField("recommender")
/*  128:     */   private String recommender;
/*  129:     */   @ApiField("recommender_type")
/*  130:     */   private String recommenderType;
/*  131:     */   @ApiField("shop_audit_status")
/*  132:     */   private String shopAuditStatus;
/*  133:     */   @ApiField("shop_id")
/*  134:     */   private String shopId;
/*  135:     */   @ApiField("shop_level")
/*  136:     */   private String shopLevel;
/*  137:     */   @ApiField("shop_name")
/*  138:     */   private String shopName;
/*  139:     */   @ApiField("shop_online")
/*  140:     */   private Date shopOnline;
/*  141:     */   @ApiField("shop_source")
/*  142:     */   private String shopSource;
/*  143:     */   @ApiField("shop_tag")
/*  144:     */   private String shopTag;
/*  145:     */   @ApiField("sub_category")
/*  146:     */   private String subCategory;
/*  147:     */   @ApiField("sub_category_code")
/*  148:     */   private String subCategoryCode;
/*  149:     */   @ApiField("telephone")
/*  150:     */   private String telephone;
/*  151:     */   @ApiField("user_1")
/*  152:     */   private String user1;
/*  153:     */   @ApiField("user_in_1_day")
/*  154:     */   private String userIn1Day;
/*  155:     */   @ApiField("user_in_7_days")
/*  156:     */   private String userIn7Days;
/*  157:     */   @ApiField("verification_in_1_day")
/*  158:     */   private String verificationIn1Day;
/*  159:     */   @ApiField("verification_in_30_days")
/*  160:     */   private String verificationIn30Days;
/*  161:     */   @ApiField("verification_in_7_days")
/*  162:     */   private String verificationIn7Days;
/*  163:     */   @ApiField("whole_people_lowest_discount")
/*  164:     */   private String wholePeopleLowestDiscount;
/*  165:     */   
/*  166:     */   public void setAddress(String address)
/*  167:     */   {
/*  168: 481 */     this.address = address;
/*  169:     */   }
/*  170:     */   
/*  171:     */   public String getAddress()
/*  172:     */   {
/*  173: 484 */     return this.address;
/*  174:     */   }
/*  175:     */   
/*  176:     */   public void setAmountIn30Days(String amountIn30Days)
/*  177:     */   {
/*  178: 488 */     this.amountIn30Days = amountIn30Days;
/*  179:     */   }
/*  180:     */   
/*  181:     */   public String getAmountIn30Days()
/*  182:     */   {
/*  183: 491 */     return this.amountIn30Days;
/*  184:     */   }
/*  185:     */   
/*  186:     */   public void setAmountIn7Days(String amountIn7Days)
/*  187:     */   {
/*  188: 495 */     this.amountIn7Days = amountIn7Days;
/*  189:     */   }
/*  190:     */   
/*  191:     */   public String getAmountIn7Days()
/*  192:     */   {
/*  193: 498 */     return this.amountIn7Days;
/*  194:     */   }
/*  195:     */   
/*  196:     */   public void setAmountPerCapita(String amountPerCapita)
/*  197:     */   {
/*  198: 502 */     this.amountPerCapita = amountPerCapita;
/*  199:     */   }
/*  200:     */   
/*  201:     */   public String getAmountPerCapita()
/*  202:     */   {
/*  203: 505 */     return this.amountPerCapita;
/*  204:     */   }
/*  205:     */   
/*  206:     */   public void setAmountYesterday(String amountYesterday)
/*  207:     */   {
/*  208: 509 */     this.amountYesterday = amountYesterday;
/*  209:     */   }
/*  210:     */   
/*  211:     */   public String getAmountYesterday()
/*  212:     */   {
/*  213: 512 */     return this.amountYesterday;
/*  214:     */   }
/*  215:     */   
/*  216:     */   public void setArea(String area)
/*  217:     */   {
/*  218: 516 */     this.area = area;
/*  219:     */   }
/*  220:     */   
/*  221:     */   public String getArea()
/*  222:     */   {
/*  223: 519 */     return this.area;
/*  224:     */   }
/*  225:     */   
/*  226:     */   public void setAssignStatus(String assignStatus)
/*  227:     */   {
/*  228: 523 */     this.assignStatus = assignStatus;
/*  229:     */   }
/*  230:     */   
/*  231:     */   public String getAssignStatus()
/*  232:     */   {
/*  233: 526 */     return this.assignStatus;
/*  234:     */   }
/*  235:     */   
/*  236:     */   public void setBdStaffUid(String bdStaffUid)
/*  237:     */   {
/*  238: 530 */     this.bdStaffUid = bdStaffUid;
/*  239:     */   }
/*  240:     */   
/*  241:     */   public String getBdStaffUid()
/*  242:     */   {
/*  243: 533 */     return this.bdStaffUid;
/*  244:     */   }
/*  245:     */   
/*  246:     */   public void setBrandName(String brandName)
/*  247:     */   {
/*  248: 537 */     this.brandName = brandName;
/*  249:     */   }
/*  250:     */   
/*  251:     */   public String getBrandName()
/*  252:     */   {
/*  253: 540 */     return this.brandName;
/*  254:     */   }
/*  255:     */   
/*  256:     */   public void setCity(String city)
/*  257:     */   {
/*  258: 544 */     this.city = city;
/*  259:     */   }
/*  260:     */   
/*  261:     */   public String getCity()
/*  262:     */   {
/*  263: 547 */     return this.city;
/*  264:     */   }
/*  265:     */   
/*  266:     */   public void setCityCode(String cityCode)
/*  267:     */   {
/*  268: 551 */     this.cityCode = cityCode;
/*  269:     */   }
/*  270:     */   
/*  271:     */   public String getCityCode()
/*  272:     */   {
/*  273: 554 */     return this.cityCode;
/*  274:     */   }
/*  275:     */   
/*  276:     */   public void setCityManagerName(String cityManagerName)
/*  277:     */   {
/*  278: 558 */     this.cityManagerName = cityManagerName;
/*  279:     */   }
/*  280:     */   
/*  281:     */   public String getCityManagerName()
/*  282:     */   {
/*  283: 561 */     return this.cityManagerName;
/*  284:     */   }
/*  285:     */   
/*  286:     */   public void setCityManagerUid(String cityManagerUid)
/*  287:     */   {
/*  288: 565 */     this.cityManagerUid = cityManagerUid;
/*  289:     */   }
/*  290:     */   
/*  291:     */   public String getCityManagerUid()
/*  292:     */   {
/*  293: 568 */     return this.cityManagerUid;
/*  294:     */   }
/*  295:     */   
/*  296:     */   public void setCompetitorLowestDiscount(String competitorLowestDiscount)
/*  297:     */   {
/*  298: 572 */     this.competitorLowestDiscount = competitorLowestDiscount;
/*  299:     */   }
/*  300:     */   
/*  301:     */   public String getCompetitorLowestDiscount()
/*  302:     */   {
/*  303: 575 */     return this.competitorLowestDiscount;
/*  304:     */   }
/*  305:     */   
/*  306:     */   public void setCreateChannel(String createChannel)
/*  307:     */   {
/*  308: 579 */     this.createChannel = createChannel;
/*  309:     */   }
/*  310:     */   
/*  311:     */   public String getCreateChannel()
/*  312:     */   {
/*  313: 582 */     return this.createChannel;
/*  314:     */   }
/*  315:     */   
/*  316:     */   public void setDetailCategory(String detailCategory)
/*  317:     */   {
/*  318: 586 */     this.detailCategory = detailCategory;
/*  319:     */   }
/*  320:     */   
/*  321:     */   public String getDetailCategory()
/*  322:     */   {
/*  323: 589 */     return this.detailCategory;
/*  324:     */   }
/*  325:     */   
/*  326:     */   public void setDetailCategoryCode(String detailCategoryCode)
/*  327:     */   {
/*  328: 593 */     this.detailCategoryCode = detailCategoryCode;
/*  329:     */   }
/*  330:     */   
/*  331:     */   public String getDetailCategoryCode()
/*  332:     */   {
/*  333: 596 */     return this.detailCategoryCode;
/*  334:     */   }
/*  335:     */   
/*  336:     */   public void setDiscountId(String discountId)
/*  337:     */   {
/*  338: 600 */     this.discountId = discountId;
/*  339:     */   }
/*  340:     */   
/*  341:     */   public String getDiscountId()
/*  342:     */   {
/*  343: 603 */     return this.discountId;
/*  344:     */   }
/*  345:     */   
/*  346:     */   public void setDistrict(String district)
/*  347:     */   {
/*  348: 607 */     this.district = district;
/*  349:     */   }
/*  350:     */   
/*  351:     */   public String getDistrict()
/*  352:     */   {
/*  353: 610 */     return this.district;
/*  354:     */   }
/*  355:     */   
/*  356:     */   public void setDistrictCode(String districtCode)
/*  357:     */   {
/*  358: 614 */     this.districtCode = districtCode;
/*  359:     */   }
/*  360:     */   
/*  361:     */   public String getDistrictCode()
/*  362:     */   {
/*  363: 617 */     return this.districtCode;
/*  364:     */   }
/*  365:     */   
/*  366:     */   public void setF2fAuditStatus(String f2fAuditStatus)
/*  367:     */   {
/*  368: 621 */     this.f2fAuditStatus = f2fAuditStatus;
/*  369:     */   }
/*  370:     */   
/*  371:     */   public String getF2fAuditStatus()
/*  372:     */   {
/*  373: 624 */     return this.f2fAuditStatus;
/*  374:     */   }
/*  375:     */   
/*  376:     */   public void setF2fOnline(Date f2fOnline)
/*  377:     */   {
/*  378: 628 */     this.f2fOnline = f2fOnline;
/*  379:     */   }
/*  380:     */   
/*  381:     */   public Date getF2fOnline()
/*  382:     */   {
/*  383: 631 */     return this.f2fOnline;
/*  384:     */   }
/*  385:     */   
/*  386:     */   public void setF2fSignCount(String f2fSignCount)
/*  387:     */   {
/*  388: 635 */     this.f2fSignCount = f2fSignCount;
/*  389:     */   }
/*  390:     */   
/*  391:     */   public String getF2fSignCount()
/*  392:     */   {
/*  393: 638 */     return this.f2fSignCount;
/*  394:     */   }
/*  395:     */   
/*  396:     */   public void setF2fStatus(String f2fStatus)
/*  397:     */   {
/*  398: 642 */     this.f2fStatus = f2fStatus;
/*  399:     */   }
/*  400:     */   
/*  401:     */   public String getF2fStatus()
/*  402:     */   {
/*  403: 645 */     return this.f2fStatus;
/*  404:     */   }
/*  405:     */   
/*  406:     */   public void setF2fVersion(String f2fVersion)
/*  407:     */   {
/*  408: 649 */     this.f2fVersion = f2fVersion;
/*  409:     */   }
/*  410:     */   
/*  411:     */   public String getF2fVersion()
/*  412:     */   {
/*  413: 652 */     return this.f2fVersion;
/*  414:     */   }
/*  415:     */   
/*  416:     */   public void setFfAuditStatus(String ffAuditStatus)
/*  417:     */   {
/*  418: 656 */     this.ffAuditStatus = ffAuditStatus;
/*  419:     */   }
/*  420:     */   
/*  421:     */   public String getFfAuditStatus()
/*  422:     */   {
/*  423: 659 */     return this.ffAuditStatus;
/*  424:     */   }
/*  425:     */   
/*  426:     */   public void setFfOnline(Date ffOnline)
/*  427:     */   {
/*  428: 663 */     this.ffOnline = ffOnline;
/*  429:     */   }
/*  430:     */   
/*  431:     */   public Date getFfOnline()
/*  432:     */   {
/*  433: 666 */     return this.ffOnline;
/*  434:     */   }
/*  435:     */   
/*  436:     */   public void setFfSignCount(String ffSignCount)
/*  437:     */   {
/*  438: 670 */     this.ffSignCount = ffSignCount;
/*  439:     */   }
/*  440:     */   
/*  441:     */   public String getFfSignCount()
/*  442:     */   {
/*  443: 673 */     return this.ffSignCount;
/*  444:     */   }
/*  445:     */   
/*  446:     */   public void setFfStatus(String ffStatus)
/*  447:     */   {
/*  448: 677 */     this.ffStatus = ffStatus;
/*  449:     */   }
/*  450:     */   
/*  451:     */   public String getFfStatus()
/*  452:     */   {
/*  453: 680 */     return this.ffStatus;
/*  454:     */   }
/*  455:     */   
/*  456:     */   public void setFfVersion(String ffVersion)
/*  457:     */   {
/*  458: 684 */     this.ffVersion = ffVersion;
/*  459:     */   }
/*  460:     */   
/*  461:     */   public String getFfVersion()
/*  462:     */   {
/*  463: 687 */     return this.ffVersion;
/*  464:     */   }
/*  465:     */   
/*  466:     */   public void setGmtCreate(Date gmtCreate)
/*  467:     */   {
/*  468: 691 */     this.gmtCreate = gmtCreate;
/*  469:     */   }
/*  470:     */   
/*  471:     */   public Date getGmtCreate()
/*  472:     */   {
/*  473: 694 */     return this.gmtCreate;
/*  474:     */   }
/*  475:     */   
/*  476:     */   public void setGmtModified(Date gmtModified)
/*  477:     */   {
/*  478: 698 */     this.gmtModified = gmtModified;
/*  479:     */   }
/*  480:     */   
/*  481:     */   public Date getGmtModified()
/*  482:     */   {
/*  483: 701 */     return this.gmtModified;
/*  484:     */   }
/*  485:     */   
/*  486:     */   public void setHasDiscount(String hasDiscount)
/*  487:     */   {
/*  488: 705 */     this.hasDiscount = hasDiscount;
/*  489:     */   }
/*  490:     */   
/*  491:     */   public String getHasDiscount()
/*  492:     */   {
/*  493: 708 */     return this.hasDiscount;
/*  494:     */   }
/*  495:     */   
/*  496:     */   public void setHasDiscountPrivilege(String hasDiscountPrivilege)
/*  497:     */   {
/*  498: 712 */     this.hasDiscountPrivilege = hasDiscountPrivilege;
/*  499:     */   }
/*  500:     */   
/*  501:     */   public String getHasDiscountPrivilege()
/*  502:     */   {
/*  503: 715 */     return this.hasDiscountPrivilege;
/*  504:     */   }
/*  505:     */   
/*  506:     */   public void setHasEquipment(String hasEquipment)
/*  507:     */   {
/*  508: 719 */     this.hasEquipment = hasEquipment;
/*  509:     */   }
/*  510:     */   
/*  511:     */   public String getHasEquipment()
/*  512:     */   {
/*  513: 722 */     return this.hasEquipment;
/*  514:     */   }
/*  515:     */   
/*  516:     */   public void setHasShuangzheng(String hasShuangzheng)
/*  517:     */   {
/*  518: 726 */     this.hasShuangzheng = hasShuangzheng;
/*  519:     */   }
/*  520:     */   
/*  521:     */   public String getHasShuangzheng()
/*  522:     */   {
/*  523: 729 */     return this.hasShuangzheng;
/*  524:     */   }
/*  525:     */   
/*  526:     */   public void setHasWholePeopleDiscount(String hasWholePeopleDiscount)
/*  527:     */   {
/*  528: 733 */     this.hasWholePeopleDiscount = hasWholePeopleDiscount;
/*  529:     */   }
/*  530:     */   
/*  531:     */   public String getHasWholePeopleDiscount()
/*  532:     */   {
/*  533: 736 */     return this.hasWholePeopleDiscount;
/*  534:     */   }
/*  535:     */   
/*  536:     */   public void setId(String id)
/*  537:     */   {
/*  538: 740 */     this.id = id;
/*  539:     */   }
/*  540:     */   
/*  541:     */   public String getId()
/*  542:     */   {
/*  543: 743 */     return this.id;
/*  544:     */   }
/*  545:     */   
/*  546:     */   public void setInBlacklist(String inBlacklist)
/*  547:     */   {
/*  548: 747 */     this.inBlacklist = inBlacklist;
/*  549:     */   }
/*  550:     */   
/*  551:     */   public String getInBlacklist()
/*  552:     */   {
/*  553: 750 */     return this.inBlacklist;
/*  554:     */   }
/*  555:     */   
/*  556:     */   public void setItemConsumed30(String itemConsumed30)
/*  557:     */   {
/*  558: 754 */     this.itemConsumed30 = itemConsumed30;
/*  559:     */   }
/*  560:     */   
/*  561:     */   public String getItemConsumed30()
/*  562:     */   {
/*  563: 757 */     return this.itemConsumed30;
/*  564:     */   }
/*  565:     */   
/*  566:     */   public void setItemCount30(String itemCount30)
/*  567:     */   {
/*  568: 761 */     this.itemCount30 = itemCount30;
/*  569:     */   }
/*  570:     */   
/*  571:     */   public String getItemCount30()
/*  572:     */   {
/*  573: 764 */     return this.itemCount30;
/*  574:     */   }
/*  575:     */   
/*  576:     */   public void setKa(String ka)
/*  577:     */   {
/*  578: 768 */     this.ka = ka;
/*  579:     */   }
/*  580:     */   
/*  581:     */   public String getKa()
/*  582:     */   {
/*  583: 771 */     return this.ka;
/*  584:     */   }
/*  585:     */   
/*  586:     */   public void setLeadsName(String leadsName)
/*  587:     */   {
/*  588: 775 */     this.leadsName = leadsName;
/*  589:     */   }
/*  590:     */   
/*  591:     */   public String getLeadsName()
/*  592:     */   {
/*  593: 778 */     return this.leadsName;
/*  594:     */   }
/*  595:     */   
/*  596:     */   public void setManualConfirmAssignTime(Date manualConfirmAssignTime)
/*  597:     */   {
/*  598: 782 */     this.manualConfirmAssignTime = manualConfirmAssignTime;
/*  599:     */   }
/*  600:     */   
/*  601:     */   public Date getManualConfirmAssignTime()
/*  602:     */   {
/*  603: 785 */     return this.manualConfirmAssignTime;
/*  604:     */   }
/*  605:     */   
/*  606:     */   public void setMerchantName(String merchantName)
/*  607:     */   {
/*  608: 789 */     this.merchantName = merchantName;
/*  609:     */   }
/*  610:     */   
/*  611:     */   public String getMerchantName()
/*  612:     */   {
/*  613: 792 */     return this.merchantName;
/*  614:     */   }
/*  615:     */   
/*  616:     */   public void setMerchantPid(String merchantPid)
/*  617:     */   {
/*  618: 796 */     this.merchantPid = merchantPid;
/*  619:     */   }
/*  620:     */   
/*  621:     */   public String getMerchantPid()
/*  622:     */   {
/*  623: 799 */     return this.merchantPid;
/*  624:     */   }
/*  625:     */   
/*  626:     */   public void setMobile(String mobile)
/*  627:     */   {
/*  628: 803 */     this.mobile = mobile;
/*  629:     */   }
/*  630:     */   
/*  631:     */   public String getMobile()
/*  632:     */   {
/*  633: 806 */     return this.mobile;
/*  634:     */   }
/*  635:     */   
/*  636:     */   public void setOrder1(String order1)
/*  637:     */   {
/*  638: 810 */     this.order1 = order1;
/*  639:     */   }
/*  640:     */   
/*  641:     */   public String getOrder1()
/*  642:     */   {
/*  643: 813 */     return this.order1;
/*  644:     */   }
/*  645:     */   
/*  646:     */   public void setOrderIn1Day(String orderIn1Day)
/*  647:     */   {
/*  648: 817 */     this.orderIn1Day = orderIn1Day;
/*  649:     */   }
/*  650:     */   
/*  651:     */   public String getOrderIn1Day()
/*  652:     */   {
/*  653: 820 */     return this.orderIn1Day;
/*  654:     */   }
/*  655:     */   
/*  656:     */   public void setOrderIn7Days(String orderIn7Days)
/*  657:     */   {
/*  658: 824 */     this.orderIn7Days = orderIn7Days;
/*  659:     */   }
/*  660:     */   
/*  661:     */   public String getOrderIn7Days()
/*  662:     */   {
/*  663: 827 */     return this.orderIn7Days;
/*  664:     */   }
/*  665:     */   
/*  666:     */   public void setPriCategory(String priCategory)
/*  667:     */   {
/*  668: 831 */     this.priCategory = priCategory;
/*  669:     */   }
/*  670:     */   
/*  671:     */   public String getPriCategory()
/*  672:     */   {
/*  673: 834 */     return this.priCategory;
/*  674:     */   }
/*  675:     */   
/*  676:     */   public void setPriCategoryCode(String priCategoryCode)
/*  677:     */   {
/*  678: 838 */     this.priCategoryCode = priCategoryCode;
/*  679:     */   }
/*  680:     */   
/*  681:     */   public String getPriCategoryCode()
/*  682:     */   {
/*  683: 841 */     return this.priCategoryCode;
/*  684:     */   }
/*  685:     */   
/*  686:     */   public void setProvCode(String provCode)
/*  687:     */   {
/*  688: 845 */     this.provCode = provCode;
/*  689:     */   }
/*  690:     */   
/*  691:     */   public String getProvCode()
/*  692:     */   {
/*  693: 848 */     return this.provCode;
/*  694:     */   }
/*  695:     */   
/*  696:     */   public void setProviderName(String providerName)
/*  697:     */   {
/*  698: 852 */     this.providerName = providerName;
/*  699:     */   }
/*  700:     */   
/*  701:     */   public String getProviderName()
/*  702:     */   {
/*  703: 855 */     return this.providerName;
/*  704:     */   }
/*  705:     */   
/*  706:     */   public void setProviderPid(String providerPid)
/*  707:     */   {
/*  708: 859 */     this.providerPid = providerPid;
/*  709:     */   }
/*  710:     */   
/*  711:     */   public String getProviderPid()
/*  712:     */   {
/*  713: 862 */     return this.providerPid;
/*  714:     */   }
/*  715:     */   
/*  716:     */   public void setProviderStaffName(String providerStaffName)
/*  717:     */   {
/*  718: 866 */     this.providerStaffName = providerStaffName;
/*  719:     */   }
/*  720:     */   
/*  721:     */   public String getProviderStaffName()
/*  722:     */   {
/*  723: 869 */     return this.providerStaffName;
/*  724:     */   }
/*  725:     */   
/*  726:     */   public void setProviderStaffUid(String providerStaffUid)
/*  727:     */   {
/*  728: 873 */     this.providerStaffUid = providerStaffUid;
/*  729:     */   }
/*  730:     */   
/*  731:     */   public String getProviderStaffUid()
/*  732:     */   {
/*  733: 876 */     return this.providerStaffUid;
/*  734:     */   }
/*  735:     */   
/*  736:     */   public void setProvince(String province)
/*  737:     */   {
/*  738: 880 */     this.province = province;
/*  739:     */   }
/*  740:     */   
/*  741:     */   public String getProvince()
/*  742:     */   {
/*  743: 883 */     return this.province;
/*  744:     */   }
/*  745:     */   
/*  746:     */   public void setRecommender(String recommender)
/*  747:     */   {
/*  748: 887 */     this.recommender = recommender;
/*  749:     */   }
/*  750:     */   
/*  751:     */   public String getRecommender()
/*  752:     */   {
/*  753: 890 */     return this.recommender;
/*  754:     */   }
/*  755:     */   
/*  756:     */   public void setRecommenderType(String recommenderType)
/*  757:     */   {
/*  758: 894 */     this.recommenderType = recommenderType;
/*  759:     */   }
/*  760:     */   
/*  761:     */   public String getRecommenderType()
/*  762:     */   {
/*  763: 897 */     return this.recommenderType;
/*  764:     */   }
/*  765:     */   
/*  766:     */   public void setShopAuditStatus(String shopAuditStatus)
/*  767:     */   {
/*  768: 901 */     this.shopAuditStatus = shopAuditStatus;
/*  769:     */   }
/*  770:     */   
/*  771:     */   public String getShopAuditStatus()
/*  772:     */   {
/*  773: 904 */     return this.shopAuditStatus;
/*  774:     */   }
/*  775:     */   
/*  776:     */   public void setShopId(String shopId)
/*  777:     */   {
/*  778: 908 */     this.shopId = shopId;
/*  779:     */   }
/*  780:     */   
/*  781:     */   public String getShopId()
/*  782:     */   {
/*  783: 911 */     return this.shopId;
/*  784:     */   }
/*  785:     */   
/*  786:     */   public void setShopLevel(String shopLevel)
/*  787:     */   {
/*  788: 915 */     this.shopLevel = shopLevel;
/*  789:     */   }
/*  790:     */   
/*  791:     */   public String getShopLevel()
/*  792:     */   {
/*  793: 918 */     return this.shopLevel;
/*  794:     */   }
/*  795:     */   
/*  796:     */   public void setShopName(String shopName)
/*  797:     */   {
/*  798: 922 */     this.shopName = shopName;
/*  799:     */   }
/*  800:     */   
/*  801:     */   public String getShopName()
/*  802:     */   {
/*  803: 925 */     return this.shopName;
/*  804:     */   }
/*  805:     */   
/*  806:     */   public void setShopOnline(Date shopOnline)
/*  807:     */   {
/*  808: 929 */     this.shopOnline = shopOnline;
/*  809:     */   }
/*  810:     */   
/*  811:     */   public Date getShopOnline()
/*  812:     */   {
/*  813: 932 */     return this.shopOnline;
/*  814:     */   }
/*  815:     */   
/*  816:     */   public void setShopSource(String shopSource)
/*  817:     */   {
/*  818: 936 */     this.shopSource = shopSource;
/*  819:     */   }
/*  820:     */   
/*  821:     */   public String getShopSource()
/*  822:     */   {
/*  823: 939 */     return this.shopSource;
/*  824:     */   }
/*  825:     */   
/*  826:     */   public void setShopTag(String shopTag)
/*  827:     */   {
/*  828: 943 */     this.shopTag = shopTag;
/*  829:     */   }
/*  830:     */   
/*  831:     */   public String getShopTag()
/*  832:     */   {
/*  833: 946 */     return this.shopTag;
/*  834:     */   }
/*  835:     */   
/*  836:     */   public void setSubCategory(String subCategory)
/*  837:     */   {
/*  838: 950 */     this.subCategory = subCategory;
/*  839:     */   }
/*  840:     */   
/*  841:     */   public String getSubCategory()
/*  842:     */   {
/*  843: 953 */     return this.subCategory;
/*  844:     */   }
/*  845:     */   
/*  846:     */   public void setSubCategoryCode(String subCategoryCode)
/*  847:     */   {
/*  848: 957 */     this.subCategoryCode = subCategoryCode;
/*  849:     */   }
/*  850:     */   
/*  851:     */   public String getSubCategoryCode()
/*  852:     */   {
/*  853: 960 */     return this.subCategoryCode;
/*  854:     */   }
/*  855:     */   
/*  856:     */   public void setTelephone(String telephone)
/*  857:     */   {
/*  858: 964 */     this.telephone = telephone;
/*  859:     */   }
/*  860:     */   
/*  861:     */   public String getTelephone()
/*  862:     */   {
/*  863: 967 */     return this.telephone;
/*  864:     */   }
/*  865:     */   
/*  866:     */   public void setUser1(String user1)
/*  867:     */   {
/*  868: 971 */     this.user1 = user1;
/*  869:     */   }
/*  870:     */   
/*  871:     */   public String getUser1()
/*  872:     */   {
/*  873: 974 */     return this.user1;
/*  874:     */   }
/*  875:     */   
/*  876:     */   public void setUserIn1Day(String userIn1Day)
/*  877:     */   {
/*  878: 978 */     this.userIn1Day = userIn1Day;
/*  879:     */   }
/*  880:     */   
/*  881:     */   public String getUserIn1Day()
/*  882:     */   {
/*  883: 981 */     return this.userIn1Day;
/*  884:     */   }
/*  885:     */   
/*  886:     */   public void setUserIn7Days(String userIn7Days)
/*  887:     */   {
/*  888: 985 */     this.userIn7Days = userIn7Days;
/*  889:     */   }
/*  890:     */   
/*  891:     */   public String getUserIn7Days()
/*  892:     */   {
/*  893: 988 */     return this.userIn7Days;
/*  894:     */   }
/*  895:     */   
/*  896:     */   public void setVerificationIn1Day(String verificationIn1Day)
/*  897:     */   {
/*  898: 992 */     this.verificationIn1Day = verificationIn1Day;
/*  899:     */   }
/*  900:     */   
/*  901:     */   public String getVerificationIn1Day()
/*  902:     */   {
/*  903: 995 */     return this.verificationIn1Day;
/*  904:     */   }
/*  905:     */   
/*  906:     */   public void setVerificationIn30Days(String verificationIn30Days)
/*  907:     */   {
/*  908: 999 */     this.verificationIn30Days = verificationIn30Days;
/*  909:     */   }
/*  910:     */   
/*  911:     */   public String getVerificationIn30Days()
/*  912:     */   {
/*  913:1002 */     return this.verificationIn30Days;
/*  914:     */   }
/*  915:     */   
/*  916:     */   public void setVerificationIn7Days(String verificationIn7Days)
/*  917:     */   {
/*  918:1006 */     this.verificationIn7Days = verificationIn7Days;
/*  919:     */   }
/*  920:     */   
/*  921:     */   public String getVerificationIn7Days()
/*  922:     */   {
/*  923:1009 */     return this.verificationIn7Days;
/*  924:     */   }
/*  925:     */   
/*  926:     */   public void setWholePeopleLowestDiscount(String wholePeopleLowestDiscount)
/*  927:     */   {
/*  928:1013 */     this.wholePeopleLowestDiscount = wholePeopleLowestDiscount;
/*  929:     */   }
/*  930:     */   
/*  931:     */   public String getWholePeopleLowestDiscount()
/*  932:     */   {
/*  933:1016 */     return this.wholePeopleLowestDiscount;
/*  934:     */   }
/*  935:     */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketReportGetResponse
 * JD-Core Version:    0.7.0.1
 */