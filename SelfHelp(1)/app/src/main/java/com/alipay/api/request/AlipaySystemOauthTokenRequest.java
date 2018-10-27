/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipaySystemOauthTokenResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipaySystemOauthTokenRequest
/*  10:    */   implements AlipayRequest<AlipaySystemOauthTokenResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String code;
/*  15:    */   private String grantType;
/*  16:    */   private String refreshToken;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   private String returnUrl;
/*  22:    */   
/*  23:    */   public void setCode(String code)
/*  24:    */   {
/*  25: 37 */     this.code = code;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getCode()
/*  29:    */   {
/*  30: 40 */     return this.code;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setGrantType(String grantType)
/*  34:    */   {
/*  35: 44 */     this.grantType = grantType;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getGrantType()
/*  39:    */   {
/*  40: 47 */     return this.grantType;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setRefreshToken(String refreshToken)
/*  44:    */   {
/*  45: 51 */     this.refreshToken = refreshToken;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getRefreshToken()
/*  49:    */   {
/*  50: 54 */     return this.refreshToken;
/*  51:    */   }
/*  52:    */   
/*  53: 61 */   private boolean needEncrypt = false;
/*  54: 62 */   private AlipayObject bizModel = null;
/*  55:    */   
/*  56:    */   public String getNotifyUrl()
/*  57:    */   {
/*  58: 65 */     return this.notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setNotifyUrl(String notifyUrl)
/*  62:    */   {
/*  63: 69 */     this.notifyUrl = notifyUrl;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getReturnUrl()
/*  67:    */   {
/*  68: 73 */     return this.returnUrl;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setReturnUrl(String returnUrl)
/*  72:    */   {
/*  73: 77 */     this.returnUrl = returnUrl;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getApiVersion()
/*  77:    */   {
/*  78: 81 */     return this.apiVersion;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setApiVersion(String apiVersion)
/*  82:    */   {
/*  83: 85 */     this.apiVersion = apiVersion;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setTerminalType(String terminalType)
/*  87:    */   {
/*  88: 89 */     this.terminalType = terminalType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getTerminalType()
/*  92:    */   {
/*  93: 93 */     return this.terminalType;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTerminalInfo(String terminalInfo)
/*  97:    */   {
/*  98: 97 */     this.terminalInfo = terminalInfo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTerminalInfo()
/* 102:    */   {
/* 103:101 */     return this.terminalInfo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setProdCode(String prodCode)
/* 107:    */   {
/* 108:105 */     this.prodCode = prodCode;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getProdCode()
/* 112:    */   {
/* 113:109 */     return this.prodCode;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getApiMethodName()
/* 117:    */   {
/* 118:113 */     return "alipay.system.oauth.token";
/* 119:    */   }
/* 120:    */   
/* 121:    */   public Map<String, String> getTextParams()
/* 122:    */   {
/* 123:117 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 124:118 */     txtParams.put("code", this.code);
/* 125:119 */     txtParams.put("grant_type", this.grantType);
/* 126:120 */     txtParams.put("refresh_token", this.refreshToken);
/* 127:121 */     if (this.udfParams != null) {
/* 128:122 */       txtParams.putAll(this.udfParams);
/* 129:    */     }
/* 130:124 */     return txtParams;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void putOtherTextParam(String key, String value)
/* 134:    */   {
/* 135:128 */     if (this.udfParams == null) {
/* 136:129 */       this.udfParams = new AlipayHashMap();
/* 137:    */     }
/* 138:131 */     this.udfParams.put(key, value);
/* 139:    */   }
/* 140:    */   
/* 141:    */   public Class<AlipaySystemOauthTokenResponse> getResponseClass()
/* 142:    */   {
/* 143:135 */     return AlipaySystemOauthTokenResponse.class;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public boolean isNeedEncrypt()
/* 147:    */   {
/* 148:141 */     return this.needEncrypt;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 152:    */   {
/* 153:147 */     this.needEncrypt = needEncrypt;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public AlipayObject getBizModel()
/* 157:    */   {
/* 158:152 */     return this.bizModel;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setBizModel(AlipayObject bizModel)
/* 162:    */   {
/* 163:158 */     this.bizModel = bizModel;
/* 164:    */   }
/* 165:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipaySystemOauthTokenRequest
 * JD-Core Version:    0.7.0.1
 */