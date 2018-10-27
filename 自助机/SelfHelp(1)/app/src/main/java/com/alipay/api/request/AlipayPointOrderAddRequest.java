/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPointOrderAddResponse;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayPointOrderAddRequest
/*  11:    */   implements AlipayRequest<AlipayPointOrderAddResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private String memo;
/*  16:    */   private String merchantOrderNo;
/*  17:    */   private Date orderTime;
/*  18:    */   private Long pointCount;
/*  19:    */   private String userSymbol;
/*  20:    */   private String userSymbolType;
/*  21:    */   private String terminalType;
/*  22:    */   private String terminalInfo;
/*  23:    */   private String prodCode;
/*  24:    */   private String notifyUrl;
/*  25:    */   private String returnUrl;
/*  26:    */   
/*  27:    */   public void setMemo(String memo)
/*  28:    */   {
/*  29: 53 */     this.memo = memo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getMemo()
/*  33:    */   {
/*  34: 56 */     return this.memo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  38:    */   {
/*  39: 60 */     this.merchantOrderNo = merchantOrderNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getMerchantOrderNo()
/*  43:    */   {
/*  44: 63 */     return this.merchantOrderNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setOrderTime(Date orderTime)
/*  48:    */   {
/*  49: 67 */     this.orderTime = orderTime;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public Date getOrderTime()
/*  53:    */   {
/*  54: 70 */     return this.orderTime;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setPointCount(Long pointCount)
/*  58:    */   {
/*  59: 74 */     this.pointCount = pointCount;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public Long getPointCount()
/*  63:    */   {
/*  64: 77 */     return this.pointCount;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setUserSymbol(String userSymbol)
/*  68:    */   {
/*  69: 81 */     this.userSymbol = userSymbol;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getUserSymbol()
/*  73:    */   {
/*  74: 84 */     return this.userSymbol;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setUserSymbolType(String userSymbolType)
/*  78:    */   {
/*  79: 88 */     this.userSymbolType = userSymbolType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getUserSymbolType()
/*  83:    */   {
/*  84: 91 */     return this.userSymbolType;
/*  85:    */   }
/*  86:    */   
/*  87: 98 */   private boolean needEncrypt = false;
/*  88: 99 */   private AlipayObject bizModel = null;
/*  89:    */   
/*  90:    */   public String getNotifyUrl()
/*  91:    */   {
/*  92:102 */     return this.notifyUrl;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setNotifyUrl(String notifyUrl)
/*  96:    */   {
/*  97:106 */     this.notifyUrl = notifyUrl;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getReturnUrl()
/* 101:    */   {
/* 102:110 */     return this.returnUrl;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setReturnUrl(String returnUrl)
/* 106:    */   {
/* 107:114 */     this.returnUrl = returnUrl;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getApiVersion()
/* 111:    */   {
/* 112:118 */     return this.apiVersion;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setApiVersion(String apiVersion)
/* 116:    */   {
/* 117:122 */     this.apiVersion = apiVersion;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setTerminalType(String terminalType)
/* 121:    */   {
/* 122:126 */     this.terminalType = terminalType;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getTerminalType()
/* 126:    */   {
/* 127:130 */     return this.terminalType;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setTerminalInfo(String terminalInfo)
/* 131:    */   {
/* 132:134 */     this.terminalInfo = terminalInfo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getTerminalInfo()
/* 136:    */   {
/* 137:138 */     return this.terminalInfo;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setProdCode(String prodCode)
/* 141:    */   {
/* 142:142 */     this.prodCode = prodCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getProdCode()
/* 146:    */   {
/* 147:146 */     return this.prodCode;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getApiMethodName()
/* 151:    */   {
/* 152:150 */     return "alipay.point.order.add";
/* 153:    */   }
/* 154:    */   
/* 155:    */   public Map<String, String> getTextParams()
/* 156:    */   {
/* 157:154 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 158:155 */     txtParams.put("memo", this.memo);
/* 159:156 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 160:157 */     txtParams.put("order_time", this.orderTime);
/* 161:158 */     txtParams.put("point_count", this.pointCount);
/* 162:159 */     txtParams.put("user_symbol", this.userSymbol);
/* 163:160 */     txtParams.put("user_symbol_type", this.userSymbolType);
/* 164:161 */     if (this.udfParams != null) {
/* 165:162 */       txtParams.putAll(this.udfParams);
/* 166:    */     }
/* 167:164 */     return txtParams;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void putOtherTextParam(String key, String value)
/* 171:    */   {
/* 172:168 */     if (this.udfParams == null) {
/* 173:169 */       this.udfParams = new AlipayHashMap();
/* 174:    */     }
/* 175:171 */     this.udfParams.put(key, value);
/* 176:    */   }
/* 177:    */   
/* 178:    */   public Class<AlipayPointOrderAddResponse> getResponseClass()
/* 179:    */   {
/* 180:175 */     return AlipayPointOrderAddResponse.class;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public boolean isNeedEncrypt()
/* 184:    */   {
/* 185:181 */     return this.needEncrypt;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 189:    */   {
/* 190:187 */     this.needEncrypt = needEncrypt;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public AlipayObject getBizModel()
/* 194:    */   {
/* 195:192 */     return this.bizModel;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setBizModel(AlipayObject bizModel)
/* 199:    */   {
/* 200:198 */     this.bizModel = bizModel;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPointOrderAddRequest
 * JD-Core Version:    0.7.0.1
 */