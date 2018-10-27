/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayUploadRequest;
/*   5:    */ import com.alipay.api.FileItem;
/*   6:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   7:    */ import com.alipay.api.response.ZhimaDataBatchFeedbackResponse;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.Map;
/*  10:    */ 
/*  11:    */ public class ZhimaDataBatchFeedbackRequest
/*  12:    */   implements AlipayUploadRequest<ZhimaDataBatchFeedbackResponse>
/*  13:    */ {
/*  14:    */   private AlipayHashMap udfParams;
/*  15: 21 */   private String apiVersion = "1.0";
/*  16:    */   private String bizExtParams;
/*  17:    */   private String columns;
/*  18:    */   private FileItem file;
/*  19:    */   private String fileCharset;
/*  20:    */   private String fileDescription;
/*  21:    */   private String fileType;
/*  22:    */   private String primaryKeyColumns;
/*  23:    */   private String records;
/*  24:    */   private String terminalType;
/*  25:    */   private String terminalInfo;
/*  26:    */   private String prodCode;
/*  27:    */   private String notifyUrl;
/*  28:    */   private String returnUrl;
/*  29:    */   
/*  30:    */   public void setBizExtParams(String bizExtParams)
/*  31:    */   {
/*  32: 64 */     this.bizExtParams = bizExtParams;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getBizExtParams()
/*  36:    */   {
/*  37: 67 */     return this.bizExtParams;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setColumns(String columns)
/*  41:    */   {
/*  42: 71 */     this.columns = columns;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getColumns()
/*  46:    */   {
/*  47: 74 */     return this.columns;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setFile(FileItem file)
/*  51:    */   {
/*  52: 78 */     this.file = file;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public FileItem getFile()
/*  56:    */   {
/*  57: 81 */     return this.file;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setFileCharset(String fileCharset)
/*  61:    */   {
/*  62: 85 */     this.fileCharset = fileCharset;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getFileCharset()
/*  66:    */   {
/*  67: 88 */     return this.fileCharset;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setFileDescription(String fileDescription)
/*  71:    */   {
/*  72: 92 */     this.fileDescription = fileDescription;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getFileDescription()
/*  76:    */   {
/*  77: 95 */     return this.fileDescription;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setFileType(String fileType)
/*  81:    */   {
/*  82: 99 */     this.fileType = fileType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getFileType()
/*  86:    */   {
/*  87:102 */     return this.fileType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setPrimaryKeyColumns(String primaryKeyColumns)
/*  91:    */   {
/*  92:106 */     this.primaryKeyColumns = primaryKeyColumns;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getPrimaryKeyColumns()
/*  96:    */   {
/*  97:109 */     return this.primaryKeyColumns;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setRecords(String records)
/* 101:    */   {
/* 102:113 */     this.records = records;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getRecords()
/* 106:    */   {
/* 107:116 */     return this.records;
/* 108:    */   }
/* 109:    */   
/* 110:123 */   private boolean needEncrypt = false;
/* 111:124 */   private AlipayObject bizModel = null;
/* 112:    */   
/* 113:    */   public String getNotifyUrl()
/* 114:    */   {
/* 115:127 */     return this.notifyUrl;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setNotifyUrl(String notifyUrl)
/* 119:    */   {
/* 120:131 */     this.notifyUrl = notifyUrl;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getReturnUrl()
/* 124:    */   {
/* 125:135 */     return this.returnUrl;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setReturnUrl(String returnUrl)
/* 129:    */   {
/* 130:139 */     this.returnUrl = returnUrl;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getApiVersion()
/* 134:    */   {
/* 135:143 */     return this.apiVersion;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setApiVersion(String apiVersion)
/* 139:    */   {
/* 140:146 */     this.apiVersion = apiVersion;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setTerminalType(String terminalType)
/* 144:    */   {
/* 145:150 */     this.terminalType = terminalType;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getTerminalType()
/* 149:    */   {
/* 150:154 */     return this.terminalType;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setTerminalInfo(String terminalInfo)
/* 154:    */   {
/* 155:158 */     this.terminalInfo = terminalInfo;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getTerminalInfo()
/* 159:    */   {
/* 160:162 */     return this.terminalInfo;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getProdCode()
/* 164:    */   {
/* 165:166 */     return this.prodCode;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setProdCode(String prodCode)
/* 169:    */   {
/* 170:170 */     this.prodCode = prodCode;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getApiMethodName()
/* 174:    */   {
/* 175:174 */     return "zhima.data.batch.feedback";
/* 176:    */   }
/* 177:    */   
/* 178:    */   public Map<String, String> getTextParams()
/* 179:    */   {
/* 180:178 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 181:179 */     txtParams.put("biz_ext_params", this.bizExtParams);
/* 182:180 */     txtParams.put("columns", this.columns);
/* 183:181 */     txtParams.put("file_charset", this.fileCharset);
/* 184:182 */     txtParams.put("file_description", this.fileDescription);
/* 185:183 */     txtParams.put("file_type", this.fileType);
/* 186:184 */     txtParams.put("primary_key_columns", this.primaryKeyColumns);
/* 187:185 */     txtParams.put("records", this.records);
/* 188:186 */     if (this.udfParams != null) {
/* 189:187 */       txtParams.putAll(this.udfParams);
/* 190:    */     }
/* 191:189 */     return txtParams;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void putOtherTextParam(String key, String value)
/* 195:    */   {
/* 196:193 */     if (this.udfParams == null) {
/* 197:194 */       this.udfParams = new AlipayHashMap();
/* 198:    */     }
/* 199:196 */     this.udfParams.put(key, value);
/* 200:    */   }
/* 201:    */   
/* 202:    */   public Map<String, FileItem> getFileParams()
/* 203:    */   {
/* 204:200 */     Map<String, FileItem> params = new HashMap();
/* 205:201 */     params.put("file", this.file);
/* 206:202 */     return params;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public Class<ZhimaDataBatchFeedbackResponse> getResponseClass()
/* 210:    */   {
/* 211:206 */     return ZhimaDataBatchFeedbackResponse.class;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public boolean isNeedEncrypt()
/* 215:    */   {
/* 216:211 */     return this.needEncrypt;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 220:    */   {
/* 221:217 */     this.needEncrypt = needEncrypt;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public AlipayObject getBizModel()
/* 225:    */   {
/* 226:222 */     return this.bizModel;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setBizModel(AlipayObject bizModel)
/* 230:    */   {
/* 231:228 */     this.bizModel = bizModel;
/* 232:    */   }
/* 233:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.ZhimaDataBatchFeedbackRequest
 * JD-Core Version:    0.7.0.1
 */