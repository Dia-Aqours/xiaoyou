/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppPdeductSignCancelResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6698298249285912549L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("agreement_status")
/* 13:   */   private String agreementStatus;
/* 14:   */   @ApiField("out_agreement_id")
/* 15:   */   private String outAgreementId;
/* 16:   */   
/* 17:   */   public void setAgreementId(String agreementId)
/* 18:   */   {
/* 19:36 */     this.agreementId = agreementId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getAgreementId()
/* 23:   */   {
/* 24:39 */     return this.agreementId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setAgreementStatus(String agreementStatus)
/* 28:   */   {
/* 29:43 */     this.agreementStatus = agreementStatus;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getAgreementStatus()
/* 33:   */   {
/* 34:46 */     return this.agreementStatus;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setOutAgreementId(String outAgreementId)
/* 38:   */   {
/* 39:50 */     this.outAgreementId = outAgreementId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getOutAgreementId()
/* 43:   */   {
/* 44:53 */     return this.outAgreementId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayEbppPdeductSignCancelResponse
 * JD-Core Version:    0.7.0.1
 */