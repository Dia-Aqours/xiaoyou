/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class LoanChargeInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6531669633135676258L;
/* 10:   */   @ApiField("charge_code")
/* 11:   */   private String chargeCode;
/* 12:   */   @ApiField("charge_name")
/* 13:   */   private String chargeName;
/* 14:   */   @ApiField("instal_chrg_rate")
/* 15:   */   private InstallmentValue instalChrgRate;
/* 16:   */   
/* 17:   */   public String getChargeCode()
/* 18:   */   {
/* 19:35 */     return this.chargeCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setChargeCode(String chargeCode)
/* 23:   */   {
/* 24:38 */     this.chargeCode = chargeCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getChargeName()
/* 28:   */   {
/* 29:42 */     return this.chargeName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setChargeName(String chargeName)
/* 33:   */   {
/* 34:45 */     this.chargeName = chargeName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public InstallmentValue getInstalChrgRate()
/* 38:   */   {
/* 39:49 */     return this.instalChrgRate;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setInstalChrgRate(InstallmentValue instalChrgRate)
/* 43:   */   {
/* 44:52 */     this.instalChrgRate = instalChrgRate;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.LoanChargeInfo
 * JD-Core Version:    0.7.0.1
 */