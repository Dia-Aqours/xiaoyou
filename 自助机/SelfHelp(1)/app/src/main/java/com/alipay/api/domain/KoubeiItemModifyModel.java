/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class KoubeiItemModifyModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 4534173462544723898L;
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
/*  26:    */   @ApiField("item_id")
/*  27:    */   private String itemId;
/*  28:    */   @ApiField("operation_context")
/*  29:    */   private KoubeiOperationContext operationContext;
/*  30:    */   @ApiField("original_price")
/*  31:    */   private String originalPrice;
/*  32:    */   @ApiField("picture_details")
/*  33:    */   private String pictureDetails;
/*  34:    */   @ApiField("price")
/*  35:    */   private String price;
/*  36:    */   @ApiField("request_id")
/*  37:    */   private String requestId;
/*  38:    */   @ApiField("shop_ids")
/*  39:    */   private String shopIds;
/*  40:    */   @ApiField("subject")
/*  41:    */   private String subject;
/*  42:    */   @ApiField("trade_voucher_item_template")
/*  43:    */   private KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate;
/*  44:    */   @ApiField("weight")
/*  45:    */   private String weight;
/*  46:    */   
/*  47:    */   public String getAuthCode()
/*  48:    */   {
/*  49:119 */     return this.authCode;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setAuthCode(String authCode)
/*  53:    */   {
/*  54:122 */     this.authCode = authCode;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getCover()
/*  58:    */   {
/*  59:126 */     return this.cover;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCover(String cover)
/*  63:    */   {
/*  64:129 */     this.cover = cover;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public List<KoubeiItemDescription> getDescriptions()
/*  68:    */   {
/*  69:133 */     return this.descriptions;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setDescriptions(List<KoubeiItemDescription> descriptions)
/*  73:    */   {
/*  74:136 */     this.descriptions = descriptions;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public Date getGmtStart()
/*  78:    */   {
/*  79:140 */     return this.gmtStart;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setGmtStart(Date gmtStart)
/*  83:    */   {
/*  84:143 */     this.gmtStart = gmtStart;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Long getInventory()
/*  88:    */   {
/*  89:147 */     return this.inventory;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setInventory(Long inventory)
/*  93:    */   {
/*  94:150 */     this.inventory = inventory;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getItemDetailUrl()
/*  98:    */   {
/*  99:154 */     return this.itemDetailUrl;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setItemDetailUrl(String itemDetailUrl)
/* 103:    */   {
/* 104:157 */     this.itemDetailUrl = itemDetailUrl;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getItemId()
/* 108:    */   {
/* 109:161 */     return this.itemId;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setItemId(String itemId)
/* 113:    */   {
/* 114:164 */     this.itemId = itemId;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public KoubeiOperationContext getOperationContext()
/* 118:    */   {
/* 119:168 */     return this.operationContext;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setOperationContext(KoubeiOperationContext operationContext)
/* 123:    */   {
/* 124:171 */     this.operationContext = operationContext;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getOriginalPrice()
/* 128:    */   {
/* 129:175 */     return this.originalPrice;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setOriginalPrice(String originalPrice)
/* 133:    */   {
/* 134:178 */     this.originalPrice = originalPrice;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getPictureDetails()
/* 138:    */   {
/* 139:182 */     return this.pictureDetails;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setPictureDetails(String pictureDetails)
/* 143:    */   {
/* 144:185 */     this.pictureDetails = pictureDetails;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getPrice()
/* 148:    */   {
/* 149:189 */     return this.price;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setPrice(String price)
/* 153:    */   {
/* 154:192 */     this.price = price;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getRequestId()
/* 158:    */   {
/* 159:196 */     return this.requestId;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setRequestId(String requestId)
/* 163:    */   {
/* 164:199 */     this.requestId = requestId;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getShopIds()
/* 168:    */   {
/* 169:203 */     return this.shopIds;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setShopIds(String shopIds)
/* 173:    */   {
/* 174:206 */     this.shopIds = shopIds;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getSubject()
/* 178:    */   {
/* 179:210 */     return this.subject;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setSubject(String subject)
/* 183:    */   {
/* 184:213 */     this.subject = subject;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public KoubeiTradeVoucherItemTemplete getTradeVoucherItemTemplate()
/* 188:    */   {
/* 189:217 */     return this.tradeVoucherItemTemplate;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setTradeVoucherItemTemplate(KoubeiTradeVoucherItemTemplete tradeVoucherItemTemplate)
/* 193:    */   {
/* 194:220 */     this.tradeVoucherItemTemplate = tradeVoucherItemTemplate;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getWeight()
/* 198:    */   {
/* 199:224 */     return this.weight;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setWeight(String weight)
/* 203:    */   {
/* 204:227 */     this.weight = weight;
/* 205:    */   }
/* 206:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiItemModifyModel
 * JD-Core Version:    0.7.0.1
 */