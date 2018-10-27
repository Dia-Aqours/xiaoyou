/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipaySocialBaseMcommentNewsfeedAddModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 7448976293538374776L;
/*  12:    */   @ApiField("activity_address")
/*  13:    */   private String activityAddress;
/*  14:    */   @ApiField("activity_name")
/*  15:    */   private String activityName;
/*  16:    */   @ApiField("aid")
/*  17:    */   private String aid;
/*  18:    */   @ApiField("biz_no")
/*  19:    */   private String bizNo;
/*  20:    */   @ApiField("content")
/*  21:    */   private String content;
/*  22:    */   @ApiField("gift_info")
/*  23:    */   private NewsfeedMediaGiftInfo giftInfo;
/*  24:    */   @ApiListField("img_infos")
/*  25:    */   @ApiField("newsfeed_media_img")
/*  26:    */   private List<NewsfeedMediaImg> imgInfos;
/*  27:    */   @ApiField("label_info")
/*  28:    */   private NewsfeedLabelInfo labelInfo;
/*  29:    */   @ApiField("link_info")
/*  30:    */   private NewsfeedMediaLinkInfo linkInfo;
/*  31:    */   @ApiField("location_info")
/*  32:    */   private NewsfeedLocationInfo locationInfo;
/*  33:    */   @ApiField("location_name")
/*  34:    */   private String locationName;
/*  35:    */   @ApiField("location_scheme")
/*  36:    */   private String locationScheme;
/*  37:    */   @ApiField("scene_code")
/*  38:    */   private String sceneCode;
/*  39:    */   @ApiField("score")
/*  40:    */   private Long score;
/*  41:    */   @ApiField("source")
/*  42:    */   private String source;
/*  43:    */   @ApiField("source_icon")
/*  44:    */   private String sourceIcon;
/*  45:    */   @ApiField("source_name")
/*  46:    */   private String sourceName;
/*  47:    */   @ApiField("spread_range")
/*  48:    */   private Long spreadRange;
/*  49:    */   @ApiField("type")
/*  50:    */   private String type;
/*  51:    */   @ApiField("user_id")
/*  52:    */   private String userId;
/*  53:    */   @ApiField("video_info")
/*  54:    */   private NewsfeedMediaVideoInfo videoInfo;
/*  55:    */   @ApiField("visible")
/*  56:    */   private Long visible;
/*  57:    */   @ApiListField("visible_range")
/*  58:    */   @ApiField("string")
/*  59:    */   private List<String> visibleRange;
/*  60:    */   @ApiListField("with_me")
/*  61:    */   @ApiField("newsfeed_with_me_info")
/*  62:    */   private List<NewsfeedWithMeInfo> withMe;
/*  63:    */   
/*  64:    */   public String getActivityAddress()
/*  65:    */   {
/*  66:175 */     return this.activityAddress;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setActivityAddress(String activityAddress)
/*  70:    */   {
/*  71:178 */     this.activityAddress = activityAddress;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getActivityName()
/*  75:    */   {
/*  76:182 */     return this.activityName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setActivityName(String activityName)
/*  80:    */   {
/*  81:185 */     this.activityName = activityName;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getAid()
/*  85:    */   {
/*  86:189 */     return this.aid;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setAid(String aid)
/*  90:    */   {
/*  91:192 */     this.aid = aid;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getBizNo()
/*  95:    */   {
/*  96:196 */     return this.bizNo;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setBizNo(String bizNo)
/* 100:    */   {
/* 101:199 */     this.bizNo = bizNo;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getContent()
/* 105:    */   {
/* 106:203 */     return this.content;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setContent(String content)
/* 110:    */   {
/* 111:206 */     this.content = content;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public NewsfeedMediaGiftInfo getGiftInfo()
/* 115:    */   {
/* 116:210 */     return this.giftInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setGiftInfo(NewsfeedMediaGiftInfo giftInfo)
/* 120:    */   {
/* 121:213 */     this.giftInfo = giftInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public List<NewsfeedMediaImg> getImgInfos()
/* 125:    */   {
/* 126:217 */     return this.imgInfos;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setImgInfos(List<NewsfeedMediaImg> imgInfos)
/* 130:    */   {
/* 131:220 */     this.imgInfos = imgInfos;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public NewsfeedLabelInfo getLabelInfo()
/* 135:    */   {
/* 136:224 */     return this.labelInfo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setLabelInfo(NewsfeedLabelInfo labelInfo)
/* 140:    */   {
/* 141:227 */     this.labelInfo = labelInfo;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public NewsfeedMediaLinkInfo getLinkInfo()
/* 145:    */   {
/* 146:231 */     return this.linkInfo;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setLinkInfo(NewsfeedMediaLinkInfo linkInfo)
/* 150:    */   {
/* 151:234 */     this.linkInfo = linkInfo;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public NewsfeedLocationInfo getLocationInfo()
/* 155:    */   {
/* 156:238 */     return this.locationInfo;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setLocationInfo(NewsfeedLocationInfo locationInfo)
/* 160:    */   {
/* 161:241 */     this.locationInfo = locationInfo;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getLocationName()
/* 165:    */   {
/* 166:245 */     return this.locationName;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setLocationName(String locationName)
/* 170:    */   {
/* 171:248 */     this.locationName = locationName;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getLocationScheme()
/* 175:    */   {
/* 176:252 */     return this.locationScheme;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setLocationScheme(String locationScheme)
/* 180:    */   {
/* 181:255 */     this.locationScheme = locationScheme;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getSceneCode()
/* 185:    */   {
/* 186:259 */     return this.sceneCode;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setSceneCode(String sceneCode)
/* 190:    */   {
/* 191:262 */     this.sceneCode = sceneCode;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Long getScore()
/* 195:    */   {
/* 196:266 */     return this.score;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setScore(Long score)
/* 200:    */   {
/* 201:269 */     this.score = score;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getSource()
/* 205:    */   {
/* 206:273 */     return this.source;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setSource(String source)
/* 210:    */   {
/* 211:276 */     this.source = source;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getSourceIcon()
/* 215:    */   {
/* 216:280 */     return this.sourceIcon;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setSourceIcon(String sourceIcon)
/* 220:    */   {
/* 221:283 */     this.sourceIcon = sourceIcon;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getSourceName()
/* 225:    */   {
/* 226:287 */     return this.sourceName;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setSourceName(String sourceName)
/* 230:    */   {
/* 231:290 */     this.sourceName = sourceName;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public Long getSpreadRange()
/* 235:    */   {
/* 236:294 */     return this.spreadRange;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setSpreadRange(Long spreadRange)
/* 240:    */   {
/* 241:297 */     this.spreadRange = spreadRange;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getType()
/* 245:    */   {
/* 246:301 */     return this.type;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setType(String type)
/* 250:    */   {
/* 251:304 */     this.type = type;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public String getUserId()
/* 255:    */   {
/* 256:308 */     return this.userId;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setUserId(String userId)
/* 260:    */   {
/* 261:311 */     this.userId = userId;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public NewsfeedMediaVideoInfo getVideoInfo()
/* 265:    */   {
/* 266:315 */     return this.videoInfo;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setVideoInfo(NewsfeedMediaVideoInfo videoInfo)
/* 270:    */   {
/* 271:318 */     this.videoInfo = videoInfo;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public Long getVisible()
/* 275:    */   {
/* 276:322 */     return this.visible;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public void setVisible(Long visible)
/* 280:    */   {
/* 281:325 */     this.visible = visible;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public List<String> getVisibleRange()
/* 285:    */   {
/* 286:329 */     return this.visibleRange;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void setVisibleRange(List<String> visibleRange)
/* 290:    */   {
/* 291:332 */     this.visibleRange = visibleRange;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public List<NewsfeedWithMeInfo> getWithMe()
/* 295:    */   {
/* 296:336 */     return this.withMe;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void setWithMe(List<NewsfeedWithMeInfo> withMe)
/* 300:    */   {
/* 301:339 */     this.withMe = withMe;
/* 302:    */   }
/* 303:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipaySocialBaseMcommentNewsfeedAddModel
 * JD-Core Version:    0.7.0.1
 */