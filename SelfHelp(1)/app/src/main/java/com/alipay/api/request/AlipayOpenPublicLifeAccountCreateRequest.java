/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayUploadRequest;
/*   5:    */ import com.alipay.api.FileItem;
/*   6:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   7:    */ import com.alipay.api.response.AlipayOpenPublicLifeAccountCreateResponse;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.Map;

/*  10:    */
/*  11:    */ public class AlipayOpenPublicLifeAccountCreateRequest
/*  12:    */   implements AlipayUploadRequest<AlipayOpenPublicLifeAccountCreateResponse>
/*  13:    */ {
/*  14:    */   private AlipayHashMap udfParams;
/*  15: 21 */   private String apiVersion = "1.0";
/*  16:    */   private FileItem background;
/*  17:    */   private String catagoryId;
/*  18:    */   private String contactEmail;
/*  19:    */   private String contactTel;
/*  20:    */   private String content;
/*  21:    */   private String customerTel;
/*  22:    */   private String lifeName;
/*  23:    */   private FileItem logo;
/*  24:    */   private String userId;
/*  25:    */   private String terminalType;
/*  26:    */   private String terminalInfo;
/*  27:    */   private String prodCode;
/*  28:    */   private String notifyUrl;
/*  29:    */   private String returnUrl;
/*  30:    */   
/*  31:    */   public void setBackground(FileItem background)
/*  32:    */   {
/*  33: 70 */     this.background = background;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public FileItem getBackground()
/*  37:    */   {
/*  38: 73 */     return this.background;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setCatagoryId(String catagoryId)
/*  42:    */   {
/*  43: 77 */     this.catagoryId = catagoryId;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getCatagoryId()
/*  47:    */   {
/*  48: 80 */     return this.catagoryId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setContactEmail(String contactEmail)
/*  52:    */   {
/*  53: 84 */     this.contactEmail = contactEmail;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getContactEmail()
/*  57:    */   {
/*  58: 87 */     return this.contactEmail;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setContactTel(String contactTel)
/*  62:    */   {
/*  63: 91 */     this.contactTel = contactTel;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getContactTel()
/*  67:    */   {
/*  68: 94 */     return this.contactTel;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setContent(String content)
/*  72:    */   {
/*  73: 98 */     this.content = content;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getContent()
/*  77:    */   {
/*  78:101 */     return this.content;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setCustomerTel(String customerTel)
/*  82:    */   {
/*  83:105 */     this.customerTel = customerTel;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getCustomerTel()
/*  87:    */   {
/*  88:108 */     return this.customerTel;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setLifeName(String lifeName)
/*  92:    */   {
/*  93:112 */     this.lifeName = lifeName;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getLifeName()
/*  97:    */   {
/*  98:115 */     return this.lifeName;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setLogo(FileItem logo)
/* 102:    */   {
/* 103:119 */     this.logo = logo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public FileItem getLogo()
/* 107:    */   {
/* 108:122 */     return this.logo;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setUserId(String userId)
/* 112:    */   {
/* 113:126 */     this.userId = userId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getUserId()
/* 117:    */   {
/* 118:129 */     return this.userId;
/* 119:    */   }
/* 120:    */   
/* 121:136 */   private boolean needEncrypt = false;
/* 122:137 */   private AlipayObject bizModel = null;
/* 123:    */   
/* 124:    */   public String getNotifyUrl()
/* 125:    */   {
/* 126:140 */     return this.notifyUrl;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setNotifyUrl(String notifyUrl)
/* 130:    */   {
/* 131:144 */     this.notifyUrl = notifyUrl;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getReturnUrl()
/* 135:    */   {
/* 136:148 */     return this.returnUrl;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setReturnUrl(String returnUrl)
/* 140:    */   {
/* 141:152 */     this.returnUrl = returnUrl;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getApiVersion()
/* 145:    */   {
/* 146:156 */     return this.apiVersion;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setApiVersion(String apiVersion)
/* 150:    */   {
/* 151:159 */     this.apiVersion = apiVersion;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setTerminalType(String terminalType)
/* 155:    */   {
/* 156:163 */     this.terminalType = terminalType;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getTerminalType()
/* 160:    */   {
/* 161:167 */     return this.terminalType;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setTerminalInfo(String terminalInfo)
/* 165:    */   {
/* 166:171 */     this.terminalInfo = terminalInfo;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getTerminalInfo()
/* 170:    */   {
/* 171:175 */     return this.terminalInfo;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getProdCode()
/* 175:    */   {
/* 176:179 */     return this.prodCode;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setProdCode(String prodCode)
/* 180:    */   {
/* 181:183 */     this.prodCode = prodCode;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getApiMethodName()
/* 185:    */   {
/* 186:187 */     return "alipay.open.public.life.account.create";
/* 187:    */   }
/* 188:    */   
/* 189:    */   public Map<String, String> getTextParams()
/* 190:    */   {
/* 191:191 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 192:192 */     txtParams.put("catagory_id", this.catagoryId);
/* 193:193 */     txtParams.put("contact_email", this.contactEmail);
/* 194:194 */     txtParams.put("contact_tel", this.contactTel);
/* 195:195 */     txtParams.put("content", this.content);
/* 196:196 */     txtParams.put("customer_tel", this.customerTel);
/* 197:197 */     txtParams.put("life_name", this.lifeName);
/* 198:198 */     txtParams.put("user_id", this.userId);
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
/* 213:    */   public Map<String, FileItem> getFileParams()
/* 214:    */   {
/* 215:213 */     Map<String, FileItem> params = new HashMap();
/* 216:214 */     params.put("background", this.background);
/* 217:215 */     params.put("logo", this.logo);
/* 218:216 */     return params;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public Class<AlipayOpenPublicLifeAccountCreateResponse> getResponseClass()
/* 222:    */   {
/* 223:220 */     return AlipayOpenPublicLifeAccountCreateResponse.class;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public boolean isNeedEncrypt()
/* 227:    */   {
/* 228:225 */     return this.needEncrypt;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 232:    */   {
/* 233:231 */     this.needEncrypt = needEncrypt;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public AlipayObject getBizModel()
/* 237:    */   {
/* 238:236 */     return this.bizModel;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void setBizModel(AlipayObject bizModel)
/* 242:    */   {
/* 243:242 */     this.bizModel = bizModel;
/* 244:    */   }
/* 245:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.request.AlipayOpenPublicLifeAccountCreateRequest

 * JD-Core Version:    0.7.0.1

 */