/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMemberCardOpenResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMemberCardOpenRequest
/*  10:    */   implements AlipayRequest<AlipayMemberCardOpenResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String bizSerialNo;
/*  15:    */   private String cardMerchantInfo;
/*  16:    */   private String cardUserInfo;
/*  17:    */   private String extInfo;
/*  18:    */   private String externalCardNo;
/*  19:    */   private String requestFrom;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setBizSerialNo(String bizSerialNo)
/*  27:    */   {
/*  28: 71 */     this.bizSerialNo = bizSerialNo;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getBizSerialNo()
/*  32:    */   {
/*  33: 74 */     return this.bizSerialNo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  37:    */   {
/*  38: 78 */     this.cardMerchantInfo = cardMerchantInfo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getCardMerchantInfo()
/*  42:    */   {
/*  43: 81 */     return this.cardMerchantInfo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setCardUserInfo(String cardUserInfo)
/*  47:    */   {
/*  48: 85 */     this.cardUserInfo = cardUserInfo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getCardUserInfo()
/*  52:    */   {
/*  53: 88 */     return this.cardUserInfo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setExtInfo(String extInfo)
/*  57:    */   {
/*  58: 92 */     this.extInfo = extInfo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getExtInfo()
/*  62:    */   {
/*  63: 95 */     return this.extInfo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setExternalCardNo(String externalCardNo)
/*  67:    */   {
/*  68: 99 */     this.externalCardNo = externalCardNo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getExternalCardNo()
/*  72:    */   {
/*  73:102 */     return this.externalCardNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setRequestFrom(String requestFrom)
/*  77:    */   {
/*  78:106 */     this.requestFrom = requestFrom;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getRequestFrom()
/*  82:    */   {
/*  83:109 */     return this.requestFrom;
/*  84:    */   }
/*  85:    */   
/*  86:116 */   private boolean needEncrypt = false;
/*  87:117 */   private AlipayObject bizModel = null;
/*  88:    */   
/*  89:    */   public String getNotifyUrl()
/*  90:    */   {
/*  91:120 */     return this.notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setNotifyUrl(String notifyUrl)
/*  95:    */   {
/*  96:124 */     this.notifyUrl = notifyUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getReturnUrl()
/* 100:    */   {
/* 101:128 */     return this.returnUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setReturnUrl(String returnUrl)
/* 105:    */   {
/* 106:132 */     this.returnUrl = returnUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getApiVersion()
/* 110:    */   {
/* 111:136 */     return this.apiVersion;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setApiVersion(String apiVersion)
/* 115:    */   {
/* 116:140 */     this.apiVersion = apiVersion;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalType(String terminalType)
/* 120:    */   {
/* 121:144 */     this.terminalType = terminalType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalType()
/* 125:    */   {
/* 126:148 */     return this.terminalType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTerminalInfo(String terminalInfo)
/* 130:    */   {
/* 131:152 */     this.terminalInfo = terminalInfo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTerminalInfo()
/* 135:    */   {
/* 136:156 */     return this.terminalInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setProdCode(String prodCode)
/* 140:    */   {
/* 141:160 */     this.prodCode = prodCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getProdCode()
/* 145:    */   {
/* 146:164 */     return this.prodCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getApiMethodName()
/* 150:    */   {
/* 151:168 */     return "alipay.member.card.open";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:172 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:173 */     txtParams.put("biz_serial_no", this.bizSerialNo);
/* 158:174 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 159:175 */     txtParams.put("card_user_info", this.cardUserInfo);
/* 160:176 */     txtParams.put("ext_info", this.extInfo);
/* 161:177 */     txtParams.put("external_card_no", this.externalCardNo);
/* 162:178 */     txtParams.put("request_from", this.requestFrom);
/* 163:179 */     if (this.udfParams != null) {
/* 164:180 */       txtParams.putAll(this.udfParams);
/* 165:    */     }
/* 166:182 */     return txtParams;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void putOtherTextParam(String key, String value)
/* 170:    */   {
/* 171:186 */     if (this.udfParams == null) {
/* 172:187 */       this.udfParams = new AlipayHashMap();
/* 173:    */     }
/* 174:189 */     this.udfParams.put(key, value);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Class<AlipayMemberCardOpenResponse> getResponseClass()
/* 178:    */   {
/* 179:193 */     return AlipayMemberCardOpenResponse.class;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public boolean isNeedEncrypt()
/* 183:    */   {
/* 184:199 */     return this.needEncrypt;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 188:    */   {
/* 189:205 */     this.needEncrypt = needEncrypt;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public AlipayObject getBizModel()
/* 193:    */   {
/* 194:210 */     return this.bizModel;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setBizModel(AlipayObject bizModel)
/* 198:    */   {
/* 199:216 */     this.bizModel = bizModel;
/* 200:    */   }
/* 201:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMemberCardOpenRequest
 * JD-Core Version:    0.7.0.1
 */