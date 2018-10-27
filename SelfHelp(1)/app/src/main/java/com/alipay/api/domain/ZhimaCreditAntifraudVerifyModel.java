/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ZhimaCreditAntifraudVerifyModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8758198114189826289L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("bank_card")
/*  13:    */   private String bankCard;
/*  14:    */   @ApiField("cert_no")
/*  15:    */   private String certNo;
/*  16:    */   @ApiField("cert_type")
/*  17:    */   private String certType;
/*  18:    */   @ApiField("email")
/*  19:    */   private String email;
/*  20:    */   @ApiField("imei")
/*  21:    */   private String imei;
/*  22:    */   @ApiField("ip")
/*  23:    */   private String ip;
/*  24:    */   @ApiField("mac")
/*  25:    */   private String mac;
/*  26:    */   @ApiField("mobile")
/*  27:    */   private String mobile;
/*  28:    */   @ApiField("name")
/*  29:    */   private String name;
/*  30:    */   @ApiField("product_code")
/*  31:    */   private String productCode;
/*  32:    */   @ApiField("transaction_id")
/*  33:    */   private String transactionId;
/*  34:    */   @ApiField("wifimac")
/*  35:    */   private String wifimac;
/*  36:    */   
/*  37:    */   public String getAddress()
/*  38:    */   {
/*  39: 95 */     return this.address;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setAddress(String address)
/*  43:    */   {
/*  44: 98 */     this.address = address;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getBankCard()
/*  48:    */   {
/*  49:102 */     return this.bankCard;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setBankCard(String bankCard)
/*  53:    */   {
/*  54:105 */     this.bankCard = bankCard;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getCertNo()
/*  58:    */   {
/*  59:109 */     return this.certNo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCertNo(String certNo)
/*  63:    */   {
/*  64:112 */     this.certNo = certNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCertType()
/*  68:    */   {
/*  69:116 */     return this.certType;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setCertType(String certType)
/*  73:    */   {
/*  74:119 */     this.certType = certType;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getEmail()
/*  78:    */   {
/*  79:123 */     return this.email;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setEmail(String email)
/*  83:    */   {
/*  84:126 */     this.email = email;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getImei()
/*  88:    */   {
/*  89:130 */     return this.imei;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setImei(String imei)
/*  93:    */   {
/*  94:133 */     this.imei = imei;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getIp()
/*  98:    */   {
/*  99:137 */     return this.ip;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setIp(String ip)
/* 103:    */   {
/* 104:140 */     this.ip = ip;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getMac()
/* 108:    */   {
/* 109:144 */     return this.mac;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setMac(String mac)
/* 113:    */   {
/* 114:147 */     this.mac = mac;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getMobile()
/* 118:    */   {
/* 119:151 */     return this.mobile;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setMobile(String mobile)
/* 123:    */   {
/* 124:154 */     this.mobile = mobile;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getName()
/* 128:    */   {
/* 129:158 */     return this.name;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setName(String name)
/* 133:    */   {
/* 134:161 */     this.name = name;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getProductCode()
/* 138:    */   {
/* 139:165 */     return this.productCode;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setProductCode(String productCode)
/* 143:    */   {
/* 144:168 */     this.productCode = productCode;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getTransactionId()
/* 148:    */   {
/* 149:172 */     return this.transactionId;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTransactionId(String transactionId)
/* 153:    */   {
/* 154:175 */     this.transactionId = transactionId;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getWifimac()
/* 158:    */   {
/* 159:179 */     return this.wifimac;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setWifimac(String wifimac)
/* 163:    */   {
/* 164:182 */     this.wifimac = wifimac;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ZhimaCreditAntifraudVerifyModel
 * JD-Core Version:    0.7.0.1
 */