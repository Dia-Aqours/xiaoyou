/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayOfflineMarketLeadsCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 8488858974689628554L;
/*  12:    */   @ApiField("address")
/*  13:    */   private String address;
/*  14:    */   @ApiField("branch_shop_name")
/*  15:    */   private String branchShopName;
/*  16:    */   @ApiField("brand_name")
/*  17:    */   private String brandName;
/*  18:    */   @ApiField("category_id")
/*  19:    */   private String categoryId;
/*  20:    */   @ApiField("city_code")
/*  21:    */   private String cityCode;
/*  22:    */   @ApiField("company_name")
/*  23:    */   private String companyName;
/*  24:    */   @ApiField("contact_name")
/*  25:    */   private String contactName;
/*  26:    */   @ApiField("contact_number")
/*  27:    */   private String contactNumber;
/*  28:    */   @ApiListField("detail_images")
/*  29:    */   @ApiField("string")
/*  30:    */   private List<String> detailImages;
/*  31:    */   @ApiField("district_code")
/*  32:    */   private String districtCode;
/*  33:    */   @ApiField("latitude")
/*  34:    */   private Long latitude;
/*  35:    */   @ApiField("longitude")
/*  36:    */   private Long longitude;
/*  37:    */   @ApiField("main_image")
/*  38:    */   private String mainImage;
/*  39:    */   @ApiField("main_shop_name")
/*  40:    */   private String mainShopName;
/*  41:    */   @ApiField("memo")
/*  42:    */   private String memo;
/*  43:    */   @ApiField("op_id")
/*  44:    */   private String opId;
/*  45:    */   @ApiField("operate_notify_url")
/*  46:    */   private String operateNotifyUrl;
/*  47:    */   @ApiField("other_contact_info")
/*  48:    */   private String otherContactInfo;
/*  49:    */   @ApiField("province_code")
/*  50:    */   private String provinceCode;
/*  51:    */   @ApiField("request_id")
/*  52:    */   private String requestId;
/*  53:    */   
/*  54:    */   public String getAddress()
/*  55:    */   {
/*  56:141 */     return this.address;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setAddress(String address)
/*  60:    */   {
/*  61:144 */     this.address = address;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getBranchShopName()
/*  65:    */   {
/*  66:148 */     return this.branchShopName;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setBranchShopName(String branchShopName)
/*  70:    */   {
/*  71:151 */     this.branchShopName = branchShopName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getBrandName()
/*  75:    */   {
/*  76:155 */     return this.brandName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setBrandName(String brandName)
/*  80:    */   {
/*  81:158 */     this.brandName = brandName;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getCategoryId()
/*  85:    */   {
/*  86:162 */     return this.categoryId;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setCategoryId(String categoryId)
/*  90:    */   {
/*  91:165 */     this.categoryId = categoryId;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getCityCode()
/*  95:    */   {
/*  96:169 */     return this.cityCode;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setCityCode(String cityCode)
/* 100:    */   {
/* 101:172 */     this.cityCode = cityCode;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getCompanyName()
/* 105:    */   {
/* 106:176 */     return this.companyName;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setCompanyName(String companyName)
/* 110:    */   {
/* 111:179 */     this.companyName = companyName;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getContactName()
/* 115:    */   {
/* 116:183 */     return this.contactName;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setContactName(String contactName)
/* 120:    */   {
/* 121:186 */     this.contactName = contactName;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getContactNumber()
/* 125:    */   {
/* 126:190 */     return this.contactNumber;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setContactNumber(String contactNumber)
/* 130:    */   {
/* 131:193 */     this.contactNumber = contactNumber;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public List<String> getDetailImages()
/* 135:    */   {
/* 136:197 */     return this.detailImages;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setDetailImages(List<String> detailImages)
/* 140:    */   {
/* 141:200 */     this.detailImages = detailImages;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getDistrictCode()
/* 145:    */   {
/* 146:204 */     return this.districtCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setDistrictCode(String districtCode)
/* 150:    */   {
/* 151:207 */     this.districtCode = districtCode;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Long getLatitude()
/* 155:    */   {
/* 156:211 */     return this.latitude;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setLatitude(Long latitude)
/* 160:    */   {
/* 161:214 */     this.latitude = latitude;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public Long getLongitude()
/* 165:    */   {
/* 166:218 */     return this.longitude;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setLongitude(Long longitude)
/* 170:    */   {
/* 171:221 */     this.longitude = longitude;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getMainImage()
/* 175:    */   {
/* 176:225 */     return this.mainImage;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setMainImage(String mainImage)
/* 180:    */   {
/* 181:228 */     this.mainImage = mainImage;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getMainShopName()
/* 185:    */   {
/* 186:232 */     return this.mainShopName;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setMainShopName(String mainShopName)
/* 190:    */   {
/* 191:235 */     this.mainShopName = mainShopName;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public String getMemo()
/* 195:    */   {
/* 196:239 */     return this.memo;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setMemo(String memo)
/* 200:    */   {
/* 201:242 */     this.memo = memo;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getOpId()
/* 205:    */   {
/* 206:246 */     return this.opId;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setOpId(String opId)
/* 210:    */   {
/* 211:249 */     this.opId = opId;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getOperateNotifyUrl()
/* 215:    */   {
/* 216:253 */     return this.operateNotifyUrl;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 220:    */   {
/* 221:256 */     this.operateNotifyUrl = operateNotifyUrl;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getOtherContactInfo()
/* 225:    */   {
/* 226:260 */     return this.otherContactInfo;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setOtherContactInfo(String otherContactInfo)
/* 230:    */   {
/* 231:263 */     this.otherContactInfo = otherContactInfo;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getProvinceCode()
/* 235:    */   {
/* 236:267 */     return this.provinceCode;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setProvinceCode(String provinceCode)
/* 240:    */   {
/* 241:270 */     this.provinceCode = provinceCode;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getRequestId()
/* 245:    */   {
/* 246:274 */     return this.requestId;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setRequestId(String requestId)
/* 250:    */   {
/* 251:277 */     this.requestId = requestId;
/* 252:    */   }
/* 253:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketLeadsCreateModel
 * JD-Core Version:    0.7.0.1
 */