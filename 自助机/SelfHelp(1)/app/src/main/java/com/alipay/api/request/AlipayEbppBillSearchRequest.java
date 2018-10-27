/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEbppBillSearchResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayEbppBillSearchRequest
/*  10:    */   implements AlipayRequest<AlipayEbppBillSearchResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String billKey;
/*  15:    */   private String chargeInst;
/*  16:    */   private String chargeoffInst;
/*  17:    */   private String companyId;
/*  18:    */   private String extend;
/*  19:    */   private String orderType;
/*  20:    */   private String subOrderType;
/*  21:    */   private String terminalType;
/*  22:    */   private String terminalInfo;
/*  23:    */   private String prodCode;
/*  24:    */   private String notifyUrl;
/*  25:    */   private String returnUrl;
/*  26:    */   
/*  27:    */   public void setBillKey(String billKey)
/*  28:    */   {
/*  29: 58 */     this.billKey = billKey;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getBillKey()
/*  33:    */   {
/*  34: 61 */     return this.billKey;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setChargeInst(String chargeInst)
/*  38:    */   {
/*  39: 65 */     this.chargeInst = chargeInst;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getChargeInst()
/*  43:    */   {
/*  44: 68 */     return this.chargeInst;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setChargeoffInst(String chargeoffInst)
/*  48:    */   {
/*  49: 72 */     this.chargeoffInst = chargeoffInst;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getChargeoffInst()
/*  53:    */   {
/*  54: 75 */     return this.chargeoffInst;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setCompanyId(String companyId)
/*  58:    */   {
/*  59: 79 */     this.companyId = companyId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getCompanyId()
/*  63:    */   {
/*  64: 82 */     return this.companyId;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setExtend(String extend)
/*  68:    */   {
/*  69: 86 */     this.extend = extend;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getExtend()
/*  73:    */   {
/*  74: 89 */     return this.extend;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setOrderType(String orderType)
/*  78:    */   {
/*  79: 93 */     this.orderType = orderType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getOrderType()
/*  83:    */   {
/*  84: 96 */     return this.orderType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setSubOrderType(String subOrderType)
/*  88:    */   {
/*  89:100 */     this.subOrderType = subOrderType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getSubOrderType()
/*  93:    */   {
/*  94:103 */     return this.subOrderType;
/*  95:    */   }
/*  96:    */   
/*  97:110 */   private boolean needEncrypt = false;
/*  98:111 */   private AlipayObject bizModel = null;
/*  99:    */   
/* 100:    */   public String getNotifyUrl()
/* 101:    */   {
/* 102:114 */     return this.notifyUrl;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setNotifyUrl(String notifyUrl)
/* 106:    */   {
/* 107:118 */     this.notifyUrl = notifyUrl;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getReturnUrl()
/* 111:    */   {
/* 112:122 */     return this.returnUrl;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setReturnUrl(String returnUrl)
/* 116:    */   {
/* 117:126 */     this.returnUrl = returnUrl;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getApiVersion()
/* 121:    */   {
/* 122:130 */     return this.apiVersion;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setApiVersion(String apiVersion)
/* 126:    */   {
/* 127:134 */     this.apiVersion = apiVersion;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setTerminalType(String terminalType)
/* 131:    */   {
/* 132:138 */     this.terminalType = terminalType;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getTerminalType()
/* 136:    */   {
/* 137:142 */     return this.terminalType;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setTerminalInfo(String terminalInfo)
/* 141:    */   {
/* 142:146 */     this.terminalInfo = terminalInfo;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getTerminalInfo()
/* 146:    */   {
/* 147:150 */     return this.terminalInfo;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setProdCode(String prodCode)
/* 151:    */   {
/* 152:154 */     this.prodCode = prodCode;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getProdCode()
/* 156:    */   {
/* 157:158 */     return this.prodCode;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getApiMethodName()
/* 161:    */   {
/* 162:162 */     return "alipay.ebpp.bill.search";
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Map<String, String> getTextParams()
/* 166:    */   {
/* 167:166 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 168:167 */     txtParams.put("bill_key", this.billKey);
/* 169:168 */     txtParams.put("charge_inst", this.chargeInst);
/* 170:169 */     txtParams.put("chargeoff_inst", this.chargeoffInst);
/* 171:170 */     txtParams.put("company_id", this.companyId);
/* 172:171 */     txtParams.put("extend", this.extend);
/* 173:172 */     txtParams.put("order_type", this.orderType);
/* 174:173 */     txtParams.put("sub_order_type", this.subOrderType);
/* 175:174 */     if (this.udfParams != null) {
/* 176:175 */       txtParams.putAll(this.udfParams);
/* 177:    */     }
/* 178:177 */     return txtParams;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void putOtherTextParam(String key, String value)
/* 182:    */   {
/* 183:181 */     if (this.udfParams == null) {
/* 184:182 */       this.udfParams = new AlipayHashMap();
/* 185:    */     }
/* 186:184 */     this.udfParams.put(key, value);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public Class<AlipayEbppBillSearchResponse> getResponseClass()
/* 190:    */   {
/* 191:188 */     return AlipayEbppBillSearchResponse.class;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public boolean isNeedEncrypt()
/* 195:    */   {
/* 196:194 */     return this.needEncrypt;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 200:    */   {
/* 201:200 */     this.needEncrypt = needEncrypt;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public AlipayObject getBizModel()
/* 205:    */   {
/* 206:205 */     return this.bizModel;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setBizModel(AlipayObject bizModel)
/* 210:    */   {
/* 211:211 */     this.bizModel = bizModel;
/* 212:    */   }
/* 213:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayEbppBillSearchRequest

 * JD-Core Version:    0.7.0.1

 */