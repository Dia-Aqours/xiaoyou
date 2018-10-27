/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayOfflineMaterialImageDownloadResponse;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayOfflineMaterialImageDownloadRequest
/*  11:    */   implements AlipayRequest<AlipayOfflineMaterialImageDownloadResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private List<String> imageIds;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   private String returnUrl;
/*  21:    */   
/*  22:    */   public void setImageIds(List<String> imageIds)
/*  23:    */   {
/*  24: 28 */     this.imageIds = imageIds;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public List<String> getImageIds()
/*  28:    */   {
/*  29: 31 */     return this.imageIds;
/*  30:    */   }
/*  31:    */   
/*  32: 38 */   private boolean needEncrypt = false;
/*  33: 39 */   private AlipayObject bizModel = null;
/*  34:    */   
/*  35:    */   public String getNotifyUrl()
/*  36:    */   {
/*  37: 42 */     return this.notifyUrl;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setNotifyUrl(String notifyUrl)
/*  41:    */   {
/*  42: 46 */     this.notifyUrl = notifyUrl;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getReturnUrl()
/*  46:    */   {
/*  47: 50 */     return this.returnUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setReturnUrl(String returnUrl)
/*  51:    */   {
/*  52: 54 */     this.returnUrl = returnUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getApiVersion()
/*  56:    */   {
/*  57: 58 */     return this.apiVersion;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setApiVersion(String apiVersion)
/*  61:    */   {
/*  62: 62 */     this.apiVersion = apiVersion;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setTerminalType(String terminalType)
/*  66:    */   {
/*  67: 66 */     this.terminalType = terminalType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getTerminalType()
/*  71:    */   {
/*  72: 70 */     return this.terminalType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setTerminalInfo(String terminalInfo)
/*  76:    */   {
/*  77: 74 */     this.terminalInfo = terminalInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getTerminalInfo()
/*  81:    */   {
/*  82: 78 */     return this.terminalInfo;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setProdCode(String prodCode)
/*  86:    */   {
/*  87: 82 */     this.prodCode = prodCode;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getProdCode()
/*  91:    */   {
/*  92: 86 */     return this.prodCode;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getApiMethodName()
/*  96:    */   {
/*  97: 90 */     return "alipay.offline.material.image.download";
/*  98:    */   }
/*  99:    */   
/* 100:    */   public Map<String, String> getTextParams()
/* 101:    */   {
/* 102: 94 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 103: 95 */     txtParams.put("image_ids", this.imageIds);
/* 104: 96 */     if (this.udfParams != null) {
/* 105: 97 */       txtParams.putAll(this.udfParams);
/* 106:    */     }
/* 107: 99 */     return txtParams;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void putOtherTextParam(String key, String value)
/* 111:    */   {
/* 112:103 */     if (this.udfParams == null) {
/* 113:104 */       this.udfParams = new AlipayHashMap();
/* 114:    */     }
/* 115:106 */     this.udfParams.put(key, value);
/* 116:    */   }
/* 117:    */   
/* 118:    */   public Class<AlipayOfflineMaterialImageDownloadResponse> getResponseClass()
/* 119:    */   {
/* 120:110 */     return AlipayOfflineMaterialImageDownloadResponse.class;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public boolean isNeedEncrypt()
/* 124:    */   {
/* 125:116 */     return this.needEncrypt;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 129:    */   {
/* 130:122 */     this.needEncrypt = needEncrypt;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public AlipayObject getBizModel()
/* 134:    */   {
/* 135:127 */     return this.bizModel;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setBizModel(AlipayObject bizModel)
/* 139:    */   {
/* 140:133 */     this.bizModel = bizModel;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayOfflineMaterialImageDownloadRequest
 * JD-Core Version:    0.7.0.1
 */