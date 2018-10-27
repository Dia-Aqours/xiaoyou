/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class PricingVO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3334348725611878821L;
/*  10:    */   @ApiField("bid")
/*  11:    */   private String bid;
/*  12:    */   @ApiField("currency")
/*  13:    */   private String currency;
/*  14:    */   @ApiField("currency_unit")
/*  15:    */   private Long currencyUnit;
/*  16:    */   @ApiField("expiry_timestamp")
/*  17:    */   private String expiryTimestamp;
/*  18:    */   @ApiField("generate_timestamp")
/*  19:    */   private String generateTimestamp;
/*  20:    */   @ApiField("maturity_date")
/*  21:    */   private String maturityDate;
/*  22:    */   @ApiField("maximum_bid_amount")
/*  23:    */   private Long maximumBidAmount;
/*  24:    */   @ApiField("maximum_offer_amount")
/*  25:    */   private Long maximumOfferAmount;
/*  26:    */   @ApiField("memo")
/*  27:    */   private String memo;
/*  28:    */   @ApiField("mid")
/*  29:    */   private String mid;
/*  30:    */   @ApiField("minimum_bid_amount")
/*  31:    */   private Long minimumBidAmount;
/*  32:    */   @ApiField("minimum_offer_amount")
/*  33:    */   private Long minimumOfferAmount;
/*  34:    */   @ApiField("offer")
/*  35:    */   private String offer;
/*  36:    */   @ApiField("period")
/*  37:    */   private String period;
/*  38:    */   @ApiField("rate_reference_id")
/*  39:    */   private String rateReferenceId;
/*  40:    */   @ApiField("rate_type")
/*  41:    */   private String rateType;
/*  42:    */   @ApiField("spot_bid")
/*  43:    */   private String spotBid;
/*  44:    */   @ApiField("spot_mid")
/*  45:    */   private String spotMid;
/*  46:    */   @ApiField("spot_offer")
/*  47:    */   private String spotOffer;
/*  48:    */   @ApiField("start_timestamp")
/*  49:    */   private String startTimestamp;
/*  50:    */   @ApiField("symbol")
/*  51:    */   private String symbol;
/*  52:    */   @ApiField("threshold_timestamp")
/*  53:    */   private String thresholdTimestamp;
/*  54:    */   @ApiField("valid_timestamp")
/*  55:    */   private String validTimestamp;
/*  56:    */   
/*  57:    */   public String getBid()
/*  58:    */   {
/*  59:155 */     return this.bid;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setBid(String bid)
/*  63:    */   {
/*  64:158 */     this.bid = bid;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCurrency()
/*  68:    */   {
/*  69:162 */     return this.currency;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCurrency(String currency)
/*  73:    */   {
/*  74:165 */     this.currency = currency;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public Long getCurrencyUnit()
/*  78:    */   {
/*  79:169 */     return this.currencyUnit;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setCurrencyUnit(Long currencyUnit)
/*  83:    */   {
/*  84:172 */     this.currencyUnit = currencyUnit;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getExpiryTimestamp()
/*  88:    */   {
/*  89:176 */     return this.expiryTimestamp;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setExpiryTimestamp(String expiryTimestamp)
/*  93:    */   {
/*  94:179 */     this.expiryTimestamp = expiryTimestamp;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getGenerateTimestamp()
/*  98:    */   {
/*  99:183 */     return this.generateTimestamp;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setGenerateTimestamp(String generateTimestamp)
/* 103:    */   {
/* 104:186 */     this.generateTimestamp = generateTimestamp;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getMaturityDate()
/* 108:    */   {
/* 109:190 */     return this.maturityDate;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setMaturityDate(String maturityDate)
/* 113:    */   {
/* 114:193 */     this.maturityDate = maturityDate;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Long getMaximumBidAmount()
/* 118:    */   {
/* 119:197 */     return this.maximumBidAmount;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setMaximumBidAmount(Long maximumBidAmount)
/* 123:    */   {
/* 124:200 */     this.maximumBidAmount = maximumBidAmount;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public Long getMaximumOfferAmount()
/* 128:    */   {
/* 129:204 */     return this.maximumOfferAmount;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setMaximumOfferAmount(Long maximumOfferAmount)
/* 133:    */   {
/* 134:207 */     this.maximumOfferAmount = maximumOfferAmount;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getMemo()
/* 138:    */   {
/* 139:211 */     return this.memo;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setMemo(String memo)
/* 143:    */   {
/* 144:214 */     this.memo = memo;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getMid()
/* 148:    */   {
/* 149:218 */     return this.mid;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setMid(String mid)
/* 153:    */   {
/* 154:221 */     this.mid = mid;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public Long getMinimumBidAmount()
/* 158:    */   {
/* 159:225 */     return this.minimumBidAmount;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setMinimumBidAmount(Long minimumBidAmount)
/* 163:    */   {
/* 164:228 */     this.minimumBidAmount = minimumBidAmount;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public Long getMinimumOfferAmount()
/* 168:    */   {
/* 169:232 */     return this.minimumOfferAmount;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setMinimumOfferAmount(Long minimumOfferAmount)
/* 173:    */   {
/* 174:235 */     this.minimumOfferAmount = minimumOfferAmount;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getOffer()
/* 178:    */   {
/* 179:239 */     return this.offer;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setOffer(String offer)
/* 183:    */   {
/* 184:242 */     this.offer = offer;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getPeriod()
/* 188:    */   {
/* 189:246 */     return this.period;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setPeriod(String period)
/* 193:    */   {
/* 194:249 */     this.period = period;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getRateReferenceId()
/* 198:    */   {
/* 199:253 */     return this.rateReferenceId;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setRateReferenceId(String rateReferenceId)
/* 203:    */   {
/* 204:256 */     this.rateReferenceId = rateReferenceId;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getRateType()
/* 208:    */   {
/* 209:260 */     return this.rateType;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setRateType(String rateType)
/* 213:    */   {
/* 214:263 */     this.rateType = rateType;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getSpotBid()
/* 218:    */   {
/* 219:267 */     return this.spotBid;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setSpotBid(String spotBid)
/* 223:    */   {
/* 224:270 */     this.spotBid = spotBid;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public String getSpotMid()
/* 228:    */   {
/* 229:274 */     return this.spotMid;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void setSpotMid(String spotMid)
/* 233:    */   {
/* 234:277 */     this.spotMid = spotMid;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getSpotOffer()
/* 238:    */   {
/* 239:281 */     return this.spotOffer;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void setSpotOffer(String spotOffer)
/* 243:    */   {
/* 244:284 */     this.spotOffer = spotOffer;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public String getStartTimestamp()
/* 248:    */   {
/* 249:288 */     return this.startTimestamp;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void setStartTimestamp(String startTimestamp)
/* 253:    */   {
/* 254:291 */     this.startTimestamp = startTimestamp;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public String getSymbol()
/* 258:    */   {
/* 259:295 */     return this.symbol;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void setSymbol(String symbol)
/* 263:    */   {
/* 264:298 */     this.symbol = symbol;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public String getThresholdTimestamp()
/* 268:    */   {
/* 269:302 */     return this.thresholdTimestamp;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public void setThresholdTimestamp(String thresholdTimestamp)
/* 273:    */   {
/* 274:305 */     this.thresholdTimestamp = thresholdTimestamp;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public String getValidTimestamp()
/* 278:    */   {
/* 279:309 */     return this.validTimestamp;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void setValidTimestamp(String validTimestamp)
/* 283:    */   {
/* 284:312 */     this.validTimestamp = validTimestamp;
/* 285:    */   }
/* 286:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.PricingVO
 * JD-Core Version:    0.7.0.1
 */