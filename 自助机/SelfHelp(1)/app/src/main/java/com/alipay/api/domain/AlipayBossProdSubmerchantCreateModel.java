/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayBossProdSubmerchantCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8251393641991263917L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("alias_name")
/*  13:    */   private String aliasName;
/*  14:    */   @ApiField("business_license")
/*  15:    */   private String businessLicense;
/*  16:    */   @ApiField("category_id")
/*  17:    */   private String categoryId;
/*  18:    */   @ApiField("city_code")
/*  19:    */   private String cityCode;
/*  20:    */   @ApiField("contact_email")
/*  21:    */   private String contactEmail;
/*  22:    */   @ApiField("contact_mobile")
/*  23:    */   private String contactMobile;
/*  24:    */   @ApiField("contact_name")
/*  25:    */   private String contactName;
/*  26:    */   @ApiField("contact_phone")
/*  27:    */   private String contactPhone;
/*  28:    */   @ApiField("district_code")
/*  29:    */   private String districtCode;
/*  30:    */   @ApiField("external_id")
/*  31:    */   private String externalId;
/*  32:    */   @ApiField("id_card")
/*  33:    */   private String idCard;
/*  34:    */   @ApiField("memo")
/*  35:    */   private String memo;
/*  36:    */   @ApiField("name")
/*  37:    */   private String name;
/*  38:    */   @ApiField("province_code")
/*  39:    */   private String provinceCode;
/*  40:    */   @ApiField("service_phone")
/*  41:    */   private String servicePhone;
/*  42:    */   @ApiField("source")
/*  43:    */   private String source;
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
/*  55:    */   public String getAliasName()
/*  56:    */   {
/*  57:126 */     return this.aliasName;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setAliasName(String aliasName)
/*  61:    */   {
/*  62:129 */     this.aliasName = aliasName;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getBusinessLicense()
/*  66:    */   {
/*  67:133 */     return this.businessLicense;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setBusinessLicense(String businessLicense)
/*  71:    */   {
/*  72:136 */     this.businessLicense = businessLicense;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getCategoryId()
/*  76:    */   {
/*  77:140 */     return this.categoryId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setCategoryId(String categoryId)
/*  81:    */   {
/*  82:143 */     this.categoryId = categoryId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getCityCode()
/*  86:    */   {
/*  87:147 */     return this.cityCode;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setCityCode(String cityCode)
/*  91:    */   {
/*  92:150 */     this.cityCode = cityCode;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getContactEmail()
/*  96:    */   {
/*  97:154 */     return this.contactEmail;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setContactEmail(String contactEmail)
/* 101:    */   {
/* 102:157 */     this.contactEmail = contactEmail;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getContactMobile()
/* 106:    */   {
/* 107:161 */     return this.contactMobile;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setContactMobile(String contactMobile)
/* 111:    */   {
/* 112:164 */     this.contactMobile = contactMobile;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getContactName()
/* 116:    */   {
/* 117:168 */     return this.contactName;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setContactName(String contactName)
/* 121:    */   {
/* 122:171 */     this.contactName = contactName;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getContactPhone()
/* 126:    */   {
/* 127:175 */     return this.contactPhone;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setContactPhone(String contactPhone)
/* 131:    */   {
/* 132:178 */     this.contactPhone = contactPhone;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getDistrictCode()
/* 136:    */   {
/* 137:182 */     return this.districtCode;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setDistrictCode(String districtCode)
/* 141:    */   {
/* 142:185 */     this.districtCode = districtCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getExternalId()
/* 146:    */   {
/* 147:189 */     return this.externalId;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setExternalId(String externalId)
/* 151:    */   {
/* 152:192 */     this.externalId = externalId;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getIdCard()
/* 156:    */   {
/* 157:196 */     return this.idCard;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setIdCard(String idCard)
/* 161:    */   {
/* 162:199 */     this.idCard = idCard;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getMemo()
/* 166:    */   {
/* 167:203 */     return this.memo;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setMemo(String memo)
/* 171:    */   {
/* 172:206 */     this.memo = memo;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getName()
/* 176:    */   {
/* 177:210 */     return this.name;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setName(String name)
/* 181:    */   {
/* 182:213 */     this.name = name;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getProvinceCode()
/* 186:    */   {
/* 187:217 */     return this.provinceCode;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setProvinceCode(String provinceCode)
/* 191:    */   {
/* 192:220 */     this.provinceCode = provinceCode;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getServicePhone()
/* 196:    */   {
/* 197:224 */     return this.servicePhone;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void setServicePhone(String servicePhone)
/* 201:    */   {
/* 202:227 */     this.servicePhone = servicePhone;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public String getSource()
/* 206:    */   {
/* 207:231 */     return this.source;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void setSource(String source)
/* 211:    */   {
/* 212:234 */     this.source = source;
/* 213:    */   }
/* 214:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayBossProdSubmerchantCreateModel
 * JD-Core Version:    0.7.0.1
 */