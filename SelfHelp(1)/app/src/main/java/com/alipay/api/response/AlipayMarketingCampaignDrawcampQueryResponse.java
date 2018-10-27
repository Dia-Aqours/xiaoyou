/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.MpPrizeInfoModel;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayMarketingCampaignDrawcampQueryResponse
/*  10:    */   extends AlipayResponse
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 5853625635177882146L;
/*  13:    */   @ApiField("account_count")
/*  14:    */   private String accountCount;
/*  15:    */   @ApiField("appid_count")
/*  16:    */   private String appidCount;
/*  17:    */   @ApiField("award_count")
/*  18:    */   private String awardCount;
/*  19:    */   @ApiField("award_rate")
/*  20:    */   private String awardRate;
/*  21:    */   @ApiField("camp_code")
/*  22:    */   private String campCode;
/*  23:    */   @ApiField("camp_end_time")
/*  24:    */   private String campEndTime;
/*  25:    */   @ApiField("camp_id")
/*  26:    */   private String campId;
/*  27:    */   @ApiField("camp_name")
/*  28:    */   private String campName;
/*  29:    */   @ApiField("camp_start_time")
/*  30:    */   private String campStartTime;
/*  31:    */   @ApiField("camp_status")
/*  32:    */   private String campStatus;
/*  33:    */   @ApiField("cert_rule_id")
/*  34:    */   private String certRuleId;
/*  35:    */   @ApiField("certification_count")
/*  36:    */   private String certificationCount;
/*  37:    */   @ApiField("creator")
/*  38:    */   private String creator;
/*  39:    */   @ApiField("crowd_rule_id")
/*  40:    */   private String crowdRuleId;
/*  41:    */   @ApiField("mobile_count")
/*  42:    */   private String mobileCount;
/*  43:    */   @ApiListField("prize_list")
/*  44:    */   @ApiField("mp_prize_info_model")
/*  45:    */   private List<MpPrizeInfoModel> prizeList;
/*  46:    */   @ApiField("promo_rule_id")
/*  47:    */   private String promoRuleId;
/*  48:    */   @ApiField("trigger_type")
/*  49:    */   private String triggerType;
/*  50:    */   @ApiField("trigger_user_rule_id")
/*  51:    */   private String triggerUserRuleId;
/*  52:    */   @ApiField("user_rule_id")
/*  53:    */   private String userRuleId;
/*  54:    */   
/*  55:    */   public void setAccountCount(String accountCount)
/*  56:    */   {
/*  57:144 */     this.accountCount = accountCount;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getAccountCount()
/*  61:    */   {
/*  62:147 */     return this.accountCount;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setAppidCount(String appidCount)
/*  66:    */   {
/*  67:151 */     this.appidCount = appidCount;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getAppidCount()
/*  71:    */   {
/*  72:154 */     return this.appidCount;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setAwardCount(String awardCount)
/*  76:    */   {
/*  77:158 */     this.awardCount = awardCount;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getAwardCount()
/*  81:    */   {
/*  82:161 */     return this.awardCount;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setAwardRate(String awardRate)
/*  86:    */   {
/*  87:165 */     this.awardRate = awardRate;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getAwardRate()
/*  91:    */   {
/*  92:168 */     return this.awardRate;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setCampCode(String campCode)
/*  96:    */   {
/*  97:172 */     this.campCode = campCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getCampCode()
/* 101:    */   {
/* 102:175 */     return this.campCode;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setCampEndTime(String campEndTime)
/* 106:    */   {
/* 107:179 */     this.campEndTime = campEndTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getCampEndTime()
/* 111:    */   {
/* 112:182 */     return this.campEndTime;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setCampId(String campId)
/* 116:    */   {
/* 117:186 */     this.campId = campId;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getCampId()
/* 121:    */   {
/* 122:189 */     return this.campId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setCampName(String campName)
/* 126:    */   {
/* 127:193 */     this.campName = campName;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getCampName()
/* 131:    */   {
/* 132:196 */     return this.campName;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setCampStartTime(String campStartTime)
/* 136:    */   {
/* 137:200 */     this.campStartTime = campStartTime;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getCampStartTime()
/* 141:    */   {
/* 142:203 */     return this.campStartTime;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setCampStatus(String campStatus)
/* 146:    */   {
/* 147:207 */     this.campStatus = campStatus;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getCampStatus()
/* 151:    */   {
/* 152:210 */     return this.campStatus;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setCertRuleId(String certRuleId)
/* 156:    */   {
/* 157:214 */     this.certRuleId = certRuleId;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getCertRuleId()
/* 161:    */   {
/* 162:217 */     return this.certRuleId;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setCertificationCount(String certificationCount)
/* 166:    */   {
/* 167:221 */     this.certificationCount = certificationCount;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getCertificationCount()
/* 171:    */   {
/* 172:224 */     return this.certificationCount;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setCreator(String creator)
/* 176:    */   {
/* 177:228 */     this.creator = creator;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public String getCreator()
/* 181:    */   {
/* 182:231 */     return this.creator;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setCrowdRuleId(String crowdRuleId)
/* 186:    */   {
/* 187:235 */     this.crowdRuleId = crowdRuleId;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getCrowdRuleId()
/* 191:    */   {
/* 192:238 */     return this.crowdRuleId;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setMobileCount(String mobileCount)
/* 196:    */   {
/* 197:242 */     this.mobileCount = mobileCount;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getMobileCount()
/* 201:    */   {
/* 202:245 */     return this.mobileCount;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setPrizeList(List<MpPrizeInfoModel> prizeList)
/* 206:    */   {
/* 207:249 */     this.prizeList = prizeList;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public List<MpPrizeInfoModel> getPrizeList()
/* 211:    */   {
/* 212:252 */     return this.prizeList;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setPromoRuleId(String promoRuleId)
/* 216:    */   {
/* 217:256 */     this.promoRuleId = promoRuleId;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getPromoRuleId()
/* 221:    */   {
/* 222:259 */     return this.promoRuleId;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setTriggerType(String triggerType)
/* 226:    */   {
/* 227:263 */     this.triggerType = triggerType;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String getTriggerType()
/* 231:    */   {
/* 232:266 */     return this.triggerType;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setTriggerUserRuleId(String triggerUserRuleId)
/* 236:    */   {
/* 237:270 */     this.triggerUserRuleId = triggerUserRuleId;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public String getTriggerUserRuleId()
/* 241:    */   {
/* 242:273 */     return this.triggerUserRuleId;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void setUserRuleId(String userRuleId)
/* 246:    */   {
/* 247:277 */     this.userRuleId = userRuleId;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public String getUserRuleId()
/* 251:    */   {
/* 252:280 */     return this.userRuleId;
/* 253:    */   }
/* 254:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMarketingCampaignDrawcampQueryResponse
 * JD-Core Version:    0.7.0.1
 */