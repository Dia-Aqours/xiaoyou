/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayUploadRequest;
/*   5:    */ import com.alipay.api.FileItem;
/*   6:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   7:    */ import com.alipay.api.response.AntMerchantExpandImageUploadResponse;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.Map;
/*  10:    */ 
/*  11:    */ public class AntMerchantExpandImageUploadRequest
/*  12:    */   implements AlipayUploadRequest<AntMerchantExpandImageUploadResponse>
/*  13:    */ {
/*  14:    */   private AlipayHashMap udfParams;
/*  15: 21 */   private String apiVersion = "1.0";
/*  16:    */   private FileItem imageContent;
/*  17:    */   private String imageType;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   private String returnUrl;
/*  23:    */   
/*  24:    */   public void setImageContent(FileItem imageContent)
/*  25:    */   {
/*  26: 34 */     this.imageContent = imageContent;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public FileItem getImageContent()
/*  30:    */   {
/*  31: 37 */     return this.imageContent;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setImageType(String imageType)
/*  35:    */   {
/*  36: 41 */     this.imageType = imageType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getImageType()
/*  40:    */   {
/*  41: 44 */     return this.imageType;
/*  42:    */   }
/*  43:    */   
/*  44: 51 */   private boolean needEncrypt = false;
/*  45: 52 */   private AlipayObject bizModel = null;
/*  46:    */   
/*  47:    */   public String getNotifyUrl()
/*  48:    */   {
/*  49: 55 */     return this.notifyUrl;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setNotifyUrl(String notifyUrl)
/*  53:    */   {
/*  54: 59 */     this.notifyUrl = notifyUrl;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getReturnUrl()
/*  58:    */   {
/*  59: 63 */     return this.returnUrl;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setReturnUrl(String returnUrl)
/*  63:    */   {
/*  64: 67 */     this.returnUrl = returnUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getApiVersion()
/*  68:    */   {
/*  69: 71 */     return this.apiVersion;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setApiVersion(String apiVersion)
/*  73:    */   {
/*  74: 74 */     this.apiVersion = apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setTerminalType(String terminalType)
/*  78:    */   {
/*  79: 78 */     this.terminalType = terminalType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getTerminalType()
/*  83:    */   {
/*  84: 82 */     return this.terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setTerminalInfo(String terminalInfo)
/*  88:    */   {
/*  89: 86 */     this.terminalInfo = terminalInfo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getTerminalInfo()
/*  93:    */   {
/*  94: 90 */     return this.terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getProdCode()
/*  98:    */   {
/*  99: 94 */     return this.prodCode;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104: 98 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getApiMethodName()
/* 108:    */   {
/* 109:102 */     return "ant.merchant.expand.image.upload";
/* 110:    */   }
/* 111:    */   
/* 112:    */   public Map<String, String> getTextParams()
/* 113:    */   {
/* 114:106 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 115:107 */     txtParams.put("image_type", this.imageType);
/* 116:108 */     if (this.udfParams != null) {
/* 117:109 */       txtParams.putAll(this.udfParams);
/* 118:    */     }
/* 119:111 */     return txtParams;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void putOtherTextParam(String key, String value)
/* 123:    */   {
/* 124:115 */     if (this.udfParams == null) {
/* 125:116 */       this.udfParams = new AlipayHashMap();
/* 126:    */     }
/* 127:118 */     this.udfParams.put(key, value);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public Map<String, FileItem> getFileParams()
/* 131:    */   {
/* 132:122 */     Map<String, FileItem> params = new HashMap();
/* 133:123 */     params.put("image_content", this.imageContent);
/* 134:124 */     return params;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public Class<AntMerchantExpandImageUploadResponse> getResponseClass()
/* 138:    */   {
/* 139:128 */     return AntMerchantExpandImageUploadResponse.class;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public boolean isNeedEncrypt()
/* 143:    */   {
/* 144:133 */     return this.needEncrypt;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 148:    */   {
/* 149:139 */     this.needEncrypt = needEncrypt;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public AlipayObject getBizModel()
/* 153:    */   {
/* 154:144 */     return this.bizModel;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setBizModel(AlipayObject bizModel)
/* 158:    */   {
/* 159:150 */     this.bizModel = bizModel;
/* 160:    */   }
/* 161:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AntMerchantExpandImageUploadRequest
 * JD-Core Version:    0.7.0.1
 */