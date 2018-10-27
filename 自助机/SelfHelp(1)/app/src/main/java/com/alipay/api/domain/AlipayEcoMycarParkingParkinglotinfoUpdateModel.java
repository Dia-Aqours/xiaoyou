/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEcoMycarParkingParkinglotinfoUpdateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7132448299894529155L;
/*  10:    */   @ApiField("city_id")
/*  11:    */   private String cityId;
/*  12:    */   @ApiField("contact_alipay")
/*  13:    */   private String contactAlipay;
/*  14:    */   @ApiField("contact_email")
/*  15:    */   private String contactEmail;
/*  16:    */   @ApiField("contact_mobile")
/*  17:    */   private String contactMobile;
/*  18:    */   @ApiField("contact_name")
/*  19:    */   private String contactName;
/*  20:    */   @ApiField("contact_tel")
/*  21:    */   private String contactTel;
/*  22:    */   @ApiField("contact_weixin")
/*  23:    */   private String contactWeixin;
/*  24:    */   @ApiField("equipment_name")
/*  25:    */   private String equipmentName;
/*  26:    */   @ApiField("latitude")
/*  27:    */   private String latitude;
/*  28:    */   @ApiField("longitude")
/*  29:    */   private String longitude;
/*  30:    */   @ApiField("out_parking_id")
/*  31:    */   private String outParkingId;
/*  32:    */   @ApiField("parking_address")
/*  33:    */   private String parkingAddress;
/*  34:    */   @ApiField("parking_end_time")
/*  35:    */   private String parkingEndTime;
/*  36:    */   @ApiField("parking_fee_description")
/*  37:    */   private String parkingFeeDescription;
/*  38:    */   @ApiField("parking_id ")
/*  39:    */   private String parkingId;
/*  40:    */   @ApiField("parking_lot_type")
/*  41:    */   private String parkingLotType;
/*  42:    */   @ApiField("parking_name")
/*  43:    */   private String parkingName;
/*  44:    */   @ApiField("parking_number")
/*  45:    */   private String parkingNumber;
/*  46:    */   @ApiField("parking_start_time")
/*  47:    */   private String parkingStartTime;
/*  48:    */   @ApiField("parking_type")
/*  49:    */   private String parkingType;
/*  50:    */   @ApiField("pay_type")
/*  51:    */   private String payType;
/*  52:    */   @ApiField("payment_mode")
/*  53:    */   private String paymentMode;
/*  54:    */   @ApiField("shopingmall_id")
/*  55:    */   private String shopingmallId;
/*  56:    */   
/*  57:    */   public String getCityId()
/*  58:    */   {
/*  59:155 */     return this.cityId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCityId(String cityId)
/*  63:    */   {
/*  64:158 */     this.cityId = cityId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getContactAlipay()
/*  68:    */   {
/*  69:162 */     return this.contactAlipay;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setContactAlipay(String contactAlipay)
/*  73:    */   {
/*  74:165 */     this.contactAlipay = contactAlipay;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getContactEmail()
/*  78:    */   {
/*  79:169 */     return this.contactEmail;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setContactEmail(String contactEmail)
/*  83:    */   {
/*  84:172 */     this.contactEmail = contactEmail;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getContactMobile()
/*  88:    */   {
/*  89:176 */     return this.contactMobile;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setContactMobile(String contactMobile)
/*  93:    */   {
/*  94:179 */     this.contactMobile = contactMobile;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getContactName()
/*  98:    */   {
/*  99:183 */     return this.contactName;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setContactName(String contactName)
/* 103:    */   {
/* 104:186 */     this.contactName = contactName;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getContactTel()
/* 108:    */   {
/* 109:190 */     return this.contactTel;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setContactTel(String contactTel)
/* 113:    */   {
/* 114:193 */     this.contactTel = contactTel;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getContactWeixin()
/* 118:    */   {
/* 119:197 */     return this.contactWeixin;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setContactWeixin(String contactWeixin)
/* 123:    */   {
/* 124:200 */     this.contactWeixin = contactWeixin;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getEquipmentName()
/* 128:    */   {
/* 129:204 */     return this.equipmentName;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setEquipmentName(String equipmentName)
/* 133:    */   {
/* 134:207 */     this.equipmentName = equipmentName;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getLatitude()
/* 138:    */   {
/* 139:211 */     return this.latitude;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setLatitude(String latitude)
/* 143:    */   {
/* 144:214 */     this.latitude = latitude;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getLongitude()
/* 148:    */   {
/* 149:218 */     return this.longitude;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setLongitude(String longitude)
/* 153:    */   {
/* 154:221 */     this.longitude = longitude;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getOutParkingId()
/* 158:    */   {
/* 159:225 */     return this.outParkingId;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setOutParkingId(String outParkingId)
/* 163:    */   {
/* 164:228 */     this.outParkingId = outParkingId;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getParkingAddress()
/* 168:    */   {
/* 169:232 */     return this.parkingAddress;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setParkingAddress(String parkingAddress)
/* 173:    */   {
/* 174:235 */     this.parkingAddress = parkingAddress;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getParkingEndTime()
/* 178:    */   {
/* 179:239 */     return this.parkingEndTime;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setParkingEndTime(String parkingEndTime)
/* 183:    */   {
/* 184:242 */     this.parkingEndTime = parkingEndTime;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getParkingFeeDescription()
/* 188:    */   {
/* 189:246 */     return this.parkingFeeDescription;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setParkingFeeDescription(String parkingFeeDescription)
/* 193:    */   {
/* 194:249 */     this.parkingFeeDescription = parkingFeeDescription;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getParkingId()
/* 198:    */   {
/* 199:253 */     return this.parkingId;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setParkingId(String parkingId)
/* 203:    */   {
/* 204:256 */     this.parkingId = parkingId;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getParkingLotType()
/* 208:    */   {
/* 209:260 */     return this.parkingLotType;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setParkingLotType(String parkingLotType)
/* 213:    */   {
/* 214:263 */     this.parkingLotType = parkingLotType;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getParkingName()
/* 218:    */   {
/* 219:267 */     return this.parkingName;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setParkingName(String parkingName)
/* 223:    */   {
/* 224:270 */     this.parkingName = parkingName;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public String getParkingNumber()
/* 228:    */   {
/* 229:274 */     return this.parkingNumber;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void setParkingNumber(String parkingNumber)
/* 233:    */   {
/* 234:277 */     this.parkingNumber = parkingNumber;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getParkingStartTime()
/* 238:    */   {
/* 239:281 */     return this.parkingStartTime;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void setParkingStartTime(String parkingStartTime)
/* 243:    */   {
/* 244:284 */     this.parkingStartTime = parkingStartTime;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public String getParkingType()
/* 248:    */   {
/* 249:288 */     return this.parkingType;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void setParkingType(String parkingType)
/* 253:    */   {
/* 254:291 */     this.parkingType = parkingType;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public String getPayType()
/* 258:    */   {
/* 259:295 */     return this.payType;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void setPayType(String payType)
/* 263:    */   {
/* 264:298 */     this.payType = payType;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public String getPaymentMode()
/* 268:    */   {
/* 269:302 */     return this.paymentMode;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public void setPaymentMode(String paymentMode)
/* 273:    */   {
/* 274:305 */     this.paymentMode = paymentMode;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public String getShopingmallId()
/* 278:    */   {
/* 279:309 */     return this.shopingmallId;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void setShopingmallId(String shopingmallId)
/* 283:    */   {
/* 284:312 */     this.shopingmallId = shopingmallId;
/* 285:    */   }
/* 286:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMycarParkingParkinglotinfoUpdateModel
 * JD-Core Version:    0.7.0.1
 */