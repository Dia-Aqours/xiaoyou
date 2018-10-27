/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayCommerceMedicalInstcardCreateandpayModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6748338977314757972L;
/*  11:    */   @ApiField("bill_no")
/*  12:    */   private String billNo;
/*  13:    */   @ApiField("body")
/*  14:    */   private String body;
/*  15:    */   @ApiField("buyer_id")
/*  16:    */   private String buyerId;
/*  17:    */   @ApiField("extend_params")
/*  18:    */   private String extendParams;
/*  19:    */   @ApiField("gmt_out_create")
/*  20:    */   private Date gmtOutCreate;
/*  21:    */   @ApiField("industry")
/*  22:    */   private String industry;
/*  23:    */   @ApiField("is_insurance")
/*  24:    */   private String isInsurance;
/*  25:    */   @ApiField("org_name")
/*  26:    */   private String orgName;
/*  27:    */   @ApiField("org_no")
/*  28:    */   private String orgNo;
/*  29:    */   @ApiField("out_trade_no")
/*  30:    */   private String outTradeNo;
/*  31:    */   @ApiField("patient_card_no")
/*  32:    */   private String patientCardNo;
/*  33:    */   @ApiField("patient_card_type")
/*  34:    */   private String patientCardType;
/*  35:    */   @ApiField("patient_mobile")
/*  36:    */   private String patientMobile;
/*  37:    */   @ApiField("patient_name")
/*  38:    */   private String patientName;
/*  39:    */   @ApiField("request_content")
/*  40:    */   private String requestContent;
/*  41:    */   @ApiField("scene")
/*  42:    */   private String scene;
/*  43:    */   @ApiField("seller_id")
/*  44:    */   private String sellerId;
/*  45:    */   @ApiField("serial_no")
/*  46:    */   private String serialNo;
/*  47:    */   @ApiField("subject")
/*  48:    */   private String subject;
/*  49:    */   @ApiField("timeout_express")
/*  50:    */   private String timeoutExpress;
/*  51:    */   @ApiField("total_amount")
/*  52:    */   private String totalAmount;
/*  53:    */   
/*  54:    */   public String getBillNo()
/*  55:    */   {
/*  56:153 */     return this.billNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setBillNo(String billNo)
/*  60:    */   {
/*  61:156 */     this.billNo = billNo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getBody()
/*  65:    */   {
/*  66:160 */     return this.body;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setBody(String body)
/*  70:    */   {
/*  71:163 */     this.body = body;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getBuyerId()
/*  75:    */   {
/*  76:167 */     return this.buyerId;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setBuyerId(String buyerId)
/*  80:    */   {
/*  81:170 */     this.buyerId = buyerId;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getExtendParams()
/*  85:    */   {
/*  86:174 */     return this.extendParams;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setExtendParams(String extendParams)
/*  90:    */   {
/*  91:177 */     this.extendParams = extendParams;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public Date getGmtOutCreate()
/*  95:    */   {
/*  96:181 */     return this.gmtOutCreate;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setGmtOutCreate(Date gmtOutCreate)
/* 100:    */   {
/* 101:184 */     this.gmtOutCreate = gmtOutCreate;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getIndustry()
/* 105:    */   {
/* 106:188 */     return this.industry;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setIndustry(String industry)
/* 110:    */   {
/* 111:191 */     this.industry = industry;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getIsInsurance()
/* 115:    */   {
/* 116:195 */     return this.isInsurance;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setIsInsurance(String isInsurance)
/* 120:    */   {
/* 121:198 */     this.isInsurance = isInsurance;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getOrgName()
/* 125:    */   {
/* 126:202 */     return this.orgName;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setOrgName(String orgName)
/* 130:    */   {
/* 131:205 */     this.orgName = orgName;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getOrgNo()
/* 135:    */   {
/* 136:209 */     return this.orgNo;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setOrgNo(String orgNo)
/* 140:    */   {
/* 141:212 */     this.orgNo = orgNo;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getOutTradeNo()
/* 145:    */   {
/* 146:216 */     return this.outTradeNo;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setOutTradeNo(String outTradeNo)
/* 150:    */   {
/* 151:219 */     this.outTradeNo = outTradeNo;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getPatientCardNo()
/* 155:    */   {
/* 156:223 */     return this.patientCardNo;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setPatientCardNo(String patientCardNo)
/* 160:    */   {
/* 161:226 */     this.patientCardNo = patientCardNo;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getPatientCardType()
/* 165:    */   {
/* 166:230 */     return this.patientCardType;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setPatientCardType(String patientCardType)
/* 170:    */   {
/* 171:233 */     this.patientCardType = patientCardType;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getPatientMobile()
/* 175:    */   {
/* 176:237 */     return this.patientMobile;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setPatientMobile(String patientMobile)
/* 180:    */   {
/* 181:240 */     this.patientMobile = patientMobile;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getPatientName()
/* 185:    */   {
/* 186:244 */     return this.patientName;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setPatientName(String patientName)
/* 190:    */   {
/* 191:247 */     this.patientName = patientName;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public String getRequestContent()
/* 195:    */   {
/* 196:251 */     return this.requestContent;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setRequestContent(String requestContent)
/* 200:    */   {
/* 201:254 */     this.requestContent = requestContent;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getScene()
/* 205:    */   {
/* 206:258 */     return this.scene;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setScene(String scene)
/* 210:    */   {
/* 211:261 */     this.scene = scene;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getSellerId()
/* 215:    */   {
/* 216:265 */     return this.sellerId;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setSellerId(String sellerId)
/* 220:    */   {
/* 221:268 */     this.sellerId = sellerId;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getSerialNo()
/* 225:    */   {
/* 226:272 */     return this.serialNo;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setSerialNo(String serialNo)
/* 230:    */   {
/* 231:275 */     this.serialNo = serialNo;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getSubject()
/* 235:    */   {
/* 236:279 */     return this.subject;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setSubject(String subject)
/* 240:    */   {
/* 241:282 */     this.subject = subject;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getTimeoutExpress()
/* 245:    */   {
/* 246:286 */     return this.timeoutExpress;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setTimeoutExpress(String timeoutExpress)
/* 250:    */   {
/* 251:289 */     this.timeoutExpress = timeoutExpress;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public String getTotalAmount()
/* 255:    */   {
/* 256:293 */     return this.totalAmount;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setTotalAmount(String totalAmount)
/* 260:    */   {
/* 261:296 */     this.totalAmount = totalAmount;
/* 262:    */   }
/* 263:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayCommerceMedicalInstcardCreateandpayModel
 * JD-Core Version:    0.7.0.1
 */