/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassCodeVerifyResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassCodeVerifyRequest
/*  10:    */   implements AlipayRequest<AlipayPassCodeVerifyResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String extInfo;
/*  15:    */   private String operatorId;
/*  16:    */   private String operatorType;
/*  17:    */   private String verifyCode;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   private String returnUrl;
/*  23:    */   
/*  24:    */   public void setExtInfo(String extInfo)
/*  25:    */   {
/*  26: 46 */     this.extInfo = extInfo;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getExtInfo()
/*  30:    */   {
/*  31: 49 */     return this.extInfo;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setOperatorId(String operatorId)
/*  35:    */   {
/*  36: 53 */     this.operatorId = operatorId;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getOperatorId()
/*  40:    */   {
/*  41: 56 */     return this.operatorId;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setOperatorType(String operatorType)
/*  45:    */   {
/*  46: 60 */     this.operatorType = operatorType;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getOperatorType()
/*  50:    */   {
/*  51: 63 */     return this.operatorType;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setVerifyCode(String verifyCode)
/*  55:    */   {
/*  56: 67 */     this.verifyCode = verifyCode;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getVerifyCode()
/*  60:    */   {
/*  61: 70 */     return this.verifyCode;
/*  62:    */   }
/*  63:    */   
/*  64: 77 */   private boolean needEncrypt = false;
/*  65: 78 */   private AlipayObject bizModel = null;
/*  66:    */   
/*  67:    */   public String getNotifyUrl()
/*  68:    */   {
/*  69: 81 */     return this.notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setNotifyUrl(String notifyUrl)
/*  73:    */   {
/*  74: 85 */     this.notifyUrl = notifyUrl;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getReturnUrl()
/*  78:    */   {
/*  79: 89 */     return this.returnUrl;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setReturnUrl(String returnUrl)
/*  83:    */   {
/*  84: 93 */     this.returnUrl = returnUrl;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getApiVersion()
/*  88:    */   {
/*  89: 97 */     return this.apiVersion;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setApiVersion(String apiVersion)
/*  93:    */   {
/*  94:101 */     this.apiVersion = apiVersion;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setTerminalType(String terminalType)
/*  98:    */   {
/*  99:105 */     this.terminalType = terminalType;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTerminalType()
/* 103:    */   {
/* 104:109 */     return this.terminalType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setTerminalInfo(String terminalInfo)
/* 108:    */   {
/* 109:113 */     this.terminalInfo = terminalInfo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getTerminalInfo()
/* 113:    */   {
/* 114:117 */     return this.terminalInfo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setProdCode(String prodCode)
/* 118:    */   {
/* 119:121 */     this.prodCode = prodCode;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getProdCode()
/* 123:    */   {
/* 124:125 */     return this.prodCode;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getApiMethodName()
/* 128:    */   {
/* 129:129 */     return "alipay.pass.code.verify";
/* 130:    */   }
/* 131:    */   
/* 132:    */   public Map<String, String> getTextParams()
/* 133:    */   {
/* 134:133 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 135:134 */     txtParams.put("ext_info", this.extInfo);
/* 136:135 */     txtParams.put("operator_id", this.operatorId);
/* 137:136 */     txtParams.put("operator_type", this.operatorType);
/* 138:137 */     txtParams.put("verify_code", this.verifyCode);
/* 139:138 */     if (this.udfParams != null) {
/* 140:139 */       txtParams.putAll(this.udfParams);
/* 141:    */     }
/* 142:141 */     return txtParams;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void putOtherTextParam(String key, String value)
/* 146:    */   {
/* 147:145 */     if (this.udfParams == null) {
/* 148:146 */       this.udfParams = new AlipayHashMap();
/* 149:    */     }
/* 150:148 */     this.udfParams.put(key, value);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public Class<AlipayPassCodeVerifyResponse> getResponseClass()
/* 154:    */   {
/* 155:152 */     return AlipayPassCodeVerifyResponse.class;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public boolean isNeedEncrypt()
/* 159:    */   {
/* 160:158 */     return this.needEncrypt;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 164:    */   {
/* 165:164 */     this.needEncrypt = needEncrypt;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public AlipayObject getBizModel()
/* 169:    */   {
/* 170:169 */     return this.bizModel;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setBizModel(AlipayObject bizModel)
/* 174:    */   {
/* 175:175 */     this.bizModel = bizModel;
/* 176:    */   }
/* 177:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassCodeVerifyRequest
 * JD-Core Version:    0.7.0.1
 */