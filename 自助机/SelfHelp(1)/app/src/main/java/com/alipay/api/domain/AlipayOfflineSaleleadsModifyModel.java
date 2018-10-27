/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayOfflineSaleleadsModifyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2885552687539149399L;
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
/*  28:    */   @ApiField("leads_id")
/*  29:    */   private String leadsId;
/*  30:    */   @ApiField("name")
/*  31:    */   private String name;
/*  32:    */   @ApiField("ope_pid")
/*  33:    */   private String opePid;
/*  34:    */   @ApiField("other_contact_info")
/*  35:    */   private String otherContactInfo;
/*  36:    */   @ApiField("province_code")
/*  37:    */   private String provinceCode;
/*  38:    */   @ApiField("request_id")
/*  39:    */   private String requestId;
/*  40:    */   @ApiField("scale")
/*  41:    */   private String scale;
/*  42:    */   @ApiField("shop_info")
/*  43:    */   private String shopInfo;
/*  44:    */   @ApiField("sub_category_id")
/*  45:    */   private String subCategoryId;
/*  46:    */   
/*  47:    */   public String getAddress()
/*  48:    */   {
/*  49:125 */     return this.address;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setAddress(String address)
/*  53:    */   {
/*  54:128 */     this.address = address;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getBrandName()
/*  58:    */   {
/*  59:132 */     return this.brandName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setBrandName(String brandName)
/*  63:    */   {
/*  64:135 */     this.brandName = brandName;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCategoryId()
/*  68:    */   {
/*  69:139 */     return this.categoryId;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCategoryId(String categoryId)
/*  73:    */   {
/*  74:142 */     this.categoryId = categoryId;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getCityCode()
/*  78:    */   {
/*  79:146 */     return this.cityCode;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setCityCode(String cityCode)
/*  83:    */   {
/*  84:149 */     this.cityCode = cityCode;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getContactMobile()
/*  88:    */   {
/*  89:153 */     return this.contactMobile;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setContactMobile(String contactMobile)
/*  93:    */   {
/*  94:156 */     this.contactMobile = contactMobile;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getContactName()
/*  98:    */   {
/*  99:160 */     return this.contactName;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setContactName(String contactName)
/* 103:    */   {
/* 104:163 */     this.contactName = contactName;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getDescription()
/* 108:    */   {
/* 109:167 */     return this.description;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setDescription(String description)
/* 113:    */   {
/* 114:170 */     this.description = description;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getDetailCategoryId()
/* 118:    */   {
/* 119:174 */     return this.detailCategoryId;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setDetailCategoryId(String detailCategoryId)
/* 123:    */   {
/* 124:177 */     this.detailCategoryId = detailCategoryId;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getDistrictCode()
/* 128:    */   {
/* 129:181 */     return this.districtCode;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setDistrictCode(String districtCode)
/* 133:    */   {
/* 134:184 */     this.districtCode = districtCode;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getLeadsId()
/* 138:    */   {
/* 139:188 */     return this.leadsId;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setLeadsId(String leadsId)
/* 143:    */   {
/* 144:191 */     this.leadsId = leadsId;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getName()
/* 148:    */   {
/* 149:195 */     return this.name;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setName(String name)
/* 153:    */   {
/* 154:198 */     this.name = name;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getOpePid()
/* 158:    */   {
/* 159:202 */     return this.opePid;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setOpePid(String opePid)
/* 163:    */   {
/* 164:205 */     this.opePid = opePid;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getOtherContactInfo()
/* 168:    */   {
/* 169:209 */     return this.otherContactInfo;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setOtherContactInfo(String otherContactInfo)
/* 173:    */   {
/* 174:212 */     this.otherContactInfo = otherContactInfo;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getProvinceCode()
/* 178:    */   {
/* 179:216 */     return this.provinceCode;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setProvinceCode(String provinceCode)
/* 183:    */   {
/* 184:219 */     this.provinceCode = provinceCode;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getRequestId()
/* 188:    */   {
/* 189:223 */     return this.requestId;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setRequestId(String requestId)
/* 193:    */   {
/* 194:226 */     this.requestId = requestId;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getScale()
/* 198:    */   {
/* 199:230 */     return this.scale;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setScale(String scale)
/* 203:    */   {
/* 204:233 */     this.scale = scale;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getShopInfo()
/* 208:    */   {
/* 209:237 */     return this.shopInfo;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setShopInfo(String shopInfo)
/* 213:    */   {
/* 214:240 */     this.shopInfo = shopInfo;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getSubCategoryId()
/* 218:    */   {
/* 219:244 */     return this.subCategoryId;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setSubCategoryId(String subCategoryId)
/* 223:    */   {
/* 224:247 */     this.subCategoryId = subCategoryId;
/* 225:    */   }
/* 226:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsModifyModel

 * JD-Core Version:    0.7.0.1

 */