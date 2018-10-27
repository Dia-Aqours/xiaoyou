/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassTplAddResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassTplAddRequest
/*  10:    */   implements AlipayRequest<AlipayPassTplAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String tplContent;
/*  15:    */   private String uniqueId;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   private String returnUrl;
/*  21:    */   
/*  22:    */   public void setTplContent(String tplContent)
/*  23:    */   {
/*  24: 33 */     this.tplContent = tplContent;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getTplContent()
/*  28:    */   {
/*  29: 36 */     return this.tplContent;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setUniqueId(String uniqueId)
/*  33:    */   {
/*  34: 40 */     this.uniqueId = uniqueId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getUniqueId()
/*  38:    */   {
/*  39: 43 */     return this.uniqueId;
/*  40:    */   }
/*  41:    */   
/*  42: 50 */   private boolean needEncrypt = false;
/*  43: 51 */   private AlipayObject bizModel = null;
/*  44:    */   
/*  45:    */   public String getNotifyUrl()
/*  46:    */   {
/*  47: 54 */     return this.notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setNotifyUrl(String notifyUrl)
/*  51:    */   {
/*  52: 58 */     this.notifyUrl = notifyUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getReturnUrl()
/*  56:    */   {
/*  57: 62 */     return this.returnUrl;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReturnUrl(String returnUrl)
/*  61:    */   {
/*  62: 66 */     this.returnUrl = returnUrl;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getApiVersion()
/*  66:    */   {
/*  67: 70 */     return this.apiVersion;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setApiVersion(String apiVersion)
/*  71:    */   {
/*  72: 74 */     this.apiVersion = apiVersion;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setTerminalType(String terminalType)
/*  76:    */   {
/*  77: 78 */     this.terminalType = terminalType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getTerminalType()
/*  81:    */   {
/*  82: 82 */     return this.terminalType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setTerminalInfo(String terminalInfo)
/*  86:    */   {
/*  87: 86 */     this.terminalInfo = terminalInfo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getTerminalInfo()
/*  91:    */   {
/*  92: 90 */     return this.terminalInfo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setProdCode(String prodCode)
/*  96:    */   {
/*  97: 94 */     this.prodCode = prodCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getProdCode()
/* 101:    */   {
/* 102: 98 */     return this.prodCode;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiMethodName()
/* 106:    */   {
/* 107:102 */     return "alipay.pass.tpl.add";
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Map<String, String> getTextParams()
/* 111:    */   {
/* 112:106 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 113:107 */     txtParams.put("tpl_content", this.tplContent);
/* 114:108 */     txtParams.put("unique_id", this.uniqueId);
/* 115:109 */     if (this.udfParams != null) {
/* 116:110 */       txtParams.putAll(this.udfParams);
/* 117:    */     }
/* 118:112 */     return txtParams;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void putOtherTextParam(String key, String value)
/* 122:    */   {
/* 123:116 */     if (this.udfParams == null) {
/* 124:117 */       this.udfParams = new AlipayHashMap();
/* 125:    */     }
/* 126:119 */     this.udfParams.put(key, value);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Class<AlipayPassTplAddResponse> getResponseClass()
/* 130:    */   {
/* 131:123 */     return AlipayPassTplAddResponse.class;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean isNeedEncrypt()
/* 135:    */   {
/* 136:129 */     return this.needEncrypt;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 140:    */   {
/* 141:135 */     this.needEncrypt = needEncrypt;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public AlipayObject getBizModel()
/* 145:    */   {
/* 146:140 */     return this.bizModel;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setBizModel(AlipayObject bizModel)
/* 150:    */   {
/* 151:146 */     this.bizModel = bizModel;
/* 152:    */   }
/* 153:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassTplAddRequest
 * JD-Core Version:    0.7.0.1
 */