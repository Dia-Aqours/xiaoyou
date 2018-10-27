/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayOfflineMarketItemCreateModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 4641386141656737343L;
/*  13:    */   @ApiField("audit_rule")
/*  14:    */   private AlipayItemAuditRule auditRule;
/*  15:    */   @ApiField("cover")
/*  16:    */   private String cover;
/*  17:    */   @ApiListField("descriptions")
/*  18:    */   @ApiField("alipay_item_description")
/*  19:    */   private List<AlipayItemDescription> descriptions;
/*  20:    */   @ApiField("gmt_end")
/*  21:    */   private Date gmtEnd;
/*  22:    */   @ApiField("gmt_start")
/*  23:    */   private Date gmtStart;
/*  24:    */   @ApiField("inventory")
/*  25:    */   private Long inventory;
/*  26:    */   @ApiField("is_auto_expanded")
/*  27:    */   private Boolean isAutoExpanded;
/*  28:    */   @ApiField("item_type")
/*  29:    */   private String itemType;
/*  30:    */   @ApiField("operate_notify_url")
/*  31:    */   private String operateNotifyUrl;
/*  32:    */   @ApiField("operation_context")
/*  33:    */   private AlipayItemOperationContext operationContext;
/*  34:    */   @ApiField("purchase_mode")
/*  35:    */   private String purchaseMode;
/*  36:    */   @ApiField("request_id")
/*  37:    */   private String requestId;
/*  38:    */   @ApiField("sales_rule")
/*  39:    */   private AlipayItemSalesRule salesRule;
/*  40:    */   @ApiField("shop_list")
/*  41:    */   private String shopList;
/*  42:    */   @ApiField("subject")
/*  43:    */   private String subject;
/*  44:    */   @ApiField("voucher_templete")
/*  45:    */   private AlipayItemVoucherTemplete voucherTemplete;
/*  46:    */   @ApiField("weight")
/*  47:    */   private Long weight;
/*  48:    */   
/*  49:    */   public AlipayItemAuditRule getAuditRule()
/*  50:    */   {
/*  51:126 */     return this.auditRule;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setAuditRule(AlipayItemAuditRule auditRule)
/*  55:    */   {
/*  56:129 */     this.auditRule = auditRule;
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
/*  69:    */   public List<AlipayItemDescription> getDescriptions()
/*  70:    */   {
/*  71:140 */     return this.descriptions;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setDescriptions(List<AlipayItemDescription> descriptions)
/*  75:    */   {
/*  76:143 */     this.descriptions = descriptions;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public Date getGmtEnd()
/*  80:    */   {
/*  81:147 */     return this.gmtEnd;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setGmtEnd(Date gmtEnd)
/*  85:    */   {
/*  86:150 */     this.gmtEnd = gmtEnd;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public Date getGmtStart()
/*  90:    */   {
/*  91:154 */     return this.gmtStart;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setGmtStart(Date gmtStart)
/*  95:    */   {
/*  96:157 */     this.gmtStart = gmtStart;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public Long getInventory()
/* 100:    */   {
/* 101:161 */     return this.inventory;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setInventory(Long inventory)
/* 105:    */   {
/* 106:164 */     this.inventory = inventory;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public Boolean getIsAutoExpanded()
/* 110:    */   {
/* 111:168 */     return this.isAutoExpanded;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setIsAutoExpanded(Boolean isAutoExpanded)
/* 115:    */   {
/* 116:171 */     this.isAutoExpanded = isAutoExpanded;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getItemType()
/* 120:    */   {
/* 121:175 */     return this.itemType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setItemType(String itemType)
/* 125:    */   {
/* 126:178 */     this.itemType = itemType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getOperateNotifyUrl()
/* 130:    */   {
/* 131:182 */     return this.operateNotifyUrl;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setOperateNotifyUrl(String operateNotifyUrl)
/* 135:    */   {
/* 136:185 */     this.operateNotifyUrl = operateNotifyUrl;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public AlipayItemOperationContext getOperationContext()
/* 140:    */   {
/* 141:189 */     return this.operationContext;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setOperationContext(AlipayItemOperationContext operationContext)
/* 145:    */   {
/* 146:192 */     this.operationContext = operationContext;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getPurchaseMode()
/* 150:    */   {
/* 151:196 */     return this.purchaseMode;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setPurchaseMode(String purchaseMode)
/* 155:    */   {
/* 156:199 */     this.purchaseMode = purchaseMode;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getRequestId()
/* 160:    */   {
/* 161:203 */     return this.requestId;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setRequestId(String requestId)
/* 165:    */   {
/* 166:206 */     this.requestId = requestId;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public AlipayItemSalesRule getSalesRule()
/* 170:    */   {
/* 171:210 */     return this.salesRule;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setSalesRule(AlipayItemSalesRule salesRule)
/* 175:    */   {
/* 176:213 */     this.salesRule = salesRule;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public String getShopList()
/* 180:    */   {
/* 181:217 */     return this.shopList;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setShopList(String shopList)
/* 185:    */   {
/* 186:220 */     this.shopList = shopList;
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
/* 199:    */   public AlipayItemVoucherTemplete getVoucherTemplete()
/* 200:    */   {
/* 201:231 */     return this.voucherTemplete;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setVoucherTemplete(AlipayItemVoucherTemplete voucherTemplete)
/* 205:    */   {
/* 206:234 */     this.voucherTemplete = voucherTemplete;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public Long getWeight()
/* 210:    */   {
/* 211:238 */     return this.weight;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setWeight(Long weight)
/* 215:    */   {
/* 216:241 */     this.weight = weight;
/* 217:    */   }
/* 218:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayOfflineMarketItemCreateModel
 * JD-Core Version:    0.7.0.1
 */