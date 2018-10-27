/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.internal.util.codec.Base64;
/*   5:    */ import java.io.ByteArrayInputStream;
/*   6:    */ import java.io.ByteArrayOutputStream;
/*   7:    */ import java.io.InputStream;
/*   8:    */ import java.io.InputStreamReader;
/*   9:    */ import java.io.StringWriter;
/*  10:    */ import java.security.KeyFactory;
/*  11:    */ import java.security.PrivateKey;
/*  12:    */ import java.security.PublicKey;
/*  13:    */ import java.security.Signature;
/*  14:    */ import java.security.spec.InvalidKeySpecException;
/*  15:    */ import java.security.spec.PKCS8EncodedKeySpec;
/*  16:    */ import java.security.spec.X509EncodedKeySpec;
/*  17:    */ import java.util.ArrayList;
/*  18:    */ import java.util.Collections;
/*  19:    */ import java.util.List;
/*  20:    */ import java.util.Map;
/*  21:    */ import java.util.TreeMap;
/*  22:    */ import javax.crypto.Cipher;
/*  23:    */ 
/*  24:    */ public class AlipaySignature
/*  25:    */ {
/*  26:    */   private static final int MAX_ENCRYPT_BLOCK = 117;
/*  27:    */   private static final int MAX_DECRYPT_BLOCK = 128;
/*  28:    */   
/*  29:    */   public static String getSignatureContent(RequestParametersHolder requestHolder)
/*  30:    */   {
/*  31: 43 */     return getSignContent(getSortedMap(requestHolder));
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static Map<String, String> getSortedMap(RequestParametersHolder requestHolder)
/*  35:    */   {
/*  36: 47 */     Map<String, String> sortedParams = new TreeMap();
/*  37: 48 */     AlipayHashMap appParams = requestHolder.getApplicationParams();
/*  38: 49 */     if ((appParams != null) && (appParams.size() > 0)) {
/*  39: 50 */       sortedParams.putAll(appParams);
/*  40:    */     }
/*  41: 52 */     AlipayHashMap protocalMustParams = requestHolder.getProtocalMustParams();
/*  42: 53 */     if ((protocalMustParams != null) && (protocalMustParams.size() > 0)) {
/*  43: 54 */       sortedParams.putAll(protocalMustParams);
/*  44:    */     }
/*  45: 56 */     AlipayHashMap protocalOptParams = requestHolder.getProtocalOptParams();
/*  46: 57 */     if ((protocalOptParams != null) && (protocalOptParams.size() > 0)) {
/*  47: 58 */       sortedParams.putAll(protocalOptParams);
/*  48:    */     }
/*  49: 61 */     return sortedParams;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public static String getSignContent(Map<String, String> sortedParams)
/*  53:    */   {
/*  54: 70 */     StringBuffer content = new StringBuffer();
/*  55: 71 */     List<String> keys = new ArrayList(sortedParams.keySet());
/*  56: 72 */     Collections.sort(keys);
/*  57: 73 */     int index = 0;
/*  58: 74 */     for (int i = 0; i < keys.size(); i++)
/*  59:    */     {
/*  60: 75 */       String key = (String)keys.get(i);
/*  61: 76 */       String value = (String)sortedParams.get(key);
/*  62: 77 */       if (StringUtils.areNotEmpty(new String[] { key, value }))
/*  63:    */       {
/*  64: 78 */         content.append((index == 0 ? "" : "&") + key + "=" + value);
/*  65: 79 */         index++;
/*  66:    */       }
/*  67:    */     }
/*  68: 82 */     return content.toString();
/*  69:    */   }
/*  70:    */   
/*  71:    */   public static String rsaSign(String content, String privateKey, String charset, String signType)
/*  72:    */     throws AlipayApiException
/*  73:    */   {
/*  74: 97 */     if ("RSA".equals(signType)) {
/*  75: 99 */       return rsaSign(content, privateKey, charset);
/*  76:    */     }
/*  77:100 */     if ("RSA2".equals(signType)) {
/*  78:102 */       return rsa256Sign(content, privateKey, charset);
/*  79:    */     }
/*  80:105 */     throw new AlipayApiException("Sign Type is Not Support : signType=" + signType);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public static String rsa256Sign(String content, String privateKey, String charset)
/*  84:    */     throws AlipayApiException
/*  85:    */   {
/*  86:    */     try
/*  87:    */     {
/*  88:123 */       PrivateKey priKey = getPrivateKeyFromPKCS8("RSA", new ByteArrayInputStream(privateKey.getBytes()));
/*  89:    */       
/*  90:    */ 
/*  91:126 */       Signature signature = Signature.getInstance("SHA256WithRSA");
/*  92:    */       
/*  93:    */ 
/*  94:129 */       signature.initSign(priKey);
/*  95:131 */       if (StringUtils.isEmpty(charset)) {
/*  96:132 */         signature.update(content.getBytes());
/*  97:    */       } else {
/*  98:134 */         signature.update(content.getBytes(charset));
/*  99:    */       }
/* 100:137 */       byte[] signed = signature.sign();
/* 101:    */       
/* 102:139 */       return new String(Base64.encodeBase64(signed));
/* 103:    */     }
/* 104:    */     catch (Exception e)
/* 105:    */     {
/* 106:141 */       throw new AlipayApiException("RSAcontent = " + content + "; charset = " + charset, e);
/* 107:    */     }
/* 108:    */   }
/* 109:    */   
/* 110:    */   public static String rsaSign(String content, String privateKey, String charset)
/* 111:    */     throws AlipayApiException
/* 112:    */   {
/* 113:    */     try
/* 114:    */     {
/* 115:158 */       PrivateKey priKey = getPrivateKeyFromPKCS8("RSA", new ByteArrayInputStream(privateKey.getBytes()));
/* 116:    */       
/* 117:    */ 
/* 118:161 */       Signature signature = Signature.getInstance("SHA1WithRSA");
/* 119:    */       
/* 120:    */ 
/* 121:164 */       signature.initSign(priKey);
/* 122:166 */       if (StringUtils.isEmpty(charset)) {
/* 123:167 */         signature.update(content.getBytes());
/* 124:    */       } else {
/* 125:169 */         signature.update(content.getBytes(charset));
/* 126:    */       }
/* 127:172 */       byte[] signed = signature.sign();
/* 128:    */       
/* 129:174 */       return new String(Base64.encodeBase64(signed));
/* 130:    */     }
/* 131:    */     catch (InvalidKeySpecException ie)
/* 132:    */     {
/* 133:176 */       throw new AlipayApiException("RSA私钥格式不正确，请检查是否正确配置了PKCS8格式的私钥", ie);
/* 134:    */     }
/* 135:    */     catch (Exception e)
/* 136:    */     {
/* 137:178 */       throw new AlipayApiException("RSAcontent = " + content + "; charset = " + charset, e);
/* 138:    */     }
/* 139:    */   }
/* 140:    */   
/* 141:    */   public static String rsaSign(Map<String, String> params, String privateKey, String charset)
/* 142:    */     throws AlipayApiException
/* 143:    */   {
/* 144:184 */     String signContent = getSignContent(params);
/* 145:    */     
/* 146:186 */     return rsaSign(signContent, privateKey, charset);
/* 147:    */   }
/* 148:    */   
/* 149:    */   public static PrivateKey getPrivateKeyFromPKCS8(String algorithm, InputStream ins)
/* 150:    */     throws Exception
/* 151:    */   {
/* 152:192 */     if ((ins == null) || (StringUtils.isEmpty(algorithm))) {
/* 153:193 */       return null;
/* 154:    */     }
/* 155:196 */     KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
/* 156:    */     
/* 157:198 */     byte[] encodedKey = StreamUtil.readText(ins).getBytes();
/* 158:    */     
/* 159:200 */     encodedKey = Base64.decodeBase64(encodedKey);
/* 160:    */     
/* 161:202 */     return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(encodedKey));
/* 162:    */   }
/* 163:    */   
/* 164:    */   public static String getSignCheckContentV1(Map<String, String> params)
/* 165:    */   {
/* 166:206 */     if (params == null) {
/* 167:207 */       return null;
/* 168:    */     }
/* 169:210 */     params.remove("sign");
/* 170:211 */     params.remove("sign_type");
/* 171:    */     
/* 172:213 */     StringBuffer content = new StringBuffer();
/* 173:214 */     List<String> keys = new ArrayList(params.keySet());
/* 174:215 */     Collections.sort(keys);
/* 175:217 */     for (int i = 0; i < keys.size(); i++)
/* 176:    */     {
/* 177:218 */       String key = (String)keys.get(i);
/* 178:219 */       String value = (String)params.get(key);
/* 179:220 */       content.append((i == 0 ? "" : "&") + key + "=" + value);
/* 180:    */     }
/* 181:223 */     return content.toString();
/* 182:    */   }
/* 183:    */   
/* 184:    */   public static String getSignCheckContentV2(Map<String, String> params)
/* 185:    */   {
/* 186:227 */     if (params == null) {
/* 187:228 */       return null;
/* 188:    */     }
/* 189:231 */     params.remove("sign");
/* 190:    */     
/* 191:233 */     StringBuffer content = new StringBuffer();
/* 192:234 */     List<String> keys = new ArrayList(params.keySet());
/* 193:235 */     Collections.sort(keys);
/* 194:237 */     for (int i = 0; i < keys.size(); i++)
/* 195:    */     {
/* 196:238 */       String key = (String)keys.get(i);
/* 197:239 */       String value = (String)params.get(key);
/* 198:240 */       content.append((i == 0 ? "" : "&") + key + "=" + value);
/* 199:    */     }
/* 200:243 */     return content.toString();
/* 201:    */   }
/* 202:    */   
/* 203:    */   public static boolean rsaCheckV1(Map<String, String> params, String publicKey, String charset)
/* 204:    */     throws AlipayApiException
/* 205:    */   {
/* 206:248 */     String sign = (String)params.get("sign");
/* 207:249 */     String content = getSignCheckContentV1(params);
/* 208:    */     
/* 209:251 */     return rsaCheckContent(content, sign, publicKey, charset);
/* 210:    */   }
/* 211:    */   
/* 212:    */   public static boolean rsaCheckV1(Map<String, String> params, String publicKey, String charset, String signType)
/* 213:    */     throws AlipayApiException
/* 214:    */   {
/* 215:256 */     String sign = (String)params.get("sign");
/* 216:257 */     String content = getSignCheckContentV1(params);
/* 217:    */     
/* 218:259 */     return rsaCheck(content, sign, publicKey, charset, signType);
/* 219:    */   }
/* 220:    */   
/* 221:    */   public static boolean rsaCheckV2(Map<String, String> params, String publicKey, String charset)
/* 222:    */     throws AlipayApiException
/* 223:    */   {
/* 224:264 */     String sign = (String)params.get("sign");
/* 225:265 */     String content = getSignCheckContentV2(params);
/* 226:    */     
/* 227:267 */     return rsaCheckContent(content, sign, publicKey, charset);
/* 228:    */   }
/* 229:    */   
/* 230:    */   public static boolean rsaCheckV2(Map<String, String> params, String publicKey, String charset, String signType)
/* 231:    */     throws AlipayApiException
/* 232:    */   {
/* 233:272 */     String sign = (String)params.get("sign");
/* 234:273 */     String content = getSignCheckContentV2(params);
/* 235:    */     
/* 236:275 */     return rsaCheck(content, sign, publicKey, charset, signType);
/* 237:    */   }
/* 238:    */   
/* 239:    */   public static boolean rsaCheck(String content, String sign, String publicKey, String charset, String signType)
/* 240:    */     throws AlipayApiException
/* 241:    */   {
/* 242:281 */     if ("RSA".equals(signType)) {
/* 243:283 */       return rsaCheckContent(content, sign, publicKey, charset);
/* 244:    */     }
/* 245:285 */     if ("RSA2".equals(signType)) {
/* 246:287 */       return rsa256CheckContent(content, sign, publicKey, charset);
/* 247:    */     }
/* 248:291 */     throw new AlipayApiException("Sign Type is Not Support : signType=" + signType);
/* 249:    */   }
/* 250:    */   
/* 251:    */   public static boolean rsa256CheckContent(String content, String sign, String publicKey, String charset)
/* 252:    */     throws AlipayApiException
/* 253:    */   {
/* 254:    */     try
/* 255:    */     {
/* 256:299 */       PublicKey pubKey = getPublicKeyFromX509("RSA", new ByteArrayInputStream(publicKey.getBytes()));
/* 257:    */       
/* 258:    */ 
/* 259:302 */       Signature signature = Signature.getInstance("SHA256WithRSA");
/* 260:    */       
/* 261:    */ 
/* 262:305 */       signature.initVerify(pubKey);
/* 263:307 */       if (StringUtils.isEmpty(charset)) {
/* 264:308 */         signature.update(content.getBytes());
/* 265:    */       } else {
/* 266:310 */         signature.update(content.getBytes(charset));
/* 267:    */       }
/* 268:313 */       return signature.verify(Base64.decodeBase64(sign.getBytes()));
/* 269:    */     }
/* 270:    */     catch (Exception e)
/* 271:    */     {
/* 272:315 */       throw new AlipayApiException("RSAcontent = " + content + ",sign=" + sign + ",charset = " + charset, e);
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   public static boolean rsaCheckContent(String content, String sign, String publicKey, String charset)
/* 277:    */     throws AlipayApiException
/* 278:    */   {
/* 279:    */     try
/* 280:    */     {
/* 281:323 */       PublicKey pubKey = getPublicKeyFromX509("RSA", new ByteArrayInputStream(publicKey.getBytes()));
/* 282:    */       
/* 283:    */ 
/* 284:326 */       Signature signature = Signature.getInstance("SHA1WithRSA");
/* 285:    */       
/* 286:    */ 
/* 287:329 */       signature.initVerify(pubKey);
/* 288:331 */       if (StringUtils.isEmpty(charset)) {
/* 289:332 */         signature.update(content.getBytes());
/* 290:    */       } else {
/* 291:334 */         signature.update(content.getBytes(charset));
/* 292:    */       }
/* 293:337 */       return signature.verify(Base64.decodeBase64(sign.getBytes()));
/* 294:    */     }
/* 295:    */     catch (Exception e)
/* 296:    */     {
/* 297:339 */       throw new AlipayApiException("RSAcontent = " + content + ",sign=" + sign + ",charset = " + charset, e);
/* 298:    */     }
/* 299:    */   }
/* 300:    */   
/* 301:    */   public static PublicKey getPublicKeyFromX509(String algorithm, InputStream ins)
/* 302:    */     throws Exception
/* 303:    */   {
/* 304:346 */     KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
/* 305:    */     
/* 306:348 */     StringWriter writer = new StringWriter();
/* 307:349 */     StreamUtil.io(new InputStreamReader(ins), writer);
/* 308:    */     
/* 309:351 */     byte[] encodedKey = writer.toString().getBytes();
/* 310:    */     
/* 311:353 */     encodedKey = Base64.decodeBase64(encodedKey);
/* 312:    */     
/* 313:355 */     return keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));
/* 314:    */   }
/* 315:    */   
/* 316:    */   public static String checkSignAndDecrypt(Map<String, String> params, String alipayPublicKey, String cusPrivateKey, boolean isCheckSign, boolean isDecrypt)
/* 317:    */     throws AlipayApiException
/* 318:    */   {
/* 319:381 */     String charset = (String)params.get("charset");
/* 320:382 */     String bizContent = (String)params.get("biz_content");
/* 321:383 */     if ((isCheckSign) && 
/* 322:384 */       (!rsaCheckV2(params, alipayPublicKey, charset))) {
/* 323:385 */       throw new AlipayApiException("rsaCheck failure:rsaParams=" + params);
/* 324:    */     }
/* 325:389 */     if (isDecrypt) {
/* 326:390 */       return rsaDecrypt(bizContent, cusPrivateKey, charset);
/* 327:    */     }
/* 328:393 */     return bizContent;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public static String encryptAndSign(String bizContent, String alipayPublicKey, String cusPrivateKey, String charset, boolean isEncrypt, boolean isSign)
/* 332:    */     throws AlipayApiException
/* 333:    */   {
/* 334:420 */     StringBuilder sb = new StringBuilder();
/* 335:421 */     if (StringUtils.isEmpty(charset)) {
/* 336:422 */       charset = "GBK";
/* 337:    */     }
/* 338:424 */     sb.append("<?xml version=\"1.0\" encoding=\"" + charset + "\"?>");
/* 339:425 */     if (isEncrypt)
/* 340:    */     {
/* 341:426 */       sb.append("<alipay>");
/* 342:427 */       String encrypted = rsaEncrypt(bizContent, alipayPublicKey, charset);
/* 343:428 */       sb.append("<response>" + encrypted + "</response>");
/* 344:429 */       sb.append("<encryption_type>RSA</encryption_type>");
/* 345:430 */       if (isSign)
/* 346:    */       {
/* 347:431 */         String sign = rsaSign(encrypted, cusPrivateKey, charset);
/* 348:432 */         sb.append("<sign>" + sign + "</sign>");
/* 349:433 */         sb.append("<sign_type>RSA</sign_type>");
/* 350:    */       }
/* 351:435 */       sb.append("</alipay>");
/* 352:    */     }
/* 353:436 */     else if (isSign)
/* 354:    */     {
/* 355:437 */       sb.append("<alipay>");
/* 356:438 */       sb.append("<response>" + bizContent + "</response>");
/* 357:439 */       String sign = rsaSign(bizContent, cusPrivateKey, charset);
/* 358:440 */       sb.append("<sign>" + sign + "</sign>");
/* 359:441 */       sb.append("<sign_type>RSA</sign_type>");
/* 360:442 */       sb.append("</alipay>");
/* 361:    */     }
/* 362:    */     else
/* 363:    */     {
/* 364:444 */       sb.append(bizContent);
/* 365:    */     }
/* 366:446 */     return sb.toString();
/* 367:    */   }
/* 368:    */   
/* 369:    */   public static String rsaEncrypt(String content, String publicKey, String charset)
/* 370:    */     throws AlipayApiException
/* 371:    */   {
/* 372:    */     try
/* 373:    */     {
/* 374:461 */       PublicKey pubKey = getPublicKeyFromX509("RSA", new ByteArrayInputStream(publicKey.getBytes()));
/* 375:    */       
/* 376:463 */       Cipher cipher = Cipher.getInstance("RSA");
/* 377:464 */       cipher.init(1, pubKey);
/* 378:465 */       byte[] data = StringUtils.isEmpty(charset) ? content.getBytes() : content.getBytes(charset);
/* 379:    */       
/* 380:467 */       int inputLen = data.length;
/* 381:468 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/* 382:469 */       int offSet = 0;
/* 383:    */       
/* 384:471 */       int i = 0;
/* 385:473 */       while (inputLen - offSet > 0)
/* 386:    */       {
/* 387:    */         byte[] cache;
/* 388:    */
/* 389:474 */         if (inputLen - offSet > 117) {
/* 390:475 */           cache = cipher.doFinal(data, offSet, 117);
/* 391:    */         } else {
/* 392:477 */           cache = cipher.doFinal(data, offSet, inputLen - offSet);
/* 393:    */         }
/* 394:479 */         out.write(cache, 0, cache.length);
/* 395:480 */         i++;
/* 396:481 */         offSet = i * 117;
/* 397:    */       }
/* 398:483 */       byte[] encryptedData = Base64.encodeBase64(out.toByteArray());
/* 399:484 */       out.close();
/* 400:    */       
/* 401:486 */       return StringUtils.isEmpty(charset) ? new String(encryptedData) : new String(encryptedData, charset);
/* 402:    */     }
/* 403:    */     catch (Exception e)
/* 404:    */     {
/* 405:489 */       throw new AlipayApiException("EncryptContent = " + content + ",charset = " + charset, e);
/* 406:    */     }
/* 407:    */   }
/* 408:    */   
/* 409:    */   public static String rsaDecrypt(String content, String privateKey, String charset)
/* 410:    */     throws AlipayApiException
/* 411:    */   {
/* 412:    */     try
/* 413:    */     {
/* 414:506 */       PrivateKey priKey = getPrivateKeyFromPKCS8("RSA", new ByteArrayInputStream(privateKey.getBytes()));
/* 415:    */       
/* 416:508 */       Cipher cipher = Cipher.getInstance("RSA");
/* 417:509 */       cipher.init(2, priKey);
/* 418:510 */       byte[] encryptedData = StringUtils.isEmpty(charset) ? Base64.decodeBase64(content.getBytes()) : Base64.decodeBase64(content.getBytes(charset));
/* 419:    */       
/* 420:    */ 
/* 421:513 */       int inputLen = encryptedData.length;
/* 422:514 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/* 423:515 */       int offSet = 0;
/* 424:    */       
/* 425:517 */       int i = 0;
/* 426:519 */       while (inputLen - offSet > 0)
/* 427:    */       {
/* 428:    */         byte[] cache;
/* 429:    */
/* 430:520 */         if (inputLen - offSet > 128) {
/* 431:521 */           cache = cipher.doFinal(encryptedData, offSet, 128);
/* 432:    */         } else {
/* 433:523 */           cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
/* 434:    */         }
/* 435:525 */         out.write(cache, 0, cache.length);
/* 436:526 */         i++;
/* 437:527 */         offSet = i * 128;
/* 438:    */       }
/* 439:529 */       byte[] decryptedData = out.toByteArray();
/* 440:530 */       out.close();
/* 441:    */       
/* 442:532 */       return StringUtils.isEmpty(charset) ? new String(decryptedData) : new String(decryptedData, charset);
/* 443:    */     }
/* 444:    */     catch (Exception e)
/* 445:    */     {
/* 446:535 */       throw new AlipayApiException("EncodeContent = " + content + ",charset = " + charset, e);
/* 447:    */     }
/* 448:    */   }
/* 449:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.internal.util.AlipaySignature

 * JD-Core Version:    0.7.0.1

 */