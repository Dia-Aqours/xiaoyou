/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class OrderItem
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6789495753726757737L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("brand_name")
/*  13:    */   private String brandName;
/*  14:    */   @ApiField("category")
/*  15:    */   private String category;
/*  16:    */   @ApiField("city")
/*  17:    */   private String city;
/*  18:    */   @ApiField("commodity_id")
/*  19:    */   private String commodityId;
/*  20:    */   @ApiField("contacts")
/*  21:    */   private String contacts;
/*  22:    */   @ApiField("creator")
/*  23:    */   private String creator;
/*  24:    */   @ApiField("expire_date")
/*  25:    */   private String expireDate;
/*  26:    */   @ApiField("online_time")
/*  27:    */   private String onlineTime;
/*  28:    */   @ApiField("order_status")
/*  29:    */   private String orderStatus;
/*  30:    */   @ApiField("phone_no")
/*  31:    */   private String phoneNo;
/*  32:    */   @ApiField("province")
/*  33:    */   private String province;
/*  34:    */   @ApiField("shop_id")
/*  35:    */   private String shopId;
/*  36:    */   @ApiField("shop_name")
/*  37:    */   private String shopName;
/*  38:    */   @ApiField("shop_status")
/*  39:    */   private String shopStatus;
/*  40:    */   @ApiField("status")
/*  41:    */   private String status;
/*  42:    */   
/*  43:    */   public String getAddress()
/*  44:    */   {
/*  45:113 */     return this.address;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setAddress(String address)
/*  49:    */   {
/*  50:116 */     this.address = address;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getBrandName()
/*  54:    */   {
/*  55:120 */     return this.brandName;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setBrandName(String brandName)
/*  59:    */   {
/*  60:123 */     this.brandName = brandName;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getCategory()
/*  64:    */   {
/*  65:127 */     return this.category;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setCategory(String category)
/*  69:    */   {
/*  70:130 */     this.category = category;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getCity()
/*  74:    */   {
/*  75:134 */     return this.city;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setCity(String city)
/*  79:    */   {
/*  80:137 */     this.city = city;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getCommodityId()
/*  84:    */   {
/*  85:141 */     return this.commodityId;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setCommodityId(String commodityId)
/*  89:    */   {
/*  90:144 */     this.commodityId = commodityId;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getContacts()
/*  94:    */   {
/*  95:148 */     return this.contacts;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setContacts(String contacts)
/*  99:    */   {
/* 100:151 */     this.contacts = contacts;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getCreator()
/* 104:    */   {
/* 105:155 */     return this.creator;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setCreator(String creator)
/* 109:    */   {
/* 110:158 */     this.creator = creator;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getExpireDate()
/* 114:    */   {
/* 115:162 */     return this.expireDate;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setExpireDate(String expireDate)
/* 119:    */   {
/* 120:165 */     this.expireDate = expireDate;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getOnlineTime()
/* 124:    */   {
/* 125:169 */     return this.onlineTime;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setOnlineTime(String onlineTime)
/* 129:    */   {
/* 130:172 */     this.onlineTime = onlineTime;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getOrderStatus()
/* 134:    */   {
/* 135:176 */     return this.orderStatus;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setOrderStatus(String orderStatus)
/* 139:    */   {
/* 140:179 */     this.orderStatus = orderStatus;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getPhoneNo()
/* 144:    */   {
/* 145:183 */     return this.phoneNo;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setPhoneNo(String phoneNo)
/* 149:    */   {
/* 150:186 */     this.phoneNo = phoneNo;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getProvince()
/* 154:    */   {
/* 155:190 */     return this.province;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setProvince(String province)
/* 159:    */   {
/* 160:193 */     this.province = province;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getShopId()
/* 164:    */   {
/* 165:197 */     return this.shopId;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setShopId(String shopId)
/* 169:    */   {
/* 170:200 */     this.shopId = shopId;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getShopName()
/* 174:    */   {
/* 175:204 */     return this.shopName;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setShopName(String shopName)
/* 179:    */   {
/* 180:207 */     this.shopName = shopName;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getShopStatus()
/* 184:    */   {
/* 185:211 */     return this.shopStatus;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setShopStatus(String shopStatus)
/* 189:    */   {
/* 190:214 */     this.shopStatus = shopStatus;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getStatus()
/* 194:    */   {
/* 195:218 */     return this.status;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setStatus(String status)
/* 199:    */   {
/* 200:221 */     this.status = status;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.OrderItem
 * JD-Core Version:    0.7.0.1
 */