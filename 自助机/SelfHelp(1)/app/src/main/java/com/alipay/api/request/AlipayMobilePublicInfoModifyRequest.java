/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMobilePublicInfoModifyResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMobilePublicInfoModifyRequest
/*  10:    */   implements AlipayRequest<AlipayMobilePublicInfoModifyResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String appName;
/*  15:    */   private String authPic;
/*  16:    */   private String licenseUrl;
/*  17:    */   private String logoUrl;
/*  18:    */   private String publicGreeting;
/*  19:    */   private String shopPic1;
/*  20:    */   private String shopPic2;
/*  21:    */   private String shopPic3;
/*  22:    */   private String terminalType;
/*  23:    */   private String terminalInfo;
/*  24:    */   private String prodCode;
/*  25:    */   private String notifyUrl;
/*  26:    */   private String returnUrl;
/*  27:    */   
/*  28:    */   public void setAppName(String appName)
/*  29:    */   {
/*  30: 62 */     this.appName = appName;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getAppName()
/*  34:    */   {
/*  35: 65 */     return this.appName;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setAuthPic(String authPic)
/*  39:    */   {
/*  40: 69 */     this.authPic = authPic;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getAuthPic()
/*  44:    */   {
/*  45: 72 */     return this.authPic;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setLicenseUrl(String licenseUrl)
/*  49:    */   {
/*  50: 76 */     this.licenseUrl = licenseUrl;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getLicenseUrl()
/*  54:    */   {
/*  55: 79 */     return this.licenseUrl;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setLogoUrl(String logoUrl)
/*  59:    */   {
/*  60: 83 */     this.logoUrl = logoUrl;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getLogoUrl()
/*  64:    */   {
/*  65: 86 */     return this.logoUrl;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setPublicGreeting(String publicGreeting)
/*  69:    */   {
/*  70: 90 */     this.publicGreeting = publicGreeting;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getPublicGreeting()
/*  74:    */   {
/*  75: 93 */     return this.publicGreeting;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setShopPic1(String shopPic1)
/*  79:    */   {
/*  80: 97 */     this.shopPic1 = shopPic1;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getShopPic1()
/*  84:    */   {
/*  85:100 */     return this.shopPic1;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setShopPic2(String shopPic2)
/*  89:    */   {
/*  90:104 */     this.shopPic2 = shopPic2;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getShopPic2()
/*  94:    */   {
/*  95:107 */     return this.shopPic2;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setShopPic3(String shopPic3)
/*  99:    */   {
/* 100:111 */     this.shopPic3 = shopPic3;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getShopPic3()
/* 104:    */   {
/* 105:114 */     return this.shopPic3;
/* 106:    */   }
/* 107:    */   
/* 108:121 */   private boolean needEncrypt = false;
/* 109:122 */   private AlipayObject bizModel = null;
/* 110:    */   
/* 111:    */   public String getNotifyUrl()
/* 112:    */   {
/* 113:125 */     return this.notifyUrl;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setNotifyUrl(String notifyUrl)
/* 117:    */   {
/* 118:129 */     this.notifyUrl = notifyUrl;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getReturnUrl()
/* 122:    */   {
/* 123:133 */     return this.returnUrl;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setReturnUrl(String returnUrl)
/* 127:    */   {
/* 128:137 */     this.returnUrl = returnUrl;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getApiVersion()
/* 132:    */   {
/* 133:141 */     return this.apiVersion;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setApiVersion(String apiVersion)
/* 137:    */   {
/* 138:145 */     this.apiVersion = apiVersion;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setTerminalType(String terminalType)
/* 142:    */   {
/* 143:149 */     this.terminalType = terminalType;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getTerminalType()
/* 147:    */   {
/* 148:153 */     return this.terminalType;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setTerminalInfo(String terminalInfo)
/* 152:    */   {
/* 153:157 */     this.terminalInfo = terminalInfo;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getTerminalInfo()
/* 157:    */   {
/* 158:161 */     return this.terminalInfo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setProdCode(String prodCode)
/* 162:    */   {
/* 163:165 */     this.prodCode = prodCode;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getProdCode()
/* 167:    */   {
/* 168:169 */     return this.prodCode;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getApiMethodName()
/* 172:    */   {
/* 173:173 */     return "alipay.mobile.public.info.modify";
/* 174:    */   }
/* 175:    */   
/* 176:    */   public Map<String, String> getTextParams()
/* 177:    */   {
/* 178:177 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 179:178 */     txtParams.put("app_name", this.appName);
/* 180:179 */     txtParams.put("auth_pic", this.authPic);
/* 181:180 */     txtParams.put("license_url", this.licenseUrl);
/* 182:181 */     txtParams.put("logo_url", this.logoUrl);
/* 183:182 */     txtParams.put("public_greeting", this.publicGreeting);
/* 184:183 */     txtParams.put("shop_pic1", this.shopPic1);
/* 185:184 */     txtParams.put("shop_pic2", this.shopPic2);
/* 186:185 */     txtParams.put("shop_pic3", this.shopPic3);
/* 187:186 */     if (this.udfParams != null) {
/* 188:187 */       txtParams.putAll(this.udfParams);
/* 189:    */     }
/* 190:189 */     return txtParams;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void putOtherTextParam(String key, String value)
/* 194:    */   {
/* 195:193 */     if (this.udfParams == null) {
/* 196:194 */       this.udfParams = new AlipayHashMap();
/* 197:    */     }
/* 198:196 */     this.udfParams.put(key, value);
/* 199:    */   }
/* 200:    */   
/* 201:    */   public Class<AlipayMobilePublicInfoModifyResponse> getResponseClass()
/* 202:    */   {
/* 203:200 */     return AlipayMobilePublicInfoModifyResponse.class;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public boolean isNeedEncrypt()
/* 207:    */   {
/* 208:206 */     return this.needEncrypt;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 212:    */   {
/* 213:212 */     this.needEncrypt = needEncrypt;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public AlipayObject getBizModel()
/* 217:    */   {
/* 218:217 */     return this.bizModel;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setBizModel(AlipayObject bizModel)
/* 222:    */   {
/* 223:223 */     this.bizModel = bizModel;
/* 224:    */   }
/* 225:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMobilePublicInfoModifyRequest
 * JD-Core Version:    0.7.0.1
 */