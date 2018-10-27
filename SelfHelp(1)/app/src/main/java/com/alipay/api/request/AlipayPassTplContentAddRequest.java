/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassTplContentAddResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassTplContentAddRequest
/*  10:    */   implements AlipayRequest<AlipayPassTplContentAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String recognitionInfo;
/*  15:    */   private String recognitionType;
/*  16:    */   private String tplId;
/*  17:    */   private String tplParams;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   private String returnUrl;
/*  23:    */   
/*  24:    */   public void setRecognitionInfo(String recognitionInfo)
/*  25:    */   {
/*  26: 45 */     this.recognitionInfo = recognitionInfo;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getRecognitionInfo()
/*  30:    */   {
/*  31: 48 */     return this.recognitionInfo;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setRecognitionType(String recognitionType)
/*  35:    */   {
/*  36: 52 */     this.recognitionType = recognitionType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getRecognitionType()
/*  40:    */   {
/*  41: 55 */     return this.recognitionType;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setTplId(String tplId)
/*  45:    */   {
/*  46: 59 */     this.tplId = tplId;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getTplId()
/*  50:    */   {
/*  51: 62 */     return this.tplId;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setTplParams(String tplParams)
/*  55:    */   {
/*  56: 66 */     this.tplParams = tplParams;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getTplParams()
/*  60:    */   {
/*  61: 69 */     return this.tplParams;
/*  62:    */   }
/*  63:    */   
/*  64: 76 */   private boolean needEncrypt = false;
/*  65: 77 */   private AlipayObject bizModel = null;
/*  66:    */   
/*  67:    */   public String getNotifyUrl()
/*  68:    */   {
/*  69: 80 */     return this.notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setNotifyUrl(String notifyUrl)
/*  73:    */   {
/*  74: 84 */     this.notifyUrl = notifyUrl;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getReturnUrl()
/*  78:    */   {
/*  79: 88 */     return this.returnUrl;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setReturnUrl(String returnUrl)
/*  83:    */   {
/*  84: 92 */     this.returnUrl = returnUrl;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getApiVersion()
/*  88:    */   {
/*  89: 96 */     return this.apiVersion;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setApiVersion(String apiVersion)
/*  93:    */   {
/*  94:100 */     this.apiVersion = apiVersion;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setTerminalType(String terminalType)
/*  98:    */   {
/*  99:104 */     this.terminalType = terminalType;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTerminalType()
/* 103:    */   {
/* 104:108 */     return this.terminalType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setTerminalInfo(String terminalInfo)
/* 108:    */   {
/* 109:112 */     this.terminalInfo = terminalInfo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getTerminalInfo()
/* 113:    */   {
/* 114:116 */     return this.terminalInfo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setProdCode(String prodCode)
/* 118:    */   {
/* 119:120 */     this.prodCode = prodCode;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getProdCode()
/* 123:    */   {
/* 124:124 */     return this.prodCode;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getApiMethodName()
/* 128:    */   {
/* 129:128 */     return "alipay.pass.tpl.content.add";
/* 130:    */   }
/* 131:    */   
/* 132:    */   public Map<String, String> getTextParams()
/* 133:    */   {
/* 134:132 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 135:133 */     txtParams.put("recognition_info", this.recognitionInfo);
/* 136:134 */     txtParams.put("recognition_type", this.recognitionType);
/* 137:135 */     txtParams.put("tpl_id", this.tplId);
/* 138:136 */     txtParams.put("tpl_params", this.tplParams);
/* 139:137 */     if (this.udfParams != null) {
/* 140:138 */       txtParams.putAll(this.udfParams);
/* 141:    */     }
/* 142:140 */     return txtParams;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void putOtherTextParam(String key, String value)
/* 146:    */   {
/* 147:144 */     if (this.udfParams == null) {
/* 148:145 */       this.udfParams = new AlipayHashMap();
/* 149:    */     }
/* 150:147 */     this.udfParams.put(key, value);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public Class<AlipayPassTplContentAddResponse> getResponseClass()
/* 154:    */   {
/* 155:151 */     return AlipayPassTplContentAddResponse.class;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public boolean isNeedEncrypt()
/* 159:    */   {
/* 160:157 */     return this.needEncrypt;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 164:    */   {
/* 165:163 */     this.needEncrypt = needEncrypt;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public AlipayObject getBizModel()
/* 169:    */   {
/* 170:168 */     return this.bizModel;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setBizModel(AlipayObject bizModel)
/* 174:    */   {
/* 175:174 */     this.bizModel = bizModel;
/* 176:    */   }
/* 177:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassTplContentAddRequest
 * JD-Core Version:    0.7.0.1
 */