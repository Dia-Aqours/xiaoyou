/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayAcquireCloseResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayAcquireCloseRequest
/*  10:    */   implements AlipayRequest<AlipayAcquireCloseResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String operatorId;
/*  15:    */   private String outTradeNo;
/*  16:    */   private String tradeNo;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   private String returnUrl;
/*  22:    */   
/*  23:    */   public void setOperatorId(String operatorId)
/*  24:    */   {
/*  25: 39 */     this.operatorId = operatorId;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getOperatorId()
/*  29:    */   {
/*  30: 42 */     return this.operatorId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setOutTradeNo(String outTradeNo)
/*  34:    */   {
/*  35: 46 */     this.outTradeNo = outTradeNo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getOutTradeNo()
/*  39:    */   {
/*  40: 49 */     return this.outTradeNo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setTradeNo(String tradeNo)
/*  44:    */   {
/*  45: 53 */     this.tradeNo = tradeNo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getTradeNo()
/*  49:    */   {
/*  50: 56 */     return this.tradeNo;
/*  51:    */   }
/*  52:    */   
/*  53: 63 */   private boolean needEncrypt = false;
/*  54: 64 */   private AlipayObject bizModel = null;
/*  55:    */   
/*  56:    */   public String getNotifyUrl()
/*  57:    */   {
/*  58: 67 */     return this.notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setNotifyUrl(String notifyUrl)
/*  62:    */   {
/*  63: 71 */     this.notifyUrl = notifyUrl;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getReturnUrl()
/*  67:    */   {
/*  68: 75 */     return this.returnUrl;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setReturnUrl(String returnUrl)
/*  72:    */   {
/*  73: 79 */     this.returnUrl = returnUrl;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getApiVersion()
/*  77:    */   {
/*  78: 83 */     return this.apiVersion;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setApiVersion(String apiVersion)
/*  82:    */   {
/*  83: 87 */     this.apiVersion = apiVersion;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setTerminalType(String terminalType)
/*  87:    */   {
/*  88: 91 */     this.terminalType = terminalType;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getTerminalType()
/*  92:    */   {
/*  93: 95 */     return this.terminalType;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTerminalInfo(String terminalInfo)
/*  97:    */   {
/*  98: 99 */     this.terminalInfo = terminalInfo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTerminalInfo()
/* 102:    */   {
/* 103:103 */     return this.terminalInfo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setProdCode(String prodCode)
/* 107:    */   {
/* 108:107 */     this.prodCode = prodCode;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getProdCode()
/* 112:    */   {
/* 113:111 */     return this.prodCode;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getApiMethodName()
/* 117:    */   {
/* 118:115 */     return "alipay.acquire.close";
/* 119:    */   }
/* 120:    */   
/* 121:    */   public Map<String, String> getTextParams()
/* 122:    */   {
/* 123:119 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 124:120 */     txtParams.put("operator_id", this.operatorId);
/* 125:121 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 126:122 */     txtParams.put("trade_no", this.tradeNo);
/* 127:123 */     if (this.udfParams != null) {
/* 128:124 */       txtParams.putAll(this.udfParams);
/* 129:    */     }
/* 130:126 */     return txtParams;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void putOtherTextParam(String key, String value)
/* 134:    */   {
/* 135:130 */     if (this.udfParams == null) {
/* 136:131 */       this.udfParams = new AlipayHashMap();
/* 137:    */     }
/* 138:133 */     this.udfParams.put(key, value);
/* 139:    */   }
/* 140:    */   
/* 141:    */   public Class<AlipayAcquireCloseResponse> getResponseClass()
/* 142:    */   {
/* 143:137 */     return AlipayAcquireCloseResponse.class;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public boolean isNeedEncrypt()
/* 147:    */   {
/* 148:143 */     return this.needEncrypt;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 152:    */   {
/* 153:149 */     this.needEncrypt = needEncrypt;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public AlipayObject getBizModel()
/* 157:    */   {
/* 158:154 */     return this.bizModel;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setBizModel(AlipayObject bizModel)
/* 162:    */   {
/* 163:160 */     this.bizModel = bizModel;
/* 164:    */   }
/* 165:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayAcquireCloseRequest
 * JD-Core Version:    0.7.0.1
 */