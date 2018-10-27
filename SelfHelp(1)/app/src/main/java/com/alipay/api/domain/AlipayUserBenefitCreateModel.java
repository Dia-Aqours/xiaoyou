/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;

/*   5:    */
/*   6:    */ public class AlipayUserBenefitCreateModel
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1451429295315323686L;
/*  10:    */   @ApiField("benefit_area_code")
/*  11:    */   private String benefitAreaCode;
/*  12:    */   @ApiField("benefit_icon_url")
/*  13:    */   private String benefitIconUrl;
/*  14:    */   @ApiField("benefit_name")
/*  15:    */   private String benefitName;
/*  16:    */   @ApiField("benefit_name_as_area_subtitle")
/*  17:    */   private Boolean benefitNameAsAreaSubtitle;
/*  18:    */   @ApiField("benefit_page_url")
/*  19:    */   private String benefitPageUrl;
/*  20:    */   @ApiField("benefit_point")
/*  21:    */   private Long benefitPoint;
/*  22:    */   @ApiField("benefit_rec_biz_id")
/*  23:    */   private String benefitRecBizId;
/*  24:    */   @ApiField("benefit_rec_type")
/*  25:    */   private String benefitRecType;
/*  26:    */   @ApiField("benefit_subtitle")
/*  27:    */   private String benefitSubtitle;
/*  28:    */   @ApiField("camp_id")
/*  29:    */   private String campId;
/*  30:    */   @ApiField("eligible_grade")
/*  31:    */   private String eligibleGrade;
/*  32:    */   @ApiField("end_time")
/*  33:    */   private Long endTime;
/*  34:    */   @ApiField("exchange_rule_ids")
/*  35:    */   private String exchangeRuleIds;
/*  36:    */   @ApiField("grade_discount")
/*  37:    */   private String gradeDiscount;
/*  38:    */   @ApiField("start_time")
/*  39:    */   private Long startTime;
/*  40:    */   
/*  41:    */   public String getBenefitAreaCode()
/*  42:    */   {
/*  43:115 */     return this.benefitAreaCode;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setBenefitAreaCode(String benefitAreaCode)
/*  47:    */   {
/*  48:118 */     this.benefitAreaCode = benefitAreaCode;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getBenefitIconUrl()
/*  52:    */   {
/*  53:122 */     return this.benefitIconUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBenefitIconUrl(String benefitIconUrl)
/*  57:    */   {
/*  58:125 */     this.benefitIconUrl = benefitIconUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBenefitName()
/*  62:    */   {
/*  63:129 */     return this.benefitName;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBenefitName(String benefitName)
/*  67:    */   {
/*  68:132 */     this.benefitName = benefitName;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public Boolean getBenefitNameAsAreaSubtitle()
/*  72:    */   {
/*  73:136 */     return this.benefitNameAsAreaSubtitle;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setBenefitNameAsAreaSubtitle(Boolean benefitNameAsAreaSubtitle)
/*  77:    */   {
/*  78:139 */     this.benefitNameAsAreaSubtitle = benefitNameAsAreaSubtitle;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getBenefitPageUrl()
/*  82:    */   {
/*  83:143 */     return this.benefitPageUrl;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setBenefitPageUrl(String benefitPageUrl)
/*  87:    */   {
/*  88:146 */     this.benefitPageUrl = benefitPageUrl;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public Long getBenefitPoint()
/*  92:    */   {
/*  93:150 */     return this.benefitPoint;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setBenefitPoint(Long benefitPoint)
/*  97:    */   {
/*  98:153 */     this.benefitPoint = benefitPoint;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getBenefitRecBizId()
/* 102:    */   {
/* 103:157 */     return this.benefitRecBizId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setBenefitRecBizId(String benefitRecBizId)
/* 107:    */   {
/* 108:160 */     this.benefitRecBizId = benefitRecBizId;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getBenefitRecType()
/* 112:    */   {
/* 113:164 */     return this.benefitRecType;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setBenefitRecType(String benefitRecType)
/* 117:    */   {
/* 118:167 */     this.benefitRecType = benefitRecType;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getBenefitSubtitle()
/* 122:    */   {
/* 123:171 */     return this.benefitSubtitle;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setBenefitSubtitle(String benefitSubtitle)
/* 127:    */   {
/* 128:174 */     this.benefitSubtitle = benefitSubtitle;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getCampId()
/* 132:    */   {
/* 133:178 */     return this.campId;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setCampId(String campId)
/* 137:    */   {
/* 138:181 */     this.campId = campId;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getEligibleGrade()
/* 142:    */   {
/* 143:185 */     return this.eligibleGrade;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setEligibleGrade(String eligibleGrade)
/* 147:    */   {
/* 148:188 */     this.eligibleGrade = eligibleGrade;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public Long getEndTime()
/* 152:    */   {
/* 153:192 */     return this.endTime;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setEndTime(Long endTime)
/* 157:    */   {
/* 158:195 */     this.endTime = endTime;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getExchangeRuleIds()
/* 162:    */   {
/* 163:199 */     return this.exchangeRuleIds;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setExchangeRuleIds(String exchangeRuleIds)
/* 167:    */   {
/* 168:202 */     this.exchangeRuleIds = exchangeRuleIds;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getGradeDiscount()
/* 172:    */   {
/* 173:206 */     return this.gradeDiscount;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setGradeDiscount(String gradeDiscount)
/* 177:    */   {
/* 178:209 */     this.gradeDiscount = gradeDiscount;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public Long getStartTime()
/* 182:    */   {
/* 183:213 */     return this.startTime;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setStartTime(Long startTime)
/* 187:    */   {
/* 188:216 */     this.startTime = startTime;
/* 189:    */   }
/* 190:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayUserBenefitCreateModel

 * JD-Core Version:    0.7.0.1

 */