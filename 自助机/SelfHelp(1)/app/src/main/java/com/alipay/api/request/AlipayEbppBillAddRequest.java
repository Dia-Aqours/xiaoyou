/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEbppBillAddResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEbppBillAddRequest
/*  10:    */   implements AlipayRequest<AlipayEbppBillAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String bankBillNo;
/*  15:    */   private String billDate;
/*  16:    */   private String billKey;
/*  17:    */   private String chargeInst;
/*  18:    */   private String extendField;
/*  19:    */   private String merchantOrderNo;
/*  20:    */   private String mobile;
/*  21:    */   private String orderType;
/*  22:    */   private String ownerName;
/*  23:    */   private String payAmount;
/*  24:    */   private String serviceAmount;
/*  25:    */   private String subOrderType;
/*  26:    */   private String trafficLocation;
/*  27:    */   private String trafficRegulations;
/*  28:    */   private String terminalType;
/*  29:    */   private String terminalInfo;
/*  30:    */   private String prodCode;
/*  31:    */   private String notifyUrl;
/*  32:    */   private String returnUrl;
/*  33:    */   
/*  34:    */   public void setBankBillNo(String bankBillNo)
/*  35:    */   {
/*  36: 92 */     this.bankBillNo = bankBillNo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getBankBillNo()
/*  40:    */   {
/*  41: 95 */     return this.bankBillNo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setBillDate(String billDate)
/*  45:    */   {
/*  46: 99 */     this.billDate = billDate;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getBillDate()
/*  50:    */   {
/*  51:102 */     return this.billDate;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setBillKey(String billKey)
/*  55:    */   {
/*  56:106 */     this.billKey = billKey;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getBillKey()
/*  60:    */   {
/*  61:109 */     return this.billKey;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setChargeInst(String chargeInst)
/*  65:    */   {
/*  66:113 */     this.chargeInst = chargeInst;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getChargeInst()
/*  70:    */   {
/*  71:116 */     return this.chargeInst;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setExtendField(String extendField)
/*  75:    */   {
/*  76:120 */     this.extendField = extendField;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getExtendField()
/*  80:    */   {
/*  81:123 */     return this.extendField;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  85:    */   {
/*  86:127 */     this.merchantOrderNo = merchantOrderNo;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getMerchantOrderNo()
/*  90:    */   {
/*  91:130 */     return this.merchantOrderNo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setMobile(String mobile)
/*  95:    */   {
/*  96:134 */     this.mobile = mobile;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getMobile()
/* 100:    */   {
/* 101:137 */     return this.mobile;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setOrderType(String orderType)
/* 105:    */   {
/* 106:141 */     this.orderType = orderType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getOrderType()
/* 110:    */   {
/* 111:144 */     return this.orderType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setOwnerName(String ownerName)
/* 115:    */   {
/* 116:148 */     this.ownerName = ownerName;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getOwnerName()
/* 120:    */   {
/* 121:151 */     return this.ownerName;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setPayAmount(String payAmount)
/* 125:    */   {
/* 126:155 */     this.payAmount = payAmount;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getPayAmount()
/* 130:    */   {
/* 131:158 */     return this.payAmount;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setServiceAmount(String serviceAmount)
/* 135:    */   {
/* 136:162 */     this.serviceAmount = serviceAmount;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getServiceAmount()
/* 140:    */   {
/* 141:165 */     return this.serviceAmount;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setSubOrderType(String subOrderType)
/* 145:    */   {
/* 146:169 */     this.subOrderType = subOrderType;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getSubOrderType()
/* 150:    */   {
/* 151:172 */     return this.subOrderType;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setTrafficLocation(String trafficLocation)
/* 155:    */   {
/* 156:176 */     this.trafficLocation = trafficLocation;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getTrafficLocation()
/* 160:    */   {
/* 161:179 */     return this.trafficLocation;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setTrafficRegulations(String trafficRegulations)
/* 165:    */   {
/* 166:183 */     this.trafficRegulations = trafficRegulations;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getTrafficRegulations()
/* 170:    */   {
/* 171:186 */     return this.trafficRegulations;
/* 172:    */   }
/* 173:    */   
/* 174:193 */   private boolean needEncrypt = false;
/* 175:194 */   private AlipayObject bizModel = null;
/* 176:    */   
/* 177:    */   public String getNotifyUrl()
/* 178:    */   {
/* 179:197 */     return this.notifyUrl;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setNotifyUrl(String notifyUrl)
/* 183:    */   {
/* 184:201 */     this.notifyUrl = notifyUrl;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getReturnUrl()
/* 188:    */   {
/* 189:205 */     return this.returnUrl;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setReturnUrl(String returnUrl)
/* 193:    */   {
/* 194:209 */     this.returnUrl = returnUrl;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getApiVersion()
/* 198:    */   {
/* 199:213 */     return this.apiVersion;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setApiVersion(String apiVersion)
/* 203:    */   {
/* 204:217 */     this.apiVersion = apiVersion;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void setTerminalType(String terminalType)
/* 208:    */   {
/* 209:221 */     this.terminalType = terminalType;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public String getTerminalType()
/* 213:    */   {
/* 214:225 */     return this.terminalType;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void setTerminalInfo(String terminalInfo)
/* 218:    */   {
/* 219:229 */     this.terminalInfo = terminalInfo;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String getTerminalInfo()
/* 223:    */   {
/* 224:233 */     return this.terminalInfo;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void setProdCode(String prodCode)
/* 228:    */   {
/* 229:237 */     this.prodCode = prodCode;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public String getProdCode()
/* 233:    */   {
/* 234:241 */     return this.prodCode;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getApiMethodName()
/* 238:    */   {
/* 239:245 */     return "alipay.ebpp.bill.add";
/* 240:    */   }
/* 241:    */   
/* 242:    */   public Map<String, String> getTextParams()
/* 243:    */   {
/* 244:249 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 245:250 */     txtParams.put("bank_bill_no", this.bankBillNo);
/* 246:251 */     txtParams.put("bill_date", this.billDate);
/* 247:252 */     txtParams.put("bill_key", this.billKey);
/* 248:253 */     txtParams.put("charge_inst", this.chargeInst);
/* 249:254 */     txtParams.put("extend_field", this.extendField);
/* 250:255 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 251:256 */     txtParams.put("mobile", this.mobile);
/* 252:257 */     txtParams.put("order_type", this.orderType);
/* 253:258 */     txtParams.put("owner_name", this.ownerName);
/* 254:259 */     txtParams.put("pay_amount", this.payAmount);
/* 255:260 */     txtParams.put("service_amount", this.serviceAmount);
/* 256:261 */     txtParams.put("sub_order_type", this.subOrderType);
/* 257:262 */     txtParams.put("traffic_location", this.trafficLocation);
/* 258:263 */     txtParams.put("traffic_regulations", this.trafficRegulations);
/* 259:264 */     if (this.udfParams != null) {
/* 260:265 */       txtParams.putAll(this.udfParams);
/* 261:    */     }
/* 262:267 */     return txtParams;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void putOtherTextParam(String key, String value)
/* 266:    */   {
/* 267:271 */     if (this.udfParams == null) {
/* 268:272 */       this.udfParams = new AlipayHashMap();
/* 269:    */     }
/* 270:274 */     this.udfParams.put(key, value);
/* 271:    */   }
/* 272:    */   
/* 273:    */   public Class<AlipayEbppBillAddResponse> getResponseClass()
/* 274:    */   {
/* 275:278 */     return AlipayEbppBillAddResponse.class;
/* 276:    */   }
/* 277:    */   
/* 278:    */   public boolean isNeedEncrypt()
/* 279:    */   {
/* 280:284 */     return this.needEncrypt;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 284:    */   {
/* 285:290 */     this.needEncrypt = needEncrypt;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public AlipayObject getBizModel()
/* 289:    */   {
/* 290:295 */     return this.bizModel;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void setBizModel(AlipayObject bizModel)
/* 294:    */   {
/* 295:301 */     this.bizModel = bizModel;
/* 296:    */   }
/* 297:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayEbppBillAddRequest
 * JD-Core Version:    0.7.0.1
 */