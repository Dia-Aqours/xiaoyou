/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayAcquireQueryResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayAcquireQueryRequest
/*  10:    */   implements AlipayRequest<AlipayAcquireQueryResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String outTradeNo;
/*  15:    */   private String tradeNo;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   private String returnUrl;
/*  21:    */   
/*  22:    */   public void setOutTradeNo(String outTradeNo)
/*  23:    */   {
/*  24: 34 */     this.outTradeNo = outTradeNo;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getOutTradeNo()
/*  28:    */   {
/*  29: 37 */     return this.outTradeNo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setTradeNo(String tradeNo)
/*  33:    */   {
/*  34: 41 */     this.tradeNo = tradeNo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getTradeNo()
/*  38:    */   {
/*  39: 44 */     return this.tradeNo;
/*  40:    */   }
/*  41:    */   
/*  42: 51 */   private boolean needEncrypt = false;
/*  43: 52 */   private AlipayObject bizModel = null;
/*  44:    */   
/*  45:    */   public String getNotifyUrl()
/*  46:    */   {
/*  47: 55 */     return this.notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setNotifyUrl(String notifyUrl)
/*  51:    */   {
/*  52: 59 */     this.notifyUrl = notifyUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getReturnUrl()
/*  56:    */   {
/*  57: 63 */     return this.returnUrl;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReturnUrl(String returnUrl)
/*  61:    */   {
/*  62: 67 */     this.returnUrl = returnUrl;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getApiVersion()
/*  66:    */   {
/*  67: 71 */     return this.apiVersion;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setApiVersion(String apiVersion)
/*  71:    */   {
/*  72: 75 */     this.apiVersion = apiVersion;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setTerminalType(String terminalType)
/*  76:    */   {
/*  77: 79 */     this.terminalType = terminalType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getTerminalType()
/*  81:    */   {
/*  82: 83 */     return this.terminalType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setTerminalInfo(String terminalInfo)
/*  86:    */   {
/*  87: 87 */     this.terminalInfo = terminalInfo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getTerminalInfo()
/*  91:    */   {
/*  92: 91 */     return this.terminalInfo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setProdCode(String prodCode)
/*  96:    */   {
/*  97: 95 */     this.prodCode = prodCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getProdCode()
/* 101:    */   {
/* 102: 99 */     return this.prodCode;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiMethodName()
/* 106:    */   {
/* 107:103 */     return "alipay.acquire.query";
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Map<String, String> getTextParams()
/* 111:    */   {
/* 112:107 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 113:108 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 114:109 */     txtParams.put("trade_no", this.tradeNo);
/* 115:110 */     if (this.udfParams != null) {
/* 116:111 */       txtParams.putAll(this.udfParams);
/* 117:    */     }
/* 118:113 */     return txtParams;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void putOtherTextParam(String key, String value)
/* 122:    */   {
/* 123:117 */     if (this.udfParams == null) {
/* 124:118 */       this.udfParams = new AlipayHashMap();
/* 125:    */     }
/* 126:120 */     this.udfParams.put(key, value);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Class<AlipayAcquireQueryResponse> getResponseClass()
/* 130:    */   {
/* 131:124 */     return AlipayAcquireQueryResponse.class;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean isNeedEncrypt()
/* 135:    */   {
/* 136:130 */     return this.needEncrypt;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 140:    */   {
/* 141:136 */     this.needEncrypt = needEncrypt;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public AlipayObject getBizModel()
/* 145:    */   {
/* 146:141 */     return this.bizModel;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setBizModel(AlipayObject bizModel)
/* 150:    */   {
/* 151:147 */     this.bizModel = bizModel;
/* 152:    */   }
/* 153:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayAcquireQueryRequest
 * JD-Core Version:    0.7.0.1
 */