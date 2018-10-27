/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMobileShakeUserQueryResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMobileShakeUserQueryRequest
/*  10:    */   implements AlipayRequest<AlipayMobileShakeUserQueryResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String dynamicId;
/*  15:    */   private String dynamicIdType;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   private String returnUrl;
/*  21:    */   
/*  22:    */   public void setDynamicId(String dynamicId)
/*  23:    */   {
/*  24: 35 */     this.dynamicId = dynamicId;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getDynamicId()
/*  28:    */   {
/*  29: 38 */     return this.dynamicId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setDynamicIdType(String dynamicIdType)
/*  33:    */   {
/*  34: 42 */     this.dynamicIdType = dynamicIdType;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getDynamicIdType()
/*  38:    */   {
/*  39: 45 */     return this.dynamicIdType;
/*  40:    */   }
/*  41:    */   
/*  42: 52 */   private boolean needEncrypt = false;
/*  43: 53 */   private AlipayObject bizModel = null;
/*  44:    */   
/*  45:    */   public String getNotifyUrl()
/*  46:    */   {
/*  47: 56 */     return this.notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setNotifyUrl(String notifyUrl)
/*  51:    */   {
/*  52: 60 */     this.notifyUrl = notifyUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getReturnUrl()
/*  56:    */   {
/*  57: 64 */     return this.returnUrl;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReturnUrl(String returnUrl)
/*  61:    */   {
/*  62: 68 */     this.returnUrl = returnUrl;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getApiVersion()
/*  66:    */   {
/*  67: 72 */     return this.apiVersion;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setApiVersion(String apiVersion)
/*  71:    */   {
/*  72: 76 */     this.apiVersion = apiVersion;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setTerminalType(String terminalType)
/*  76:    */   {
/*  77: 80 */     this.terminalType = terminalType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getTerminalType()
/*  81:    */   {
/*  82: 84 */     return this.terminalType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setTerminalInfo(String terminalInfo)
/*  86:    */   {
/*  87: 88 */     this.terminalInfo = terminalInfo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getTerminalInfo()
/*  91:    */   {
/*  92: 92 */     return this.terminalInfo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setProdCode(String prodCode)
/*  96:    */   {
/*  97: 96 */     this.prodCode = prodCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getProdCode()
/* 101:    */   {
/* 102:100 */     return this.prodCode;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiMethodName()
/* 106:    */   {
/* 107:104 */     return "alipay.mobile.shake.user.query";
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Map<String, String> getTextParams()
/* 111:    */   {
/* 112:108 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 113:109 */     txtParams.put("dynamic_id", this.dynamicId);
/* 114:110 */     txtParams.put("dynamic_id_type", this.dynamicIdType);
/* 115:111 */     if (this.udfParams != null) {
/* 116:112 */       txtParams.putAll(this.udfParams);
/* 117:    */     }
/* 118:114 */     return txtParams;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void putOtherTextParam(String key, String value)
/* 122:    */   {
/* 123:118 */     if (this.udfParams == null) {
/* 124:119 */       this.udfParams = new AlipayHashMap();
/* 125:    */     }
/* 126:121 */     this.udfParams.put(key, value);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Class<AlipayMobileShakeUserQueryResponse> getResponseClass()
/* 130:    */   {
/* 131:125 */     return AlipayMobileShakeUserQueryResponse.class;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean isNeedEncrypt()
/* 135:    */   {
/* 136:131 */     return this.needEncrypt;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 140:    */   {
/* 141:137 */     this.needEncrypt = needEncrypt;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public AlipayObject getBizModel()
/* 145:    */   {
/* 146:142 */     return this.bizModel;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setBizModel(AlipayObject bizModel)
/* 150:    */   {
/* 151:148 */     this.bizModel = bizModel;
/* 152:    */   }
/* 153:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMobileShakeUserQueryRequest
 * JD-Core Version:    0.7.0.1
 */