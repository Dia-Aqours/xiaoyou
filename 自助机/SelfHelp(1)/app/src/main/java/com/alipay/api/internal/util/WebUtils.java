/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.FileItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/*   4:    */
/*   5:    */
/*   6:    */
/*   7:    */
/*   8:    */
/*   9:    */
/*  10:    */
/*  11:    */
/*  12:    */
/*  13:    */
/*  14:    */
/*  15:    */
/*  16:    */
/*  17:    */
/*  18:    */
/*  19:    */
/*  20:    */
/*  21:    */
/*  22:    */
/*  23:    */
/*  24:    */
/*  25:    */
/*  26:    */
/*  27:    */
/*  28:    */
/*  29:    */
/*  30:    */ 
/*  31:    */ public abstract class WebUtils
/*  32:    */ {
/*  33: 45 */   private static SSLContext ctx = null;
/*  34: 49 */   private static SSLSocketFactory socketFactory = null;
/*  35:    */   
/*  36:    */   private static class DefaultTrustManager
/*  37:    */     implements X509TrustManager
/*  38:    */   {
/*  39:    */     public X509Certificate[] getAcceptedIssuers()
/*  40:    */     {
/*  41: 53 */       return null;
/*  42:    */     }
/*  43:    */     
/*  44:    */     public void checkClientTrusted(X509Certificate[] chain, String authType)
/*  45:    */       throws CertificateException
/*  46:    */     {}
/*  47:    */     
/*  48:    */     public void checkServerTrusted(X509Certificate[] chain, String authType)
/*  49:    */       throws CertificateException
/*  50:    */     {}
/*  51:    */   }
/*  52:    */   
/*  53:    */   static
/*  54:    */   {
/*  55:    */     try
/*  56:    */     {
/*  57: 68 */       ctx = SSLContext.getInstance("TLS");
/*  58: 69 */       ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager ()}, new SecureRandom());
/*  59:    */       
/*  60:    */ 
/*  61: 72 */       ctx.getClientSessionContext().setSessionTimeout(15);
/*  62: 73 */       ctx.getClientSessionContext().setSessionCacheSize(1000);
/*  63:    */       
/*  64: 75 */       socketFactory = ctx.getSocketFactory();
/*  65:    */     }
/*  66:    */     catch (Exception e) {}
/*  67:    */   }
/*  68:    */   
/*  69: 80 */   private static HostnameVerifier verifier = new HostnameVerifier()
/*  70:    */   {
/*  71:    */     public boolean verify(String hostname, SSLSession session)
/*  72:    */     {
/*  73: 82 */       return true;
/*  74:    */     }
/*  75:    */   };
/*  76:    */   private static final String DEFAULT_CHARSET = "UTF-8";
/*  77:    */   private static final String METHOD_POST = "POST";
/*  78:    */   private static final String METHOD_GET = "GET";
/*  79:    */   
/*  80:    */   public static String doPost(String url, Map<String, String> params, int connectTimeout, int readTimeout)
/*  81:    */     throws IOException
/*  82:    */   {
/*  83:101 */     return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
/*  84:    */   }
/*  85:    */   
/*  86:    */   public static String doPost(String url, Map<String, String> params, String charset, int connectTimeout, int readTimeout)
/*  87:    */     throws IOException
/*  88:    */   {
/*  89:115 */     String ctype = "application/x-www-form-urlencoded;charset=" + charset;
/*  90:116 */     String query = buildQuery(params, charset);
/*  91:117 */     byte[] content = new byte[0];
/*  92:118 */     if (query != null) {
/*  93:119 */       content = query.getBytes(charset);
/*  94:    */     }
/*  95:121 */     return doPost(url, ctype, content, connectTimeout, readTimeout);
/*  96:    */   }
/*  97:    */   
/*  98:    */   public static String doPost(String url, String ctype, byte[] content, int connectTimeout, int readTimeout)
/*  99:    */     throws IOException
/* 100:    */   {
/* 101:135 */     HttpURLConnection conn = null;
/* 102:136 */     OutputStream out = null;
/* 103:137 */     String rsp = null;
/* 104:    */     try
/* 105:    */     {
/* 106:    */       try
/* 107:    */       {
/* 108:140 */         conn = getConnection(new URL(url), "POST", ctype);
/* 109:141 */         conn.setConnectTimeout(connectTimeout);
/* 110:142 */         conn.setReadTimeout(readTimeout);
/* 111:    */       }
/* 112:    */       catch (IOException e)
/* 113:    */       {
/* 114:144 */         Map<String, String> map = getParamsFromUrl(url);
/* 115:145 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), content);
/* 116:146 */         throw e;
/* 117:    */       }
/* 118:    */       try
/* 119:    */       {
/* 120:149 */         out = conn.getOutputStream();
/* 121:150 */         out.write(content);
/* 122:151 */         rsp = getResponseAsString(conn);
/* 123:    */       }
/* 124:    */       catch (IOException e)
/* 125:    */       {
/* 126:153 */         Map<String, String> map = getParamsFromUrl(url);
/* 127:154 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), content);
/* 128:155 */         throw e;
/* 129:    */       }
/* 130:    */     }
/* 131:    */     finally
/* 132:    */     {
/* 133:159 */       if (out != null) {
/* 134:160 */         out.close();
/* 135:    */       }
/* 136:162 */       if (conn != null) {
/* 137:163 */         conn.disconnect();
/* 138:    */       }
/* 139:    */     }
/* 140:168 */     return rsp;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, int connectTimeout, int readTimeout)
/* 144:    */     throws IOException
/* 145:    */   {
/* 146:183 */     if ((fileParams == null) || (fileParams.isEmpty())) {
/* 147:184 */       return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
/* 148:    */     }
/* 149:186 */     return doPost(url, params, fileParams, "UTF-8", connectTimeout, readTimeout);
/* 150:    */   }
/* 151:    */   
/* 152:    */   public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, int connectTimeout, int readTimeout)
/* 153:    */     throws IOException
/* 154:    */   {
/* 155:203 */     if ((fileParams == null) || (fileParams.isEmpty())) {
/* 156:204 */       return doPost(url, params, charset, connectTimeout, readTimeout);
/* 157:    */     }
/* 158:207 */     String boundary = System.currentTimeMillis() + "";
/* 159:208 */     HttpURLConnection conn = null;
/* 160:209 */     OutputStream out = null;
/* 161:210 */     String rsp = null;
/* 162:    */     try
/* 163:    */     {
/* 164:    */       try
/* 165:    */       {
/* 166:213 */         String ctype = "multipart/form-data;boundary=" + boundary + ";charset=" + charset;
/* 167:214 */         conn = getConnection(new URL(url), "POST", ctype);
/* 168:215 */         conn.setConnectTimeout(connectTimeout);
/* 169:216 */         conn.setReadTimeout(readTimeout);
/* 170:    */       }
/* 171:    */       catch (IOException e)
/* 172:    */       {
/* 173:218 */         Map<String, String> map = getParamsFromUrl(url);
/* 174:219 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), params);
/* 175:220 */         throw e;
/* 176:    */       }
/* 177:    */       try
/* 178:    */       {
/* 179:224 */         out = conn.getOutputStream();
/* 180:    */         
/* 181:226 */         byte[] entryBoundaryBytes = ("\r\n--" + boundary + "\r\n").getBytes(charset);
/* 182:    */         
/* 183:    */ 
/* 184:229 */         Set<Entry<String, String>> textEntrySet = params.entrySet();
/* 185:230 */         for (Entry<String, String> textEntry : textEntrySet)
/* 186:    */         {
/* 187:231 */           byte[] textBytes = getTextEntry((String)textEntry.getKey(), (String)textEntry.getValue(), charset);
/* 188:    */           
/* 189:233 */           out.write(entryBoundaryBytes);
/* 190:234 */           out.write(textBytes);
/* 191:    */         }
/* 192:238 */         Set<Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
/* 193:239 */         for (Entry<String, FileItem> fileEntry : fileEntrySet)
/* 194:    */         {
/* 195:240 */           FileItem fileItem = (FileItem)fileEntry.getValue();
/* 196:241 */           byte[] fileBytes = getFileEntry((String)fileEntry.getKey(), fileItem.getFileName(), fileItem.getMimeType(), charset);
/* 197:    */           
/* 198:243 */           out.write(entryBoundaryBytes);
/* 199:244 */           out.write(fileBytes);
/* 200:245 */           out.write(fileItem.getContent());
/* 201:    */         }
/* 202:249 */         byte[] endBoundaryBytes = ("\r\n--" + boundary + "--\r\n").getBytes(charset);
/* 203:250 */         out.write(endBoundaryBytes);
/* 204:251 */         rsp = getResponseAsString(conn);
/* 205:    */       }
/* 206:    */       catch (IOException e)
/* 207:    */       {
/* 208:253 */         Map<String, String> map = getParamsFromUrl(url);
/* 209:254 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), params);
/* 210:255 */         throw e;
/* 211:    */       }
/* 212:    */     }
/* 213:    */     finally
/* 214:    */     {
/* 215:259 */       if (out != null) {
/* 216:260 */         out.close();
/* 217:    */       }
/* 218:262 */       if (conn != null) {
/* 219:263 */         conn.disconnect();
/* 220:    */       }
/* 221:    */     }
/* 222:267 */     return rsp;
/* 223:    */   }
/* 224:    */   
/* 225:    */   private static byte[] getTextEntry(String fieldName, String fieldValue, String charset)
/* 226:    */     throws IOException
/* 227:    */   {
/* 228:272 */     StringBuilder entry = new StringBuilder();
/* 229:273 */     entry.append("Content-Disposition:form-data;name=\"");
/* 230:274 */     entry.append(fieldName);
/* 231:275 */     entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
/* 232:276 */     entry.append(fieldValue);
/* 233:277 */     return entry.toString().getBytes(charset);
/* 234:    */   }
/* 235:    */   
/* 236:    */   private static byte[] getFileEntry(String fieldName, String fileName, String mimeType, String charset)
/* 237:    */     throws IOException
/* 238:    */   {
/* 239:282 */     StringBuilder entry = new StringBuilder();
/* 240:283 */     entry.append("Content-Disposition:form-data;name=\"");
/* 241:284 */     entry.append(fieldName);
/* 242:285 */     entry.append("\";filename=\"");
/* 243:286 */     entry.append(fileName);
/* 244:287 */     entry.append("\"\r\nContent-Type:");
/* 245:288 */     entry.append(mimeType);
/* 246:289 */     entry.append("\r\n\r\n");
/* 247:290 */     return entry.toString().getBytes(charset);
/* 248:    */   }
/* 249:    */   
/* 250:    */   public static String doGet(String url, Map<String, String> params)
/* 251:    */     throws IOException
/* 252:    */   {
/* 253:302 */     return doGet(url, params, "UTF-8");
/* 254:    */   }
/* 255:    */   
/* 256:    */   public static String doGet(String url, Map<String, String> params, String charset)
/* 257:    */     throws IOException
/* 258:    */   {
/* 259:316 */     HttpURLConnection conn = null;
/* 260:317 */     String rsp = null;
/* 261:    */     try
/* 262:    */     {
/* 263:320 */       String ctype = "application/x-www-form-urlencoded;charset=" + charset;
/* 264:321 */       String query = buildQuery(params, charset);
/* 265:    */       try
/* 266:    */       {
/* 267:323 */         conn = getConnection(buildGetUrl(url, query), "GET", ctype);
/* 268:    */       }
/* 269:    */       catch (IOException e)
/* 270:    */       {
/* 271:325 */         Map<String, String> map = getParamsFromUrl(url);
/* 272:326 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), params);
/* 273:327 */         throw e;
/* 274:    */       }
/* 275:    */       try
/* 276:    */       {
/* 277:331 */         rsp = getResponseAsString(conn);
/* 278:    */       }
/* 279:    */       catch (IOException e)
/* 280:    */       {
/* 281:333 */         Map<String, String> map = getParamsFromUrl(url);
/* 282:334 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), params);
/* 283:335 */         throw e;
/* 284:    */       }
/* 285:    */     }
/* 286:    */     finally
/* 287:    */     {
/* 288:339 */       if (conn != null) {
/* 289:340 */         conn.disconnect();
/* 290:    */       }
/* 291:    */     }
/* 292:344 */     return rsp;
/* 293:    */   }
/* 294:    */   
/* 295:    */   private static HttpURLConnection getConnection(URL url, String method, String ctype)
/* 296:    */     throws IOException
/* 297:    */   {
/* 298:349 */     HttpURLConnection conn = null;
/* 299:350 */     if ("https".equals(url.getProtocol()))
/* 300:    */     {
/* 301:351 */       HttpsURLConnection connHttps = (HttpsURLConnection)url.openConnection();
/* 302:352 */       connHttps.setSSLSocketFactory(socketFactory);
/* 303:353 */       connHttps.setHostnameVerifier(verifier);
/* 304:354 */       conn = connHttps;
/* 305:    */     }
/* 306:    */     else
/* 307:    */     {
/* 308:356 */       conn = (HttpURLConnection)url.openConnection();
/* 309:    */     }
/* 310:359 */     conn.setRequestMethod(method);
/* 311:360 */     conn.setDoInput(true);
/* 312:361 */     conn.setDoOutput(true);
/* 313:362 */     conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
/* 314:363 */     conn.setRequestProperty("User-Agent", "aop-sdk-java");
/* 315:364 */     conn.setRequestProperty("Content-Type", ctype);
/* 316:365 */     return conn;
/* 317:    */   }
/* 318:    */   
/* 319:    */   private static URL buildGetUrl(String strUrl, String query)
/* 320:    */     throws IOException
/* 321:    */   {
/* 322:369 */     URL url = new URL(strUrl);
/* 323:370 */     if (StringUtils.isEmpty(query)) {
/* 324:371 */       return url;
/* 325:    */     }
/* 326:374 */     if (StringUtils.isEmpty(url.getQuery()))
/* 327:    */     {
/* 328:375 */       if (strUrl.endsWith("?")) {
/* 329:376 */         strUrl = strUrl + query;
/* 330:    */       } else {
/* 331:378 */         strUrl = strUrl + "?" + query;
/* 332:    */       }
/* 333:    */     }
/* 334:381 */     else if (strUrl.endsWith("&")) {
/* 335:382 */       strUrl = strUrl + query;
/* 336:    */     } else {
/* 337:384 */       strUrl = strUrl + "&" + query;
/* 338:    */     }
/* 339:388 */     return new URL(strUrl);
/* 340:    */   }
/* 341:    */   
/* 342:    */   public static String buildQuery(Map<String, String> params, String charset)
/* 343:    */     throws IOException
/* 344:    */   {
/* 345:392 */     if ((params == null) || (params.isEmpty())) {
/* 346:393 */       return null;
/* 347:    */     }
/* 348:396 */     StringBuilder query = new StringBuilder();
/* 349:397 */     Set<Entry<String, String>> entries = params.entrySet();
/* 350:398 */     boolean hasParam = false;
/* 351:400 */     for (Entry<String, String> entry : entries)
/* 352:    */     {
/* 353:401 */       String name = (String)entry.getKey();
/* 354:402 */       String value = (String)entry.getValue();
/* 355:404 */       if (StringUtils.areNotEmpty(new String[] { name, value }))
/* 356:    */       {
/* 357:405 */         if (hasParam) {
/* 358:406 */           query.append("&");
/* 359:    */         } else {
/* 360:408 */           hasParam = true;
/* 361:    */         }
/* 362:411 */         query.append(name).append("=").append(URLEncoder.encode(value, charset));
/* 363:    */       }
/* 364:    */     }
/* 365:415 */     return query.toString();
/* 366:    */   }
/* 367:    */   
/* 368:    */   protected static String getResponseAsString(HttpURLConnection conn)
/* 369:    */     throws IOException
/* 370:    */   {
/* 371:419 */     String charset = getResponseCharset(conn.getContentType());
/* 372:420 */     InputStream es = conn.getErrorStream();
/* 373:421 */     if (es == null) {
/* 374:422 */       return getStreamAsString(conn.getInputStream(), charset);
/* 375:    */     }
/* 376:424 */     String msg = getStreamAsString(es, charset);
/* 377:425 */     if (StringUtils.isEmpty(msg)) {
/* 378:426 */       throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
/* 379:    */     }
/* 380:428 */     throw new IOException(msg);
/* 381:    */   }
/* 382:    */   
/* 383:    */   private static String getStreamAsString(InputStream stream, String charset)
/* 384:    */     throws IOException
/* 385:    */   {
/* 386:    */     try
/* 387:    */     {
/* 388:435 */       BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
/* 389:436 */       StringWriter writer = new StringWriter();
/* 390:    */       
/* 391:438 */       char[] chars = new char[256];
/* 392:439 */       int count = 0;
/* 393:440 */       while ((count = reader.read(chars)) > 0) {
/* 394:441 */         writer.write(chars, 0, count);
/* 395:    */       }
/* 396:444 */       return writer.toString();
/* 397:    */     }
/* 398:    */     finally
/* 399:    */     {
/* 400:446 */       if (stream != null) {
/* 401:447 */         stream.close();
/* 402:    */       }
/* 403:    */     }
/* 404:    */   }
/* 405:    */   
/* 406:    */   private static String getResponseCharset(String ctype)
/* 407:    */   {
/* 408:453 */     String charset = "UTF-8";
/* 409:455 */     if (!StringUtils.isEmpty(ctype))
/* 410:    */     {
/* 411:456 */       String[] params = ctype.split(";");
/* 412:457 */       for (String param : params)
/* 413:    */       {
/* 414:458 */         param = param.trim();
/* 415:459 */         if (param.startsWith("charset"))
/* 416:    */         {
/* 417:460 */           String[] pair = param.split("=", 2);
/* 418:461 */           if ((pair.length != 2) || 
/* 419:462 */             (StringUtils.isEmpty(pair[1]))) {
/* 420:    */             break;
/* 421:    */           }
/* 422:463 */           charset = pair[1].trim(); break;
/* 423:    */         }
/* 424:    */       }
/* 425:    */     }
/* 426:471 */     return charset;
/* 427:    */   }
/* 428:    */   
/* 429:    */   public static String decode(String value)
/* 430:    */   {
/* 431:481 */     return decode(value, "UTF-8");
/* 432:    */   }
/* 433:    */   
/* 434:    */   public static String encode(String value)
/* 435:    */   {
/* 436:491 */     return encode(value, "UTF-8");
/* 437:    */   }
/* 438:    */   
/* 439:    */   public static String decode(String value, String charset)
/* 440:    */   {
/* 441:502 */     String result = null;
/* 442:503 */     if (!StringUtils.isEmpty(value)) {
/* 443:    */       try
/* 444:    */       {
/* 445:505 */         result = URLDecoder.decode(value, charset);
/* 446:    */       }
/* 447:    */       catch (IOException e)
/* 448:    */       {
/* 449:507 */         throw new RuntimeException(e);
/* 450:    */       }
/* 451:    */     }
/* 452:510 */     return result;
/* 453:    */   }
/* 454:    */   
/* 455:    */   public static String encode(String value, String charset)
/* 456:    */   {
/* 457:521 */     String result = null;
/* 458:522 */     if (!StringUtils.isEmpty(value)) {
/* 459:    */       try
/* 460:    */       {
/* 461:524 */         result = URLEncoder.encode(value, charset);
/* 462:    */       }
/* 463:    */       catch (IOException e)
/* 464:    */       {
/* 465:526 */         throw new RuntimeException(e);
/* 466:    */       }
/* 467:    */     }
/* 468:529 */     return result;
/* 469:    */   }
/* 470:    */   
/* 471:    */   private static Map<String, String> getParamsFromUrl(String url)
/* 472:    */   {
/* 473:533 */     Map<String, String> map = null;
/* 474:534 */     if ((url != null) && (url.indexOf('?') != -1)) {
/* 475:535 */       map = splitUrlQuery(url.substring(url.indexOf('?') + 1));
/* 476:    */     }
/* 477:537 */     if (map == null) {
/* 478:538 */       map = new HashMap();
/* 479:    */     }
/* 480:540 */     return map;
/* 481:    */   }
/* 482:    */   
/* 483:    */   public static Map<String, String> splitUrlQuery(String query)
/* 484:    */   {
/* 485:550 */     Map<String, String> result = new HashMap();
/* 486:    */     
/* 487:552 */     String[] pairs = query.split("&");
/* 488:553 */     if ((pairs != null) && (pairs.length > 0)) {
/* 489:554 */       for (String pair : pairs)
/* 490:    */       {
/* 491:555 */         String[] param = pair.split("=", 2);
/* 492:556 */         if ((param != null) && (param.length == 2)) {
/* 493:557 */           result.put(param[0], param[1]);
/* 494:    */         }
/* 495:    */       }
/* 496:    */     }
/* 497:562 */     return result;
/* 498:    */   }
/* 499:    */   
/* 500:    */   public String buildForm(String baseUrl, RequestParametersHolder requestHolder)
/* 501:    */   {
/* 502:566 */     return null;
/* 503:    */   }
/* 504:    */   
/* 505:    */   public static String buildForm(String baseUrl, Map<String, String> parameters)
/* 506:    */   {
/* 507:570 */     StringBuffer sb = new StringBuffer();
/* 508:571 */     sb.append("<form name=\"punchout_form\" method=\"post\" action=\"");
/* 509:572 */     sb.append(baseUrl);
/* 510:573 */     sb.append("\">\n");
/* 511:574 */     sb.append(buildHiddenFields(parameters));
/* 512:    */     
/* 513:576 */     sb.append("<input type=\"submit\" value=\"立即支付\" style=\"display:none\" >\n");
/* 514:577 */     sb.append("</form>\n");
/* 515:578 */     sb.append("<script>document.forms[0].submit();</script>");
/* 516:579 */     String form = sb.toString();
/* 517:580 */     return form;
/* 518:    */   }
/* 519:    */   
/* 520:    */   private static String buildHiddenFields(Map<String, String> parameters)
/* 521:    */   {
/* 522:584 */     if ((parameters == null) || (parameters.isEmpty())) {
/* 523:585 */       return "";
/* 524:    */     }
/* 525:587 */     StringBuffer sb = new StringBuffer();
/* 526:588 */     Set<String> keys = parameters.keySet();
/* 527:589 */     for (String key : keys)
/* 528:    */     {
/* 529:590 */       String value = (String)parameters.get(key);
/* 530:592 */       if ((key != null) && (value != null)) {
/* 531:595 */         sb.append(buildHiddenField(key, value));
/* 532:    */       }
/* 533:    */     }
/* 534:597 */     String result = sb.toString();
/* 535:598 */     return result;
/* 536:    */   }
/* 537:    */   
/* 538:    */   private static String buildHiddenField(String key, String value)
/* 539:    */   {
/* 540:602 */     StringBuffer sb = new StringBuffer();
/* 541:603 */     sb.append("<input type=\"hidden\" name=\"");
/* 542:604 */     sb.append(key);
/* 543:    */     
/* 544:606 */     sb.append("\" value=\"");
/* 545:    */     
/* 546:608 */     String a = value.replace("\"", "&quot;");
/* 547:609 */     sb.append(a).append("\">\n");
/* 548:610 */     return sb.toString();
/* 549:    */   }
/* 550:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.internal.util.WebUtils

 * JD-Core Version:    0.7.0.1

 */