/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataSmartactivityForecastModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6188649665341986598L;
/* 10:   */   @ApiField("config_code")
/* 11:   */   private String configCode;
/* 12:   */   @ApiField("diagnose_code")
/* 13:   */   private String diagnoseCode;
/* 14:   */   @ApiField("ext_info")
/* 15:   */   private String extInfo;
/* 16:   */   
/* 17:   */   public String getConfigCode()
/* 18:   */   {
/* 19:43 */     return this.configCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setConfigCode(String configCode)
/* 23:   */   {
/* 24:46 */     this.configCode = configCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getDiagnoseCode()
/* 28:   */   {
/* 29:50 */     return this.diagnoseCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setDiagnoseCode(String diagnoseCode)
/* 33:   */   {
/* 34:53 */     this.diagnoseCode = diagnoseCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getExtInfo()
/* 38:   */   {
/* 39:57 */     return this.extInfo;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setExtInfo(String extInfo)
/* 43:   */   {
/* 44:60 */     this.extInfo = extInfo;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataSmartactivityForecastModel
 * JD-Core Version:    0.7.0.1
 */