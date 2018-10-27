/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayUploadRequest;
/*   5:    */ import com.alipay.api.FileItem;
/*   6:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   7:    */ import com.alipay.api.response.AlipayOfflineMarketingVoucherCodeUploadResponse;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.Map;
/*  10:    */ 
/*  11:    */ public class AlipayOfflineMarketingVoucherCodeUploadRequest
/*  12:    */   implements AlipayUploadRequest<AlipayOfflineMarketingVoucherCodeUploadResponse>
/*  13:    */ {
/*  14:    */   private AlipayHashMap udfParams;
/*  15: 21 */   private String apiVersion = "1.0";
/*  16:    */   private String extendParams;
/*  17:    */   private String fileCharset;
/*  18:    */   private FileItem fileContent;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   private String returnUrl;
/*  24:    */   
/*  25:    */   public void setExtendParams(String extendParams)
/*  26:    */   {
/*  27: 39 */     this.extendParams = extendParams;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getExtendParams()
/*  31:    */   {
/*  32: 42 */     return this.extendParams;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setFileCharset(String fileCharset)
/*  36:    */   {
/*  37: 46 */     this.fileCharset = fileCharset;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getFileCharset()
/*  41:    */   {
/*  42: 49 */     return this.fileCharset;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setFileContent(FileItem fileContent)
/*  46:    */   {
/*  47: 53 */     this.fileContent = fileContent;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public FileItem getFileContent()
/*  51:    */   {
/*  52: 56 */     return this.fileContent;
/*  53:    */   }
/*  54:    */   
/*  55: 63 */   private boolean needEncrypt = false;
/*  56: 64 */   private AlipayObject bizModel = null;
/*  57:    */   
/*  58:    */   public String getNotifyUrl()
/*  59:    */   {
/*  60: 67 */     return this.notifyUrl;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setNotifyUrl(String notifyUrl)
/*  64:    */   {
/*  65: 71 */     this.notifyUrl = notifyUrl;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getReturnUrl()
/*  69:    */   {
/*  70: 75 */     return this.returnUrl;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setReturnUrl(String returnUrl)
/*  74:    */   {
/*  75: 79 */     this.returnUrl = returnUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getApiVersion()
/*  79:    */   {
/*  80: 83 */     return this.apiVersion;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setApiVersion(String apiVersion)
/*  84:    */   {
/*  85: 86 */     this.apiVersion = apiVersion;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setTerminalType(String terminalType)
/*  89:    */   {
/*  90: 90 */     this.terminalType = terminalType;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getTerminalType()
/*  94:    */   {
/*  95: 94 */     return this.terminalType;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setTerminalInfo(String terminalInfo)
/*  99:    */   {
/* 100: 98 */     this.terminalInfo = terminalInfo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getTerminalInfo()
/* 104:    */   {
/* 105:102 */     return this.terminalInfo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getProdCode()
/* 109:    */   {
/* 110:106 */     return this.prodCode;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setProdCode(String prodCode)
/* 114:    */   {
/* 115:110 */     this.prodCode = prodCode;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getApiMethodName()
/* 119:    */   {
/* 120:114 */     return "alipay.offline.marketing.voucher.code.upload";
/* 121:    */   }
/* 122:    */   
/* 123:    */   public Map<String, String> getTextParams()
/* 124:    */   {
/* 125:118 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 126:119 */     txtParams.put("extend_params", this.extendParams);
/* 127:120 */     txtParams.put("file_charset", this.fileCharset);
/* 128:121 */     if (this.udfParams != null) {
/* 129:122 */       txtParams.putAll(this.udfParams);
/* 130:    */     }
/* 131:124 */     return txtParams;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void putOtherTextParam(String key, String value)
/* 135:    */   {
/* 136:128 */     if (this.udfParams == null) {
/* 137:129 */       this.udfParams = new AlipayHashMap();
/* 138:    */     }
/* 139:131 */     this.udfParams.put(key, value);
/* 140:    */   }
/* 141:    */   
/* 142:    */   public Map<String, FileItem> getFileParams()
/* 143:    */   {
/* 144:135 */     Map<String, FileItem> params = new HashMap();
/* 145:136 */     params.put("file_content", this.fileContent);
/* 146:137 */     return params;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public Class<AlipayOfflineMarketingVoucherCodeUploadResponse> getResponseClass()
/* 150:    */   {
/* 151:141 */     return AlipayOfflineMarketingVoucherCodeUploadResponse.class;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public boolean isNeedEncrypt()
/* 155:    */   {
/* 156:146 */     return this.needEncrypt;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 160:    */   {
/* 161:152 */     this.needEncrypt = needEncrypt;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public AlipayObject getBizModel()
/* 165:    */   {
/* 166:157 */     return this.bizModel;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setBizModel(AlipayObject bizModel)
/* 170:    */   {
/* 171:163 */     this.bizModel = bizModel;
/* 172:    */   }
/* 173:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayOfflineMarketingVoucherCodeUploadRequest
 * JD-Core Version:    0.7.0.1
 */