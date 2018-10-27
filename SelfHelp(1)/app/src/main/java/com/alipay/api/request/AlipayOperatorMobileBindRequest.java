/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayOperatorMobileBindResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayOperatorMobileBindRequest
/*  10:    */   implements AlipayRequest<AlipayOperatorMobileBindResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String checkSigncard;
/*  15:    */   private String fReturnUrl;
/*  16:    */   private String hasSpi;
/*  17:    */   private String operatorName;
/*  18:    */   private String provinceName;
/*  19:    */   private String sReturnUrl;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setCheckSigncard(String checkSigncard)
/*  27:    */   {
/*  28: 56 */     this.checkSigncard = checkSigncard;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getCheckSigncard()
/*  32:    */   {
/*  33: 59 */     return this.checkSigncard;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setfReturnUrl(String fReturnUrl)
/*  37:    */   {
/*  38: 63 */     this.fReturnUrl = fReturnUrl;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getfReturnUrl()
/*  42:    */   {
/*  43: 66 */     return this.fReturnUrl;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setHasSpi(String hasSpi)
/*  47:    */   {
/*  48: 70 */     this.hasSpi = hasSpi;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getHasSpi()
/*  52:    */   {
/*  53: 73 */     return this.hasSpi;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setOperatorName(String operatorName)
/*  57:    */   {
/*  58: 77 */     this.operatorName = operatorName;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getOperatorName()
/*  62:    */   {
/*  63: 80 */     return this.operatorName;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setProvinceName(String provinceName)
/*  67:    */   {
/*  68: 84 */     this.provinceName = provinceName;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getProvinceName()
/*  72:    */   {
/*  73: 87 */     return this.provinceName;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setsReturnUrl(String sReturnUrl)
/*  77:    */   {
/*  78: 91 */     this.sReturnUrl = sReturnUrl;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getsReturnUrl()
/*  82:    */   {
/*  83: 94 */     return this.sReturnUrl;
/*  84:    */   }
/*  85:    */   
/*  86:101 */   private boolean needEncrypt = false;
/*  87:102 */   private AlipayObject bizModel = null;
/*  88:    */   
/*  89:    */   public String getNotifyUrl()
/*  90:    */   {
/*  91:105 */     return this.notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setNotifyUrl(String notifyUrl)
/*  95:    */   {
/*  96:109 */     this.notifyUrl = notifyUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getReturnUrl()
/* 100:    */   {
/* 101:113 */     return this.returnUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setReturnUrl(String returnUrl)
/* 105:    */   {
/* 106:117 */     this.returnUrl = returnUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getApiVersion()
/* 110:    */   {
/* 111:121 */     return this.apiVersion;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setApiVersion(String apiVersion)
/* 115:    */   {
/* 116:125 */     this.apiVersion = apiVersion;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalType(String terminalType)
/* 120:    */   {
/* 121:129 */     this.terminalType = terminalType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalType()
/* 125:    */   {
/* 126:133 */     return this.terminalType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTerminalInfo(String terminalInfo)
/* 130:    */   {
/* 131:137 */     this.terminalInfo = terminalInfo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTerminalInfo()
/* 135:    */   {
/* 136:141 */     return this.terminalInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setProdCode(String prodCode)
/* 140:    */   {
/* 141:145 */     this.prodCode = prodCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getProdCode()
/* 145:    */   {
/* 146:149 */     return this.prodCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getApiMethodName()
/* 150:    */   {
/* 151:153 */     return "alipay.operator.mobile.bind";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:157 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:158 */     txtParams.put("check_signcard", this.checkSigncard);
/* 158:159 */     txtParams.put("f_return_url", this.fReturnUrl);
/* 159:160 */     txtParams.put("has_spi", this.hasSpi);
/* 160:161 */     txtParams.put("operator_name", this.operatorName);
/* 161:162 */     txtParams.put("province_name", this.provinceName);
/* 162:163 */     txtParams.put("s_return_url", this.sReturnUrl);
/* 163:164 */     if (this.udfParams != null) {
/* 164:165 */       txtParams.putAll(this.udfParams);
/* 165:    */     }
/* 166:167 */     return txtParams;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void putOtherTextParam(String key, String value)
/* 170:    */   {
/* 171:171 */     if (this.udfParams == null) {
/* 172:172 */       this.udfParams = new AlipayHashMap();
/* 173:    */     }
/* 174:174 */     this.udfParams.put(key, value);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Class<AlipayOperatorMobileBindResponse> getResponseClass()
/* 178:    */   {
/* 179:178 */     return AlipayOperatorMobileBindResponse.class;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public boolean isNeedEncrypt()
/* 183:    */   {
/* 184:184 */     return this.needEncrypt;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 188:    */   {
/* 189:190 */     this.needEncrypt = needEncrypt;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public AlipayObject getBizModel()
/* 193:    */   {
/* 194:195 */     return this.bizModel;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setBizModel(AlipayObject bizModel)
/* 198:    */   {
/* 199:201 */     this.bizModel = bizModel;
/* 200:    */   }
/* 201:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayOperatorMobileBindRequest
 * JD-Core Version:    0.7.0.1
 */