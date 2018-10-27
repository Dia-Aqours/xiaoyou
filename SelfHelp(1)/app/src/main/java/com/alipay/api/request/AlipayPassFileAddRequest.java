/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassFileAddResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassFileAddRequest
/*  10:    */   implements AlipayRequest<AlipayPassFileAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String fileContent;
/*  15:    */   private String recognitionInfo;
/*  16:    */   private String recognitionType;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   private String returnUrl;
/*  22:    */   
/*  23:    */   public void setFileContent(String fileContent)
/*  24:    */   {
/*  25: 40 */     this.fileContent = fileContent;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getFileContent()
/*  29:    */   {
/*  30: 43 */     return this.fileContent;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setRecognitionInfo(String recognitionInfo)
/*  34:    */   {
/*  35: 47 */     this.recognitionInfo = recognitionInfo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getRecognitionInfo()
/*  39:    */   {
/*  40: 50 */     return this.recognitionInfo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setRecognitionType(String recognitionType)
/*  44:    */   {
/*  45: 54 */     this.recognitionType = recognitionType;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getRecognitionType()
/*  49:    */   {
/*  50: 57 */     return this.recognitionType;
/*  51:    */   }
/*  52:    */   
/*  53: 64 */   private boolean needEncrypt = false;
/*  54: 65 */   private AlipayObject bizModel = null;
/*  55:    */   
/*  56:    */   public String getNotifyUrl()
/*  57:    */   {
/*  58: 68 */     return this.notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setNotifyUrl(String notifyUrl)
/*  62:    */   {
/*  63: 72 */     this.notifyUrl = notifyUrl;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getReturnUrl()
/*  67:    */   {
/*  68: 76 */     return this.returnUrl;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setReturnUrl(String returnUrl)
/*  72:    */   {
/*  73: 80 */     this.returnUrl = returnUrl;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getApiVersion()
/*  77:    */   {
/*  78: 84 */     return this.apiVersion;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setApiVersion(String apiVersion)
/*  82:    */   {
/*  83: 88 */     this.apiVersion = apiVersion;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setTerminalType(String terminalType)
/*  87:    */   {
/*  88: 92 */     this.terminalType = terminalType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getTerminalType()
/*  92:    */   {
/*  93: 96 */     return this.terminalType;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTerminalInfo(String terminalInfo)
/*  97:    */   {
/*  98:100 */     this.terminalInfo = terminalInfo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTerminalInfo()
/* 102:    */   {
/* 103:104 */     return this.terminalInfo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setProdCode(String prodCode)
/* 107:    */   {
/* 108:108 */     this.prodCode = prodCode;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getProdCode()
/* 112:    */   {
/* 113:112 */     return this.prodCode;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getApiMethodName()
/* 117:    */   {
/* 118:116 */     return "alipay.pass.file.add";
/* 119:    */   }
/* 120:    */   
/* 121:    */   public Map<String, String> getTextParams()
/* 122:    */   {
/* 123:120 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 124:121 */     txtParams.put("file_content", this.fileContent);
/* 125:122 */     txtParams.put("recognition_info", this.recognitionInfo);
/* 126:123 */     txtParams.put("recognition_type", this.recognitionType);
/* 127:124 */     if (this.udfParams != null) {
/* 128:125 */       txtParams.putAll(this.udfParams);
/* 129:    */     }
/* 130:127 */     return txtParams;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void putOtherTextParam(String key, String value)
/* 134:    */   {
/* 135:131 */     if (this.udfParams == null) {
/* 136:132 */       this.udfParams = new AlipayHashMap();
/* 137:    */     }
/* 138:134 */     this.udfParams.put(key, value);
/* 139:    */   }
/* 140:    */   
/* 141:    */   public Class<AlipayPassFileAddResponse> getResponseClass()
/* 142:    */   {
/* 143:138 */     return AlipayPassFileAddResponse.class;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public boolean isNeedEncrypt()
/* 147:    */   {
/* 148:144 */     return this.needEncrypt;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 152:    */   {
/* 153:150 */     this.needEncrypt = needEncrypt;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public AlipayObject getBizModel()
/* 157:    */   {
/* 158:155 */     return this.bizModel;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setBizModel(AlipayObject bizModel)
/* 162:    */   {
/* 163:161 */     this.bizModel = bizModel;
/* 164:    */   }
/* 165:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassFileAddRequest
 * JD-Core Version:    0.7.0.1
 */