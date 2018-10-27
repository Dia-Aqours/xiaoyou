/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Jdk14Logger;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

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
/*  26:    */ public class AlipayLogger
/*  27:    */ {
/*  28: 32 */   private static final Log clog = LogFactory.getLog("sdk.comm.err");
/*  29: 33 */   private static final Log blog = LogFactory.getLog("sdk.biz.err");
/*  30: 35 */   private static String osName = System.getProperties().getProperty("os.name");
/*  31: 36 */   private static String ip = null;
/*  32: 37 */   private static boolean needEnableLogger = true;
/*  33:    */   
/*  34:    */   public static void setNeedEnableLogger(boolean needEnableLogger)
/*  35:    */   {
/*  36: 40 */     needEnableLogger = needEnableLogger;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static String getIp()
/*  40:    */   {
/*  41: 44 */     if (ip == null) {
/*  42:    */       try
/*  43:    */       {
/*  44: 46 */         ip = InetAddress.getLocalHost().getHostAddress();
/*  45:    */       }
/*  46:    */       catch (Exception e)
/*  47:    */       {
/*  48: 48 */         e.printStackTrace();
/*  49:    */       }
/*  50:    */     }
/*  51: 51 */     return ip;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public static void setIp(String ip)
/*  55:    */   {
/*  56: 55 */     ip = ip;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static void logCommError(Exception e, HttpURLConnection conn, String appKey, String method, byte[] content)
/*  60:    */   {
/*  61: 63 */     if (!needEnableLogger) {
/*  62: 64 */       return;
/*  63:    */     }
/*  64: 66 */     String contentString = null;
/*  65:    */     try
/*  66:    */     {
/*  67: 68 */       contentString = new String(content, "UTF-8");
/*  68: 69 */       logCommError(e, conn, appKey, method, contentString);
/*  69:    */     }
/*  70:    */     catch (Exception e1)
/*  71:    */     {
/*  72: 71 */       e1.printStackTrace();
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   public static void logCommError(Exception e, String url, String appKey, String method, byte[] content)
/*  77:    */   {
/*  78: 80 */     if (!needEnableLogger) {
/*  79: 81 */       return;
/*  80:    */     }
/*  81: 83 */     String contentString = null;
/*  82:    */     try
/*  83:    */     {
/*  84: 85 */       contentString = new String(content, "UTF-8");
/*  85: 86 */       logCommError(e, url, appKey, method, contentString);
/*  86:    */     }
/*  87:    */     catch (UnsupportedEncodingException e1)
/*  88:    */     {
/*  89: 88 */       e1.printStackTrace();
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   public static void logCommError(Exception e, HttpURLConnection conn, String appKey, String method, Map<String, String> params)
/*  94:    */   {
/*  95: 97 */     if (!needEnableLogger) {
/*  96: 98 */       return;
/*  97:    */     }
/*  98:100 */     _logCommError(e, conn, null, appKey, method, params);
/*  99:    */   }
/* 100:    */   
/* 101:    */   public static void logCommError(Exception e, String url, String appKey, String method, Map<String, String> params)
/* 102:    */   {
/* 103:105 */     if (!needEnableLogger) {
/* 104:106 */       return;
/* 105:    */     }
/* 106:108 */     _logCommError(e, null, url, appKey, method, params);
/* 107:    */   }
/* 108:    */   
/* 109:    */   private static void logCommError(Exception e, HttpURLConnection conn, String appKey, String method, String content)
/* 110:    */   {
/* 111:116 */     Map<String, String> params = parseParam(content);
/* 112:117 */     _logCommError(e, conn, null, appKey, method, params);
/* 113:    */   }
/* 114:    */   
/* 115:    */   private static void logCommError(Exception e, String url, String appKey, String method, String content)
/* 116:    */   {
/* 117:125 */     Map<String, String> params = parseParam(content);
/* 118:126 */     _logCommError(e, null, url, appKey, method, params);
/* 119:    */   }
/* 120:    */   
/* 121:    */   private static void _logCommError(Exception e, HttpURLConnection conn, String url, String appKey, String method, Map<String, String> params)
/* 122:    */   {
/* 123:134 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 124:135 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 125:136 */     String sdkName = "alipay-sdk-java-dynamicVersionNo";
/* 126:137 */     String urlStr = null;
/* 127:138 */     String rspCode = "";
/* 128:139 */     if (conn != null)
/* 129:    */     {
/* 130:    */       try
/* 131:    */       {
/* 132:141 */         urlStr = conn.getURL().toString();
/* 133:142 */         rspCode = "HTTP_ERROR_" + conn.getResponseCode();
/* 134:    */       }
/* 135:    */       catch (IOException ioe) {}
/* 136:    */     }
/* 137:    */     else
/* 138:    */     {
/* 139:146 */       urlStr = url;
/* 140:147 */       rspCode = "";
/* 141:    */     }
/* 142:149 */     StringBuilder sb = new StringBuilder();
/* 143:150 */     sb.append(df.format(new Date()));
/* 144:151 */     sb.append("^_^");
/* 145:152 */     sb.append(method);
/* 146:153 */     sb.append("^_^");
/* 147:154 */     sb.append(appKey);
/* 148:155 */     sb.append("^_^");
/* 149:156 */     sb.append(getIp());
/* 150:157 */     sb.append("^_^");
/* 151:158 */     sb.append(osName);
/* 152:159 */     sb.append("^_^");
/* 153:160 */     sb.append(sdkName);
/* 154:161 */     sb.append("^_^");
/* 155:162 */     sb.append(urlStr);
/* 156:163 */     sb.append("^_^");
/* 157:164 */     sb.append(rspCode);
/* 158:165 */     sb.append("^_^");
/* 159:166 */     sb.append((e.getMessage() + "").replaceAll("\r\n", " "));
/* 160:167 */     clog.error(sb.toString());
/* 161:    */   }
/* 162:    */   
/* 163:    */   private static Map<String, String> parseParam(String contentString)
/* 164:    */   {
/* 165:171 */     Map<String, String> params = new HashMap();
/* 166:172 */     if ((contentString == null) || (contentString.trim().equals(""))) {
/* 167:173 */       return params;
/* 168:    */     }
/* 169:175 */     String[] paramsArray = contentString.split("\\&");
/* 170:176 */     if (paramsArray != null) {
/* 171:177 */       for (String param : paramsArray)
/* 172:    */       {
/* 173:178 */         String[] keyValue = param.split("=");
/* 174:179 */         if ((keyValue != null) && (keyValue.length == 2)) {
/* 175:180 */           params.put(keyValue[0], keyValue[1]);
/* 176:    */         }
/* 177:    */       }
/* 178:    */     }
/* 179:184 */     return params;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public static void logBizDebug(String rsp)
/* 183:    */   {
/* 184:191 */     if (!needEnableLogger) {
/* 185:192 */       return;
/* 186:    */     }
/* 187:194 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 188:195 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 189:196 */     StringBuilder sb = new StringBuilder();
/* 190:197 */     sb.append(df.format(new Date()));
/* 191:198 */     sb.append("^_^");
/* 192:199 */     sb.append(rsp);
/* 193:201 */     if (blog.isDebugEnabled()) {
/* 194:202 */       blog.debug(sb.toString());
/* 195:    */     }
/* 196:    */   }
/* 197:    */   
/* 198:    */   public static void logBizError(String rsp)
/* 199:    */   {
/* 200:210 */     if (!needEnableLogger) {
/* 201:211 */       return;
/* 202:    */     }
/* 203:213 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 204:214 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 205:215 */     StringBuilder sb = new StringBuilder();
/* 206:216 */     sb.append(df.format(new Date()));
/* 207:217 */     sb.append("^_^");
/* 208:218 */     sb.append(rsp);
/* 209:219 */     blog.error(sb.toString());
/* 210:    */   }
/* 211:    */   
/* 212:    */   public static void logBizError(Throwable t)
/* 213:    */   {
/* 214:226 */     if (!needEnableLogger) {
/* 215:227 */       return;
/* 216:    */     }
/* 217:229 */     blog.error(t);
/* 218:    */   }
/* 219:    */   
/* 220:    */   public static void logErrorScene(Map<String, Object> rt, AlipayResponse tRsp, String appSecret)
/* 221:    */   {
/* 222:237 */     if (!needEnableLogger) {
/* 223:238 */       return;
/* 224:    */     }
/* 225:240 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 226:241 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 227:242 */     StringBuilder sb = new StringBuilder();
/* 228:243 */     sb.append("ErrorScene");
/* 229:244 */     sb.append("^_^");
/* 230:245 */     sb.append(tRsp.getErrorCode());
/* 231:246 */     sb.append("^_^");
/* 232:247 */     sb.append(tRsp.getSubCode());
/* 233:248 */     sb.append("^_^");
/* 234:249 */     sb.append(ip);
/* 235:250 */     sb.append("^_^");
/* 236:251 */     sb.append(osName);
/* 237:252 */     sb.append("^_^");
/* 238:253 */     sb.append(df.format(new Date()));
/* 239:254 */     sb.append("^_^");
/* 240:255 */     sb.append("ProtocalMustParams:");
/* 241:256 */     appendLog((AlipayHashMap)rt.get("protocalMustParams"), sb);
/* 242:257 */     sb.append("^_^");
/* 243:258 */     sb.append("ProtocalOptParams:");
/* 244:259 */     appendLog((AlipayHashMap)rt.get("protocalOptParams"), sb);
/* 245:260 */     sb.append("^_^");
/* 246:261 */     sb.append("ApplicationParams:");
/* 247:262 */     appendLog((AlipayHashMap)rt.get("textParams"), sb);
/* 248:263 */     sb.append("^_^");
/* 249:264 */     sb.append("Body:");
/* 250:265 */     sb.append((String)rt.get("rsp"));
/* 251:266 */     blog.error(sb.toString());
/* 252:    */   }
/* 253:    */   
/* 254:    */   private static void appendLog(AlipayHashMap map, StringBuilder sb)
/* 255:    */   {
/* 256:270 */     boolean first = true;
/* 257:271 */     Set<Entry<String, String>> set = map.entrySet();
/* 258:272 */     for (Entry<String, String> entry : set)
/* 259:    */     {
/* 260:273 */       if (!first) {
/* 261:274 */         sb.append("&");
/* 262:    */       } else {
/* 263:276 */         first = false;
/* 264:    */       }
/* 265:278 */       sb.append((String)entry.getKey()).append("=").append((String)entry.getValue());
/* 266:    */     }
/* 267:    */   }
/* 268:    */   
/* 269:    */   public static Boolean isBizDebugEnabled()
/* 270:    */   {
/* 271:283 */     return Boolean.valueOf(blog.isDebugEnabled());
/* 272:    */   }
/* 273:    */   
/* 274:    */   public static void setJDKDebugEnabled(Boolean isEnabled)
/* 275:    */   {
/* 276:293 */     if ((blog instanceof Jdk14Logger))
/* 277:    */     {
/* 278:294 */       Jdk14Logger logger = (Jdk14Logger)blog;
/* 279:295 */       if (isEnabled.booleanValue())
/* 280:    */       {
/* 281:296 */         logger.getLogger().setLevel(Level.FINE);
/* 282:297 */         Handler consoleHandler = new ConsoleHandler();
/* 283:298 */         consoleHandler.setLevel(Level.FINE);
/* 284:299 */         logger.getLogger().addHandler(consoleHandler);
/* 285:    */       }
/* 286:    */       else
/* 287:    */       {
/* 288:301 */         logger.getLogger().setLevel(Level.INFO);
/* 289:    */       }
/* 290:    */     }
/* 291:    */   }
/* 292:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.internal.util.AlipayLogger

 * JD-Core Version:    0.7.0.1

 */