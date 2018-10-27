/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassSyncUpdateResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassSyncUpdateRequest
/*  10:    */   implements AlipayRequest<AlipayPassSyncUpdateResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String channelId;
/*  15:    */   private String extInfo;
/*  16:    */   private String pass;
/*  17:    */   private String serialNumber;
/*  18:    */   private String status;
/*  19:    */   private String verifyCode;
/*  20:    */   private String verifyType;
/*  21:    */   private String terminalType;
/*  22:    */   private String terminalInfo;
/*  23:    */   private String prodCode;
/*  24:    */   private String notifyUrl;
/*  25:    */   private String returnUrl;
/*  26:    */   
/*  27:    */   public void setChannelId(String channelId)
/*  28:    */   {
/*  29: 57 */     this.channelId = channelId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getChannelId()
/*  33:    */   {
/*  34: 60 */     return this.channelId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setExtInfo(String extInfo)
/*  38:    */   {
/*  39: 64 */     this.extInfo = extInfo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getExtInfo()
/*  43:    */   {
/*  44: 67 */     return this.extInfo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setPass(String pass)
/*  48:    */   {
/*  49: 71 */     this.pass = pass;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getPass()
/*  53:    */   {
/*  54: 74 */     return this.pass;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setSerialNumber(String serialNumber)
/*  58:    */   {
/*  59: 78 */     this.serialNumber = serialNumber;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getSerialNumber()
/*  63:    */   {
/*  64: 81 */     return this.serialNumber;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setStatus(String status)
/*  68:    */   {
/*  69: 85 */     this.status = status;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getStatus()
/*  73:    */   {
/*  74: 88 */     return this.status;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setVerifyCode(String verifyCode)
/*  78:    */   {
/*  79: 92 */     this.verifyCode = verifyCode;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getVerifyCode()
/*  83:    */   {
/*  84: 95 */     return this.verifyCode;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setVerifyType(String verifyType)
/*  88:    */   {
/*  89: 99 */     this.verifyType = verifyType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getVerifyType()
/*  93:    */   {
/*  94:102 */     return this.verifyType;
/*  95:    */   }
/*  96:    */   
/*  97:109 */   private boolean needEncrypt = false;
/*  98:110 */   private AlipayObject bizModel = null;
/*  99:    */   
/* 100:    */   public String getNotifyUrl()
/* 101:    */   {
/* 102:113 */     return this.notifyUrl;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setNotifyUrl(String notifyUrl)
/* 106:    */   {
/* 107:117 */     this.notifyUrl = notifyUrl;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getReturnUrl()
/* 111:    */   {
/* 112:121 */     return this.returnUrl;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setReturnUrl(String returnUrl)
/* 116:    */   {
/* 117:125 */     this.returnUrl = returnUrl;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getApiVersion()
/* 121:    */   {
/* 122:129 */     return this.apiVersion;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setApiVersion(String apiVersion)
/* 126:    */   {
/* 127:133 */     this.apiVersion = apiVersion;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setTerminalType(String terminalType)
/* 131:    */   {
/* 132:137 */     this.terminalType = terminalType;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getTerminalType()
/* 136:    */   {
/* 137:141 */     return this.terminalType;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setTerminalInfo(String terminalInfo)
/* 141:    */   {
/* 142:145 */     this.terminalInfo = terminalInfo;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getTerminalInfo()
/* 146:    */   {
/* 147:149 */     return this.terminalInfo;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void setProdCode(String prodCode)
/* 151:    */   {
/* 152:153 */     this.prodCode = prodCode;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public String getProdCode()
/* 156:    */   {
/* 157:157 */     return this.prodCode;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getApiMethodName()
/* 161:    */   {
/* 162:161 */     return "alipay.pass.sync.update";
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Map<String, String> getTextParams()
/* 166:    */   {
/* 167:165 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 168:166 */     txtParams.put("channel_id", this.channelId);
/* 169:167 */     txtParams.put("ext_info", this.extInfo);
/* 170:168 */     txtParams.put("pass", this.pass);
/* 171:169 */     txtParams.put("serial_number", this.serialNumber);
/* 172:170 */     txtParams.put("status", this.status);
/* 173:171 */     txtParams.put("verify_code", this.verifyCode);
/* 174:172 */     txtParams.put("verify_type", this.verifyType);
/* 175:173 */     if (this.udfParams != null) {
/* 176:174 */       txtParams.putAll(this.udfParams);
/* 177:    */     }
/* 178:176 */     return txtParams;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void putOtherTextParam(String key, String value)
/* 182:    */   {
/* 183:180 */     if (this.udfParams == null) {
/* 184:181 */       this.udfParams = new AlipayHashMap();
/* 185:    */     }
/* 186:183 */     this.udfParams.put(key, value);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public Class<AlipayPassSyncUpdateResponse> getResponseClass()
/* 190:    */   {
/* 191:187 */     return AlipayPassSyncUpdateResponse.class;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public boolean isNeedEncrypt()
/* 195:    */   {
/* 196:193 */     return this.needEncrypt;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 200:    */   {
/* 201:199 */     this.needEncrypt = needEncrypt;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public AlipayObject getBizModel()
/* 205:    */   {
/* 206:204 */     return this.bizModel;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setBizModel(AlipayObject bizModel)
/* 210:    */   {
/* 211:210 */     this.bizModel = bizModel;
/* 212:    */   }
/* 213:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassSyncUpdateRequest
 * JD-Core Version:    0.7.0.1
 */