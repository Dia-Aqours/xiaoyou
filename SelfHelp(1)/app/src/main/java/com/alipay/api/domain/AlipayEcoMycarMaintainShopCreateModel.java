/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;

/*   7:    */
/*   8:    */ public class AlipayEcoMycarMaintainShopCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2285913515422172279L;
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
/*  53:    */   @ApiField("shop_name")
/*  54:    */   private String shopName;
/*  55:    */   @ApiField("shop_tel")
/*  56:    */   private String shopTel;
/*  57:    */   @ApiField("shop_type")
/*  58:    */   private String shopType;
/*  59:    */   @ApiField("status")
/*  60:    */   private String status;
/*  61:    */   
/*  62:    */   public String getAddress()
/*  63:    */   {
/*  64:168 */     return this.address;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setAddress(String address)
/*  68:    */   {
/*  69:171 */     this.address = address;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getAlipayAccount()
/*  73:    */   {
/*  74:175 */     return this.alipayAccount;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setAlipayAccount(String alipayAccount)
/*  78:    */   {
/*  79:178 */     this.alipayAccount = alipayAccount;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getCityCode()
/*  83:    */   {
/*  84:182 */     return this.cityCode;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setCityCode(String cityCode)
/*  88:    */   {
/*  89:185 */     this.cityCode = cityCode;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getCloseTime()
/*  93:    */   {
/*  94:189 */     return this.closeTime;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setCloseTime(String closeTime)
/*  98:    */   {
/*  99:192 */     this.closeTime = closeTime;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getContactEmail()
/* 103:    */   {
/* 104:196 */     return this.contactEmail;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setContactEmail(String contactEmail)
/* 108:    */   {
/* 109:199 */     this.contactEmail = contactEmail;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getContactMobilePhone()
/* 113:    */   {
/* 114:203 */     return this.contactMobilePhone;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setContactMobilePhone(String contactMobilePhone)
/* 118:    */   {
/* 119:206 */     this.contactMobilePhone = contactMobilePhone;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getContactName()
/* 123:    */   {
/* 124:210 */     return this.contactName;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setContactName(String contactName)
/* 128:    */   {
/* 129:213 */     this.contactName = contactName;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getDistrictCode()
/* 133:    */   {
/* 134:217 */     return this.districtCode;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setDistrictCode(String districtCode)
/* 138:    */   {
/* 139:220 */     this.districtCode = districtCode;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public List<Long> getIndustryAppCategoryId()
/* 143:    */   {
/* 144:224 */     return this.industryAppCategoryId;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setIndustryAppCategoryId(List<Long> industryAppCategoryId)
/* 148:    */   {
/* 149:227 */     this.industryAppCategoryId = industryAppCategoryId;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public List<Long> getIndustryCategoryId()
/* 153:    */   {
/* 154:231 */     return this.industryCategoryId;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setIndustryCategoryId(List<Long> industryCategoryId)
/* 158:    */   {
/* 159:234 */     this.industryCategoryId = industryCategoryId;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getLat()
/* 163:    */   {
/* 164:238 */     return this.lat;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void setLat(String lat)
/* 168:    */   {
/* 169:241 */     this.lat = lat;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String getLon()
/* 173:    */   {
/* 174:245 */     return this.lon;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setLon(String lon)
/* 178:    */   {
/* 179:248 */     this.lon = lon;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getMainImage()
/* 183:    */   {
/* 184:252 */     return this.mainImage;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setMainImage(String mainImage)
/* 188:    */   {
/* 189:255 */     this.mainImage = mainImage;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public Long getMerchantBranchId()
/* 193:    */   {
/* 194:259 */     return this.merchantBranchId;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setMerchantBranchId(Long merchantBranchId)
/* 198:    */   {
/* 199:262 */     this.merchantBranchId = merchantBranchId;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public String getOpenTime()
/* 203:    */   {
/* 204:266 */     return this.openTime;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void setOpenTime(String openTime)
/* 208:    */   {
/* 209:269 */     this.openTime = openTime;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public List<String> getOtherImages()
/* 213:    */   {
/* 214:273 */     return this.otherImages;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void setOtherImages(List<String> otherImages)
/* 218:    */   {
/* 219:276 */     this.otherImages = otherImages;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String getOutShopId()
/* 223:    */   {
/* 224:280 */     return this.outShopId;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void setOutShopId(String outShopId)
/* 228:    */   {
/* 229:283 */     this.outShopId = outShopId;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public String getProvinceCode()
/* 233:    */   {
/* 234:287 */     return this.provinceCode;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void setProvinceCode(String provinceCode)
/* 238:    */   {
/* 239:290 */     this.provinceCode = provinceCode;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public String getShopBranchName()
/* 243:    */   {
/* 244:294 */     return this.shopBranchName;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public void setShopBranchName(String shopBranchName)
/* 248:    */   {
/* 249:297 */     this.shopBranchName = shopBranchName;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public String getShopName()
/* 253:    */   {
/* 254:301 */     return this.shopName;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public void setShopName(String shopName)
/* 258:    */   {
/* 259:304 */     this.shopName = shopName;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public String getShopTel()
/* 263:    */   {
/* 264:308 */     return this.shopTel;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public void setShopTel(String shopTel)
/* 268:    */   {
/* 269:311 */     this.shopTel = shopTel;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public String getShopType()
/* 273:    */   {
/* 274:315 */     return this.shopType;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public void setShopType(String shopType)
/* 278:    */   {
/* 279:318 */     this.shopType = shopType;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public String getStatus()
/* 283:    */   {
/* 284:322 */     return this.status;
/* 285:    */   }
/* 286:    */   
/* 287:    */   public void setStatus(String status)
/* 288:    */   {
/* 289:325 */     this.status = status;
/* 290:    */   }
/* 291:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarMaintainShopCreateModel

 * JD-Core Version:    0.7.0.1

 */