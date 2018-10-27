/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class IsvShopDishModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 7249761427217362921L;
/*  12:    */   @ApiField("content")
/*  13:    */   private String content;
/*  14:    */   @ApiField("dish_type_id")
/*  15:    */   private String dishTypeId;
/*  16:    */   @ApiField("dish_type_name")
/*  17:    */   private String dishTypeName;
/*  18:    */   @ApiField("good_level")
/*  19:    */   private String goodLevel;
/*  20:    */   @ApiField("merchant_sold_cnt_seven_d")
/*  21:    */   private Long merchantSoldCntSevenD;
/*  22:    */   @ApiField("merchant_sold_cnt_thirty_d")
/*  23:    */   private Long merchantSoldCntThirtyD;
/*  24:    */   @ApiField("merchant_sold_reusercnt_thirty_d")
/*  25:    */   private Long merchantSoldReusercntThirtyD;
/*  26:    */   @ApiField("merchant_sold_usercnt_thirty_d")
/*  27:    */   private Long merchantSoldUsercntThirtyD;
/*  28:    */   @ApiField("name")
/*  29:    */   private String name;
/*  30:    */   @ApiField("outer_dish_id")
/*  31:    */   private String outerDishId;
/*  32:    */   @ApiField("pict")
/*  33:    */   private String pict;
/*  34:    */   @ApiField("platform")
/*  35:    */   private String platform;
/*  36:    */   @ApiField("price")
/*  37:    */   private String price;
/*  38:    */   @ApiField("quantity")
/*  39:    */   private Long quantity;
/*  40:    */   @ApiField("shop_id")
/*  41:    */   private String shopId;
/*  42:    */   @ApiField("sold_cnt_seven_d")
/*  43:    */   private Long soldCntSevenD;
/*  44:    */   @ApiField("sold_cnt_thirty_d")
/*  45:    */   private Long soldCntThirtyD;
/*  46:    */   @ApiField("sold_reusercnt_thirty_d")
/*  47:    */   private Long soldReusercntThirtyD;
/*  48:    */   @ApiField("sold_usercnt_thirty_d")
/*  49:    */   private Long soldUsercntThirtyD;
/*  50:    */   @ApiListField("sort_col")
/*  51:    */   @ApiField("number")
/*  52:    */   private List<Long> sortCol;
/*  53:    */   @ApiField("unit")
/*  54:    */   private String unit;
/*  55:    */   
/*  56:    */   public String getContent()
/*  57:    */   {
/*  58:147 */     return this.content;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setContent(String content)
/*  62:    */   {
/*  63:150 */     this.content = content;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getDishTypeId()
/*  67:    */   {
/*  68:154 */     return this.dishTypeId;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setDishTypeId(String dishTypeId)
/*  72:    */   {
/*  73:157 */     this.dishTypeId = dishTypeId;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getDishTypeName()
/*  77:    */   {
/*  78:161 */     return this.dishTypeName;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setDishTypeName(String dishTypeName)
/*  82:    */   {
/*  83:164 */     this.dishTypeName = dishTypeName;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getGoodLevel()
/*  87:    */   {
/*  88:168 */     return this.goodLevel;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setGoodLevel(String goodLevel)
/*  92:    */   {
/*  93:171 */     this.goodLevel = goodLevel;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public Long getMerchantSoldCntSevenD()
/*  97:    */   {
/*  98:175 */     return this.merchantSoldCntSevenD;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setMerchantSoldCntSevenD(Long merchantSoldCntSevenD)
/* 102:    */   {
/* 103:178 */     this.merchantSoldCntSevenD = merchantSoldCntSevenD;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Long getMerchantSoldCntThirtyD()
/* 107:    */   {
/* 108:182 */     return this.merchantSoldCntThirtyD;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setMerchantSoldCntThirtyD(Long merchantSoldCntThirtyD)
/* 112:    */   {
/* 113:185 */     this.merchantSoldCntThirtyD = merchantSoldCntThirtyD;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public Long getMerchantSoldReusercntThirtyD()
/* 117:    */   {
/* 118:189 */     return this.merchantSoldReusercntThirtyD;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setMerchantSoldReusercntThirtyD(Long merchantSoldReusercntThirtyD)
/* 122:    */   {
/* 123:192 */     this.merchantSoldReusercntThirtyD = merchantSoldReusercntThirtyD;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Long getMerchantSoldUsercntThirtyD()
/* 127:    */   {
/* 128:196 */     return this.merchantSoldUsercntThirtyD;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setMerchantSoldUsercntThirtyD(Long merchantSoldUsercntThirtyD)
/* 132:    */   {
/* 133:199 */     this.merchantSoldUsercntThirtyD = merchantSoldUsercntThirtyD;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getName()
/* 137:    */   {
/* 138:203 */     return this.name;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setName(String name)
/* 142:    */   {
/* 143:206 */     this.name = name;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getOuterDishId()
/* 147:    */   {
/* 148:210 */     return this.outerDishId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setOuterDishId(String outerDishId)
/* 152:    */   {
/* 153:213 */     this.outerDishId = outerDishId;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getPict()
/* 157:    */   {
/* 158:217 */     return this.pict;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setPict(String pict)
/* 162:    */   {
/* 163:220 */     this.pict = pict;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getPlatform()
/* 167:    */   {
/* 168:224 */     return this.platform;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setPlatform(String platform)
/* 172:    */   {
/* 173:227 */     this.platform = platform;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getPrice()
/* 177:    */   {
/* 178:231 */     return this.price;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setPrice(String price)
/* 182:    */   {
/* 183:234 */     this.price = price;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public Long getQuantity()
/* 187:    */   {
/* 188:238 */     return this.quantity;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setQuantity(Long quantity)
/* 192:    */   {
/* 193:241 */     this.quantity = quantity;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public String getShopId()
/* 197:    */   {
/* 198:245 */     return this.shopId;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void setShopId(String shopId)
/* 202:    */   {
/* 203:248 */     this.shopId = shopId;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public Long getSoldCntSevenD()
/* 207:    */   {
/* 208:252 */     return this.soldCntSevenD;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setSoldCntSevenD(Long soldCntSevenD)
/* 212:    */   {
/* 213:255 */     this.soldCntSevenD = soldCntSevenD;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public Long getSoldCntThirtyD()
/* 217:    */   {
/* 218:259 */     return this.soldCntThirtyD;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setSoldCntThirtyD(Long soldCntThirtyD)
/* 222:    */   {
/* 223:262 */     this.soldCntThirtyD = soldCntThirtyD;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public Long getSoldReusercntThirtyD()
/* 227:    */   {
/* 228:266 */     return this.soldReusercntThirtyD;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void setSoldReusercntThirtyD(Long soldReusercntThirtyD)
/* 232:    */   {
/* 233:269 */     this.soldReusercntThirtyD = soldReusercntThirtyD;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public Long getSoldUsercntThirtyD()
/* 237:    */   {
/* 238:273 */     return this.soldUsercntThirtyD;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void setSoldUsercntThirtyD(Long soldUsercntThirtyD)
/* 242:    */   {
/* 243:276 */     this.soldUsercntThirtyD = soldUsercntThirtyD;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public List<Long> getSortCol()
/* 247:    */   {
/* 248:280 */     return this.sortCol;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void setSortCol(List<Long> sortCol)
/* 252:    */   {
/* 253:283 */     this.sortCol = sortCol;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public String getUnit()
/* 257:    */   {
/* 258:287 */     return this.unit;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public void setUnit(String unit)
/* 262:    */   {
/* 263:290 */     this.unit = unit;
/* 264:    */   }
/* 265:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.IsvShopDishModel
 * JD-Core Version:    0.7.0.1
 */