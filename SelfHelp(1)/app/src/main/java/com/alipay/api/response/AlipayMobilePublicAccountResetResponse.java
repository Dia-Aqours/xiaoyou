/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobilePublicAccountResetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4444378977535434297L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("code")
/* 13:   */   private String code;
/* 14:   */   @ApiField("msg")
/* 15:   */   private String msg;
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
/* 27:   */   public void setCode(String code)
/* 28:   */   {
/* 29:43 */     this.code = code;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getCode()
/* 33:   */   {
/* 34:46 */     return this.code;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setMsg(String msg)
/* 38:   */   {
/* 39:50 */     this.msg = msg;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getMsg()
/* 43:   */   {
/* 44:53 */     return this.msg;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicAccountResetResponse
 * JD-Core Version:    0.7.0.1
 */