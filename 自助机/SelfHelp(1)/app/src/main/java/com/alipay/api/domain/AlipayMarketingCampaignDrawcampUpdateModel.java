/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayMarketingCampaignDrawcampUpdateModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5244547362615863911L;
/*  12:    */   @ApiField("account_count")
/*  13:    */   private String accountCount;
/*  14:    */   @ApiField("appid_count")
/*  15:    */   private String appidCount;
/*  16:    */   @ApiField("award_rate")
/*  17:    */   private String awardRate;
/*  18:    */   @ApiField("camp_end_time")
/*  19:    */   private String campEndTime;
/*  20:    */   @ApiField("camp_id")
/*  21:    */   private String campId;
/*  22:    */   @ApiField("camp_name")
/*  23:    */   private String campName;
/*  24:    */   @ApiField("camp_start_time")
/*  25:    */   private String campStartTime;
/*  26:    */   @ApiField("cert_rule_id")
/*  27:    */   private String certRuleId;
/*  28:    */   @ApiField("certification_count")
/*  29:    */   private String certificationCount;
/*  30:    */   @ApiField("crowd_rule_id")
/*  31:    */   private String crowdRuleId;
/*  32:    */   @ApiField("mobile_count")
/*  33:    */   private String mobileCount;
/*  34:    */   @ApiField("mpid")
/*  35:    */   private String mpid;
/*  36:    */   @ApiListField("prize_list")
/*  37:    */   @ApiField("mp_prize_info_model")
/*  38:    */   private List<MpPrizeInfoModel> prizeList;
/*  39:    */   @ApiField("promo_rule_id")
/*  40:    */   private String promoRuleId;
/*  41:    */   @ApiField("user_rule_id")
/*  42:    */   private String userRuleId;
/*  43:    */   
/*  44:    */   public String getAccountCount()
/*  45:    */   {
/*  46:111 */     return this.accountCount;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setAccountCount(String accountCount)
/*  50:    */   {
/*  51:114 */     this.accountCount = accountCount;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getAppidCount()
/*  55:    */   {
/*  56:118 */     return this.appidCount;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setAppidCount(String appidCount)
/*  60:    */   {
/*  61:121 */     this.appidCount = appidCount;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getAwardRate()
/*  65:    */   {
/*  66:125 */     return this.awardRate;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setAwardRate(String awardRate)
/*  70:    */   {
/*  71:128 */     this.awardRate = awardRate;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getCampEndTime()
/*  75:    */   {
/*  76:132 */     return this.campEndTime;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setCampEndTime(String campEndTime)
/*  80:    */   {
/*  81:135 */     this.campEndTime = campEndTime;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getCampId()
/*  85:    */   {
/*  86:139 */     return this.campId;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setCampId(String campId)
/*  90:    */   {
/*  91:142 */     this.campId = campId;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getCampName()
/*  95:    */   {
/*  96:146 */     return this.campName;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setCampName(String campName)
/* 100:    */   {
/* 101:149 */     this.campName = campName;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getCampStartTime()
/* 105:    */   {
/* 106:153 */     return this.campStartTime;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setCampStartTime(String campStartTime)
/* 110:    */   {
/* 111:156 */     this.campStartTime = campStartTime;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getCertRuleId()
/* 115:    */   {
/* 116:160 */     return this.certRuleId;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setCertRuleId(String certRuleId)
/* 120:    */   {
/* 121:163 */     this.certRuleId = certRuleId;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getCertificationCount()
/* 125:    */   {
/* 126:167 */     return this.certificationCount;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setCertificationCount(String certificationCount)
/* 130:    */   {
/* 131:170 */     this.certificationCount = certificationCount;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getCrowdRuleId()
/* 135:    */   {
/* 136:174 */     return this.crowdRuleId;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setCrowdRuleId(String crowdRuleId)
/* 140:    */   {
/* 141:177 */     this.crowdRuleId = crowdRuleId;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getMobileCount()
/* 145:    */   {
/* 146:181 */     return this.mobileCount;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setMobileCount(String mobileCount)
/* 150:    */   {
/* 151:184 */     this.mobileCount = mobileCount;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getMpid()
/* 155:    */   {
/* 156:188 */     return this.mpid;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setMpid(String mpid)
/* 160:    */   {
/* 161:191 */     this.mpid = mpid;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public List<MpPrizeInfoModel> getPrizeList()
/* 165:    */   {
/* 166:195 */     return this.prizeList;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setPrizeList(List<MpPrizeInfoModel> prizeList)
/* 170:    */   {
/* 171:198 */     this.prizeList = prizeList;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getPromoRuleId()
/* 175:    */   {
/* 176:202 */     return this.promoRuleId;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setPromoRuleId(String promoRuleId)
/* 180:    */   {
/* 181:205 */     this.promoRuleId = promoRuleId;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getUserRuleId()
/* 185:    */   {
/* 186:209 */     return this.userRuleId;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setUserRuleId(String userRuleId)
/* 190:    */   {
/* 191:212 */     this.userRuleId = userRuleId;
/* 192:    */   }
/* 193:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayMarketingCampaignDrawcampUpdateModel
 * JD-Core Version:    0.7.0.1
 */