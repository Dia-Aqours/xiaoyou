/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayUserBenefitEditModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7683721558996262973L;
/*  10:    */   @ApiField("benefit_area_code")
/*  11:    */   private String benefitAreaCode;
/*  12:    */   @ApiField("benefit_icon_url")
/*  13:    */   private String benefitIconUrl;
/*  14:    */   @ApiField("benefit_id")
/*  15:    */   private String benefitId;
/*  16:    */   @ApiField("benefit_name")
/*  17:    */   private String benefitName;
/*  18:    */   @ApiField("benefit_name_as_area_subtitle")
/*  19:    */   private String benefitNameAsAreaSubtitle;
/*  20:    */   @ApiField("benefit_page_url")
/*  21:    */   private String benefitPageUrl;
/*  22:    */   @ApiField("benefit_point")
/*  23:    */   private Long benefitPoint;
/*  24:    */   @ApiField("benefit_rec_biz_id")
/*  25:    */   private String benefitRecBizId;
/*  26:    */   @ApiField("benefit_rec_type")
/*  27:    */   private String benefitRecType;
/*  28:    */   @ApiField("benefit_subtitle")
/*  29:    */   private String benefitSubtitle;
/*  30:    */   @ApiField("camp_id")
/*  31:    */   private String campId;
/*  32:    */   @ApiField("eligible_grade")
/*  33:    */   private String eligibleGrade;
/*  34:    */   @ApiField("end_time")
/*  35:    */   private String endTime;
/*  36:    */   @ApiField("exchange_rule_ids")
/*  37:    */   private String exchangeRuleIds;
/*  38:    */   @ApiField("grade_discount")
/*  39:    */   private String gradeDiscount;
/*  40:    */   @ApiField("start_time")
/*  41:    */   private String startTime;
/*  42:    */   
/*  43:    */   public String getBenefitAreaCode()
/*  44:    */   {
/*  45:121 */     return this.benefitAreaCode;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setBenefitAreaCode(String benefitAreaCode)
/*  49:    */   {
/*  50:124 */     this.benefitAreaCode = benefitAreaCode;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getBenefitIconUrl()
/*  54:    */   {
/*  55:128 */     return this.benefitIconUrl;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setBenefitIconUrl(String benefitIconUrl)
/*  59:    */   {
/*  60:131 */     this.benefitIconUrl = benefitIconUrl;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getBenefitId()
/*  64:    */   {
/*  65:135 */     return this.benefitId;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setBenefitId(String benefitId)
/*  69:    */   {
/*  70:138 */     this.benefitId = benefitId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getBenefitName()
/*  74:    */   {
/*  75:142 */     return this.benefitName;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setBenefitName(String benefitName)
/*  79:    */   {
/*  80:145 */     this.benefitName = benefitName;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getBenefitNameAsAreaSubtitle()
/*  84:    */   {
/*  85:149 */     return this.benefitNameAsAreaSubtitle;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setBenefitNameAsAreaSubtitle(String benefitNameAsAreaSubtitle)
/*  89:    */   {
/*  90:152 */     this.benefitNameAsAreaSubtitle = benefitNameAsAreaSubtitle;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getBenefitPageUrl()
/*  94:    */   {
/*  95:156 */     return this.benefitPageUrl;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setBenefitPageUrl(String benefitPageUrl)
/*  99:    */   {
/* 100:159 */     this.benefitPageUrl = benefitPageUrl;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public Long getBenefitPoint()
/* 104:    */   {
/* 105:163 */     return this.benefitPoint;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setBenefitPoint(Long benefitPoint)
/* 109:    */   {
/* 110:166 */     this.benefitPoint = benefitPoint;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getBenefitRecBizId()
/* 114:    */   {
/* 115:170 */     return this.benefitRecBizId;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setBenefitRecBizId(String benefitRecBizId)
/* 119:    */   {
/* 120:173 */     this.benefitRecBizId = benefitRecBizId;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getBenefitRecType()
/* 124:    */   {
/* 125:177 */     return this.benefitRecType;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setBenefitRecType(String benefitRecType)
/* 129:    */   {
/* 130:180 */     this.benefitRecType = benefitRecType;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getBenefitSubtitle()
/* 134:    */   {
/* 135:184 */     return this.benefitSubtitle;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setBenefitSubtitle(String benefitSubtitle)
/* 139:    */   {
/* 140:187 */     this.benefitSubtitle = benefitSubtitle;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getCampId()
/* 144:    */   {
/* 145:191 */     return this.campId;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setCampId(String campId)
/* 149:    */   {
/* 150:194 */     this.campId = campId;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getEligibleGrade()
/* 154:    */   {
/* 155:198 */     return this.eligibleGrade;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setEligibleGrade(String eligibleGrade)
/* 159:    */   {
/* 160:201 */     this.eligibleGrade = eligibleGrade;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getEndTime()
/* 164:    */   {
/* 165:205 */     return this.endTime;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setEndTime(String endTime)
/* 169:    */   {
/* 170:208 */     this.endTime = endTime;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getExchangeRuleIds()
/* 174:    */   {
/* 175:212 */     return this.exchangeRuleIds;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setExchangeRuleIds(String exchangeRuleIds)
/* 179:    */   {
/* 180:215 */     this.exchangeRuleIds = exchangeRuleIds;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public String getGradeDiscount()
/* 184:    */   {
/* 185:219 */     return this.gradeDiscount;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void setGradeDiscount(String gradeDiscount)
/* 189:    */   {
/* 190:222 */     this.gradeDiscount = gradeDiscount;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public String getStartTime()
/* 194:    */   {
/* 195:226 */     return this.startTime;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public void setStartTime(String startTime)
/* 199:    */   {
/* 200:229 */     this.startTime = startTime;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayUserBenefitEditModel
 * JD-Core Version:    0.7.0.1
 */