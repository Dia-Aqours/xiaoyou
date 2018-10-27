/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.AlipayDataItemDescription;
/*   5:    */ import com.alipay.api.domain.AlipayDataItemSalesRule;
/*   6:    */ import com.alipay.api.domain.AlipayDataItemVoucherTemplete;
/*   7:    */ import com.alipay.api.internal.mapping.ApiField;
/*   8:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   9:    */ import java.util.Date;
/*  10:    */ import java.util.List;
/*  11:    */ 
/*  12:    */ public class AlipayOfflineMarketProductQuerydetailResponse
/*  13:    */   extends AlipayResponse
/*  14:    */ {
/*  15:    */   private static final long serialVersionUID = 8658968735632752681L;
/*  16:    */   @ApiField("cover")
/*  17:    */   private String cover;
/*  18:    */   @ApiListField("descriptions")
/*  19:    */   @ApiField("alipay_data_item_description")
/*  20:    */   private List<AlipayDataItemDescription> descriptions;
/*  21:    */   @ApiField("gmt_end")
/*  22:    */   private Date gmtEnd;
/*  23:    */   @ApiField("gmt_start")
/*  24:    */   private Date gmtStart;
/*  25:    */   @ApiField("inventory")
/*  26:    */   private Long inventory;
/*  27:    */   @ApiField("is_auto_expanded")
/*  28:    */   private Boolean isAutoExpanded;
/*  29:    */   @ApiField("item_status")
/*  30:    */   private String itemStatus;
/*  31:    */   @ApiField("item_type")
/*  32:    */   private String itemType;
/*  33:    */   @ApiField("pic_coll")
/*  34:    */   private String picColl;
/*  35:    */   @ApiField("purchase_mode")
/*  36:    */   private String purchaseMode;
/*  37:    */   @ApiField("sales_rule")
/*  38:    */   private AlipayDataItemSalesRule salesRule;
/*  39:    */   @ApiListField("shop_list")
/*  40:    */   @ApiField("string")
/*  41:    */   private List<String> shopList;
/*  42:    */   @ApiField("subject")
/*  43:    */   private String subject;
/*  44:    */   @ApiField("voucher_templete")
/*  45:    */   private AlipayDataItemVoucherTemplete voucherTemplete;
/*  46:    */   @ApiField("weight")
/*  47:    */   private Long weight;
/*  48:    */   
/*  49:    */   public void setCover(String cover)
/*  50:    */   {
/*  51:123 */     this.cover = cover;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getCover()
/*  55:    */   {
/*  56:126 */     return this.cover;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setDescriptions(List<AlipayDataItemDescription> descriptions)
/*  60:    */   {
/*  61:130 */     this.descriptions = descriptions;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public List<AlipayDataItemDescription> getDescriptions()
/*  65:    */   {
/*  66:133 */     return this.descriptions;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setGmtEnd(Date gmtEnd)
/*  70:    */   {
/*  71:137 */     this.gmtEnd = gmtEnd;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public Date getGmtEnd()
/*  75:    */   {
/*  76:140 */     return this.gmtEnd;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setGmtStart(Date gmtStart)
/*  80:    */   {
/*  81:144 */     this.gmtStart = gmtStart;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public Date getGmtStart()
/*  85:    */   {
/*  86:147 */     return this.gmtStart;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setInventory(Long inventory)
/*  90:    */   {
/*  91:151 */     this.inventory = inventory;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public Long getInventory()
/*  95:    */   {
/*  96:154 */     return this.inventory;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setIsAutoExpanded(Boolean isAutoExpanded)
/* 100:    */   {
/* 101:158 */     this.isAutoExpanded = isAutoExpanded;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public Boolean getIsAutoExpanded()
/* 105:    */   {
/* 106:161 */     return this.isAutoExpanded;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setItemStatus(String itemStatus)
/* 110:    */   {
/* 111:165 */     this.itemStatus = itemStatus;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getItemStatus()
/* 115:    */   {
/* 116:168 */     return this.itemStatus;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setItemType(String itemType)
/* 120:    */   {
/* 121:172 */     this.itemType = itemType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getItemType()
/* 125:    */   {
/* 126:175 */     return this.itemType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setPicColl(String picColl)
/* 130:    */   {
/* 131:179 */     this.picColl = picColl;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getPicColl()
/* 135:    */   {
/* 136:182 */     return this.picColl;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setPurchaseMode(String purchaseMode)
/* 140:    */   {
/* 141:186 */     this.purchaseMode = purchaseMode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getPurchaseMode()
/* 145:    */   {
/* 146:189 */     return this.purchaseMode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setSalesRule(AlipayDataItemSalesRule salesRule)
/* 150:    */   {
/* 151:193 */     this.salesRule = salesRule;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public AlipayDataItemSalesRule getSalesRule()
/* 155:    */   {
/* 156:196 */     return this.salesRule;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setShopList(List<String> shopList)
/* 160:    */   {
/* 161:200 */     this.shopList = shopList;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public List<String> getShopList()
/* 165:    */   {
/* 166:203 */     return this.shopList;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setSubject(String subject)
/* 170:    */   {
/* 171:207 */     this.subject = subject;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getSubject()
/* 175:    */   {
/* 176:210 */     return this.subject;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setVoucherTemplete(AlipayDataItemVoucherTemplete voucherTemplete)
/* 180:    */   {
/* 181:214 */     this.voucherTemplete = voucherTemplete;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public AlipayDataItemVoucherTemplete getVoucherTemplete()
/* 185:    */   {
/* 186:217 */     return this.voucherTemplete;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setWeight(Long weight)
/* 190:    */   {
/* 191:221 */     this.weight = weight;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Long getWeight()
/* 195:    */   {
/* 196:224 */     return this.weight;
/* 197:    */   }
/* 198:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayOfflineMarketProductQuerydetailResponse
 * JD-Core Version:    0.7.0.1
 */