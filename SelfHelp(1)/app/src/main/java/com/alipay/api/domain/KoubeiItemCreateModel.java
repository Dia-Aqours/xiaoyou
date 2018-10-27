/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class KoubeiItemCreateModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 3341252529875325715L;
/*  13:    */   @ApiField("auth_code")
/*  14:    */   private String authCode;
/*  15:    */   @ApiField("cover")
/*  16:    */   private String cover;
/*  17:    */   @ApiListField("descriptions")
/*  18:    */   @ApiField("koubei_item_description")
/*  19:    */   private List<KoubeiItemDescription> descriptions;
/*  20:    */   @ApiField("gmt_start")
/*  21:    */   private Date gmtStart;
/*  22:    */   @ApiField("inventory")
/*  23:    */   private Long inventory;
/*  24:    */   @ApiField("item_detail_url")
/*  25:    */   private String itemDetailUrl;
/*  26:    */   @ApiField("item_type")
/*  27:    */   private String itemType;
/*  28:    */   @ApiField("operation_context")
/*  29:    */   private KoubeiOperationContext operationContext;
/*  30:    */   @ApiField("original_price")
/*  31:    */   private String originalPrice;
/*  32:    */   @ApiField("picture_details")
/*  33:    */   private String pictureDetails;
/*  34:    */   @ApiField("price")
/*  35:    */   private String price;
/*  36:    */   @ApiField("price_mode")
/*  37:    */   private String priceMode;
/*  38:    */   @ApiField("request_id")
/*  39:    */   private String requestId;
/*  40:    */   @ApiField("shop_ids")
/*  41:    */   private String shopIds;
/*  42:    */   @ApiField("subject")
/*  43:    */   private String subject;
/*  44:    */   @ApiField("trade_voucher_item_template")
/*  45:    */   private KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate;
/*  46:    */   @ApiField("weight")
/*  47:    */   private String weight;
/*  48:    */   
/*  49:    */   public String getAuthCode()
/*  50:    */   {
/*  51:126 */     return this.authCode;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setAuthCode(String authCode)
/*  55:    */   {
/*  56:129 */     this.authCode = authCode;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getCover()
/*  60:    */   {
/*  61:133 */     return this.cover;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCover(String cover)
/*  65:    */   {
/*  66:136 */     this.cover = cover;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public List<KoubeiItemDescription> getDescriptions()
/*  70:    */   {
/*  71:140 */     return this.descriptions;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setDescriptions(List<KoubeiItemDescription> descriptions)
/*  75:    */   {
/*  76:143 */     this.descriptions = descriptions;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public Date getGmtStart()
/*  80:    */   {
/*  81:147 */     return this.gmtStart;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setGmtStart(Date gmtStart)
/*  85:    */   {
/*  86:150 */     this.gmtStart = gmtStart;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public Long getInventory()
/*  90:    */   {
/*  91:154 */     return this.inventory;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setInventory(Long inventory)
/*  95:    */   {
/*  96:157 */     this.inventory = inventory;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getItemDetailUrl()
/* 100:    */   {
/* 101:161 */     return this.itemDetailUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setItemDetailUrl(String itemDetailUrl)
/* 105:    */   {
/* 106:164 */     this.itemDetailUrl = itemDetailUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getItemType()
/* 110:    */   {
/* 111:168 */     return this.itemType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setItemType(String itemType)
/* 115:    */   {
/* 116:171 */     this.itemType = itemType;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public KoubeiOperationContext getOperationContext()
/* 120:    */   {
/* 121:175 */     return this.operationContext;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setOperationContext(KoubeiOperationContext operationContext)
/* 125:    */   {
/* 126:178 */     this.operationContext = operationContext;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getOriginalPrice()
/* 130:    */   {
/* 131:182 */     return this.originalPrice;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setOriginalPrice(String originalPrice)
/* 135:    */   {
/* 136:185 */     this.originalPrice = originalPrice;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getPictureDetails()
/* 140:    */   {
/* 141:189 */     return this.pictureDetails;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setPictureDetails(String pictureDetails)
/* 145:    */   {
/* 146:192 */     this.pictureDetails = pictureDetails;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getPrice()
/* 150:    */   {
/* 151:196 */     return this.price;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setPrice(String price)
/* 155:    */   {
/* 156:199 */     this.price = price;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getPriceMode()
/* 160:    */   {
/* 161:203 */     return this.priceMode;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setPriceMode(String priceMode)
/* 165:    */   {
/* 166:206 */     this.priceMode = priceMode;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getRequestId()
/* 170:    */   {
/* 171:210 */     return this.requestId;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setRequestId(String requestId)
/* 175:    */   {
/* 176:213 */     this.requestId = requestId;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public String getShopIds()
/* 180:    */   {
/* 181:217 */     return this.shopIds;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setShopIds(String shopIds)
/* 185:    */   {
/* 186:220 */     this.shopIds = shopIds;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public String getSubject()
/* 190:    */   {
/* 191:224 */     return this.subject;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void setSubject(String subject)
/* 195:    */   {
/* 196:227 */     this.subject = subject;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public KoubeiTradeVoucherItemTemplete getTradeVoucherItemTemplate()
/* 200:    */   {
/* 201:231 */     return this.tradeVoucherItemTemplate;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setTradeVoucherItemTemplate(KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate)
/* 205:    */   {
/* 206:234 */     this.tradeVoucherItemTemplate = tradeVoucherItemTemplate;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public String getWeight()
/* 210:    */   {
/* 211:238 */     return this.weight;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setWeight(String weight)
/* 215:    */   {
/* 216:241 */     this.weight = weight;
/* 217:    */   }
/* 218:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemCreateModel
 * JD-Core Version:    0.7.0.1
 */