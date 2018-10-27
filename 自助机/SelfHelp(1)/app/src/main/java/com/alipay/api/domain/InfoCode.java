/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InfoCode
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6262448951859533613L;
/* 10:   */   @ApiField("risk_description")
/* 11:   */   private String riskDescription;
/* 12:   */   @ApiField("risk_factor_code")
/* 13:   */   private String riskFactorCode;
/* 14:   */   @ApiField("risk_factor_name")
/* 15:   */   private String riskFactorName;
/* 16:   */   @ApiField("risk_magnitude")
/* 17:   */   private String riskMagnitude;
/* 18:   */   
/* 19:   */   public String getRiskDescription()
/* 20:   */   {
/* 21:41 */     return this.riskDescription;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setRiskDescription(String riskDescription)
/* 25:   */   {
/* 26:44 */     this.riskDescription = riskDescription;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getRiskFactorCode()
/* 30:   */   {
/* 31:48 */     return this.riskFactorCode;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setRiskFactorCode(String riskFactorCode)
/* 35:   */   {
/* 36:51 */     this.riskFactorCode = riskFactorCode;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getRiskFactorName()
/* 40:   */   {
/* 41:55 */     return this.riskFactorName;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setRiskFactorName(String riskFactorName)
/* 45:   */   {
/* 46:58 */     this.riskFactorName = riskFactorName;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getRiskMagnitude()
/* 50:   */   {
/* 51:62 */     return this.riskMagnitude;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setRiskMagnitude(String riskMagnitude)
/* 55:   */   {
/* 56:65 */     this.riskMagnitude = riskMagnitude;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.InfoCode
 * JD-Core Version:    0.7.0.1
 */