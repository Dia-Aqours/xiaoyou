/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityRiskDetectResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8256965276634851927L;
/* 10:   */   @ApiField("risk_code")
/* 11:   */   private String riskCode;
/* 12:   */   @ApiField("risk_level")
/* 13:   */   private Long riskLevel;
/* 14:   */   
/* 15:   */   public void setRiskCode(String riskCode)
/* 16:   */   {
/* 17:30 */     this.riskCode = riskCode;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getRiskCode()
/* 21:   */   {
/* 22:33 */     return this.riskCode;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setRiskLevel(Long riskLevel)
/* 26:   */   {
/* 27:37 */     this.riskLevel = riskLevel;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getRiskLevel()
/* 31:   */   {
/* 32:40 */     return this.riskLevel;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipaySecurityRiskDetectResponse
 * JD-Core Version:    0.7.0.1
 */