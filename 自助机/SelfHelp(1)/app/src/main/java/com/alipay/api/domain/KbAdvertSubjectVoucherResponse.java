/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;

/*   7:    */
/*   8:    */ public class KbAdvertSubjectVoucherResponse
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 4454571872989853115L;
/*  12:    */   @ApiField("brand_name")
/*  13:    */   private String brandName;
/*  14:    */   @ApiListField("city_ids")
/*  15:    */   @ApiField("string")
/*  16:    */   private List<String> cityIds;
/*  17:    */   @ApiField("cover")
/*  18:    */   private String cover;
/*  19:    */   @ApiField("daily_inventory")
/*  20:    */   private String dailyInventory;
/*  21:    */   @ApiField("gmt_end")
/*  22:    */   private String gmtEnd;
/*  23:    */   @ApiField("gmt_start")
/*  24:    */   private String gmtStart;
/*  25:    */   @ApiField("logo")
/*  26:    */   private String logo;
/*  27:    */   @ApiField("merchant_name")
/*  28:    */   private String merchantName;
/*  29:    */   @ApiField("partner_id")
/*  30:    */   private String partnerId;
/*  31:    */   @ApiListField("shop_ids")
/*  32:    */   @ApiField("string")
/*  33:    */   private List<String> shopIds;
/*  34:    */   @ApiField("total_inventory")
/*  35:    */   private String totalInventory;
/*  36:    */   @ApiField("voucher_id")
/*  37:    */   private String voucherId;
/*  38:    */   @ApiField("voucher_name")
/*  39:    */   private String voucherName;
/*  40:    */   @ApiField("voucher_type")
/*  41:    */   private String voucherType;
/*  42:    */   @ApiField("voucher_value")
/*  43:    */   private String voucherValue;
/*  44:    */   
/*  45:    */   public String getBrandName()
/*  46:    */   {
/*  47:115 */     return this.brandName;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setBrandName(String brandName)
/*  51:    */   {
/*  52:118 */     this.brandName = brandName;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public List<String> getCityIds()
/*  56:    */   {
/*  57:122 */     return this.cityIds;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setCityIds(List<String> cityIds)
/*  61:    */   {
/*  62:125 */     this.cityIds = cityIds;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getCover()
/*  66:    */   {
/*  67:129 */     return this.cover;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setCover(String cover)
/*  71:    */   {
/*  72:132 */     this.cover = cover;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getDailyInventory()
/*  76:    */   {
/*  77:136 */     return this.dailyInventory;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setDailyInventory(String dailyInventory)
/*  81:    */   {
/*  82:139 */     this.dailyInventory = dailyInventory;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getGmtEnd()
/*  86:    */   {
/*  87:143 */     return this.gmtEnd;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setGmtEnd(String gmtEnd)
/*  91:    */   {
/*  92:146 */     this.gmtEnd = gmtEnd;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getGmtStart()
/*  96:    */   {
/*  97:150 */     return this.gmtStart;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setGmtStart(String gmtStart)
/* 101:    */   {
/* 102:153 */     this.gmtStart = gmtStart;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getLogo()
/* 106:    */   {
/* 107:157 */     return this.logo;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setLogo(String logo)
/* 111:    */   {
/* 112:160 */     this.logo = logo;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getMerchantName()
/* 116:    */   {
/* 117:164 */     return this.merchantName;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setMerchantName(String merchantName)
/* 121:    */   {
/* 122:167 */     this.merchantName = merchantName;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getPartnerId()
/* 126:    */   {
/* 127:171 */     return this.partnerId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setPartnerId(String partnerId)
/* 131:    */   {
/* 132:174 */     this.partnerId = partnerId;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public List<String> getShopIds()
/* 136:    */   {
/* 137:178 */     return this.shopIds;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setShopIds(List<String> shopIds)
/* 141:    */   {
/* 142:181 */     this.shopIds = shopIds;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getTotalInventory()
/* 146:    */   {
/* 147:185 */     return this.totalInventory;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setTotalInventory(String totalInventory)
/* 151:    */   {
/* 152:188 */     this.totalInventory = totalInventory;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getVoucherId()
/* 156:    */   {
/* 157:192 */     return this.voucherId;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setVoucherId(String voucherId)
/* 161:    */   {
/* 162:195 */     this.voucherId = voucherId;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getVoucherName()
/* 166:    */   {
/* 167:199 */     return this.voucherName;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setVoucherName(String voucherName)
/* 171:    */   {
/* 172:202 */     this.voucherName = voucherName;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getVoucherType()
/* 176:    */   {
/* 177:206 */     return this.voucherType;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setVoucherType(String voucherType)
/* 181:    */   {
/* 182:209 */     this.voucherType = voucherType;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getVoucherValue()
/* 186:    */   {
/* 187:213 */     return this.voucherValue;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setVoucherValue(String voucherValue)
/* 191:    */   {
/* 192:216 */     this.voucherValue = voucherValue;
/* 193:    */   }
/* 194:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.KbAdvertSubjectVoucherResponse

 * JD-Core Version:    0.7.0.1

 */