/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class Voucher
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 1218218456352424145L;
/*  13:    */   @ApiField("brand_name")
/*  14:    */   private String brandName;
/*  15:    */   @ApiListField("clause_terms")
/*  16:    */   @ApiField("clause_term")
/*  17:    */   private List<ClauseTerm> clauseTerms;
/*  18:    */   @ApiField("delay_info")
/*  19:    */   private DelayInfo delayInfo;
/*  20:    */   @ApiField("desc")
/*  21:    */   private String desc;
/*  22:    */   @ApiListField("desc_detail_list")
/*  23:    */   @ApiField("voucher_desc_detail")
/*  24:    */   private List<VoucherDescDetail> descDetailList;
/*  25:    */   @ApiField("display_config")
/*  26:    */   private DisplayConfig displayConfig;
/*  27:    */   @ApiField("donate_flag")
/*  28:    */   private String donateFlag;
/*  29:    */   @ApiField("effect_type")
/*  30:    */   private String effectType;
/*  31:    */   @ApiField("end_time")
/*  32:    */   private Date endTime;
/*  33:    */   @ApiField("ext_info")
/*  34:    */   private String extInfo;
/*  35:    */   @ApiField("item_info")
/*  36:    */   private ItemInfo itemInfo;
/*  37:    */   @ApiField("logo")
/*  38:    */   private String logo;
/*  39:    */   @ApiField("max_amount")
/*  40:    */   private String maxAmount;
/*  41:    */   @ApiField("merge_verify_config")
/*  42:    */   private MergeVerifyConfig mergeVerifyConfig;
/*  43:    */   @ApiField("multi_use_mode")
/*  44:    */   private String multiUseMode;
/*  45:    */   @ApiField("name")
/*  46:    */   private String name;
/*  47:    */   @ApiField("rate")
/*  48:    */   private String rate;
/*  49:    */   @ApiField("relative_time")
/*  50:    */   private String relativeTime;
/*  51:    */   @ApiField("start_time")
/*  52:    */   private Date startTime;
/*  53:    */   @ApiField("type")
/*  54:    */   private String type;
/*  55:    */   @ApiListField("use_instructions")
/*  56:    */   @ApiField("string")
/*  57:    */   private List<String> useInstructions;
/*  58:    */   @ApiField("use_rule")
/*  59:    */   private UseRule useRule;
/*  60:    */   @ApiField("validate_type")
/*  61:    */   private String validateType;
/*  62:    */   @ApiField("verify_mode")
/*  63:    */   private String verifyMode;
/*  64:    */   @ApiField("voucher_img")
/*  65:    */   private String voucherImg;
/*  66:    */   @ApiField("voucher_note")
/*  67:    */   private String voucherNote;
/*  68:    */   @ApiField("worth_value")
/*  69:    */   private String worthValue;
/*  70:    */   
/*  71:    */   public String getBrandName()
/*  72:    */   {
/*  73:216 */     return this.brandName;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setBrandName(String brandName)
/*  77:    */   {
/*  78:219 */     this.brandName = brandName;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public List<ClauseTerm> getClauseTerms()
/*  82:    */   {
/*  83:223 */     return this.clauseTerms;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setClauseTerms(List<ClauseTerm> clauseTerms)
/*  87:    */   {
/*  88:226 */     this.clauseTerms = clauseTerms;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public DelayInfo getDelayInfo()
/*  92:    */   {
/*  93:230 */     return this.delayInfo;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setDelayInfo(DelayInfo delayInfo)
/*  97:    */   {
/*  98:233 */     this.delayInfo = delayInfo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getDesc()
/* 102:    */   {
/* 103:237 */     return this.desc;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setDesc(String desc)
/* 107:    */   {
/* 108:240 */     this.desc = desc;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public List<VoucherDescDetail> getDescDetailList()
/* 112:    */   {
/* 113:244 */     return this.descDetailList;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setDescDetailList(List<VoucherDescDetail> descDetailList)
/* 117:    */   {
/* 118:247 */     this.descDetailList = descDetailList;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public DisplayConfig getDisplayConfig()
/* 122:    */   {
/* 123:251 */     return this.displayConfig;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setDisplayConfig(DisplayConfig displayConfig)
/* 127:    */   {
/* 128:254 */     this.displayConfig = displayConfig;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getDonateFlag()
/* 132:    */   {
/* 133:258 */     return this.donateFlag;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setDonateFlag(String donateFlag)
/* 137:    */   {
/* 138:261 */     this.donateFlag = donateFlag;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getEffectType()
/* 142:    */   {
/* 143:265 */     return this.effectType;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setEffectType(String effectType)
/* 147:    */   {
/* 148:268 */     this.effectType = effectType;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public Date getEndTime()
/* 152:    */   {
/* 153:272 */     return this.endTime;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setEndTime(Date endTime)
/* 157:    */   {
/* 158:275 */     this.endTime = endTime;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getExtInfo()
/* 162:    */   {
/* 163:279 */     return this.extInfo;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setExtInfo(String extInfo)
/* 167:    */   {
/* 168:282 */     this.extInfo = extInfo;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public ItemInfo getItemInfo()
/* 172:    */   {
/* 173:286 */     return this.itemInfo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setItemInfo(ItemInfo itemInfo)
/* 177:    */   {
/* 178:289 */     this.itemInfo = itemInfo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getLogo()
/* 182:    */   {
/* 183:293 */     return this.logo;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setLogo(String logo)
/* 187:    */   {
/* 188:296 */     this.logo = logo;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getMaxAmount()
/* 192:    */   {
/* 193:300 */     return this.maxAmount;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setMaxAmount(String maxAmount)
/* 197:    */   {
/* 198:303 */     this.maxAmount = maxAmount;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public MergeVerifyConfig getMergeVerifyConfig()
/* 202:    */   {
/* 203:307 */     return this.mergeVerifyConfig;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setMergeVerifyConfig(MergeVerifyConfig mergeVerifyConfig)
/* 207:    */   {
/* 208:310 */     this.mergeVerifyConfig = mergeVerifyConfig;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getMultiUseMode()
/* 212:    */   {
/* 213:314 */     return this.multiUseMode;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void setMultiUseMode(String multiUseMode)
/* 217:    */   {
/* 218:317 */     this.multiUseMode = multiUseMode;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public String getName()
/* 222:    */   {
/* 223:321 */     return this.name;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void setName(String name)
/* 227:    */   {
/* 228:324 */     this.name = name;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public String getRate()
/* 232:    */   {
/* 233:328 */     return this.rate;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public void setRate(String rate)
/* 237:    */   {
/* 238:331 */     this.rate = rate;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public String getRelativeTime()
/* 242:    */   {
/* 243:335 */     return this.relativeTime;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void setRelativeTime(String relativeTime)
/* 247:    */   {
/* 248:338 */     this.relativeTime = relativeTime;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public Date getStartTime()
/* 252:    */   {
/* 253:342 */     return this.startTime;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public void setStartTime(Date startTime)
/* 257:    */   {
/* 258:345 */     this.startTime = startTime;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public String getType()
/* 262:    */   {
/* 263:349 */     return this.type;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void setType(String type)
/* 267:    */   {
/* 268:352 */     this.type = type;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public List<String> getUseInstructions()
/* 272:    */   {
/* 273:356 */     return this.useInstructions;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public void setUseInstructions(List<String> useInstructions)
/* 277:    */   {
/* 278:359 */     this.useInstructions = useInstructions;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public UseRule getUseRule()
/* 282:    */   {
/* 283:363 */     return this.useRule;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public void setUseRule(UseRule useRule)
/* 287:    */   {
/* 288:366 */     this.useRule = useRule;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public String getValidateType()
/* 292:    */   {
/* 293:370 */     return this.validateType;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public void setValidateType(String validateType)
/* 297:    */   {
/* 298:373 */     this.validateType = validateType;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public String getVerifyMode()
/* 302:    */   {
/* 303:377 */     return this.verifyMode;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public void setVerifyMode(String verifyMode)
/* 307:    */   {
/* 308:380 */     this.verifyMode = verifyMode;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public String getVoucherImg()
/* 312:    */   {
/* 313:384 */     return this.voucherImg;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public void setVoucherImg(String voucherImg)
/* 317:    */   {
/* 318:387 */     this.voucherImg = voucherImg;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public String getVoucherNote()
/* 322:    */   {
/* 323:391 */     return this.voucherNote;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void setVoucherNote(String voucherNote)
/* 327:    */   {
/* 328:394 */     this.voucherNote = voucherNote;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public String getWorthValue()
/* 332:    */   {
/* 333:398 */     return this.worthValue;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public void setWorthValue(String worthValue)
/* 337:    */   {
/* 338:401 */     this.worthValue = worthValue;
/* 339:    */   }
/* 340:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.Voucher
 * JD-Core Version:    0.7.0.1
 */