/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMemberCardDeletecardResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMemberCardDeletecardRequest
/*  10:    */   implements AlipayRequest<AlipayMemberCardDeletecardResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String bizSerialNo;
/*  15:    */   private String cardMerchantInfo;
/*  16:    */   private String extInfo;
/*  17:    */   private String externalCardNo;
/*  18:    */   private String reasonCode;
/*  19:    */   private String requestFrom;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setBizSerialNo(String bizSerialNo)
/*  27:    */   {
/*  28: 63 */     this.bizSerialNo = bizSerialNo;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getBizSerialNo()
/*  32:    */   {
/*  33: 66 */     return this.bizSerialNo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  37:    */   {
/*  38: 70 */     this.cardMerchantInfo = cardMerchantInfo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getCardMerchantInfo()
/*  42:    */   {
/*  43: 73 */     return this.cardMerchantInfo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setExtInfo(String extInfo)
/*  47:    */   {
/*  48: 77 */     this.extInfo = extInfo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getExtInfo()
/*  52:    */   {
/*  53: 80 */     return this.extInfo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setExternalCardNo(String externalCardNo)
/*  57:    */   {
/*  58: 84 */     this.externalCardNo = externalCardNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getExternalCardNo()
/*  62:    */   {
/*  63: 87 */     return this.externalCardNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setReasonCode(String reasonCode)
/*  67:    */   {
/*  68: 91 */     this.reasonCode = reasonCode;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getReasonCode()
/*  72:    */   {
/*  73: 94 */     return this.reasonCode;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setRequestFrom(String requestFrom)
/*  77:    */   {
/*  78: 98 */     this.requestFrom = requestFrom;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getRequestFrom()
/*  82:    */   {
/*  83:101 */     return this.requestFrom;
/*  84:    */   }
/*  85:    */   
/*  86:108 */   private boolean needEncrypt = false;
/*  87:109 */   private AlipayObject bizModel = null;
/*  88:    */   
/*  89:    */   public String getNotifyUrl()
/*  90:    */   {
/*  91:112 */     return this.notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setNotifyUrl(String notifyUrl)
/*  95:    */   {
/*  96:116 */     this.notifyUrl = notifyUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getReturnUrl()
/* 100:    */   {
/* 101:120 */     return this.returnUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setReturnUrl(String returnUrl)
/* 105:    */   {
/* 106:124 */     this.returnUrl = returnUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getApiVersion()
/* 110:    */   {
/* 111:128 */     return this.apiVersion;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setApiVersion(String apiVersion)
/* 115:    */   {
/* 116:132 */     this.apiVersion = apiVersion;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalType(String terminalType)
/* 120:    */   {
/* 121:136 */     this.terminalType = terminalType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalType()
/* 125:    */   {
/* 126:140 */     return this.terminalType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTerminalInfo(String terminalInfo)
/* 130:    */   {
/* 131:144 */     this.terminalInfo = terminalInfo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTerminalInfo()
/* 135:    */   {
/* 136:148 */     return this.terminalInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setProdCode(String prodCode)
/* 140:    */   {
/* 141:152 */     this.prodCode = prodCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getProdCode()
/* 145:    */   {
/* 146:156 */     return this.prodCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getApiMethodName()
/* 150:    */   {
/* 151:160 */     return "alipay.member.card.deletecard";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:164 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:165 */     txtParams.put("biz_serial_no", this.bizSerialNo);
/* 158:166 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 159:167 */     txtParams.put("ext_info", this.extInfo);
/* 160:168 */     txtParams.put("external_card_no", this.externalCardNo);
/* 161:169 */     txtParams.put("reason_code", this.reasonCode);
/* 162:170 */     txtParams.put("request_from", this.requestFrom);
/* 163:171 */     if (this.udfParams != null) {
/* 164:172 */       txtParams.putAll(this.udfParams);
/* 165:    */     }
/* 166:174 */     return txtParams;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void putOtherTextParam(String key, String value)
/* 170:    */   {
/* 171:178 */     if (this.udfParams == null) {
/* 172:179 */       this.udfParams = new AlipayHashMap();
/* 173:    */     }
/* 174:181 */     this.udfParams.put(key, value);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Class<AlipayMemberCardDeletecardResponse> getResponseClass()
/* 178:    */   {
/* 179:185 */     return AlipayMemberCardDeletecardResponse.class;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public boolean isNeedEncrypt()
/* 183:    */   {
/* 184:191 */     return this.needEncrypt;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 188:    */   {
/* 189:197 */     this.needEncrypt = needEncrypt;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public AlipayObject getBizModel()
/* 193:    */   {
/* 194:202 */     return this.bizModel;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setBizModel(AlipayObject bizModel)
/* 198:    */   {
/* 199:208 */     this.bizModel = bizModel;
/* 200:    */   }
/* 201:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMemberCardDeletecardRequest
 * JD-Core Version:    0.7.0.1
 */