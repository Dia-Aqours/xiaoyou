/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class ShopSummaryQueryResponse
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 4316648626167862332L;
/*  12:    */   @ApiField("address")
/*  13:    */   private String address;
/*  14:    */   @ApiField("branch_shop_name")
/*  15:    */   private String branchShopName;
/*  16:    */   @ApiField("brand_name")
/*  17:    */   private String brandName;
/*  18:    */   @ApiField("business_time")
/*  19:    */   private String businessTime;
/*  20:    */   @ApiListField("category_infos")
/*  21:    */   @ApiField("shop_category_info")
/*  22:    */   private List<ShopCategoryInfo> categoryInfos;
/*  23:    */   @ApiField("city_code")
/*  24:    */   private String cityCode;
/*  25:    */   @ApiField("district_code")
/*  26:    */   private String districtCode;
/*  27:    */   @ApiField("gmt_create")
/*  28:    */   private String gmtCreate;
/*  29:    */   @ApiField("is_show")
/*  30:    */   private String isShow;
/*  31:    */   @ApiField("main_image")
/*  32:    */   private String mainImage;
/*  33:    */   @ApiField("main_shop_name")
/*  34:    */   private String mainShopName;
/*  35:    */   @ApiField("pic_coll")
/*  36:    */   private String picColl;
/*  37:    */   @ApiField("province_code")
/*  38:    */   private String provinceCode;
/*  39:    */   @ApiField("shop_comment_info")
/*  40:    */   private ShopCommentInfo shopCommentInfo;
/*  41:    */   @ApiField("shop_id")
/*  42:    */   private String shopId;
/*  43:    */   @ApiField("shop_type")
/*  44:    */   private String shopType;
/*  45:    */   @ApiField("status")
/*  46:    */   private String status;
/*  47:    */   
/*  48:    */   public String getAddress()
/*  49:    */   {
/*  50:123 */     return this.address;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAddress(String address)
/*  54:    */   {
/*  55:126 */     this.address = address;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getBranchShopName()
/*  59:    */   {
/*  60:130 */     return this.branchShopName;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBranchShopName(String branchShopName)
/*  64:    */   {
/*  65:133 */     this.branchShopName = branchShopName;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getBrandName()
/*  69:    */   {
/*  70:137 */     return this.brandName;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setBrandName(String brandName)
/*  74:    */   {
/*  75:140 */     this.brandName = brandName;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getBusinessTime()
/*  79:    */   {
/*  80:144 */     return this.businessTime;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setBusinessTime(String businessTime)
/*  84:    */   {
/*  85:147 */     this.businessTime = businessTime;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public List<ShopCategoryInfo> getCategoryInfos()
/*  89:    */   {
/*  90:151 */     return this.categoryInfos;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setCategoryInfos(List<ShopCategoryInfo> categoryInfos)
/*  94:    */   {
/*  95:154 */     this.categoryInfos = categoryInfos;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getCityCode()
/*  99:    */   {
/* 100:158 */     return this.cityCode;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setCityCode(String cityCode)
/* 104:    */   {
/* 105:161 */     this.cityCode = cityCode;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getDistrictCode()
/* 109:    */   {
/* 110:165 */     return this.districtCode;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setDistrictCode(String districtCode)
/* 114:    */   {
/* 115:168 */     this.districtCode = districtCode;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getGmtCreate()
/* 119:    */   {
/* 120:172 */     return this.gmtCreate;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setGmtCreate(String gmtCreate)
/* 124:    */   {
/* 125:175 */     this.gmtCreate = gmtCreate;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getIsShow()
/* 129:    */   {
/* 130:179 */     return this.isShow;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setIsShow(String isShow)
/* 134:    */   {
/* 135:182 */     this.isShow = isShow;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getMainImage()
/* 139:    */   {
/* 140:186 */     return this.mainImage;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setMainImage(String mainImage)
/* 144:    */   {
/* 145:189 */     this.mainImage = mainImage;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getMainShopName()
/* 149:    */   {
/* 150:193 */     return this.mainShopName;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setMainShopName(String mainShopName)
/* 154:    */   {
/* 155:196 */     this.mainShopName = mainShopName;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getPicColl()
/* 159:    */   {
/* 160:200 */     return this.picColl;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setPicColl(String picColl)
/* 164:    */   {
/* 165:203 */     this.picColl = picColl;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getProvinceCode()
/* 169:    */   {
/* 170:207 */     return this.provinceCode;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setProvinceCode(String provinceCode)
/* 174:    */   {
/* 175:210 */     this.provinceCode = provinceCode;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public ShopCommentInfo getShopCommentInfo()
/* 179:    */   {
/* 180:214 */     return this.shopCommentInfo;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setShopCommentInfo(ShopCommentInfo shopCommentInfo)
/* 184:    */   {
/* 185:217 */     this.shopCommentInfo = shopCommentInfo;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getShopId()
/* 189:    */   {
/* 190:221 */     return this.shopId;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setShopId(String shopId)
/* 194:    */   {
/* 195:224 */     this.shopId = shopId;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getShopType()
/* 199:    */   {
/* 200:228 */     return this.shopType;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setShopType(String shopType)
/* 204:    */   {
/* 205:231 */     this.shopType = shopType;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getStatus()
/* 209:    */   {
/* 210:235 */     return this.status;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setStatus(String status)
/* 214:    */   {
/* 215:238 */     this.status = status;
/* 216:    */   }
/* 217:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ShopSummaryQueryResponse
 * JD-Core Version:    0.7.0.1
 */