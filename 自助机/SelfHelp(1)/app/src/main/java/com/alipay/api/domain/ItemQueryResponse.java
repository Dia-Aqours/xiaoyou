/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class ItemQueryResponse
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 8738542859255512665L;
/*  12:    */   @ApiField("cover")
/*  13:    */   private String cover;
/*  14:    */   @ApiListField("descriptions")
/*  15:    */   @ApiField("koubei_item_description")
/*  16:    */   private List<KoubeiItemDescription> descriptions;
/*  17:    */   @ApiField("gmt_start")
/*  18:    */   private String gmtStart;
/*  19:    */   @ApiField("inventory")
/*  20:    */   private Long inventory;
/*  21:    */   @ApiField("item_id")
/*  22:    */   private String itemId;
/*  23:    */   @ApiField("item_status")
/*  24:    */   private String itemStatus;
/*  25:    */   @ApiField("item_type")
/*  26:    */   private String itemType;
/*  27:    */   @ApiField("original_price")
/*  28:    */   private String originalPrice;
/*  29:    */   @ApiListField("pic_coll")
/*  30:    */   @ApiField("string")
/*  31:    */   private List<String> picColl;
/*  32:    */   @ApiField("picture_details")
/*  33:    */   private String pictureDetails;
/*  34:    */   @ApiField("price")
/*  35:    */   private String price;
/*  36:    */   @ApiField("price_mode")
/*  37:    */   private String priceMode;
/*  38:    */   @ApiField("shop_ids")
/*  39:    */   private String shopIds;
/*  40:    */   @ApiField("subject")
/*  41:    */   private String subject;
/*  42:    */   @ApiListField("trade_voucher_item_template")
/*  43:    */   @ApiField("koubei_trade_voucher_item_templete")
/*  44:    */   private List<KoubeiTradeVoucherItemTemplete> tradeVoucherItemTemplate;
/*  45:    */   @ApiField("weight")
/*  46:    */   private Long weight;
/*  47:    */   
/*  48:    */   public String getCover()
/*  49:    */   {
/*  50:120 */     return this.cover;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setCover(String cover)
/*  54:    */   {
/*  55:123 */     this.cover = cover;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public List<KoubeiItemDescription> getDescriptions()
/*  59:    */   {
/*  60:127 */     return this.descriptions;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setDescriptions(List<KoubeiItemDescription> descriptions)
/*  64:    */   {
/*  65:130 */     this.descriptions = descriptions;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getGmtStart()
/*  69:    */   {
/*  70:134 */     return this.gmtStart;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setGmtStart(String gmtStart)
/*  74:    */   {
/*  75:137 */     this.gmtStart = gmtStart;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Long getInventory()
/*  79:    */   {
/*  80:141 */     return this.inventory;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setInventory(Long inventory)
/*  84:    */   {
/*  85:144 */     this.inventory = inventory;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getItemId()
/*  89:    */   {
/*  90:148 */     return this.itemId;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setItemId(String itemId)
/*  94:    */   {
/*  95:151 */     this.itemId = itemId;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getItemStatus()
/*  99:    */   {
/* 100:155 */     return this.itemStatus;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setItemStatus(String itemStatus)
/* 104:    */   {
/* 105:158 */     this.itemStatus = itemStatus;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getItemType()
/* 109:    */   {
/* 110:162 */     return this.itemType;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setItemType(String itemType)
/* 114:    */   {
/* 115:165 */     this.itemType = itemType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getOriginalPrice()
/* 119:    */   {
/* 120:169 */     return this.originalPrice;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setOriginalPrice(String originalPrice)
/* 124:    */   {
/* 125:172 */     this.originalPrice = originalPrice;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public List<String> getPicColl()
/* 129:    */   {
/* 130:176 */     return this.picColl;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setPicColl(List<String> picColl)
/* 134:    */   {
/* 135:179 */     this.picColl = picColl;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getPictureDetails()
/* 139:    */   {
/* 140:183 */     return this.pictureDetails;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setPictureDetails(String pictureDetails)
/* 144:    */   {
/* 145:186 */     this.pictureDetails = pictureDetails;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getPrice()
/* 149:    */   {
/* 150:190 */     return this.price;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setPrice(String price)
/* 154:    */   {
/* 155:193 */     this.price = price;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getPriceMode()
/* 159:    */   {
/* 160:197 */     return this.priceMode;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setPriceMode(String priceMode)
/* 164:    */   {
/* 165:200 */     this.priceMode = priceMode;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getShopIds()
/* 169:    */   {
/* 170:204 */     return this.shopIds;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setShopIds(String shopIds)
/* 174:    */   {
/* 175:207 */     this.shopIds = shopIds;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getSubject()
/* 179:    */   {
/* 180:211 */     return this.subject;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setSubject(String subject)
/* 184:    */   {
/* 185:214 */     this.subject = subject;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public List<KoubeiTradeVoucherItemTemplete> getTradeVoucherItemTemplate()
/* 189:    */   {
/* 190:218 */     return this.tradeVoucherItemTemplate;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setTradeVoucherItemTemplate(List<KoubeiTradeVoucherItemTemplete> tradeVoucherItemTemplate)
/* 194:    */   {
/* 195:221 */     this.tradeVoucherItemTemplate = tradeVoucherItemTemplate;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public Long getWeight()
/* 199:    */   {
/* 200:225 */     return this.weight;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setWeight(Long weight)
/* 204:    */   {
/* 205:228 */     this.weight = weight;
/* 206:    */   }
/* 207:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ItemQueryResponse
 * JD-Core Version:    0.7.0.1
 */