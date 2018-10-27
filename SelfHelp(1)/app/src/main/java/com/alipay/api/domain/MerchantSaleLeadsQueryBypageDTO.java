/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MerchantSaleLeadsQueryBypageDTO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6619921213295462997L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("agent_alipay_card_no")
/*  13:    */   private String agentAlipayCardNo;
/*  14:    */   @ApiField("alipay_card_no")
/*  15:    */   private String alipayCardNo;
/*  16:    */   @ApiField("area")
/*  17:    */   private String area;
/*  18:    */   @ApiField("assign_alipay_staff_id")
/*  19:    */   private String assignAlipayStaffId;
/*  20:    */   @ApiField("assign_principal_id")
/*  21:    */   private String assignPrincipalId;
/*  22:    */   @ApiField("brand")
/*  23:    */   private String brand;
/*  24:    */   @ApiField("brand_code")
/*  25:    */   private String brandCode;
/*  26:    */   @ApiField("category")
/*  27:    */   private String category;
/*  28:    */   @ApiField("claim_status")
/*  29:    */   private String claimStatus;
/*  30:    */   @ApiField("contact_mobile")
/*  31:    */   private String contactMobile;
/*  32:    */   @ApiField("contact_name")
/*  33:    */   private String contactName;
/*  34:    */   @ApiField("description")
/*  35:    */   private String description;
/*  36:    */   @ApiField("ext_info")
/*  37:    */   private String extInfo;
/*  38:    */   @ApiField("ff_audit_status")
/*  39:    */   private String ffAuditStatus;
/*  40:    */   @ApiField("ff_online")
/*  41:    */   private String ffOnline;
/*  42:    */   @ApiField("gmt_create")
/*  43:    */   private String gmtCreate;
/*  44:    */   @ApiField("is_open_shop")
/*  45:    */   private String isOpenShop;
/*  46:    */   @ApiField("leands_id")
/*  47:    */   private String leandsId;
/*  48:    */   @ApiField("name")
/*  49:    */   private String name;
/*  50:    */   @ApiField("other_contact_info")
/*  51:    */   private String otherContactInfo;
/*  52:    */   @ApiField("scale")
/*  53:    */   private String scale;
/*  54:    */   @ApiField("seller_id")
/*  55:    */   private String sellerId;
/*  56:    */   @ApiField("seller_id_type")
/*  57:    */   private String sellerIdType;
/*  58:    */   @ApiField("shop_info")
/*  59:    */   private String shopInfo;
/*  60:    */   @ApiField("show_info")
/*  61:    */   private String showInfo;
/*  62:    */   @ApiField("sign_audit_status")
/*  63:    */   private String signAuditStatus;
/*  64:    */   @ApiField("sign_status")
/*  65:    */   private String signStatus;
/*  66:    */   
/*  67:    */   public String getAddress()
/*  68:    */   {
/*  69:185 */     return this.address;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setAddress(String address)
/*  73:    */   {
/*  74:188 */     this.address = address;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getAgentAlipayCardNo()
/*  78:    */   {
/*  79:192 */     return this.agentAlipayCardNo;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setAgentAlipayCardNo(String agentAlipayCardNo)
/*  83:    */   {
/*  84:195 */     this.agentAlipayCardNo = agentAlipayCardNo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getAlipayCardNo()
/*  88:    */   {
/*  89:199 */     return this.alipayCardNo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setAlipayCardNo(String alipayCardNo)
/*  93:    */   {
/*  94:202 */     this.alipayCardNo = alipayCardNo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getArea()
/*  98:    */   {
/*  99:206 */     return this.area;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setArea(String area)
/* 103:    */   {
/* 104:209 */     this.area = area;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getAssignAlipayStaffId()
/* 108:    */   {
/* 109:213 */     return this.assignAlipayStaffId;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setAssignAlipayStaffId(String assignAlipayStaffId)
/* 113:    */   {
/* 114:216 */     this.assignAlipayStaffId = assignAlipayStaffId;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getAssignPrincipalId()
/* 118:    */   {
/* 119:220 */     return this.assignPrincipalId;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setAssignPrincipalId(String assignPrincipalId)
/* 123:    */   {
/* 124:223 */     this.assignPrincipalId = assignPrincipalId;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getBrand()
/* 128:    */   {
/* 129:227 */     return this.brand;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setBrand(String brand)
/* 133:    */   {
/* 134:230 */     this.brand = brand;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getBrandCode()
/* 138:    */   {
/* 139:234 */     return this.brandCode;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setBrandCode(String brandCode)
/* 143:    */   {
/* 144:237 */     this.brandCode = brandCode;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getCategory()
/* 148:    */   {
/* 149:241 */     return this.category;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setCategory(String category)
/* 153:    */   {
/* 154:244 */     this.category = category;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getClaimStatus()
/* 158:    */   {
/* 159:248 */     return this.claimStatus;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setClaimStatus(String claimStatus)
/* 163:    */   {
/* 164:251 */     this.claimStatus = claimStatus;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getContactMobile()
/* 168:    */   {
/* 169:255 */     return this.contactMobile;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setContactMobile(String contactMobile)
/* 173:    */   {
/* 174:258 */     this.contactMobile = contactMobile;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getContactName()
/* 178:    */   {
/* 179:262 */     return this.contactName;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setContactName(String contactName)
/* 183:    */   {
/* 184:265 */     this.contactName = contactName;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getDescription()
/* 188:    */   {
/* 189:269 */     return this.description;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setDescription(String description)
/* 193:    */   {
/* 194:272 */     this.description = description;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getExtInfo()
/* 198:    */   {
/* 199:276 */     return this.extInfo;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setExtInfo(String extInfo)
/* 203:    */   {
/* 204:279 */     this.extInfo = extInfo;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getFfAuditStatus()
/* 208:    */   {
/* 209:283 */     return this.ffAuditStatus;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setFfAuditStatus(String ffAuditStatus)
/* 213:    */   {
/* 214:286 */     this.ffAuditStatus = ffAuditStatus;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getFfOnline()
/* 218:    */   {
/* 219:290 */     return this.ffOnline;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setFfOnline(String ffOnline)
/* 223:    */   {
/* 224:293 */     this.ffOnline = ffOnline;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public String getGmtCreate()
/* 228:    */   {
/* 229:297 */     return this.gmtCreate;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void setGmtCreate(String gmtCreate)
/* 233:    */   {
/* 234:300 */     this.gmtCreate = gmtCreate;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getIsOpenShop()
/* 238:    */   {
/* 239:304 */     return this.isOpenShop;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void setIsOpenShop(String isOpenShop)
/* 243:    */   {
/* 244:307 */     this.isOpenShop = isOpenShop;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public String getLeandsId()
/* 248:    */   {
/* 249:311 */     return this.leandsId;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void setLeandsId(String leandsId)
/* 253:    */   {
/* 254:314 */     this.leandsId = leandsId;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public String getName()
/* 258:    */   {
/* 259:318 */     return this.name;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void setName(String name)
/* 263:    */   {
/* 264:321 */     this.name = name;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public String getOtherContactInfo()
/* 268:    */   {
/* 269:325 */     return this.otherContactInfo;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public void setOtherContactInfo(String otherContactInfo)
/* 273:    */   {
/* 274:328 */     this.otherContactInfo = otherContactInfo;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public String getScale()
/* 278:    */   {
/* 279:332 */     return this.scale;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void setScale(String scale)
/* 283:    */   {
/* 284:335 */     this.scale = scale;
/* 285:    */   }
/* 286:    */   
/* 287:    */   public String getSellerId()
/* 288:    */   {
/* 289:339 */     return this.sellerId;
/* 290:    */   }
/* 291:    */   
/* 292:    */   public void setSellerId(String sellerId)
/* 293:    */   {
/* 294:342 */     this.sellerId = sellerId;
/* 295:    */   }
/* 296:    */   
/* 297:    */   public String getSellerIdType()
/* 298:    */   {
/* 299:346 */     return this.sellerIdType;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public void setSellerIdType(String sellerIdType)
/* 303:    */   {
/* 304:349 */     this.sellerIdType = sellerIdType;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public String getShopInfo()
/* 308:    */   {
/* 309:353 */     return this.shopInfo;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void setShopInfo(String shopInfo)
/* 313:    */   {
/* 314:356 */     this.shopInfo = shopInfo;
/* 315:    */   }
/* 316:    */   
/* 317:    */   public String getShowInfo()
/* 318:    */   {
/* 319:360 */     return this.showInfo;
/* 320:    */   }
/* 321:    */   
/* 322:    */   public void setShowInfo(String showInfo)
/* 323:    */   {
/* 324:363 */     this.showInfo = showInfo;
/* 325:    */   }
/* 326:    */   
/* 327:    */   public String getSignAuditStatus()
/* 328:    */   {
/* 329:367 */     return this.signAuditStatus;
/* 330:    */   }
/* 331:    */   
/* 332:    */   public void setSignAuditStatus(String signAuditStatus)
/* 333:    */   {
/* 334:370 */     this.signAuditStatus = signAuditStatus;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public String getSignStatus()
/* 338:    */   {
/* 339:374 */     return this.signStatus;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public void setSignStatus(String signStatus)
/* 343:    */   {
/* 344:377 */     this.signStatus = signStatus;
/* 345:    */   }
/* 346:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantSaleLeadsQueryBypageDTO
 * JD-Core Version:    0.7.0.1
 */