/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayOfflineSaleleadsInfoQuerybypageModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7866177893672573872L;
/*  10:    */   @ApiField("assign_principal_id")
/*  11:    */   private String assignPrincipalId;
/*  12:    */   @ApiField("brand_name")
/*  13:    */   private String brandName;
/*  14:    */   @ApiField("category_id")
/*  15:    */   private String categoryId;
/*  16:    */   @ApiField("city_code")
/*  17:    */   private String cityCode;
/*  18:    */   @ApiField("detail_category_id")
/*  19:    */   private String detailCategoryId;
/*  20:    */   @ApiField("district_code")
/*  21:    */   private String districtCode;
/*  22:    */   @ApiField("end_time")
/*  23:    */   private String endTime;
/*  24:    */   @ApiField("name")
/*  25:    */   private String name;
/*  26:    */   @ApiField("ope_type")
/*  27:    */   private String opeType;
/*  28:    */   @ApiField("page_num")
/*  29:    */   private String pageNum;
/*  30:    */   @ApiField("page_size")
/*  31:    */   private String pageSize;
/*  32:    */   @ApiField("province_code")
/*  33:    */   private String provinceCode;
/*  34:    */   @ApiField("query_time")
/*  35:    */   private String queryTime;
/*  36:    */   @ApiField("shop_name")
/*  37:    */   private String shopName;
/*  38:    */   @ApiField("sign_status")
/*  39:    */   private String signStatus;
/*  40:    */   @ApiField("start_time")
/*  41:    */   private String startTime;
/*  42:    */   @ApiField("sub_category_id")
/*  43:    */   private String subCategoryId;
/*  44:    */   
/*  45:    */   public String getAssignPrincipalId()
/*  46:    */   {
/*  47:119 */     return this.assignPrincipalId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setAssignPrincipalId(String assignPrincipalId)
/*  51:    */   {
/*  52:122 */     this.assignPrincipalId = assignPrincipalId;
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
/*  85:    */   public String getDetailCategoryId()
/*  86:    */   {
/*  87:147 */     return this.detailCategoryId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setDetailCategoryId(String detailCategoryId)
/*  91:    */   {
/*  92:150 */     this.detailCategoryId = detailCategoryId;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getDistrictCode()
/*  96:    */   {
/*  97:154 */     return this.districtCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setDistrictCode(String districtCode)
/* 101:    */   {
/* 102:157 */     this.districtCode = districtCode;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getEndTime()
/* 106:    */   {
/* 107:161 */     return this.endTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setEndTime(String endTime)
/* 111:    */   {
/* 112:164 */     this.endTime = endTime;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getName()
/* 116:    */   {
/* 117:168 */     return this.name;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setName(String name)
/* 121:    */   {
/* 122:171 */     this.name = name;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getOpeType()
/* 126:    */   {
/* 127:175 */     return this.opeType;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setOpeType(String opeType)
/* 131:    */   {
/* 132:178 */     this.opeType = opeType;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getPageNum()
/* 136:    */   {
/* 137:182 */     return this.pageNum;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setPageNum(String pageNum)
/* 141:    */   {
/* 142:185 */     this.pageNum = pageNum;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getPageSize()
/* 146:    */   {
/* 147:189 */     return this.pageSize;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setPageSize(String pageSize)
/* 151:    */   {
/* 152:192 */     this.pageSize = pageSize;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getProvinceCode()
/* 156:    */   {
/* 157:196 */     return this.provinceCode;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setProvinceCode(String provinceCode)
/* 161:    */   {
/* 162:199 */     this.provinceCode = provinceCode;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getQueryTime()
/* 166:    */   {
/* 167:203 */     return this.queryTime;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setQueryTime(String queryTime)
/* 171:    */   {
/* 172:206 */     this.queryTime = queryTime;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getShopName()
/* 176:    */   {
/* 177:210 */     return this.shopName;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setShopName(String shopName)
/* 181:    */   {
/* 182:213 */     this.shopName = shopName;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getSignStatus()
/* 186:    */   {
/* 187:217 */     return this.signStatus;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setSignStatus(String signStatus)
/* 191:    */   {
/* 192:220 */     this.signStatus = signStatus;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getStartTime()
/* 196:    */   {
/* 197:224 */     return this.startTime;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public void setStartTime(String startTime)
/* 201:    */   {
/* 202:227 */     this.startTime = startTime;
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

 * Qualified Name:     com.alipay.api.domain.AlipayOfflineSaleleadsInfoQuerybypageModel

 * JD-Core Version:    0.7.0.1

 */