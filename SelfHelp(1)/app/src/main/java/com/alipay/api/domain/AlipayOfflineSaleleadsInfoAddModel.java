/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayOfflineSaleleadsInfoAddModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4294139373676121883L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("brand_name")
/*  13:    */   private String brandName;
/*  14:    */   @ApiField("category_id")
/*  15:    */   private String categoryId;
/*  16:    */   @ApiField("city_code")
/*  17:    */   private String cityCode;
/*  18:    */   @ApiField("contact_mobile")
/*  19:    */   private String contactMobile;
/*  20:    */   @ApiField("contact_name")
/*  21:    */   private String contactName;
/*  22:    */   @ApiField("description")
/*  23:    */   private String description;
/*  24:    */   @ApiField("detail_category_id")
/*  25:    */   private String detailCategoryId;
/*  26:    */   @ApiField("district_code")
/*  27:    */   private String districtCode;
/*  28:    */   @ApiField("name")
/*  29:    */   private String name;
/*  30:    */   @ApiField("ope_pid")
/*  31:    */   private String opePid;
/*  32:    */   @ApiField("other_contact_info")
/*  33:    */   private String otherContactInfo;
/*  34:    */   @ApiField("province_code")
/*  35:    */   private String provinceCode;
/*  36:    */   @ApiField("request_id")
/*  37:    */   private String requestId;
/*  38:    */   @ApiField("scale")
/*  39:    */   private Long scale;
/*  40:    */   @ApiField("shop_info")
/*  41:    */   private String shopInfo;
/*  42:    */   @ApiField("sub_category_id")
/*  43:    */   private String subCategoryId;
/*  44:    */   
/*  45:    */   public String getAddress()
/*  46:    */   {
/*  47:119 */     return this.address;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setAddress(String address)
/*  51:    */   {
/*  52:122 */     this.address = address;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getBrandName()
/*  56:    */   {
/*  57:126 */     return this.brandName;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setBrandName(String brandName)
/*  61:    */   {
/*  62:129 */     this.brandName = brandName;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getCategoryId()
/*  66:    */   {
/*  67:133 */     return this.categoryId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setCategoryId(String categoryId)
/*  71:    */   {
/*  72:136 */     this.categoryId = categoryId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getCityCode()
/*  76:    */   {
/*  77:140 */     return this.cityCode;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setCityCode(String cityCode)
/*  81:    */   {
/*  82:143 */     this.cityCode = cityCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getContactMobile()
/*  86:    */   {
/*  87:147 */     return this.contactMobile;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setContactMobile(String contactMobile)
/*  91:    */   {
/*  92:150 */     this.contactMobile = contactMobile;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getContactName()
/*  96:    */   {
/*  97:154 */     return this.contactName;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setContactName(String contactName)
/* 101:    */   {
/* 102:157 */     this.contactName = contactName;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getDescription()
/* 106:    */   {
/* 107:161 */     return this.description;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setDescription(String description)
/* 111:    */   {
/* 112:164 */     this.description = description;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getDetailCategoryId()
/* 116:    */   {
/* 117:168 */     return this.detailCategoryId;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setDetailCategoryId(String detailCategoryId)
/* 121:    */   {
/* 122:171 */     this.detailCategoryId = detailCategoryId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getDistrictCode()
/* 126:    */   {
/* 127:175 */     return this.districtCode;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setDistrictCode(String districtCode)
/* 131:    */   {
/* 132:178 */     this.districtCode = districtCode;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getName()
/* 136:    */   {
/* 137:182 */     return this.name;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setName(String name)
/* 141:    */   {
/* 142:185 */     this.name = name;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getOpePid()
/* 146:    */   {
/* 147:189 */     return this.opePid;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setOpePid(String opePid)
/* 151:    */   {
/* 152:192 */     this.opePid = opePid;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getOtherContactInfo()
/* 156:    */   {
/* 157:196 */     return this.otherContactInfo;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setOtherContactInfo(String otherContactInfo)
/* 161:    */   {
/* 162:199 */     this.otherContactInfo = otherContactInfo;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getProvinceCode()
/* 166:    */   {
/* 167:203 */     return this.provinceCode;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setProvinceCode(String provinceCode)
/* 171:    */   {
/* 172:206 */     this.provinceCode = provinceCode;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getRequestId()
/* 176:    */   {
/* 177:210 */     return this.requestId;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setRequestId(String requestId)
/* 181:    */   {
/* 182:213 */     this.requestId = requestId;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public Long getScale()
/* 186:    */   {
/* 187:217 */     return this.scale;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setScale(Long scale)
/* 191:    */   {
/* 192:220 */     this.scale = scale;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getShopInfo()
/* 196:    */   {
/* 197:224 */     return this.shopInfo;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void setShopInfo(String shopInfo)
/* 201:    */   {
/* 202:227 */     this.shopInfo = shopInfo;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public String getSubCategoryId()
/* 206:    */   {
/* 207:231 */     return this.subCategoryId;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void setSubCategoryId(String subCategoryId)
/* 211:    */   {
/* 212:234 */     this.subCategoryId = subCategoryId;
/* 213:    */   }
/* 214:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsInfoAddModel

 * JD-Core Version:    0.7.0.1

 */