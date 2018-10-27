/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMobilePublicInfoQueryResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMobilePublicInfoQueryRequest
/*  10:    */   implements AlipayRequest<AlipayMobilePublicInfoQueryResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String terminalType;
/*  15:    */   private String terminalInfo;
/*  16:    */   private String prodCode;
/*  17:    */   private String notifyUrl;
/*  18:    */   private String returnUrl;
/*  19: 25 */   private boolean needEncrypt = false;
/*  20: 26 */   private AlipayObject bizModel = null;
/*  21:    */   
/*  22:    */   public String getNotifyUrl()
/*  23:    */   {
/*  24: 29 */     return this.notifyUrl;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void setNotifyUrl(String notifyUrl)
/*  28:    */   {
/*  29: 33 */     this.notifyUrl = notifyUrl;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getReturnUrl()
/*  33:    */   {
/*  34: 37 */     return this.returnUrl;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setReturnUrl(String returnUrl)
/*  38:    */   {
/*  39: 41 */     this.returnUrl = returnUrl;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getApiVersion()
/*  43:    */   {
/*  44: 45 */     return this.apiVersion;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setApiVersion(String apiVersion)
/*  48:    */   {
/*  49: 49 */     this.apiVersion = apiVersion;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setTerminalType(String terminalType)
/*  53:    */   {
/*  54: 53 */     this.terminalType = terminalType;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getTerminalType()
/*  58:    */   {
/*  59: 57 */     return this.terminalType;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setTerminalInfo(String terminalInfo)
/*  63:    */   {
/*  64: 61 */     this.terminalInfo = terminalInfo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getTerminalInfo()
/*  68:    */   {
/*  69: 65 */     return this.terminalInfo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setProdCode(String prodCode)
/*  73:    */   {
/*  74: 69 */     this.prodCode = prodCode;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getProdCode()
/*  78:    */   {
/*  79: 73 */     return this.prodCode;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getApiMethodName()
/*  83:    */   {
/*  84: 77 */     return "alipay.mobile.public.info.query";
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Map<String, String> getTextParams()
/*  88:    */   {
/*  89: 81 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  90: 82 */     if (this.udfParams != null) {
/*  91: 83 */       txtParams.putAll(this.udfParams);
/*  92:    */     }
/*  93: 85 */     return txtParams;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void putOtherTextParam(String key, String value)
/*  97:    */   {
/*  98: 89 */     if (this.udfParams == null) {
/*  99: 90 */       this.udfParams = new AlipayHashMap();
/* 100:    */     }
/* 101: 92 */     this.udfParams.put(key, value);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public Class<AlipayMobilePublicInfoQueryResponse> getResponseClass()
/* 105:    */   {
/* 106: 96 */     return AlipayMobilePublicInfoQueryResponse.class;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean isNeedEncrypt()
/* 110:    */   {
/* 111:102 */     return this.needEncrypt;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 115:    */   {
/* 116:108 */     this.needEncrypt = needEncrypt;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public AlipayObject getBizModel()
/* 120:    */   {
/* 121:113 */     return this.bizModel;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setBizModel(AlipayObject bizModel)
/* 125:    */   {
/* 126:119 */     this.bizModel = bizModel;
/* 127:    */   }
/* 128:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMobilePublicInfoQueryRequest
 * JD-Core Version:    0.7.0.1
 */