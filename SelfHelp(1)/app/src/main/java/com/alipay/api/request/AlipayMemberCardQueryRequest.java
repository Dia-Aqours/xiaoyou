/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMemberCardQueryResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMemberCardQueryRequest
/*  10:    */   implements AlipayRequest<AlipayMemberCardQueryResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String bizCardNo;
/*  15:    */   private String cardMerchantInfo;
/*  16:    */   private String cardUserInfo;
/*  17:    */   private String extInfo;
/*  18:    */   private String requestFrom;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   private String returnUrl;
/*  24:    */   
/*  25:    */   public void setBizCardNo(String bizCardNo)
/*  26:    */   {
/*  27: 71 */     this.bizCardNo = bizCardNo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getBizCardNo()
/*  31:    */   {
/*  32: 74 */     return this.bizCardNo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  36:    */   {
/*  37: 78 */     this.cardMerchantInfo = cardMerchantInfo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getCardMerchantInfo()
/*  41:    */   {
/*  42: 81 */     return this.cardMerchantInfo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setCardUserInfo(String cardUserInfo)
/*  46:    */   {
/*  47: 85 */     this.cardUserInfo = cardUserInfo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getCardUserInfo()
/*  51:    */   {
/*  52: 88 */     return this.cardUserInfo;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setExtInfo(String extInfo)
/*  56:    */   {
/*  57: 92 */     this.extInfo = extInfo;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getExtInfo()
/*  61:    */   {
/*  62: 95 */     return this.extInfo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setRequestFrom(String requestFrom)
/*  66:    */   {
/*  67: 99 */     this.requestFrom = requestFrom;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getRequestFrom()
/*  71:    */   {
/*  72:102 */     return this.requestFrom;
/*  73:    */   }
/*  74:    */   
/*  75:109 */   private boolean needEncrypt = false;
/*  76:110 */   private AlipayObject bizModel = null;
/*  77:    */   
/*  78:    */   public String getNotifyUrl()
/*  79:    */   {
/*  80:113 */     return this.notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setNotifyUrl(String notifyUrl)
/*  84:    */   {
/*  85:117 */     this.notifyUrl = notifyUrl;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getReturnUrl()
/*  89:    */   {
/*  90:121 */     return this.returnUrl;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setReturnUrl(String returnUrl)
/*  94:    */   {
/*  95:125 */     this.returnUrl = returnUrl;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getApiVersion()
/*  99:    */   {
/* 100:129 */     return this.apiVersion;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setApiVersion(String apiVersion)
/* 104:    */   {
/* 105:133 */     this.apiVersion = apiVersion;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setTerminalType(String terminalType)
/* 109:    */   {
/* 110:137 */     this.terminalType = terminalType;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getTerminalType()
/* 114:    */   {
/* 115:141 */     return this.terminalType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setTerminalInfo(String terminalInfo)
/* 119:    */   {
/* 120:145 */     this.terminalInfo = terminalInfo;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getTerminalInfo()
/* 124:    */   {
/* 125:149 */     return this.terminalInfo;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setProdCode(String prodCode)
/* 129:    */   {
/* 130:153 */     this.prodCode = prodCode;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getProdCode()
/* 134:    */   {
/* 135:157 */     return this.prodCode;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getApiMethodName()
/* 139:    */   {
/* 140:161 */     return "alipay.member.card.query";
/* 141:    */   }
/* 142:    */   
/* 143:    */   public Map<String, String> getTextParams()
/* 144:    */   {
/* 145:165 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 146:166 */     txtParams.put("biz_card_no", this.bizCardNo);
/* 147:167 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 148:168 */     txtParams.put("card_user_info", this.cardUserInfo);
/* 149:169 */     txtParams.put("ext_info", this.extInfo);
/* 150:170 */     txtParams.put("request_from", this.requestFrom);
/* 151:171 */     if (this.udfParams != null) {
/* 152:172 */       txtParams.putAll(this.udfParams);
/* 153:    */     }
/* 154:174 */     return txtParams;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void putOtherTextParam(String key, String value)
/* 158:    */   {
/* 159:178 */     if (this.udfParams == null) {
/* 160:179 */       this.udfParams = new AlipayHashMap();
/* 161:    */     }
/* 162:181 */     this.udfParams.put(key, value);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Class<AlipayMemberCardQueryResponse> getResponseClass()
/* 166:    */   {
/* 167:185 */     return AlipayMemberCardQueryResponse.class;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean isNeedEncrypt()
/* 171:    */   {
/* 172:191 */     return this.needEncrypt;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 176:    */   {
/* 177:197 */     this.needEncrypt = needEncrypt;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public AlipayObject getBizModel()
/* 181:    */   {
/* 182:202 */     return this.bizModel;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setBizModel(AlipayObject bizModel)
/* 186:    */   {
/* 187:208 */     this.bizModel = bizModel;
/* 188:    */   }
/* 189:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMemberCardQueryRequest
 * JD-Core Version:    0.7.0.1
 */