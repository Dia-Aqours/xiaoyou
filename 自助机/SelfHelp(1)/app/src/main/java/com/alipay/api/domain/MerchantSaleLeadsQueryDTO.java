/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class MerchantSaleLeadsQueryDTO
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1477399854428119554L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("area")
/*  13:    */   private String area;
/*  14:    */   @ApiField("assign_alipay_staff_id")
/*  15:    */   private String assignAlipayStaffId;
/*  16:    */   @ApiField("assign_person")
/*  17:    */   private String assignPerson;
/*  18:    */   @ApiField("brand")
/*  19:    */   private String brand;
/*  20:    */   @ApiField("category")
/*  21:    */   private String category;
/*  22:    */   @ApiField("claim_date")
/*  23:    */   private String claimDate;
/*  24:    */   @ApiField("claim_status")
/*  25:    */   private String claimStatus;
/*  26:    */   @ApiField("contact_mobile")
/*  27:    */   private String contactMobile;
/*  28:    */   @ApiField("contact_name")
/*  29:    */   private String contactName;
/*  30:    */   @ApiField("description")
/*  31:    */   private String description;
/*  32:    */   @ApiField("leads_id")
/*  33:    */   private String leadsId;
/*  34:    */   @ApiField("name")
/*  35:    */   private String name;
/*  36:    */   @ApiField("other_contact_info")
/*  37:    */   private String otherContactInfo;
/*  38:    */   @ApiField("scale")
/*  39:    */   private String scale;
/*  40:    */   @ApiField("shop_info")
/*  41:    */   private String shopInfo;
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
/*  53:    */   public String getArea()
/*  54:    */   {
/*  55:120 */     return this.area;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setArea(String area)
/*  59:    */   {
/*  60:123 */     this.area = area;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getAssignAlipayStaffId()
/*  64:    */   {
/*  65:127 */     return this.assignAlipayStaffId;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setAssignAlipayStaffId(String assignAlipayStaffId)
/*  69:    */   {
/*  70:130 */     this.assignAlipayStaffId = assignAlipayStaffId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getAssignPerson()
/*  74:    */   {
/*  75:134 */     return this.assignPerson;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setAssignPerson(String assignPerson)
/*  79:    */   {
/*  80:137 */     this.assignPerson = assignPerson;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getBrand()
/*  84:    */   {
/*  85:141 */     return this.brand;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setBrand(String brand)
/*  89:    */   {
/*  90:144 */     this.brand = brand;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getCategory()
/*  94:    */   {
/*  95:148 */     return this.category;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setCategory(String category)
/*  99:    */   {
/* 100:151 */     this.category = category;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getClaimDate()
/* 104:    */   {
/* 105:155 */     return this.claimDate;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setClaimDate(String claimDate)
/* 109:    */   {
/* 110:158 */     this.claimDate = claimDate;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getClaimStatus()
/* 114:    */   {
/* 115:162 */     return this.claimStatus;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setClaimStatus(String claimStatus)
/* 119:    */   {
/* 120:165 */     this.claimStatus = claimStatus;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getContactMobile()
/* 124:    */   {
/* 125:169 */     return this.contactMobile;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setContactMobile(String contactMobile)
/* 129:    */   {
/* 130:172 */     this.contactMobile = contactMobile;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getContactName()
/* 134:    */   {
/* 135:176 */     return this.contactName;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setContactName(String contactName)
/* 139:    */   {
/* 140:179 */     this.contactName = contactName;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getDescription()
/* 144:    */   {
/* 145:183 */     return this.description;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setDescription(String description)
/* 149:    */   {
/* 150:186 */     this.description = description;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getLeadsId()
/* 154:    */   {
/* 155:190 */     return this.leadsId;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setLeadsId(String leadsId)
/* 159:    */   {
/* 160:193 */     this.leadsId = leadsId;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getName()
/* 164:    */   {
/* 165:197 */     return this.name;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setName(String name)
/* 169:    */   {
/* 170:200 */     this.name = name;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getOtherContactInfo()
/* 174:    */   {
/* 175:204 */     return this.otherContactInfo;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setOtherContactInfo(String otherContactInfo)
/* 179:    */   {
/* 180:207 */     this.otherContactInfo = otherContactInfo;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getScale()
/* 184:    */   {
/* 185:211 */     return this.scale;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setScale(String scale)
/* 189:    */   {
/* 190:214 */     this.scale = scale;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getShopInfo()
/* 194:    */   {
/* 195:218 */     return this.shopInfo;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setShopInfo(String shopInfo)
/* 199:    */   {
/* 200:221 */     this.shopInfo = shopInfo;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.MerchantSaleLeadsQueryDTO
 * JD-Core Version:    0.7.0.1
 */