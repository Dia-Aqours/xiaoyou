/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayAcquireCancelResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayAcquireCancelRequest
/*  10:    */   implements AlipayRequest<AlipayAcquireCancelResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String operatorId;
/*  15:    */   private String operatorType;
/*  16:    */   private String outTradeNo;
/*  17:    */   private String tradeNo;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   private String returnUrl;
/*  23:    */   
/*  24:    */   public void setOperatorId(String operatorId)
/*  25:    */   {
/*  26: 47 */     this.operatorId = operatorId;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getOperatorId()
/*  30:    */   {
/*  31: 50 */     return this.operatorId;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setOperatorType(String operatorType)
/*  35:    */   {
/*  36: 54 */     this.operatorType = operatorType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getOperatorType()
/*  40:    */   {
/*  41: 57 */     return this.operatorType;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setOutTradeNo(String outTradeNo)
/*  45:    */   {
/*  46: 61 */     this.outTradeNo = outTradeNo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getOutTradeNo()
/*  50:    */   {
/*  51: 64 */     return this.outTradeNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setTradeNo(String tradeNo)
/*  55:    */   {
/*  56: 68 */     this.tradeNo = tradeNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getTradeNo()
/*  60:    */   {
/*  61: 71 */     return this.tradeNo;
/*  62:    */   }
/*  63:    */   
/*  64: 78 */   private boolean needEncrypt = false;
/*  65: 79 */   private AlipayObject bizModel = null;
/*  66:    */   
/*  67:    */   public String getNotifyUrl()
/*  68:    */   {
/*  69: 82 */     return this.notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setNotifyUrl(String notifyUrl)
/*  73:    */   {
/*  74: 86 */     this.notifyUrl = notifyUrl;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getReturnUrl()
/*  78:    */   {
/*  79: 90 */     return this.returnUrl;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setReturnUrl(String returnUrl)
/*  83:    */   {
/*  84: 94 */     this.returnUrl = returnUrl;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getApiVersion()
/*  88:    */   {
/*  89: 98 */     return this.apiVersion;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setApiVersion(String apiVersion)
/*  93:    */   {
/*  94:102 */     this.apiVersion = apiVersion;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setTerminalType(String terminalType)
/*  98:    */   {
/*  99:106 */     this.terminalType = terminalType;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTerminalType()
/* 103:    */   {
/* 104:110 */     return this.terminalType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setTerminalInfo(String terminalInfo)
/* 108:    */   {
/* 109:114 */     this.terminalInfo = terminalInfo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getTerminalInfo()
/* 113:    */   {
/* 114:118 */     return this.terminalInfo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setProdCode(String prodCode)
/* 118:    */   {
/* 119:122 */     this.prodCode = prodCode;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getProdCode()
/* 123:    */   {
/* 124:126 */     return this.prodCode;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getApiMethodName()
/* 128:    */   {
/* 129:130 */     return "alipay.acquire.cancel";
/* 130:    */   }
/* 131:    */   
/* 132:    */   public Map<String, String> getTextParams()
/* 133:    */   {
/* 134:134 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 135:135 */     txtParams.put("operator_id", this.operatorId);
/* 136:136 */     txtParams.put("operator_type", this.operatorType);
/* 137:137 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 138:138 */     txtParams.put("trade_no", this.tradeNo);
/* 139:139 */     if (this.udfParams != null) {
/* 140:140 */       txtParams.putAll(this.udfParams);
/* 141:    */     }
/* 142:142 */     return txtParams;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void putOtherTextParam(String key, String value)
/* 146:    */   {
/* 147:146 */     if (this.udfParams == null) {
/* 148:147 */       this.udfParams = new AlipayHashMap();
/* 149:    */     }
/* 150:149 */     this.udfParams.put(key, value);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public Class<AlipayAcquireCancelResponse> getResponseClass()
/* 154:    */   {
/* 155:153 */     return AlipayAcquireCancelResponse.class;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public boolean isNeedEncrypt()
/* 159:    */   {
/* 160:159 */     return this.needEncrypt;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 164:    */   {
/* 165:165 */     this.needEncrypt = needEncrypt;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public AlipayObject getBizModel()
/* 169:    */   {
/* 170:170 */     return this.bizModel;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setBizModel(AlipayObject bizModel)
/* 174:    */   {
/* 175:176 */     this.bizModel = bizModel;
/* 176:    */   }
/* 177:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayAcquireCancelRequest
 * JD-Core Version:    0.7.0.1
 */