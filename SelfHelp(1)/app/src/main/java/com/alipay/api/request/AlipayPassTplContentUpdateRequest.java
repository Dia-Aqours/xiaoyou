/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayPassTplContentUpdateResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassTplContentUpdateRequest
/*  10:    */   implements AlipayRequest<AlipayPassTplContentUpdateResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String channelId;
/*  15:    */   private String serialNumber;
/*  16:    */   private String status;
/*  17:    */   private String tplParams;
/*  18:    */   private String verifyCode;
/*  19:    */   private String verifyType;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setChannelId(String channelId)
/*  27:    */   {
/*  28: 52 */     this.channelId = channelId;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getChannelId()
/*  32:    */   {
/*  33: 55 */     return this.channelId;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setSerialNumber(String serialNumber)
/*  37:    */   {
/*  38: 59 */     this.serialNumber = serialNumber;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getSerialNumber()
/*  42:    */   {
/*  43: 62 */     return this.serialNumber;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setStatus(String status)
/*  47:    */   {
/*  48: 66 */     this.status = status;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getStatus()
/*  52:    */   {
/*  53: 69 */     return this.status;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setTplParams(String tplParams)
/*  57:    */   {
/*  58: 73 */     this.tplParams = tplParams;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getTplParams()
/*  62:    */   {
/*  63: 76 */     return this.tplParams;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setVerifyCode(String verifyCode)
/*  67:    */   {
/*  68: 80 */     this.verifyCode = verifyCode;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getVerifyCode()
/*  72:    */   {
/*  73: 83 */     return this.verifyCode;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setVerifyType(String verifyType)
/*  77:    */   {
/*  78: 87 */     this.verifyType = verifyType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getVerifyType()
/*  82:    */   {
/*  83: 90 */     return this.verifyType;
/*  84:    */   }
/*  85:    */   
/*  86: 97 */   private boolean needEncrypt = false;
/*  87: 98 */   private AlipayObject bizModel = null;
/*  88:    */   
/*  89:    */   public String getNotifyUrl()
/*  90:    */   {
/*  91:101 */     return this.notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setNotifyUrl(String notifyUrl)
/*  95:    */   {
/*  96:105 */     this.notifyUrl = notifyUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getReturnUrl()
/* 100:    */   {
/* 101:109 */     return this.returnUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setReturnUrl(String returnUrl)
/* 105:    */   {
/* 106:113 */     this.returnUrl = returnUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getApiVersion()
/* 110:    */   {
/* 111:117 */     return this.apiVersion;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setApiVersion(String apiVersion)
/* 115:    */   {
/* 116:121 */     this.apiVersion = apiVersion;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalType(String terminalType)
/* 120:    */   {
/* 121:125 */     this.terminalType = terminalType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalType()
/* 125:    */   {
/* 126:129 */     return this.terminalType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTerminalInfo(String terminalInfo)
/* 130:    */   {
/* 131:133 */     this.terminalInfo = terminalInfo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTerminalInfo()
/* 135:    */   {
/* 136:137 */     return this.terminalInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setProdCode(String prodCode)
/* 140:    */   {
/* 141:141 */     this.prodCode = prodCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getProdCode()
/* 145:    */   {
/* 146:145 */     return this.prodCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getApiMethodName()
/* 150:    */   {
/* 151:149 */     return "alipay.pass.tpl.content.update";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:153 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:154 */     txtParams.put("channel_id", this.channelId);
/* 158:155 */     txtParams.put("serial_number", this.serialNumber);
/* 159:156 */     txtParams.put("status", this.status);
/* 160:157 */     txtParams.put("tpl_params", this.tplParams);
/* 161:158 */     txtParams.put("verify_code", this.verifyCode);
/* 162:159 */     txtParams.put("verify_type", this.verifyType);
/* 163:160 */     if (this.udfParams != null) {
/* 164:161 */       txtParams.putAll(this.udfParams);
/* 165:    */     }
/* 166:163 */     return txtParams;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void putOtherTextParam(String key, String value)
/* 170:    */   {
/* 171:167 */     if (this.udfParams == null) {
/* 172:168 */       this.udfParams = new AlipayHashMap();
/* 173:    */     }
/* 174:170 */     this.udfParams.put(key, value);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Class<AlipayPassTplContentUpdateResponse> getResponseClass()
/* 178:    */   {
/* 179:174 */     return AlipayPassTplContentUpdateResponse.class;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public boolean isNeedEncrypt()
/* 183:    */   {
/* 184:180 */     return this.needEncrypt;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 188:    */   {
/* 189:186 */     this.needEncrypt = needEncrypt;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public AlipayObject getBizModel()
/* 193:    */   {
/* 194:191 */     return this.bizModel;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setBizModel(AlipayObject bizModel)
/* 198:    */   {
/* 199:197 */     this.bizModel = bizModel;
/* 200:    */   }
/* 201:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayPassTplContentUpdateRequest
 * JD-Core Version:    0.7.0.1
 */