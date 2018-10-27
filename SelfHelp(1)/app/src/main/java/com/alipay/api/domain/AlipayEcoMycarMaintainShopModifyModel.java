/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayEcoMycarMaintainShopModifyModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5686798788148513546L;
/*  12:    */   @ApiField("address")
/*  13:    */   private String address;
/*  14:    */   @ApiField("alipay_account")
/*  15:    */   private String alipayAccount;
/*  16:    */   @ApiField("city_code")
/*  17:    */   private String cityCode;
/*  18:    */   @ApiField("close_time")
/*  19:    */   private String closeTime;
/*  20:    */   @ApiField("contact_email")
/*  21:    */   private String contactEmail;
/*  22:    */   @ApiField("contact_mobile_phone")
/*  23:    */   private String contactMobilePhone;
/*  24:    */   @ApiField("contact_name")
/*  25:    */   private String contactName;
/*  26:    */   @ApiField("district_code")
/*  27:    */   private String districtCode;
/*  28:    */   @ApiListField("industry_app_category_id")
/*  29:    */   @ApiField("number")
/*  30:    */   private List<Long> industryAppCategoryId;
/*  31:    */   @ApiListField("industry_category_id")
/*  32:    */   @ApiField("number")
/*  33:    */   private List<Long> industryCategoryId;
/*  34:    */   @ApiField("lat")
/*  35:    */   private String lat;
/*  36:    */   @ApiField("lon")
/*  37:    */   private String lon;
/*  38:    */   @ApiField("main_image")
/*  39:    */   private String mainImage;
/*  40:    */   @ApiField("merchant_branch_id")
/*  41:    */   private Long merchantBranchId;
/*  42:    */   @ApiField("open_time")
/*  43:    */   private String openTime;
/*  44:    */   @ApiListField("other_images")
/*  45:    */   @ApiField("string")
/*  46:    */   private List<String> otherImages;
/*  47:    */   @ApiField("out_shop_id")
/*  48:    */   private String outShopId;
/*  49:    */   @ApiField("province_code")
/*  50:    */   private String provinceCode;
/*  51:    */   @ApiField("shop_branch_name")
/*  52:    */   private String shopBranchName;
/*  53:    */   @ApiField("shop_id")
/*  54:    */   private Long shopId;
/*  55:    */   @ApiField("shop_name")
/*  56:    */   private String shopName;
/*  57:    */   @ApiField("shop_tel")
/*  58:    */   private String shopTel;
/*  59:    */   @ApiField("shop_type")
/*  60:    */   private String shopType;
/*  61:    */   @ApiField("status")
/*  62:    */   private String status;
/*  63:    */   
/*  64:    */   public String getAddress()
/*  65:    */   {
/*  66:173 */     return this.address;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setAddress(String address)
/*  70:    */   {
/*  71:176 */     this.address = address;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getAlipayAccount()
/*  75:    */   {
/*  76:180 */     return this.alipayAccount;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setAlipayAccount(String alipayAccount)
/*  80:    */   {
/*  81:183 */     this.alipayAccount = alipayAccount;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getCityCode()
/*  85:    */   {
/*  86:187 */     return this.cityCode;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setCityCode(String cityCode)
/*  90:    */   {
/*  91:190 */     this.cityCode = cityCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getCloseTime()
/*  95:    */   {
/*  96:194 */     return this.closeTime;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setCloseTime(String closeTime)
/* 100:    */   {
/* 101:197 */     this.closeTime = closeTime;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getContactEmail()
/* 105:    */   {
/* 106:201 */     return this.contactEmail;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setContactEmail(String contactEmail)
/* 110:    */   {
/* 111:204 */     this.contactEmail = contactEmail;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getContactMobilePhone()
/* 115:    */   {
/* 116:208 */     return this.contactMobilePhone;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setContactMobilePhone(String contactMobilePhone)
/* 120:    */   {
/* 121:211 */     this.contactMobilePhone = contactMobilePhone;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getContactName()
/* 125:    */   {
/* 126:215 */     return this.contactName;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setContactName(String contactName)
/* 130:    */   {
/* 131:218 */     this.contactName = contactName;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getDistrictCode()
/* 135:    */   {
/* 136:222 */     return this.districtCode;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setDistrictCode(String districtCode)
/* 140:    */   {
/* 141:225 */     this.districtCode = districtCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public List<Long> getIndustryAppCategoryId()
/* 145:    */   {
/* 146:229 */     return this.industryAppCategoryId;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setIndustryAppCategoryId(List<Long> industryAppCategoryId)
/* 150:    */   {
/* 151:232 */     this.industryAppCategoryId = industryAppCategoryId;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public List<Long> getIndustryCategoryId()
/* 155:    */   {
/* 156:236 */     return this.industryCategoryId;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setIndustryCategoryId(List<Long> industryCategoryId)
/* 160:    */   {
/* 161:239 */     this.industryCategoryId = industryCategoryId;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getLat()
/* 165:    */   {
/* 166:243 */     return this.lat;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setLat(String lat)
/* 170:    */   {
/* 171:246 */     this.lat = lat;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getLon()
/* 175:    */   {
/* 176:250 */     return this.lon;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setLon(String lon)
/* 180:    */   {
/* 181:253 */     this.lon = lon;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getMainImage()
/* 185:    */   {
/* 186:257 */     return this.mainImage;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setMainImage(String mainImage)
/* 190:    */   {
/* 191:260 */     this.mainImage = mainImage;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Long getMerchantBranchId()
/* 195:    */   {
/* 196:264 */     return this.merchantBranchId;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setMerchantBranchId(Long merchantBranchId)
/* 200:    */   {
/* 201:267 */     this.merchantBranchId = merchantBranchId;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getOpenTime()
/* 205:    */   {
/* 206:271 */     return this.openTime;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setOpenTime(String openTime)
/* 210:    */   {
/* 211:274 */     this.openTime = openTime;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public List<String> getOtherImages()
/* 215:    */   {
/* 216:278 */     return this.otherImages;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setOtherImages(List<String> otherImages)
/* 220:    */   {
/* 221:281 */     this.otherImages = otherImages;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getOutShopId()
/* 225:    */   {
/* 226:285 */     return this.outShopId;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setOutShopId(String outShopId)
/* 230:    */   {
/* 231:288 */     this.outShopId = outShopId;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getProvinceCode()
/* 235:    */   {
/* 236:292 */     return this.provinceCode;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setProvinceCode(String provinceCode)
/* 240:    */   {
/* 241:295 */     this.provinceCode = provinceCode;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getShopBranchName()
/* 245:    */   {
/* 246:299 */     return this.shopBranchName;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setShopBranchName(String shopBranchName)
/* 250:    */   {
/* 251:302 */     this.shopBranchName = shopBranchName;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public Long getShopId()
/* 255:    */   {
/* 256:306 */     return this.shopId;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setShopId(Long shopId)
/* 260:    */   {
/* 261:309 */     this.shopId = shopId;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public String getShopName()
/* 265:    */   {
/* 266:313 */     return this.shopName;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setShopName(String shopName)
/* 270:    */   {
/* 271:316 */     this.shopName = shopName;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public String getShopTel()
/* 275:    */   {
/* 276:320 */     return this.shopTel;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public void setShopTel(String shopTel)
/* 280:    */   {
/* 281:323 */     this.shopTel = shopTel;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public String getShopType()
/* 285:    */   {
/* 286:327 */     return this.shopType;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void setShopType(String shopType)
/* 290:    */   {
/* 291:330 */     this.shopType = shopType;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public String getStatus()
/* 295:    */   {
/* 296:334 */     return this.status;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void setStatus(String status)
/* 300:    */   {
/* 301:337 */     this.status = status;
/* 302:    */   }
/* 303:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainShopModifyModel
 * JD-Core Version:    0.7.0.1
 */