/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class InvoiceModelContent
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 1667817354191396271L;
/*  12:    */   @ApiField("extend_fields")
/*  13:    */   private String extendFields;
/*  14:    */   @ApiField("file_download_type")
/*  15:    */   private String fileDownloadType;
/*  16:    */   @ApiField("file_download_url")
/*  17:    */   private String fileDownloadUrl;
/*  18:    */   @ApiField("invoice_amount")
/*  19:    */   private String invoiceAmount;
/*  20:    */   @ApiField("invoice_code")
/*  21:    */   private String invoiceCode;
/*  22:    */   @ApiListField("invoice_content")
/*  23:    */   @ApiField("invoice_item_content")
/*  24:    */   private List<InvoiceItemContent> invoiceContent;
/*  25:    */   @ApiField("invoice_date")
/*  26:    */   private String invoiceDate;
/*  27:    */   @ApiField("invoice_fake_code")
/*  28:    */   private String invoiceFakeCode;
/*  29:    */   @ApiField("invoice_file_data")
/*  30:    */   private String invoiceFileData;
/*  31:    */   @ApiField("invoice_img_url")
/*  32:    */   private String invoiceImgUrl;
/*  33:    */   @ApiField("invoice_no")
/*  34:    */   private String invoiceNo;
/*  35:    */   @ApiField("invoice_operator")
/*  36:    */   private String invoiceOperator;
/*  37:    */   @ApiField("invoice_title")
/*  38:    */   private InvoiceTitleModel invoiceTitle;
/*  39:    */   @ApiField("invoice_type")
/*  40:    */   private String invoiceType;
/*  41:    */   @ApiField("original_blue_invoice_code")
/*  42:    */   private String originalBlueInvoiceCode;
/*  43:    */   @ApiField("original_blue_invoice_no")
/*  44:    */   private String originalBlueInvoiceNo;
/*  45:    */   @ApiField("out_biz_no")
/*  46:    */   private String outBizNo;
/*  47:    */   @ApiField("out_invoice_id")
/*  48:    */   private String outInvoiceId;
/*  49:    */   @ApiField("register_address")
/*  50:    */   private String registerAddress;
/*  51:    */   @ApiField("register_bank_account")
/*  52:    */   private String registerBankAccount;
/*  53:    */   @ApiField("register_bank_name")
/*  54:    */   private String registerBankName;
/*  55:    */   @ApiField("register_name")
/*  56:    */   private String registerName;
/*  57:    */   @ApiField("register_no")
/*  58:    */   private String registerNo;
/*  59:    */   @ApiField("register_phone_no")
/*  60:    */   private String registerPhoneNo;
/*  61:    */   @ApiField("sum_amount")
/*  62:    */   private String sumAmount;
/*  63:    */   @ApiField("tax_amount")
/*  64:    */   private String taxAmount;
/*  65:    */   @ApiField("tax_type")
/*  66:    */   private String taxType;
/*  67:    */   @ApiField("user_id")
/*  68:    */   private String userId;
/*  69:    */   
/*  70:    */   public String getExtendFields()
/*  71:    */   {
/*  72:202 */     return this.extendFields;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setExtendFields(String extendFields)
/*  76:    */   {
/*  77:205 */     this.extendFields = extendFields;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getFileDownloadType()
/*  81:    */   {
/*  82:209 */     return this.fileDownloadType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setFileDownloadType(String fileDownloadType)
/*  86:    */   {
/*  87:212 */     this.fileDownloadType = fileDownloadType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getFileDownloadUrl()
/*  91:    */   {
/*  92:216 */     return this.fileDownloadUrl;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setFileDownloadUrl(String fileDownloadUrl)
/*  96:    */   {
/*  97:219 */     this.fileDownloadUrl = fileDownloadUrl;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getInvoiceAmount()
/* 101:    */   {
/* 102:223 */     return this.invoiceAmount;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setInvoiceAmount(String invoiceAmount)
/* 106:    */   {
/* 107:226 */     this.invoiceAmount = invoiceAmount;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getInvoiceCode()
/* 111:    */   {
/* 112:230 */     return this.invoiceCode;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setInvoiceCode(String invoiceCode)
/* 116:    */   {
/* 117:233 */     this.invoiceCode = invoiceCode;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public List<InvoiceItemContent> getInvoiceContent()
/* 121:    */   {
/* 122:237 */     return this.invoiceContent;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setInvoiceContent(List<InvoiceItemContent> invoiceContent)
/* 126:    */   {
/* 127:240 */     this.invoiceContent = invoiceContent;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getInvoiceDate()
/* 131:    */   {
/* 132:244 */     return this.invoiceDate;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setInvoiceDate(String invoiceDate)
/* 136:    */   {
/* 137:247 */     this.invoiceDate = invoiceDate;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getInvoiceFakeCode()
/* 141:    */   {
/* 142:251 */     return this.invoiceFakeCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setInvoiceFakeCode(String invoiceFakeCode)
/* 146:    */   {
/* 147:254 */     this.invoiceFakeCode = invoiceFakeCode;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getInvoiceFileData()
/* 151:    */   {
/* 152:258 */     return this.invoiceFileData;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setInvoiceFileData(String invoiceFileData)
/* 156:    */   {
/* 157:261 */     this.invoiceFileData = invoiceFileData;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getInvoiceImgUrl()
/* 161:    */   {
/* 162:265 */     return this.invoiceImgUrl;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setInvoiceImgUrl(String invoiceImgUrl)
/* 166:    */   {
/* 167:268 */     this.invoiceImgUrl = invoiceImgUrl;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public String getInvoiceNo()
/* 171:    */   {
/* 172:272 */     return this.invoiceNo;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setInvoiceNo(String invoiceNo)
/* 176:    */   {
/* 177:275 */     this.invoiceNo = invoiceNo;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public String getInvoiceOperator()
/* 181:    */   {
/* 182:279 */     return this.invoiceOperator;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setInvoiceOperator(String invoiceOperator)
/* 186:    */   {
/* 187:282 */     this.invoiceOperator = invoiceOperator;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public InvoiceTitleModel getInvoiceTitle()
/* 191:    */   {
/* 192:286 */     return this.invoiceTitle;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setInvoiceTitle(InvoiceTitleModel invoiceTitle)
/* 196:    */   {
/* 197:289 */     this.invoiceTitle = invoiceTitle;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getInvoiceType()
/* 201:    */   {
/* 202:293 */     return this.invoiceType;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setInvoiceType(String invoiceType)
/* 206:    */   {
/* 207:296 */     this.invoiceType = invoiceType;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getOriginalBlueInvoiceCode()
/* 211:    */   {
/* 212:300 */     return this.originalBlueInvoiceCode;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setOriginalBlueInvoiceCode(String originalBlueInvoiceCode)
/* 216:    */   {
/* 217:303 */     this.originalBlueInvoiceCode = originalBlueInvoiceCode;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getOriginalBlueInvoiceNo()
/* 221:    */   {
/* 222:307 */     return this.originalBlueInvoiceNo;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setOriginalBlueInvoiceNo(String originalBlueInvoiceNo)
/* 226:    */   {
/* 227:310 */     this.originalBlueInvoiceNo = originalBlueInvoiceNo;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String getOutBizNo()
/* 231:    */   {
/* 232:314 */     return this.outBizNo;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setOutBizNo(String outBizNo)
/* 236:    */   {
/* 237:317 */     this.outBizNo = outBizNo;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public String getOutInvoiceId()
/* 241:    */   {
/* 242:321 */     return this.outInvoiceId;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void setOutInvoiceId(String outInvoiceId)
/* 246:    */   {
/* 247:324 */     this.outInvoiceId = outInvoiceId;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public String getRegisterAddress()
/* 251:    */   {
/* 252:328 */     return this.registerAddress;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void setRegisterAddress(String registerAddress)
/* 256:    */   {
/* 257:331 */     this.registerAddress = registerAddress;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public String getRegisterBankAccount()
/* 261:    */   {
/* 262:335 */     return this.registerBankAccount;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void setRegisterBankAccount(String registerBankAccount)
/* 266:    */   {
/* 267:338 */     this.registerBankAccount = registerBankAccount;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public String getRegisterBankName()
/* 271:    */   {
/* 272:342 */     return this.registerBankName;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public void setRegisterBankName(String registerBankName)
/* 276:    */   {
/* 277:345 */     this.registerBankName = registerBankName;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public String getRegisterName()
/* 281:    */   {
/* 282:349 */     return this.registerName;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void setRegisterName(String registerName)
/* 286:    */   {
/* 287:352 */     this.registerName = registerName;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public String getRegisterNo()
/* 291:    */   {
/* 292:356 */     return this.registerNo;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public void setRegisterNo(String registerNo)
/* 296:    */   {
/* 297:359 */     this.registerNo = registerNo;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public String getRegisterPhoneNo()
/* 301:    */   {
/* 302:363 */     return this.registerPhoneNo;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void setRegisterPhoneNo(String registerPhoneNo)
/* 306:    */   {
/* 307:366 */     this.registerPhoneNo = registerPhoneNo;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public String getSumAmount()
/* 311:    */   {
/* 312:370 */     return this.sumAmount;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void setSumAmount(String sumAmount)
/* 316:    */   {
/* 317:373 */     this.sumAmount = sumAmount;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public String getTaxAmount()
/* 321:    */   {
/* 322:377 */     return this.taxAmount;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public void setTaxAmount(String taxAmount)
/* 326:    */   {
/* 327:380 */     this.taxAmount = taxAmount;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public String getTaxType()
/* 331:    */   {
/* 332:384 */     return this.taxType;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public void setTaxType(String taxType)
/* 336:    */   {
/* 337:387 */     this.taxType = taxType;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public String getUserId()
/* 341:    */   {
/* 342:391 */     return this.userId;
/* 343:    */   }
/* 344:    */   
/* 345:    */   public void setUserId(String userId)
/* 346:    */   {
/* 347:394 */     this.userId = userId;
/* 348:    */   }
/* 349:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InvoiceModelContent
 * JD-Core Version:    0.7.0.1
 */