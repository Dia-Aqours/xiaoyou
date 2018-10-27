/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayUserAccountSearchResponse;
/*   7:    */ import java.util.Map;

/*   8:    */
/*   9:    */ public class AlipayUserAccountSearchRequest
/*  10:    */   implements AlipayRequest<AlipayUserAccountSearchResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String endTime;
/*  15:    */   private String fields;
/*  16:    */   private String pageNo;
/*  17:    */   private String pageSize;
/*  18:    */   private String startTime;
/*  19:    */   private String type;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   private String returnUrl;
/*  25:    */   
/*  26:    */   public void setEndTime(String endTime)
/*  27:    */   {
/*  28: 52 */     this.endTime = endTime;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getEndTime()
/*  32:    */   {
/*  33: 55 */     return this.endTime;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setFields(String fields)
/*  37:    */   {
/*  38: 59 */     this.fields = fields;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getFields()
/*  42:    */   {
/*  43: 62 */     return this.fields;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setPageNo(String pageNo)
/*  47:    */   {
/*  48: 66 */     this.pageNo = pageNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getPageNo()
/*  52:    */   {
/*  53: 69 */     return this.pageNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setPageSize(String pageSize)
/*  57:    */   {
/*  58: 73 */     this.pageSize = pageSize;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getPageSize()
/*  62:    */   {
/*  63: 76 */     return this.pageSize;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setStartTime(String startTime)
/*  67:    */   {
/*  68: 80 */     this.startTime = startTime;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getStartTime()
/*  72:    */   {
/*  73: 83 */     return this.startTime;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setType(String type)
/*  77:    */   {
/*  78: 87 */     this.type = type;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getType()
/*  82:    */   {
/*  83: 90 */     return this.type;
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
/* 151:149 */     return "alipay.user.account.search";
/* 152:    */   }
/* 153:    */   
/* 154:    */   public Map<String, String> getTextParams()
/* 155:    */   {
/* 156:153 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 157:154 */     txtParams.put("end_time", this.endTime);
/* 158:155 */     txtParams.put("fields", this.fields);
/* 159:156 */     txtParams.put("page_no", this.pageNo);
/* 160:157 */     txtParams.put("page_size", this.pageSize);
/* 161:158 */     txtParams.put("start_time", this.startTime);
/* 162:159 */     txtParams.put("type", this.type);
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
/* 177:    */   public Class<AlipayUserAccountSearchResponse> getResponseClass()
/* 178:    */   {
/* 179:174 */     return AlipayUserAccountSearchResponse.class;
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

 * Qualified Name:     com.alipay.api.request.AlipayUserAccountSearchRequest

 * JD-Core Version:    0.7.0.1

 */