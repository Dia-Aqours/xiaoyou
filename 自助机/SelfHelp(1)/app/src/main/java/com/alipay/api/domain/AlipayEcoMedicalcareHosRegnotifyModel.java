/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayEcoMedicalcareHosRegnotifyModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3442222533274551933L;
/*  11:    */   @ApiField("biz_type")
/*  12:    */   private String bizType;
/*  13:    */   @ApiField("cancel_desc")
/*  14:    */   private String cancelDesc;
/*  15:    */   @ApiField("cancel_reason")
/*  16:    */   private String cancelReason;
/*  17:    */   @ApiField("dept_info")
/*  18:    */   private MedicalHospitalDeptInfo deptInfo;
/*  19:    */   @ApiField("doctor_info")
/*  20:    */   private MedicalHospitalDoctorInfo doctorInfo;
/*  21:    */   @ApiField("extend_params")
/*  22:    */   private String extendParams;
/*  23:    */   @ApiField("hos_info")
/*  24:    */   private MedicalHospitalInfo hosInfo;
/*  25:    */   @ApiField("line_no")
/*  26:    */   private Long lineNo;
/*  27:    */   @ApiField("notify_time")
/*  28:    */   private Date notifyTime;
/*  29:    */   @ApiField("operate")
/*  30:    */   private String operate;
/*  31:    */   @ApiField("order_link")
/*  32:    */   private String orderLink;
/*  33:    */   @ApiField("patient_card_no")
/*  34:    */   private String patientCardNo;
/*  35:    */   @ApiField("patient_card_type")
/*  36:    */   private String patientCardType;
/*  37:    */   @ApiField("patient_name")
/*  38:    */   private String patientName;
/*  39:    */   @ApiField("reg_link")
/*  40:    */   private String regLink;
/*  41:    */   @ApiField("third_no")
/*  42:    */   private String thirdNo;
/*  43:    */   @ApiField("treat_date")
/*  44:    */   private Date treatDate;
/*  45:    */   @ApiField("treat_date_ext")
/*  46:    */   private String treatDateExt;
/*  47:    */   @ApiField("user_id")
/*  48:    */   private String userId;
/*  49:    */   
/*  50:    */   public String getBizType()
/*  51:    */   {
/*  52:178 */     return this.bizType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setBizType(String bizType)
/*  56:    */   {
/*  57:181 */     this.bizType = bizType;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getCancelDesc()
/*  61:    */   {
/*  62:185 */     return this.cancelDesc;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setCancelDesc(String cancelDesc)
/*  66:    */   {
/*  67:188 */     this.cancelDesc = cancelDesc;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getCancelReason()
/*  71:    */   {
/*  72:192 */     return this.cancelReason;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setCancelReason(String cancelReason)
/*  76:    */   {
/*  77:195 */     this.cancelReason = cancelReason;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public MedicalHospitalDeptInfo getDeptInfo()
/*  81:    */   {
/*  82:199 */     return this.deptInfo;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setDeptInfo(MedicalHospitalDeptInfo deptInfo)
/*  86:    */   {
/*  87:202 */     this.deptInfo = deptInfo;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public MedicalHospitalDoctorInfo getDoctorInfo()
/*  91:    */   {
/*  92:206 */     return this.doctorInfo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setDoctorInfo(MedicalHospitalDoctorInfo doctorInfo)
/*  96:    */   {
/*  97:209 */     this.doctorInfo = doctorInfo;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getExtendParams()
/* 101:    */   {
/* 102:213 */     return this.extendParams;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setExtendParams(String extendParams)
/* 106:    */   {
/* 107:216 */     this.extendParams = extendParams;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public MedicalHospitalInfo getHosInfo()
/* 111:    */   {
/* 112:220 */     return this.hosInfo;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setHosInfo(MedicalHospitalInfo hosInfo)
/* 116:    */   {
/* 117:223 */     this.hosInfo = hosInfo;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public Long getLineNo()
/* 121:    */   {
/* 122:227 */     return this.lineNo;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setLineNo(Long lineNo)
/* 126:    */   {
/* 127:230 */     this.lineNo = lineNo;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public Date getNotifyTime()
/* 131:    */   {
/* 132:234 */     return this.notifyTime;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setNotifyTime(Date notifyTime)
/* 136:    */   {
/* 137:237 */     this.notifyTime = notifyTime;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getOperate()
/* 141:    */   {
/* 142:241 */     return this.operate;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setOperate(String operate)
/* 146:    */   {
/* 147:244 */     this.operate = operate;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getOrderLink()
/* 151:    */   {
/* 152:248 */     return this.orderLink;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setOrderLink(String orderLink)
/* 156:    */   {
/* 157:251 */     this.orderLink = orderLink;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getPatientCardNo()
/* 161:    */   {
/* 162:255 */     return this.patientCardNo;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setPatientCardNo(String patientCardNo)
/* 166:    */   {
/* 167:258 */     this.patientCardNo = patientCardNo;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getPatientCardType()
/* 171:    */   {
/* 172:262 */     return this.patientCardType;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setPatientCardType(String patientCardType)
/* 176:    */   {
/* 177:265 */     this.patientCardType = patientCardType;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public String getPatientName()
/* 181:    */   {
/* 182:269 */     return this.patientName;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setPatientName(String patientName)
/* 186:    */   {
/* 187:272 */     this.patientName = patientName;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public String getRegLink()
/* 191:    */   {
/* 192:276 */     return this.regLink;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setRegLink(String regLink)
/* 196:    */   {
/* 197:279 */     this.regLink = regLink;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getThirdNo()
/* 201:    */   {
/* 202:283 */     return this.thirdNo;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setThirdNo(String thirdNo)
/* 206:    */   {
/* 207:286 */     this.thirdNo = thirdNo;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public Date getTreatDate()
/* 211:    */   {
/* 212:290 */     return this.treatDate;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setTreatDate(Date treatDate)
/* 216:    */   {
/* 217:293 */     this.treatDate = treatDate;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getTreatDateExt()
/* 221:    */   {
/* 222:297 */     return this.treatDateExt;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setTreatDateExt(String treatDateExt)
/* 226:    */   {
/* 227:300 */     this.treatDateExt = treatDateExt;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String getUserId()
/* 231:    */   {
/* 232:304 */     return this.userId;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setUserId(String userId)
/* 236:    */   {
/* 237:307 */     this.userId = userId;
/* 238:    */   }
/* 239:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMedicalcareHosRegnotifyModel
 * JD-Core Version:    0.7.0.1
 */