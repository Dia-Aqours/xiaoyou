/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayDataBillDownloadurlGetResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayDataBillDownloadurlGetRequest
/*  10:    */   implements AlipayRequest<AlipayDataBillDownloadurlGetResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String billDate;
/*  15:    */   private String billType;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   private String returnUrl;
/*  21:    */   
/*  22:    */   public void setBillDate(String billDate)
/*  23:    */   {
/*  24: 32 */     this.billDate = billDate;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getBillDate()
/*  28:    */   {
/*  29: 35 */     return this.billDate;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setBillType(String billType)
/*  33:    */   {
/*  34: 39 */     this.billType = billType;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getBillType()
/*  38:    */   {
/*  39: 42 */     return this.billType;
/*  40:    */   }
/*  41:    */   
/*  42: 49 */   private boolean needEncrypt = false;
/*  43: 50 */   private AlipayObject bizModel = null;
/*  44:    */   
/*  45:    */   public String getNotifyUrl()
/*  46:    */   {
/*  47: 53 */     return this.notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setNotifyUrl(String notifyUrl)
/*  51:    */   {
/*  52: 57 */     this.notifyUrl = notifyUrl;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getReturnUrl()
/*  56:    */   {
/*  57: 61 */     return this.returnUrl;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setReturnUrl(String returnUrl)
/*  61:    */   {
/*  62: 65 */     this.returnUrl = returnUrl;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getApiVersion()
/*  66:    */   {
/*  67: 69 */     return this.apiVersion;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setApiVersion(String apiVersion)
/*  71:    */   {
/*  72: 73 */     this.apiVersion = apiVersion;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setTerminalType(String terminalType)
/*  76:    */   {
/*  77: 77 */     this.terminalType = terminalType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getTerminalType()
/*  81:    */   {
/*  82: 81 */     return this.terminalType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setTerminalInfo(String terminalInfo)
/*  86:    */   {
/*  87: 85 */     this.terminalInfo = terminalInfo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getTerminalInfo()
/*  91:    */   {
/*  92: 89 */     return this.terminalInfo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setProdCode(String prodCode)
/*  96:    */   {
/*  97: 93 */     this.prodCode = prodCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getProdCode()
/* 101:    */   {
/* 102: 97 */     return this.prodCode;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiMethodName()
/* 106:    */   {
/* 107:101 */     return "alipay.data.bill.downloadurl.get";
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Map<String, String> getTextParams()
/* 111:    */   {
/* 112:105 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 113:106 */     txtParams.put("bill_date", this.billDate);
/* 114:107 */     txtParams.put("bill_type", this.billType);
/* 115:108 */     if (this.udfParams != null) {
/* 116:109 */       txtParams.putAll(this.udfParams);
/* 117:    */     }
/* 118:111 */     return txtParams;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void putOtherTextParam(String key, String value)
/* 122:    */   {
/* 123:115 */     if (this.udfParams == null) {
/* 124:116 */       this.udfParams = new AlipayHashMap();
/* 125:    */     }
/* 126:118 */     this.udfParams.put(key, value);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Class<AlipayDataBillDownloadurlGetResponse> getResponseClass()
/* 130:    */   {
/* 131:122 */     return AlipayDataBillDownloadurlGetResponse.class;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public boolean isNeedEncrypt()
/* 135:    */   {
/* 136:128 */     return this.needEncrypt;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 140:    */   {
/* 141:134 */     this.needEncrypt = needEncrypt;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public AlipayObject getBizModel()
/* 145:    */   {
/* 146:139 */     return this.bizModel;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setBizModel(AlipayObject bizModel)
/* 150:    */   {
/* 151:145 */     this.bizModel = bizModel;
/* 152:    */   }
/* 153:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayDataBillDownloadurlGetRequest

 * JD-Core Version:    0.7.0.1

 */