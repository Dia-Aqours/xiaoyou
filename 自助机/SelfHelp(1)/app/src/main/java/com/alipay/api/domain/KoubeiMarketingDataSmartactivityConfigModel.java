/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class KoubeiMarketingDataSmartactivityConfigModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4213516216749258854L;
/* 10:   */   @ApiField("diagnose_code")
/* 11:   */   private String diagnoseCode;
/* 12:   */   
/* 13:   */   public String getDiagnoseCode()
/* 14:   */   {
/* 15:26 */     return this.diagnoseCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setDiagnoseCode(String diagnoseCode)
/* 19:   */   {
/* 20:29 */     this.diagnoseCode = diagnoseCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.KoubeiMarketingDataSmartactivityConfigModel
 * JD-Core Version:    0.7.0.1
 */