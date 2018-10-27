/*   1:    */ package com.alipay.api.internal.util.json;
/*   2:    */ 
/*   3:    */

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.internal.util.AlipayLogger;
import com.googlecode.openbeans.BeanInfo;
import com.googlecode.openbeans.IntrospectionException;
import com.googlecode.openbeans.Introspector;
import com.googlecode.openbeans.PropertyDescriptor;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.CharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TimeZone;

/*   4:    */
/*   5:    */
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
/*  27:    */ public class JSONWriter
/*  28:    */ {
/*  29: 29 */   private StringBuffer buf = new StringBuffer();
/*  30: 30 */   private Stack<Object> calls = new Stack();
/*  31: 31 */   private boolean emitClassName = true;
/*  32:    */   private DateFormat format;
/*  33:    */   
/*  34:    */   public JSONWriter(boolean emitClassName)
/*  35:    */   {
/*  36: 35 */     this.emitClassName = emitClassName;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public JSONWriter()
/*  40:    */   {
/*  41: 39 */     this(false);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public JSONWriter(DateFormat format)
/*  45:    */   {
/*  46: 43 */     this(false);
/*  47: 44 */     this.format = format;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String write(Object object) throws IntrospectionException
/*  51:    */   {
/*  52: 48 */     return write(object, false);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String write(Object object, boolean isApiModel) throws IntrospectionException
/*  56:    */   {
/*  57: 52 */     this.buf.setLength(0);
/*  58: 53 */     value(object, isApiModel);
/*  59: 54 */     return this.buf.toString();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String write(long n)
/*  63:    */   {
/*  64: 58 */     return String.valueOf(n);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String write(double d)
/*  68:    */   {
/*  69: 62 */     return String.valueOf(d);
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String write(char c)
/*  73:    */   {
/*  74: 66 */     return "\"" + c + "\"";
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String write(boolean b)
/*  78:    */   {
/*  79: 70 */     return String.valueOf(b);
/*  80:    */   }
/*  81:    */   
/*  82:    */   private void value(Object object) throws IntrospectionException
/*  83:    */   {
/*  84: 74 */     value(object, false);
/*  85:    */   }
/*  86:    */   
/*  87:    */   private void value(Object object, boolean isApiModel) throws IntrospectionException
/*  88:    */   {
/*  89: 78 */     if ((object == null) || (cyclic(object)))
/*  90:    */     {
/*  91: 79 */       add(null);
/*  92:    */     }
/*  93:    */     else
/*  94:    */     {
/*  95: 81 */       this.calls.push(object);
/*  96: 82 */       if ((object instanceof Class)) {
/*  97: 83 */         string(object);
/*  98: 84 */       } else if ((object instanceof Boolean)) {
/*  99: 85 */         bool(((Boolean)object).booleanValue());
/* 100: 86 */       } else if ((object instanceof Number)) {
/* 101: 87 */         add(object);
/* 102: 88 */       } else if ((object instanceof String)) {
/* 103: 89 */         string(object);
/* 104: 90 */       } else if ((object instanceof Character)) {
/* 105: 91 */         string(object);
/* 106: 92 */       } else if ((object instanceof Map)) {
/* 107: 93 */         map((Map)object);
/* 108: 94 */       } else if (object.getClass().isArray()) {
/* 109: 95 */         array(object, isApiModel);
/* 110: 96 */       } else if ((object instanceof Iterator)) {
/* 111: 97 */         array((Iterator)object, isApiModel);
/* 112: 98 */       } else if ((object instanceof Collection)) {
/* 113: 99 */         array(((Collection)object).iterator(), isApiModel);
/* 114:100 */       } else if ((object instanceof Date)) {
/* 115:101 */         date((Date)object);
/* 116:103 */       } else if (isApiModel) {
/* 117:104 */         model(object);
/* 118:    */       } else {
/* 119:106 */         bean(object);
/* 120:    */       }
/* 121:108 */       this.calls.pop();
/* 122:    */     }
/* 123:    */   }
/* 124:    */   
/* 125:    */   private boolean cyclic(Object object)
/* 126:    */   {
/* 127:113 */     Iterator<Object> it = this.calls.iterator();
/* 128:114 */     while (it.hasNext())
/* 129:    */     {
/* 130:115 */       Object called = it.next();
/* 131:116 */       if (object == called) {
/* 132:117 */         return true;
/* 133:    */       }
/* 134:    */     }
/* 135:119 */     return false;
/* 136:    */   }
/* 137:    */   
/* 138:    */   private void bean(Object object) throws IntrospectionException
/* 139:    */   {
/* 140:123 */     add("{");
/* 141:    */     
/* 142:125 */     boolean addedSomething = false;
/* 143:    */     try
/* 144:    */     {
/* 145:127 */       BeanInfo info = Introspector.getBeanInfo(object.getClass());
/* 146:128 */       PropertyDescriptor[] props = info.getPropertyDescriptors();
/* 147:129 */       for (int i = 0; i < props.length; i++)
/* 148:    */       {
/* 149:130 */         PropertyDescriptor prop = props[i];
/* 150:131 */         String name = prop.getName();
/* 151:132 */         Method accessor = prop.getReadMethod();
/* 152:133 */         if (((this.emitClassName) || (!"class".equals(name))) && (accessor != null))
/* 153:    */         {
/* 154:134 */           if (!accessor.isAccessible()) {
/* 155:135 */             accessor.setAccessible(true);
/* 156:    */           }
/* 157:136 */           Object value = accessor.invoke(object, (Object[])null);
/* 158:137 */           if (value != null)
/* 159:    */           {
/* 160:139 */             if (addedSomething) {
/* 161:140 */               add(',');
/* 162:    */             }
/* 163:141 */             add(name, value);
/* 164:142 */             addedSomething = true;
/* 165:    */           }
/* 166:    */         }
/* 167:    */       }
/* 168:145 */       Field[] ff = object.getClass().getFields();
/* 169:146 */       for (int i = 0; i < ff.length; i++)
/* 170:    */       {
/* 171:147 */         Field field = ff[i];
/* 172:148 */         Object value = field.get(object);
/* 173:149 */         if (value != null)
/* 174:    */         {
/* 175:151 */           if (addedSomething) {
/* 176:152 */             add(',');
/* 177:    */           }
/* 178:153 */           add(field.getName(), value);
/* 179:154 */           addedSomething = true;
/* 180:    */         }
/* 181:    */       }
/* 182:    */     }
/* 183:    */     catch (IllegalAccessException iae)
/* 184:    */     {
/* 185:157 */       iae.printStackTrace();
/* 186:    */     }
/* 187:    */     catch (InvocationTargetException ite)
/* 188:    */     {
/* 189:159 */       ite.getCause().printStackTrace();
/* 190:160 */       ite.printStackTrace();
/* 191:    */     }
/* 192:    */     catch (IntrospectionException ie)
/* 193:    */     {
/* 194:162 */       ie.printStackTrace();
/* 195:    */     }
/* 196:164 */     add("}");
/* 197:    */   }
/* 198:    */   
/* 199:    */   private void model(Object object)
/* 200:    */   {
/* 201:168 */     add("{");
/* 202:169 */     boolean addedSomething = false;
/* 203:170 */     Field[] ff = object.getClass().getDeclaredFields();
/* 204:    */     try
/* 205:    */     {
/* 206:172 */       for (int i = 0; i < ff.length; i++)
/* 207:    */       {
/* 208:173 */         Field field = ff[i];
/* 209:    */         
/* 210:175 */         ApiField jsonField = (ApiField)field.getAnnotation(ApiField.class);
/* 211:176 */         ApiListField listField = (ApiListField)field.getAnnotation(ApiListField.class);
/* 212:178 */         if (listField != null)
/* 213:    */         {
/* 214:179 */           PropertyDescriptor pd = new PropertyDescriptor(field.getName(), object.getClass());
/* 215:    */           
/* 216:181 */           Method accessor = pd.getReadMethod();
/* 217:182 */           if (!accessor.isAccessible()) {
/* 218:183 */             accessor.setAccessible(true);
/* 219:    */           }
/* 220:184 */           Object value = accessor.invoke(object, (Object[])null);
/* 221:185 */           if (value != null)
/* 222:    */           {
/* 223:187 */             if (addedSomething) {
/* 224:188 */               add(',');
/* 225:    */             }
/* 226:189 */             add(listField.value(), value, true);
/* 227:190 */             addedSomething = true;
/* 228:    */           }
/* 229:    */         }
/* 230:191 */         else if (jsonField != null)
/* 231:    */         {
/* 232:192 */           PropertyDescriptor pd = new PropertyDescriptor(field.getName(), object.getClass());
/* 233:    */           
/* 234:194 */           Method accessor = pd.getReadMethod();
/* 235:195 */           if (!accessor.isAccessible()) {
/* 236:196 */             accessor.setAccessible(true);
/* 237:    */           }
/* 238:197 */           Object value = accessor.invoke(object, (Object[])null);
/* 239:198 */           if (value != null)
/* 240:    */           {
/* 241:200 */             if (addedSomething) {
/* 242:201 */               add(',');
/* 243:    */             }
/* 244:202 */             add(jsonField.value(), value, true);
/* 245:203 */             addedSomething = true;
/* 246:    */           }
/* 247:    */         }
/* 248:    */       }
/* 249:    */     }
/* 250:    */     catch (IntrospectionException e1)
/* 251:    */     {
/* 252:207 */       AlipayLogger.logBizError(e1);
/* 253:    */     }
/* 254:    */     catch (IllegalAccessException e2)
/* 255:    */     {
/* 256:209 */       AlipayLogger.logBizError(e2);
/* 257:    */     }
/* 258:    */     catch (IllegalArgumentException e3)
/* 259:    */     {
/* 260:211 */       AlipayLogger.logBizError(e3);
/* 261:    */     }
/* 262:    */     catch (InvocationTargetException e4)
/* 263:    */     {
/* 264:213 */       AlipayLogger.logBizError(e4);
/* 265:    */     }
/* 266:215 */     add("}");
/* 267:    */   }
/* 268:    */   
/* 269:    */   private void add(String name, Object value) throws IntrospectionException
/* 270:    */   {
/* 271:219 */     add(name, value, false);
/* 272:    */   }
/* 273:    */   
/* 274:    */   private void add(String name, Object value, boolean isApiModel) throws IntrospectionException
/* 275:    */   {
/* 276:223 */     add('"');
/* 277:224 */     add(name);
/* 278:225 */     add("\":");
/* 279:226 */     value(value, isApiModel);
/* 280:    */   }
/* 281:    */   
/* 282:    */   private void map(Map<?, ?> map) throws IntrospectionException
/* 283:    */   {
/* 284:230 */     add("{");
/* 285:231 */     Iterator<?> it = map.entrySet().iterator();
/* 286:232 */     while (it.hasNext())
/* 287:    */     {
/* 288:233 */       Entry<?, ?> e = (Entry)it.next();
/* 289:234 */       value(e.getKey());
/* 290:235 */       add(":");
/* 291:236 */       value(e.getValue());
/* 292:237 */       if (it.hasNext()) {
/* 293:238 */         add(',');
/* 294:    */       }
/* 295:    */     }
/* 296:240 */     add("}");
/* 297:    */   }
/* 298:    */   
/* 299:    */   private void array(Iterator<?> it) throws IntrospectionException
/* 300:    */   {
/* 301:244 */     array(it, false);
/* 302:    */   }
/* 303:    */   
/* 304:    */   private void array(Iterator<?> it, boolean isApiModel) throws IntrospectionException
/* 305:    */   {
/* 306:248 */     add("[");
/* 307:249 */     while (it.hasNext())
/* 308:    */     {
/* 309:250 */       value(it.next(), isApiModel);
/* 310:251 */       if (it.hasNext()) {
/* 311:252 */         add(",");
/* 312:    */       }
/* 313:    */     }
/* 314:254 */     add("]");
/* 315:    */   }
/* 316:    */   
/* 317:    */   private void array(Object object) throws IntrospectionException
/* 318:    */   {
/* 319:258 */     array(object, false);
/* 320:    */   }
/* 321:    */   
/* 322:    */   private void array(Object object, boolean isApiModel) throws IntrospectionException
/* 323:    */   {
/* 324:262 */     add("[");
/* 325:263 */     int length = Array.getLength(object);
/* 326:264 */     for (int i = 0; i < length; i++)
/* 327:    */     {
/* 328:265 */       value(Array.get(object, i), isApiModel);
/* 329:266 */       if (i < length - 1) {
/* 330:267 */         add(',');
/* 331:    */       }
/* 332:    */     }
/* 333:269 */     add("]");
/* 334:    */   }
/* 335:    */   
/* 336:    */   private void bool(boolean b)
/* 337:    */   {
/* 338:273 */     add(b ? "true" : "false");
/* 339:    */   }
/* 340:    */   
/* 341:    */   private void date(Date date)
/* 342:    */   {
/* 343:277 */     if (this.format == null)
/* 344:    */     {
/* 345:278 */       this.format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 346:279 */       this.format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 347:    */     }
/* 348:281 */     add("\"");
/* 349:282 */     add(this.format.format(date));
/* 350:283 */     add("\"");
/* 351:    */   }
/* 352:    */   
/* 353:    */   private void string(Object obj)
/* 354:    */   {
/* 355:287 */     add('"');
/* 356:288 */     CharacterIterator it = new StringCharacterIterator(obj.toString());
/* 357:289 */     for (char c = it.first(); c != 65535; c = it.next()) {
/* 358:290 */       if (c == '"') {
/* 359:291 */         add("\\\"");
/* 360:292 */       } else if (c == '\\') {
/* 361:293 */         add("\\\\");
/* 362:294 */       } else if (c == '/') {
/* 363:295 */         add("\\/");
/* 364:296 */       } else if (c == '\b') {
/* 365:297 */         add("\\b");
/* 366:298 */       } else if (c == '\f') {
/* 367:299 */         add("\\f");
/* 368:300 */       } else if (c == '\n') {
/* 369:301 */         add("\\n");
/* 370:302 */       } else if (c == '\r') {
/* 371:303 */         add("\\r");
/* 372:304 */       } else if (c == '\t') {
/* 373:305 */         add("\\t");
/* 374:306 */       } else if (Character.isISOControl(c)) {
/* 375:307 */         unicode(c);
/* 376:    */       } else {
/* 377:309 */         add(c);
/* 378:    */       }
/* 379:    */     }
/* 380:312 */     add('"');
/* 381:    */   }
/* 382:    */   
/* 383:    */   private void add(Object obj)
/* 384:    */   {
/* 385:316 */     this.buf.append(obj);
/* 386:    */   }
/* 387:    */   
/* 388:    */   private void add(char c)
/* 389:    */   {
/* 390:320 */     this.buf.append(c);
/* 391:    */   }
/* 392:    */   
/* 393:323 */   static char[] hex = "0123456789ABCDEF".toCharArray();
/* 394:    */   
/* 395:    */   private void unicode(char c)
/* 396:    */   {
/* 397:326 */     add("\\u");
/* 398:327 */     int n = c;
/* 399:328 */     for (int i = 0; i < 4; i++)
/* 400:    */     {
/* 401:329 */       int digit = (n & 0xF000) >> 12;
/* 402:330 */       add(hex[digit]);
/* 403:331 */       n <<= 4;
/* 404:    */     }
/* 405:    */   }
/* 406:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.internal.util.json.JSONWriter

 * JD-Core Version:    0.7.0.1

 */