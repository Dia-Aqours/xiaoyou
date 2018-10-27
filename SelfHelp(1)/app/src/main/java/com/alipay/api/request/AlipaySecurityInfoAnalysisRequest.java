/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipaySecurityInfoAnalysisResponse;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipaySecurityInfoAnalysisRequest
/*  10:    */   implements AlipayRequest<AlipaySecurityInfoAnalysisResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String envClientBaseBand;
/*  15:    */   private String envClientBaseStation;
/*  16:    */   private String envClientCoordinates;
/*  17:    */   private String envClientImei;
/*  18:    */   private String envClientImsi;
/*  19:    */   private String envClientIosUdid;
/*  20:    */   private String envClientIp;
/*  21:    */   private String envClientMac;
/*  22:    */   private String envClientScreen;
/*  23:    */   private String envClientUuid;
/*  24:    */   private String jsTokenId;
/*  25:    */   private String partnerId;
/*  26:    */   private String sceneCode;
/*  27:    */   private String userAccountNo;
/*  28:    */   private String userBindBankcard;
/*  29:    */   private String userBindBankcardType;
/*  30:    */   private String userBindMobile;
/*  31:    */   private String userIdentityType;
/*  32:    */   private String userRealName;
/*  33:    */   private String userRegDate;
/*  34:    */   private String userRegEmail;
/*  35:    */   private String userRegMobile;
/*  36:    */   private String userrIdentityNo;
/*  37:    */   private String terminalType;
/*  38:    */   private String terminalInfo;
/*  39:    */   private String prodCode;
/*  40:    */   private String notifyUrl;
/*  41:    */   private String returnUrl;
/*  42:    */   
/*  43:    */   public void setEnvClientBaseBand(String envClientBaseBand)
/*  44:    */   {
/*  45:137 */     this.envClientBaseBand = envClientBaseBand;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getEnvClientBaseBand()
/*  49:    */   {
/*  50:140 */     return this.envClientBaseBand;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setEnvClientBaseStation(String envClientBaseStation)
/*  54:    */   {
/*  55:144 */     this.envClientBaseStation = envClientBaseStation;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getEnvClientBaseStation()
/*  59:    */   {
/*  60:147 */     return this.envClientBaseStation;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setEnvClientCoordinates(String envClientCoordinates)
/*  64:    */   {
/*  65:151 */     this.envClientCoordinates = envClientCoordinates;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getEnvClientCoordinates()
/*  69:    */   {
/*  70:154 */     return this.envClientCoordinates;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setEnvClientImei(String envClientImei)
/*  74:    */   {
/*  75:158 */     this.envClientImei = envClientImei;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getEnvClientImei()
/*  79:    */   {
/*  80:161 */     return this.envClientImei;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setEnvClientImsi(String envClientImsi)
/*  84:    */   {
/*  85:165 */     this.envClientImsi = envClientImsi;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getEnvClientImsi()
/*  89:    */   {
/*  90:168 */     return this.envClientImsi;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setEnvClientIosUdid(String envClientIosUdid)
/*  94:    */   {
/*  95:172 */     this.envClientIosUdid = envClientIosUdid;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getEnvClientIosUdid()
/*  99:    */   {
/* 100:175 */     return this.envClientIosUdid;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setEnvClientIp(String envClientIp)
/* 104:    */   {
/* 105:179 */     this.envClientIp = envClientIp;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getEnvClientIp()
/* 109:    */   {
/* 110:182 */     return this.envClientIp;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setEnvClientMac(String envClientMac)
/* 114:    */   {
/* 115:186 */     this.envClientMac = envClientMac;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getEnvClientMac()
/* 119:    */   {
/* 120:189 */     return this.envClientMac;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setEnvClientScreen(String envClientScreen)
/* 124:    */   {
/* 125:193 */     this.envClientScreen = envClientScreen;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getEnvClientScreen()
/* 129:    */   {
/* 130:196 */     return this.envClientScreen;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setEnvClientUuid(String envClientUuid)
/* 134:    */   {
/* 135:200 */     this.envClientUuid = envClientUuid;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getEnvClientUuid()
/* 139:    */   {
/* 140:203 */     return this.envClientUuid;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setJsTokenId(String jsTokenId)
/* 144:    */   {
/* 145:207 */     this.jsTokenId = jsTokenId;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getJsTokenId()
/* 149:    */   {
/* 150:210 */     return this.jsTokenId;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setPartnerId(String partnerId)
/* 154:    */   {
/* 155:214 */     this.partnerId = partnerId;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getPartnerId()
/* 159:    */   {
/* 160:217 */     return this.partnerId;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setSceneCode(String sceneCode)
/* 164:    */   {
/* 165:221 */     this.sceneCode = sceneCode;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getSceneCode()
/* 169:    */   {
/* 170:224 */     return this.sceneCode;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setUserAccountNo(String userAccountNo)
/* 174:    */   {
/* 175:228 */     this.userAccountNo = userAccountNo;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getUserAccountNo()
/* 179:    */   {
/* 180:231 */     return this.userAccountNo;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setUserBindBankcard(String userBindBankcard)
/* 184:    */   {
/* 185:235 */     this.userBindBankcard = userBindBankcard;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getUserBindBankcard()
/* 189:    */   {
/* 190:238 */     return this.userBindBankcard;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setUserBindBankcardType(String userBindBankcardType)
/* 194:    */   {
/* 195:242 */     this.userBindBankcardType = userBindBankcardType;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getUserBindBankcardType()
/* 199:    */   {
/* 200:245 */     return this.userBindBankcardType;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setUserBindMobile(String userBindMobile)
/* 204:    */   {
/* 205:249 */     this.userBindMobile = userBindMobile;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getUserBindMobile()
/* 209:    */   {
/* 210:252 */     return this.userBindMobile;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setUserIdentityType(String userIdentityType)
/* 214:    */   {
/* 215:256 */     this.userIdentityType = userIdentityType;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getUserIdentityType()
/* 219:    */   {
/* 220:259 */     return this.userIdentityType;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setUserRealName(String userRealName)
/* 224:    */   {
/* 225:263 */     this.userRealName = userRealName;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public String getUserRealName()
/* 229:    */   {
/* 230:266 */     return this.userRealName;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void setUserRegDate(String userRegDate)
/* 234:    */   {
/* 235:270 */     this.userRegDate = userRegDate;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public String getUserRegDate()
/* 239:    */   {
/* 240:273 */     return this.userRegDate;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public void setUserRegEmail(String userRegEmail)
/* 244:    */   {
/* 245:277 */     this.userRegEmail = userRegEmail;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public String getUserRegEmail()
/* 249:    */   {
/* 250:280 */     return this.userRegEmail;
/* 251:    */   }
/* 252:    */   
/* 253:    */   public void setUserRegMobile(String userRegMobile)
/* 254:    */   {
/* 255:284 */     this.userRegMobile = userRegMobile;
/* 256:    */   }
/* 257:    */   
/* 258:    */   public String getUserRegMobile()
/* 259:    */   {
/* 260:287 */     return this.userRegMobile;
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void setUserrIdentityNo(String userrIdentityNo)
/* 264:    */   {
/* 265:291 */     this.userrIdentityNo = userrIdentityNo;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public String getUserrIdentityNo()
/* 269:    */   {
/* 270:294 */     return this.userrIdentityNo;
/* 271:    */   }
/* 272:    */   
/* 273:301 */   private boolean needEncrypt = false;
/* 274:302 */   private AlipayObject bizModel = null;
/* 275:    */   
/* 276:    */   public String getNotifyUrl()
/* 277:    */   {
/* 278:305 */     return this.notifyUrl;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public void setNotifyUrl(String notifyUrl)
/* 282:    */   {
/* 283:309 */     this.notifyUrl = notifyUrl;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public String getReturnUrl()
/* 287:    */   {
/* 288:313 */     return this.returnUrl;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void setReturnUrl(String returnUrl)
/* 292:    */   {
/* 293:317 */     this.returnUrl = returnUrl;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public String getApiVersion()
/* 297:    */   {
/* 298:321 */     return this.apiVersion;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public void setApiVersion(String apiVersion)
/* 302:    */   {
/* 303:325 */     this.apiVersion = apiVersion;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public void setTerminalType(String terminalType)
/* 307:    */   {
/* 308:329 */     this.terminalType = terminalType;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public String getTerminalType()
/* 312:    */   {
/* 313:333 */     return this.terminalType;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public void setTerminalInfo(String terminalInfo)
/* 317:    */   {
/* 318:337 */     this.terminalInfo = terminalInfo;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public String getTerminalInfo()
/* 322:    */   {
/* 323:341 */     return this.terminalInfo;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public void setProdCode(String prodCode)
/* 327:    */   {
/* 328:345 */     this.prodCode = prodCode;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public String getProdCode()
/* 332:    */   {
/* 333:349 */     return this.prodCode;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public String getApiMethodName()
/* 337:    */   {
/* 338:353 */     return "alipay.security.info.analysis";
/* 339:    */   }
/* 340:    */   
/* 341:    */   public Map<String, String> getTextParams()
/* 342:    */   {
/* 343:357 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 344:358 */     txtParams.put("env_client_base_band", this.envClientBaseBand);
/* 345:359 */     txtParams.put("env_client_base_station", this.envClientBaseStation);
/* 346:360 */     txtParams.put("env_client_coordinates", this.envClientCoordinates);
/* 347:361 */     txtParams.put("env_client_imei", this.envClientImei);
/* 348:362 */     txtParams.put("env_client_imsi", this.envClientImsi);
/* 349:363 */     txtParams.put("env_client_ios_udid", this.envClientIosUdid);
/* 350:364 */     txtParams.put("env_client_ip", this.envClientIp);
/* 351:365 */     txtParams.put("env_client_mac", this.envClientMac);
/* 352:366 */     txtParams.put("env_client_screen", this.envClientScreen);
/* 353:367 */     txtParams.put("env_client_uuid", this.envClientUuid);
/* 354:368 */     txtParams.put("js_token_id", this.jsTokenId);
/* 355:369 */     txtParams.put("partner_id", this.partnerId);
/* 356:370 */     txtParams.put("scene_code", this.sceneCode);
/* 357:371 */     txtParams.put("user_account_no", this.userAccountNo);
/* 358:372 */     txtParams.put("user_bind_bankcard", this.userBindBankcard);
/* 359:373 */     txtParams.put("user_bind_bankcard_type", this.userBindBankcardType);
/* 360:374 */     txtParams.put("user_bind_mobile", this.userBindMobile);
/* 361:375 */     txtParams.put("user_identity_type", this.userIdentityType);
/* 362:376 */     txtParams.put("user_real_name", this.userRealName);
/* 363:377 */     txtParams.put("user_reg_date", this.userRegDate);
/* 364:378 */     txtParams.put("user_reg_email", this.userRegEmail);
/* 365:379 */     txtParams.put("user_reg_mobile", this.userRegMobile);
/* 366:380 */     txtParams.put("userr_identity_no", this.userrIdentityNo);
/* 367:381 */     if (this.udfParams != null) {
/* 368:382 */       txtParams.putAll(this.udfParams);
/* 369:    */     }
/* 370:384 */     return txtParams;
/* 371:    */   }
/* 372:    */   
/* 373:    */   public void putOtherTextParam(String key, String value)
/* 374:    */   {
/* 375:388 */     if (this.udfParams == null) {
/* 376:389 */       this.udfParams = new AlipayHashMap();
/* 377:    */     }
/* 378:391 */     this.udfParams.put(key, value);
/* 379:    */   }
/* 380:    */   
/* 381:    */   public Class<AlipaySecurityInfoAnalysisResponse> getResponseClass()
/* 382:    */   {
/* 383:395 */     return AlipaySecurityInfoAnalysisResponse.class;
/* 384:    */   }
/* 385:    */   
/* 386:    */   public boolean isNeedEncrypt()
/* 387:    */   {
/* 388:401 */     return this.needEncrypt;
/* 389:    */   }
/* 390:    */   
/* 391:    */   public void setNeedEncrypt(boolean needEncrypt)
/* 392:    */   {
/* 393:407 */     this.needEncrypt = needEncrypt;
/* 394:    */   }
/* 395:    */   
/* 396:    */   public AlipayObject getBizModel()
/* 397:    */   {
/* 398:412 */     return this.bizModel;
/* 399:    */   }
/* 400:    */   
/* 401:    */   public void setBizModel(AlipayObject bizModel)
/* 402:    */   {
/* 403:418 */     this.bizModel = bizModel;
/* 404:    */   }
/* 405:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.request.AlipaySecurityInfoAnalysisRequest
 * JD-Core Version:    0.7.0.1
 */