/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayAcquireRefundResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayAcquireRefundRequest
/*  10:    */   implements AlipayRequest<AlipayAcquireRefundResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String operatorId;
/*  15:    */   private String operatorType;
/*  16:    */   private String outRequestNo;
/*  17:    */   private String outTradeNo;
/*  18:    */   private String refIds;
/*  19:    */   private String refundAmount;
/*  20:    */   private String refundReason;
/*  21:    */   private String tradeNo;
/*  22:    */   private String terminalType;
/*  23:    */   private String terminalInfo;
/*  24:    */   private String prodCode;
/*  25:    */   private String notifyUrl;
/*  26:    */   private String returnUrl;
/*  27:    */   
/*  28:    */   public void setOperatorId(String operatorId)
/*  29:    */   {
/*  30: 68 */     this.operatorId = operatorId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getOperatorId()
/*  34:    */   {
/*  35: 71 */     return this.operatorId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setOperatorType(String operatorType)
/*  39:    */   {
/*  40: 75 */     this.operatorType = operatorType;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public String getOperatorType()
/*  44:    */   {
/*  45: 78 */     return this.operatorType;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setOutRequestNo(String outRequestNo)
/*  49:    */   {
/*  50: 82 */     this.outRequestNo = outRequestNo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getOutRequestNo()
/*  54:    */   {
/*  55: 85 */     return this.outRequestNo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setOutTradeNo(String outTradeNo)
/*  59:    */   {
/*  60: 89 */     this.outTradeNo = outTradeNo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getOutTradeNo()
/*  64:    */   {
/*  65: 92 */     return this.outTradeNo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setRefIds(String refIds)
/*  69:    */   {
/*  70: 96 */     this.refIds = refIds;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getRefIds()
/*  74:    */   {
/*  75: 99 */     return this.refIds;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setRefundAmount(String refundAmount)
/*  79:    */   {
/*  80:103 */     this.refundAmount = refundAmount;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getRefundAmount()
/*  84:    */   {
/*  85:106 */     return this.refundAmount;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setRefundReason(String refundReason)
/*  89:    */   {
/*  90:110 */     this.refundReason = refundReason;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getRefundReason()
/*  94:    */   {
/*  95:113 */     return this.refundReason;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setTradeNo(String tradeNo)
/*  99:    */   {
/* 100:117 */     this.tradeNo = tradeNo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getTradeNo()
/* 104:    */   {
/* 105:120 */     return this.tradeNo;
/* 106:    */   }
/* 107:    */   
/* 108:127 */   private boolean needEncrypt = false;
/* 109:128 */   private AlipayObject bizModel = null;
/* 110:    */   
/* 111:    */   public String getNotifyUrl()
/* 112:    */   {
/* 113:131 */     return this.notifyUrl;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setNotifyUrl(String notifyUrl)
/* 117:    */   {
/* 118:135 */     this.notifyUrl = notifyUrl;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getReturnUrl()
/* 122:    */   {
/* 123:139 */     return this.returnUrl;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setReturnUrl(String returnUrl)
/* 127:    */   {
/* 128:143 */     this.returnUrl = returnUrl;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getApiVersion()
/* 132:    */   {
/* 133:147 */     return this.apiVersion;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setApiVersion(String apiVersion)
/* 137:    */   {
/* 138:151 */     this.apiVersion = apiVersion;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setTerminalType(String terminalType)
/* 142:    */   {
/* 143:155 */     this.terminalType = terminalType;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getTerminalType()
/* 147:    */   {
/* 148:159 */     return this.terminalType;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setTerminalInfo(String terminalInfo)
/* 152:    */   {
/* 153:163 */     this.terminalInfo = terminalInfo;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getTerminalInfo()
/* 157:    */   {
/* 158:167 */     return this.terminalInfo;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setProdCode(String prodCode)
/* 162:    */   {
/* 163:171 */     this.prodCode = prodCode;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getProdCode()
/* 167:    */   {
/* 168:175 */     return this.prodCode;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getApiMethodName()
/* 172:    */   {
/* 173:179 */     return "alipay.acquire.refund";
/* 174:    */   }
/* 175:    */   
/* 176:    */   public Map<String, String> getTextParams()
/* 177:    */   {
/* 178:183 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 179:184 */     txtParams.put("operator_id", this.operatorId);
/* 180:185 */     txtParams.put("operator_type", this.operatorType);
/* 181:186 */     txtParams.put("out_request_no", this.outRequestNo);
/* 182:187 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 183:188 */     txtParams.put("ref_ids", this.refIds);
/* 184:189 */     txtParams.put("refund_amount", this.refundAmount);
/* 185:190 */     txtParams.put("refund_reason", this.refundReason);
/* 186:191 */     txtParams.put("trade_no", this.tradeNo);
/* 187:192 */     if (this.udfParams != null) {
/* 188:193 */       txtParams.putAll(this.udfParams);
/* 189:    */     }
/* 190:195 */     return txtParams;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void putOtherTextParam(String key, String value)
/* 194:    */   {
/* 195:199 */     if (this.udfParams == null) {
/* 196:200 */       this.udfParams = new AlipayHashMap();
/* 197:    */     }
/* 198:202 */     this.udfParams.put(key, value);
/* 199:    */   }
/* 200:    */   
/* 201:    */   public Class<AlipayAcquireRefundResponse> getResponseClass()
/* 202:    */   {
/* 203:206 */     return AlipayAcquireRefundResponse.class;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public boolean isNeedEncrypt()
/* 207:    */   {
/* 208:212 */     return this.needEncrypt;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 212:    */   {
/* 213:218 */     this.needEncrypt = needEncrypt;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public AlipayObject getBizModel()
/* 217:    */   {
/* 218:223 */     return this.bizModel;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setBizModel(AlipayObject bizModel)
/* 222:    */   {
/* 223:229 */     this.bizModel = bizModel;
/* 224:    */   }
/* 225:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayAcquireRefundRequest
 * JD-Core Version:    0.7.0.1
 */