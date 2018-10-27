/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassSyncAddResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassSyncAddRequest
/*  10:    */   implements AlipayRequest<AlipayPassSyncAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String fileContent;
/*  15:    */   private String outTradeNo;
/*  16:    */   private String partnerId;
/*  17:    */   private String userId;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   private String returnUrl;
/*  23:    */   
/*  24:    */   public void setFileContent(String fileContent)
/*  25:    */   {
/*  26: 42 */     this.fileContent = fileContent;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getFileContent()
/*  30:    */   {
/*  31: 45 */     return this.fileContent;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setOutTradeNo(String outTradeNo)
/*  35:    */   {
/*  36: 49 */     this.outTradeNo = outTradeNo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getOutTradeNo()
/*  40:    */   {
/*  41: 52 */     return this.outTradeNo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setPartnerId(String partnerId)
/*  45:    */   {
/*  46: 56 */     this.partnerId = partnerId;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getPartnerId()
/*  50:    */   {
/*  51: 59 */     return this.partnerId;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setUserId(String userId)
/*  55:    */   {
/*  56: 63 */     this.userId = userId;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getUserId()
/*  60:    */   {
/*  61: 66 */     return this.userId;
/*  62:    */   }
/*  63:    */   
/*  64: 73 */   private boolean needEncrypt = false;
/*  65: 74 */   private AlipayObject bizModel = null;
/*  66:    */   
/*  67:    */   public String getNotifyUrl()
/*  68:    */   {
/*  69: 77 */     return this.notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setNotifyUrl(String notifyUrl)
/*  73:    */   {
/*  74: 81 */     this.notifyUrl = notifyUrl;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getReturnUrl()
/*  78:    */   {
/*  79: 85 */     return this.returnUrl;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setReturnUrl(String returnUrl)
/*  83:    */   {
/*  84: 89 */     this.returnUrl = returnUrl;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getApiVersion()
/*  88:    */   {
/*  89: 93 */     return this.apiVersion;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setApiVersion(String apiVersion)
/*  93:    */   {
/*  94: 97 */     this.apiVersion = apiVersion;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setTerminalType(String terminalType)
/*  98:    */   {
/*  99:101 */     this.terminalType = terminalType;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTerminalType()
/* 103:    */   {
/* 104:105 */     return this.terminalType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setTerminalInfo(String terminalInfo)
/* 108:    */   {
/* 109:109 */     this.terminalInfo = terminalInfo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getTerminalInfo()
/* 113:    */   {
/* 114:113 */     return this.terminalInfo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setProdCode(String prodCode)
/* 118:    */   {
/* 119:117 */     this.prodCode = prodCode;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getProdCode()
/* 123:    */   {
/* 124:121 */     return this.prodCode;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getApiMethodName()
/* 128:    */   {
/* 129:125 */     return "alipay.pass.sync.add";
/* 130:    */   }
/* 131:    */   
/* 132:    */   public Map<String, String> getTextParams()
/* 133:    */   {
/* 134:129 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 135:130 */     txtParams.put("file_content", this.fileContent);
/* 136:131 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 137:132 */     txtParams.put("partner_id", this.partnerId);
/* 138:133 */     txtParams.put("user_id", this.userId);
/* 139:134 */     if (this.udfParams != null) {
/* 140:135 */       txtParams.putAll(this.udfParams);
/* 141:    */     }
/* 142:137 */     return txtParams;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void putOtherTextParam(String key, String value)
/* 146:    */   {
/* 147:141 */     if (this.udfParams == null) {
/* 148:142 */       this.udfParams = new AlipayHashMap();
/* 149:    */     }
/* 150:144 */     this.udfParams.put(key, value);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public Class<AlipayPassSyncAddResponse> getResponseClass()
/* 154:    */   {
/* 155:148 */     return AlipayPassSyncAddResponse.class;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public boolean isNeedEncrypt()
/* 159:    */   {
/* 160:154 */     return this.needEncrypt;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 164:    */   {
/* 165:160 */     this.needEncrypt = needEncrypt;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public AlipayObject getBizModel()
/* 169:    */   {
/* 170:165 */     return this.bizModel;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setBizModel(AlipayObject bizModel)
/* 174:    */   {
/* 175:171 */     this.bizModel = bizModel;
/* 176:    */   }
/* 177:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassSyncAddRequest
 * JD-Core Version:    0.7.0.1
 */