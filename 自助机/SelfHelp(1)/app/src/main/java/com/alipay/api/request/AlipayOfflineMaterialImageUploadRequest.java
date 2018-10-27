/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayUploadRequest;
/*   5:    */ import com.alipay.api.FileItem;
/*   6:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   7:    */ import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.Map;
/*  10:    */ 
/*  11:    */ public class AlipayOfflineMaterialImageUploadRequest
/*  12:    */   implements AlipayUploadRequest<AlipayOfflineMaterialImageUploadResponse>
/*  13:    */ {
/*  14:    */   private AlipayHashMap udfParams;
/*  15: 21 */   private String apiVersion = "1.0";
/*  16:    */   private FileItem imageContent;
/*  17:    */   private String imageName;
/*  18:    */   private String imagePid;
/*  19:    */   private String imageType;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setImageContent(FileItem imageContent)
/*  27:    */   {
/*  28: 44 */     this.imageContent = imageContent;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public FileItem getImageContent()
/*  32:    */   {
/*  33: 47 */     return this.imageContent;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setImageName(String imageName)
/*  37:    */   {
/*  38: 51 */     this.imageName = imageName;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getImageName()
/*  42:    */   {
/*  43: 54 */     return this.imageName;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setImagePid(String imagePid)
/*  47:    */   {
/*  48: 58 */     this.imagePid = imagePid;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getImagePid()
/*  52:    */   {
/*  53: 61 */     return this.imagePid;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setImageType(String imageType)
/*  57:    */   {
/*  58: 65 */     this.imageType = imageType;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getImageType()
/*  62:    */   {
/*  63: 68 */     return this.imageType;
/*  64:    */   }
/*  65:    */   
/*  66: 75 */   private boolean needEncrypt = false;
/*  67: 76 */   private AlipayObject bizModel = null;
/*  68:    */   
/*  69:    */   public String getNotifyUrl()
/*  70:    */   {
/*  71: 79 */     return this.notifyUrl;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setNotifyUrl(String notifyUrl)
/*  75:    */   {
/*  76: 83 */     this.notifyUrl = notifyUrl;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getReturnUrl()
/*  80:    */   {
/*  81: 87 */     return this.returnUrl;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setReturnUrl(String returnUrl)
/*  85:    */   {
/*  86: 91 */     this.returnUrl = returnUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getApiVersion()
/*  90:    */   {
/*  91: 95 */     return this.apiVersion;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setApiVersion(String apiVersion)
/*  95:    */   {
/*  96: 98 */     this.apiVersion = apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setTerminalType(String terminalType)
/* 100:    */   {
/* 101:102 */     this.terminalType = terminalType;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getTerminalType()
/* 105:    */   {
/* 106:106 */     return this.terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setTerminalInfo(String terminalInfo)
/* 110:    */   {
/* 111:110 */     this.terminalInfo = terminalInfo;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getTerminalInfo()
/* 115:    */   {
/* 116:114 */     return this.terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getProdCode()
/* 120:    */   {
/* 121:118 */     return this.prodCode;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:122 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getApiMethodName()
/* 130:    */   {
/* 131:126 */     return "alipay.offline.material.image.upload";
/* 132:    */   }
/* 133:    */   
/* 134:    */   public Map<String, String> getTextParams()
/* 135:    */   {
/* 136:130 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 137:131 */     txtParams.put("image_name", this.imageName);
/* 138:132 */     txtParams.put("image_pid", this.imagePid);
/* 139:133 */     txtParams.put("image_type", this.imageType);
/* 140:134 */     if (this.udfParams != null) {
/* 141:135 */       txtParams.putAll(this.udfParams);
/* 142:    */     }
/* 143:137 */     return txtParams;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void putOtherTextParam(String key, String value)
/* 147:    */   {
/* 148:141 */     if (this.udfParams == null) {
/* 149:142 */       this.udfParams = new AlipayHashMap();
/* 150:    */     }
/* 151:144 */     this.udfParams.put(key, value);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, FileItem> getFileParams()
/* 155:    */   {
/* 156:148 */     Map<String, FileItem> params = new HashMap();
/* 157:149 */     params.put("image_content", this.imageContent);
/* 158:150 */     return params;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public Class<AlipayOfflineMaterialImageUploadResponse> getResponseClass()
/* 162:    */   {
/* 163:154 */     return AlipayOfflineMaterialImageUploadResponse.class;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public boolean isNeedEncrypt()
/* 167:    */   {
/* 168:159 */     return this.needEncrypt;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 172:    */   {
/* 173:165 */     this.needEncrypt = needEncrypt;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public AlipayObject getBizModel()
/* 177:    */   {
/* 178:170 */     return this.bizModel;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setBizModel(AlipayObject bizModel)
/* 182:    */   {
/* 183:176 */     this.bizModel = bizModel;
/* 184:    */   }
/* 185:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayOfflineMaterialImageUploadRequest
 * JD-Core Version:    0.7.0.1
 */