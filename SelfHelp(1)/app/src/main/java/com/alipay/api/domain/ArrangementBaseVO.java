/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class ArrangementBaseVO
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5716722949282359938L;
/*  11:    */   @ApiField("app_id")
/*  12:    */   private String appId;
/*  13:    */   @ApiField("arrangement_institution_code")
/*  14:    */   private String arrangementInstitutionCode;
/*  15:    */   @ApiField("arrangement_name")
/*  16:    */   private String arrangementName;
/*  17:    */   @ApiField("arrangement_no")
/*  18:    */   private String arrangementNo;
/*  19:    */   @ApiField("arrangement_type")
/*  20:    */   private String arrangementType;
/*  21:    */   @ApiField("arrangement_version")
/*  22:    */   private String arrangementVersion;
/*  23:    */   @ApiField("channel_code")
/*  24:    */   private String channelCode;
/*  25:    */   @ApiField("gmt_end")
/*  26:    */   private String gmtEnd;
/*  27:    */   @ApiField("gmt_expired")
/*  28:    */   private Date gmtExpired;
/*  29:    */   @ApiField("gmt_invalid_due")
/*  30:    */   private String gmtInvalidDue;
/*  31:    */   @ApiField("gmt_sign")
/*  32:    */   private Date gmtSign;
/*  33:    */   @ApiField("gmt_vald_due")
/*  34:    */   private String gmtValdDue;
/*  35:    */   @ApiField("gmt_vrsn")
/*  36:    */   private Date gmtVrsn;
/*  37:    */   @ApiField("ip_role_id")
/*  38:    */   private String ipRoleId;
/*  39:    */   @ApiField("last_moder")
/*  40:    */   private String lastModer;
/*  41:    */   @ApiField("mark_type")
/*  42:    */   private String markType;
/*  43:    */   @ApiField("memo")
/*  44:    */   private String memo;
/*  45:    */   @ApiField("moder_type")
/*  46:    */   private String moderType;
/*  47:    */   @ApiField("pd_mark")
/*  48:    */   private String pdMark;
/*  49:    */   @ApiField("prod_code")
/*  50:    */   private String prodCode;
/*  51:    */   @ApiField("prod_name")
/*  52:    */   private String prodName;
/*  53:    */   @ApiField("prod_version")
/*  54:    */   private String prodVersion;
/*  55:    */   @ApiField("ps_code")
/*  56:    */   private String psCode;
/*  57:    */   @ApiField("ps_id")
/*  58:    */   private String psId;
/*  59:    */   @ApiField("ps_name")
/*  60:    */   private String psName;
/*  61:    */   @ApiField("status")
/*  62:    */   private String status;
/*  63:    */   @ApiField("template_prod_code")
/*  64:    */   private String templateProdCode;
/*  65:    */   @ApiField("template_prod_version")
/*  66:    */   private String templateProdVersion;
/*  67:    */   
/*  68:    */   public String getAppId()
/*  69:    */   {
/*  70:187 */     return this.appId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setAppId(String appId)
/*  74:    */   {
/*  75:190 */     this.appId = appId;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getArrangementInstitutionCode()
/*  79:    */   {
/*  80:194 */     return this.arrangementInstitutionCode;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setArrangementInstitutionCode(String arrangementInstitutionCode)
/*  84:    */   {
/*  85:197 */     this.arrangementInstitutionCode = arrangementInstitutionCode;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getArrangementName()
/*  89:    */   {
/*  90:201 */     return this.arrangementName;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setArrangementName(String arrangementName)
/*  94:    */   {
/*  95:204 */     this.arrangementName = arrangementName;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getArrangementNo()
/*  99:    */   {
/* 100:208 */     return this.arrangementNo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setArrangementNo(String arrangementNo)
/* 104:    */   {
/* 105:211 */     this.arrangementNo = arrangementNo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getArrangementType()
/* 109:    */   {
/* 110:215 */     return this.arrangementType;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setArrangementType(String arrangementType)
/* 114:    */   {
/* 115:218 */     this.arrangementType = arrangementType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getArrangementVersion()
/* 119:    */   {
/* 120:222 */     return this.arrangementVersion;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setArrangementVersion(String arrangementVersion)
/* 124:    */   {
/* 125:225 */     this.arrangementVersion = arrangementVersion;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getChannelCode()
/* 129:    */   {
/* 130:229 */     return this.channelCode;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setChannelCode(String channelCode)
/* 134:    */   {
/* 135:232 */     this.channelCode = channelCode;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getGmtEnd()
/* 139:    */   {
/* 140:236 */     return this.gmtEnd;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setGmtEnd(String gmtEnd)
/* 144:    */   {
/* 145:239 */     this.gmtEnd = gmtEnd;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public Date getGmtExpired()
/* 149:    */   {
/* 150:243 */     return this.gmtExpired;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setGmtExpired(Date gmtExpired)
/* 154:    */   {
/* 155:246 */     this.gmtExpired = gmtExpired;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getGmtInvalidDue()
/* 159:    */   {
/* 160:250 */     return this.gmtInvalidDue;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setGmtInvalidDue(String gmtInvalidDue)
/* 164:    */   {
/* 165:253 */     this.gmtInvalidDue = gmtInvalidDue;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public Date getGmtSign()
/* 169:    */   {
/* 170:257 */     return this.gmtSign;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setGmtSign(Date gmtSign)
/* 174:    */   {
/* 175:260 */     this.gmtSign = gmtSign;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getGmtValdDue()
/* 179:    */   {
/* 180:264 */     return this.gmtValdDue;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setGmtValdDue(String gmtValdDue)
/* 184:    */   {
/* 185:267 */     this.gmtValdDue = gmtValdDue;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public Date getGmtVrsn()
/* 189:    */   {
/* 190:271 */     return this.gmtVrsn;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setGmtVrsn(Date gmtVrsn)
/* 194:    */   {
/* 195:274 */     this.gmtVrsn = gmtVrsn;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getIpRoleId()
/* 199:    */   {
/* 200:278 */     return this.ipRoleId;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setIpRoleId(String ipRoleId)
/* 204:    */   {
/* 205:281 */     this.ipRoleId = ipRoleId;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getLastModer()
/* 209:    */   {
/* 210:285 */     return this.lastModer;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setLastModer(String lastModer)
/* 214:    */   {
/* 215:288 */     this.lastModer = lastModer;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getMarkType()
/* 219:    */   {
/* 220:292 */     return this.markType;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setMarkType(String markType)
/* 224:    */   {
/* 225:295 */     this.markType = markType;
/* 226:    */   }
/* 227:    */   
/* 228:    */   public String getMemo()
/* 229:    */   {
/* 230:299 */     return this.memo;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public void setMemo(String memo)
/* 234:    */   {
/* 235:302 */     this.memo = memo;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public String getModerType()
/* 239:    */   {
/* 240:306 */     return this.moderType;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public void setModerType(String moderType)
/* 244:    */   {
/* 245:309 */     this.moderType = moderType;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public String getPdMark()
/* 249:    */   {
/* 250:313 */     return this.pdMark;
/* 251:    */   }
/* 252:    */   
/* 253:    */   public void setPdMark(String pdMark)
/* 254:    */   {
/* 255:316 */     this.pdMark = pdMark;
/* 256:    */   }
/* 257:    */   
/* 258:    */   public String getProdCode()
/* 259:    */   {
/* 260:320 */     return this.prodCode;
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void setProdCode(String prodCode)
/* 264:    */   {
/* 265:323 */     this.prodCode = prodCode;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public String getProdName()
/* 269:    */   {
/* 270:327 */     return this.prodName;
/* 271:    */   }
/* 272:    */   
/* 273:    */   public void setProdName(String prodName)
/* 274:    */   {
/* 275:330 */     this.prodName = prodName;
/* 276:    */   }
/* 277:    */   
/* 278:    */   public String getProdVersion()
/* 279:    */   {
/* 280:334 */     return this.prodVersion;
/* 281:    */   }
/* 282:    */   
/* 283:    */   public void setProdVersion(String prodVersion)
/* 284:    */   {
/* 285:337 */     this.prodVersion = prodVersion;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public String getPsCode()
/* 289:    */   {
/* 290:341 */     return this.psCode;
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void setPsCode(String psCode)
/* 294:    */   {
/* 295:344 */     this.psCode = psCode;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public String getPsId()
/* 299:    */   {
/* 300:348 */     return this.psId;
/* 301:    */   }
/* 302:    */   
/* 303:    */   public void setPsId(String psId)
/* 304:    */   {
/* 305:351 */     this.psId = psId;
/* 306:    */   }
/* 307:    */   
/* 308:    */   public String getPsName()
/* 309:    */   {
/* 310:355 */     return this.psName;
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void setPsName(String psName)
/* 314:    */   {
/* 315:358 */     this.psName = psName;
/* 316:    */   }
/* 317:    */   
/* 318:    */   public String getStatus()
/* 319:    */   {
/* 320:362 */     return this.status;
/* 321:    */   }
/* 322:    */   
/* 323:    */   public void setStatus(String status)
/* 324:    */   {
/* 325:365 */     this.status = status;
/* 326:    */   }
/* 327:    */   
/* 328:    */   public String getTemplateProdCode()
/* 329:    */   {
/* 330:369 */     return this.templateProdCode;
/* 331:    */   }
/* 332:    */   
/* 333:    */   public void setTemplateProdCode(String templateProdCode)
/* 334:    */   {
/* 335:372 */     this.templateProdCode = templateProdCode;
/* 336:    */   }
/* 337:    */   
/* 338:    */   public String getTemplateProdVersion()
/* 339:    */   {
/* 340:376 */     return this.templateProdVersion;
/* 341:    */   }
/* 342:    */   
/* 343:    */   public void setTemplateProdVersion(String templateProdVersion)
/* 344:    */   {
/* 345:379 */     this.templateProdVersion = templateProdVersion;
/* 346:    */   }
/* 347:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.ArrangementBaseVO
 * JD-Core Version:    0.7.0.1
 */