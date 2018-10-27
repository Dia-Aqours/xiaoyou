/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class AlipayEcoEduJzPostPublishModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1857793734345214961L;
/*  12:    */   @ApiField("age_demand")
/*  13:    */   private EduAgeDemand ageDemand;
/*  14:    */   @ApiField("commission")
/*  15:    */   private String commission;
/*  16:    */   @ApiField("company_contact")
/*  17:    */   private String companyContact;
/*  18:    */   @ApiField("company_logo")
/*  19:    */   private String companyLogo;
/*  20:    */   @ApiField("company_name")
/*  21:    */   private String companyName;
/*  22:    */   @ApiField("contact_phone")
/*  23:    */   private String contactPhone;
/*  24:    */   @ApiField("date_end")
/*  25:    */   private String dateEnd;
/*  26:    */   @ApiField("date_start")
/*  27:    */   private String dateStart;
/*  28:    */   @ApiField("deadline")
/*  29:    */   private String deadline;
/*  30:    */   @ApiField("gender")
/*  31:    */   private String gender;
/*  32:    */   @ApiField("hire_number")
/*  33:    */   private String hireNumber;
/*  34:    */   @ApiField("is_commission")
/*  35:    */   private String isCommission;
/*  36:    */   @ApiField("job_desc")
/*  37:    */   private String jobDesc;
/*  38:    */   @ApiField("job_type")
/*  39:    */   private String jobType;
/*  40:    */   @ApiField("part_time_type")
/*  41:    */   private String partTimeType;
/*  42:    */   @ApiField("payment")
/*  43:    */   private String payment;
/*  44:    */   @ApiField("payment_remark")
/*  45:    */   private String paymentRemark;
/*  46:    */   @ApiField("payment_type")
/*  47:    */   private String paymentType;
/*  48:    */   @ApiField("salary")
/*  49:    */   private String salary;
/*  50:    */   @ApiField("salary_unit")
/*  51:    */   private String salaryUnit;
/*  52:    */   @ApiField("service_post_id")
/*  53:    */   private String servicePostId;
/*  54:    */   @ApiField("source_info")
/*  55:    */   private EduSourceInfo sourceInfo;
/*  56:    */   @ApiListField("special_demand")
/*  57:    */   @ApiField("string")
/*  58:    */   private List<String> specialDemand;
/*  59:    */   @ApiField("title")
/*  60:    */   private String title;
/*  61:    */   @ApiListField("welfare")
/*  62:    */   @ApiField("string")
/*  63:    */   private List<String> welfare;
/*  64:    */   @ApiListField("work_address")
/*  65:    */   @ApiField("edu_work_address")
/*  66:    */   private List<EduWorkAddress> workAddress;
/*  67:    */   @ApiField("work_time_remark")
/*  68:    */   private String workTimeRemark;
/*  69:    */   @ApiField("working_hours")
/*  70:    */   private String workingHours;
/*  71:    */   
/*  72:    */   public EduAgeDemand getAgeDemand()
/*  73:    */   {
/*  74:224 */     return this.ageDemand;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setAgeDemand(EduAgeDemand ageDemand)
/*  78:    */   {
/*  79:227 */     this.ageDemand = ageDemand;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getCommission()
/*  83:    */   {
/*  84:231 */     return this.commission;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setCommission(String commission)
/*  88:    */   {
/*  89:234 */     this.commission = commission;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getCompanyContact()
/*  93:    */   {
/*  94:238 */     return this.companyContact;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setCompanyContact(String companyContact)
/*  98:    */   {
/*  99:241 */     this.companyContact = companyContact;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getCompanyLogo()
/* 103:    */   {
/* 104:245 */     return this.companyLogo;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setCompanyLogo(String companyLogo)
/* 108:    */   {
/* 109:248 */     this.companyLogo = companyLogo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getCompanyName()
/* 113:    */   {
/* 114:252 */     return this.companyName;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setCompanyName(String companyName)
/* 118:    */   {
/* 119:255 */     this.companyName = companyName;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getContactPhone()
/* 123:    */   {
/* 124:259 */     return this.contactPhone;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setContactPhone(String contactPhone)
/* 128:    */   {
/* 129:262 */     this.contactPhone = contactPhone;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getDateEnd()
/* 133:    */   {
/* 134:266 */     return this.dateEnd;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setDateEnd(String dateEnd)
/* 138:    */   {
/* 139:269 */     this.dateEnd = dateEnd;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getDateStart()
/* 143:    */   {
/* 144:273 */     return this.dateStart;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setDateStart(String dateStart)
/* 148:    */   {
/* 149:276 */     this.dateStart = dateStart;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getDeadline()
/* 153:    */   {
/* 154:280 */     return this.deadline;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setDeadline(String deadline)
/* 158:    */   {
/* 159:283 */     this.deadline = deadline;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getGender()
/* 163:    */   {
/* 164:287 */     return this.gender;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void setGender(String gender)
/* 168:    */   {
/* 169:290 */     this.gender = gender;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String getHireNumber()
/* 173:    */   {
/* 174:294 */     return this.hireNumber;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setHireNumber(String hireNumber)
/* 178:    */   {
/* 179:297 */     this.hireNumber = hireNumber;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getIsCommission()
/* 183:    */   {
/* 184:301 */     return this.isCommission;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setIsCommission(String isCommission)
/* 188:    */   {
/* 189:304 */     this.isCommission = isCommission;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public String getJobDesc()
/* 193:    */   {
/* 194:308 */     return this.jobDesc;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void setJobDesc(String jobDesc)
/* 198:    */   {
/* 199:311 */     this.jobDesc = jobDesc;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public String getJobType()
/* 203:    */   {
/* 204:315 */     return this.jobType;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void setJobType(String jobType)
/* 208:    */   {
/* 209:318 */     this.jobType = jobType;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public String getPartTimeType()
/* 213:    */   {
/* 214:322 */     return this.partTimeType;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public void setPartTimeType(String partTimeType)
/* 218:    */   {
/* 219:325 */     this.partTimeType = partTimeType;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String getPayment()
/* 223:    */   {
/* 224:329 */     return this.payment;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public void setPayment(String payment)
/* 228:    */   {
/* 229:332 */     this.payment = payment;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public String getPaymentRemark()
/* 233:    */   {
/* 234:336 */     return this.paymentRemark;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public void setPaymentRemark(String paymentRemark)
/* 238:    */   {
/* 239:339 */     this.paymentRemark = paymentRemark;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public String getPaymentType()
/* 243:    */   {
/* 244:343 */     return this.paymentType;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public void setPaymentType(String paymentType)
/* 248:    */   {
/* 249:346 */     this.paymentType = paymentType;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public String getSalary()
/* 253:    */   {
/* 254:350 */     return this.salary;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public void setSalary(String salary)
/* 258:    */   {
/* 259:353 */     this.salary = salary;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public String getSalaryUnit()
/* 263:    */   {
/* 264:357 */     return this.salaryUnit;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public void setSalaryUnit(String salaryUnit)
/* 268:    */   {
/* 269:360 */     this.salaryUnit = salaryUnit;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public String getServicePostId()
/* 273:    */   {
/* 274:364 */     return this.servicePostId;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public void setServicePostId(String servicePostId)
/* 278:    */   {
/* 279:367 */     this.servicePostId = servicePostId;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public EduSourceInfo getSourceInfo()
/* 283:    */   {
/* 284:371 */     return this.sourceInfo;
/* 285:    */   }
/* 286:    */   
/* 287:    */   public void setSourceInfo(EduSourceInfo sourceInfo)
/* 288:    */   {
/* 289:374 */     this.sourceInfo = sourceInfo;
/* 290:    */   }
/* 291:    */   
/* 292:    */   public List<String> getSpecialDemand()
/* 293:    */   {
/* 294:378 */     return this.specialDemand;
/* 295:    */   }
/* 296:    */   
/* 297:    */   public void setSpecialDemand(List<String> specialDemand)
/* 298:    */   {
/* 299:381 */     this.specialDemand = specialDemand;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public String getTitle()
/* 303:    */   {
/* 304:385 */     return this.title;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public void setTitle(String title)
/* 308:    */   {
/* 309:388 */     this.title = title;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public List<String> getWelfare()
/* 313:    */   {
/* 314:392 */     return this.welfare;
/* 315:    */   }
/* 316:    */   
/* 317:    */   public void setWelfare(List<String> welfare)
/* 318:    */   {
/* 319:395 */     this.welfare = welfare;
/* 320:    */   }
/* 321:    */   
/* 322:    */   public List<EduWorkAddress> getWorkAddress()
/* 323:    */   {
/* 324:399 */     return this.workAddress;
/* 325:    */   }
/* 326:    */   
/* 327:    */   public void setWorkAddress(List<EduWorkAddress> workAddress)
/* 328:    */   {
/* 329:402 */     this.workAddress = workAddress;
/* 330:    */   }
/* 331:    */   
/* 332:    */   public String getWorkTimeRemark()
/* 333:    */   {
/* 334:406 */     return this.workTimeRemark;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public void setWorkTimeRemark(String workTimeRemark)
/* 338:    */   {
/* 339:409 */     this.workTimeRemark = workTimeRemark;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public String getWorkingHours()
/* 343:    */   {
/* 344:413 */     return this.workingHours;
/* 345:    */   }
/* 346:    */   
/* 347:    */   public void setWorkingHours(String workingHours)
/* 348:    */   {
/* 349:416 */     this.workingHours = workingHours;
/* 350:    */   }
/* 351:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoEduJzPostPublishModel
 * JD-Core Version:    0.7.0.1
 */