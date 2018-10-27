/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayOfflineMarketLeadsBatchqueryModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 2327793395329257727L;
/*  12:    */   @ApiField("brand_name")
/*  13:    */   private String brandName;
/*  14:    */   @ApiField("category_id")
/*  15:    */   private String categoryId;
/*  16:    */   @ApiField("city_code")
/*  17:    */   private String cityCode;
/*  18:    */   @ApiField("district_code")
/*  19:    */   private String districtCode;
/*  20:    */   @ApiField("end_time")
/*  21:    */   private String endTime;
/*  22:    */   @ApiListField("leads_ids")
/*  23:    */   @ApiField("string")
/*  24:    */   private List<String> leadsIds;
/*  25:    */   @ApiField("leads_range")
/*  26:    */   private String leadsRange;
/*  27:    */   @ApiField("op_id")
/*  28:    */   private String opId;
/*  29:    */   @ApiField("page_no")
/*  30:    */   private Long pageNo;
/*  31:    */   @ApiField("page_size")
/*  32:    */   private Long pageSize;
/*  33:    */   @ApiField("province_code")
/*  34:    */   private String provinceCode;
/*  35:    */   @ApiListField("request_ids")
/*  36:    */   @ApiField("string")
/*  37:    */   private List<String> requestIds;
/*  38:    */   @ApiField("shop_name")
/*  39:    */   private String shopName;
/*  40:    */   @ApiField("start_time")
/*  41:    */   private String startTime;
/*  42:    */   @ApiField("status")
/*  43:    */   private String status;
/*  44:    */   
/*  45:    */   public String getBrandName()
/*  46:    */   {
/*  47:112 */     return this.brandName;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setBrandName(String brandName)
/*  51:    */   {
/*  52:115 */     this.brandName = brandName;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getCategoryId()
/*  56:    */   {
/*  57:119 */     return this.categoryId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setCategoryId(String categoryId)
/*  61:    */   {
/*  62:122 */     this.categoryId = categoryId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getCityCode()
/*  66:    */   {
/*  67:126 */     return this.cityCode;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setCityCode(String cityCode)
/*  71:    */   {
/*  72:129 */     this.cityCode = cityCode;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getDistrictCode()
/*  76:    */   {
/*  77:133 */     return this.districtCode;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setDistrictCode(String districtCode)
/*  81:    */   {
/*  82:136 */     this.districtCode = districtCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getEndTime()
/*  86:    */   {
/*  87:140 */     return this.endTime;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setEndTime(String endTime)
/*  91:    */   {
/*  92:143 */     this.endTime = endTime;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public List<String> getLeadsIds()
/*  96:    */   {
/*  97:147 */     return this.leadsIds;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setLeadsIds(List<String> leadsIds)
/* 101:    */   {
/* 102:150 */     this.leadsIds = leadsIds;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getLeadsRange()
/* 106:    */   {
/* 107:154 */     return this.leadsRange;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setLeadsRange(String leadsRange)
/* 111:    */   {
/* 112:157 */     this.leadsRange = leadsRange;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getOpId()
/* 116:    */   {
/* 117:161 */     return this.opId;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setOpId(String opId)
/* 121:    */   {
/* 122:164 */     this.opId = opId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public Long getPageNo()
/* 126:    */   {
/* 127:168 */     return this.pageNo;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setPageNo(Long pageNo)
/* 131:    */   {
/* 132:171 */     this.pageNo = pageNo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public Long getPageSize()
/* 136:    */   {
/* 137:175 */     return this.pageSize;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setPageSize(Long pageSize)
/* 141:    */   {
/* 142:178 */     this.pageSize = pageSize;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getProvinceCode()
/* 146:    */   {
/* 147:182 */     return this.provinceCode;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setProvinceCode(String provinceCode)
/* 151:    */   {
/* 152:185 */     this.provinceCode = provinceCode;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public List<String> getRequestIds()
/* 156:    */   {
/* 157:189 */     return this.requestIds;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setRequestIds(List<String> requestIds)
/* 161:    */   {
/* 162:192 */     this.requestIds = requestIds;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getShopName()
/* 166:    */   {
/* 167:196 */     return this.shopName;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setShopName(String shopName)
/* 171:    */   {
/* 172:199 */     this.shopName = shopName;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getStartTime()
/* 176:    */   {
/* 177:203 */     return this.startTime;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setStartTime(String startTime)
/* 181:    */   {
/* 182:206 */     this.startTime = startTime;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getStatus()
/* 186:    */   {
/* 187:210 */     return this.status;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setStatus(String status)
/* 191:    */   {
/* 192:213 */     this.status = status;
/* 193:    */   }
/* 194:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketLeadsBatchqueryModel
 * JD-Core Version:    0.7.0.1
 */