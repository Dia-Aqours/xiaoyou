/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEcapiprodDataPutResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEcapiprodDataPutRequest
/*  10:    */   implements AlipayRequest<AlipayEcapiprodDataPutResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String category;
/*  15:    */   private String charSet;
/*  16:    */   private String collectingTaskId;
/*  17:    */   private String entityCode;
/*  18:    */   private String entityName;
/*  19:    */   private String entityType;
/*  20:    */   private String isvCode;
/*  21:    */   private String jsonData;
/*  22:    */   private String orgCode;
/*  23:    */   private String terminalType;
/*  24:    */   private String terminalInfo;
/*  25:    */   private String prodCode;
/*  26:    */   private String notifyUrl;
/*  27:    */   private String returnUrl;
/*  28:    */   
/*  29:    */   public void setCategory(String category)
/*  30:    */   {
/*  31: 67 */     this.category = category;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String getCategory()
/*  35:    */   {
/*  36: 70 */     return this.category;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setCharSet(String charSet)
/*  40:    */   {
/*  41: 74 */     this.charSet = charSet;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getCharSet()
/*  45:    */   {
/*  46: 77 */     return this.charSet;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setCollectingTaskId(String collectingTaskId)
/*  50:    */   {
/*  51: 81 */     this.collectingTaskId = collectingTaskId;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getCollectingTaskId()
/*  55:    */   {
/*  56: 84 */     return this.collectingTaskId;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setEntityCode(String entityCode)
/*  60:    */   {
/*  61: 88 */     this.entityCode = entityCode;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getEntityCode()
/*  65:    */   {
/*  66: 91 */     return this.entityCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setEntityName(String entityName)
/*  70:    */   {
/*  71: 95 */     this.entityName = entityName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getEntityName()
/*  75:    */   {
/*  76: 98 */     return this.entityName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setEntityType(String entityType)
/*  80:    */   {
/*  81:102 */     this.entityType = entityType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getEntityType()
/*  85:    */   {
/*  86:105 */     return this.entityType;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setIsvCode(String isvCode)
/*  90:    */   {
/*  91:109 */     this.isvCode = isvCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getIsvCode()
/*  95:    */   {
/*  96:112 */     return this.isvCode;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setJsonData(String jsonData)
/* 100:    */   {
/* 101:116 */     this.jsonData = jsonData;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getJsonData()
/* 105:    */   {
/* 106:119 */     return this.jsonData;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setOrgCode(String orgCode)
/* 110:    */   {
/* 111:123 */     this.orgCode = orgCode;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getOrgCode()
/* 115:    */   {
/* 116:126 */     return this.orgCode;
/* 117:    */   }
/* 118:    */   
/* 119:133 */   private boolean needEncrypt = false;
/* 120:134 */   private AlipayObject bizModel = null;
/* 121:    */   
/* 122:    */   public String getNotifyUrl()
/* 123:    */   {
/* 124:137 */     return this.notifyUrl;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setNotifyUrl(String notifyUrl)
/* 128:    */   {
/* 129:141 */     this.notifyUrl = notifyUrl;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getReturnUrl()
/* 133:    */   {
/* 134:145 */     return this.returnUrl;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setReturnUrl(String returnUrl)
/* 138:    */   {
/* 139:149 */     this.returnUrl = returnUrl;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getApiVersion()
/* 143:    */   {
/* 144:153 */     return this.apiVersion;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setApiVersion(String apiVersion)
/* 148:    */   {
/* 149:157 */     this.apiVersion = apiVersion;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTerminalType(String terminalType)
/* 153:    */   {
/* 154:161 */     this.terminalType = terminalType;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getTerminalType()
/* 158:    */   {
/* 159:165 */     return this.terminalType;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setTerminalInfo(String terminalInfo)
/* 163:    */   {
/* 164:169 */     this.terminalInfo = terminalInfo;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getTerminalInfo()
/* 168:    */   {
/* 169:173 */     return this.terminalInfo;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setProdCode(String prodCode)
/* 173:    */   {
/* 174:177 */     this.prodCode = prodCode;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getProdCode()
/* 178:    */   {
/* 179:181 */     return this.prodCode;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getApiMethodName()
/* 183:    */   {
/* 184:185 */     return "alipay.ecapiprod.data.put";
/* 185:    */   }
/* 186:    */   
/* 187:    */   public Map<String, String> getTextParams()
/* 188:    */   {
/* 189:189 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 190:190 */     txtParams.put("category", this.category);
/* 191:191 */     txtParams.put("char_set", this.charSet);
/* 192:192 */     txtParams.put("collecting_task_id", this.collectingTaskId);
/* 193:193 */     txtParams.put("entity_code", this.entityCode);
/* 194:194 */     txtParams.put("entity_name", this.entityName);
/* 195:195 */     txtParams.put("entity_type", this.entityType);
/* 196:196 */     txtParams.put("isv_code", this.isvCode);
/* 197:197 */     txtParams.put("json_data", this.jsonData);
/* 198:198 */     txtParams.put("org_code", this.orgCode);
/* 199:199 */     if (this.udfParams != null) {
/* 200:200 */       txtParams.putAll(this.udfParams);
/* 201:    */     }
/* 202:202 */     return txtParams;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void putOtherTextParam(String key, String value)
/* 206:    */   {
/* 207:206 */     if (this.udfParams == null) {
/* 208:207 */       this.udfParams = new AlipayHashMap();
/* 209:    */     }
/* 210:209 */     this.udfParams.put(key, value);
/* 211:    */   }
/* 212:    */   
/* 213:    */   public Class<AlipayEcapiprodDataPutResponse> getResponseClass()
/* 214:    */   {
/* 215:213 */     return AlipayEcapiprodDataPutResponse.class;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public boolean isNeedEncrypt()
/* 219:    */   {
/* 220:219 */     return this.needEncrypt;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 224:    */   {
/* 225:225 */     this.needEncrypt = needEncrypt;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public AlipayObject getBizModel()
/* 229:    */   {
/* 230:230 */     return this.bizModel;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void setBizModel(AlipayObject bizModel)
/* 234:    */   {
/* 235:236 */     this.bizModel = bizModel;
/* 236:    */   }
/* 237:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayEcapiprodDataPutRequest
 * JD-Core Version:    0.7.0.1
 */