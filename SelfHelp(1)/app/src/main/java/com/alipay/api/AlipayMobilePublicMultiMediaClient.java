/*   1:    */ package com.alipay.api;
/*   2:    */ 
/*   3:    */ import com.alipay.api.internal.parser.json.ObjectJsonParser;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.internal.util.AlipayLogger;
/*   6:    */ import com.alipay.api.internal.util.AlipaySignature;
/*   7:    */ import com.alipay.api.internal.util.RequestParametersHolder;
/*   8:    */ import com.alipay.api.internal.util.StreamUtil;
/*   9:    */ import com.alipay.api.internal.util.StringUtils;
/*  10:    */ import com.alipay.api.internal.util.json.JSONWriter;
import com.googlecode.openbeans.IntrospectionException;
/*  11:    */ import java.io.BufferedReader;
/*  12:    */ import java.io.IOException;
/*  13:    */ import java.io.InputStream;
/*  14:    */ import java.io.InputStreamReader;
/*  15:    */ import java.io.OutputStream;
/*  16:    */ import java.io.StringWriter;
/*  17:    */ import java.net.HttpURLConnection;
/*  18:    */ import java.net.URL;
/*  19:    */ import java.net.URLEncoder;
/*  20:    */ import java.security.SecureRandom;
/*  21:    */ import java.security.Security;
/*  22:    */ import java.security.cert.CertificateException;
/*  23:    */ import java.security.cert.X509Certificate;
/*  24:    */ import java.text.DateFormat;
/*  25:    */ import java.text.SimpleDateFormat;
/*  26:    */ import java.util.Date;
/*  27:    */ import java.util.HashMap;
/*  28:    */ import java.util.Map;
/*  29:    */ import java.util.Map.Entry;
/*  30:    */ import java.util.Set;
/*  31:    */ import java.util.TimeZone;
/*  32:    */ import java.util.TreeMap;
/*  33:    */ import javax.net.ssl.HostnameVerifier;
/*  34:    */ import javax.net.ssl.HttpsURLConnection;
/*  35:    */ import javax.net.ssl.KeyManager;
/*  36:    */ import javax.net.ssl.SSLContext;
/*  37:    */ import javax.net.ssl.SSLSession;
/*  38:    */ import javax.net.ssl.TrustManager;
/*  39:    */ import javax.net.ssl.X509TrustManager;
/*  40:    */ 
/*  41:    */ public class AlipayMobilePublicMultiMediaClient
/*  42:    */   implements AlipayClient
/*  43:    */ {
/*  44:    */   private static final String DEFAULT_CHARSET = "UTF-8";
/*  45:    */   private static final String METHOD_POST = "POST";
/*  46:    */   private static final String METHOD_GET = "GET";
/*  47:    */   private String serverUrl;
/*  48:    */   private String appId;
/*  49:    */   private String privateKey;
/*  50:    */   private String prodCode;
/*  51: 58 */   private String format = "json";
/*  52: 59 */   private String sign_type = "RSA";
/*  53:    */   private String charset;
/*  54: 63 */   private int connectTimeout = 3000;
/*  55: 64 */   private int readTimeout = 15000;
/*  56:    */   
/*  57:    */   private static class DefaultTrustManager
/*  58:    */     implements X509TrustManager
/*  59:    */   {
/*  60:    */     public X509Certificate[] getAcceptedIssuers()
/*  61:    */     {
/*  62: 68 */       return null;
/*  63:    */     }
/*  64:    */     
/*  65:    */     public void checkClientTrusted(X509Certificate[] chain, String authType)
/*  66:    */       throws CertificateException
/*  67:    */     {}
/*  68:    */     
/*  69:    */     public void checkServerTrusted(X509Certificate[] chain, String authType)
/*  70:    */       throws CertificateException
/*  71:    */     {}
/*  72:    */   }
/*  73:    */   
/*  74:    */   static
/*  75:    */   {
/*  76: 81 */     Security.setProperty("jdk.certpath.disabledAlgorithms", "");
/*  77:    */   }
/*  78:    */   
/*  79:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey)
/*  80:    */   {
/*  81: 85 */     this.serverUrl = serverUrl;
/*  82: 86 */     this.appId = appId;
/*  83: 87 */     this.privateKey = privateKey;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey, String format)
/*  87:    */   {
/*  88: 92 */     this(serverUrl, appId, privateKey);
/*  89: 93 */     this.format = format;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey, String format, String charset)
/*  93:    */   {
/*  94: 98 */     this(serverUrl, appId, privateKey);
/*  95: 99 */     this.format = format;
/*  96:100 */     this.charset = charset;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey, String format, String charset, String signType)
/* 100:    */   {
/* 101:105 */     this(serverUrl, appId, privateKey, format, charset);
/* 102:    */     
/* 103:107 */     this.sign_type = signType;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request)
/* 107:    */     throws AlipayApiException
/* 108:    */   {
/* 109:114 */     return execute(request, null);
/* 110:    */   }
/* 111:    */   
/* 112:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken)
/* 113:    */     throws AlipayApiException
/* 114:    */   {
/* 115:123 */     return execute(request, accessToken, null);
/* 116:    */   }
/* 117:    */   
/* 118:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken, String appAuthToken)
/* 119:    */     throws AlipayApiException
/* 120:    */   {
/* 121:132 */     return _execute(request, accessToken, appAuthToken);
/* 122:    */   }
/* 123:    */   
/* 124:    */   private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, String authToken, String appAuthToken)
/* 125:    */     throws AlipayApiException
/* 126:    */   {
/* 127:138 */     return doGet(request, appAuthToken);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public <T extends AlipayResponse> T doGet(AlipayRequest<T> request, String appAuthToken)
/* 131:    */     throws AlipayApiException
/* 132:    */   {
/* 133:144 */     if (StringUtils.isEmpty(this.charset)) {
/* 134:145 */       this.charset = "UTF-8";
/* 135:    */     }
/* 136:148 */     RequestParametersHolder requestHolder = new RequestParametersHolder();
/* 137:149 */     AlipayHashMap appParams = new AlipayHashMap(request.getTextParams());
/* 138:    */     try
/* 139:    */     {
/* 140:153 */       if ((request.getClass().getMethod("getBizContent", new Class[0]) != null) && (StringUtils.isEmpty((String)appParams.get("biz_content"))) && (request.getBizModel() != null)) {
/* 141:156 */         appParams.put("biz_content", new JSONWriter().write(request.getBizModel(), true));
/* 142:    */       }
/* 143:    */     }
/* 144:    */     catch (NoSuchMethodException e) {}catch (SecurityException e)
/* 145:    */     {
/* 146:162 */       AlipayLogger.logBizError(e);
/* 147:    */     } catch (IntrospectionException e) {
        e.printStackTrace();
    }
/* 148:165 */     if (!StringUtils.isEmpty(appAuthToken)) {
/* 149:166 */       appParams.put("app_auth_token", appAuthToken);
/* 150:    */     }
/* 151:169 */     requestHolder.setApplicationParams(appParams);
/* 152:    */     
/* 153:171 */     AlipayHashMap protocalMustParams = new AlipayHashMap();
/* 154:172 */     protocalMustParams.put("method", request.getApiMethodName());
/* 155:173 */     protocalMustParams.put("version", request.getApiVersion());
/* 156:174 */     protocalMustParams.put("app_id", this.appId);
/* 157:175 */     protocalMustParams.put("sign_type", this.sign_type);
/* 158:176 */     protocalMustParams.put("charset", this.charset);
/* 159:    */     
/* 160:178 */     Long timestamp = Long.valueOf(System.currentTimeMillis());
/* 161:179 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 162:180 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 163:181 */     protocalMustParams.put("timestamp", df.format(new Date(timestamp.longValue())));
/* 164:182 */     protocalMustParams.put("format", this.format);
/* 165:183 */     requestHolder.setProtocalMustParams(protocalMustParams);
/* 166:185 */     if ("RSA".equals(this.sign_type))
/* 167:    */     {
/* 168:187 */       String signContent = AlipaySignature.getSignatureContent(requestHolder);
/* 169:    */       
/* 170:189 */       protocalMustParams.put("sign", AlipaySignature.rsaSign(signContent, this.privateKey, this.charset));
/* 171:    */     }
/* 172:192 */     else if ("RSA2".equals(this.sign_type))
/* 173:    */     {
/* 174:194 */       String signContent = AlipaySignature.getSignatureContent(requestHolder);
/* 175:    */       
/* 176:196 */       protocalMustParams.put("sign", AlipaySignature.rsa256Sign(signContent, this.privateKey, this.charset));
/* 177:    */     }
/* 178:    */     else
/* 179:    */     {
/* 180:200 */       protocalMustParams.put("sign", "");
/* 181:    */     }
/* 182:203 */     AlipayMobilePublicMultiMediaDownloadResponse rsp = null;
/* 183:    */     try
/* 184:    */     {
/* 185:206 */       if ((request instanceof AlipayMobilePublicMultiMediaDownloadRequest))
/* 186:    */       {
/* 187:207 */         OutputStream outputStream = ((AlipayMobilePublicMultiMediaDownloadRequest)request).getOutputStream();
/* 188:    */         
/* 189:209 */         rsp = doGet(this.serverUrl, requestHolder, this.charset, this.connectTimeout, this.readTimeout, outputStream);
/* 190:    */       }
/* 191:    */     }
/* 192:    */     catch (IOException e)
/* 193:    */     {
/* 194:213 */       throw new AlipayApiException(e);
/* 195:    */     }
/* 196:215 */     return (T) rsp;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public static AlipayMobilePublicMultiMediaDownloadResponse doGet(String url, RequestParametersHolder requestHolder, String charset, int connectTimeout, int readTimeout, OutputStream output)
/* 200:    */     throws AlipayApiException, IOException
/* 201:    */   {
/* 202:237 */     HttpURLConnection conn = null;
/* 203:238 */     AlipayMobilePublicMultiMediaDownloadResponse response = null;
/* 204:    */     try
/* 205:    */     {
/* 206:242 */       Map<String, String> params = new TreeMap();
/* 207:243 */       AlipayHashMap appParams = requestHolder.getApplicationParams();
/* 208:244 */       if ((appParams != null) && (appParams.size() > 0)) {
/* 209:245 */         params.putAll(appParams);
/* 210:    */       }
/* 211:247 */       AlipayHashMap protocalMustParams = requestHolder.getProtocalMustParams();
/* 212:248 */       if ((protocalMustParams != null) && (protocalMustParams.size() > 0)) {
/* 213:249 */         params.putAll(protocalMustParams);
/* 214:    */       }
/* 215:251 */       AlipayHashMap protocalOptParams = requestHolder.getProtocalOptParams();
/* 216:252 */       if ((protocalOptParams != null) && (protocalOptParams.size() > 0)) {
/* 217:253 */         params.putAll(protocalOptParams);
/* 218:    */       }
/* 219:256 */       String ctype = "application/x-www-form-urlencoded;charset=" + charset;
/* 220:257 */       String query = buildQuery(params, charset);
/* 221:    */       try
/* 222:    */       {
/* 223:259 */         conn = getConnection(buildGetUrl(url, query), "GET", ctype);
/* 224:260 */         conn.setConnectTimeout(connectTimeout);
/* 225:261 */         conn.setReadTimeout(readTimeout);
/* 226:    */       }
/* 227:    */       catch (IOException e)
/* 228:    */       {
/* 229:263 */         Map<String, String> map = getParamsFromUrl(url);
/* 230:264 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), params);
/* 231:265 */         throw e;
/* 232:    */       }
/* 233:    */       try
/* 234:    */       {
/* 235:269 */         if (conn.getResponseCode() == 200)
/* 236:    */         {
/* 237:270 */           if ((conn.getContentType() != null) && (conn.getContentType().toLowerCase().contains("text/plain")))
/* 238:    */           {
/* 239:272 */             String rsp = getResponseAsString(conn);
/* 240:273 */             ObjectJsonParser<AlipayMobilePublicMultiMediaDownloadResponse> parser = new ObjectJsonParser(AlipayMobilePublicMultiMediaDownloadResponse.class);
/* 241:    */             
/* 242:275 */             response = (AlipayMobilePublicMultiMediaDownloadResponse)parser.parse(rsp);
/* 243:276 */             response.setBody(rsp);
/* 244:277 */             response.setParams(appParams);
/* 245:278 */             return response;
/* 246:    */           }
/* 247:281 */           StreamUtil.io(conn.getInputStream(), output);
/* 248:282 */           response = new AlipayMobilePublicMultiMediaDownloadResponse();
/* 249:283 */           response.setCode("200");
/* 250:284 */           response.setMsg("成功");
/* 251:285 */           response.setBody("{\"alipay_mobile_public_multimedia_download_response\":{\"code\":200,\"msg\":\"成功\"}}");
/* 252:    */           
/* 253:287 */           response.setParams(appParams);
/* 254:    */         }
/* 255:    */         else
/* 256:    */         {
/* 257:289 */           response = new AlipayMobilePublicMultiMediaDownloadResponse();
/* 258:290 */           response.setCode(String.valueOf(conn.getResponseCode()));
/* 259:291 */           response.setMsg(conn.getResponseMessage());
/* 260:292 */           response.setParams(appParams);
/* 261:    */         }
/* 262:    */       }
/* 263:    */       catch (IOException e)
/* 264:    */       {
/* 265:295 */         Map<String, String> map = getParamsFromUrl(url);
/* 266:296 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), params);
/* 267:297 */         throw e;
/* 268:    */       }
/* 269:    */     }
/* 270:    */     finally
/* 271:    */     {
/* 272:301 */       if (conn != null) {
/* 273:302 */         conn.disconnect();
/* 274:    */       }
/* 275:304 */       if (output != null) {
/* 276:305 */         output.close();
/* 277:    */       }
/* 278:    */     }
/* 279:308 */     return response;
/* 280:    */   }
/* 281:    */   
/* 282:    */   private static HttpURLConnection getConnection(URL url, String method, String ctype)
/* 283:    */     throws IOException
/* 284:    */   {
/* 285:314 */     HttpURLConnection conn = null;
/* 286:315 */     if ("https".equals(url.getProtocol()))
/* 287:    */     {
/* 288:316 */       SSLContext ctx = null;
/* 289:    */       try
/* 290:    */       {
/* 291:318 */         ctx = SSLContext.getInstance("TLS");
/* 292:319 */         ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager() }, new SecureRandom());
/* 293:    */       }
/* 294:    */       catch (Exception e)
/* 295:    */       {
/* 296:322 */         throw new IOException(e);
/* 297:    */       }
/* 298:324 */       HttpsURLConnection connHttps = (HttpsURLConnection)url.openConnection();
/* 299:325 */       connHttps.setSSLSocketFactory(ctx.getSocketFactory());
/* 300:326 */       connHttps.setHostnameVerifier(new HostnameVerifier()
/* 301:    */       {
/* 302:    */         public boolean verify(String hostname, SSLSession session)
/* 303:    */         {
/* 304:328 */           return false;
/* 305:    */         }
/* 306:330 */       });
/* 307:331 */       conn = connHttps;
/* 308:    */     }
/* 309:    */     else
/* 310:    */     {
/* 311:333 */       conn = (HttpURLConnection)url.openConnection();
/* 312:    */     }
/* 313:336 */     conn.setRequestMethod(method);
/* 314:337 */     conn.setDoInput(true);
/* 315:338 */     conn.setDoOutput(true);
/* 316:339 */     conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
/* 317:340 */     conn.setRequestProperty("User-Agent", "aop-sdk-java");
/* 318:341 */     conn.setRequestProperty("Content-Type", ctype);
/* 319:342 */     return conn;
/* 320:    */   }
/* 321:    */   
/* 322:    */   protected static String getResponseAsString(HttpURLConnection conn)
/* 323:    */     throws IOException
/* 324:    */   {
/* 325:346 */     String charset = getResponseCharset(conn.getContentType());
/* 326:347 */     InputStream es = conn.getErrorStream();
/* 327:348 */     if (es == null) {
/* 328:349 */       return getStreamAsString(conn.getInputStream(), charset);
/* 329:    */     }
/* 330:351 */     String msg = getStreamAsString(es, charset);
/* 331:352 */     if (StringUtils.isEmpty(msg)) {
/* 332:353 */       throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
/* 333:    */     }
/* 334:355 */     throw new IOException(msg);
/* 335:    */   }
/* 336:    */   
/* 337:    */   private static String getStreamAsString(InputStream stream, String charset)
/* 338:    */     throws IOException
/* 339:    */   {
/* 340:    */     try
/* 341:    */     {
/* 342:362 */       BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
/* 343:363 */       StringWriter writer = new StringWriter();
/* 344:    */       
/* 345:365 */       char[] chars = new char[256];
/* 346:366 */       int count = 0;
/* 347:367 */       while ((count = reader.read(chars)) > 0) {
/* 348:368 */         writer.write(chars, 0, count);
/* 349:    */       }
/* 350:371 */       return writer.toString();
/* 351:    */     }
/* 352:    */     finally
/* 353:    */     {
/* 354:373 */       if (stream != null) {
/* 355:374 */         stream.close();
/* 356:    */       }
/* 357:    */     }
/* 358:    */   }
/* 359:    */   
/* 360:    */   private static String getResponseCharset(String ctype)
/* 361:    */   {
/* 362:380 */     String charset = "UTF-8";
/* 363:382 */     if (!StringUtils.isEmpty(ctype))
/* 364:    */     {
/* 365:383 */       String[] params = ctype.split(";");
/* 366:384 */       for (String param : params)
/* 367:    */       {
/* 368:385 */         param = param.trim();
/* 369:386 */         if (param.startsWith("charset"))
/* 370:    */         {
/* 371:387 */           String[] pair = param.split("=", 2);
/* 372:388 */           if ((pair.length != 2) || 
/* 373:389 */             (StringUtils.isEmpty(pair[1]))) {
/* 374:    */             break;
/* 375:    */           }
/* 376:390 */           charset = pair[1].trim(); break;
/* 377:    */         }
/* 378:    */       }
/* 379:    */     }
/* 380:398 */     return charset;
/* 381:    */   }
/* 382:    */   
/* 383:    */   private static Map<String, String> getParamsFromUrl(String url)
/* 384:    */   {
/* 385:402 */     Map<String, String> map = null;
/* 386:403 */     if ((url != null) && (url.indexOf('?') != -1)) {
/* 387:404 */       map = splitUrlQuery(url.substring(url.indexOf('?') + 1));
/* 388:    */     }
/* 389:406 */     if (map == null) {
/* 390:407 */       map = new HashMap();
/* 391:    */     }
/* 392:409 */     return map;
/* 393:    */   }
/* 394:    */   
/* 395:    */   private static URL buildGetUrl(String strUrl, String query)
/* 396:    */     throws IOException
/* 397:    */   {
/* 398:413 */     URL url = new URL(strUrl);
/* 399:414 */     if (StringUtils.isEmpty(query)) {
/* 400:415 */       return url;
/* 401:    */     }
/* 402:418 */     if (StringUtils.isEmpty(url.getQuery()))
/* 403:    */     {
/* 404:419 */       if (strUrl.endsWith("?")) {
/* 405:420 */         strUrl = strUrl + query;
/* 406:    */       } else {
/* 407:422 */         strUrl = strUrl + "?" + query;
/* 408:    */       }
/* 409:    */     }
/* 410:425 */     else if (strUrl.endsWith("&")) {
/* 411:426 */       strUrl = strUrl + query;
/* 412:    */     } else {
/* 413:428 */       strUrl = strUrl + "&" + query;
/* 414:    */     }
/* 415:432 */     return new URL(strUrl);
/* 416:    */   }
/* 417:    */   
/* 418:    */   public static String buildQuery(Map<String, String> params, String charset)
/* 419:    */     throws IOException
/* 420:    */   {
/* 421:436 */     if ((params == null) || (params.isEmpty())) {
/* 422:437 */       return null;
/* 423:    */     }
/* 424:440 */     StringBuilder query = new StringBuilder();
/* 425:441 */     Set<Entry<String, String>> entries = params.entrySet();
/* 426:442 */     boolean hasParam = false;
/* 427:444 */     for (Entry<String, String> entry : entries)
/* 428:    */     {
/* 429:445 */       String name = (String)entry.getKey();
/* 430:446 */       String value = (String)entry.getValue();
/* 431:448 */       if (StringUtils.areNotEmpty(new String[] { name, value }))
/* 432:    */       {
/* 433:449 */         if (hasParam) {
/* 434:450 */           query.append("&");
/* 435:    */         } else {
/* 436:452 */           hasParam = true;
/* 437:    */         }
/* 438:455 */         query.append(name).append("=").append(URLEncoder.encode(value, charset));
/* 439:    */       }
/* 440:    */     }
/* 441:459 */     return query.toString();
/* 442:    */   }
/* 443:    */   
/* 444:    */   public static Map<String, String> splitUrlQuery(String query)
/* 445:    */   {
/* 446:468 */     Map<String, String> result = new HashMap();
/* 447:    */     
/* 448:470 */     String[] pairs = query.split("&");
/* 449:471 */     if ((pairs != null) && (pairs.length > 0)) {
/* 450:472 */       for (String pair : pairs)
/* 451:    */       {
/* 452:473 */         String[] param = pair.split("=", 2);
/* 453:474 */         if ((param != null) && (param.length == 2)) {
/* 454:475 */           result.put(param[0], param[1]);
/* 455:    */         }
/* 456:    */       }
/* 457:    */     }
/* 458:480 */     return result;
/* 459:    */   }
/* 460:    */   
/* 461:    */   public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request)
/* 462:    */     throws AlipayApiException
/* 463:    */   {
/* 464:484 */     return null;
/* 465:    */   }
/* 466:    */   
/* 467:    */   public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request, String method)
/* 468:    */     throws AlipayApiException
/* 469:    */   {
/* 470:489 */     return null;
/* 471:    */   }
/* 472:    */   
/* 473:    */   public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(Map<String, String> result, Class<T> requsetClazz)
/* 474:    */     throws AlipayApiException
/* 475:    */   {
/* 476:494 */     return null;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public <T extends AlipayResponse> T sdkExecute(AlipayRequest<T> request)
/* 480:    */     throws AlipayApiException
/* 481:    */   {
/* 482:498 */     return null;
/* 483:    */   }
/* 484:    */ }



