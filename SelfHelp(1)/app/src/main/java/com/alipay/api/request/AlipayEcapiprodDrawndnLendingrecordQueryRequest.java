/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayEcapiprodDrawndnLendingrecordQueryResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEcapiprodDrawndnLendingrecordQueryRequest
/*  10:    */   implements AlipayRequest<AlipayEcapiprodDrawndnLendingrecordQueryResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String drawndnNo;
/*  15:    */   private String end;
/*  16:    */   private String entityCode;
/*  17:    */   private String entityName;
/*  18:    */   private String isvCode;
/*  19:    */   private String orgCode;
/*  20:    */   private String start;
/*  21:    */   private String terminalType;
/*  22:    */   private String terminalInfo;
/*  23:    */   private String prodCode;
/*  24:    */   private String notifyUrl;
/*  25:    */   private String returnUrl;
/*  26:    */   
/*  27:    */   public void setDrawndnNo(String drawndnNo)
/*  28:    */   {
/*  29: 57 */     this.drawndnNo = drawndnNo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getDrawndnNo()
/*  33:    */   {
/*  34: 60 */     return this.drawndnNo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setEnd(String end)
/*  38:    */   {
/*  39: 64 */     this.end = end;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getEnd()
/*  43:    */   {
/*  44: 67 */     return this.end;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setEntityCode(String entityCode)
/*  48:    */   {
/*  49: 71 */     this.entityCode = entityCode;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getEntityCode()
/*  53:    */   {
/*  54: 74 */     return this.entityCode;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setEntityName(String entityName)
/*  58:    */   {
/*  59: 78 */     this.entityName = entityName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getEntityName()
/*  63:    */   {
/*  64: 81 */     return this.entityName;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setIsvCode(String isvCode)
/*  68:    */   {
/*  69: 85 */     this.isvCode = isvCode;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getIsvCode()
/*  73:    */   {
/*  74: 88 */     return this.isvCode;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setOrgCode(String orgCode)
/*  78:    */   {
/*  79: 92 */     this.orgCode = orgCode;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getOrgCode()
/*  83:    */   {
/*  84: 95 */     return this.orgCode;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setStart(String start)
/*  88:    */   {
/*  89: 99 */     this.start = start;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getStart()
/*  93:    */   {
/*  94:102 */     return this.start;
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
/* 162:161 */     return "alipay.ecapiprod.drawndn.lendingrecord.query";
/* 163:    */   }
/* 164:    */   
/* 165:    */   public Map<String, String> getTextParams()
/* 166:    */   {
/* 167:165 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 168:166 */     txtParams.put("drawndn_no", this.drawndnNo);
/* 169:167 */     txtParams.put("end", this.end);
/* 170:168 */     txtParams.put("entity_code", this.entityCode);
/* 171:169 */     txtParams.put("entity_name", this.entityName);
/* 172:170 */     txtParams.put("isv_code", this.isvCode);
/* 173:171 */     txtParams.put("org_code", this.orgCode);
/* 174:172 */     txtParams.put("start", this.start);
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
/* 189:    */   public Class<AlipayEcapiprodDrawndnLendingrecordQueryResponse> getResponseClass()
/* 190:    */   {
/* 191:187 */     return AlipayEcapiprodDrawndnLendingrecordQueryResponse.class;
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
 * Qualified Name:     com.alipay.api.request.AlipayEcapiprodDrawndnLendingrecordQueryRequest
 * JD-Core Version:    0.7.0.1
 */