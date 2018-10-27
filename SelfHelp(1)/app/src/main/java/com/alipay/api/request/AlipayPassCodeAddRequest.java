/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassCodeAddResponse;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;

/*   9:    */
/*  10:    */ public class AlipayPassCodeAddRequest
/*  11:    */   implements AlipayRequest<AlipayPassCodeAddResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private String fileContent;
/*  16:    */   private String recognitionInfo;
/*  17:    */   private String recognitionType;
/*  18:    */   private List<String> verifyType;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   private String returnUrl;
/*  24:    */   
/*  25:    */   public void setFileContent(String fileContent)
/*  26:    */   {
/*  27: 47 */     this.fileContent = fileContent;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getFileContent()
/*  31:    */   {
/*  32: 50 */     return this.fileContent;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setRecognitionInfo(String recognitionInfo)
/*  36:    */   {
/*  37: 54 */     this.recognitionInfo = recognitionInfo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getRecognitionInfo()
/*  41:    */   {
/*  42: 57 */     return this.recognitionInfo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setRecognitionType(String recognitionType)
/*  46:    */   {
/*  47: 61 */     this.recognitionType = recognitionType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getRecognitionType()
/*  51:    */   {
/*  52: 64 */     return this.recognitionType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setVerifyType(List<String> verifyType)
/*  56:    */   {
/*  57: 68 */     this.verifyType = verifyType;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public List<String> getVerifyType()
/*  61:    */   {
/*  62: 71 */     return this.verifyType;
/*  63:    */   }
/*  64:    */   
/*  65: 78 */   private boolean needEncrypt = false;
/*  66: 79 */   private AlipayObject bizModel = null;
/*  67:    */   
/*  68:    */   public String getNotifyUrl()
/*  69:    */   {
/*  70: 82 */     return this.notifyUrl;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setNotifyUrl(String notifyUrl)
/*  74:    */   {
/*  75: 86 */     this.notifyUrl = notifyUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getReturnUrl()
/*  79:    */   {
/*  80: 90 */     return this.returnUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setReturnUrl(String returnUrl)
/*  84:    */   {
/*  85: 94 */     this.returnUrl = returnUrl;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getApiVersion()
/*  89:    */   {
/*  90: 98 */     return this.apiVersion;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setApiVersion(String apiVersion)
/*  94:    */   {
/*  95:102 */     this.apiVersion = apiVersion;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setTerminalType(String terminalType)
/*  99:    */   {
/* 100:106 */     this.terminalType = terminalType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getTerminalType()
/* 104:    */   {
/* 105:110 */     return this.terminalType;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setTerminalInfo(String terminalInfo)
/* 109:    */   {
/* 110:114 */     this.terminalInfo = terminalInfo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getTerminalInfo()
/* 114:    */   {
/* 115:118 */     return this.terminalInfo;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setProdCode(String prodCode)
/* 119:    */   {
/* 120:122 */     this.prodCode = prodCode;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getProdCode()
/* 124:    */   {
/* 125:126 */     return this.prodCode;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getApiMethodName()
/* 129:    */   {
/* 130:130 */     return "alipay.pass.code.add";
/* 131:    */   }
/* 132:    */   
/* 133:    */   public Map<String, String> getTextParams()
/* 134:    */   {
/* 135:134 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 136:135 */     txtParams.put("file_content", this.fileContent);
/* 137:136 */     txtParams.put("recognition_info", this.recognitionInfo);
/* 138:137 */     txtParams.put("recognition_type", this.recognitionType);
/* 139:138 */     txtParams.put("verify_type", this.verifyType);
/* 140:139 */     if (this.udfParams != null) {
/* 141:140 */       txtParams.putAll(this.udfParams);
/* 142:    */     }
/* 143:142 */     return txtParams;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void putOtherTextParam(String key, String value)
/* 147:    */   {
/* 148:146 */     if (this.udfParams == null) {
/* 149:147 */       this.udfParams = new AlipayHashMap();
/* 150:    */     }
/* 151:149 */     this.udfParams.put(key, value);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Class<AlipayPassCodeAddResponse> getResponseClass()
/* 155:    */   {
/* 156:153 */     return AlipayPassCodeAddResponse.class;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public boolean isNeedEncrypt()
/* 160:    */   {
/* 161:159 */     return this.needEncrypt;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 165:    */   {
/* 166:165 */     this.needEncrypt = needEncrypt;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public AlipayObject getBizModel()
/* 170:    */   {
/* 171:170 */     return this.bizModel;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setBizModel(AlipayObject bizModel)
/* 175:    */   {
/* 176:176 */     this.bizModel = bizModel;
/* 177:    */   }
/* 178:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayPassCodeAddRequest

 * JD-Core Version:    0.7.0.1

 */