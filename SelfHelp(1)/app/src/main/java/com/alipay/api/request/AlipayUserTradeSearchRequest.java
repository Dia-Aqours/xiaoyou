/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayUserTradeSearchResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayUserTradeSearchRequest
/*  10:    */   implements AlipayRequest<AlipayUserTradeSearchResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String alipayOrderNo;
/*  15:    */   private String endTime;
/*  16:    */   private String merchantOrderNo;
/*  17:    */   private String orderFrom;
/*  18:    */   private String orderStatus;
/*  19:    */   private String orderType;
/*  20:    */   private String pageNo;
/*  21:    */   private String pageSize;
/*  22:    */   private String startTime;
/*  23:    */   private String terminalType;
/*  24:    */   private String terminalInfo;
/*  25:    */   private String prodCode;
/*  26:    */   private String notifyUrl;
/*  27:    */   private String returnUrl;
/*  28:    */   
/*  29:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  30:    */   {
/*  31: 67 */     this.alipayOrderNo = alipayOrderNo;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String getAlipayOrderNo()
/*  35:    */   {
/*  36: 70 */     return this.alipayOrderNo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setEndTime(String endTime)
/*  40:    */   {
/*  41: 74 */     this.endTime = endTime;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getEndTime()
/*  45:    */   {
/*  46: 77 */     return this.endTime;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  50:    */   {
/*  51: 81 */     this.merchantOrderNo = merchantOrderNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getMerchantOrderNo()
/*  55:    */   {
/*  56: 84 */     return this.merchantOrderNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setOrderFrom(String orderFrom)
/*  60:    */   {
/*  61: 88 */     this.orderFrom = orderFrom;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getOrderFrom()
/*  65:    */   {
/*  66: 91 */     return this.orderFrom;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setOrderStatus(String orderStatus)
/*  70:    */   {
/*  71: 95 */     this.orderStatus = orderStatus;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getOrderStatus()
/*  75:    */   {
/*  76: 98 */     return this.orderStatus;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setOrderType(String orderType)
/*  80:    */   {
/*  81:102 */     this.orderType = orderType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getOrderType()
/*  85:    */   {
/*  86:105 */     return this.orderType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setPageNo(String pageNo)
/*  90:    */   {
/*  91:109 */     this.pageNo = pageNo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getPageNo()
/*  95:    */   {
/*  96:112 */     return this.pageNo;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setPageSize(String pageSize)
/* 100:    */   {
/* 101:116 */     this.pageSize = pageSize;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getPageSize()
/* 105:    */   {
/* 106:119 */     return this.pageSize;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setStartTime(String startTime)
/* 110:    */   {
/* 111:123 */     this.startTime = startTime;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getStartTime()
/* 115:    */   {
/* 116:126 */     return this.startTime;
/* 117:    */   }
/* 118:    */   
/* 119:133 */   private boolean needEncrypt = false;
/* 120:134 */   private AlipayObject bizModel = null;
/* 121:    */   
/* 122:    */   public String getNotifyUrl()
/* 123:    */   {
/* 124:137 */     return this.notifyUrl;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setNotifyUrl(String notifyUrl)
/* 128:    */   {
/* 129:141 */     this.notifyUrl = notifyUrl;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getReturnUrl()
/* 133:    */   {
/* 134:145 */     return this.returnUrl;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setReturnUrl(String returnUrl)
/* 138:    */   {
/* 139:149 */     this.returnUrl = returnUrl;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getApiVersion()
/* 143:    */   {
/* 144:153 */     return this.apiVersion;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setApiVersion(String apiVersion)
/* 148:    */   {
/* 149:157 */     this.apiVersion = apiVersion;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTerminalType(String terminalType)
/* 153:    */   {
/* 154:161 */     this.terminalType = terminalType;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getTerminalType()
/* 158:    */   {
/* 159:165 */     return this.terminalType;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setTerminalInfo(String terminalInfo)
/* 163:    */   {
/* 164:169 */     this.terminalInfo = terminalInfo;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getTerminalInfo()
/* 168:    */   {
/* 169:173 */     return this.terminalInfo;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setProdCode(String prodCode)
/* 173:    */   {
/* 174:177 */     this.prodCode = prodCode;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getProdCode()
/* 178:    */   {
/* 179:181 */     return this.prodCode;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getApiMethodName()
/* 183:    */   {
/* 184:185 */     return "alipay.user.trade.search";
/* 185:    */   }
/* 186:    */   
/* 187:    */   public Map<String, String> getTextParams()
/* 188:    */   {
/* 189:189 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 190:190 */     txtParams.put("alipay_order_no", this.alipayOrderNo);
/* 191:191 */     txtParams.put("end_time", this.endTime);
/* 192:192 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 193:193 */     txtParams.put("order_from", this.orderFrom);
/* 194:194 */     txtParams.put("order_status", this.orderStatus);
/* 195:195 */     txtParams.put("order_type", this.orderType);
/* 196:196 */     txtParams.put("page_no", this.pageNo);
/* 197:197 */     txtParams.put("page_size", this.pageSize);
/* 198:198 */     txtParams.put("start_time", this.startTime);
/* 199:199 */     if (this.udfParams != null) {
/* 200:200 */       txtParams.putAll(this.udfParams);
/* 201:    */     }
/* 202:202 */     return txtParams;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void putOtherTextParam(String key, String value)
/* 206:    */   {
/* 207:206 */     if (this.udfParams == null) {
/* 208:207 */       this.udfParams = new AlipayHashMap();
/* 209:    */     }
/* 210:209 */     this.udfParams.put(key, value);
/* 211:    */   }
/* 212:    */   
/* 213:    */   public Class<AlipayUserTradeSearchResponse> getResponseClass()
/* 214:    */   {
/* 215:213 */     return AlipayUserTradeSearchResponse.class;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public boolean isNeedEncrypt()
/* 219:    */   {
/* 220:219 */     return this.needEncrypt;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 224:    */   {
/* 225:225 */     this.needEncrypt = needEncrypt;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public AlipayObject getBizModel()
/* 229:    */   {
/* 230:230 */     return this.bizModel;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void setBizModel(AlipayObject bizModel)
/* 234:    */   {
/* 235:236 */     this.bizModel = bizModel;
/* 236:    */   }
/* 237:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayUserTradeSearchRequest
 * JD-Core Version:    0.7.0.1
 */