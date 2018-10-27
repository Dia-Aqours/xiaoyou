/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayTradePayResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayTradePayRequest
/*  10:    */   implements AlipayRequest<AlipayTradePayResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 20 */   private String apiVersion = "1.0";
/*  14:    */   private String bizContent;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   private String notifyUrl;
/*  19:    */   private String returnUrl;
/*  20:    */   
/*  21:    */   public void setBizContent(String bizContent)
/*  22:    */   {
/*  23: 29 */     this.bizContent = bizContent;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getBizContent()
/*  27:    */   {
/*  28: 32 */     return this.bizContent;
/*  29:    */   }
/*  30:    */   
/*  31: 39 */   private boolean needEncrypt = false;
/*  32: 40 */   private AlipayObject bizModel = null;
/*  33:    */   
/*  34:    */   public String getNotifyUrl()
/*  35:    */   {
/*  36: 43 */     return this.notifyUrl;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setNotifyUrl(String notifyUrl)
/*  40:    */   {
/*  41: 47 */     this.notifyUrl = notifyUrl;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getReturnUrl()
/*  45:    */   {
/*  46: 51 */     return this.returnUrl;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setReturnUrl(String returnUrl)
/*  50:    */   {
/*  51: 55 */     this.returnUrl = returnUrl;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getApiVersion()
/*  55:    */   {
/*  56: 59 */     return this.apiVersion;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setApiVersion(String apiVersion)
/*  60:    */   {
/*  61: 63 */     this.apiVersion = apiVersion;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setTerminalType(String terminalType)
/*  65:    */   {
/*  66: 67 */     this.terminalType = terminalType;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getTerminalType()
/*  70:    */   {
/*  71: 71 */     return this.terminalType;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setTerminalInfo(String terminalInfo)
/*  75:    */   {
/*  76: 75 */     this.terminalInfo = terminalInfo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getTerminalInfo()
/*  80:    */   {
/*  81: 79 */     return this.terminalInfo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setProdCode(String prodCode)
/*  85:    */   {
/*  86: 83 */     this.prodCode = prodCode;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getProdCode()
/*  90:    */   {
/*  91: 87 */     return this.prodCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiMethodName()
/*  95:    */   {
/*  96: 91 */     return "alipay.trade.pay";
/*  97:    */   }
/*  98:    */   
/*  99:    */   public Map<String, String> getTextParams()
/* 100:    */   {
/* 101: 95 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 102: 96 */     txtParams.put("biz_content", this.bizContent);
/* 103: 97 */     if (this.udfParams != null) {
/* 104: 98 */       txtParams.putAll(this.udfParams);
/* 105:    */     }
/* 106:100 */     return txtParams;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void putOtherTextParam(String key, String value)
/* 110:    */   {
/* 111:104 */     if (this.udfParams == null) {
/* 112:105 */       this.udfParams = new AlipayHashMap();
/* 113:    */     }
/* 114:107 */     this.udfParams.put(key, value);
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Class<AlipayTradePayResponse> getResponseClass()
/* 118:    */   {
/* 119:111 */     return AlipayTradePayResponse.class;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public boolean isNeedEncrypt()
/* 123:    */   {
/* 124:117 */     return this.needEncrypt;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 128:    */   {
/* 129:123 */     this.needEncrypt = needEncrypt;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public AlipayObject getBizModel()
/* 133:    */   {
/* 134:128 */     return this.bizModel;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setBizModel(AlipayObject bizModel)
/* 138:    */   {
/* 139:134 */     this.bizModel = bizModel;
/* 140:    */   }
/* 141:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayTradePayRequest

 * JD-Core Version:    0.7.0.1

 */