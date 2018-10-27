/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class InsAddressee
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2321947462521165592L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("address_code")
/*  13:    */   private String addressCode;
/*  14:    */   @ApiField("area")
/*  15:    */   private String area;
/*  16:    */   @ApiField("city")
/*  17:    */   private String city;
/*  18:    */   @ApiField("mobile")
/*  19:    */   private String mobile;
/*  20:    */   @ApiField("name")
/*  21:    */   private String name;
/*  22:    */   @ApiField("phone")
/*  23:    */   private String phone;
/*  24:    */   @ApiField("province")
/*  25:    */   private String province;
/*  26:    */   @ApiField("zip")
/*  27:    */   private String zip;
/*  28:    */   
/*  29:    */   public String getAddress()
/*  30:    */   {
/*  31: 71 */     return this.address;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setAddress(String address)
/*  35:    */   {
/*  36: 74 */     this.address = address;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getAddressCode()
/*  40:    */   {
/*  41: 78 */     return this.addressCode;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setAddressCode(String addressCode)
/*  45:    */   {
/*  46: 81 */     this.addressCode = addressCode;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getArea()
/*  50:    */   {
/*  51: 85 */     return this.area;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setArea(String area)
/*  55:    */   {
/*  56: 88 */     this.area = area;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getCity()
/*  60:    */   {
/*  61: 92 */     return this.city;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCity(String city)
/*  65:    */   {
/*  66: 95 */     this.city = city;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getMobile()
/*  70:    */   {
/*  71: 99 */     return this.mobile;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setMobile(String mobile)
/*  75:    */   {
/*  76:102 */     this.mobile = mobile;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getName()
/*  80:    */   {
/*  81:106 */     return this.name;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setName(String name)
/*  85:    */   {
/*  86:109 */     this.name = name;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getPhone()
/*  90:    */   {
/*  91:113 */     return this.phone;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setPhone(String phone)
/*  95:    */   {
/*  96:116 */     this.phone = phone;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getProvince()
/* 100:    */   {
/* 101:120 */     return this.province;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setProvince(String province)
/* 105:    */   {
/* 106:123 */     this.province = province;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getZip()
/* 110:    */   {
/* 111:127 */     return this.zip;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setZip(String zip)
/* 115:    */   {
/* 116:130 */     this.zip = zip;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsAddressee
 * JD-Core Version:    0.7.0.1
 */