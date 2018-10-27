/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMpointprodBenefitDetailGetResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMpointprodBenefitDetailGetRequest
/*  10:    */   implements AlipayRequest<AlipayMpointprodBenefitDetailGetResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String bizContent;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   private String notifyUrl;
/*  19:    */   private String returnUrl;
/*  20:    */   
/*  21:    */   public void setBizContent(String bizContent)
/*  22:    */   {
/*  23: 31 */     this.bizContent = bizContent;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getBizContent()
/*  27:    */   {
/*  28: 34 */     return this.bizContent;
/*  29:    */   }
/*  30:    */   
/*  31: 41 */   private boolean needEncrypt = false;
/*  32: 42 */   private AlipayObject bizModel = null;
/*  33:    */   
/*  34:    */   public String getNotifyUrl()
/*  35:    */   {
/*  36: 45 */     return this.notifyUrl;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setNotifyUrl(String notifyUrl)
/*  40:    */   {
/*  41: 49 */     this.notifyUrl = notifyUrl;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getReturnUrl()
/*  45:    */   {
/*  46: 53 */     return this.returnUrl;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setReturnUrl(String returnUrl)
/*  50:    */   {
/*  51: 57 */     this.returnUrl = returnUrl;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getApiVersion()
/*  55:    */   {
/*  56: 61 */     return this.apiVersion;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setApiVersion(String apiVersion)
/*  60:    */   {
/*  61: 65 */     this.apiVersion = apiVersion;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setTerminalType(String terminalType)
/*  65:    */   {
/*  66: 69 */     this.terminalType = terminalType;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getTerminalType()
/*  70:    */   {
/*  71: 73 */     return this.terminalType;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setTerminalInfo(String terminalInfo)
/*  75:    */   {
/*  76: 77 */     this.terminalInfo = terminalInfo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getTerminalInfo()
/*  80:    */   {
/*  81: 81 */     return this.terminalInfo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setProdCode(String prodCode)
/*  85:    */   {
/*  86: 85 */     this.prodCode = prodCode;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getProdCode()
/*  90:    */   {
/*  91: 89 */     return this.prodCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiMethodName()
/*  95:    */   {
/*  96: 93 */     return "alipay.mpointprod.benefit.detail.get";
/*  97:    */   }
/*  98:    */   
/*  99:    */   public Map<String, String> getTextParams()
/* 100:    */   {
/* 101: 97 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 102: 98 */     txtParams.put("biz_content", this.bizContent);
/* 103: 99 */     if (this.udfParams != null) {
/* 104:100 */       txtParams.putAll(this.udfParams);
/* 105:    */     }
/* 106:102 */     return txtParams;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void putOtherTextParam(String key, String value)
/* 110:    */   {
/* 111:106 */     if (this.udfParams == null) {
/* 112:107 */       this.udfParams = new AlipayHashMap();
/* 113:    */     }
/* 114:109 */     this.udfParams.put(key, value);
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Class<AlipayMpointprodBenefitDetailGetResponse> getResponseClass()
/* 118:    */   {
/* 119:113 */     return AlipayMpointprodBenefitDetailGetResponse.class;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public boolean isNeedEncrypt()
/* 123:    */   {
/* 124:119 */     return this.needEncrypt;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 128:    */   {
/* 129:125 */     this.needEncrypt = needEncrypt;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public AlipayObject getBizModel()
/* 133:    */   {
/* 134:130 */     return this.bizModel;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setBizModel(AlipayObject bizModel)
/* 138:    */   {
/* 139:136 */     this.bizModel = bizModel;
/* 140:    */   }
/* 141:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMpointprodBenefitDetailGetRequest
 * JD-Core Version:    0.7.0.1
 */