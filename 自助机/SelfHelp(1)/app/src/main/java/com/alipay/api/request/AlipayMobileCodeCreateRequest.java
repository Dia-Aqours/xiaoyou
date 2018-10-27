/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayMobileCodeCreateResponse;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayMobileCodeCreateRequest
/*  11:    */   implements AlipayRequest<AlipayMobileCodeCreateResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private String bizLinkedId;
/*  16:    */   private String bizType;
/*  17:    */   private String contextStr;
/*  18:    */   private Boolean isDirect;
/*  19:    */   private String memo;
/*  20:    */   private String sourceId;
/*  21:    */   private Date startDate;
/*  22:    */   private Long timeout;
/*  23:    */   private String userId;
/*  24:    */   private String terminalType;
/*  25:    */   private String terminalInfo;
/*  26:    */   private String prodCode;
/*  27:    */   private String notifyUrl;
/*  28:    */   private String returnUrl;
/*  29:    */   
/*  30:    */   public void setBizLinkedId(String bizLinkedId)
/*  31:    */   {
/*  32: 69 */     this.bizLinkedId = bizLinkedId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getBizLinkedId()
/*  36:    */   {
/*  37: 72 */     return this.bizLinkedId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setBizType(String bizType)
/*  41:    */   {
/*  42: 76 */     this.bizType = bizType;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getBizType()
/*  46:    */   {
/*  47: 79 */     return this.bizType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setContextStr(String contextStr)
/*  51:    */   {
/*  52: 83 */     this.contextStr = contextStr;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getContextStr()
/*  56:    */   {
/*  57: 86 */     return this.contextStr;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setIsDirect(Boolean isDirect)
/*  61:    */   {
/*  62: 90 */     this.isDirect = isDirect;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public Boolean getIsDirect()
/*  66:    */   {
/*  67: 93 */     return this.isDirect;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setMemo(String memo)
/*  71:    */   {
/*  72: 97 */     this.memo = memo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getMemo()
/*  76:    */   {
/*  77:100 */     return this.memo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setSourceId(String sourceId)
/*  81:    */   {
/*  82:104 */     this.sourceId = sourceId;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getSourceId()
/*  86:    */   {
/*  87:107 */     return this.sourceId;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setStartDate(Date startDate)
/*  91:    */   {
/*  92:111 */     this.startDate = startDate;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Date getStartDate()
/*  96:    */   {
/*  97:114 */     return this.startDate;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setTimeout(Long timeout)
/* 101:    */   {
/* 102:118 */     this.timeout = timeout;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public Long getTimeout()
/* 106:    */   {
/* 107:121 */     return this.timeout;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setUserId(String userId)
/* 111:    */   {
/* 112:125 */     this.userId = userId;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getUserId()
/* 116:    */   {
/* 117:128 */     return this.userId;
/* 118:    */   }
/* 119:    */   
/* 120:135 */   private boolean needEncrypt = false;
/* 121:136 */   private AlipayObject bizModel = null;
/* 122:    */   
/* 123:    */   public String getNotifyUrl()
/* 124:    */   {
/* 125:139 */     return this.notifyUrl;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setNotifyUrl(String notifyUrl)
/* 129:    */   {
/* 130:143 */     this.notifyUrl = notifyUrl;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getReturnUrl()
/* 134:    */   {
/* 135:147 */     return this.returnUrl;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setReturnUrl(String returnUrl)
/* 139:    */   {
/* 140:151 */     this.returnUrl = returnUrl;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getApiVersion()
/* 144:    */   {
/* 145:155 */     return this.apiVersion;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setApiVersion(String apiVersion)
/* 149:    */   {
/* 150:159 */     this.apiVersion = apiVersion;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setTerminalType(String terminalType)
/* 154:    */   {
/* 155:163 */     this.terminalType = terminalType;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getTerminalType()
/* 159:    */   {
/* 160:167 */     return this.terminalType;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setTerminalInfo(String terminalInfo)
/* 164:    */   {
/* 165:171 */     this.terminalInfo = terminalInfo;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getTerminalInfo()
/* 169:    */   {
/* 170:175 */     return this.terminalInfo;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setProdCode(String prodCode)
/* 174:    */   {
/* 175:179 */     this.prodCode = prodCode;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getProdCode()
/* 179:    */   {
/* 180:183 */     return this.prodCode;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getApiMethodName()
/* 184:    */   {
/* 185:187 */     return "alipay.mobile.code.create";
/* 186:    */   }
/* 187:    */   
/* 188:    */   public Map<String, String> getTextParams()
/* 189:    */   {
/* 190:191 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 191:192 */     txtParams.put("biz_linked_id", this.bizLinkedId);
/* 192:193 */     txtParams.put("biz_type", this.bizType);
/* 193:194 */     txtParams.put("context_str", this.contextStr);
/* 194:195 */     txtParams.put("is_direct", this.isDirect);
/* 195:196 */     txtParams.put("memo", this.memo);
/* 196:197 */     txtParams.put("source_id", this.sourceId);
/* 197:198 */     txtParams.put("start_date", this.startDate);
/* 198:199 */     txtParams.put("timeout", this.timeout);
/* 199:200 */     txtParams.put("user_id", this.userId);
/* 200:201 */     if (this.udfParams != null) {
/* 201:202 */       txtParams.putAll(this.udfParams);
/* 202:    */     }
/* 203:204 */     return txtParams;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void putOtherTextParam(String key, String value)
/* 207:    */   {
/* 208:208 */     if (this.udfParams == null) {
/* 209:209 */       this.udfParams = new AlipayHashMap();
/* 210:    */     }
/* 211:211 */     this.udfParams.put(key, value);
/* 212:    */   }
/* 213:    */   
/* 214:    */   public Class<AlipayMobileCodeCreateResponse> getResponseClass()
/* 215:    */   {
/* 216:215 */     return AlipayMobileCodeCreateResponse.class;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public boolean isNeedEncrypt()
/* 220:    */   {
/* 221:221 */     return this.needEncrypt;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 225:    */   {
/* 226:227 */     this.needEncrypt = needEncrypt;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public AlipayObject getBizModel()
/* 230:    */   {
/* 231:232 */     return this.bizModel;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public void setBizModel(AlipayObject bizModel)
/* 235:    */   {
/* 236:238 */     this.bizModel = bizModel;
/* 237:    */   }
/* 238:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayMobileCodeCreateRequest
 * JD-Core Version:    0.7.0.1
 */