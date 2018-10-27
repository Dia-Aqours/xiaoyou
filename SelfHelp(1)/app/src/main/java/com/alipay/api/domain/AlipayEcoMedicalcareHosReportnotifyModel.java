/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayEcoMedicalcareHosReportnotifyModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 8646784337216448776L;
/*  13:    */   @ApiField("dept_info")
/*  14:    */   private MedicalHospitalDeptInfo deptInfo;
/*  15:    */   @ApiField("doctor_info")
/*  16:    */   private MedicalHospitalDoctorInfo doctorInfo;
/*  17:    */   @ApiField("extend_params")
/*  18:    */   private String extendParams;
/*  19:    */   @ApiField("hos_info")
/*  20:    */   private MedicalHospitalInfo hosInfo;
/*  21:    */   @ApiField("notify_time")
/*  22:    */   private Date notifyTime;
/*  23:    */   @ApiField("operate")
/*  24:    */   private String operate;
/*  25:    */   @ApiField("patient_card_no")
/*  26:    */   private String patientCardNo;
/*  27:    */   @ApiField("patient_card_type")
/*  28:    */   private String patientCardType;
/*  29:    */   @ApiField("patient_name")
/*  30:    */   private String patientName;
/*  31:    */   @ApiField("reg_out_trade_no")
/*  32:    */   private String regOutTradeNo;
/*  33:    */   @ApiListField("report_list")
/*  34:    */   @ApiField("medical_hospital_report_list")
/*  35:    */   private List<MedicalHospitalReportList> reportList;
/*  36:    */   @ApiField("third_no")
/*  37:    */   private String thirdNo;
/*  38:    */   @ApiField("treat_out_trade_no")
/*  39:    */   private String treatOutTradeNo;
/*  40:    */   @ApiField("user_id")
/*  41:    */   private String userId;
/*  42:    */   
/*  43:    */   public MedicalHospitalDeptInfo getDeptInfo()
/*  44:    */   {
/*  45:132 */     return this.deptInfo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setDeptInfo(MedicalHospitalDeptInfo deptInfo)
/*  49:    */   {
/*  50:135 */     this.deptInfo = deptInfo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public MedicalHospitalDoctorInfo getDoctorInfo()
/*  54:    */   {
/*  55:139 */     return this.doctorInfo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setDoctorInfo(MedicalHospitalDoctorInfo doctorInfo)
/*  59:    */   {
/*  60:142 */     this.doctorInfo = doctorInfo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getExtendParams()
/*  64:    */   {
/*  65:146 */     return this.extendParams;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setExtendParams(String extendParams)
/*  69:    */   {
/*  70:149 */     this.extendParams = extendParams;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public MedicalHospitalInfo getHosInfo()
/*  74:    */   {
/*  75:153 */     return this.hosInfo;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setHosInfo(MedicalHospitalInfo hosInfo)
/*  79:    */   {
/*  80:156 */     this.hosInfo = hosInfo;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public Date getNotifyTime()
/*  84:    */   {
/*  85:160 */     return this.notifyTime;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setNotifyTime(Date notifyTime)
/*  89:    */   {
/*  90:163 */     this.notifyTime = notifyTime;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public String getOperate()
/*  94:    */   {
/*  95:167 */     return this.operate;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setOperate(String operate)
/*  99:    */   {
/* 100:170 */     this.operate = operate;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getPatientCardNo()
/* 104:    */   {
/* 105:174 */     return this.patientCardNo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void setPatientCardNo(String patientCardNo)
/* 109:    */   {
/* 110:177 */     this.patientCardNo = patientCardNo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getPatientCardType()
/* 114:    */   {
/* 115:181 */     return this.patientCardType;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void setPatientCardType(String patientCardType)
/* 119:    */   {
/* 120:184 */     this.patientCardType = patientCardType;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getPatientName()
/* 124:    */   {
/* 125:188 */     return this.patientName;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setPatientName(String patientName)
/* 129:    */   {
/* 130:191 */     this.patientName = patientName;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getRegOutTradeNo()
/* 134:    */   {
/* 135:195 */     return this.regOutTradeNo;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setRegOutTradeNo(String regOutTradeNo)
/* 139:    */   {
/* 140:198 */     this.regOutTradeNo = regOutTradeNo;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public List<MedicalHospitalReportList> getReportList()
/* 144:    */   {
/* 145:202 */     return this.reportList;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void setReportList(List<MedicalHospitalReportList> reportList)
/* 149:    */   {
/* 150:205 */     this.reportList = reportList;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public String getThirdNo()
/* 154:    */   {
/* 155:209 */     return this.thirdNo;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void setThirdNo(String thirdNo)
/* 159:    */   {
/* 160:212 */     this.thirdNo = thirdNo;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String getTreatOutTradeNo()
/* 164:    */   {
/* 165:216 */     return this.treatOutTradeNo;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void setTreatOutTradeNo(String treatOutTradeNo)
/* 169:    */   {
/* 170:219 */     this.treatOutTradeNo = treatOutTradeNo;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public String getUserId()
/* 174:    */   {
/* 175:223 */     return this.userId;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void setUserId(String userId)
/* 179:    */   {
/* 180:226 */     this.userId = userId;
/* 181:    */   }
/* 182:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayEcoMedicalcareHosReportnotifyModel
 * JD-Core Version:    0.7.0.1
 */