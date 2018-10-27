/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayUploadRequest;
/*   5:    */ import com.alipay.api.FileItem;
/*   6:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   7:    */ import com.alipay.api.response.AlipayOpenPublicLifeMsgSendResponse;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.List;
/*  10:    */ import java.util.Map;
/*  11:    */ 
/*  12:    */ public class AlipayOpenPublicLifeMsgSendRequest
/*  13:    */   implements AlipayUploadRequest<AlipayOpenPublicLifeMsgSendResponse>
/*  14:    */ {
/*  15:    */   private AlipayHashMap udfParams;
/*  16: 22 */   private String apiVersion = "1.0";
/*  17:    */   private String category;
/*  18:    */   private String content;
/*  19:    */   private FileItem cover;
/*  20:    */   private String desc;
/*  21:    */   private String msgType;
/*  22:    */   private String sourceExtInfo;
/*  23:    */   private String title;
/*  24:    */   private String uniqueMsgId;
/*  25:    */   private String videoLength;
/*  26:    */   private List<String> videoSamples;
/*  27:    */   private String videoSize;
/*  28:    */   private String videoSource;
/*  29:    */   private String videoUrl;
/*  30:    */   private String terminalType;
/*  31:    */   private String terminalInfo;
/*  32:    */   private String prodCode;
/*  33:    */   private String notifyUrl;
/*  34:    */   private String returnUrl;
/*  35:    */   
/*  36:    */   public void setCategory(String category)
/*  37:    */   {
/*  38:101 */     this.category = category;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getCategory()
/*  42:    */   {
/*  43:104 */     return this.category;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setContent(String content)
/*  47:    */   {
/*  48:108 */     this.content = content;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getContent()
/*  52:    */   {
/*  53:111 */     return this.content;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setCover(FileItem cover)
/*  57:    */   {
/*  58:115 */     this.cover = cover;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public FileItem getCover()
/*  62:    */   {
/*  63:118 */     return this.cover;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setDesc(String desc)
/*  67:    */   {
/*  68:122 */     this.desc = desc;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getDesc()
/*  72:    */   {
/*  73:125 */     return this.desc;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setMsgType(String msgType)
/*  77:    */   {
/*  78:129 */     this.msgType = msgType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getMsgType()
/*  82:    */   {
/*  83:132 */     return this.msgType;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setSourceExtInfo(String sourceExtInfo)
/*  87:    */   {
/*  88:136 */     this.sourceExtInfo = sourceExtInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getSourceExtInfo()
/*  92:    */   {
/*  93:139 */     return this.sourceExtInfo;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTitle(String title)
/*  97:    */   {
/*  98:143 */     this.title = title;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTitle()
/* 102:    */   {
/* 103:146 */     return this.title;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setUniqueMsgId(String uniqueMsgId)
/* 107:    */   {
/* 108:150 */     this.uniqueMsgId = uniqueMsgId;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getUniqueMsgId()
/* 112:    */   {
/* 113:153 */     return this.uniqueMsgId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setVideoLength(String videoLength)
/* 117:    */   {
/* 118:157 */     this.videoLength = videoLength;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getVideoLength()
/* 122:    */   {
/* 123:160 */     return this.videoLength;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setVideoSamples(List<String> videoSamples)
/* 127:    */   {
/* 128:164 */     this.videoSamples = videoSamples;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public List<String> getVideoSamples()
/* 132:    */   {
/* 133:167 */     return this.videoSamples;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setVideoSize(String videoSize)
/* 137:    */   {
/* 138:171 */     this.videoSize = videoSize;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getVideoSize()
/* 142:    */   {
/* 143:174 */     return this.videoSize;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setVideoSource(String videoSource)
/* 147:    */   {
/* 148:178 */     this.videoSource = videoSource;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getVideoSource()
/* 152:    */   {
/* 153:181 */     return this.videoSource;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setVideoUrl(String videoUrl)
/* 157:    */   {
/* 158:185 */     this.videoUrl = videoUrl;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getVideoUrl()
/* 162:    */   {
/* 163:188 */     return this.videoUrl;
/* 164:    */   }
/* 165:    */   
/* 166:195 */   private boolean needEncrypt = false;
/* 167:196 */   private AlipayObject bizModel = null;
/* 168:    */   
/* 169:    */   public String getNotifyUrl()
/* 170:    */   {
/* 171:199 */     return this.notifyUrl;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setNotifyUrl(String notifyUrl)
/* 175:    */   {
/* 176:203 */     this.notifyUrl = notifyUrl;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public String getReturnUrl()
/* 180:    */   {
/* 181:207 */     return this.returnUrl;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setReturnUrl(String returnUrl)
/* 185:    */   {
/* 186:211 */     this.returnUrl = returnUrl;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public String getApiVersion()
/* 190:    */   {
/* 191:215 */     return this.apiVersion;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void setApiVersion(String apiVersion)
/* 195:    */   {
/* 196:218 */     this.apiVersion = apiVersion;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setTerminalType(String terminalType)
/* 200:    */   {
/* 201:222 */     this.terminalType = terminalType;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getTerminalType()
/* 205:    */   {
/* 206:226 */     return this.terminalType;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setTerminalInfo(String terminalInfo)
/* 210:    */   {
/* 211:230 */     this.terminalInfo = terminalInfo;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getTerminalInfo()
/* 215:    */   {
/* 216:234 */     return this.terminalInfo;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public String getProdCode()
/* 220:    */   {
/* 221:238 */     return this.prodCode;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setProdCode(String prodCode)
/* 225:    */   {
/* 226:242 */     this.prodCode = prodCode;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public String getApiMethodName()
/* 230:    */   {
/* 231:246 */     return "alipay.open.public.life.msg.send";
/* 232:    */   }
/* 233:    */   
/* 234:    */   public Map<String, String> getTextParams()
/* 235:    */   {
/* 236:250 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 237:251 */     txtParams.put("category", this.category);
/* 238:252 */     txtParams.put("content", this.content);
/* 239:253 */     txtParams.put("desc", this.desc);
/* 240:254 */     txtParams.put("msg_type", this.msgType);
/* 241:255 */     txtParams.put("source_ext_info", this.sourceExtInfo);
/* 242:256 */     txtParams.put("title", this.title);
/* 243:257 */     txtParams.put("unique_msg_id", this.uniqueMsgId);
/* 244:258 */     txtParams.put("video_length", this.videoLength);
/* 245:259 */     txtParams.put("video_samples", this.videoSamples);
/* 246:260 */     txtParams.put("video_size", this.videoSize);
/* 247:261 */     txtParams.put("video_source", this.videoSource);
/* 248:262 */     txtParams.put("video_url", this.videoUrl);
/* 249:263 */     if (this.udfParams != null) {
/* 250:264 */       txtParams.putAll(this.udfParams);
/* 251:    */     }
/* 252:266 */     return txtParams;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void putOtherTextParam(String key, String value)
/* 256:    */   {
/* 257:270 */     if (this.udfParams == null) {
/* 258:271 */       this.udfParams = new AlipayHashMap();
/* 259:    */     }
/* 260:273 */     this.udfParams.put(key, value);
/* 261:    */   }
/* 262:    */   
/* 263:    */   public Map<String, FileItem> getFileParams()
/* 264:    */   {
/* 265:277 */     Map<String, FileItem> params = new HashMap();
/* 266:278 */     params.put("cover", this.cover);
/* 267:279 */     return params;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public Class<AlipayOpenPublicLifeMsgSendResponse> getResponseClass()
/* 271:    */   {
/* 272:283 */     return AlipayOpenPublicLifeMsgSendResponse.class;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public boolean isNeedEncrypt()
/* 276:    */   {
/* 277:288 */     return this.needEncrypt;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 281:    */   {
/* 282:294 */     this.needEncrypt = needEncrypt;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public AlipayObject getBizModel()
/* 286:    */   {
/* 287:299 */     return this.bizModel;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public void setBizModel(AlipayObject bizModel)
/* 291:    */   {
/* 292:305 */     this.bizModel = bizModel;
/* 293:    */   }
/* 294:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipayOpenPublicLifeMsgSendRequest
 * JD-Core Version:    0.7.0.1
 */