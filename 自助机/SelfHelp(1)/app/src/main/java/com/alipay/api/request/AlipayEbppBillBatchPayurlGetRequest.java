/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEbppBillBatchPayurlGetResponse;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayEbppBillBatchPayurlGetRequest
/*  11:    */   implements AlipayRequest<AlipayEbppBillBatchPayurlGetResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private String callbackUrl;
/*  16:    */   private String orderType;
/*  17:    */   private List<String> payBillList;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   private String returnUrl;
/*  23:    */   
/*  24:    */   public void setCallbackUrl(String callbackUrl)
/*  25:    */   {
/*  26: 38 */     this.callbackUrl = callbackUrl;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getCallbackUrl()
/*  30:    */   {
/*  31: 41 */     return this.callbackUrl;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setOrderType(String orderType)
/*  35:    */   {
/*  36: 45 */     this.orderType = orderType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getOrderType()
/*  40:    */   {
/*  41: 48 */     return this.orderType;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setPayBillList(List<String> payBillList)
/*  45:    */   {
/*  46: 52 */     this.payBillList = payBillList;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public List<String> getPayBillList()
/*  50:    */   {
/*  51: 55 */     return this.payBillList;
/*  52:    */   }
/*  53:    */   
/*  54: 62 */   private boolean needEncrypt = false;
/*  55: 63 */   private AlipayObject bizModel = null;
/*  56:    */   
/*  57:    */   public String getNotifyUrl()
/*  58:    */   {
/*  59: 66 */     return this.notifyUrl;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setNotifyUrl(String notifyUrl)
/*  63:    */   {
/*  64: 70 */     this.notifyUrl = notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getReturnUrl()
/*  68:    */   {
/*  69: 74 */     return this.returnUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setReturnUrl(String returnUrl)
/*  73:    */   {
/*  74: 78 */     this.returnUrl = returnUrl;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getApiVersion()
/*  78:    */   {
/*  79: 82 */     return this.apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setApiVersion(String apiVersion)
/*  83:    */   {
/*  84: 86 */     this.apiVersion = apiVersion;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setTerminalType(String terminalType)
/*  88:    */   {
/*  89: 90 */     this.terminalType = terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getTerminalType()
/*  93:    */   {
/*  94: 94 */     return this.terminalType;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setTerminalInfo(String terminalInfo)
/*  98:    */   {
/*  99: 98 */     this.terminalInfo = terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTerminalInfo()
/* 103:    */   {
/* 104:102 */     return this.terminalInfo;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setProdCode(String prodCode)
/* 108:    */   {
/* 109:106 */     this.prodCode = prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getProdCode()
/* 113:    */   {
/* 114:110 */     return this.prodCode;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getApiMethodName()
/* 118:    */   {
/* 119:114 */     return "alipay.ebpp.bill.batch.payurl.get";
/* 120:    */   }
/* 121:    */   
/* 122:    */   public Map<String, String> getTextParams()
/* 123:    */   {
/* 124:118 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 125:119 */     txtParams.put("callback_url", this.callbackUrl);
/* 126:120 */     txtParams.put("order_type", this.orderType);
/* 127:121 */     txtParams.put("pay_bill_list", this.payBillList);
/* 128:122 */     if (this.udfParams != null) {
/* 129:123 */       txtParams.putAll(this.udfParams);
/* 130:    */     }
/* 131:125 */     return txtParams;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void putOtherTextParam(String key, String value)
/* 135:    */   {
/* 136:129 */     if (this.udfParams == null) {
/* 137:130 */       this.udfParams = new AlipayHashMap();
/* 138:    */     }
/* 139:132 */     this.udfParams.put(key, value);
/* 140:    */   }
/* 141:    */   
/* 142:    */   public Class<AlipayEbppBillBatchPayurlGetResponse> getResponseClass()
/* 143:    */   {
/* 144:136 */     return AlipayEbppBillBatchPayurlGetResponse.class;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean isNeedEncrypt()
/* 148:    */   {
/* 149:142 */     return this.needEncrypt;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 153:    */   {
/* 154:148 */     this.needEncrypt = needEncrypt;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public AlipayObject getBizModel()
/* 158:    */   {
/* 159:153 */     return this.bizModel;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setBizModel(AlipayObject bizModel)
/* 163:    */   {
/* 164:159 */     this.bizModel = bizModel;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayEbppBillBatchPayurlGetRequest
 * JD-Core Version:    0.7.0.1
 */