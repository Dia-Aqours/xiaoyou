/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayTransferThirdpartyBillCreateResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayTransferThirdpartyBillCreateRequest
/*  10:    */   implements AlipayRequest<AlipayTransferThirdpartyBillCreateResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String amount;
/*  15:    */   private String currency;
/*  16:    */   private String extParam;
/*  17:    */   private String memo;
/*  18:    */   private String partnerId;
/*  19:    */   private String payeeAccount;
/*  20:    */   private String payeeType;
/*  21:    */   private String payerAccount;
/*  22:    */   private String payerType;
/*  23:    */   private String paymentId;
/*  24:    */   private String paymentSource;
/*  25:    */   private String title;
/*  26:    */   private String terminalType;
/*  27:    */   private String terminalInfo;
/*  28:    */   private String prodCode;
/*  29:    */   private String notifyUrl;
/*  30:    */   private String returnUrl;
/*  31:    */   
/*  32:    */   public void setAmount(String amount)
/*  33:    */   {
/*  34: 89 */     this.amount = amount;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getAmount()
/*  38:    */   {
/*  39: 92 */     return this.amount;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setCurrency(String currency)
/*  43:    */   {
/*  44: 96 */     this.currency = currency;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getCurrency()
/*  48:    */   {
/*  49: 99 */     return this.currency;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setExtParam(String extParam)
/*  53:    */   {
/*  54:103 */     this.extParam = extParam;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getExtParam()
/*  58:    */   {
/*  59:106 */     return this.extParam;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setMemo(String memo)
/*  63:    */   {
/*  64:110 */     this.memo = memo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getMemo()
/*  68:    */   {
/*  69:113 */     return this.memo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setPartnerId(String partnerId)
/*  73:    */   {
/*  74:117 */     this.partnerId = partnerId;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getPartnerId()
/*  78:    */   {
/*  79:120 */     return this.partnerId;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setPayeeAccount(String payeeAccount)
/*  83:    */   {
/*  84:124 */     this.payeeAccount = payeeAccount;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getPayeeAccount()
/*  88:    */   {
/*  89:127 */     return this.payeeAccount;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setPayeeType(String payeeType)
/*  93:    */   {
/*  94:131 */     this.payeeType = payeeType;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getPayeeType()
/*  98:    */   {
/*  99:134 */     return this.payeeType;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setPayerAccount(String payerAccount)
/* 103:    */   {
/* 104:138 */     this.payerAccount = payerAccount;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getPayerAccount()
/* 108:    */   {
/* 109:141 */     return this.payerAccount;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setPayerType(String payerType)
/* 113:    */   {
/* 114:145 */     this.payerType = payerType;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getPayerType()
/* 118:    */   {
/* 119:148 */     return this.payerType;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setPaymentId(String paymentId)
/* 123:    */   {
/* 124:152 */     this.paymentId = paymentId;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getPaymentId()
/* 128:    */   {
/* 129:155 */     return this.paymentId;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setPaymentSource(String paymentSource)
/* 133:    */   {
/* 134:159 */     this.paymentSource = paymentSource;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getPaymentSource()
/* 138:    */   {
/* 139:162 */     return this.paymentSource;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setTitle(String title)
/* 143:    */   {
/* 144:166 */     this.title = title;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getTitle()
/* 148:    */   {
/* 149:169 */     return this.title;
/* 150:    */   }
/* 151:    */   
/* 152:176 */   private boolean needEncrypt = false;
/* 153:177 */   private AlipayObject bizModel = null;
/* 154:    */   
/* 155:    */   public String getNotifyUrl()
/* 156:    */   {
/* 157:180 */     return this.notifyUrl;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void setNotifyUrl(String notifyUrl)
/* 161:    */   {
/* 162:184 */     this.notifyUrl = notifyUrl;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public String getReturnUrl()
/* 166:    */   {
/* 167:188 */     return this.returnUrl;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setReturnUrl(String returnUrl)
/* 171:    */   {
/* 172:192 */     this.returnUrl = returnUrl;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getApiVersion()
/* 176:    */   {
/* 177:196 */     return this.apiVersion;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setApiVersion(String apiVersion)
/* 181:    */   {
/* 182:200 */     this.apiVersion = apiVersion;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setTerminalType(String terminalType)
/* 186:    */   {
/* 187:204 */     this.terminalType = terminalType;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getTerminalType()
/* 191:    */   {
/* 192:208 */     return this.terminalType;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setTerminalInfo(String terminalInfo)
/* 196:    */   {
/* 197:212 */     this.terminalInfo = terminalInfo;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getTerminalInfo()
/* 201:    */   {
/* 202:216 */     return this.terminalInfo;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setProdCode(String prodCode)
/* 206:    */   {
/* 207:220 */     this.prodCode = prodCode;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getProdCode()
/* 211:    */   {
/* 212:224 */     return this.prodCode;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public String getApiMethodName()
/* 216:    */   {
/* 217:228 */     return "alipay.transfer.thirdparty.bill.create";
/* 218:    */   }
/* 219:    */   
/* 220:    */   public Map<String, String> getTextParams()
/* 221:    */   {
/* 222:232 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 223:233 */     txtParams.put("amount", this.amount);
/* 224:234 */     txtParams.put("currency", this.currency);
/* 225:235 */     txtParams.put("ext_param", this.extParam);
/* 226:236 */     txtParams.put("memo", this.memo);
/* 227:237 */     txtParams.put("partner_id", this.partnerId);
/* 228:238 */     txtParams.put("payee_account", this.payeeAccount);
/* 229:239 */     txtParams.put("payee_type", this.payeeType);
/* 230:240 */     txtParams.put("payer_account", this.payerAccount);
/* 231:241 */     txtParams.put("payer_type", this.payerType);
/* 232:242 */     txtParams.put("payment_id", this.paymentId);
/* 233:243 */     txtParams.put("payment_source", this.paymentSource);
/* 234:244 */     txtParams.put("title", this.title);
/* 235:245 */     if (this.udfParams != null) {
/* 236:246 */       txtParams.putAll(this.udfParams);
/* 237:    */     }
/* 238:248 */     return txtParams;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void putOtherTextParam(String key, String value)
/* 242:    */   {
/* 243:252 */     if (this.udfParams == null) {
/* 244:253 */       this.udfParams = new AlipayHashMap();
/* 245:    */     }
/* 246:255 */     this.udfParams.put(key, value);
/* 247:    */   }
/* 248:    */   
/* 249:    */   public Class<AlipayTransferThirdpartyBillCreateResponse> getResponseClass()
/* 250:    */   {
/* 251:259 */     return AlipayTransferThirdpartyBillCreateResponse.class;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public boolean isNeedEncrypt()
/* 255:    */   {
/* 256:265 */     return this.needEncrypt;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 260:    */   {
/* 261:271 */     this.needEncrypt = needEncrypt;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public AlipayObject getBizModel()
/* 265:    */   {
/* 266:276 */     return this.bizModel;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setBizModel(AlipayObject bizModel)
/* 270:    */   {
/* 271:282 */     this.bizModel = bizModel;
/* 272:    */   }
/* 273:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayTransferThirdpartyBillCreateRequest

 * JD-Core Version:    0.7.0.1

 */