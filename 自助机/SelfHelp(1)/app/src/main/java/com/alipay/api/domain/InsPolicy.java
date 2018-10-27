/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class InsPolicy
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 1738428337982921575L;
/*  13:    */   @ApiField("addressee")
/*  14:    */   private InsAddressee addressee;
/*  15:    */   @ApiField("applicant")
/*  16:    */   private InsPerson applicant;
/*  17:    */   @ApiField("biz_data")
/*  18:    */   private String bizData;
/*  19:    */   @ApiListField("claims")
/*  20:    */   @ApiField("ins_claim")
/*  21:    */   private List<InsClaim> claims;
/*  22:    */   @ApiListField("coverages")
/*  23:    */   @ApiField("ins_coverage")
/*  24:    */   private List<InsCoverage> coverages;
/*  25:    */   @ApiField("effect_end_time")
/*  26:    */   private String effectEndTime;
/*  27:    */   @ApiField("effect_start_time")
/*  28:    */   private String effectStartTime;
/*  29:    */   @ApiListField("ins_objects")
/*  30:    */   @ApiField("ins_object")
/*  31:    */   private List<InsObject> insObjects;
/*  32:    */   @ApiListField("insureds")
/*  33:    */   @ApiField("ins_person")
/*  34:    */   private List<InsPerson> insureds;
/*  35:    */   @ApiField("merchant_name")
/*  36:    */   private String merchantName;
/*  37:    */   @ApiField("policy_no")
/*  38:    */   private String policyNo;
/*  39:    */   @ApiField("policy_status")
/*  40:    */   private String policyStatus;
/*  41:    */   @ApiField("premium")
/*  42:    */   private Long premium;
/*  43:    */   @ApiField("prod_name")
/*  44:    */   private String prodName;
/*  45:    */   @ApiField("sum_insured")
/*  46:    */   private Long sumInsured;
/*  47:    */   @ApiField("surrender_fee")
/*  48:    */   private Long surrenderFee;
/*  49:    */   @ApiField("surrender_time")
/*  50:    */   private Date surrenderTime;
/*  51:    */   
/*  52:    */   public InsAddressee getAddressee()
/*  53:    */   {
/*  54:127 */     return this.addressee;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setAddressee(InsAddressee addressee)
/*  58:    */   {
/*  59:130 */     this.addressee = addressee;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public InsPerson getApplicant()
/*  63:    */   {
/*  64:134 */     return this.applicant;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setApplicant(InsPerson applicant)
/*  68:    */   {
/*  69:137 */     this.applicant = applicant;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getBizData()
/*  73:    */   {
/*  74:141 */     return this.bizData;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setBizData(String bizData)
/*  78:    */   {
/*  79:144 */     this.bizData = bizData;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public List<InsClaim> getClaims()
/*  83:    */   {
/*  84:148 */     return this.claims;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setClaims(List<InsClaim> claims)
/*  88:    */   {
/*  89:151 */     this.claims = claims;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public List<InsCoverage> getCoverages()
/*  93:    */   {
/*  94:155 */     return this.coverages;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setCoverages(List<InsCoverage> coverages)
/*  98:    */   {
/*  99:158 */     this.coverages = coverages;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getEffectEndTime()
/* 103:    */   {
/* 104:162 */     return this.effectEndTime;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setEffectEndTime(String effectEndTime)
/* 108:    */   {
/* 109:165 */     this.effectEndTime = effectEndTime;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getEffectStartTime()
/* 113:    */   {
/* 114:169 */     return this.effectStartTime;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setEffectStartTime(String effectStartTime)
/* 118:    */   {
/* 119:172 */     this.effectStartTime = effectStartTime;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public List<InsObject> getInsObjects()
/* 123:    */   {
/* 124:176 */     return this.insObjects;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setInsObjects(List<InsObject> insObjects)
/* 128:    */   {
/* 129:179 */     this.insObjects = insObjects;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public List<InsPerson> getInsureds()
/* 133:    */   {
/* 134:183 */     return this.insureds;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setInsureds(List<InsPerson> insureds)
/* 138:    */   {
/* 139:186 */     this.insureds = insureds;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getMerchantName()
/* 143:    */   {
/* 144:190 */     return this.merchantName;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setMerchantName(String merchantName)
/* 148:    */   {
/* 149:193 */     this.merchantName = merchantName;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getPolicyNo()
/* 153:    */   {
/* 154:197 */     return this.policyNo;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setPolicyNo(String policyNo)
/* 158:    */   {
/* 159:200 */     this.policyNo = policyNo;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getPolicyStatus()
/* 163:    */   {
/* 164:204 */     return this.policyStatus;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void setPolicyStatus(String policyStatus)
/* 168:    */   {
/* 169:207 */     this.policyStatus = policyStatus;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public Long getPremium()
/* 173:    */   {
/* 174:211 */     return this.premium;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setPremium(Long premium)
/* 178:    */   {
/* 179:214 */     this.premium = premium;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getProdName()
/* 183:    */   {
/* 184:218 */     return this.prodName;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setProdName(String prodName)
/* 188:    */   {
/* 189:221 */     this.prodName = prodName;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public Long getSumInsured()
/* 193:    */   {
/* 194:225 */     return this.sumInsured;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setSumInsured(Long sumInsured)
/* 198:    */   {
/* 199:228 */     this.sumInsured = sumInsured;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public Long getSurrenderFee()
/* 203:    */   {
/* 204:232 */     return this.surrenderFee;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void setSurrenderFee(Long surrenderFee)
/* 208:    */   {
/* 209:235 */     this.surrenderFee = surrenderFee;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public Date getSurrenderTime()
/* 213:    */   {
/* 214:239 */     return this.surrenderTime;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void setSurrenderTime(Date surrenderTime)
/* 218:    */   {
/* 219:242 */     this.surrenderTime = surrenderTime;
/* 220:    */   }
/* 221:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InsPolicy
 * JD-Core Version:    0.7.0.1
 */