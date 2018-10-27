/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayMarketingCampaignDrawcampCreateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 3249734964726351762L;
/*  12:    */   @ApiField("account_count")
/*  13:    */   private String accountCount;
/*  14:    */   @ApiField("appid_count")
/*  15:    */   private String appidCount;
/*  16:    */   @ApiField("award_count")
/*  17:    */   private String awardCount;
/*  18:    */   @ApiField("award_rate")
/*  19:    */   private String awardRate;
/*  20:    */   @ApiField("camp_code")
/*  21:    */   private String campCode;
/*  22:    */   @ApiField("camp_end_time")
/*  23:    */   private String campEndTime;
/*  24:    */   @ApiField("camp_name")
/*  25:    */   private String campName;
/*  26:    */   @ApiField("camp_start_time")
/*  27:    */   private String campStartTime;
/*  28:    */   @ApiField("cert_rule_id")
/*  29:    */   private String certRuleId;
/*  30:    */   @ApiField("certification_count")
/*  31:    */   private String certificationCount;
/*  32:    */   @ApiField("crowd_rule_id")
/*  33:    */   private String crowdRuleId;
/*  34:    */   @ApiField("mobile_count")
/*  35:    */   private String mobileCount;
/*  36:    */   @ApiField("mpid")
/*  37:    */   private String mpid;
/*  38:    */   @ApiListField("prize_list")
/*  39:    */   @ApiField("mp_prize_info_model")
/*  40:    */   private List<MpPrizeInfoModel> prizeList;
/*  41:    */   @ApiField("promo_rule_id")
/*  42:    */   private String promoRuleId;
/*  43:    */   @ApiField("trigger_type")
/*  44:    */   private String triggerType;
/*  45:    */   @ApiField("trigger_user_rule_id")
/*  46:    */   private String triggerUserRuleId;
/*  47:    */   @ApiField("user_rule_id")
/*  48:    */   private String userRuleId;
/*  49:    */   
/*  50:    */   public String getAccountCount()
/*  51:    */   {
/*  52:131 */     return this.accountCount;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setAccountCount(String accountCount)
/*  56:    */   {
/*  57:134 */     this.accountCount = accountCount;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getAppidCount()
/*  61:    */   {
/*  62:138 */     return this.appidCount;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setAppidCount(String appidCount)
/*  66:    */   {
/*  67:141 */     this.appidCount = appidCount;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getAwardCount()
/*  71:    */   {
/*  72:145 */     return this.awardCount;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setAwardCount(String awardCount)
/*  76:    */   {
/*  77:148 */     this.awardCount = awardCount;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getAwardRate()
/*  81:    */   {
/*  82:152 */     return this.awardRate;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setAwardRate(String awardRate)
/*  86:    */   {
/*  87:155 */     this.awardRate = awardRate;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getCampCode()
/*  91:    */   {
/*  92:159 */     return this.campCode;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setCampCode(String campCode)
/*  96:    */   {
/*  97:162 */     this.campCode = campCode;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getCampEndTime()
/* 101:    */   {
/* 102:166 */     return this.campEndTime;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setCampEndTime(String campEndTime)
/* 106:    */   {
/* 107:169 */     this.campEndTime = campEndTime;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getCampName()
/* 111:    */   {
/* 112:173 */     return this.campName;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setCampName(String campName)
/* 116:    */   {
/* 117:176 */     this.campName = campName;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getCampStartTime()
/* 121:    */   {
/* 122:180 */     return this.campStartTime;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setCampStartTime(String campStartTime)
/* 126:    */   {
/* 127:183 */     this.campStartTime = campStartTime;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getCertRuleId()
/* 131:    */   {
/* 132:187 */     return this.certRuleId;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setCertRuleId(String certRuleId)
/* 136:    */   {
/* 137:190 */     this.certRuleId = certRuleId;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getCertificationCount()
/* 141:    */   {
/* 142:194 */     return this.certificationCount;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setCertificationCount(String certificationCount)
/* 146:    */   {
/* 147:197 */     this.certificationCount = certificationCount;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getCrowdRuleId()
/* 151:    */   {
/* 152:201 */     return this.crowdRuleId;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setCrowdRuleId(String crowdRuleId)
/* 156:    */   {
/* 157:204 */     this.crowdRuleId = crowdRuleId;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getMobileCount()
/* 161:    */   {
/* 162:208 */     return this.mobileCount;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setMobileCount(String mobileCount)
/* 166:    */   {
/* 167:211 */     this.mobileCount = mobileCount;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getMpid()
/* 171:    */   {
/* 172:215 */     return this.mpid;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setMpid(String mpid)
/* 176:    */   {
/* 177:218 */     this.mpid = mpid;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public List<MpPrizeInfoModel> getPrizeList()
/* 181:    */   {
/* 182:222 */     return this.prizeList;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setPrizeList(List<MpPrizeInfoModel> prizeList)
/* 186:    */   {
/* 187:225 */     this.prizeList = prizeList;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getPromoRuleId()
/* 191:    */   {
/* 192:229 */     return this.promoRuleId;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setPromoRuleId(String promoRuleId)
/* 196:    */   {
/* 197:232 */     this.promoRuleId = promoRuleId;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getTriggerType()
/* 201:    */   {
/* 202:236 */     return this.triggerType;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setTriggerType(String triggerType)
/* 206:    */   {
/* 207:239 */     this.triggerType = triggerType;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getTriggerUserRuleId()
/* 211:    */   {
/* 212:243 */     return this.triggerUserRuleId;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setTriggerUserRuleId(String triggerUserRuleId)
/* 216:    */   {
/* 217:246 */     this.triggerUserRuleId = triggerUserRuleId;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getUserRuleId()
/* 221:    */   {
/* 222:250 */     return this.userRuleId;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setUserRuleId(String userRuleId)
/* 226:    */   {
/* 227:253 */     this.userRuleId = userRuleId;
/* 228:    */   }
/* 229:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDrawcampCreateModel
 * JD-Core Version:    0.7.0.1
 */