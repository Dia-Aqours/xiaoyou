/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class MaintainVehicleInfo
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 2498882234312912472L;
/*  13:    */   @ApiField("bg_url")
/*  14:    */   private String bgUrl;
/*  15:    */   @ApiField("engine_no")
/*  16:    */   private String engineNo;
/*  17:    */   @ApiField("engine_type")
/*  18:    */   private String engineType;
/*  19:    */   @ApiField("manufacturer")
/*  20:    */   private String manufacturer;
/*  21:    */   @ApiField("production_year")
/*  22:    */   private String productionYear;
/*  23:    */   @ApiListField("swept_volume")
/*  24:    */   @ApiField("string")
/*  25:    */   private List<String> sweptVolume;
/*  26:    */   @ApiField("vi_brand_logo")
/*  27:    */   private String viBrandLogo;
/*  28:    */   @ApiField("vi_brand_name")
/*  29:    */   private String viBrandName;
/*  30:    */   @ApiField("vi_city_id")
/*  31:    */   private String viCityId;
/*  32:    */   @ApiField("vi_city_name")
/*  33:    */   private String viCityName;
/*  34:    */   @ApiField("vi_logo_url")
/*  35:    */   private String viLogoUrl;
/*  36:    */   @ApiField("vi_mileage")
/*  37:    */   private String viMileage;
/*  38:    */   @ApiField("vi_model_name")
/*  39:    */   private String viModelName;
/*  40:    */   @ApiField("vi_number")
/*  41:    */   private String viNumber;
/*  42:    */   @ApiField("vi_series_name")
/*  43:    */   private String viSeriesName;
/*  44:    */   @ApiField("vi_start_time")
/*  45:    */   private Date viStartTime;
/*  46:    */   @ApiField("vi_style_name")
/*  47:    */   private String viStyleName;
/*  48:    */   @ApiListField("vi_vin")
/*  49:    */   @ApiField("string")
/*  50:    */   private List<String> viVin;
/*  51:    */   
/*  52:    */   public String getBgUrl()
/*  53:    */   {
/*  54:131 */     return this.bgUrl;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setBgUrl(String bgUrl)
/*  58:    */   {
/*  59:134 */     this.bgUrl = bgUrl;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getEngineNo()
/*  63:    */   {
/*  64:138 */     return this.engineNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setEngineNo(String engineNo)
/*  68:    */   {
/*  69:141 */     this.engineNo = engineNo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getEngineType()
/*  73:    */   {
/*  74:145 */     return this.engineType;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setEngineType(String engineType)
/*  78:    */   {
/*  79:148 */     this.engineType = engineType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getManufacturer()
/*  83:    */   {
/*  84:152 */     return this.manufacturer;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setManufacturer(String manufacturer)
/*  88:    */   {
/*  89:155 */     this.manufacturer = manufacturer;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getProductionYear()
/*  93:    */   {
/*  94:159 */     return this.productionYear;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setProductionYear(String productionYear)
/*  98:    */   {
/*  99:162 */     this.productionYear = productionYear;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public List<String> getSweptVolume()
/* 103:    */   {
/* 104:166 */     return this.sweptVolume;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setSweptVolume(List<String> sweptVolume)
/* 108:    */   {
/* 109:169 */     this.sweptVolume = sweptVolume;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getViBrandLogo()
/* 113:    */   {
/* 114:173 */     return this.viBrandLogo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setViBrandLogo(String viBrandLogo)
/* 118:    */   {
/* 119:176 */     this.viBrandLogo = viBrandLogo;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getViBrandName()
/* 123:    */   {
/* 124:180 */     return this.viBrandName;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setViBrandName(String viBrandName)
/* 128:    */   {
/* 129:183 */     this.viBrandName = viBrandName;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getViCityId()
/* 133:    */   {
/* 134:187 */     return this.viCityId;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setViCityId(String viCityId)
/* 138:    */   {
/* 139:190 */     this.viCityId = viCityId;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getViCityName()
/* 143:    */   {
/* 144:194 */     return this.viCityName;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setViCityName(String viCityName)
/* 148:    */   {
/* 149:197 */     this.viCityName = viCityName;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getViLogoUrl()
/* 153:    */   {
/* 154:201 */     return this.viLogoUrl;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setViLogoUrl(String viLogoUrl)
/* 158:    */   {
/* 159:204 */     this.viLogoUrl = viLogoUrl;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getViMileage()
/* 163:    */   {
/* 164:208 */     return this.viMileage;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void setViMileage(String viMileage)
/* 168:    */   {
/* 169:211 */     this.viMileage = viMileage;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String getViModelName()
/* 173:    */   {
/* 174:215 */     return this.viModelName;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setViModelName(String viModelName)
/* 178:    */   {
/* 179:218 */     this.viModelName = viModelName;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getViNumber()
/* 183:    */   {
/* 184:222 */     return this.viNumber;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setViNumber(String viNumber)
/* 188:    */   {
/* 189:225 */     this.viNumber = viNumber;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public String getViSeriesName()
/* 193:    */   {
/* 194:229 */     return this.viSeriesName;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setViSeriesName(String viSeriesName)
/* 198:    */   {
/* 199:232 */     this.viSeriesName = viSeriesName;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public Date getViStartTime()
/* 203:    */   {
/* 204:236 */     return this.viStartTime;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void setViStartTime(Date viStartTime)
/* 208:    */   {
/* 209:239 */     this.viStartTime = viStartTime;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public String getViStyleName()
/* 213:    */   {
/* 214:243 */     return this.viStyleName;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void setViStyleName(String viStyleName)
/* 218:    */   {
/* 219:246 */     this.viStyleName = viStyleName;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public List<String> getViVin()
/* 223:    */   {
/* 224:250 */     return this.viVin;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void setViVin(List<String> viVin)
/* 228:    */   {
/* 229:253 */     this.viVin = viVin;
/* 230:    */   }
/* 231:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MaintainVehicleInfo
 * JD-Core Version:    0.7.0.1
 */