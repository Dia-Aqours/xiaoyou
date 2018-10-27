/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayZdatafrontCommonQueryResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayZdatafrontCommonQueryRequest
/*  10:    */   implements AlipayRequest<AlipayZdatafrontCommonQueryResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private Long cacheInterval;
/*  15:    */   private String queryConditions;
/*  16:    */   private String serviceName;
/*  17:    */   private String visitBiz;
/*  18:    */   private String visitBizLine;
/*  19:    */   private String visitDomain;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setCacheInterval(Long cacheInterval)
/*  27:    */   {
/*  28: 54 */     this.cacheInterval = cacheInterval;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public Long getCacheInterval()
/*  32:    */   {
/*  33: 57 */     return this.cacheInterval;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setQueryConditions(String queryConditions)
/*  37:    */   {
/*  38: 61 */     this.queryConditions = queryConditions;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getQueryConditions()
/*  42:    */   {
/*  43: 64 */     return this.queryConditions;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setServiceName(String serviceName)
/*  47:    */   {
/*  48: 68 */     this.serviceName = serviceName;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getServiceName()
/*  52:    */   {
/*  53: 71 */     return this.serviceName;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setVisitBiz(String visitBiz)
/*  57:    */   {
/*  58: 75 */     this.visitBiz = visitBiz;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getVisitBiz()
/*  62:    */   {
/*  63: 78 */     return this.visitBiz;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setVisitBizLine(String visitBizLine)
/*  67:    */   {
/*  68: 82 */     this.visitBizLine = visitBizLine;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getVisitBizLine()
/*  72:    */   {
/*  73: 85 */     return this.visitBizLine;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setVisitDomain(String visitDomain)
/*  77:    */   {
/*  78: 89 */     this.visitDomain = visitDomain;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getVisitDomain()
/*  82:    */   {
/*  83: 92 */     return this.visitDomain;
/*  84:    */   }
/*  85:    */   
/*  86: 99 */   private boolean needEncrypt = false;
/*  87:100 */   private AlipayObject bizModel = null;
/*  88:    */   
/*  89:    */   public String getNotifyUrl()
/*  90:    */   {
/*  91:103 */     return this.notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setNotifyUrl(String notifyUrl)
/*  95:    */   {
/*  96:107 */     this.notifyUrl = notifyUrl;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getReturnUrl()
/* 100:    */   {
/* 101:111 */     return this.returnUrl;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setReturnUrl(String returnUrl)
/* 105:    */   {
/* 106:115 */     this.returnUrl = returnUrl;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getApiVersion()
/* 110:    */   {
/* 111:119 */     return this.apiVersion;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setApiVersion(String apiVersion)
/* 115:    */   {
/* 116:123 */     this.apiVersion = apiVersion;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setTerminalType(String terminalType)
/* 120:    */   {
/* 121:127 */     this.terminalType = terminalType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getTerminalType()
/* 125:    */   {
/* 126:131 */     return this.terminalType;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setTerminalInfo(String terminalInfo)
/* 130:    */   {
/* 131:135 */     this.terminalInfo = terminalInfo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getTerminalInfo()
/* 135:    */   {
/* 136:139 */     return this.terminalInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setProdCode(String prodCode)
/* 140:    */   {
/* 141:143 */     this.prodCode = prodCode;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getProdCode()
/* 145:    */   {
/* 146:147 */     return this.prodCode;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getApiMethodName()
/* 150:    */   {
/* 151:151 */     return "alipay.zdatafront.common.query";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:155 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:156 */     txtParams.put("cache_interval", this.cacheInterval);
/* 158:157 */     txtParams.put("query_conditions", this.queryConditions);
/* 159:158 */     txtParams.put("service_name", this.serviceName);
/* 160:159 */     txtParams.put("visit_biz", this.visitBiz);
/* 161:160 */     txtParams.put("visit_biz_line", this.visitBizLine);
/* 162:161 */     txtParams.put("visit_domain", this.visitDomain);
/* 163:162 */     if (this.udfParams != null) {
/* 164:163 */       txtParams.putAll(this.udfParams);
/* 165:    */     }
/* 166:165 */     return txtParams;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void putOtherTextParam(String key, String value)
/* 170:    */   {
/* 171:169 */     if (this.udfParams == null) {
/* 172:170 */       this.udfParams = new AlipayHashMap();
/* 173:    */     }
/* 174:172 */     this.udfParams.put(key, value);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public Class<AlipayZdatafrontCommonQueryResponse> getResponseClass()
/* 178:    */   {
/* 179:176 */     return AlipayZdatafrontCommonQueryResponse.class;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public boolean isNeedEncrypt()
/* 183:    */   {
/* 184:182 */     return this.needEncrypt;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 188:    */   {
/* 189:188 */     this.needEncrypt = needEncrypt;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public AlipayObject getBizModel()
/* 193:    */   {
/* 194:193 */     return this.bizModel;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setBizModel(AlipayObject bizModel)
/* 198:    */   {
/* 199:199 */     this.bizModel = bizModel;
/* 200:    */   }
/* 201:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayZdatafrontCommonQueryRequest
 * JD-Core Version:    0.7.0.1
 */